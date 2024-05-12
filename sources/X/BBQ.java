package X;

/* loaded from: classes6.dex */
public /* synthetic */ class BBQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[BBP.values().length];
        try {
            iArr[BBP.FILTER_SETTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BBP.FILTER_APPROVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BBP.DISMISS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
