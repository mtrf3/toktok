package X;

/* renamed from: X.4f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C114884f6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC114894f7.values().length];
        try {
            iArr[EnumC114894f7.SEND_MSG_WHEN_WS_UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC114894f7.SEND_MSG_BY_WS_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC114894f7.TRIGGER_MSG_POLLING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
