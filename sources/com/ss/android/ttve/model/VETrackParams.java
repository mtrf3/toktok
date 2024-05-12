package com.ss.android.ttve.model;

import X.EnumC82648Wc8;
import X.X1D;
import Y.IDCreatorS56S0000000_14;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VESize;
import defpackage.b0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class VETrackParams implements Parcelable {
    public static final Parcelable.Creator<VETrackParams> CREATOR = new IDCreatorS56S0000000_14(5);
    public int extFlag;
    public int layer;
    public List<String> paths;
    public List<Integer> seqIns;
    public List<Integer> seqOuts;
    public List<VESize> sizes;
    public List<Double> speeds;
    public EnumC82648Wc8 trackPriority;
    public List<Integer> trimIns;
    public List<Integer> trimOuts;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VETrackParams() {
        this.layer = -1;
        this.trackPriority = EnumC82648Wc8.DEFAULT;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VETrackParams{paths=");
        LIZ.append(this.paths);
        LIZ.append(", trimIns=");
        LIZ.append(this.trimIns);
        LIZ.append(", trimOuts=");
        LIZ.append(this.trimOuts);
        LIZ.append(", seqIns=");
        LIZ.append(this.seqIns);
        LIZ.append(", seqOuts=");
        LIZ.append(this.seqOuts);
        LIZ.append(", speeds=");
        LIZ.append(this.speeds);
        LIZ.append(", layer=");
        LIZ.append(this.layer);
        LIZ.append(", trackPriority=");
        LIZ.append(this.trackPriority);
        LIZ.append(", extFlag=");
        return b0.LIZJ(LIZ, this.extFlag, '}', LIZ);
    }

    public VETrackParams(Parcel parcel) {
        EnumC82648Wc8 enumC82648Wc8;
        this.layer = -1;
        this.trackPriority = EnumC82648Wc8.DEFAULT;
        this.paths = parcel.createStringArrayList();
        ArrayList arrayList = new ArrayList();
        this.trimIns = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.trimOuts = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.seqIns = arrayList3;
        parcel.readList(arrayList3, Integer.class.getClassLoader());
        ArrayList arrayList4 = new ArrayList();
        this.seqOuts = arrayList4;
        parcel.readList(arrayList4, Integer.class.getClassLoader());
        ArrayList arrayList5 = new ArrayList();
        this.speeds = arrayList5;
        parcel.readList(arrayList5, Double.class.getClassLoader());
        this.layer = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            enumC82648Wc8 = null;
        } else {
            enumC82648Wc8 = EnumC82648Wc8.values()[readInt];
        }
        this.trackPriority = enumC82648Wc8;
        this.extFlag = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeStringList(this.paths);
        parcel.writeList(this.trimIns);
        parcel.writeList(this.trimOuts);
        parcel.writeList(this.seqIns);
        parcel.writeList(this.seqOuts);
        parcel.writeList(this.speeds);
        parcel.writeInt(this.layer);
        EnumC82648Wc8 enumC82648Wc8 = this.trackPriority;
        if (enumC82648Wc8 == null) {
            ordinal = -1;
        } else {
            ordinal = enumC82648Wc8.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.extFlag);
    }
}
