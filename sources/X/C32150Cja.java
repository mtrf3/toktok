package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerRequestSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import org.json.JSONObject;

/* renamed from: X.Cja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32150Cja implements InterfaceC24110x5 {
    public DataChannel LIZ;
    public final String LIZIZ = "live_gift_guide";

    @Override // X.InterfaceC24110x5
    public final void LIZ(C35611aX c35611aX) {
        Room room;
        LiveClientTriggerRequestSettings liveClientTriggerRequestSettings = LiveClientTriggerRequestSettings.INSTANCE;
        if (liveClientTriggerRequestSettings.getRequestSetting() == 0) {
            return;
        }
        if (liveClientTriggerRequestSettings.getRequestSetting() == 1) {
            C0K2.LJ("ttlive_client_trigger_request_type", new JSONObject().putOpt("request_from", 0).putOpt("trigger_type", c35611aX.LJLIL), new JSONObject(), new JSONObject());
            return;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
            return;
        }
        C32146CjW.LIZLLL(this.LIZ, room.getId(), c35611aX.LJLIL, c35611aX.LJLJI, c35611aX.LJLJJI, c35611aX.LJLILLLLZI);
    }
}
