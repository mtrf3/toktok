package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.C69579RSl;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DeleteImageResponseData extends F9E implements Parcelable {
    public static final Parcelable.Creator<DeleteImageResponseData> CREATOR = new C69579RSl();

    @InterfaceC65349Pkn("total")
    public final int totalImageCount;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.totalImageCount)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.totalImageCount);
    }

    public DeleteImageResponseData(int i) {
        this.totalImageCount = i;
    }
}
