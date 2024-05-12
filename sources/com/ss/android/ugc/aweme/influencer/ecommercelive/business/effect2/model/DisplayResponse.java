package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.S71;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DisplayResponse extends F9E implements Parcelable {
    public static final Parcelable.Creator<DisplayResponse> CREATOR = new S71();

    @InterfaceC65349Pkn("billboard_id")
    public final String billboardId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.billboardId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.billboardId);
    }

    public DisplayResponse(String billboardId) {
        o.LJIIIZ(billboardId, "billboardId");
        this.billboardId = billboardId;
    }
}
