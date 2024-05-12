package com.bytedance.android.live.wallet.data.api;

import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195727mC;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.exchange.DefaultLocationData;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeThresholdInfoData;
import com.bytedance.android.live.wallet.data.model.exchange.ExchangeUpdateAddressRequest;
import com.bytedance.android.live.wallet.data.model.exchange.UpdateBillingAddressData;
import defpackage.BaseCustomErrorExtra;

/* loaded from: classes14.dex */
public interface IExchangeApi {
    @E8L("/webcast/wallet_api/exchange_kyc/")
    AbstractC73672Svk<BaseResponse<Object, BaseCustomErrorExtra>> checkExchangeKyc(@InterfaceC64986Pew("source") int i);

    @E8L("/webcast/wallet_api_tiktok/get_default_location")
    AbstractC73638SvC<C28467BFf<DefaultLocationData>> getDefaultLocation();

    @E8L("/webcast/wallet_api_tiktok/get_exchange_threshold_info")
    AbstractC73638SvC<C28467BFf<ExchangeThresholdInfoData>> getExchangeThresholdInfo(@InterfaceC64986Pew("source") int i, @InterfaceC64986Pew("diamond_id") int i2, @InterfaceC64986Pew("way") int i3, @InterfaceC64986Pew("currency") String str, @InterfaceC64986Pew("pay_source") int i4, @InterfaceC64986Pew("coins_count") long j, @InterfaceC64986Pew("local_amount") long j2, @InterfaceC64986Pew("currency_dot") long j3, @InterfaceC64986Pew("is_auto_exchange") boolean z, @InterfaceC64986Pew("is_auto_exchange_enable") boolean z2);

    @E8M("/webcast/wallet_api_tiktok/update_billing_address")
    AbstractC73672Svk<C28467BFf<UpdateBillingAddressData>> updateBillingAddress(@InterfaceC195727mC ExchangeUpdateAddressRequest exchangeUpdateAddressRequest);
}
