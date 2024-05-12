package X;

/* renamed from: X.INe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC46510INe {
    UNDEFINED(0),
    NORMAL_ADD_SUCCESS(1),
    NORMAL_ADD_FAIL(2),
    BUNDLE_ADD_SUCCESS(3),
    BUNDLE_ADD_FAIL(4);

    public final int LJLIL;

    public static EnumC46510INe valueOf(String str) {
        return (EnumC46510INe) V0N.LJJJ(EnumC46510INe.class, str);
    }

    public final int getValue() {
        return this.LJLIL;
    }

    EnumC46510INe(int i) {
        this.LJLIL = i;
    }
}
