package X;

/* loaded from: classes13.dex */
public /* synthetic */ class SSQ {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[SSR.values().length];
        try {
            iArr[SSR.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SSR.MULTIPLE_HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SSR.MULTIPLE_VERTICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[SSU.values().length];
        try {
            iArr2[SSU.DOWNLOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SSU.IDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        LIZIZ = iArr2;
    }
}
