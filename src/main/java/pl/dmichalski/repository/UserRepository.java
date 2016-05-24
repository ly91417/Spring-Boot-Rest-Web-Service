package pl.dmichalski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dmichalski.entity.User;

/**
 * Created by Ying on 5/23/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
