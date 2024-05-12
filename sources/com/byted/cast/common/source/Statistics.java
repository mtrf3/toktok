package com.byted.cast.common.source;

import X.X1D;

/* loaded from: classes29.dex */
public class Statistics {
    public NetworkStatistics nx = new NetworkStatistics();
    public CodecStatistics cx = new CodecStatistics();
    public AudioTxStatistics atx = new AudioTxStatistics();
    public VideoTxStatistics vtx = new VideoTxStatistics();

    /* loaded from: classes29.dex */
    public static class AudioTxStatistics {
        public float bitrate;
        public long totalBytes;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioTxStatistics{, bitrate=");
            LIZ.append(this.bitrate);
            LIZ.append(", totalBytes=");
            LIZ.append(this.totalBytes);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class CodecStatistics {
        public float videoEncodeElapse;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CodecStatistics{, videoEncodeElapse=");
            LIZ.append(this.videoEncodeElapse);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class NetworkStatistics {
        public float lossRate;
        public int rtt;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetworkStatistics{, rtt=");
            LIZ.append(this.rtt);
            LIZ.append(", lossRate=");
            LIZ.append(this.lossRate);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    /* loaded from: classes29.dex */
    public static class VideoTxStatistics {
        public float bitrate;
        public float fps;
        public int height;
        public long totalBytes;
        public int width;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoTxStatistics{, width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            LIZ.append(this.height);
            LIZ.append(", fps=");
            LIZ.append(this.fps);
            LIZ.append(", bitrate=");
            LIZ.append(this.bitrate);
            LIZ.append(", totalBytes=");
            LIZ.append(this.totalBytes);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Statistics{nx=");
        LIZ.append(this.nx);
        LIZ.append(", cx=");
        LIZ.append(this.cx);
        LIZ.append(", atx=");
        LIZ.append(this.atx);
        LIZ.append(", vtx=");
        LIZ.append(this.vtx);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
