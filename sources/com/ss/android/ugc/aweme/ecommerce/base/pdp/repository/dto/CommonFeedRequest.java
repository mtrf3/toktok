package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C07670Rv;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CommonFeedRequest {

    @InterfaceC65349Pkn("context_product_info_list")
    public final List<ContextProductInfo> contextProductInfoList;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("enter_from_info")
    public final String enterFromInfo;

    @InterfaceC65349Pkn("enter_from_merge")
    public final String enterFromMerge;

    @InterfaceC65349Pkn("first_source_page")
    public final String firstSourcePage;

    @InterfaceC65349Pkn("page_name")
    public final String pageName;

    @InterfaceC65349Pkn("previous_page")
    public final String previousPage;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("size")
    public final int size;

    @InterfaceC65349Pkn("traffic_source")
    public final Integer trafficSource;

    @InterfaceC65349Pkn("traffic_source_list")
    public final List<Integer> trafficSourceList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommonFeedRequest() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedRequest.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedRequest)) {
            return false;
        }
        CommonFeedRequest commonFeedRequest = (CommonFeedRequest) obj;
        return o.LJ(this.scene, commonFeedRequest.scene) && this.size == commonFeedRequest.size && this.cursor == commonFeedRequest.cursor && o.LJ(this.contextProductInfoList, commonFeedRequest.contextProductInfoList) && o.LJ(this.firstSourcePage, commonFeedRequest.firstSourcePage) && o.LJ(this.enterFromInfo, commonFeedRequest.enterFromInfo) && o.LJ(this.trafficSource, commonFeedRequest.trafficSource) && o.LJ(this.trafficSourceList, commonFeedRequest.trafficSourceList) && o.LJ(this.enterFrom, commonFeedRequest.enterFrom) && o.LJ(this.enterFromMerge, commonFeedRequest.enterFromMerge) && o.LJ(this.previousPage, commonFeedRequest.previousPage) && o.LJ(this.pageName, commonFeedRequest.pageName);
    }

    public final int hashCode() {
        String str = this.scene;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.size) * 31) + this.cursor) * 31;
        List<ContextProductInfo> list = this.contextProductInfoList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.firstSourcePage;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterFromInfo;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.trafficSource;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<Integer> list2 = this.trafficSourceList;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.enterFrom;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.enterFromMerge;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previousPage;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.pageName;
        return hashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonFeedRequest(scene=");
        sb.append(this.scene);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", cursor=");
        sb.append(this.cursor);
        sb.append(", contextProductInfoList=");
        sb.append(this.contextProductInfoList);
        sb.append(", firstSourcePage=");
        sb.append(this.firstSourcePage);
        sb.append(", enterFromInfo=");
        sb.append(this.enterFromInfo);
        sb.append(", trafficSource=");
        sb.append(this.trafficSource);
        sb.append(", trafficSourceList=");
        sb.append(this.trafficSourceList);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", enterFromMerge=");
        sb.append(this.enterFromMerge);
        sb.append(", previousPage=");
        sb.append(this.previousPage);
        sb.append(", pageName=");
        return C07670Rv.LIZIZ(sb, this.pageName, ')');
    }

    public CommonFeedRequest(String str, int i, int i2, List<ContextProductInfo> list, String str2, String str3, Integer num, List<Integer> list2, String str4, String str5, String str6, String str7) {
        this.scene = str;
        this.size = i;
        this.cursor = i2;
        this.contextProductInfoList = list;
        this.firstSourcePage = str2;
        this.enterFromInfo = str3;
        this.trafficSource = num;
        this.trafficSourceList = list2;
        this.enterFrom = str4;
        this.enterFromMerge = str5;
        this.previousPage = str6;
        this.pageName = str7;
    }

    public /* synthetic */ CommonFeedRequest(String str, int i, int i2, List list, String str2, String str3, Integer num, List list2, String str4, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 10 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? null : str4, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : str6, (i3 & 2048) == 0 ? str7 : null);
    }
}
