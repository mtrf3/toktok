package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallRacunResponse extends BaseResponse {

    @InterfaceC65349Pkn("content_info")
    public final MallRacunContentInfo contentInfo;

    @InterfaceC65349Pkn("current_tab")
    public final Integer currentTab;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("sky_light")
    public final MallRacunSkyLight skyLight;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    @InterfaceC65349Pkn("tab_infos")
    public final List<MallRacunTabInfo> tabInfos;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallRacunResponse copy$default(MallRacunResponse mallRacunResponse, List list, Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, Integer num2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mallRacunResponse.tabInfos;
        }
        if ((i & 2) != 0) {
            num = mallRacunResponse.currentTab;
        }
        if ((i & 4) != 0) {
            mallRacunSkyLight = mallRacunResponse.skyLight;
        }
        if ((i & 8) != 0) {
            mallRacunContentInfo = mallRacunResponse.contentInfo;
        }
        if ((i & 16) != 0) {
            num2 = mallRacunResponse.style;
        }
        if ((i & 32) != 0) {
            str = mallRacunResponse.requestId;
        }
        return mallRacunResponse.copy(list, num, mallRacunSkyLight, mallRacunContentInfo, num2, str);
    }

    public final MallRacunResponse copy(List<MallRacunTabInfo> list, Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, Integer num2, String str) {
        return new MallRacunResponse(list, num, mallRacunSkyLight, mallRacunContentInfo, num2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallRacunResponse)) {
            return false;
        }
        MallRacunResponse mallRacunResponse = (MallRacunResponse) obj;
        return o.LJ(this.tabInfos, mallRacunResponse.tabInfos) && o.LJ(this.currentTab, mallRacunResponse.currentTab) && o.LJ(this.skyLight, mallRacunResponse.skyLight) && o.LJ(this.contentInfo, mallRacunResponse.contentInfo) && o.LJ(this.style, mallRacunResponse.style) && o.LJ(this.requestId, mallRacunResponse.requestId);
    }

    public int hashCode() {
        List<MallRacunTabInfo> list = this.tabInfos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.currentTab;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MallRacunSkyLight mallRacunSkyLight = this.skyLight;
        int hashCode3 = (hashCode2 + (mallRacunSkyLight == null ? 0 : mallRacunSkyLight.hashCode())) * 31;
        MallRacunContentInfo mallRacunContentInfo = this.contentInfo;
        int hashCode4 = (hashCode3 + (mallRacunContentInfo == null ? 0 : mallRacunContentInfo.hashCode())) * 31;
        Integer num2 = this.style;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.requestId;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallRacunResponse(tabInfos=");
        LIZ.append(this.tabInfos);
        LIZ.append(", currentTab=");
        LIZ.append(this.currentTab);
        LIZ.append(", skyLight=");
        LIZ.append(this.skyLight);
        LIZ.append(", contentInfo=");
        LIZ.append(this.contentInfo);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.requestId, ')', LIZ);
    }

    public final MallRacunContentInfo getContentInfo() {
        return this.contentInfo;
    }

    public final Integer getCurrentTab() {
        return this.currentTab;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final MallRacunSkyLight getSkyLight() {
        return this.skyLight;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final List<MallRacunTabInfo> getTabInfos() {
        return this.tabInfos;
    }

    public MallRacunResponse(List<MallRacunTabInfo> list, Integer num, MallRacunSkyLight mallRacunSkyLight, MallRacunContentInfo mallRacunContentInfo, Integer num2, String str) {
        this.tabInfos = list;
        this.currentTab = num;
        this.skyLight = mallRacunSkyLight;
        this.contentInfo = mallRacunContentInfo;
        this.style = num2;
        this.requestId = str;
    }
}
