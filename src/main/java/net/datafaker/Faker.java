package net.datafaker;

import net.datafaker.providers.food.FoodProviders;
import net.datafaker.providers.movie.MovieProviders;
import net.datafaker.service.FakeValuesService;
import net.datafaker.service.FakerContext;
import net.datafaker.service.RandomService;
import net.datafaker.providers.base.BaseFaker;
import net.datafaker.providers.base.BaseProviders;
import net.datafaker.providers.sport.SportProviders;
import net.datafaker.providers.videogame.VideoGameProviders;

import java.util.Locale;
import java.util.Random;

public class Faker extends BaseFaker implements BaseProviders, SportProviders, FoodProviders, MovieProviders, VideoGameProviders {
    public Faker() {
    }

    public Faker(Locale locale) {
        super(locale);
    }

    public Faker(Random random) {
        super(random);
    }

    public Faker(Locale locale, Random random) {
        super(locale, random);
    }

    public Faker(Locale locale, RandomService randomService) {
        super(locale, randomService);
    }

    public Faker(FakeValuesService fakeValuesService, FakerContext context) {
        super(fakeValuesService, context);
    }
}
