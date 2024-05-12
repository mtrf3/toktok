package X;

/* loaded from: classes16.dex */
public final /* synthetic */ class YPS {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[YPO.values().length];
        LIZIZ = iArr;
        try {
            iArr[YPO.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[YPO.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[YPO.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[YPT.values().length];
        LIZ = iArr2;
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[1] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[0] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
