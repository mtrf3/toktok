package X;

/* renamed from: X.Xa1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C85065Xa1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC85066Xa2.values().length];
        try {
            iArr[EnumC85066Xa2.LOAD_STATE_PLAYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC85066Xa2.LOAD_STATE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC85066Xa2.LOAD_STATE_STALLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
