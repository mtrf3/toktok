package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27150Al8;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPShippingServiceModule implements Parcelable {
    public static final Parcelable.Creator<PDPShippingServiceModule> CREATOR = new C27150Al8();

    @InterfaceC65349Pkn("description_list")
    public final List<LinkRichText> descriptionList;

    @InterfaceC65349Pkn("description_list_arrow")
    public final Icon descriptionListArrow;

    @InterfaceC65349Pkn("description_list_icon")
    public final Icon descriptionListIcon;

    @InterfaceC65349Pkn("lead_msg")
    public final LinkRichText leadMsg;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_icon")
    public final Icon titleIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPShippingServiceModule() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPShippingServiceModule)) {
            return false;
        }
        PDPShippingServiceModule pDPShippingServiceModule = (PDPShippingServiceModule) obj;
        return o.LJ(this.title, pDPShippingServiceModule.title) && o.LJ(this.titleIcon, pDPShippingServiceModule.titleIcon) && o.LJ(this.leadMsg, pDPShippingServiceModule.leadMsg) && o.LJ(this.descriptionList, pDPShippingServiceModule.descriptionList) && o.LJ(this.descriptionListIcon, pDPShippingServiceModule.descriptionListIcon) && o.LJ(this.descriptionListArrow, pDPShippingServiceModule.descriptionListArrow);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.titleIcon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        LinkRichText linkRichText = this.leadMsg;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        List<LinkRichText> list = this.descriptionList;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon2 = this.descriptionListIcon;
        int hashCode5 = (hashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        Icon icon3 = this.descriptionListArrow;
        return hashCode5 + (icon3 != null ? icon3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PDPShippingServiceModule(title=");
        LIZ.append(this.title);
        LIZ.append(", titleIcon=");
        LIZ.append(this.titleIcon);
        LIZ.append(", leadMsg=");
        LIZ.append(this.leadMsg);
        LIZ.append(", descriptionList=");
        LIZ.append(this.descriptionList);
        LIZ.append(", descriptionListIcon=");
        LIZ.append(this.descriptionListIcon);
        LIZ.append(", descriptionListArrow=");
        LIZ.append(this.descriptionListArrow);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        Icon icon = this.titleIcon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        LinkRichText linkRichText = this.leadMsg;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
        List<LinkRichText> list = this.descriptionList;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((LinkRichText) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Icon icon2 = this.descriptionListIcon;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        Icon icon3 = this.descriptionListArrow;
        if (icon3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon3.writeToParcel(out, i);
        }
    }

    public PDPShippingServiceModule(String str, Icon icon, LinkRichText linkRichText, List<LinkRichText> list, Icon icon2, Icon icon3) {
        this.title = str;
        this.titleIcon = icon;
        this.leadMsg = linkRichText;
        this.descriptionList = list;
        this.descriptionListIcon = icon2;
        this.descriptionListArrow = icon3;
    }

    public /* synthetic */ PDPShippingServiceModule(String str, Icon icon, LinkRichText linkRichText, List list, Icon icon2, Icon icon3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : linkRichText, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : icon2, (i & 32) == 0 ? icon3 : null);
    }
}
