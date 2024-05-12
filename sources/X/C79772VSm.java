package X;

/* renamed from: X.VSm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C79772VSm {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC79773VSn.values().length];
        try {
            iArr[EnumC79773VSn.SHOW_TOAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC79773VSn.SHOW_BAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC79773VSn.SHOW_NO_NET_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC79770VSk.values().length];
        try {
            iArr2[EnumC79770VSk.NETWORK_GOOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC79770VSk.NO_NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC79770VSk.UNKNOWN_STATUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
