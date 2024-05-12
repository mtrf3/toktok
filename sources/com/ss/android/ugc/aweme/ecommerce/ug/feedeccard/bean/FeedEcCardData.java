package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.C67722lE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedEcCardData {

    @InterfaceC65349Pkn("card_bgm_url")
    public final String cardBgmUrl;
    public FeedEcCardConfig cardConfig;

    @InterfaceC65349Pkn("card_config")
    public final String cardConfigJson;
    public FeedEcCardStyle cardStyle;

    @InterfaceC65349Pkn("card_style")
    public final String cardStyleJson;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedEcCardData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeedEcCardData copy$default(FeedEcCardData feedEcCardData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedEcCardData.cardConfigJson;
        }
        if ((i & 2) != 0) {
            str2 = feedEcCardData.cardStyleJson;
        }
        if ((i & 4) != 0) {
            str3 = feedEcCardData.cardBgmUrl;
        }
        return feedEcCardData.copy(str, str2, str3);
    }

    public final FeedEcCardData copy(String str, String str2, String str3) {
        return new FeedEcCardData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardData)) {
            return false;
        }
        FeedEcCardData feedEcCardData = (FeedEcCardData) obj;
        return o.LJ(this.cardConfigJson, feedEcCardData.cardConfigJson) && o.LJ(this.cardStyleJson, feedEcCardData.cardStyleJson) && o.LJ(this.cardBgmUrl, feedEcCardData.cardBgmUrl);
    }

    public int hashCode() {
        String str = this.cardConfigJson;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardStyleJson;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardBgmUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void parseInternalData() {
        this.cardConfig = (FeedEcCardConfig) C67722lE.LIZ(FeedEcCardConfig.class, this.cardConfigJson);
        this.cardStyle = (FeedEcCardStyle) C67722lE.LIZ(FeedEcCardStyle.class, this.cardStyleJson);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedEcCardData(cardConfigJson=");
        LIZ.append(this.cardConfigJson);
        LIZ.append(", cardStyleJson=");
        LIZ.append(this.cardStyleJson);
        LIZ.append(", cardBgmUrl=");
        return q.LIZIZ(LIZ, this.cardBgmUrl, ')', LIZ);
    }

    public final String getCardBgmUrl() {
        return this.cardBgmUrl;
    }

    public final FeedEcCardConfig getCardConfig() {
        return this.cardConfig;
    }

    public final String getCardConfigJson() {
        return this.cardConfigJson;
    }

    public final FeedEcCardStyle getCardStyle() {
        return this.cardStyle;
    }

    public final String getCardStyleJson() {
        return this.cardStyleJson;
    }

    public FeedEcCardData(String str, String str2, String str3) {
        this.cardConfigJson = str;
        this.cardStyleJson = str2;
        this.cardBgmUrl = str3;
    }

    public /* synthetic */ FeedEcCardData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
