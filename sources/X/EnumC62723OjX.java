package X;

/* renamed from: X.OjX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public enum EnumC62723OjX {
    SHOW("show"),
    CLICK_SEND("click_send"),
    SEND_FAIL("send_fail"),
    SEND_SUCCESS("send_success");

    public final String LJLIL;

    public static EnumC62723OjX valueOf(String str) {
        return (EnumC62723OjX) V0N.LJJJ(EnumC62723OjX.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    EnumC62723OjX(String str) {
        this.LJLIL = str;
    }
}
