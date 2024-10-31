package com.bit.muiu.repository;

import com.bit.muiu.entity.CallRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CallRoomRepository extends JpaRepository<CallRoom, Long> {
    Optional<CallRoom> findFirstByStatusOrderByIdAsc(String status);
}
