package X;

/* renamed from: X.CJi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31122CJi {
    NORMAL_VIDEO("normal_video_live"),
    LINE_UP("video_anchor_order"),
    LINK_MIC_ANCHOR("video_anchor_connect"),
    LINK_MIC_PK("video_anchor_pk"),
    LINK_MIC_GUEST("video_anchor_guest_connect");

    public final String LJLIL;

    public static EnumC31122CJi valueOf(String str) {
        return (EnumC31122CJi) V0N.LJJJ(EnumC31122CJi.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC31122CJi(String str) {
        this.LJLIL = str;
    }
}
