package com.epsilon.homebanking.card.domain.repository;

import com.epsilon.homebanking.card.domain.Card;

public interface CardRepository {

    Card create(Card card,Long id);

}
