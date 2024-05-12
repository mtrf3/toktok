package com.ss.ttlivestreamer.livestreamv2;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class TransportSendStallStatics {
    public int mTotalPtsAudioStallCount;
    public long mTotalPtsAudioStallTime;
    public int mTotalPtsVideoStallCount;
    public long mTotalPtsVideoStallTime;
    public long mTotalReConnectCostTime;
    public int mTotalReConnectCount;
    public int mTotalSendAudioStallCount;
    public long mTotalSendAudioStallTime;
    public int mTotalSendVideoStallCount;
    public long mTotalSendVideoStallTime;

    public void reset() {
        this.mTotalSendVideoStallTime = 0L;
        this.mTotalPtsVideoStallTime = 0L;
        this.mTotalSendAudioStallTime = 0L;
        this.mTotalPtsAudioStallTime = 0L;
        this.mTotalSendAudioStallCount = 0;
        this.mTotalPtsAudioStallCount = 0;
        this.mTotalSendVideoStallCount = 0;
        this.mTotalPtsVideoStallCount = 0;
        this.mTotalReConnectCostTime = 0L;
        this.mTotalReConnectCount = 0;
    }

    public void accumulate(TransportSendStallStatics transportSendStallStatics) {
        if (transportSendStallStatics != null) {
            this.mTotalSendVideoStallTime += transportSendStallStatics.mTotalSendVideoStallTime;
            this.mTotalPtsVideoStallTime += transportSendStallStatics.mTotalPtsVideoStallTime;
            this.mTotalSendAudioStallTime += transportSendStallStatics.mTotalSendAudioStallTime;
            this.mTotalPtsAudioStallTime += transportSendStallStatics.mTotalPtsAudioStallTime;
            this.mTotalSendAudioStallCount += transportSendStallStatics.mTotalSendAudioStallCount;
            this.mTotalPtsAudioStallCount += transportSendStallStatics.mTotalPtsAudioStallCount;
            this.mTotalSendVideoStallCount += transportSendStallStatics.mTotalSendVideoStallCount;
            this.mTotalPtsVideoStallCount += transportSendStallStatics.mTotalPtsVideoStallCount;
            this.mTotalReConnectCostTime += transportSendStallStatics.mTotalReConnectCostTime;
            this.mTotalReConnectCount += transportSendStallStatics.mTotalReConnectCount;
        }
    }

    public void getTransportSendStallLog(JSONObject jSONObject) {
        try {
            jSONObject.put("transport_send_audio_stall_time", this.mTotalSendAudioStallTime).put("transport_send_audio_stall_count", this.mTotalSendAudioStallCount).put("transport_send_video_stall_time", this.mTotalSendVideoStallTime).put("transport_send_video_stall_count", this.mTotalSendVideoStallCount).put("transport_pts_audio_stall_time", this.mTotalPtsAudioStallTime).put("transport_pts_audio_stall_count", this.mTotalPtsAudioStallCount).put("transport_pts_video_stall_time", this.mTotalPtsVideoStallTime).put("transport_pts_video_stall_count", this.mTotalPtsVideoStallCount).put("transport_reconnect_count", this.mTotalReConnectCount).put("transport_reconnect_time", this.mTotalReConnectCostTime);
        } catch (ArrayIndexOutOfBoundsException | JSONException unused) {
        }
    }

    public void setReconnectCost(long j) {
        if (j < 0) {
            return;
        }
        this.mTotalReConnectCostTime += j;
        this.mTotalReConnectCount++;
    }

    public void setTransportSendStallParam(boolean z, int i, long j) {
        if (j < 0) {
            return;
        }
        if (z) {
            if (i == 1) {
                this.mTotalPtsAudioStallTime += j;
                this.mTotalPtsAudioStallCount++;
                return;
            } else {
                if (i != 0) {
                    return;
                }
                this.mTotalSendAudioStallTime += j;
                this.mTotalSendAudioStallCount++;
                return;
            }
        }
        if (i == 1) {
            this.mTotalPtsVideoStallTime += j;
            this.mTotalPtsVideoStallCount++;
        } else {
            if (i != 0) {
                return;
            }
            this.mTotalSendVideoStallTime += j;
            this.mTotalSendVideoStallCount++;
        }
    }
}
