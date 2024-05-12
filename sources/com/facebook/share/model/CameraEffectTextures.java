package com.facebook.share.model;

import X.Q8Q;
import X.Q8S;
import Y.IDCreatorS54S0000000_11;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CameraEffectTextures implements ShareModel {
    public final Bundle textures;
    public static final Q8S Companion = new Q8S();
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new IDCreatorS54S0000000_11(32);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraEffectTextures(Parcel parcel) {
        o.LJIIIZ(parcel, "parcel");
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }

    public CameraEffectTextures(Q8Q q8q) {
        this.textures = q8q.LIZ;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeBundle(this.textures);
    }
}
