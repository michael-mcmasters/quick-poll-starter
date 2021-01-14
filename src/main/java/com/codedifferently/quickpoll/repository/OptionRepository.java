package com.codedifferently.quickpoll.repository;

import com.codedifferently.quickpoll.domain.Option;
import org.springframework.data.repository.CrudRepository;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
