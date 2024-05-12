package X;

/* loaded from: classes16.dex */
public /* synthetic */ class YRO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[YRM.values().length];
        try {
            iArr[YRM.HTTP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YRM.WS_CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YRM.WS_CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
