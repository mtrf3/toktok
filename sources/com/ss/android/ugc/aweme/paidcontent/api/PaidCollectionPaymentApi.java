package com.ss.android.ugc.aweme.paidcontent.api;

import X.AbstractC73672Svk;
import X.E4T;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.model.PaidCollectionPaymentResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionRefundResponse;

/* loaded from: classes5.dex */
public final class PaidCollectionPaymentApi {
    public static CreateOrderApi LIZ;
    public static SubmitRefundApi LIZIZ;

    /* loaded from: classes5.dex */
    public interface CreateOrderApi {
        @E4T("/tiktok/v1/paid_content/product/create_order")
        AbstractC73672Svk<PaidCollectionPaymentResponse> createOrder(@InterfaceC64986Pew("business_type") int i, @InterfaceC64986Pew("product_id") long j, @InterfaceC64986Pew("entry_source") int i2, @InterfaceC64986Pew("voucher_id") Long l);
    }

    /* loaded from: classes5.dex */
    public interface SubmitRefundApi {
        @E4T("/tiktok/v1/paid_content/product/refund")
        AbstractC73672Svk<PaidCollectionRefundResponse> submitRefund(@InterfaceC64986Pew("business_type") int i, @InterfaceC64986Pew("product_id") long j, @InterfaceC64986Pew("order_id") String str, @InterfaceC64986Pew("refund_reason_enum") int i2, @InterfaceC64986Pew("refund_reason") String str2);
    }
}
