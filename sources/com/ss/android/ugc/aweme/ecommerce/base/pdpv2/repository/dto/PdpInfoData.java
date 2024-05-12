package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.repository.dto;

import X.C1FJ;
import X.InterfaceC65349Pkn;
import X.RXI;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicPage;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpInfoData implements Parcelable {
    public static final Parcelable.Creator<PdpInfoData> CREATOR = new RXI();

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("dynamic_page")
    public final DynamicPage dynamicPage;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpInfoData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpInfoData)) {
            return false;
        }
        PdpInfoData pdpInfoData = (PdpInfoData) obj;
        return o.LJ(this.dynamicPage, pdpInfoData.dynamicPage) && o.LJ(this.code, pdpInfoData.code);
    }

    public final int hashCode() {
        DynamicPage dynamicPage = this.dynamicPage;
        int hashCode = (dynamicPage == null ? 0 : dynamicPage.hashCode()) * 31;
        Integer num = this.code;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpInfoData(dynamicPage=");
        LIZ.append(this.dynamicPage);
        LIZ.append(", code=");
        return s0.LIZJ(LIZ, this.code, ')', LIZ);
    }

    public PdpInfoData(DynamicPage dynamicPage, Integer num) {
        this.dynamicPage = dynamicPage;
        this.code = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        DynamicPage dynamicPage = this.dynamicPage;
        if (dynamicPage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dynamicPage.writeToParcel(out, i);
        }
        Integer num = this.code;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public /* synthetic */ PdpInfoData(DynamicPage dynamicPage, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dynamicPage, (i & 2) != 0 ? null : num);
    }
}
