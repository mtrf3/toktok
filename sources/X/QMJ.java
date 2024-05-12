package X;

import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface QMJ {
    void LIZ();

    void LIZIZ(IWsChannelClient iWsChannelClient, int i, JSONObject jSONObject);

    void LIZJ(WsChannelMsg wsChannelMsg, boolean z);

    void LIZLLL(SocketState socketState);

    void LJ(ServiceConnectEvent serviceConnectEvent);

    void LJFF();

    void LJI(int i, byte[] bArr);

    void LJII(int i, WsChannelMsg wsChannelMsg);
}
