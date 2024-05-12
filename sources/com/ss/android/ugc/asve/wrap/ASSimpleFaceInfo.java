package com.ss.android.ugc.asve.wrap;

import X.C83321Wmz;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ASSimpleFaceInfo implements Parcelable {
    public static final C83321Wmz CREATOR = new C83321Wmz();
    public float boyProb;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ASSimpleFaceInfo(float f) {
        this.boyProb = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeFloat(this.boyProb);
    }
}
