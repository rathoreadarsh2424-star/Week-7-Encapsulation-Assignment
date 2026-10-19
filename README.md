# Week 7 — Encapsulation (Category C Assignment)

Solutions for all five problems in `Week7_Encapsulation_Category_C_Assignment.pdf`.

## Programs
1. **The Health Bar** — private health, final maximum health, damage/heal boundary limits, read-only health getter.
2. **The Playlist** — private fixed-size song array, add method, defensive copy from `getSongs()`, read-only count.
3. **The Password Checker** — private final password, strength rating only, no password getter.
4. **The Traffic Light** — private state, fixed ID, red → green → yellow → red cycle using `next()`.
5. **The Shopping Cart** — private prices array, final cart ID, total computed on request, item count, no price-array getter.

## Compile and run
Use Java 8 or later. From the `src` directory, compile and run each program separately:

```bash
javac Problem1HealthBar.java
java Problem1HealthBar
```

Repeat with the other four filenames. Each file has its own `main` method and a nested class containing the solution.
