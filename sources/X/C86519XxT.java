package X;

/* renamed from: X.XxT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C86519XxT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC86518XxS.values().length];
        try {
            iArr[EnumC86518XxS.COLD_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC86518XxS.WARM_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC86518XxS.HOT_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC86518XxS.ACCOUNT_LOGIN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
