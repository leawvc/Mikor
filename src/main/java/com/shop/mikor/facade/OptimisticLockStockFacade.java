package com.shop.mikor.facade;

import com.shop.mikor.service.stock.OptimisticLockStockService;
import org.springframework.stereotype.Component;

@Component
public class OptimisticLockStockFacade  {

    private final OptimisticLockStockService optimisticLockStockService;

    public OptimisticLockStockFacade(OptimisticLockStockService optimisticLockStockService) {
        this.optimisticLockStockService = optimisticLockStockService;
    }
    public void decrease(Long id, Long quantity) throws InterruptedException {
        while (true){
            try {
                optimisticLockStockService.decrease(id, quantity);

                break;
            }catch (Exception e){
                Thread.sleep(50);
            }
        }
    }
}
