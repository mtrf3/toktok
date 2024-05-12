package com.bytedance.android.live.wallet.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195727mC;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.CheckSubOrderResultStruct;
import com.bytedance.android.live.wallet.model.CreateSubOrderResult;
import com.bytedance.android.live.wallet.model.ExchangeExtra;
import com.bytedance.android.live.wallet.model.FeedBackList;
import com.bytedance.android.live.wallet.model.TaxInfoResult;
import com.bytedance.android.live.wallet.model.UgEmailConsentResult;
import com.bytedance.android.livesdk.firstrecharge.FirstChargeData;
import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.Map;

/* loaded from: classes14.dex */
public interface IapApi {
    @E8L("/webcast/sub/contract/status/")
    AbstractC73672Svk<C28467BFf<CheckSubOrderResultStruct>> checkSubOrder(@InterfaceC64986Pew("to_uid") String str, @InterfaceC64986Pew("contract_id") String str2);

    @E8M("/webcast/wallet_api/diamond_exchange/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<Object, ExchangeExtra>> exchangeCoins(@InterfaceC64985Pev("diamond_id") int i, @InterfaceC64985Pev("way") int i2, @InterfaceC64985Pev("currency") String str, @InterfaceC64985Pev("source") int i3, @InterfaceC64985Pev("coins_count") long j, @InterfaceC64985Pev("local_amount") long j2, @InterfaceC64985Pev("currency_dot") long j3, @InterfaceC64985Pev("skip_kyc_reminder") boolean z, @InterfaceC64985Pev("penalty_warning_skip") String str2, @InterfaceC64985Pev("is_first_recharge") boolean z2, @InterfaceC64985Pev("show_exchange_tooltip") boolean z3, @InterfaceC64985Pev("show_exchange_amount_adjusted_text") boolean z4, @InterfaceC64985Pev("exchange_input_option") int i4);

    @E8M("/webcast/recharge/base_package/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<BalanceStructExtra>> getExchangeRatio(@InterfaceC64985Pev("currency") String str, @InterfaceC64985Pev("package_region") String str2, @InterfaceC64985Pev("type") long j, @InterfaceC64985Pev("balance") long j2, @InterfaceC64985Pev("real_dot") int i);

    @E8L("/webcast/wallet_api_tiktok/feedback/list")
    AbstractC73672Svk<C28467BFf<FeedBackList>> getFeedBackList(@InterfaceC64986Pew("feedback_type") int i, @InterfaceC64986Pew("entrance") int i2);

    @E8L("/webcast/wallet_api_tiktok/notifycenter/notices")
    AbstractC73672Svk<C28467BFf<NoticesResult.Data>> getNotifications(@InterfaceC64986Pew("view_name") String str);

    @E8M("/webcast/wallet_api_tiktok/income_plus/tax/get_tax/")
    AbstractC73672Svk<C28467BFf<TaxInfoResult>> getTaxInfo(@InterfaceC195727mC Map map);

    @E8L("/money/tax/api/v1/user/tax")
    AbstractC73672Svk<TaxInfoResult> getTaxInfoV2(@InterfaceC64986Pew("tax_type") String str, @InterfaceC64986Pew("UserId") int i);

    @E8L("/edm/user/properties/")
    AbstractC73672Svk<C28467BFf<UgEmailConsentResult>> getUgEmailConsent();

    @E8M("/webcast/sub/contract/create/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<CreateSubOrderResult>> subscribeOrder(@InterfaceC64985Pev("to_uid") String str, @InterfaceC64985Pev("tpl_id") String str2, @InterfaceC64985Pev("sku_name") String str3, @InterfaceC64985Pev("device_tz") String str4, @InterfaceC64985Pev("offer_id") String str5, @InterfaceC64985Pev("offer_token") String str6, @InterfaceC36229EJt Map<String, Object> map);

    @E8M("/webcast/diamond/first_charge/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<FirstChargeData>> syncFirstRechargeInfo(@InterfaceC64985Pev("live_id") long j, @InterfaceC64985Pev("currency") String str);

    @E8M("/webcast/wallet_api_tiktok/auto_exchange/")
    AbstractC73672Svk<C28467BFf<AutoExchangeData>> updateAutoExchange(@InterfaceC64986Pew("auto_exchange") boolean z, @InterfaceC64986Pew("type") int i);
}
