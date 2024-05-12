package com.ss.android.ugc.aweme.creative.model;

import X.GPV;
import X.HCR;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class WWAModel implements Parcelable {
    public static final Parcelable.Creator<WWAModel> CREATOR = new HCR();

    @GPV
    public boolean completedEvent;

    public WWAModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.completedEvent ? 1 : 0);
    }

    public WWAModel(boolean z) {
        this.completedEvent = z;
    }
}
