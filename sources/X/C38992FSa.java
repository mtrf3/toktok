package X;

/* renamed from: X.FSa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C38992FSa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[FSY.values().length];
        LIZ = iArr;
        try {
            iArr[FSY.SERIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[FSY.IO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[FSY.DEFAULT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[FSY.BACKGROUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[FSY.SCHEDULED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
