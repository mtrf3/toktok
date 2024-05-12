package X;

/* renamed from: X.9SD, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9SD {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C9SN.values().length];
        try {
            iArr[C9SN.DOWNLOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9SN.DOWNLOADED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9SN.PAUSE_NOT_WIFI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C9SN.PAUSE_STORAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C9SN.PAUSE_NO_NETWORK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[C9SN.USER_PAUSE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[C9SO.values().length];
        try {
            iArr2[C9SO.STORAGE_NOT_ENOUGH.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[C9SO.NO_NET.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[C9SO.NOT_WIFI.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        LIZIZ = iArr2;
    }
}
