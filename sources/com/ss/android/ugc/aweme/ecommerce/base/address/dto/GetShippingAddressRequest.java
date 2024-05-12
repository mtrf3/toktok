package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class GetShippingAddressRequest {

    @InterfaceC65349Pkn("change_addr_order_id")
    public final String changeAddrOrderId;

    @InterfaceC65349Pkn("change_addr_order_type")
    public final Integer changeAddrOrderType;

    @InterfaceC65349Pkn("from_incentive")
    public final Boolean fromIncentive;

    @InterfaceC65349Pkn("incentive_record_id")
    public final String incentiveRecordId;

    @InterfaceC65349Pkn("order_skus")
    public final List<AddressSku> orderSkus;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;

    @InterfaceC65349Pkn("scene_params_str")
    public final String sceneParamsStr;

    public GetShippingAddressRequest(Integer num, String str, Boolean bool, String str2, List<AddressSku> list, Integer num2, String str3) {
        this.changeAddrOrderType = num;
        this.changeAddrOrderId = str;
        this.fromIncentive = bool;
        this.incentiveRecordId = str2;
        this.orderSkus = list;
        this.scene = num2;
        this.sceneParamsStr = str3;
    }

    public /* synthetic */ GetShippingAddressRequest(Integer num, String str, Boolean bool, String str2, List list, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str3 : null);
    }
}
