package X;

/* renamed from: X.POa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C64368POa {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[POZ.values().length];
        try {
            iArr[POZ.ORIGIN_LOG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[POZ.APPLOG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[POZ.SLARDAR_API_LOG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[POZ.SLARDAR_EVENT_LOG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
