package X;

/* renamed from: X.Xb0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C85126Xb0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC85151XbP.values().length];
        try {
            iArr[EnumC85151XbP.PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC85151XbP.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC85151XbP.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC85151XbP.TOTP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
