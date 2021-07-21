package one.digitalinnovation.santander.yasp.common.entity;

import lombok.Builder;

public class MealCard extends BankCard {

    @Builder(setterPrefix = "with")
    public MealCard(Long id, double monthlyTax, boolean taxFreeForRelationShip) {
        super(id, BankCardTypeEnum.MEAL, monthlyTax, taxFreeForRelationShip);
    }

    @Override
    public Double getCalculatedTax() {
        throw new IllegalStateException("Credit card does not apply taxes");
    }
}
