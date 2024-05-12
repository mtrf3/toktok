package X;

/* renamed from: X.a13, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC91837a13 {
    Prepaid("Prepaid"),
    NonPrepaid("Non-Prepaid"),
    ALL("ALL"),
    UNKNOWN("UNKNOWN");

    public final String LJLIL;

    public static EnumC91837a13 valueOf(String str) {
        return (EnumC91837a13) V0N.LJJJ(EnumC91837a13.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC91837a13(String str) {
        this.LJLIL = str;
    }
}
