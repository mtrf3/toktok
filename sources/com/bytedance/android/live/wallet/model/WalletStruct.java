package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class WalletStruct {
    public BalanceStructExtra LIZ;

    @InterfaceC65349Pkn("auto_exchange")
    public boolean autoExchange;

    @InterfaceC65349Pkn("auto_exchange_enable")
    public boolean autoExchangeEnable;

    @InterfaceC65349Pkn("auto_exchange_map")
    public HashMap<String, Boolean> autoExchangeMap = new HashMap<>();

    @InterfaceC65349Pkn("diamond")
    public long diamond;

    @InterfaceC65349Pkn("is_periodic_payout")
    public boolean isPeriodicPayout;

    @InterfaceC65349Pkn("exchange")
    public RevenueExchange revenue;

    @InterfaceC65349Pkn("vip_only_recharge_channel_status")
    public int vipOnlyRechargeChannelStatus;

    public final Boolean LIZ() {
        return Boolean.valueOf(this.autoExchangeEnable);
    }

    public final boolean LIZIZ() {
        Boolean bool;
        HashMap<String, Boolean> hashMap = this.autoExchangeMap;
        if (hashMap == null || !this.autoExchangeEnable || (bool = hashMap.get("LIVE")) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean LIZJ() {
        Boolean bool;
        HashMap<String, Boolean> hashMap = this.autoExchangeMap;
        if (hashMap == null || (bool = hashMap.get("UG")) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
