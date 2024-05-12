package com.ss.android.vesdk;

import X.C74221TAz;
import X.Q89;
import X.X1D;
import Y.IDCreatorS52S0000000_8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public class VEEqualizerParams implements Parcelable {
    public static final Parcelable.Creator<VEEqualizerParams> CREATOR = new IDCreatorS52S0000000_8(1);
    public float amp1000;
    public float amp125;
    public float amp16000;
    public float amp2000;
    public float amp250;
    public float amp31;
    public float amp4000;
    public float amp500;
    public float amp63;
    public float amp8000;
    public float freqWidth1000;
    public float freqWidth125;
    public float freqWidth16000;
    public float freqWidth2000;
    public float freqWidth250;
    public float freqWidth31;
    public float freqWidth4000;
    public float freqWidth500;
    public float freqWidth63;
    public float freqWidth8000;
    public String name;
    public float preamp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VEEqualizerParams() {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEEqualizerParams{name='");
        Q89.LIZIZ(LIZ, this.name, '\'', ", preamp=");
        LIZ.append(this.preamp);
        LIZ.append(", amp31=");
        LIZ.append(this.amp31);
        LIZ.append(", amp63=");
        LIZ.append(this.amp63);
        LIZ.append(", amp125=");
        LIZ.append(this.amp125);
        LIZ.append(", amp250=");
        LIZ.append(this.amp250);
        LIZ.append(", amp500=");
        LIZ.append(this.amp500);
        LIZ.append(", amp1000=");
        LIZ.append(this.amp1000);
        LIZ.append(", amp2000=");
        LIZ.append(this.amp2000);
        LIZ.append(", amp4000=");
        LIZ.append(this.amp4000);
        LIZ.append(", amp8000=");
        LIZ.append(this.amp8000);
        LIZ.append(", amp16000=");
        LIZ.append(this.amp16000);
        LIZ.append(", freqWidth31=");
        LIZ.append(this.freqWidth31);
        LIZ.append(", freqWidth63=");
        LIZ.append(this.freqWidth63);
        LIZ.append(", freqWidth125=");
        LIZ.append(this.freqWidth125);
        LIZ.append(", freqWidth250=");
        LIZ.append(this.freqWidth250);
        LIZ.append(", freqWidth500=");
        LIZ.append(this.freqWidth500);
        LIZ.append(", freqWidth1000=");
        LIZ.append(this.freqWidth1000);
        LIZ.append(", freqWidth2000=");
        LIZ.append(this.freqWidth2000);
        LIZ.append(", freqWidth4000=");
        LIZ.append(this.freqWidth4000);
        LIZ.append(", freqWidth8000=");
        LIZ.append(this.freqWidth8000);
        LIZ.append(", freqWidth16000=");
        return C74221TAz.LIZLLL(LIZ, this.freqWidth16000, '}', LIZ);
    }

    public VEEqualizerParams(Parcel parcel) {
        this.name = "";
        this.preamp = 12.0f;
        this.freqWidth31 = 1.0f;
        this.freqWidth63 = 1.0f;
        this.freqWidth125 = 1.0f;
        this.freqWidth250 = 1.0f;
        this.freqWidth500 = 1.0f;
        this.freqWidth1000 = 1.0f;
        this.freqWidth2000 = 1.0f;
        this.freqWidth4000 = 1.0f;
        this.freqWidth8000 = 1.0f;
        this.freqWidth16000 = 1.0f;
        this.name = parcel.readString();
        this.preamp = parcel.readFloat();
        this.freqWidth31 = parcel.readFloat();
        this.freqWidth63 = parcel.readFloat();
        this.freqWidth125 = parcel.readFloat();
        this.freqWidth250 = parcel.readFloat();
        this.freqWidth500 = parcel.readFloat();
        this.freqWidth1000 = parcel.readFloat();
        this.freqWidth2000 = parcel.readFloat();
        this.freqWidth4000 = parcel.readFloat();
        this.freqWidth8000 = parcel.readFloat();
        this.freqWidth16000 = parcel.readFloat();
        this.amp31 = parcel.readFloat();
        this.amp63 = parcel.readFloat();
        this.amp125 = parcel.readFloat();
        this.amp250 = parcel.readFloat();
        this.amp500 = parcel.readFloat();
        this.amp1000 = parcel.readFloat();
        this.amp2000 = parcel.readFloat();
        this.amp4000 = parcel.readFloat();
        this.amp8000 = parcel.readFloat();
        this.amp16000 = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeFloat(this.preamp);
        parcel.writeFloat(this.freqWidth31);
        parcel.writeFloat(this.freqWidth63);
        parcel.writeFloat(this.freqWidth125);
        parcel.writeFloat(this.freqWidth250);
        parcel.writeFloat(this.freqWidth500);
        parcel.writeFloat(this.freqWidth1000);
        parcel.writeFloat(this.freqWidth2000);
        parcel.writeFloat(this.freqWidth4000);
        parcel.writeFloat(this.freqWidth8000);
        parcel.writeFloat(this.freqWidth16000);
        parcel.writeFloat(this.amp31);
        parcel.writeFloat(this.amp63);
        parcel.writeFloat(this.amp125);
        parcel.writeFloat(this.amp250);
        parcel.writeFloat(this.amp500);
        parcel.writeFloat(this.amp1000);
        parcel.writeFloat(this.amp2000);
        parcel.writeFloat(this.amp4000);
        parcel.writeFloat(this.amp8000);
        parcel.writeFloat(this.amp16000);
    }
}
