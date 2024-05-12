package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27147Al5;
import X.C279017q;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PDPShippingModule implements Parcelable {
    public static final Parcelable.Creator<PDPShippingModule> CREATOR = new C27147Al5();

    @InterfaceC65349Pkn("appendix_list")
    public final List<PDPAppendix> appendixList;

    @InterfaceC65349Pkn("description_list")
    public final List<LinkRichText> descriptionList;

    @InterfaceC65349Pkn("description_list_arrow")
    public final Icon descriptionListArrow;

    @InterfaceC65349Pkn("description_list_icon")
    public final Icon descriptionListIcon;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("lead_msg")
    public final LinkRichText leadMsg;

    @InterfaceC65349Pkn("logistic_address_info")
    public final PDPLogisticAddressInfo logisticAddressInfo;

    @InterfaceC65349Pkn("meta")
    public final PDPShippingModuleMeta meta;

    @InterfaceC65349Pkn("promotion")
    public final LogisticPromotion promotion;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("title_icon")
    public final Icon titleIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public PDPShippingModule() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PDPShippingModule)) {
            return false;
        }
        PDPShippingModule pDPShippingModule = (PDPShippingModule) obj;
        return o.LJ(this.title, pDPShippingModule.title) && o.LJ(this.titleIcon, pDPShippingModule.titleIcon) && o.LJ(this.leadMsg, pDPShippingModule.leadMsg) && o.LJ(this.icon, pDPShippingModule.icon) && o.LJ(this.promotion, pDPShippingModule.promotion) && o.LJ(this.descriptionList, pDPShippingModule.descriptionList) && o.LJ(this.descriptionListIcon, pDPShippingModule.descriptionListIcon) && o.LJ(this.descriptionListArrow, pDPShippingModule.descriptionListArrow) && o.LJ(this.logisticAddressInfo, pDPShippingModule.logisticAddressInfo) && o.LJ(this.appendixList, pDPShippingModule.appendixList) && o.LJ(this.meta, pDPShippingModule.meta);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Icon icon = this.titleIcon;
        int hashCode2 = (hashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        LinkRichText linkRichText = this.leadMsg;
        int hashCode3 = (hashCode2 + (linkRichText == null ? 0 : linkRichText.hashCode())) * 31;
        Icon icon2 = this.icon;
        int hashCode4 = (hashCode3 + (icon2 == null ? 0 : icon2.hashCode())) * 31;
        LogisticPromotion logisticPromotion = this.promotion;
        int hashCode5 = (hashCode4 + (logisticPromotion == null ? 0 : logisticPromotion.hashCode())) * 31;
        List<LinkRichText> list = this.descriptionList;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Icon icon3 = this.descriptionListIcon;
        int hashCode7 = (hashCode6 + (icon3 == null ? 0 : icon3.hashCode())) * 31;
        Icon icon4 = this.descriptionListArrow;
        int hashCode8 = (hashCode7 + (icon4 == null ? 0 : icon4.hashCode())) * 31;
        PDPLogisticAddressInfo pDPLogisticAddressInfo = this.logisticAddressInfo;
        int hashCode9 = (hashCode8 + (pDPLogisticAddressInfo == null ? 0 : pDPLogisticAddressInfo.hashCode())) * 31;
        List<PDPAppendix> list2 = this.appendixList;
        int hashCode10 = (hashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        PDPShippingModuleMeta pDPShippingModuleMeta = this.meta;
        return hashCode10 + (pDPShippingModuleMeta != null ? pDPShippingModuleMeta.hashCode() : 0);
    }

    public final String toString() {
        return "PDPShippingModule(title=" + this.title + ", titleIcon=" + this.titleIcon + ", leadMsg=" + this.leadMsg + ", icon=" + this.icon + ", promotion=" + this.promotion + ", descriptionList=" + this.descriptionList + ", descriptionListIcon=" + this.descriptionListIcon + ", descriptionListArrow=" + this.descriptionListArrow + ", logisticAddressInfo=" + this.logisticAddressInfo + ", appendixList=" + this.appendixList + ", meta=" + this.meta + ')';
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
        Icon icon2 = this.icon;
        if (icon2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon2.writeToParcel(out, i);
        }
        LogisticPromotion logisticPromotion = this.promotion;
        if (logisticPromotion == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            logisticPromotion.writeToParcel(out, i);
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
        Icon icon3 = this.descriptionListIcon;
        if (icon3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon3.writeToParcel(out, i);
        }
        Icon icon4 = this.descriptionListArrow;
        if (icon4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon4.writeToParcel(out, i);
        }
        PDPLogisticAddressInfo pDPLogisticAddressInfo = this.logisticAddressInfo;
        if (pDPLogisticAddressInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPLogisticAddressInfo.writeToParcel(out, i);
        }
        List<PDPAppendix> list2 = this.appendixList;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                ((PDPAppendix) LIZIZ2.next()).writeToParcel(out, i);
            }
        }
        PDPShippingModuleMeta pDPShippingModuleMeta = this.meta;
        if (pDPShippingModuleMeta == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pDPShippingModuleMeta.writeToParcel(out, i);
        }
    }

    public PDPShippingModule(String str, Icon icon, LinkRichText linkRichText, Icon icon2, LogisticPromotion logisticPromotion, List<LinkRichText> list, Icon icon3, Icon icon4, PDPLogisticAddressInfo pDPLogisticAddressInfo, List<PDPAppendix> list2, PDPShippingModuleMeta pDPShippingModuleMeta) {
        this.title = str;
        this.titleIcon = icon;
        this.leadMsg = linkRichText;
        this.icon = icon2;
        this.promotion = logisticPromotion;
        this.descriptionList = list;
        this.descriptionListIcon = icon3;
        this.descriptionListArrow = icon4;
        this.logisticAddressInfo = pDPLogisticAddressInfo;
        this.appendixList = list2;
        this.meta = pDPShippingModuleMeta;
    }

    public /* synthetic */ PDPShippingModule(String str, Icon icon, LinkRichText linkRichText, Icon icon2, LogisticPromotion logisticPromotion, List list, Icon icon3, Icon icon4, PDPLogisticAddressInfo pDPLogisticAddressInfo, List list2, PDPShippingModuleMeta pDPShippingModuleMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : icon, (i & 4) != 0 ? null : linkRichText, (i & 8) != 0 ? null : icon2, (i & 16) != 0 ? null : logisticPromotion, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : icon3, (i & 128) != 0 ? null : icon4, (i & 256) != 0 ? null : pDPLogisticAddressInfo, (i & 512) != 0 ? null : list2, (i & 1024) == 0 ? pDPShippingModuleMeta : null);
    }
}
