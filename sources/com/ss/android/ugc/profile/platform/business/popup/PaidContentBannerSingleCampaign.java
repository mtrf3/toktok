package com.ss.android.ugc.profile.platform.business.popup;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentBannerSingleCampaign extends F9E implements Serializable {

    @InterfaceC65349Pkn("campaign_id")
    public final String campaignId;

    @InterfaceC65349Pkn("cta_text")
    public final String ctaText;

    @InterfaceC65349Pkn("duration")
    public final int duration;

    @InterfaceC65349Pkn("message_text")
    public final String messageText;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentBannerSingleCampaign() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaidContentBannerSingleCampaign copy$default(PaidContentBannerSingleCampaign paidContentBannerSingleCampaign, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paidContentBannerSingleCampaign.campaignId;
        }
        if ((i2 & 2) != 0) {
            str2 = paidContentBannerSingleCampaign.messageText;
        }
        if ((i2 & 4) != 0) {
            str3 = paidContentBannerSingleCampaign.ctaText;
        }
        if ((i2 & 8) != 0) {
            str4 = paidContentBannerSingleCampaign.schema;
        }
        if ((i2 & 16) != 0) {
            i = paidContentBannerSingleCampaign.duration;
        }
        return paidContentBannerSingleCampaign.copy(str, str2, str3, str4, i);
    }

    public final PaidContentBannerSingleCampaign copy(String campaignId, String messageText, String ctaText, String schema, int i) {
        o.LJIIIZ(campaignId, "campaignId");
        o.LJIIIZ(messageText, "messageText");
        o.LJIIIZ(ctaText, "ctaText");
        o.LJIIIZ(schema, "schema");
        return new PaidContentBannerSingleCampaign(campaignId, messageText, ctaText, schema, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.campaignId, this.messageText, this.ctaText, this.schema, Integer.valueOf(this.duration)};
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final String getSchema() {
        return this.schema;
    }

    public PaidContentBannerSingleCampaign(String str, String str2, String str3, String str4, int i) {
        C43588H8u.LIZLLL(str, "campaignId", str2, "messageText", str3, "ctaText", str4, "schema");
        this.campaignId = str;
        this.messageText = str2;
        this.ctaText = str3;
        this.schema = str4;
        this.duration = i;
    }

    public /* synthetic */ PaidContentBannerSingleCampaign(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 3 : i);
    }
}
