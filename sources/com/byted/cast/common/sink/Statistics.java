package com.byted.cast.common.sink;

import X.X1D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class Statistics {
    public List<NetworkStatistics> nx = new ArrayList();
    public List<CodecStatistics> cx = new ArrayList();
    public List<AudioRxStatistics> arx = new ArrayList();
    public List<VideoRxStatistics> vrx = new ArrayList();

    /* loaded from: classes29.dex */
    public static class AudioRxStatistics {
        public String ClientId;
        public float bitrate;
        public float lossRate;
        public long totalBytes;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRxStatistics{ClientId='");
            LIZ.append(this.ClientId);
            LIZ.append('\'');
            LIZ.append(", bitrate=");
            LIZ.append(this.bitrate);
            LIZ.append(", lossRate=");
            LIZ.append(this.lossRate);
            LIZ.append(", totalBytes=");
            LIZ.append(this.totalBytes);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class CodecStatistics {
        public String ClientId;
        public float videoDecodeElapse;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CodecStatistics{ClientId='");
            LIZ.append(this.ClientId);
            LIZ.append('\'');
            LIZ.append(", videoDecodeElapse=");
            LIZ.append(this.videoDecodeElapse);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class NetworkStatistics {
        public String ClientId;
        public float lossRate;
        public int rtt;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkStatistics{ClientId='");
            LIZ.append(this.ClientId);
            LIZ.append('\'');
            LIZ.append(", rtt=");
            LIZ.append(this.rtt);
            LIZ.append(", lossRate=");
            LIZ.append(this.lossRate);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class VideoRxStatistics {
        public String ClientId;
        public float bitrate;
        public float fps;
        public int height;
        public float lossRate;
        public long totalBytes;
        public int width;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoRxStatistics{ClientId='");
            LIZ.append(this.ClientId);
            LIZ.append('\'');
            LIZ.append(", width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", fps=");
            LIZ.append(this.fps);
            LIZ.append(", bitrate=");
            LIZ.append(this.bitrate);
            LIZ.append(", lossRate=");
            LIZ.append(this.lossRate);
            LIZ.append(", totalBytes=");
            LIZ.append(this.totalBytes);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    public long getTotalRxBytes() {
        Iterator<AudioRxStatistics> it = this.arx.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().totalBytes;
        }
        Iterator<VideoRxStatistics> it2 = this.vrx.iterator();
        while (it2.hasNext()) {
            j += it2.next().totalBytes;
        }
        return j;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Statistics{nx=");
        LIZ.append(this.nx);
        LIZ.append(", cx=");
        LIZ.append(this.cx);
        LIZ.append(", arx=");
        LIZ.append(this.arx);
        LIZ.append(", vrx=");
        LIZ.append(this.vrx);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
