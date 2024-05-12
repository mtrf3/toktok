package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class TVU extends C75192TfA {
    public static final String LIZ = O5Y.LJJL("ttlive_client_linkmic_anchor_connect_status");
    public static final String LIZIZ = O5Y.LJJLI("ttlive_client_linkmic_anchor_connect_status");

    static {
        O5Y.LJJL("ttlive_client_guest_link_status");
        O5Y.LJJLI("ttlive_client_guest_link_status");
    }

    public static final void LJIJJLI(boolean z) {
        String str;
        long j;
        String str2;
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            o.LJI(room);
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        C05630Jz.LJFF(jSONObject, "anchor_id", j);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            j2 = LIZIZ2.getCurrentUserId();
        }
        C05630Jz.LJFF(jSONObject, "current_user_id", j2);
        if (z) {
            str2 = "ttlive_linkmic_anchor_no_show_entrance_with_no_byte_plugin";
        } else {
            str2 = "ttlive_linkmic_audience_no_show_entrance_with_no_byte_plugin";
        }
        C0K2.LJIIIIZZ(str2, 0, jSONObject);
    }

    public static final void LJIILLIIL(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "icon_type", j);
        C05630Jz.LJI(jSONObject, "show_error_type", "bundle");
        C05630Jz.LJI(jSONObject, "event_id", "link_icon_show_error");
        C05630Jz.LJFF(jSONObject, "permission_status", j2);
        C75192TfA.LJIIJ(null, jSONObject);
        LJIL(jSONObject, true);
    }

    public static final void LJIIZILJ(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "show_error_type", OHQ.LIZ);
        C05630Jz.LJI(jSONObject, "event_id", "link_icon_show_error");
        C05630Jz.LJI(jSONObject, "permission_type", str);
        C75192TfA.LJIIJ(th, jSONObject);
        LJIL(jSONObject, true);
    }

    public static final void LJIJ(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "icon_type", j);
        C05630Jz.LJI(jSONObject, "event_id", "link_icon_show");
        C05630Jz.LJFF(jSONObject, "permission_status", j2);
        C75192TfA.LJIIJ(null, jSONObject);
        LJIL(jSONObject, true);
    }

    public static final void LJIL(JSONObject jSONObject, boolean z) {
        int i;
        TX2 LIZ2 = TVY.LIZ();
        if (LIZ2 != null) {
            i = LIZ2.LIZLLL();
        } else {
            i = 0;
        }
        C05630Jz.LIZ(i, "is_aab_opt", jSONObject);
        if (z) {
            C0K2.LJIIIIZZ("ttlive_client_anchor_link_icon_monitor", 0, jSONObject);
        } else {
            if (!C32777Cth.LIZ(0.1f, "ttlive_client_audience_link_icon_monitor")) {
                return;
            }
            C0K2.LJIIIIZZ("ttlive_client_audience_link_icon_monitor", 0, jSONObject);
        }
    }

    public static final void LJIJJ(long j, long j2, boolean z) {
        String str;
        if (!C32777Cth.LIZ(0.1f, "ttlive_multi_guest_v3_open_record")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "host";
        } else {
            str = "audience";
        }
        C05630Jz.LJI(jSONObject, "use_role", str);
        C05630Jz.LJI(jSONObject, "version", String.valueOf(3));
        C05630Jz.LJI(jSONObject, "room_id", String.valueOf(j));
        C05630Jz.LJI(jSONObject, "anchor_id", String.valueOf(j2));
        C0K2.LJIIIIZZ("ttlive_multi_guest_v3_open_record", 0, jSONObject);
    }

    public static final void LJIJI(boolean z, int i, boolean z2, long j, String source, String errorReason, String errorMsg) {
        int i2;
        String str;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(errorReason, "errorReason");
        o.LJIIIZ(errorMsg, "errorMsg");
        if (!C32777Cth.LIZ(0.1f, "ttlive_linkmic_aab_install")) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        TX2 LIZ2 = TVY.LIZ();
        if (LIZ2 != null) {
            i2 = LIZ2.LIZLLL();
        } else {
            i2 = 0;
        }
        C05630Jz.LIZ(i2, "is_aab_opt", jSONObject);
        C05630Jz.LIZ(!z ? 1 : 0, "is_silent_install", jSONObject);
        if (z2) {
            str = "host";
        } else {
            str = "audience";
        }
        C05630Jz.LJI(jSONObject, "user_role", str);
        C05630Jz.LJI(jSONObject, "trigger_source", source);
        if (C39927Flj.LIZLLL(errorReason)) {
            C05630Jz.LJI(jSONObject, "error_reason", errorReason);
        }
        if (C39927Flj.LIZLLL(errorMsg)) {
            C05630Jz.LJI(jSONObject, "error_msg", errorMsg);
        }
        C0K2.LJIILIIL(i, 0, j, "ttlive_linkmic_aab_install", jSONObject);
    }
}
