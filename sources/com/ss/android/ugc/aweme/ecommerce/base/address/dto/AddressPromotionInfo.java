package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddressPromotionInfo {

    @InterfaceC65349Pkn("address_promotion_button")
    public final List<Object> addressPromotionButton;

    @InterfaceC65349Pkn("address_promotion_deadline")
    public final AddressPromotionDeadline addressPromotionDeadline;

    @InterfaceC65349Pkn("address_promotion_type")
    public final Integer addressPromotionType;

    @InterfaceC65349Pkn("address_voucher")
    public final AddressVoucherInfo addressVoucher;

    @InterfaceC65349Pkn("address_voucher_type")
    public final Integer addressVoucherType;

    @InterfaceC65349Pkn("content")
    public final BottomNotice content;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressPromotionInfo)) {
            return false;
        }
        AddressPromotionInfo addressPromotionInfo = (AddressPromotionInfo) obj;
        return o.LJ(this.addressPromotionType, addressPromotionInfo.addressPromotionType) && o.LJ(this.title, addressPromotionInfo.title) && o.LJ(this.content, addressPromotionInfo.content) && o.LJ(this.addressVoucher, addressPromotionInfo.addressVoucher) && o.LJ(this.addressVoucherType, addressPromotionInfo.addressVoucherType) && o.LJ(this.addressPromotionButton, addressPromotionInfo.addressPromotionButton) && o.LJ(this.addressPromotionDeadline, addressPromotionInfo.addressPromotionDeadline);
    }

    public final int hashCode() {
        Integer num = this.addressPromotionType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BottomNotice bottomNotice = this.content;
        int hashCode3 = (hashCode2 + (bottomNotice == null ? 0 : bottomNotice.hashCode())) * 31;
        AddressVoucherInfo addressVoucherInfo = this.addressVoucher;
        int hashCode4 = (hashCode3 + (addressVoucherInfo == null ? 0 : addressVoucherInfo.hashCode())) * 31;
        Integer num2 = this.addressVoucherType;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Object> list = this.addressPromotionButton;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        AddressPromotionDeadline addressPromotionDeadline = this.addressPromotionDeadline;
        return hashCode6 + (addressPromotionDeadline != null ? addressPromotionDeadline.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddressPromotionInfo(addressPromotionType=");
        LIZ.append(this.addressPromotionType);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", addressVoucher=");
        LIZ.append(this.addressVoucher);
        LIZ.append(", addressVoucherType=");
        LIZ.append(this.addressVoucherType);
        LIZ.append(", addressPromotionButton=");
        LIZ.append(this.addressPromotionButton);
        LIZ.append(", addressPromotionDeadline=");
        LIZ.append(this.addressPromotionDeadline);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public AddressPromotionInfo(Integer num, String str, BottomNotice bottomNotice, AddressVoucherInfo addressVoucherInfo, Integer num2, List<Object> list, AddressPromotionDeadline addressPromotionDeadline) {
        this.addressPromotionType = num;
        this.title = str;
        this.content = bottomNotice;
        this.addressVoucher = addressVoucherInfo;
        this.addressVoucherType = num2;
        this.addressPromotionButton = list;
        this.addressPromotionDeadline = addressPromotionDeadline;
    }
}
