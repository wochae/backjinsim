package com.jinsim.back.letters;

import com.jinsim.back.letters.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterRepository extends JpaRepository<Letter, Long> {

}
