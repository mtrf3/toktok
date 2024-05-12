package X;

/* renamed from: X.8W4, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C8W4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C8W2.values().length];
        try {
            iArr[C8W2.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C8W2.ON_DESTROY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C8W2.ON_RESET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
