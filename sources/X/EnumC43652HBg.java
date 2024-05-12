package X;

/* renamed from: X.HBg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC43652HBg implements InterfaceC43658HBm {
    ORIGIN_SOUND("origin_sound"),
    END_WATERMARK_WORKSPACE("end_watermark_workspace"),
    SHARE("share"),
    EXTRACT_FRAMES("extract_frames"),
    EDIT_CAP_CUT("edit_cap_cut"),
    TT_CAP_CUT("tt_cap_cut"),
    NOW_SHARE_CACHE("now_share_cache");

    public final String LJLIL;

    public static EnumC43652HBg valueOf(String str) {
        return (EnumC43652HBg) V0N.LJJJ(EnumC43652HBg.class, str);
    }

    @Override // X.InterfaceC43658HBm
    public String getNameSpace() {
        return this.LJLIL;
    }

    EnumC43652HBg(String str) {
        this.LJLIL = str;
    }
}
