package com.byted.cast.common.api;

import com.byted.cast.common.api.CodecType;
import com.byted.cast.common.sink.ClientInfo;
import com.byted.cast.common.sink.Statistics;
import com.byted.cast.common.source.ServiceInfo;
import java.util.HashMap;

/* loaded from: classes29.dex */
public interface IMirroListener {
    void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j);

    void onAuthSDK(int i, int i2);

    void onConnect(int i, ClientInfo clientInfo);

    void onConnect(int i, ServiceInfo serviceInfo);

    void onDisconnect(int i, ClientInfo clientInfo);

    void onDisconnect(int i, ServiceInfo serviceInfo);

    void onMirrorError(int i, int i2, int i3);

    void onMirrorStart(int i);

    void onMirrorStop(int i);

    void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap);

    void onSinkStatistics(Statistics statistics);

    void onSourceStatistics(com.byted.cast.common.source.Statistics statistics);

    boolean onStartMirrorAuthorization();

    void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j);

    void onVolume(String str, int i);
}
