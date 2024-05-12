package X;

/* renamed from: X.M8g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public enum EnumC56314M8g {
    POPUP_STATE_ERROR(1001),
    POPUP_DEPENDENCY(1002),
    POPUP_INTERCEPTOR(1003),
    POPUP_ASYNC_EXCEPTION(1004),
    POPUP_SHOW_EXCEPTION(1005);

    public final int LJLIL;

    public static EnumC56314M8g valueOf(String str) {
        return (EnumC56314M8g) V0N.LJJJ(EnumC56314M8g.class, str);
    }

    public final int getFailCode() {
        return this.LJLIL;
    }

    EnumC56314M8g(int i) {
        this.LJLIL = i;
    }
}
