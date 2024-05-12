package com.ss.android.ugc.aweme.ecommercelive.common.framework.base;

import X.C07670Rv;
import X.C0JT;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TrackParams {

    @InterfaceC65349Pkn("action_type")
    public String action_type;

    @InterfaceC65349Pkn("ad_id")
    public String ad_id;

    @InterfaceC65349Pkn("anchor_show_type")
    public String anchor_show_type;

    @InterfaceC65349Pkn("author_id")
    public String author_id;

    @InterfaceC65349Pkn("creative_id")
    public String creative_id;

    @InterfaceC65349Pkn("effect_ad_extra")
    public Map<String, String> effect_ad_extra;

    @InterfaceC65349Pkn("enter_from_info")
    public String enter_from_info;

    @InterfaceC65349Pkn("enter_from_merge")
    public String enter_from_merge;

    @InterfaceC65349Pkn("entrance_form")
    public String entrance_form;

    @InterfaceC65349Pkn("follow_status")
    public String follow_status;

    @InterfaceC65349Pkn("is_ad")
    public String is_ad;

    @InterfaceC65349Pkn("list_item_id")
    public String list_item_id;

    @InterfaceC65349Pkn("product_id")
    public String product_id;

    @InterfaceC65349Pkn("product_source")
    public String product_source;

    @InterfaceC65349Pkn("rec_content_id")
    public String rec_content_id;

    @InterfaceC65349Pkn("rec_content_type")
    public String rec_content_type;

    @InterfaceC65349Pkn("rec_session_id")
    public String rec_session_id;

    @InterfaceC65349Pkn("request_id")
    public String request_id;

    @InterfaceC65349Pkn("search_id")
    public String search_id;

    @InterfaceC65349Pkn("search_result_id")
    public String search_result_id;

    @InterfaceC65349Pkn("source")
    public String source;

    @InterfaceC65349Pkn("source_module")
    public String sourceModule;

    @InterfaceC65349Pkn("source_content_id")
    public String source_content_id;

    @InterfaceC65349Pkn("source_from")
    public String source_from;

    @InterfaceC65349Pkn("source_page_type")
    public String source_page_type;

    @InterfaceC65349Pkn("source_previous_page")
    public String source_previous_page;

    @InterfaceC65349Pkn("track_id")
    public String track_id;

    @InterfaceC65349Pkn("traffic_source_list")
    public int[] traffic_source_list;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 268435455, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackParams)) {
            return false;
        }
        TrackParams trackParams = (TrackParams) obj;
        return o.LJ(this.anchor_show_type, trackParams.anchor_show_type) && o.LJ(this.author_id, trackParams.author_id) && o.LJ(this.product_id, trackParams.product_id) && o.LJ(this.enter_from_info, trackParams.enter_from_info) && o.LJ(this.enter_from_merge, trackParams.enter_from_merge) && o.LJ(this.action_type, trackParams.action_type) && o.LJ(this.product_source, trackParams.product_source) && o.LJ(this.source_from, trackParams.source_from) && o.LJ(this.source, trackParams.source) && o.LJ(this.source_content_id, trackParams.source_content_id) && o.LJ(this.follow_status, trackParams.follow_status) && o.LJ(this.source_page_type, trackParams.source_page_type) && o.LJ(this.source_previous_page, trackParams.source_previous_page) && o.LJ(this.entrance_form, trackParams.entrance_form) && o.LJ(this.is_ad, trackParams.is_ad) && o.LJ(this.rec_content_id, trackParams.rec_content_id) && o.LJ(this.rec_content_type, trackParams.rec_content_type) && o.LJ(this.request_id, trackParams.request_id) && o.LJ(this.search_id, trackParams.search_id) && o.LJ(this.search_result_id, trackParams.search_result_id) && o.LJ(this.effect_ad_extra, trackParams.effect_ad_extra) && o.LJ(this.track_id, trackParams.track_id) && o.LJ(this.rec_session_id, trackParams.rec_session_id) && o.LJ(this.traffic_source_list, trackParams.traffic_source_list) && o.LJ(this.list_item_id, trackParams.list_item_id) && o.LJ(this.creative_id, trackParams.creative_id) && o.LJ(this.ad_id, trackParams.ad_id) && o.LJ(this.sourceModule, trackParams.sourceModule);
    }

    public final int hashCode() {
        String str = this.anchor_show_type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.author_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.product_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enter_from_info;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.enter_from_merge;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action_type;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.product_source;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.source_from;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.source;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.source_content_id;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.follow_status;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.source_page_type;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.source_previous_page;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.entrance_form;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.is_ad;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.rec_content_id;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.rec_content_type;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.request_id;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.search_id;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.search_result_id;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Map<String, String> map = this.effect_ad_extra;
        int hashCode21 = (hashCode20 + (map == null ? 0 : map.hashCode())) * 31;
        String str21 = this.track_id;
        int hashCode22 = (hashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.rec_session_id;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        int[] iArr = this.traffic_source_list;
        int hashCode24 = (hashCode23 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str23 = this.list_item_id;
        int hashCode25 = (hashCode24 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.creative_id;
        int hashCode26 = (hashCode25 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.ad_id;
        int hashCode27 = (hashCode26 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.sourceModule;
        return hashCode27 + (str26 != null ? str26.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackParams(anchor_show_type=");
        sb.append(this.anchor_show_type);
        sb.append(", author_id=");
        sb.append(this.author_id);
        sb.append(", product_id=");
        sb.append(this.product_id);
        sb.append(", enter_from_info=");
        sb.append(this.enter_from_info);
        sb.append(", enter_from_merge=");
        sb.append(this.enter_from_merge);
        sb.append(", action_type=");
        sb.append(this.action_type);
        sb.append(", product_source=");
        sb.append(this.product_source);
        sb.append(", source_from=");
        sb.append(this.source_from);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", source_content_id=");
        sb.append(this.source_content_id);
        sb.append(", follow_status=");
        sb.append(this.follow_status);
        sb.append(", source_page_type=");
        sb.append(this.source_page_type);
        sb.append(", source_previous_page=");
        sb.append(this.source_previous_page);
        sb.append(", entrance_form=");
        sb.append(this.entrance_form);
        sb.append(", is_ad=");
        sb.append(this.is_ad);
        sb.append(", rec_content_id=");
        sb.append(this.rec_content_id);
        sb.append(", rec_content_type=");
        sb.append(this.rec_content_type);
        sb.append(", request_id=");
        sb.append(this.request_id);
        sb.append(", search_id=");
        sb.append(this.search_id);
        sb.append(", search_result_id=");
        sb.append(this.search_result_id);
        sb.append(", effect_ad_extra=");
        sb.append(this.effect_ad_extra);
        sb.append(", track_id=");
        sb.append(this.track_id);
        sb.append(", rec_session_id=");
        sb.append(this.rec_session_id);
        sb.append(", traffic_source_list=");
        C0JT.LIZLLL(this.traffic_source_list, sb, ", list_item_id=");
        sb.append(this.list_item_id);
        sb.append(", creative_id=");
        sb.append(this.creative_id);
        sb.append(", ad_id=");
        sb.append(this.ad_id);
        sb.append(", sourceModule=");
        return C07670Rv.LIZIZ(sb, this.sourceModule, ')');
    }

    public TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Map<String, String> map, String str21, String str22, int[] iArr, String str23, String str24, String str25, String str26) {
        this.anchor_show_type = str;
        this.author_id = str2;
        this.product_id = str3;
        this.enter_from_info = str4;
        this.enter_from_merge = str5;
        this.action_type = str6;
        this.product_source = str7;
        this.source_from = str8;
        this.source = str9;
        this.source_content_id = str10;
        this.follow_status = str11;
        this.source_page_type = str12;
        this.source_previous_page = str13;
        this.entrance_form = str14;
        this.is_ad = str15;
        this.rec_content_id = str16;
        this.rec_content_type = str17;
        this.request_id = str18;
        this.search_id = str19;
        this.search_result_id = str20;
        this.effect_ad_extra = map;
        this.track_id = str21;
        this.rec_session_id = str22;
        this.traffic_source_list = iArr;
        this.list_item_id = str23;
        this.creative_id = str24;
        this.ad_id = str25;
        this.sourceModule = str26;
    }

    public /* synthetic */ TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Map map, String str21, String str22, int[] iArr, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (32768 & i) != 0 ? null : str16, (65536 & i) != 0 ? null : str17, (131072 & i) != 0 ? null : str18, (262144 & i) != 0 ? null : str19, (524288 & i) != 0 ? null : str20, (1048576 & i) != 0 ? null : map, (2097152 & i) != 0 ? null : str21, (4194304 & i) != 0 ? null : str22, (8388608 & i) != 0 ? null : iArr, (16777216 & i) != 0 ? null : str23, (33554432 & i) != 0 ? null : str24, (67108864 & i) != 0 ? null : str25, (i & 134217728) != 0 ? null : str26);
    }
}
