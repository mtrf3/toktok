package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C26935Ahf;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingTOAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DeliveryData implements Parcelable {
    public static final Parcelable.Creator<DeliveryData> CREATOR = new C26935Ahf();

    @InterfaceC65349Pkn("shipping_address_list")
    public final List<ReachableAddress> addresses;

    @InterfaceC65349Pkn("change_location_data")
    public final ChangeLocationData changeLocationData;

    @InterfaceC65349Pkn("dispatch_from")
    public final DispatchFrom dispatchFrom;

    @InterfaceC65349Pkn("dispatch_to")
    public final DispatchTo dispatchTo;

    @InterfaceC65349Pkn("exception_ux")
    public final ExceptionUX exceptionUX;

    @InterfaceC65349Pkn("logistics")
    public final List<LogisticDTO> logistics;

    @InterfaceC65349Pkn("pdp_logistics_express")
    public final List<LogisticDTO> pdpLogisticExpress;

    @InterfaceC65349Pkn("pdp_logistic_module")
    public final PDPLogisticModule pdpLogisticModule;

    @InterfaceC65349Pkn("pre_order_info")
    public final PreOrderInfo preOrderInfo;

    @InterfaceC65349Pkn("shipping_right_list")
    public final List<LogisticLinkRichText> shippingRightsList;

    @InterfaceC65349Pkn("shipping_to_address_info")
    public final ShippingTOAddressInfo shippingToAddressInfo;

    @InterfaceC65349Pkn("show_voucher")
    public final Voucher showVoucher;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public DeliveryData() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.logistics = c61878OQg;
        this.addresses = c61878OQg;
    }
}
