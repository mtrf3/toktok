package com.ss.android.ugc.aweme.creative.model.edit;

import X.GPV;
import X.H81;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditVideoEnhanceModel implements Parcelable {
    public static final Parcelable.Creator<EditVideoEnhanceModel> CREATOR = new H81();

    @GPV
    public boolean useHdrV2;

    public EditVideoEnhanceModel() {
        this(false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.useHdrV2 ? 1 : 0);
    }

    public EditVideoEnhanceModel(boolean z) {
        this.useHdrV2 = z;
    }
}
