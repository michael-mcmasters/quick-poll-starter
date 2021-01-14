package com.codedifferently.quickpoll.repository;

import com.codedifferently.quickpoll.domain.Vote;
import org.springframework.data.repository.CrudRepository;

public interface VoteRepository extends CrudRepository<Vote, Long> {
}
