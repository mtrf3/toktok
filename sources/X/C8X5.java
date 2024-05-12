package X;

/* renamed from: X.8X5, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C8X5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C8X3.values().length];
        try {
            iArr[C8X3.HOSTATTACH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C8X3.HOSTDETACH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C8X3.HOSTSTOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C8X3.HOSTRESUME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
