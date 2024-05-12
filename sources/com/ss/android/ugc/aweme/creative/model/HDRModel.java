package com.ss.android.ugc.aweme.creative.model;

import X.C43562H7u;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HDRModel implements Parcelable {
    public static final Parcelable.Creator<HDRModel> CREATOR = new C43562H7u();

    @GPV
    public boolean veCodecIsReady;

    @GPV
    public int videoCodeType;

    public HDRModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.veCodecIsReady ? 1 : 0);
        out.writeInt(this.videoCodeType);
    }

    public /* synthetic */ HDRModel(int i) {
        this(false, -1);
    }

    public HDRModel(boolean z, int i) {
        this.veCodecIsReady = z;
        this.videoCodeType = i;
    }
}
