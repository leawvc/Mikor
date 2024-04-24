package com.shop.mikor.repository.stock;

import com.shop.mikor.domain.stock.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// 실무에서는 같은 데이터 소스를 사용시에 커넥션 풀이 부족할 수 있다. 그렇기에 Stock같은 Entity를 공유해서는 안된다.
public interface LockRepository extends JpaRepository<Stock, Long> {

    @Query(value = "select get_lock(?1, 3000)", nativeQuery = true)
    void getLock(String key);

    @Query(value = "select release_lock(?1)", nativeQuery = true)
    void releaseLock(String key);

}
