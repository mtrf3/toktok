package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class AdFeSettings {

    @InterfaceC65349Pkn("legal_page")
    public String legalPage;

    @InterfaceC65349Pkn("music_legal")
    public String musicLegal;

    @InterfaceC65349Pkn("revenue_share")
    public RevenueShare revenueShare;

    public String getLegalPage() {
        String str = this.legalPage;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getMusicLegalPage() {
        String str = this.musicLegal;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public RevenueShare getRevenueShare() {
        RevenueShare revenueShare = this.revenueShare;
        if (revenueShare != null) {
            return revenueShare;
        }
        throw new C158056If();
    }
}
