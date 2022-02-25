public enum Wood{
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY;

    @Override
    public String toString() {
        switch (this){
            case MAHOGANY: return "Mahogany";
            case INDIAN_ROSEWOOD: return "INDIAN_ROSEWOOD";
            case BRAZILIAN_ROSEWOOD: return "BRAZILIAN_ROSEWOOD";
        }
        return "";
    }
}