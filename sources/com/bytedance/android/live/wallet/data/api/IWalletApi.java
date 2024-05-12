package com.bytedance.android.live.wallet.data.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.data.model.wallet.WalletInfoExtra;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.ExchangeDisplayInfo;
import com.bytedance.android.live.wallet.model.WalletStruct;
import tikcast.api.wallet.tiktok.GetTotalBalanceResponse;

/* loaded from: classes6.dex */
public interface IWalletApi {
    @E8L("/luckycat/tiktokm/v1/user/balance/get")
    AbstractC73672Svk<C28467BFf<BalanceStruct>> getBalanceInfo(@InterfaceC64986Pew("scene") int i);

    @E8L("/webcast/wallet_api_tiktok/exchange_info")
    AbstractC73672Svk<C28467BFf<ExchangeDisplayInfo>> getExchangeInfo();

    @E8L("/webcast/wallet_api/get_total_balance")
    AbstractC73672Svk<GetTotalBalanceResponse> getTotalExchangeableBalance();

    @E8L("/webcast/wallet_api_tiktok/wallet/info/")
    AbstractC73672Svk<BaseResponse<WalletStruct, WalletInfoExtra>> getWalletInfoNew();
}
