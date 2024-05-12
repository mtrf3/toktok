package X;

/* renamed from: X.9SB, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9SB {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C9SN.values().length];
        try {
            iArr[C9SN.PAUSE_NOT_WIFI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9SN.PAUSE_NO_NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9SN.PAUSE_STORAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[C9Q1.values().length];
        try {
            iArr2[C9Q1.OFFLINE_MODE_SETTING_PANEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[C9Q1.OFFLINE_MODE_PANEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        LIZIZ = iArr2;
    }
}
