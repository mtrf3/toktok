package X;

/* renamed from: X.EIw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC36206EIw {
    UNKNOWN(0),
    COLD_START(1),
    HOT_START(2),
    POOLING(3),
    LOGIN_SUCCESS(4),
    SWITCH_ACCOUNT(5),
    WEB_SOCKET(6);

    public final int LJLIL;

    public static EnumC36206EIw valueOf(String str) {
        return (EnumC36206EIw) V0N.LJJJ(EnumC36206EIw.class, str);
    }

    public final int getType() {
        return this.LJLIL;
    }

    EnumC36206EIw(int i) {
        this.LJLIL = i;
    }
}
