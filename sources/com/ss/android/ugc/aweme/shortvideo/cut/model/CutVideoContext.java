package com.ss.android.ugc.aweme.shortvideo.cut.model;

import X.C78886Uxe;
import X.EnumC82528WaC;
import Y.IDCreatorS51S0000000_7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class CutVideoContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<CutVideoContext> CREATOR = new IDCreatorS51S0000000_7(13);
    public float totalSpeed;
    public List<VideoSegment> videoSegmentList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void resetVideoSegmentList() {
        if (C78886Uxe.LJJIJ(this.videoSegmentList)) {
            return;
        }
        for (int i = 0; i < this.videoSegmentList.size(); i++) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.videoSegmentList, i);
            videoSegment.start = 0L;
            videoSegment.end = videoSegment.duration;
            videoSegment.speed = EnumC82528WaC.NORMAL.value();
            videoSegment.rotate = 0;
            videoSegment.isDeleted = false;
        }
    }

    public CutVideoContext() {
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.videoSegmentList;
    }

    public CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.videoSegmentList = arrayList;
        parcel.readList(arrayList, VideoSegment.class.getClassLoader());
    }

    public void setSpeed(float f) {
        this.totalSpeed = f;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.videoSegmentList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.totalSpeed);
        parcel.writeList(this.videoSegmentList);
    }
}
