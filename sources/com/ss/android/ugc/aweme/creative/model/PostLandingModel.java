package com.ss.android.ugc.aweme.creative.model;

import X.C43554H7m;
import X.GPV;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PostLandingModel implements Parcelable {
    public static final Parcelable.Creator<PostLandingModel> CREATOR = new C43554H7m();

    @GPV
    public transient Bundle backBundle;

    @GPV
    public boolean backByClearTop;

    @GPV
    public String backUrl;

    @GPV
    public boolean includeDraft;

    @GPV
    public boolean landingBack;

    public PostLandingModel() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.landingBack ? 1 : 0);
        out.writeString(this.backUrl);
        out.writeBundle(this.backBundle);
        out.writeInt(this.includeDraft ? 1 : 0);
        out.writeInt(this.backByClearTop ? 1 : 0);
    }

    public /* synthetic */ PostLandingModel(int i) {
        this(false, null, new Bundle(), false, false);
    }

    public PostLandingModel(boolean z, String str, Bundle backBundle, boolean z2, boolean z3) {
        o.LJIIIZ(backBundle, "backBundle");
        this.landingBack = z;
        this.backUrl = str;
        this.backBundle = backBundle;
        this.includeDraft = z2;
        this.backByClearTop = z3;
    }
}
