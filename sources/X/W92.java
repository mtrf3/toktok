package X;

/* loaded from: classes15.dex */
public enum W92 {
    LOW,
    MEDIUM,
    HIGH,
    IMMEDIATE;

    public static int getIntPriorityValue(W92 w92) {
        int i = W97.LIZ[w92.ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return 1;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    public static W92 getHigherPriority(W92 w92, W92 w922) {
        if (w92 == null) {
            return w922;
        }
        if (w922 == null) {
            return w92;
        }
        if (w92.ordinal() > w922.ordinal()) {
            return w92;
        }
        return w922;
    }

    public static W92 getLowerPriority(W92 w92, W92 w922) {
        if (w92 == null) {
            return w922;
        }
        if (w922 == null) {
            return w92;
        }
        if (w92.ordinal() < w922.ordinal()) {
            return w92;
        }
        return w922;
    }
}
