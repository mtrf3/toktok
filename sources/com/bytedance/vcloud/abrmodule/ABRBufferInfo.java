package com.bytedance.vcloud.abrmodule;

/* loaded from: classes9.dex */
public class ABRBufferInfo implements IBufferInfo {
    public String mStreamId = "";
    public float mPlayerAvailDuration = -1.0f;
    public long mFileAvailSize = -1;
    public long mHeadSize = -1;

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getFileAvailSize() {
        return this.mFileAvailSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public long getHeadSize() {
        return this.mHeadSize;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public float getPlayerAvailDuration() {
        return this.mPlayerAvailDuration;
    }

    @Override // com.bytedance.vcloud.abrmodule.IBufferInfo
    public String getStreamId() {
        return this.mStreamId;
    }

    public void setFileAvailSize(long j) {
        this.mFileAvailSize = j;
    }

    public void setHeadSize(long j) {
        this.mHeadSize = j;
    }

    public void setPlayerAvailDuration(float f) {
        this.mPlayerAvailDuration = f;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
