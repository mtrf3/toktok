package com.byted.cast.common.api;

import com.byted.cast.common.api.CodecType;
import java.util.HashMap;

/* loaded from: classes29.dex */
public interface ISinkDataListener {
    void onAudioOutput(String str, CodecType.ACODEC_ID acodec_id, byte[] bArr, int i, int i2, int i3, int i4, long j);

    void onNotifyLatency(String str, Long l, HashMap<String, Long> hashMap);

    void onVideoOutput(String str, CodecType.VCODEC_ID vcodec_id, byte[] bArr, int i, int i2, long j, int i3);
}
