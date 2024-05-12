package com.bytedance.common.wschannel.channel;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public interface IWsChannelClient {
    void destroy();

    void init(Context context, IWsChannelClient iWsChannelClient);

    boolean isConnected();

    void onAppStateChanged(int i);

    void onConnection(JSONObject jSONObject);

    void onMessage(WsChannelMsg wsChannelMsg);

    void onMessage(byte[] bArr);

    void onNetworkStateChanged(int i);

    void onParameterChange(Map<String, Object> map, List<String> list);

    void onServiceConnectEvent(int i, boolean z, String str);

    void openConnection(Map<String, Object> map, List<String> list);

    boolean privateProtocolEnabled();

    void registerService(int i);

    boolean sendMessage(WsChannelMsg wsChannelMsg);

    boolean sendMessage(byte[] bArr);

    void stopConnection();

    void unregisterService(int i);
}
