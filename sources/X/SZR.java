package X;

/* loaded from: classes13.dex */
public /* synthetic */ class SZR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[SZY.values().length];
        try {
            iArr[SZY.Loading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SZY.Loaded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SZY.End.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SZY.Error.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
