public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this){
            case FENDER: return "Fender";
            case MARTIN: return "MARTIN";
            case GIBSON: return "GIBSON";
            case COLLINGS: return "Collings";
            case OLSON: return "OLSON";
            case RYAN: return "RYAN";
            case PRS: return "PRS";
            case ANY: return "Any";
        }
        return "";
    }
}
