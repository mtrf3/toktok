package com.ss.android.ugc.profile.platform.business.popup;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaidContentBannerInfo implements Serializable {

    @InterfaceC65349Pkn("campaign_list")
    public final List<PaidContentBannerSingleCampaign> campaignList;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentBannerInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaidContentBannerInfo copy$default(PaidContentBannerInfo paidContentBannerInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paidContentBannerInfo.campaignList;
        }
        return paidContentBannerInfo.copy(list);
    }

    public final PaidContentBannerInfo copy(List<PaidContentBannerSingleCampaign> list) {
        return new PaidContentBannerInfo(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaidContentBannerInfo) && o.LJ(this.campaignList, ((PaidContentBannerInfo) obj).campaignList);
    }

    public int hashCode() {
        List<PaidContentBannerSingleCampaign> list = this.campaignList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentBannerInfo(campaignList=");
        return C1NE.LIZIZ(LIZ, this.campaignList, ')', LIZ);
    }

    public final List<PaidContentBannerSingleCampaign> getCampaignList() {
        return this.campaignList;
    }

    public PaidContentBannerInfo(List<PaidContentBannerSingleCampaign> list) {
        this.campaignList = list;
    }

    public /* synthetic */ PaidContentBannerInfo(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
