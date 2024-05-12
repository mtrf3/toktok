package X;

/* renamed from: X.CJh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC31121CJh {
    NORMAL_VIDEO("normal_video_live"),
    LINE_UP("video_anchor_order"),
    LINK_MIC_ANCHOR("video_anchor_connect"),
    LINK_MIC_PK("video_anchor_pk"),
    LINK_MIC_GUEST("video_anchor_guest_connect");

    public final String LJLIL;

    public static EnumC31121CJh valueOf(String str) {
        return (EnumC31121CJh) V0N.LJJJ(EnumC31121CJh.class, str);
    }

    public final String getDesc() {
        return this.LJLIL;
    }

    EnumC31121CJh(String str) {
        this.LJLIL = str;
    }
}
