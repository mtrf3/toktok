package X;

/* renamed from: X.J7k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC48648J7k {
    NETWORK_ERROR(0, "NETWORK_ERROR"),
    INVALIDATE_PLAYER_MODEL(1, "INVALIDATE_DATA_SOURCE"),
    UNKNOWN(-1, "UNKNOWN");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC48648J7k valueOf(String str) {
        return (EnumC48648J7k) V0N.LJJJ(EnumC48648J7k.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMsg() {
        return this.LJLILLLLZI;
    }

    EnumC48648J7k(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
