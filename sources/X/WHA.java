package X;

/* loaded from: classes15.dex */
public /* synthetic */ class WHA {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[WH9.values().length];
        try {
            iArr[WH9.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WH9.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[WHB.values().length];
        try {
            iArr2[WHB.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[WHB.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[WHC.values().length];
        try {
            iArr3[WHC.DIMENSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        LIZJ = iArr3;
    }
}
