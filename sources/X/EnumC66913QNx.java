package X;

/* renamed from: X.QNx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum EnumC66913QNx {
    CLOSE_REASON_MASK("mask_click_close"),
    CLOSE_REASON_BACK("back_close"),
    CLOSE_REASON_APP("app_close"),
    CLOSE_FB_MASK("close_fb_mask"),
    CLOSE_FB_CLOSE("close_fb_close"),
    CLOSE_FB_FEEDBACK("close_fb_feedback"),
    CLOSE_FB_SYSTEM("close_fb_system");

    public final String LJLIL;

    public String getName() {
        return this.LJLIL;
    }

    public static EnumC66913QNx valueOf(String str) {
        return (EnumC66913QNx) V0N.LJJJ(EnumC66913QNx.class, str);
    }

    EnumC66913QNx(String str) {
        this.LJLIL = str;
    }
}
