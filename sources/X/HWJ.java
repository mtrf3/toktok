package X;

/* loaded from: classes8.dex */
public /* synthetic */ class HWJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[HWK.values().length];
        try {
            iArr[HWK.GONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HWK.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HWK.VISIBLE_AFTER_5S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
