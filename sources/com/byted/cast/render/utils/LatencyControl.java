package com.byted.cast.render.utils;

import X.X1D;
import com.byted.cast.mediacommon.render.ILatencyListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes29.dex */
public class LatencyControl {
    public String TAG;
    public ILatencyListener latencyListener;
    public String userId;
    public final boolean isCalculateByUser = true;
    public final Map<Long, Long> frameMap = new HashMap();
    public final Map<Long, Long> sendInTimes = new HashMap();
    public final Map<Long, Long> decodeInTimes = new HashMap();
    public final Map<Long, Long> decodedTimes = new HashMap();

    public void setLatencyListener(ILatencyListener iLatencyListener) {
        this.latencyListener = iLatencyListener;
    }

    public LatencyControl(String str, String str2) {
        this.TAG = "RenderLatency";
        this.userId = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.TAG);
        LIZ.append("-");
        LIZ.append(str2);
        this.TAG = X1D.LIZIZ(LIZ);
    }

    public void decodeIn(int i, long j) {
        if (!this.frameMap.containsKey(Long.valueOf(j))) {
            return;
        }
        try {
            this.frameMap.get(Long.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void decoded(int i, long j) {
        if (!this.frameMap.containsKey(Long.valueOf(j))) {
            return;
        }
        try {
            Long l = this.frameMap.get(Long.valueOf(j));
            ILatencyListener iLatencyListener = this.latencyListener;
            if (iLatencyListener != null) {
                iLatencyListener.onDecoded(this.userId, i, l.longValue(), j);
                this.latencyListener.onRenderIn(this.userId, i, l.longValue(), j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void rendered(int i, long j) {
        if (!this.frameMap.containsKey(Long.valueOf(j))) {
            return;
        }
        try {
            Long l = this.frameMap.get(Long.valueOf(j));
            ILatencyListener iLatencyListener = this.latencyListener;
            if (iLatencyListener != null) {
                iLatencyListener.onRendered(this.userId, i, l.longValue(), j);
            }
            this.frameMap.remove(Long.valueOf(j));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendDataIn(int i, long j, long j2) {
        ILatencyListener iLatencyListener = this.latencyListener;
        if (iLatencyListener != null) {
            iLatencyListener.onDecodeIn(this.userId, i, j, j2);
            if (this.frameMap.size() > 100) {
                this.frameMap.clear();
            }
            this.frameMap.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }
}
