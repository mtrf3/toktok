package com.ss.android.vesdk;

import X.C74221TAz;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class VEAudioEffectBean implements Parcelable {
    public static final Parcelable.Creator<VEAudioEffectBean> CREATOR = new IDCreatorS56S0000000_14(16);
    public int blockSize;
    public float centtone;
    public boolean formatShiftOn;
    public float octative;
    public int phaseAdjustMethod;
    public int phaseResetMode;
    public int pitchTunerMode;
    public int processChMode;
    public float semiton;
    public boolean smoothOn;
    public float speedRatio;
    public int transientDetectMode;
    public int type;
    public int windowMode;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEAudioEffectBean{type=");
        LIZ.append(this.type);
        LIZ.append(", formatShiftOn=");
        LIZ.append(this.formatShiftOn);
        LIZ.append(", smoothOn=");
        LIZ.append(this.smoothOn);
        LIZ.append(", processChMode=");
        LIZ.append(this.processChMode);
        LIZ.append(", transientDetectMode=");
        LIZ.append(this.transientDetectMode);
        LIZ.append(", phaseResetMode=");
        LIZ.append(this.phaseResetMode);
        LIZ.append(", phaseAdjustMethod=");
        LIZ.append(this.phaseAdjustMethod);
        LIZ.append(", windowMode=");
        LIZ.append(this.windowMode);
        LIZ.append(", pitchTunerMode=");
        LIZ.append(this.pitchTunerMode);
        LIZ.append(", blockSize=");
        LIZ.append(this.blockSize);
        LIZ.append(", centtone=");
        LIZ.append(this.centtone);
        LIZ.append(", semiton=");
        LIZ.append(this.semiton);
        LIZ.append(", octative=");
        LIZ.append(this.octative);
        LIZ.append(", speedRatio=");
        return C74221TAz.LIZLLL(LIZ, this.speedRatio, '}', LIZ);
    }

    public VEAudioEffectBean(Parcel parcel) {
        boolean z;
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.formatShiftOn = z;
        this.smoothOn = parcel.readByte() != 0;
        this.processChMode = parcel.readInt();
        this.transientDetectMode = parcel.readInt();
        this.phaseResetMode = parcel.readInt();
        this.phaseAdjustMethod = parcel.readInt();
        this.windowMode = parcel.readInt();
        this.pitchTunerMode = parcel.readInt();
        this.blockSize = parcel.readInt();
        this.centtone = parcel.readFloat();
        this.semiton = parcel.readFloat();
        this.octative = parcel.readFloat();
        this.speedRatio = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeByte(this.formatShiftOn ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.smoothOn ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.processChMode);
        parcel.writeInt(this.transientDetectMode);
        parcel.writeInt(this.phaseResetMode);
        parcel.writeInt(this.phaseAdjustMethod);
        parcel.writeInt(this.windowMode);
        parcel.writeInt(this.pitchTunerMode);
        parcel.writeInt(this.blockSize);
        parcel.writeFloat(this.centtone);
        parcel.writeFloat(this.semiton);
        parcel.writeFloat(this.octative);
        parcel.writeFloat(this.speedRatio);
    }

    public VEAudioEffectBean(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, float f2, float f3, float f4) {
        this.type = i;
        this.formatShiftOn = z;
        this.smoothOn = z2;
        this.processChMode = i2;
        this.transientDetectMode = i3;
        this.phaseResetMode = i4;
        this.phaseAdjustMethod = i5;
        this.windowMode = i6;
        this.pitchTunerMode = i7;
        this.blockSize = i8;
        this.centtone = f;
        this.semiton = f2;
        this.octative = f3;
        this.speedRatio = f4;
    }
}
