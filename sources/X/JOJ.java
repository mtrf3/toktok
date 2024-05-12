package X;

/* loaded from: classes9.dex */
public /* synthetic */ class JOJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[JOK.values().length];
        try {
            iArr[JOK.PLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JOK.PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JOK.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
