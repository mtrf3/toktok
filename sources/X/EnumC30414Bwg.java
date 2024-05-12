package X;

/* renamed from: X.Bwg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC30414Bwg {
    EVENT_PAGE_WATCH_LIVE("", false),
    EVENT_PAGE_BROADCAST("live_take_detail", true),
    EVENT_PAGE_BROADCAST_PREVIEW("live_take_page", true),
    EVENT_PAGE_CLOSE_BROADCAST("close_broadcast_page", true),
    EVENT_PAGE_MULTI_GUEST("multi_guest", false);

    public boolean isAnchor;
    public String page;

    public static EnumC30414Bwg valueOf(String str) {
        return (EnumC30414Bwg) V0N.LJJJ(EnumC30414Bwg.class, str);
    }

    EnumC30414Bwg(String str, boolean z) {
        this.page = str;
        this.isAnchor = z;
    }
}
