package X;

/* loaded from: classes8.dex */
public /* synthetic */ class GSM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[GSN.values().length];
        try {
            iArr[GSN.NO_PUBLISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GSN.NORMAL_PUBLISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GSN.PRE_SYNTHETIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GSN.PRE_PUBLISH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
