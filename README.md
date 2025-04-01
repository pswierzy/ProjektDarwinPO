# ProjektDarwinPO

Symulacja ewolucyjnego świata zwierząt w środowisku stepów i dżungli. Projekt realizowany w ramach przedmiotu Programowanie Obiektowe.

## 👥 Autorzy

- [Piotr Świerzy](https://github.com/pswierzy)
- [Szymon Tworek](https://github.com/szTworek)

## 📌 O czym jest projekt?

Projekt DarwinPO to interaktywna symulacja, w której obserwujemy ewolucję zwierząt na dynamicznie zmieniającej się mapie. Zwierzęta (roślinożercy) poruszają się, jedzą rośliny, tracą energię i rozmnażają się, a ich zachowanie determinowane jest przez geny. Główne cechy symulacji:

- **Świat podzielony na stepy i dżungle** z różnym tempem wzrostu roślin.
- **Geny sterujące ruchem** – każdy zwierzak ma unikalny genom decydujący o kierunku przemieszczania.
- **Rozmnażanie z mutacjami** – potomkowie dziedziczą geny rodziców z losowymi zmianami.
- **Konfigurowalne parametry** – rozmiar mapy, liczba zwierząt, energia, mutacje itd.
- **Warianty realizowane w projekcie**:
  - _Mapa: Kula ziemska_ (zapętlone krawędzie boczne, bieguny nieprzekraczalne).
  - _Wzrost roślin: Życiodajne truchła_ (rośliny preferują pola wokół martwych zwierząt).
  - _Mutacje: Pełna losowość_.
  - _Zachowanie zwierząt: Nieco szaleństwa_ (80% szans na kolejny gen, 20% na losowy skok).

## 🛠️ Główne funkcje

- **Interfejs graficzny (JavaFX)**:
  - Animacja mapy z wizualizacją zwierząt (kierunek, energia) i roślin.
  - Możliwość uruchomienia wielu symulacji jednocześnie w osobnych oknach.
  - Kontrola czasu symulacji (pauza/wznowienie).
- **Konfiguracja symulacji**:
  - Wybór gotowych presetów lub tworzenie własnych.
  - Zapisywanie i wczytywanie konfiguracji.
- **Statystyki w czasie rzeczywistym**:
  - Liczba zwierząt, roślin, wolnych pól.
  - Średnia energia, długość życia, liczba dzieci.
  - Najpopularniejsze genotypy.
- **Śledzenie wybranych zwierząt**:
  - Pokaz genomu, aktywnego genu, energii, liczby potomków itd.
- **Eksport danych**:
  - Zapis statystyk do pliku CSV.
- **Wyróżnianie elementów**:
  - Pola preferowane przez rośliny.
  - Zwierzęta z dominującymi genotypami.

## 📦 Wymagania techniczne

- Java 17 lub nowsza.
- JavaFX.
- Gradle (do budowania projektu).

## 🚀 Uruchamianie projektu

1. Sklonuj repozytorium:
   ```bash
   git clone https://github.com/pswierzy/ProjektDarwinPO
   ```
2. Wejdź do katalogu projektu:
   ```bash
   cd ProjektDarwinPO/Projekt
   ```
3. Zbuduj i uruchom za pomocą Gradle:

   ```bash
   ./gradlew run
   ```

   (na Windowsie użyj `gradlew.bat`).
