package com.ss.android.vesdk.filterparam;

import X.C62850Ola;
import X.Q89;
import X.V0N;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;

/* loaded from: classes15.dex */
public class VEVideoTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoTransformFilterParam> CREATOR = new IDCreatorS56S0000000_14(67);
    public float alpha;
    public long animComboEndTime;
    public String animComboPath;
    public long animComboStartTime;
    public int animEndTime;
    public long animInEndTime;
    public String animInPath;
    public long animInStartTime;
    public String animJsonParam;
    public long animOutEndTime;
    public String animOutPath;
    public long animOutStartTime;
    public String animPath;
    public int animStartTime;
    public String blendModePath;
    public int borderColor;
    public int borderWidth;
    public float degree;
    public boolean disableInsideScale;
    public int mirror;
    public float scaleFactor;
    public float transX;
    public float transY;
    public int transformType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEVideoTransformFilterParam() {
        this.animInPath = "";
        this.animOutPath = "";
        this.animComboPath = "";
        this.filterName = "canvas blend";
        this.filterType = 15;
        this.filterDurationType = 1;
        this.scaleFactor = 1.0f;
        this.alpha = 1.0f;
        this.animPath = "";
        this.blendModePath = "";
        this.animJsonParam = "";
        this.transformType = paramType.UPDATE_VIDEO_TRANSFORM.ordinal();
        this.borderColor = -1;
        this.borderWidth = 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEVideoTransformFilterParam{scaleFactor=");
        LIZ.append(this.scaleFactor);
        LIZ.append(", disableInsideScale=");
        LIZ.append(this.disableInsideScale);
        LIZ.append(", degree=");
        LIZ.append(this.degree);
        LIZ.append(", transX=");
        LIZ.append(this.transX);
        LIZ.append(", transY=");
        LIZ.append(this.transY);
        LIZ.append(", mirror=");
        LIZ.append(this.mirror);
        LIZ.append(", blendModePath='");
        Q89.LIZIZ(LIZ, this.blendModePath, '\'', ", alpha=");
        LIZ.append(this.alpha);
        LIZ.append(", animPath='");
        Q89.LIZIZ(LIZ, this.animPath, '\'', ", animStartTime=");
        LIZ.append(this.animStartTime);
        LIZ.append(", animEndTime=");
        LIZ.append(this.animEndTime);
        LIZ.append(", animInPath='");
        Q89.LIZIZ(LIZ, this.animInPath, '\'', ", animInStartTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animInStartTime, '\'', ", animInEndTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animInEndTime, '\'', ", animOutPath='");
        Q89.LIZIZ(LIZ, this.animOutPath, '\'', ", animOutStartTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animOutStartTime, '\'', ", animOutEndTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animOutEndTime, '\'', ", animComboPath='");
        Q89.LIZIZ(LIZ, this.animComboPath, '\'', ", animComboStartTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animComboStartTime, '\'', ", animComboEndTime='");
        C62850Ola.LJIIIIZZ(LIZ, this.animComboEndTime, '\'', ", animJsonParam=");
        LIZ.append(this.animJsonParam);
        LIZ.append(", transformType=");
        LIZ.append(this.transformType);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append('\'');
        LIZ.append(", borderColor =");
        LIZ.append(this.borderColor);
        LIZ.append('\'');
        LIZ.append(", borderWidth =");
        return b0.LIZJ(LIZ, this.borderWidth, '}', LIZ);
    }

    /* loaded from: classes15.dex */
    public enum paramType {
        UPDATE_VIDEO_TRANSFORM,
        UPDATE_VIDEO_ANIMATION,
        UPDATE_VIDEO_ANIMATION_AND_ANIMATION,
        UPDATE_VIDEO_ANIMATION_NEW;

        public static paramType valueOf(String str) {
            return (paramType) V0N.LJJJ(paramType.class, str);
        }
    }

    public VEVideoTransformFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.animInPath = "";
        this.animOutPath = "";
        this.animComboPath = "";
        this.scaleFactor = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.disableInsideScale = z;
        this.degree = parcel.readFloat();
        this.transX = parcel.readFloat();
        this.transY = parcel.readFloat();
        this.mirror = parcel.readInt();
        this.blendModePath = parcel.readString();
        this.alpha = parcel.readFloat();
        this.animPath = parcel.readString();
        this.animStartTime = parcel.readInt();
        this.animEndTime = parcel.readInt();
        this.animJsonParam = parcel.readString();
        this.transformType = parcel.readInt();
        this.borderColor = parcel.readInt();
        this.borderWidth = parcel.readInt();
        this.animInPath = parcel.readString();
        this.animInStartTime = parcel.readLong();
        this.animInEndTime = parcel.readLong();
        this.animOutPath = parcel.readString();
        this.animOutStartTime = parcel.readLong();
        this.animOutEndTime = parcel.readLong();
        this.animComboPath = parcel.readString();
        this.animComboStartTime = parcel.readLong();
        this.animComboEndTime = parcel.readLong();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.scaleFactor);
        parcel.writeByte(this.disableInsideScale ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.degree);
        parcel.writeFloat(this.transX);
        parcel.writeFloat(this.transY);
        parcel.writeInt(this.mirror);
        parcel.writeString(this.blendModePath);
        parcel.writeFloat(this.alpha);
        parcel.writeString(this.animPath);
        parcel.writeInt(this.animStartTime);
        parcel.writeInt(this.animEndTime);
        parcel.writeString(this.animJsonParam);
        parcel.writeInt(this.transformType);
        parcel.writeInt(this.borderColor);
        parcel.writeInt(this.borderWidth);
        parcel.writeString(this.animInPath);
        parcel.writeLong(this.animInStartTime);
        parcel.writeLong(this.animInEndTime);
        parcel.writeString(this.animOutPath);
        parcel.writeLong(this.animOutStartTime);
        parcel.writeLong(this.animOutEndTime);
        parcel.writeString(this.animComboPath);
        parcel.writeLong(this.animComboStartTime);
        parcel.writeLong(this.animComboEndTime);
    }
}
