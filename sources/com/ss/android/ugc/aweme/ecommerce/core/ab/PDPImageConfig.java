package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.X7J;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class PDPImageConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<PDPImageConfig> CREATOR = new X7J();

    @InterfaceC65349Pkn("pdp_header_progressive_switch")
    public final int progressiveSwitch;

    public PDPImageConfig() {
        this(0, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.progressiveSwitch)};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.progressiveSwitch);
    }

    public PDPImageConfig(int i) {
        this.progressiveSwitch = i;
    }

    public /* synthetic */ PDPImageConfig(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
