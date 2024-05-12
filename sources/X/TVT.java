package X;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class TVT extends C74742TVa {
    public static final /* synthetic */ int LIZ = 0;

    static {
        O5Y.LJJL("ttlive_client_linkmic_anchor_connect_status");
        O5Y.LJJLI("ttlive_client_linkmic_anchor_connect_status");
        O5Y.LJJL("ttlive_client_guest_link_status");
        O5Y.LJJLI("ttlive_client_guest_link_status");
    }

    public static final void LJIIIIZZ(String str, String str2) {
        int i;
        JSONObject LIZLLL = FT5.LIZLLL("event_id", str);
        if (str2 != null) {
            C05630Jz.LJI(LIZLLL, "show_error_type", str2);
        }
        C05630Jz.LJI(LIZLLL, "live_type", "live_studio");
        TVS LIZ2 = TVK.LIZ();
        if (LIZ2 != null) {
            i = LIZ2.LIZIZ;
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "is_aab_opt", LIZLLL);
        C05630Jz.LJI(LIZLLL, "live_type", "live_studio");
        if (C32777Cth.LIZ(0.1f, "ttlive_client_audience_link_icon_monitor")) {
            C0K2.LJIIIIZZ("ttlive_client_audience_link_icon_monitor", 0, LIZLLL);
        }
    }
}
