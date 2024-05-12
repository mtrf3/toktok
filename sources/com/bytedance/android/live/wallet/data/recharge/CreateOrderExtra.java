package com.bytedance.android.live.wallet.data.recharge;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;

/* loaded from: classes14.dex */
public final class CreateOrderExtra extends Extra {

    @InterfaceC65349Pkn("custom_error")
    public final CustomErrorExtra customError;

    @InterfaceC65349Pkn("iap_fail_extra")
    public IapFailExtra iapFailExtra;

    @InterfaceC65349Pkn("is_webapp_recharge_redirect_enabled")
    public boolean isWebappRechargeRedirectEnabled;
}
