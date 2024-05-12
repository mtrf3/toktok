package X;

/* loaded from: classes11.dex */
public /* synthetic */ class N4M {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[N4L.values().length];
        try {
            iArr[N4L.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[N4L.PAUSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[N4L.PLAYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
