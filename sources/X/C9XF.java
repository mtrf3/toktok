package X;

/* renamed from: X.9XF, reason: invalid class name */
/* loaded from: classes5.dex */
public /* synthetic */ class C9XF {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C9XG.values().length];
        try {
            iArr[C9XG.ORIGINAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C9XG.LOADING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C9XG.TRANSLATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
