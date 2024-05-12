package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import X.C71232RxU;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RefreshShortTouchResponse implements Parcelable {
    public static final Parcelable.Creator<RefreshShortTouchResponse> CREATOR = new C71232RxU();

    @InterfaceC65349Pkn("short_touch_items")
    public final List<ShortTouch> shortTouchItems;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }
}
