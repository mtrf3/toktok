package com.ss.android.ugc.aweme.wallet;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;

/* loaded from: classes14.dex */
public class WalletConfig {

    @InterfaceC65349Pkn("page_charge_schema")
    public String pageChargeUrl = "aweme://webview/?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fmain%2Fwallet%2Frecharge%3Fhide_status_bar%3D0%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26hide_nav_bar%3D1%26no_hw%3D1&hide_status_bar=0&flag=%2Fwallet%2Fhome&entry=settings&hide_nav_bar=1&no_hw=1&awe_falcon=sh";

    @InterfaceC65349Pkn("page_index_schema")
    public String pageIndexUrl = "sslocal://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fweb-inapp%2Fwallet-main%2Fbalance%3Fuse_spark%3D1%26__live_platform__%3Dwebcast%26hide_status_bar%3D0%26hide_nav_bar%3D1%26trans_status_bar%3D1%26flag%3D%252Fwallet%252Fhome%26entry%3Dsettings%26no_hw%3D1%26awe_falcon%3Dsh%26loading_bg_color_light%3DFFFFFF%26loading_bg_color_dark%3D121212%26variant%3Dv3&bdhm_bid=tiktok_wallet_inapp_hybrid&bdhm_pid=/web-inapp/wallet-main/balance";

    public final String LIZ() {
        if (TextUtils.isEmpty(this.pageChargeUrl)) {
            return "";
        }
        return this.pageChargeUrl;
    }

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.pageIndexUrl)) {
            return "";
        }
        return this.pageIndexUrl;
    }
}
