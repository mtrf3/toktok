package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class TrackParams {

    @InterfaceC65349Pkn("action_type")
    public String action_type;

    @InterfaceC65349Pkn("ad_id")
    public String ad_id;

    @InterfaceC65349Pkn("anchor_anim_type")
    public Integer anchor_anim_type;

    @InterfaceC65349Pkn("anchor_show_type")
    public String anchor_show_type;

    @InterfaceC65349Pkn("author_id")
    public String author_id;

    @InterfaceC65349Pkn("cart_item_id")
    public String cartItemId;

    @InterfaceC65349Pkn("creative_id")
    public String creativeId;

    @InterfaceC65349Pkn("enter_click_area")
    public String enterClickArea;

    @InterfaceC65349Pkn("enter_from")
    public String enter_from;

    @InterfaceC65349Pkn("enter_from_info")
    public String enter_from_info;

    @InterfaceC65349Pkn("entrance_form")
    public String entrance_form;

    @InterfaceC65349Pkn("follow_status")
    public String follow_status;

    @InterfaceC65349Pkn("from_ec_ug")
    public String fromEcUg;

    @InterfaceC65349Pkn("inner_search_id")
    public String inner_search_id;

    @InterfaceC65349Pkn("is_indirectly_pdp")
    public String isIndirectlyPdp;

    @InterfaceC65349Pkn("is_ad")
    public Integer is_ad;

    @InterfaceC65349Pkn("is_inner")
    public String is_inner;

    @InterfaceC65349Pkn("is_self")
    public Integer is_self;

    @InterfaceC65349Pkn("is_single_anchor")
    public String is_single_anchor;

    @InterfaceC65349Pkn("list_item_id")
    public String list_item_id;

    @InterfaceC65349Pkn("previous_page")
    public String previous_page;

    @InterfaceC65349Pkn("product_id")
    public String product_id;

    @InterfaceC65349Pkn("product_source")
    public String product_source;

    @InterfaceC65349Pkn("rec_session_id")
    public String rec_session_id;

    @InterfaceC65349Pkn("request_id")
    public String request_id;

    @InterfaceC65349Pkn("search_entrance")
    public String search_entrance;

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

    @InterfaceC65349Pkn("track_id")
    public String track_id;

    @InterfaceC65349Pkn("traffic_source_list")
    public int[] traffic_source_list;

    @InterfaceC65349Pkn("video_shopping_list_style")
    public Integer videoShoppingListStyle;

    /* JADX WARN: Multi-variable type inference failed */
    public TrackParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, 3, 0 == true ? 1 : 0);
    }

    public TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, Integer num2, String str15, Integer num3, String str16, String str17, String str18, int[] iArr, String str19, String str20, String str21, String str22, Integer num4, String str23, String str24, String str25, String str26, String str27, String str28, String str29) {
        this.track_id = str;
        this.anchor_show_type = str2;
        this.author_id = str3;
        this.enter_from_info = str4;
        this.product_id = str5;
        this.product_source = str6;
        this.source_content_id = str7;
        this.source_from = str8;
        this.source = str9;
        this.follow_status = str10;
        this.entrance_form = str11;
        this.source_page_type = str12;
        this.request_id = str13;
        this.is_self = num;
        this.is_single_anchor = str14;
        this.is_ad = num2;
        this.ad_id = str15;
        this.anchor_anim_type = num3;
        this.previous_page = str16;
        this.enter_from = str17;
        this.rec_session_id = str18;
        this.traffic_source_list = iArr;
        this.search_entrance = str19;
        this.list_item_id = str20;
        this.creativeId = str21;
        this.sourceModule = str22;
        this.videoShoppingListStyle = num4;
        this.cartItemId = str23;
        this.action_type = str24;
        this.fromEcUg = str25;
        this.isIndirectlyPdp = str26;
        this.enterClickArea = str27;
        this.is_inner = str28;
        this.inner_search_id = str29;
    }

    public /* synthetic */ TrackParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, String str14, Integer num2, String str15, Integer num3, String str16, String str17, String str18, int[] iArr, String str19, String str20, String str21, String str22, Integer num4, String str23, String str24, String str25, String str26, String str27, String str28, String str29, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & FileUtils.BUFFER_SIZE) != 0 ? null : num, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : num2, (65536 & i) != 0 ? null : str15, (131072 & i) != 0 ? null : num3, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? null : str17, (1048576 & i) != 0 ? null : str18, (2097152 & i) != 0 ? null : iArr, (4194304 & i) != 0 ? null : str19, (8388608 & i) != 0 ? null : str20, (16777216 & i) != 0 ? null : str21, (33554432 & i) != 0 ? null : str22, (67108864 & i) != 0 ? null : num4, (134217728 & i) != 0 ? null : str23, (268435456 & i) != 0 ? null : str24, (536870912 & i) != 0 ? null : str25, (1073741824 & i) != 0 ? null : str26, (i & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : str27, (i2 & 1) != 0 ? null : str28, (i2 & 2) != 0 ? null : str29);
    }
}
