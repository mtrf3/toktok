package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.AbstractC72932td;
import X.C33X;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FragmentDataInfo {
    public final MallRacunContentInfo contentInfo;
    public final Integer currentTab;
    public final List<MallFeed> initFeedList;
    public final AbstractC72932td<MallRacunResponse> racunDataResp;
    public final String requestId;
    public final MallRacunSkyLight skyLight;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentDataInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FragmentDataInfo copy$default(FragmentDataInfo fragmentDataInfo, Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, List list, String str, AbstractC72932td abstractC72932td, int i, Object obj) {
        if ((i & 1) != 0) {
            num = fragmentDataInfo.currentTab;
        }
        if ((i & 2) != 0) {
            mallRacunSkyLight = fragmentDataInfo.skyLight;
        }
        if ((i & 4) != 0) {
            mallRacunContentInfo = fragmentDataInfo.contentInfo;
        }
        if ((i & 8) != 0) {
            list = fragmentDataInfo.initFeedList;
        }
        if ((i & 16) != 0) {
            str = fragmentDataInfo.requestId;
        }
        if ((i & 32) != 0) {
            abstractC72932td = fragmentDataInfo.racunDataResp;
        }
        return fragmentDataInfo.copy(num, mallRacunSkyLight, mallRacunContentInfo, list, str, abstractC72932td);
    }

    public final FragmentDataInfo copy(Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, List<MallFeed> list, String str, AbstractC72932td<MallRacunResponse> racunDataResp) {
        o.LJIIIZ(racunDataResp, "racunDataResp");
        return new FragmentDataInfo(num, mallRacunSkyLight, mallRacunContentInfo, list, str, racunDataResp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentDataInfo)) {
            return false;
        }
        FragmentDataInfo fragmentDataInfo = (FragmentDataInfo) obj;
        return o.LJ(this.currentTab, fragmentDataInfo.currentTab) && o.LJ(this.skyLight, fragmentDataInfo.skyLight) && o.LJ(this.contentInfo, fragmentDataInfo.contentInfo) && o.LJ(this.initFeedList, fragmentDataInfo.initFeedList) && o.LJ(this.requestId, fragmentDataInfo.requestId) && o.LJ(this.racunDataResp, fragmentDataInfo.racunDataResp);
    }

    public int hashCode() {
        Integer num = this.currentTab;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MallRacunSkyLight mallRacunSkyLight = this.skyLight;
        int hashCode2 = (hashCode + (mallRacunSkyLight == null ? 0 : mallRacunSkyLight.hashCode())) * 31;
        MallRacunContentInfo mallRacunContentInfo = this.contentInfo;
        int hashCode3 = (hashCode2 + (mallRacunContentInfo == null ? 0 : mallRacunContentInfo.hashCode())) * 31;
        List<MallFeed> list = this.initFeedList;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.requestId;
        return this.racunDataResp.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FragmentDataInfo(currentTab=");
        LIZ.append(this.currentTab);
        LIZ.append(", skyLight=");
        LIZ.append(this.skyLight);
        LIZ.append(", contentInfo=");
        LIZ.append(this.contentInfo);
        LIZ.append(", initFeedList=");
        LIZ.append(this.initFeedList);
        LIZ.append(", requestId=");
        LIZ.append(this.requestId);
        LIZ.append(", racunDataResp=");
        LIZ.append(this.racunDataResp);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final MallRacunContentInfo getContentInfo() {
        return this.contentInfo;
    }

    public final Integer getCurrentTab() {
        return this.currentTab;
    }

    public final List<MallFeed> getInitFeedList() {
        return this.initFeedList;
    }

    public final AbstractC72932td<MallRacunResponse> getRacunDataResp() {
        return this.racunDataResp;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final MallRacunSkyLight getSkyLight() {
        return this.skyLight;
    }

    public FragmentDataInfo(Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, List<MallFeed> list, String str, AbstractC72932td<MallRacunResponse> racunDataResp) {
        o.LJIIIZ(racunDataResp, "racunDataResp");
        this.currentTab = num;
        this.skyLight = mallRacunSkyLight;
        this.contentInfo = mallRacunContentInfo;
        this.initFeedList = list;
        this.requestId = str;
        this.racunDataResp = racunDataResp;
    }

    public /* synthetic */ FragmentDataInfo(Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, List list, String str, AbstractC72932td abstractC72932td, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : mallRacunSkyLight, (i & 4) != 0 ? null : mallRacunContentInfo, (i & 8) != 0 ? null : list, (i & 16) == 0 ? str : null, (i & 32) != 0 ? C33X.LIZ : abstractC72932td);
    }
}
