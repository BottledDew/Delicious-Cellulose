package io.github.bottleddew.deliciouscellulose.init.data;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModItemsFoodTemplates {

    public static final FoodComponent MYSTERY_MEAT = buildFoodComponent(2, 0.3f, true, true, true);
    public static final FoodComponent BREAD_SUBSTITUTE = buildFoodComponent(3, 0.5f, true, true, true);
    public static final FoodComponent MYSTERY_MEAT_STEW = buildFoodComponent(6, 0.66f, false, true, false);

    public static FoodComponent buildFoodComponent(int hunger, float saturationModifier) {
        return buildFoodComponent(hunger, saturationModifier);
    }

    public static FoodComponent buildFoodComponent(int hunger, float saturationModifier, boolean isSmallMeal, boolean isAlwaysEdible, boolean isSnack) {
        FoodComponent.Builder buildFood = new FoodComponent.Builder();

        buildFood.hunger(hunger);
        buildFood.saturationModifier(saturationModifier);

        if (isSmallMeal) {
            buildFood.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 5, 255), .33f);
        }

            else {
                buildFood.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,20 * 8, 255), .125f);
                buildFood.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 4), 0.5f);
            }

        if (isAlwaysEdible) {
            buildFood.alwaysEdible();
        }

        if (isSnack) {
            buildFood.snack();
        }
        return buildFood.build();
    }
}