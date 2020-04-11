
class SortRute extends Rute {

    public SortRute(int rad, int kolonne) {
        super(rad, kolonne);
    }

    // returner tegnet for "sort" rute
    public char tilTegn() {
        return '#';
    }

    // returner false - fordi svart ikke er aapning
    public boolean erAapning() {
        return false;
    }
}
