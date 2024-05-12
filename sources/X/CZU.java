package X;

/* loaded from: classes6.dex */
public /* synthetic */ class CZU {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[CZV.values().length];
        try {
            iArr[CZV.DISPLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CZV.SELF_WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CZV.BLANK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CZV.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[CZW.values().length];
        try {
            iArr2[CZW.MANAGE_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[CZW.SELF_WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[CZW.DELETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
