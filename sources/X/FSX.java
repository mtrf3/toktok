package X;

/* loaded from: classes7.dex */
public /* synthetic */ class FSX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FSY.values().length];
        try {
            iArr[FSY.IO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FSY.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FSY.BACKGROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FSY.SCHEDULED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FSY.SERIAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FSY.FIXED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
    }
}
