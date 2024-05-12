package X;

/* renamed from: X.ZpV, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public /* synthetic */ class C91121ZpV {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC91305ZsT.values().length];
        try {
            iArr[EnumC91305ZsT.LOAD_STATE_PLAYABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC91305ZsT.LOAD_STATE_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC91305ZsT.LOAD_STATE_STALLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
