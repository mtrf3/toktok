package X;

/* renamed from: X.9SR, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9SR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C9SN.values().length];
        try {
            iArr[C9SN.PAUSE_STORAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9SN.PAUSE_NO_NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9SN.PAUSE_NOT_WIFI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
