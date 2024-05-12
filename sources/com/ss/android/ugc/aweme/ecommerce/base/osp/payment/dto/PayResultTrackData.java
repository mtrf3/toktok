package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PayResultTrackData {

    @InterfaceC65349Pkn("create_order_time")
    public final Long createOrderTime;

    @InterfaceC65349Pkn("is_create_order")
    public final Integer isCreateOrder;

    @InterfaceC65349Pkn("pay_commute_type")
    public final CommuteType payCommuteType;

    @InterfaceC65349Pkn("pay_order_time")
    public final Long payOrderTime;

    @InterfaceC65349Pkn("pay_request_id")
    public final String payRequestId;

    @InterfaceC65349Pkn("payment_method_id")
    public final String paymentMethodId;

    @InterfaceC65349Pkn("payment_method_name")
    public final String paymentMethodName;

    @InterfaceC65349Pkn("source_page_type")
    public final String sourcePageType;

    @InterfaceC65349Pkn("start_time")
    public final Long startTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayResultTrackData)) {
            return false;
        }
        PayResultTrackData payResultTrackData = (PayResultTrackData) obj;
        return o.LJ(this.payRequestId, payResultTrackData.payRequestId) && o.LJ(this.startTime, payResultTrackData.startTime) && o.LJ(this.createOrderTime, payResultTrackData.createOrderTime) && o.LJ(this.payOrderTime, payResultTrackData.payOrderTime) && o.LJ(this.paymentMethodId, payResultTrackData.paymentMethodId) && o.LJ(this.paymentMethodName, payResultTrackData.paymentMethodName) && o.LJ(this.isCreateOrder, payResultTrackData.isCreateOrder) && o.LJ(this.sourcePageType, payResultTrackData.sourcePageType) && this.payCommuteType == payResultTrackData.payCommuteType;
    }

    public final int hashCode() {
        String str = this.payRequestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.startTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createOrderTime;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.payOrderTime;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.paymentMethodId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.isCreateOrder;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.sourcePageType;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CommuteType commuteType = this.payCommuteType;
        return hashCode8 + (commuteType != null ? commuteType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayResultTrackData(payRequestId=");
        LIZ.append(this.payRequestId);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", createOrderTime=");
        LIZ.append(this.createOrderTime);
        LIZ.append(", payOrderTime=");
        LIZ.append(this.payOrderTime);
        LIZ.append(", paymentMethodId=");
        LIZ.append(this.paymentMethodId);
        LIZ.append(", paymentMethodName=");
        LIZ.append(this.paymentMethodName);
        LIZ.append(", isCreateOrder=");
        LIZ.append(this.isCreateOrder);
        LIZ.append(", sourcePageType=");
        LIZ.append(this.sourcePageType);
        LIZ.append(", payCommuteType=");
        LIZ.append(this.payCommuteType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PayResultTrackData(String str, Long l, Long l2, Long l3, String str2, String str3, Integer num, String str4, CommuteType commuteType) {
        this.payRequestId = str;
        this.startTime = l;
        this.createOrderTime = l2;
        this.payOrderTime = l3;
        this.paymentMethodId = str2;
        this.paymentMethodName = str3;
        this.isCreateOrder = num;
        this.sourcePageType = str4;
        this.payCommuteType = commuteType;
    }
}
