package com.ss.android.vesdk.filterparam;

import X.Q89;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b0;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VEInfoStickerFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEInfoStickerFilterParam> CREATOR = new IDCreatorS56S0000000_14(53);
    public float alpha;
    public VEStickerAnimationParam animationParam;
    public float degree;
    public int endTime;
    public boolean flipX;
    public boolean flipY;
    public int layer;
    public float offsetX;
    public float offsetY;
    public String[] param;
    public String resPath;
    public float scale;
    public int startTime;
    public String templateParam;
    public boolean useRichText;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* loaded from: classes15.dex */
    public static class VEStickerAnimationParam implements Parcelable {
        public static final Parcelable.Creator<VEStickerAnimationParam> CREATOR = new IDCreatorS56S0000000_14(52);
        public String animPropertyKey;
        public String animPropertyVal;
        public int inDuration;
        public String inPath;
        public boolean loop;
        public int loopDuration;
        public int loopEnd;
        public String loopPath;
        public int loopStart;
        public int outDuration;
        public String outPath;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public VEStickerAnimationParam() {
            this.loopPath = "";
            this.inPath = "";
            this.outPath = "";
            this.animPropertyKey = "";
            this.animPropertyVal = "";
        }

        public VEStickerAnimationParam(Parcel parcel) {
            boolean z;
            this.loopPath = "";
            this.inPath = "";
            this.outPath = "";
            this.animPropertyKey = "";
            this.animPropertyVal = "";
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.loop = z;
            this.loopPath = parcel.readString();
            this.loopDuration = parcel.readInt();
            this.loopStart = parcel.readInt();
            this.loopEnd = parcel.readInt();
            this.inPath = parcel.readString();
            this.inDuration = parcel.readInt();
            this.outPath = parcel.readString();
            this.outDuration = parcel.readInt();
            this.animPropertyKey = parcel.readString();
            this.animPropertyVal = parcel.readString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.loop ? (byte) 1 : (byte) 0);
            parcel.writeString(this.loopPath);
            parcel.writeInt(this.loopDuration);
            parcel.writeInt(this.loopStart);
            parcel.writeInt(this.loopEnd);
            parcel.writeString(this.inPath);
            parcel.writeInt(this.inDuration);
            parcel.writeString(this.outPath);
            parcel.writeInt(this.outDuration);
            parcel.writeString(this.animPropertyKey);
            parcel.writeString(this.animPropertyVal);
        }
    }

    public VEInfoStickerFilterParam() {
        this.scale = 1.0f;
        this.alpha = 1.0f;
        this.filterName = "info sticker";
        this.filterType = 9;
        this.filterDurationType = 1;
        this.resPath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEInfoStickerFilterParam{resPath='");
        Q89.LIZIZ(LIZ, this.resPath, '\'', ", param=");
        LIZ.append(Arrays.toString(this.param));
        LIZ.append(", useRichText=");
        LIZ.append(this.useRichText);
        LIZ.append(", offsetX=");
        LIZ.append(this.offsetX);
        LIZ.append(", offsetY=");
        LIZ.append(this.offsetY);
        LIZ.append(", degree=");
        LIZ.append(this.degree);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", scale=");
        LIZ.append(this.scale);
        LIZ.append(", alpha=");
        LIZ.append(this.alpha);
        LIZ.append(", layer=");
        LIZ.append(this.layer);
        LIZ.append(", flipX=");
        LIZ.append(this.flipX);
        LIZ.append(", flipY=");
        LIZ.append(this.flipY);
        LIZ.append(", animationParam=");
        LIZ.append(this.animationParam);
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        return b0.LIZJ(LIZ, this.filterDurationType, '}', LIZ);
    }

    public VEInfoStickerFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        this.resPath = "";
        this.scale = 1.0f;
        this.alpha = 1.0f;
        this.resPath = parcel.readString();
        this.param = parcel.createStringArray();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useRichText = z;
        this.offsetX = parcel.readFloat();
        this.offsetY = parcel.readFloat();
        this.degree = parcel.readFloat();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.scale = parcel.readFloat();
        this.alpha = parcel.readFloat();
        this.layer = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.flipX = z2;
        this.flipY = parcel.readByte() != 0;
        this.animationParam = (VEStickerAnimationParam) parcel.readParcelable(VEStickerAnimationParam.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.resPath);
        parcel.writeStringArray(this.param);
        parcel.writeByte(this.useRichText ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeFloat(this.degree);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.alpha);
        parcel.writeInt(this.layer);
        parcel.writeByte(this.flipX ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.flipY ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.animationParam, i);
    }
}
