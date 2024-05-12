package com.ss.android.ugc.aweme.shoutouts;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ShoutoutSettings {

    @InterfaceC65349Pkn("intro_video_review_time")
    public String introVideoReviewTime;

    @InterfaceC65349Pkn("request_order_limit")
    public int orderLimit;

    @InterfaceC65349Pkn("order_video_review_time")
    public String orderVideoReviewTime;

    @InterfaceC65349Pkn("set_price_url")
    public String setPriceUrl;

    @InterfaceC65349Pkn("wallet_url")
    public String walletUrl;

    public final String LIZ() {
        if (!TextUtils.isEmpty(this.introVideoReviewTime)) {
            String str = this.introVideoReviewTime;
            o.LJI(str);
            return str;
        }
        return "24";
    }

    public final String LIZIZ() {
        if (!TextUtils.isEmpty(this.orderVideoReviewTime)) {
            String str = this.orderVideoReviewTime;
            o.LJI(str);
            return str;
        }
        return "24";
    }

    public final String LIZJ() {
        if (!TextUtils.isEmpty(this.setPriceUrl)) {
            String str = this.setPriceUrl;
            o.LJI(str);
            return str;
        }
        return "https://www.tiktok.com/web-inapp/shoutouts/creator/set-price?__status_bar=true&hide_nav_bar=1&should_full_screen=1";
    }

    public final String LIZLLL() {
        if (!TextUtils.isEmpty(this.walletUrl)) {
            String str = this.walletUrl;
            o.LJI(str);
            return str;
        }
        return "https://www.tiktok.com/web-inapp/income-wallet/tax-flow?business_type=shoutouts&__status_bar=true&hide_nav_bar=1&should_full_screen=1";
    }
}
