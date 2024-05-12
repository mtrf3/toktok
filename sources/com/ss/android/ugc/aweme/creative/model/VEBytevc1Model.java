package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.H80;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VEBytevc1Model implements Parcelable {
    public static final Parcelable.Creator<VEBytevc1Model> CREATOR = new H80();

    @GPV
    public boolean needUseBytevc1Encode;

    @GPV
    public int notUseByteVC1Reason;

    public VEBytevc1Model() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.needUseBytevc1Encode ? 1 : 0);
        out.writeInt(this.notUseByteVC1Reason);
    }

    public /* synthetic */ VEBytevc1Model(int i) {
        this(false, -1);
    }

    public VEBytevc1Model(boolean z, int i) {
        this.needUseBytevc1Encode = z;
        this.notUseByteVC1Reason = i;
    }
}
