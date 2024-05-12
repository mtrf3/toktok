package X;

/* loaded from: classes14.dex */
public /* synthetic */ class UO8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[UO7.values().length];
        try {
            iArr[UO7.DISCARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UO7.NOT_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UO7.UNDER_WAY_ARRIVE_LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UO7.UNDER_WAY_OTHER_RUNNING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[UO7.OVERDUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[UO7.DELAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
