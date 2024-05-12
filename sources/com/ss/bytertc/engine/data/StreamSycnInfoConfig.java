package com.ss.bytertc.engine.data;

import X.V0N;
import X.X1D;

/* loaded from: classes33.dex */
public class StreamSycnInfoConfig {
    public int repeatCount;
    public StreamIndex streamIndex;
    public SyncInfoStreamType streamType;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StreamSycnInfoConfig{ streamIndex='");
        LIZ.append(this.streamIndex.toString());
        LIZ.append('\'');
        LIZ.append("repeatCount='");
        LIZ.append(this.repeatCount);
        LIZ.append('\'');
        LIZ.append("streamType=Audio }");
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes33.dex */
    public enum SyncInfoStreamType {
        SYNC_INFO_STREAM_TYPE_AUDIO;

        public static SyncInfoStreamType valueOf(String str) {
            return (SyncInfoStreamType) V0N.LJJJ(SyncInfoStreamType.class, str);
        }
    }

    public StreamSycnInfoConfig(StreamIndex streamIndex, int i, SyncInfoStreamType syncInfoStreamType) {
        this.streamIndex = streamIndex;
        this.repeatCount = i;
        this.streamType = syncInfoStreamType;
    }
}
