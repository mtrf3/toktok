package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C26822Afq;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingService implements Parcelable {
    public static final Parcelable.Creator<ShippingService> CREATOR = new C26822Afq();

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("service_name_list")
    public final List<String> serviceNames;

    @InterfaceC65349Pkn("shipping_rights_content")
    public final String shippingRightsContent;

    @InterfaceC65349Pkn("shipping_right_list")
    public final List<LogisticLinkRichText> shippingRightsList;

    @InterfaceC65349Pkn("shipping_service_popup")
    public final ShippingServicePopup shippingServicePopup;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingService)) {
            return false;
        }
        ShippingService shippingService = (ShippingService) obj;
        return o.LJ(this.serviceNames, shippingService.serviceNames) && o.LJ(this.icon, shippingService.icon) && o.LJ(this.shippingServicePopup, shippingService.shippingServicePopup) && o.LJ(this.shippingRightsContent, shippingService.shippingRightsContent) && o.LJ(this.shippingRightsList, shippingService.shippingRightsList);
    }

    public final int hashCode() {
        List<String> list = this.serviceNames;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Icon icon = this.icon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        ShippingServicePopup shippingServicePopup = this.shippingServicePopup;
        int hashCode3 = (hashCode2 + (shippingServicePopup == null ? 0 : shippingServicePopup.hashCode())) * 31;
        String str = this.shippingRightsContent;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<LogisticLinkRichText> list2 = this.shippingRightsList;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingService(serviceNames=");
        LIZ.append(this.serviceNames);
        LIZ.append(", icon=");
        LIZ.append(this.icon);
        LIZ.append(", shippingServicePopup=");
        LIZ.append(this.shippingServicePopup);
        LIZ.append(", shippingRightsContent=");
        LIZ.append(this.shippingRightsContent);
        LIZ.append(", shippingRightsList=");
        return C1NE.LIZIZ(LIZ, this.shippingRightsList, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeStringList(this.serviceNames);
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        ShippingServicePopup shippingServicePopup = this.shippingServicePopup;
        if (shippingServicePopup == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingServicePopup.writeToParcel(out, i);
        }
        out.writeString(this.shippingRightsContent);
        List<LogisticLinkRichText> list = this.shippingRightsList;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((LogisticLinkRichText) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public ShippingService(List<String> list, Icon icon, ShippingServicePopup shippingServicePopup, String str, List<LogisticLinkRichText> list2) {
        this.serviceNames = list;
        this.icon = icon;
        this.shippingServicePopup = shippingServicePopup;
        this.shippingRightsContent = str;
        this.shippingRightsList = list2;
    }
}
