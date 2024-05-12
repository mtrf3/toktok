package X;

import android.os.SystemClock;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.YLw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87244YLw implements QOA {
    public final /* synthetic */ C87241YLt LIZ;

    @Override // X.QOA
    public final void LIZIZ(QOC qoc, JSONObject jSONObject) {
    }

    public C87244YLw(C87241YLt c87241YLt) {
        this.LIZ = c87241YLt;
    }

    @Override // X.QOA
    public final void LIZ(LiveWsMessage liveWsMessage) {
        try {
            C87241YLt c87241YLt = this.LIZ;
            if (c87241YLt.LIZLLL != null) {
                PayloadItem LIZLLL = C87241YLt.LIZLLL(liveWsMessage);
                if (LIZLLL.getExtraParams() != null) {
                    LIZLLL.getMessageTrackTimeInfo().receiveMessageTime = C30725C4b.LIZ();
                    java.util.Map<String, Object> extraParams = LIZLLL.getExtraParams();
                    o.LJIIIIZZ(extraParams, "payloadItem.extraParams");
                    extraParams.put(MessageMonitor.getLiveMessageStageName("all_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                }
                IMessageWsClient.Callback callback = c87241YLt.LIZLLL;
                if (callback != null) {
                    callback.onHostWebSocketMessage(LIZLLL);
                }
                C32079CiR.LJIIJJI(liveWsMessage);
            }
        } catch (Exception e) {
            C0NB.LJFF("LiveWs", "receive message error", e);
            C32079CiR.LJIIJ(liveWsMessage, e);
        }
    }
}
