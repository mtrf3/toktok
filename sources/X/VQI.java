package X;

/* loaded from: classes15.dex */
public enum VQI {
    REPEAT,
    NO_REPEAT,
    REPEAT_X,
    REPEAT_Y,
    ROUND,
    SPACE;

    public static VQI valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return REPEAT;
                            }
                            return SPACE;
                        }
                        return ROUND;
                    }
                    return REPEAT_Y;
                }
                return REPEAT_X;
            }
            return NO_REPEAT;
        }
        return REPEAT;
    }

    public static VQI valueOf(String str) {
        return (VQI) V0N.LJJJ(VQI.class, str);
    }
}
