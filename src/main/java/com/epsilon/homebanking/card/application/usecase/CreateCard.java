package com.epsilon.homebanking.card.application.usecase;

import com.epsilon.homebanking.card.domain.Card;

public interface CreateCard {

    Card create(Card toDomain,Long id);


}
