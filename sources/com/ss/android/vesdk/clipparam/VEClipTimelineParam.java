package com.ss.android.vesdk.clipparam;

import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEClipTimelineParam implements Parcelable {
    public static final Parcelable.Creator<VEClipTimelineParam> CREATOR = new IDCreatorS56S0000000_14(29);
    public float[] curveSpeedPointX;
    public float[] curveSpeedPointY;
    public boolean isReverseCurveSpeed;
    public double speed;
    public int trimIn;
    public int trimOut;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEClipTimelineParam() {
        this.speed = 1.0d;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trimIn: ");
        LIZ.append(this.trimIn);
        LIZ.append(" trimOut: ");
        LIZ.append(this.trimOut);
        LIZ.append(" speed: ");
        LIZ.append(this.speed);
        return X1D.LIZIZ(LIZ);
    }

    public VEClipTimelineParam(Parcel parcel) {
        boolean z;
        this.trimIn = parcel.readInt();
        this.trimOut = parcel.readInt();
        this.speed = parcel.readDouble();
        this.curveSpeedPointX = parcel.createFloatArray();
        this.curveSpeedPointY = parcel.createFloatArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isReverseCurveSpeed = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.trimIn);
        parcel.writeInt(this.trimOut);
        parcel.writeDouble(this.speed);
        parcel.writeFloatArray(this.curveSpeedPointX);
        parcel.writeFloatArray(this.curveSpeedPointY);
        parcel.writeByte(this.isReverseCurveSpeed ? (byte) 1 : (byte) 0);
    }
}
