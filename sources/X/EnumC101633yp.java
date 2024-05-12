package X;

/* renamed from: X.3yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC101633yp {
    CLICK_BACKGROUND(0),
    CLICK_CLOSE_BUTTON(1),
    CLICK_RED_BUTTON(2),
    CLICK_LEARN_MORE(4);

    public final int LJLIL;

    public static EnumC101633yp valueOf(String str) {
        return (EnumC101633yp) V0N.LJJJ(EnumC101633yp.class, str);
    }

    public final int getActionType() {
        return this.LJLIL;
    }

    EnumC101633yp(int i) {
        this.LJLIL = i;
    }
}
