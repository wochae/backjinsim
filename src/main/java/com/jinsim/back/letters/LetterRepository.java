package com.jinsim.back.letters;

import com.jinsim.back.letters.entity.Letter;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterRepository extends JpaRepository<Letter, Long> {

    List<Letter> findByRecipientId(Long userId);

    List<Letter> findByAuthorId(Long userId);
}
