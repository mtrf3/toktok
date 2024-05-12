package X;

/* renamed from: X.KLe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public enum EnumC51554KLe {
    SLIDE_LEFT_OPEN("slide_left"),
    SLIDE_RIGHT_CLOSE("slide_right"),
    CLICK_RETURN_BUTTON("click_return_button"),
    CLICK_VIDEO("click_video");

    public final String LJLIL;

    public static EnumC51554KLe valueOf(String str) {
        return (EnumC51554KLe) V0N.LJJJ(EnumC51554KLe.class, str);
    }

    public final String getEventValue() {
        return this.LJLIL;
    }

    EnumC51554KLe(String str) {
        this.LJLIL = str;
    }
}
