package X;

/* renamed from: X.N4f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public /* synthetic */ class C58757N4f {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[N4Z.values().length];
        try {
            iArr[N4Z.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[N4Z.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[N4Z.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
