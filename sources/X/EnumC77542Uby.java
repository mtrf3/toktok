package X;

/* renamed from: X.Uby, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC77542Uby {
    RECHARGE_LIVE_ROOM("room"),
    RECHARGE_SHOUTOUT("shoutout"),
    RECHARGE_PROMOTE("promote"),
    RECHARGE_VIDEO_GIFTING("video_gifting"),
    RECHARGE_EVENT_TICKET("event_ticket");

    public final String LJLIL;

    public String getScene() {
        return this.LJLIL;
    }

    public static EnumC77542Uby valueOf(String str) {
        return (EnumC77542Uby) V0N.LJJJ(EnumC77542Uby.class, str);
    }

    EnumC77542Uby(String str) {
        this.LJLIL = str;
    }
}
