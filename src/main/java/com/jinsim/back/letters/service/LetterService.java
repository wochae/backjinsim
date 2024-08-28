package com.jinsim.back.letters.service;

import com.jinsim.back.letters.LetterRepository;
import com.jinsim.back.letters.entity.Letter;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LetterService {
    private final LetterRepository letterRepository;

    public List<Letter> getReceivedLetters(Long userId) {
        return letterRepository.findByRecipientId(userId);
    }

    public List<Letter> getAuthoredLetters(Long userId) {
        return letterRepository.findByAuthorId(userId);
    }

    public Optional<Letter> getLetter(Long letterId) {
        return letterRepository.findById(letterId);
    }

    public Letter saveLetter(Letter letter) {
        return letterRepository.save(letter);
    }

    public void deleteLetter(Long letterId) {
        letterRepository.deleteById(letterId);
    }
}
