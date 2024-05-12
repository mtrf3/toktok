package X;

/* loaded from: classes16.dex */
public /* synthetic */ class XTN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[XTM.values().length];
        try {
            iArr[XTM.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[XTM.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[XTM.VISIBLE_AFTER_5S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
