package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.LiveReplyPayload;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QOI implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC67148QWy, QOQ {
    public static final QOI LJLIL = new QOI();

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        int i;
        String str;
        if (wsChannelMsg == null) {
            return;
        }
        int i2 = wsChannelMsg.service;
        if (i2 == 50331702 && ((i = wsChannelMsg.method) == 1 || i == 2)) {
            byte[] LIZ = wsChannelMsg.LIZ();
            o.LJIIIIZZ(LIZ, "wsChannelMsg.payload");
            try {
                LiveReplyPayload liveReplyPayload = (LiveReplyPayload) C75792yF.LIZ(new String(LIZ, PVC.LIZ), LiveReplyPayload.class);
                if (liveReplyPayload == null) {
                    return;
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("anchor_id", ((RBX) HG3.LJIILL()).getCurUserId());
                c188727au.LJIIIZ("room_id", String.valueOf(liveReplyPayload.getReplayId()));
                if (C48189Ivh.LJI(C15380j0.LIZLLL())) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("is_wifi", str);
                FMX.LJIIL("livesdk_live_replay_long_connection", c188727au.LIZ);
                IO7.LIZ(new AqS159S0200000_12(wsChannelMsg, liveReplyPayload, 68));
                return;
            } catch (s unused) {
                return;
            }
        }
        if (i2 == 134217737) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            byte[] LIZ2 = wsChannelMsg.LIZ();
            o.LJIIIIZZ(LIZ2, "data.payload");
            jSONObject.put("payload", new String(LIZ2, PVC.LIZ));
            jSONObject.put("method_id", String.valueOf(wsChannelMsg.method));
            C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "live_replay_message_event");
            return;
        }
        if (i2 == 134217736) {
            long currentTimeMillis2 = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            byte[] LIZ3 = wsChannelMsg.LIZ();
            o.LJIIIIZZ(LIZ3, "data.payload");
            jSONObject2.put("payload", new String(LIZ3, PVC.LIZ));
            jSONObject2.put("method_id", String.valueOf(wsChannelMsg.method));
            C01R.LIZIZ(currentTimeMillis2, new C78528Urs(jSONObject2), "live_highlight_message_event");
        }
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(msg);
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
    }
}
