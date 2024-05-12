package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69676RWe;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class WaistBanner implements Parcelable {
    public static final Parcelable.Creator<WaistBanner> CREATOR = new C69676RWe();

    @InterfaceC65349Pkn("activity_name")
    public final String activityName;

    @InterfaceC65349Pkn("backgroud")
    public final Image background;

    @InterfaceC65349Pkn("promotion_name")
    public final String promotionName;

    /* JADX WARN: Multi-variable type inference failed */
    public WaistBanner() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaistBanner)) {
            return false;
        }
        WaistBanner waistBanner = (WaistBanner) obj;
        return o.LJ(this.activityName, waistBanner.activityName) && o.LJ(this.background, waistBanner.background) && o.LJ(this.promotionName, waistBanner.promotionName);
    }

    public final int hashCode() {
        String str = this.activityName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.background;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.promotionName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.activityName);
        out.writeParcelable(this.background, i);
        out.writeString(this.promotionName);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaistBanner(activityName=");
        LIZ.append(this.activityName);
        LIZ.append(", background=");
        LIZ.append(this.background);
        LIZ.append(", promotionName=");
        return q.LIZIZ(LIZ, this.promotionName, ')', LIZ);
    }

    public WaistBanner(String str, Image image, String str2) {
        this.activityName = str;
        this.background = image;
        this.promotionName = str2;
    }

    public /* synthetic */ WaistBanner(String str, Image image, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : image, (i & 4) != 0 ? null : str2);
    }
}
