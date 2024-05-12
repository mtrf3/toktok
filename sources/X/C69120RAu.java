package X;

/* renamed from: X.RAu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C69120RAu {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC69113RAn.values().length];
        try {
            iArr[EnumC69113RAn.CHANGE_PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC69113RAn.RESET_PASSWORD_FOR_EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC69113RAn.RESET_PASSWORD_FOR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_PASSWORD_FOR_PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC69113RAn.CREATE_PASSWORD_FOR_EMAIL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
