package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GiftSettings extends F9E {

    @InterfaceC65349Pkn("enable_video_gift")
    public final boolean enableVideoGift;

    @InterfaceC65349Pkn("auto_select_gift_after_recharge")
    public final boolean isSendGiftAfterRechargeEnabled;

    @InterfaceC65349Pkn("privacy_url")
    public final PrivacyUrls privacyUrls;

    @InterfaceC65349Pkn("promotion_url")
    public final String promotionUrl;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.promotionUrl, Boolean.valueOf(this.enableVideoGift), this.privacyUrls, Boolean.valueOf(this.isSendGiftAfterRechargeEnabled)};
    }

    public GiftSettings(String promotionUrl, boolean z, PrivacyUrls privacyUrls, boolean z2) {
        o.LJIIIZ(promotionUrl, "promotionUrl");
        o.LJIIIZ(privacyUrls, "privacyUrls");
        this.promotionUrl = promotionUrl;
        this.enableVideoGift = z;
        this.privacyUrls = privacyUrls;
        this.isSendGiftAfterRechargeEnabled = z2;
    }
}
