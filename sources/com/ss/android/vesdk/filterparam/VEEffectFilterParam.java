package com.ss.android.vesdk.filterparam;

import X.C48339Iy7;
import X.Q89;
import X.V0N;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VEEffectFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEEffectFilterParam> CREATOR = new IDCreatorS56S0000000_14(47);
    public String[] composerTags;
    public float[] composerValues;
    public EffectFilterType effectFilterType;
    public String effectPath;
    public boolean isSyncLoadResource;
    public long longRequestId;
    public long longStickerId;
    public boolean multicamMode;
    public boolean needReload;
    public int reqId;
    public int stickerId;
    public String stickerTag;
    public int timeout;
    public boolean useLongId;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEEffectFilterParam() {
        this.effectFilterType = EffectFilterType.DEFAULT;
        this.filterName = "filter effect";
        this.filterType = 8;
        this.effectPath = "";
        this.stickerTag = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEEffectFilterParam{effectPath='");
        Q89.LIZIZ(LIZ, this.effectPath, '\'', ", stickerId=");
        LIZ.append(this.stickerId);
        LIZ.append(", longStickerId=");
        LIZ.append(this.longStickerId);
        LIZ.append(", reqId=");
        LIZ.append(this.reqId);
        LIZ.append(", longReqId=");
        LIZ.append(this.longRequestId);
        LIZ.append(", useLongId=");
        LIZ.append(this.useLongId);
        LIZ.append(", timeout=");
        LIZ.append(this.timeout);
        LIZ.append(", needReload=");
        LIZ.append(this.needReload);
        LIZ.append(", stickerTag='");
        Q89.LIZIZ(LIZ, this.stickerTag, '\'', ", isSyncLoadResource=");
        LIZ.append(this.isSyncLoadResource);
        LIZ.append(", composerTags=");
        LIZ.append(Arrays.toString(this.composerTags));
        LIZ.append(", composerValues=");
        LIZ.append(Arrays.toString(this.composerValues));
        LIZ.append(", filterType=");
        LIZ.append(this.filterType);
        LIZ.append(", filterName='");
        Q89.LIZIZ(LIZ, this.filterName, '\'', ", filterDurationType=");
        LIZ.append(this.filterDurationType);
        LIZ.append('\'');
        LIZ.append(", effectFilterType=");
        LIZ.append(this.effectFilterType.ordinal());
        LIZ.append(", multicamMode=");
        return C48339Iy7.LIZJ(LIZ, this.multicamMode, '}', LIZ);
    }

    /* loaded from: classes15.dex */
    public enum EffectFilterType {
        DEFAULT,
        MUSIC,
        AUDIO_SPEED,
        MIMO;

        public static EffectFilterType valueOf(String str) {
            return (EffectFilterType) V0N.LJJJ(EffectFilterType.class, str);
        }
    }

    public VEEffectFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        boolean z2;
        boolean z3;
        this.effectFilterType = EffectFilterType.DEFAULT;
        this.effectPath = parcel.readString();
        this.stickerId = parcel.readInt();
        this.longStickerId = parcel.readLong();
        this.reqId = parcel.readInt();
        this.longRequestId = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useLongId = z;
        this.timeout = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.needReload = z2;
        this.stickerTag = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isSyncLoadResource = z3;
        this.composerTags = parcel.createStringArray();
        this.composerValues = parcel.createFloatArray();
        this.effectFilterType = EffectFilterType.values()[parcel.readInt()];
        this.multicamMode = parcel.readByte() != 0;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectPath);
        parcel.writeInt(this.stickerId);
        parcel.writeLong(this.longStickerId);
        parcel.writeInt(this.reqId);
        parcel.writeLong(this.longRequestId);
        parcel.writeByte(this.useLongId ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.timeout);
        parcel.writeByte(this.needReload ? (byte) 1 : (byte) 0);
        parcel.writeString(this.stickerTag);
        parcel.writeByte(this.isSyncLoadResource ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.composerTags);
        parcel.writeFloatArray(this.composerValues);
        parcel.writeInt(this.effectFilterType.ordinal());
        parcel.writeByte(this.multicamMode ? (byte) 1 : (byte) 0);
    }
}
