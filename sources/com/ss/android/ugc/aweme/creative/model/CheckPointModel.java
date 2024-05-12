package com.ss.android.ugc.aweme.creative.model;

import X.C43567H7z;
import X.GPV;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CheckPointModel implements Parcelable {
    public static final Parcelable.Creator<CheckPointModel> CREATOR = new C43567H7z();

    @GPV
    public boolean enableCheckPoint;

    public CheckPointModel() {
        this(true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.enableCheckPoint ? 1 : 0);
    }

    public CheckPointModel(boolean z) {
        this.enableCheckPoint = z;
    }
}
