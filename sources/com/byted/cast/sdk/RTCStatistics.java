package com.byted.cast.sdk;

import com.byted.cast.sdk.utils.JsonFormatter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes29.dex */
public class RTCStatistics {
    public List<NetworkStatistics> nx = new ArrayList();
    public List<CodecStatistics> cx = new ArrayList();
    public List<AudioTxStatistics> atx = new ArrayList();
    public List<VideoTxStatistics> vtx = new ArrayList();
    public List<AudioRxStatistics> arx = new ArrayList();
    public List<VideoRxStatistics> vrx = new ArrayList();

    /* loaded from: classes29.dex */
    public static class AudioRxStatistics {
        public int bitrate;
        public long firstPacketTime;
        public long firstRenderTime;
        public int kind;
        public int loss;
        public long totalBytes;
        public String userId;
    }

    /* loaded from: classes29.dex */
    public static class AudioTxStatistics {
        public int bitrate;
        public int kind;
        public long totalBytes;
    }

    /* loaded from: classes29.dex */
    public static class CodecStatistics {
        public String userId;
        public int videoDecodeElapse;
        public int videoEncodeElapse;
    }

    /* loaded from: classes29.dex */
    public static class NetworkStatistics {
        public int loss;
        public int rtt;
        public String userId;
        public int videoRtt;
    }

    /* loaded from: classes29.dex */
    public static class VideoRxStatistics {
        public int bitrate;
        public long firstFrameTime;
        public long firstPacketTime;
        public long firstRenderTime;
        public int fps;
        public int height;
        public int kind;
        public int loss;
        public long totalBytes;
        public String userId;
        public int width;
    }

    /* loaded from: classes29.dex */
    public static class VideoTxStatistics {
        public int bitrate;
        public int fps;
        public int height;
        public int kind;
        public long totalBytes;
        public int width;
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

    public long getTotalTxBytes() {
        Iterator<AudioTxStatistics> it = this.atx.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().totalBytes;
        }
        Iterator<VideoTxStatistics> it2 = this.vtx.iterator();
        while (it2.hasNext()) {
            j += it2.next().totalBytes;
        }
        return j;
    }

    public String toString() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    public static RTCStatistics fromJson(String str) {
        return (RTCStatistics) JsonFormatter.fromJson(str, RTCStatistics.class);
    }
}
