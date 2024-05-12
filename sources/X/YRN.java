package X;

/* loaded from: classes16.dex */
public /* synthetic */ class YRN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[YRL.values().length];
        try {
            iArr[YRL.HTTP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YRL.WS_CONNECTING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YRL.WS_CONNECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
