package X;

/* renamed from: X.a55, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public enum EnumC92087a55 {
    Close("close"),
    Expired("expired"),
    Init("init"),
    Success("success"),
    Failed("failed"),
    Pending("pending");

    public final String LJLIL;

    public static EnumC92087a55 valueOf(String str) {
        return (EnumC92087a55) V0N.LJJJ(EnumC92087a55.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC92087a55(String str) {
        this.LJLIL = str;
    }
}
