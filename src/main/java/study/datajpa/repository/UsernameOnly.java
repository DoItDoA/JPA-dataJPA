package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {
//    String getUsername(); // Closed Projections

    @Value("#{target.username + ' ' + target.age + ' ' + target.team.name}")
    String getUsername(); // Open Proejctions
}