package X;

/* loaded from: classes11.dex */
public final class NIL {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    public static void LIZIZ(String str, String str2, String str3, String str4) {
        switch (str3.hashCode()) {
            case -1884023019:
                if (!str3.equals("during_live_dialog_item")) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("room_id", str);
                c188727au.LJIIIZ("streamer_id", str2);
                c188727au.LJIIIZ("type", "subpage");
                c188727au.LJIIIZ("live_status", str4);
                FMX.LJIIL("ttelite_ba_lead_ba_show_icon", c188727au.LIZ);
                return;
            case -1095106132:
                if (!str3.equals("before_live")) {
                    return;
                }
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("room_id", str);
                c188727au2.LJIIIZ("streamer_id", str2);
                c188727au2.LJIIIZ("type", "toolbar");
                c188727au2.LJIIIZ("live_status", str4);
                FMX.LJIIL("ttelite_ba_lead_ba_show_icon", c188727au2.LIZ);
                return;
            case -522623958:
                if (!str3.equals("during_live")) {
                    return;
                }
                C188727au c188727au22 = new C188727au();
                c188727au22.LJIIIZ("room_id", str);
                c188727au22.LJIIIZ("streamer_id", str2);
                c188727au22.LJIIIZ("type", "toolbar");
                c188727au22.LJIIIZ("live_status", str4);
                FMX.LJIIL("ttelite_ba_lead_ba_show_icon", c188727au22.LIZ);
                return;
            case 387613079:
                if (!str3.equals("before_live_dialog_item")) {
                    return;
                }
                C188727au c188727au3 = new C188727au();
                c188727au3.LJIIIZ("room_id", str);
                c188727au3.LJIIIZ("streamer_id", str2);
                c188727au3.LJIIIZ("type", "subpage");
                c188727au3.LJIIIZ("live_status", str4);
                FMX.LJIIL("ttelite_ba_lead_ba_show_icon", c188727au3.LIZ);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    public static void LIZ(int i, String str, String str2, String str3, String str4) {
        switch (str3.hashCode()) {
            case -1884023019:
                if (!str3.equals("during_live_dialog_item")) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("room_id", str);
                c188727au.LJIIIZ("streamer_id", str2);
                c188727au.LJIIIZ("type", "subpage");
                c188727au.LJIIIZ("live_status", str4);
                c188727au.LIZLLL(i, "add_status");
                FMX.LJIIL("ttelite_ba_lead_ba_click_icon", c188727au.LIZ);
                return;
            case -1095106132:
                if (!str3.equals("before_live")) {
                    return;
                }
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("room_id", str);
                c188727au2.LJIIIZ("streamer_id", str2);
                c188727au2.LJIIIZ("type", "toolbar");
                c188727au2.LJIIIZ("live_status", str4);
                c188727au2.LIZLLL(i, "add_status");
                FMX.LJIIL("ttelite_ba_lead_ba_click_icon", c188727au2.LIZ);
                return;
            case -522623958:
                if (!str3.equals("during_live")) {
                    return;
                }
                C188727au c188727au22 = new C188727au();
                c188727au22.LJIIIZ("room_id", str);
                c188727au22.LJIIIZ("streamer_id", str2);
                c188727au22.LJIIIZ("type", "toolbar");
                c188727au22.LJIIIZ("live_status", str4);
                c188727au22.LIZLLL(i, "add_status");
                FMX.LJIIL("ttelite_ba_lead_ba_click_icon", c188727au22.LIZ);
                return;
            case 387613079:
                if (!str3.equals("before_live_dialog_item")) {
                    return;
                }
                C188727au c188727au3 = new C188727au();
                c188727au3.LJIIIZ("room_id", str);
                c188727au3.LJIIIZ("streamer_id", str2);
                c188727au3.LJIIIZ("type", "subpage");
                c188727au3.LJIIIZ("live_status", str4);
                c188727au3.LIZLLL(i, "add_status");
                FMX.LJIIL("ttelite_ba_lead_ba_click_icon", c188727au3.LIZ);
                return;
            default:
                return;
        }
    }
}
