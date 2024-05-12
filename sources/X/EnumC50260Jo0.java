package X;

/* renamed from: X.Jo0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC50260Jo0 {
    NEED_LOGIN(1),
    LIMIT(2),
    EMPTY(3),
    SENSITIVE(4),
    HIT_CORE_TABLE(5);

    public final int LJLIL;

    public static EnumC50260Jo0 valueOf(String str) {
        return (EnumC50260Jo0) V0N.LJJJ(EnumC50260Jo0.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC50260Jo0(int i) {
        this.LJLIL = i;
    }
}
