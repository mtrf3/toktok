package X;

import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* renamed from: X.QOp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC66931QOp {
    void onReceive(WsChannelMsg wsChannelMsg);

    void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject);

    void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent);

    void onSendResult(String str, boolean z);

    void syncState(int i, EnumC66933QOr enumC66933QOr, boolean z);
}
