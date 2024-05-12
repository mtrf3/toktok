package com.ss.android.ugc.aweme.creative.model;

import X.C43569H8b;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InlineCaptionExperimentInformation implements Parcelable {
    public static final Parcelable.Creator<InlineCaptionExperimentInformation> CREATOR = new C43569H8b();

    @InterfaceC65349Pkn("experiment_group")
    public final int experimentType;

    public InlineCaptionExperimentInformation() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.experimentType);
    }

    public InlineCaptionExperimentInformation(int i) {
        this.experimentType = i;
    }

    public /* synthetic */ InlineCaptionExperimentInformation(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
