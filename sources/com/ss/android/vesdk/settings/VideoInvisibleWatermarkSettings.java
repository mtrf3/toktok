package com.ss.android.vesdk.settings;

import X.X1D;
import Y.IDCreatorS57S0000000_15;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes16.dex */
public class VideoInvisibleWatermarkSettings implements Parcelable {
    public static final Parcelable.Creator<VideoInvisibleWatermarkSettings> CREATOR = new IDCreatorS57S0000000_15(18);
    public int algoVersion;
    public String algorithmName;
    public boolean enableDelayInit;
    public long endWaterDuration;
    public int memLazyload;
    public String modelPath;
    public String modelPathSec;
    public int pFlag;
    public int watermarkInterval;
    public String watermarkStr;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoInvisibleWatermarkSettings() {
        this.algorithmName = "anti_cut_resize_0";
        this.watermarkInterval = 40;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoInvisibleWatermarkSettings watermarkStr:");
        LIZ.append(this.watermarkStr);
        LIZ.append(", algorithmName:");
        LIZ.append(this.algorithmName);
        LIZ.append(", watermarkInterval:");
        LIZ.append(this.watermarkInterval);
        LIZ.append(", modelPath:");
        LIZ.append(this.modelPath);
        LIZ.append(", modelPathSec:");
        LIZ.append(this.modelPathSec);
        LIZ.append(", algoVersion:");
        LIZ.append(this.algoVersion);
        LIZ.append(", endWaterDuration:");
        LIZ.append(this.endWaterDuration);
        LIZ.append(", enableDelayInit:");
        LIZ.append(this.enableDelayInit);
        LIZ.append(", pFlag:");
        LIZ.append(this.pFlag);
        LIZ.append(", memLazyload:");
        LIZ.append(this.memLazyload);
        LIZ.append(super.toString());
        return X1D.LIZIZ(LIZ);
    }

    public VideoInvisibleWatermarkSettings(Parcel parcel) {
        boolean z;
        this.algorithmName = "anti_cut_resize_0";
        this.watermarkInterval = 40;
        this.watermarkStr = parcel.readString();
        this.algorithmName = parcel.readString();
        this.watermarkInterval = parcel.readInt();
        this.modelPath = parcel.readString();
        this.modelPathSec = parcel.readString();
        this.algoVersion = parcel.readInt();
        this.endWaterDuration = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.enableDelayInit = z;
        this.pFlag = parcel.readInt();
        this.memLazyload = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.watermarkStr);
        parcel.writeString(this.algorithmName);
        parcel.writeInt(this.watermarkInterval);
        parcel.writeString(this.modelPath);
        parcel.writeString(this.modelPathSec);
        parcel.writeInt(this.algoVersion);
        parcel.writeLong(this.endWaterDuration);
        parcel.writeByte(this.enableDelayInit ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.pFlag);
        parcel.writeInt(this.memLazyload);
    }
}
