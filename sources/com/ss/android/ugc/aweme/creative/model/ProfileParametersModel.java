package com.ss.android.ugc.aweme.creative.model;

import X.HCP;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ProfileParametersModel implements Parcelable {
    public static final Parcelable.Creator<ProfileParametersModel> CREATOR = new HCP();

    @InterfaceC65349Pkn("wording")
    public String guideWording;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileParametersModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.guideWording);
    }

    public ProfileParametersModel(String str) {
        this.guideWording = str;
    }

    public /* synthetic */ ProfileParametersModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
