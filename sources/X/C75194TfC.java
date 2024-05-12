package X;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.TfC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75194TfC extends C75192TfA {
    public static final C75194TfC LIZ = new C75194TfC();
    public static long LIZIZ;

    static {
        System.currentTimeMillis();
        LIZIZ = System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public static final void LJIILLIIL(String str) {
        String str2;
        String str3;
        long j;
        LiveMode streamType;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "channel_id", B5G.LIZIZ().LJFF);
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (Room.isValid(room)) {
            o.LJI(room);
            str2 = room.getIdStr();
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "room_id", str2);
        if (room != null && (streamType = room.getStreamType()) != null) {
            str3 = C28509BGv.LIZ(streamType);
        } else {
            str3 = null;
        }
        C05630Jz.LJI(jSONObject, "live_type", str3);
        long j2 = 0;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C05630Jz.LJFF(jSONObject, "anchor_id", j);
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            j2 = ((C29374Bfu) LIZIZ2).getCurrentUserId();
        }
        C05630Jz.LJFF(jSONObject, "current_user_id", j2);
        C05630Jz.LJI(jSONObject, "event_id", str);
        C0K2.LJIIIIZZ("ttlive_client_linkmic_room", 1, jSONObject);
    }

    public static final void LJIIZILJ(int i, java.util.Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJI(jSONObject, "reply_status", String.valueOf(i));
        C75194TfC c75194TfC = LIZ;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                C75192TfA.LJIIIIZZ(jSONObject, (String) entry.getKey(), entry.getValue());
            }
        }
        c75194TfC.LJIJ(0, "reply_request", jSONObject);
        LIZIZ = System.currentTimeMillis();
    }

    public final void LJIJ(int i, String str, JSONObject jSONObject) {
        LJIIJJI(jSONObject);
        C05630Jz.LJI(jSONObject, "event_id", str);
        if (jSONObject.optLong("channel_id") > 0) {
            C05630Jz.LJI(jSONObject, "report_id", String.valueOf(B5G.LIZIZ().LJJJJ));
            B5G.LIZIZ().LJJJJ++;
        }
        C0K2.LJIIIIZZ("ttlive_client_anchor_link_mic_monitor", i, jSONObject);
    }
}
