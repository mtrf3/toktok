package com.byted.cast.common.sink;

import com.byted.cast.common.api.CodecType;
import java.util.HashMap;

/* loaded from: classes29.dex */
public interface IMirrorListener {
    void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j);

    void onCast(int i, CastInfo castInfo);

    void onError(String str, int i, String str2);

    void onInviteResult(boolean z);

    void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap);

    void onSinkLatencyStat(int i, String str, String str2);

    void onSinkStuckStat(int i, String str, String str2);

    void onStatistics(Statistics statistics);

    void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3);

    void onVolume(String str, int i);
}
