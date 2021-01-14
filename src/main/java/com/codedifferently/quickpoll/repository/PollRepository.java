package com.codedifferently.quickpoll.repository;

import com.codedifferently.quickpoll.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
