package ng.edu.binghamuni.depot.services;

import ng.edu.binghamuni.depot.Domain.Drink;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DrinkService {

    //    interfaces have no body because they are abstracts
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long id);
    List<Drink> getAllDrink();

    Drink updateDrink(Drink drink);

    Drink updateDrinkById(Drink drink);
    void deleteDrinkById(long id);
}
