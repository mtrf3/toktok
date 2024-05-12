package X;

/* renamed from: X.ExG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C38094ExG {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC38093ExF.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC38093ExF.ENCRYPT_BOTH_QUERY_AND_BODY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[EnumC38093ExF.ENCRYPT_BODY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[EnumC38093ExF.ENCRYPT_QUERY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
