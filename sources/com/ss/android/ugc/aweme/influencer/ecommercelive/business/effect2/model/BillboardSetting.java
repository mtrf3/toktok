package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.S9G;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BillboardSetting extends F9E implements Parcelable {
    public static final Parcelable.Creator<BillboardSetting> CREATOR = new S9G();

    @InterfaceC65349Pkn("is_show_setting")
    public final boolean isAutoDisplay;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isAutoDisplay)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.isAutoDisplay ? 1 : 0);
    }

    public BillboardSetting(boolean z) {
        this.isAutoDisplay = z;
    }
}
