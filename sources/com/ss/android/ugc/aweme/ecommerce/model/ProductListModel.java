package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductListModel implements Serializable {

    @InterfaceC65349Pkn("aid")
    public final String aid;

    @InterfaceC65349Pkn("anchor_custom_data")
    public final AnchorCustomData anchorCustomData;

    @InterfaceC65349Pkn("anchors")
    public final List<AnchorCommonStruct> anchors;

    @InterfaceC65349Pkn("author")
    public final User author;

    @InterfaceC65349Pkn("author_uid")
    public final String authorUid;

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("aweme_extra_params")
    public final Map<String, String> awemeExtraParams;

    @InterfaceC65349Pkn("aweme_raw_ad")
    public final AwemeRawAd awemeRawAd;

    @InterfaceC65349Pkn("aweme_raw_ad_id_str")
    public final String awemeRawAdIdStr;

    @InterfaceC65349Pkn("enter_list_form")
    public final String enterListForm;

    @InterfaceC65349Pkn("entrance_form")
    public final String entranceForm;

    @InterfaceC65349Pkn("event_type")
    public final String eventType;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("is_ad")
    public final Boolean isAd;

    @InterfaceC65349Pkn("is_photo_mode")
    public final Boolean isPhotoMode;

    @InterfaceC65349Pkn("is_single_anchor")
    public final Boolean isSingleAnchor;

    @InterfaceC65349Pkn("mob_params")
    public final HashMap<String, String> mobParams;

    @InterfaceC65349Pkn("page_name")
    public final String pageName;

    @InterfaceC65349Pkn("panel_open_info")
    public final PanelOpenInfo panelOpenInfo;

    @InterfaceC65349Pkn("products")
    public final List<ShopWindowAnchorModel> products;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("shop_ad_struct")
    public final ShopAdStruct shopAdStruct;

    @InterfaceC65349Pkn("start_click_time")
    public Long startClickTime;

    @InterfaceC65349Pkn("track_params")
    public final Map<String, Object> trackParams;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductListModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777215, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ProductListModel copy$default(ProductListModel productListModel, String str, String str2, String str3, List list, List list2, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map map, HashMap hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, Aweme aweme, Boolean bool2, Boolean bool3, PanelOpenInfo panelOpenInfo, String str7, String str8, String str9, Map map2, int i, Object obj) {
        String str10 = str3;
        String str11 = str;
        String str12 = str2;
        String str13 = str6;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        Boolean bool4 = bool;
        HashMap hashMap2 = hashMap;
        Map map3 = map;
        List list3 = list2;
        List list4 = list;
        String str14 = str4;
        User user2 = user;
        String str15 = str5;
        AnchorCustomData anchorCustomData2 = anchorCustomData;
        Map map4 = map2;
        String str16 = str8;
        String str17 = str7;
        ShopAdStruct shopAdStruct2 = shopAdStruct;
        String str18 = str9;
        Long l2 = l;
        Aweme aweme2 = aweme;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        PanelOpenInfo panelOpenInfo2 = panelOpenInfo;
        if ((i & 1) != 0) {
            str11 = productListModel.aid;
        }
        if ((i & 2) != 0) {
            str12 = productListModel.groupId;
        }
        if ((i & 4) != 0) {
            str10 = productListModel.requestId;
        }
        if ((i & 8) != 0) {
            list4 = productListModel.anchors;
        }
        if ((i & 16) != 0) {
            list3 = productListModel.products;
        }
        if ((i & 32) != 0) {
            str14 = productListModel.authorUid;
        }
        if ((i & 64) != 0) {
            user2 = productListModel.author;
        }
        if ((i & 128) != 0) {
            str15 = productListModel.awemeRawAdIdStr;
        }
        if ((i & 256) != 0) {
            anchorCustomData2 = productListModel.anchorCustomData;
        }
        if ((i & 512) != 0) {
            map3 = productListModel.awemeExtraParams;
        }
        if ((i & 1024) != 0) {
            hashMap2 = productListModel.mobParams;
        }
        if ((i & 2048) != 0) {
            bool4 = productListModel.isAd;
        }
        if ((i & 4096) != 0) {
            awemeRawAd2 = productListModel.awemeRawAd;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str13 = productListModel.eventType;
        }
        if ((i & 16384) != 0) {
            l2 = productListModel.startClickTime;
        }
        if ((32768 & i) != 0) {
            shopAdStruct2 = productListModel.shopAdStruct;
        }
        if ((65536 & i) != 0) {
            aweme2 = productListModel.aweme;
        }
        if ((131072 & i) != 0) {
            bool5 = productListModel.isPhotoMode;
        }
        if ((262144 & i) != 0) {
            bool6 = productListModel.isSingleAnchor;
        }
        if ((524288 & i) != 0) {
            panelOpenInfo2 = productListModel.panelOpenInfo;
        }
        if ((1048576 & i) != 0) {
            str17 = productListModel.entranceForm;
        }
        if ((2097152 & i) != 0) {
            str16 = productListModel.pageName;
        }
        if ((4194304 & i) != 0) {
            str18 = productListModel.enterListForm;
        }
        if ((i & 8388608) != 0) {
            map4 = productListModel.trackParams;
        }
        Boolean bool7 = bool4;
        AwemeRawAd awemeRawAd3 = awemeRawAd2;
        return productListModel.copy(str11, str12, str10, list4, list3, str14, user2, str15, anchorCustomData2, map3, hashMap2, bool7, awemeRawAd3, str13, l2, shopAdStruct2, aweme2, bool5, bool6, panelOpenInfo2, str17, str16, str18, map4);
    }

    public final ProductListModel copy(String str, String str2, String str3, List<AnchorCommonStruct> list, List<ShopWindowAnchorModel> list2, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, Aweme aweme, Boolean bool2, Boolean bool3, PanelOpenInfo panelOpenInfo, String str7, String str8, String str9, Map<String, Object> trackParams) {
        o.LJIIIZ(panelOpenInfo, "panelOpenInfo");
        o.LJIIIZ(trackParams, "trackParams");
        return new ProductListModel(str, str2, str3, list, list2, str4, user, str5, anchorCustomData, map, hashMap, bool, awemeRawAd, str6, l, shopAdStruct, aweme, bool2, bool3, panelOpenInfo, str7, str8, str9, trackParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListModel)) {
            return false;
        }
        ProductListModel productListModel = (ProductListModel) obj;
        return o.LJ(this.aid, productListModel.aid) && o.LJ(this.groupId, productListModel.groupId) && o.LJ(this.requestId, productListModel.requestId) && o.LJ(this.anchors, productListModel.anchors) && o.LJ(this.products, productListModel.products) && o.LJ(this.authorUid, productListModel.authorUid) && o.LJ(this.author, productListModel.author) && o.LJ(this.awemeRawAdIdStr, productListModel.awemeRawAdIdStr) && o.LJ(this.anchorCustomData, productListModel.anchorCustomData) && o.LJ(this.awemeExtraParams, productListModel.awemeExtraParams) && o.LJ(this.mobParams, productListModel.mobParams) && o.LJ(this.isAd, productListModel.isAd) && o.LJ(this.awemeRawAd, productListModel.awemeRawAd) && o.LJ(this.eventType, productListModel.eventType) && o.LJ(this.startClickTime, productListModel.startClickTime) && o.LJ(this.shopAdStruct, productListModel.shopAdStruct) && o.LJ(this.aweme, productListModel.aweme) && o.LJ(this.isPhotoMode, productListModel.isPhotoMode) && o.LJ(this.isSingleAnchor, productListModel.isSingleAnchor) && o.LJ(this.panelOpenInfo, productListModel.panelOpenInfo) && o.LJ(this.entranceForm, productListModel.entranceForm) && o.LJ(this.pageName, productListModel.pageName) && o.LJ(this.enterListForm, productListModel.enterListForm) && o.LJ(this.trackParams, productListModel.trackParams);
    }

    public int hashCode() {
        String str = this.aid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.groupId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.requestId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AnchorCommonStruct> list = this.anchors;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ShopWindowAnchorModel> list2 = this.products;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.authorUid;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        User user = this.author;
        int hashCode7 = (hashCode6 + (user == null ? 0 : user.hashCode())) * 31;
        String str5 = this.awemeRawAdIdStr;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AnchorCustomData anchorCustomData = this.anchorCustomData;
        int hashCode9 = (hashCode8 + (anchorCustomData == null ? 0 : anchorCustomData.hashCode())) * 31;
        Map<String, String> map = this.awemeExtraParams;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        HashMap<String, String> hashMap = this.mobParams;
        int hashCode11 = (hashCode10 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        Boolean bool = this.isAd;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        AwemeRawAd awemeRawAd = this.awemeRawAd;
        int hashCode13 = (hashCode12 + (awemeRawAd == null ? 0 : awemeRawAd.hashCode())) * 31;
        String str6 = this.eventType;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.startClickTime;
        int hashCode15 = (hashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        ShopAdStruct shopAdStruct = this.shopAdStruct;
        int hashCode16 = (hashCode15 + (shopAdStruct == null ? 0 : shopAdStruct.hashCode())) * 31;
        Aweme aweme = this.aweme;
        int hashCode17 = (hashCode16 + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Boolean bool2 = this.isPhotoMode;
        int hashCode18 = (hashCode17 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSingleAnchor;
        int hashCode19 = (this.panelOpenInfo.hashCode() + ((hashCode18 + (bool3 == null ? 0 : bool3.hashCode())) * 31)) * 31;
        String str7 = this.entranceForm;
        int hashCode20 = (hashCode19 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.pageName;
        int hashCode21 = (hashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.enterListForm;
        return this.trackParams.hashCode() + ((hashCode21 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ProductListModel(aid=" + this.aid + ", groupId=" + this.groupId + ", requestId=" + this.requestId + ", anchors=" + this.anchors + ", products=" + this.products + ", authorUid=" + this.authorUid + ", author=" + this.author + ", awemeRawAdIdStr=" + this.awemeRawAdIdStr + ", anchorCustomData=" + this.anchorCustomData + ", awemeExtraParams=" + this.awemeExtraParams + ", mobParams=" + this.mobParams + ", isAd=" + this.isAd + ", awemeRawAd=" + this.awemeRawAd + ", eventType=" + this.eventType + ", startClickTime=" + this.startClickTime + ", shopAdStruct=" + this.shopAdStruct + ", aweme=" + this.aweme + ", isPhotoMode=" + this.isPhotoMode + ", isSingleAnchor=" + this.isSingleAnchor + ", panelOpenInfo=" + this.panelOpenInfo + ", entranceForm=" + this.entranceForm + ", pageName=" + this.pageName + ", enterListForm=" + this.enterListForm + ", trackParams=" + this.trackParams + ')';
    }

    public final String getAid() {
        return this.aid;
    }

    public final AnchorCustomData getAnchorCustomData() {
        return this.anchorCustomData;
    }

    public final List<AnchorCommonStruct> getAnchors() {
        return this.anchors;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final String getAuthorUid() {
        return this.authorUid;
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Map<String, String> getAwemeExtraParams() {
        return this.awemeExtraParams;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public final String getAwemeRawAdIdStr() {
        return this.awemeRawAdIdStr;
    }

    public final String getEnterListForm() {
        return this.enterListForm;
    }

    public final String getEntranceForm() {
        return this.entranceForm;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final HashMap<String, String> getMobParams() {
        return this.mobParams;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final PanelOpenInfo getPanelOpenInfo() {
        return this.panelOpenInfo;
    }

    public final List<ShopWindowAnchorModel> getProducts() {
        return this.products;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final ShopAdStruct getShopAdStruct() {
        return this.shopAdStruct;
    }

    public final Long getStartClickTime() {
        return this.startClickTime;
    }

    public final Map<String, Object> getTrackParams() {
        return this.trackParams;
    }

    public final Boolean isAd() {
        return this.isAd;
    }

    public final Boolean isPhotoMode() {
        return this.isPhotoMode;
    }

    public final Boolean isSingleAnchor() {
        return this.isSingleAnchor;
    }

    public final void setStartClickTime(Long l) {
        this.startClickTime = l;
    }

    public ProductListModel(String str, String str2, String str3, List<AnchorCommonStruct> list, List<ShopWindowAnchorModel> list2, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, Aweme aweme, Boolean bool2, Boolean bool3, PanelOpenInfo panelOpenInfo, String str7, String str8, String str9, Map<String, Object> trackParams) {
        o.LJIIIZ(panelOpenInfo, "panelOpenInfo");
        o.LJIIIZ(trackParams, "trackParams");
        this.aid = str;
        this.groupId = str2;
        this.requestId = str3;
        this.anchors = list;
        this.products = list2;
        this.authorUid = str4;
        this.author = user;
        this.awemeRawAdIdStr = str5;
        this.anchorCustomData = anchorCustomData;
        this.awemeExtraParams = map;
        this.mobParams = hashMap;
        this.isAd = bool;
        this.awemeRawAd = awemeRawAd;
        this.eventType = str6;
        this.startClickTime = l;
        this.shopAdStruct = shopAdStruct;
        this.aweme = aweme;
        this.isPhotoMode = bool2;
        this.isSingleAnchor = bool3;
        this.panelOpenInfo = panelOpenInfo;
        this.entranceForm = str7;
        this.pageName = str8;
        this.enterListForm = str9;
        this.trackParams = trackParams;
    }

    public /* synthetic */ ProductListModel(String str, String str2, String str3, List list, List list2, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map map, HashMap hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, Aweme aweme, Boolean bool2, Boolean bool3, PanelOpenInfo panelOpenInfo, String str7, String str8, String str9, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : user, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : anchorCustomData, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? null : hashMap, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : awemeRawAd, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str6, (i & 16384) != 0 ? null : l, (32768 & i) != 0 ? null : shopAdStruct, (65536 & i) != 0 ? null : aweme, (131072 & i) != 0 ? null : bool2, (262144 & i) != 0 ? null : bool3, (524288 & i) != 0 ? new PanelOpenInfo(0, null, 0, false, 0, 31, null) : panelOpenInfo, (1048576 & i) != 0 ? null : str7, (2097152 & i) != 0 ? null : str8, (4194304 & i) != 0 ? null : str9, (i & 8388608) != 0 ? new LinkedHashMap() : map2);
    }
}
