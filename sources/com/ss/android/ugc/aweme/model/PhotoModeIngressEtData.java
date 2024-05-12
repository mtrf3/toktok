package com.ss.android.ugc.aweme.model;

import X.F9E;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotoModeIngressEtData extends F9E implements Parcelable {
    public static final Parcelable.Creator<PhotoModeIngressEtData> CREATOR = new Parcelable.Creator<PhotoModeIngressEtData>() { // from class: X.7vT
        @Override // android.os.Parcelable.Creator
        public final PhotoModeIngressEtData createFromParcel(Parcel parcel) {
            boolean z;
            o.LJIIIZ(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new PhotoModeIngressEtData(z, parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final PhotoModeIngressEtData[] newArray(int i) {
            return new PhotoModeIngressEtData[i];
        }
    };
    public boolean isVideoPlayFinishReported;
    public String paramsEventType;
    public long photoModeDuration;
    public long postModeDuration;
    public int remainingWordCountWithoutHashTag;
    public double startVolumeValue;
    public long timeStamp;
    public long videoPlayTimeAccumulated;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isVideoPlayFinishReported), Long.valueOf(this.videoPlayTimeAccumulated), Long.valueOf(this.photoModeDuration), Long.valueOf(this.postModeDuration), this.paramsEventType, Double.valueOf(this.startVolumeValue), Integer.valueOf(this.remainingWordCountWithoutHashTag), Long.valueOf(this.timeStamp)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isVideoPlayFinishReported ? 1 : 0);
        out.writeLong(this.videoPlayTimeAccumulated);
        out.writeLong(this.photoModeDuration);
        out.writeLong(this.postModeDuration);
        out.writeString(this.paramsEventType);
        out.writeDouble(this.startVolumeValue);
        out.writeInt(this.remainingWordCountWithoutHashTag);
        out.writeLong(this.timeStamp);
    }

    public PhotoModeIngressEtData(boolean z, long j, long j2, long j3, String paramsEventType, double d, int i, long j4) {
        o.LJIIIZ(paramsEventType, "paramsEventType");
        this.isVideoPlayFinishReported = z;
        this.videoPlayTimeAccumulated = j;
        this.photoModeDuration = j2;
        this.postModeDuration = j3;
        this.paramsEventType = paramsEventType;
        this.startVolumeValue = d;
        this.remainingWordCountWithoutHashTag = i;
        this.timeStamp = j4;
    }
}
