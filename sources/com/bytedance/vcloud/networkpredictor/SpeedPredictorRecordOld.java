package com.bytedance.vcloud.networkpredictor;

/* loaded from: classes9.dex */
public class SpeedPredictorRecordOld implements ISpeedRecordOld {
    public long mBytes;
    public long mLastRecvDate;
    public String mProtocol;
    public String mStreamId = "";
    public long mTcpInfoRtt;
    public long mTime;
    public long mTimestamp;
    public int mTrackType;

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getBytes() {
        return this.mBytes;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getLastRecvDate() {
        return this.mLastRecvDate;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public String getProtocol() {
        return this.mProtocol;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public String getStreamId() {
        return this.mStreamId;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTcpInfoRtt() {
        return this.mTcpInfoRtt;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTime() {
        return this.mTime;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public long getTimestamp() {
        return this.mTimestamp;
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedRecordOld
    public int getTrackType() {
        return this.mTrackType;
    }

    public void setBytes(long j) {
        this.mBytes = j;
    }

    public void setLastRecvDate(long j) {
        this.mLastRecvDate = j;
    }

    public void setProtocol(String str) {
        this.mProtocol = str;
    }

    public void setSteamId(String str) {
        this.mStreamId = str;
    }

    public void setTcpInfoRtt(long j) {
        this.mTcpInfoRtt = j;
    }

    public void setTime(long j) {
        this.mTime = j;
    }

    public void setTimestamp(long j) {
        this.mTimestamp = j;
    }

    public void setTrackType(int i) {
        this.mTrackType = i;
    }
}
