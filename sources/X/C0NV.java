package X;

/* renamed from: X.0NV, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0NV {
    LEVEL_0,
    LEVEL_1,
    LEVEL_2,
    LEVEL_3,
    LEVEL_4,
    LEVEL_5,
    LEVEL_6,
    LEVEL_7,
    LEVEL_8,
    LEVEL_9;

    C0NV() {
    }

    public static C0NV valueOf(int i) {
        switch (i) {
            case 0:
                return LEVEL_0;
            case 1:
                return LEVEL_1;
            case 2:
                return LEVEL_2;
            case 3:
                return LEVEL_3;
            case 4:
                return LEVEL_4;
            case 5:
                return LEVEL_5;
            case 6:
                return LEVEL_6;
            case 7:
                return LEVEL_7;
            case 8:
                return LEVEL_8;
            case 9:
                return LEVEL_9;
            default:
                return null;
        }
    }

    public static C0NV valueOf(String str) {
        return (C0NV) V0N.LJJJ(C0NV.class, str);
    }
}
