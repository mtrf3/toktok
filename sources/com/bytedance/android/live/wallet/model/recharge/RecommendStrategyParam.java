package com.bytedance.android.live.wallet.model.recharge;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;

/* loaded from: classes14.dex */
public final class RecommendStrategyParam {

    @InterfaceC65349Pkn("coins_gap")
    public long coinsGap;

    @InterfaceC65349Pkn("gift_ids")
    public List<Long> giftIds;

    @InterfaceC65349Pkn("gift_total_coins")
    public long giftTotalCoins;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("charge_reason")
    public String chargeReason = "";
}
