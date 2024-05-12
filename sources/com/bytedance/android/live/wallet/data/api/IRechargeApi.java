package com.bytedance.android.live.wallet.data.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.recharge.CreateOrderExtra;
import com.bytedance.android.live.wallet.model.DiamondBuyResult;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import tikcast.api.wallet.tiktok.QueryOrderResult;
import tikcast.api.wallet.tiktok.UnlockVoucherParams;
import tikcast.api.wallet.tiktok.UnlockVoucherResult;

/* loaded from: classes14.dex */
public interface IRechargeApi {
    @E8L("/webcast/wallet_api/query_order/")
    AbstractC73672Svk<QueryOrderResult> checkOrderResult(@InterfaceC64986Pew("order_id") String str);

    @E8M("/webcast/wallet_api/diamond_buy/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<DiamondBuyResult, CreateOrderExtra>> createAmazonOrder(@InterfaceC64985Pev("way") int i, @InterfaceC64985Pev("diamond_id") int i2, @InterfaceC64985Pev("currency") String str, @InterfaceC64985Pev("price_amount_micros") long j, @InterfaceC64985Pev("iap_country_code") String str2, @InterfaceC64985Pev("amazon_id") String str3, @InterfaceC64985Pev("source") int i3, @InterfaceC64985Pev("order_id") String str4, @InterfaceC64985Pev("trade_type") int i4, @InterfaceC64985Pev("business_type") int i5, @InterfaceC64985Pev("skip_kyc_reminder") boolean z, @InterfaceC64985Pev("penalty_warning_skip") String str5, @InterfaceC64985Pev("voucher_token_list") String str6);

    @E8M("/webcast/wallet_api/diamond_buy/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<DiamondBuyResult, CreateOrderExtra>> createOrder(@InterfaceC64985Pev("way") int i, @InterfaceC64985Pev("diamond_id") int i2, @InterfaceC64985Pev("currency") String str, @InterfaceC64985Pev("price_amount_micros") long j, @InterfaceC64985Pev("first_recharge") boolean z, @InterfaceC64985Pev("source") int i3, @InterfaceC64985Pev("order_id") String str2, @InterfaceC64985Pev("trade_type") int i4, @InterfaceC64985Pev("business_type") int i5, @InterfaceC64985Pev("skip_kyc_reminder") boolean z2, @InterfaceC64985Pev("penalty_warning_skip") String str3, @InterfaceC64985Pev("not_add_giving_count") boolean z3, @InterfaceC64985Pev("voucher_token_list") String str4);

    @E8L("/webcast/diamond/")
    AbstractC73672Svk<BaseListResponse<Diamond, DiamondPackageExtra>> fetchDiamondPackage(@InterfaceC64986Pew("currency") String str, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("type") long j3, @InterfaceC64986Pew("entrance") int i, @InterfaceC64986Pew("fetch_full_packages") boolean z, @InterfaceC64986Pew("recommend_strategy_param") String str2);

    @E8M("/webcast/wallet_api_tiktok/voucher/unlock")
    AbstractC73672Svk<UnlockVoucherResult> unlockVoucher(@InterfaceC195727mC UnlockVoucherParams unlockVoucherParams);
}
