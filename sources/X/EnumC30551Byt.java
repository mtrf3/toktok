package X;

/* renamed from: X.Byt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30551Byt {
    Room("ttlive_room"),
    Gift("ttlive_gift"),
    PushStream("ttlive_pushstream"),
    PullStream("ttlive_pullstream"),
    Net("ttlive_net"),
    Click("ttlive_click"),
    Feed("ttlive_feed"),
    Msg("ttlive_msg"),
    Exception("ttlive_exception"),
    Page("ttlive_page"),
    Recharge("ttlive_recharge"),
    Pk("ttlive_pk"),
    Screen_Shot("ttlive_screenshot");

    public String info;

    public static EnumC30551Byt valueOf(String str) {
        return (EnumC30551Byt) V0N.LJJJ(EnumC30551Byt.class, str);
    }

    EnumC30551Byt(String str) {
        this.info = str;
    }
}
