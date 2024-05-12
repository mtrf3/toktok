package com.facebook.share.model;

import X.Q8P;
import X.Q8R;
import Y.IDCreatorS54S0000000_11;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CameraEffectArguments implements ShareModel {
    public final Bundle params;
    public static final Q8R Companion = new Q8R();
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new IDCreatorS54S0000000_11(31);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraEffectArguments(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }

    public CameraEffectArguments(Q8P q8p) {
        this.params = q8p.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeBundle(this.params);
    }
}
