package X;

/* renamed from: X.3yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101583yk {
    SEND_MESSAGE_NO_ONE_PERMISSION(1),
    DM_SETTINGS_BOTTOM_SHEET(1),
    DM_SETTINGS_POPUP(2),
    DM_CHAT_REQUEST_PAGE(3);

    public final int LJLIL;

    public static EnumC101583yk valueOf(String str) {
        return (EnumC101583yk) V0N.LJJJ(EnumC101583yk.class, str);
    }

    public final int getEventTrackingConstant() {
        return this.LJLIL;
    }

    EnumC101583yk(int i) {
        this.LJLIL = i;
    }
}
