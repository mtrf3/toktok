package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class BPS implements InterfaceC29168Bca {
    @Override // X.InterfaceC29176Bci
    public final void onStartLive() {
    }

    @Override // X.InterfaceC29168Bca
    public final void uc() {
        LIZ(0, null);
    }

    @Override // X.InterfaceC29168Bca
    public final void f2(int i) {
        LIZ(i, null);
    }

    public static void LIZ(int i, DataChannel dataChannel) {
        Room room;
        Long l;
        Long l2;
        Integer num;
        String str;
        C28246B6s c28246B6s;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("user_id", ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
            if (dataChannel == null || (c28246B6s = (C28246B6s) dataChannel.kv0(BJO.class)) == null || (room = c28246B6s.LIZIZ) == null) {
                C28246B6s c28246B6s2 = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
                if (c28246B6s2 != null) {
                    room = c28246B6s2.LIZIZ;
                } else {
                    room = null;
                }
            }
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            jSONObject.put("room_id", l);
            if (room != null) {
                l2 = Long.valueOf(room.getOwnerUserId());
            } else {
                l2 = null;
            }
            jSONObject.put("anchor_id", l2);
            if (room != null) {
                num = Integer.valueOf(room.liveRoomMode);
            } else {
                num = null;
            }
            jSONObject.put("live_mode", num);
            if (room != null) {
                str = room.getLabels();
            } else {
                str = null;
            }
            jSONObject.put("game_label", str);
            jSONObject.put("error_code", i);
        } catch (JSONException e) {
            C0K2.LIZ(String.valueOf(e), e);
        }
        C0K2.LIZLLL("livesdk_gamelive_start", new JSONObject(), null, jSONObject);
    }

    @Override // X.InterfaceC29168Bca
    public final void fg(int i, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        LIZ(i, dataChannel);
    }

    @Override // X.InterfaceC29168Bca
    public final void i6(int i, DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        LIZ(i, dataChannel);
    }
}
