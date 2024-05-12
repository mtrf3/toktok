package com.ss.android.ugc.aweme.profile.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentBannerSetting implements Serializable {

    @InterfaceC65349Pkn("campaign_list")
    public final List<PaidContentBannerCampaign> paidContentBannerCampaignList;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentBannerSetting() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaidContentBannerSetting copy$default(PaidContentBannerSetting paidContentBannerSetting, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paidContentBannerSetting.paidContentBannerCampaignList;
        }
        return paidContentBannerSetting.copy(list);
    }

    public final PaidContentBannerSetting copy(List<PaidContentBannerCampaign> list) {
        return new PaidContentBannerSetting(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidContentBannerSetting) && o.LJ(this.paidContentBannerCampaignList, ((PaidContentBannerSetting) obj).paidContentBannerCampaignList);
    }

    public int hashCode() {
        List<PaidContentBannerCampaign> list = this.paidContentBannerCampaignList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentBannerSetting(paidContentBannerCampaignList=");
        return C1NE.LIZIZ(LIZ, this.paidContentBannerCampaignList, ')', LIZ);
    }

    public final List<PaidContentBannerCampaign> getPaidContentBannerCampaignList() {
        return this.paidContentBannerCampaignList;
    }

    public PaidContentBannerSetting(List<PaidContentBannerCampaign> list) {
        this.paidContentBannerCampaignList = list;
    }

    public /* synthetic */ PaidContentBannerSetting(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
