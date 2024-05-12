package X;

/* renamed from: X.9SC, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9SC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C9SN.values().length];
        try {
            iArr[C9SN.UNINITIALIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9SN.PAUSE_NOT_WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9SN.PAUSE_NO_NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C9SN.PAUSE_STORAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C9SN.USER_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[C9SN.DOWNLOADING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[C9SN.DOWNLOADED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
