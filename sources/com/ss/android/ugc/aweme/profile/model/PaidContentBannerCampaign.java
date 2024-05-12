package com.ss.android.ugc.aweme.profile.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentBannerCampaign extends F9E implements Serializable {

    @InterfaceC65349Pkn("pc_banner_campaign_id")
    public final String paidContentBannerCampaignId;

    @InterfaceC65349Pkn("pc_banner_duration")
    public final int paidContentBannerDuration;

    @InterfaceC65349Pkn("pc_banner_cta_text")
    public final String paidContentBannerLinkText;

    @InterfaceC65349Pkn("pc_banner_schema")
    public final String paidContentBannerSchema;

    @InterfaceC65349Pkn("pc_banner_message_text")
    public final String paidContentBannerTitleText;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentBannerCampaign() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaidContentBannerCampaign copy$default(PaidContentBannerCampaign paidContentBannerCampaign, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = paidContentBannerCampaign.paidContentBannerCampaignId;
        }
        if ((i2 & 2) != 0) {
            str2 = paidContentBannerCampaign.paidContentBannerTitleText;
        }
        if ((i2 & 4) != 0) {
            str3 = paidContentBannerCampaign.paidContentBannerLinkText;
        }
        if ((i2 & 8) != 0) {
            str4 = paidContentBannerCampaign.paidContentBannerSchema;
        }
        if ((i2 & 16) != 0) {
            i = paidContentBannerCampaign.paidContentBannerDuration;
        }
        return paidContentBannerCampaign.copy(str, str2, str3, str4, i);
    }

    public final PaidContentBannerCampaign copy(String paidContentBannerCampaignId, String paidContentBannerTitleText, String paidContentBannerLinkText, String paidContentBannerSchema, int i) {
        o.LJIIIZ(paidContentBannerCampaignId, "paidContentBannerCampaignId");
        o.LJIIIZ(paidContentBannerTitleText, "paidContentBannerTitleText");
        o.LJIIIZ(paidContentBannerLinkText, "paidContentBannerLinkText");
        o.LJIIIZ(paidContentBannerSchema, "paidContentBannerSchema");
        return new PaidContentBannerCampaign(paidContentBannerCampaignId, paidContentBannerTitleText, paidContentBannerLinkText, paidContentBannerSchema, i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.paidContentBannerCampaignId, this.paidContentBannerTitleText, this.paidContentBannerLinkText, this.paidContentBannerSchema, Integer.valueOf(this.paidContentBannerDuration)};
    }

    public final String getPaidContentBannerCampaignId() {
        return this.paidContentBannerCampaignId;
    }

    public final int getPaidContentBannerDuration() {
        return this.paidContentBannerDuration;
    }

    public final String getPaidContentBannerLinkText() {
        return this.paidContentBannerLinkText;
    }

    public final String getPaidContentBannerSchema() {
        return this.paidContentBannerSchema;
    }

    public final String getPaidContentBannerTitleText() {
        return this.paidContentBannerTitleText;
    }

    public PaidContentBannerCampaign(String str, String str2, String str3, String str4, int i) {
        C43588H8u.LIZLLL(str, "paidContentBannerCampaignId", str2, "paidContentBannerTitleText", str3, "paidContentBannerLinkText", str4, "paidContentBannerSchema");
        this.paidContentBannerCampaignId = str;
        this.paidContentBannerTitleText = str2;
        this.paidContentBannerLinkText = str3;
        this.paidContentBannerSchema = str4;
        this.paidContentBannerDuration = i;
    }

    public /* synthetic */ PaidContentBannerCampaign(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 3 : i);
    }
}
