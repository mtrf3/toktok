package X;

/* loaded from: classes11.dex */
public /* synthetic */ class N4X {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[N4Z.values().length];
        try {
            iArr[N4Z.PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[N4Z.PLAYING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[N4Z.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
