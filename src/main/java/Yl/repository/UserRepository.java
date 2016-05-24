package Yl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Yl.entity.Messages;

/**
 * Created by Ying on 5/23/16.
 */
@Repository
public interface UserRepository extends JpaRepository<Messages,Long> {

}
