package X;

/* renamed from: X.0Wa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC08760Wa {
    CO_HOST_SAME(2, true),
    VIDEO_INSERT(1, true),
    MULTI_GUEST_INSERT(1, true),
    CO_HOST_INSERT(1, true),
    BGM_GUIDE(3, false);

    public final int LJLIL;
    public final boolean LJLILLLLZI;

    public static EnumC08760Wa valueOf(String str) {
        return (EnumC08760Wa) V0N.LJJJ(EnumC08760Wa.class, str);
    }

    public final int getPriority() {
        return this.LJLIL;
    }

    public final boolean isSticker() {
        return this.LJLILLLLZI;
    }

    EnumC08760Wa(int i, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }
}
