package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commerce.model.ShopAdStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommonVideoAnchorModel implements Serializable {

    @InterfaceC65349Pkn("aid")
    public final String aid;

    @InterfaceC65349Pkn("anchorCustomData")
    public final AnchorCustomData anchorCustomData;

    @InterfaceC65349Pkn("anchors")
    public final List<AnchorCommonStruct> anchors;

    @InterfaceC65349Pkn("author")
    public final User author;

    @InterfaceC65349Pkn("authorUid")
    public final String authorUid;

    @InterfaceC65349Pkn("awemeExtraParams")
    public final Map<String, String> awemeExtraParams;

    @InterfaceC65349Pkn("awemeRawAd")
    public final AwemeRawAd awemeRawAd;

    @InterfaceC65349Pkn("awemeRawAdIdStr")
    public final String awemeRawAdIdStr;

    @InterfaceC65349Pkn("eventType")
    public final String eventType;

    @InterfaceC65349Pkn("groupId")
    public final String groupId;

    @InterfaceC65349Pkn("isAd")
    public final Boolean isAd;

    @InterfaceC65349Pkn("mMobParams")
    public final HashMap<String, String> mMobParams;

    @InterfaceC65349Pkn("requestId")
    public final String requestId;

    @InterfaceC65349Pkn("shopAdStruct")
    public final ShopAdStruct shopAdStruct;

    @InterfaceC65349Pkn("startClickTime")
    public Long startClickTime;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVideoAnchorModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 32767, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommonVideoAnchorModel copy$default(CommonVideoAnchorModel commonVideoAnchorModel, String str, String str2, String str3, List list, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map map, HashMap hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, int i, Object obj) {
        String str7 = str2;
        String str8 = str;
        List list2 = list;
        String str9 = str3;
        User user2 = user;
        String str10 = str4;
        AnchorCustomData anchorCustomData2 = anchorCustomData;
        String str11 = str5;
        HashMap hashMap2 = hashMap;
        Map map2 = map;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        Boolean bool2 = bool;
        Long l2 = l;
        String str12 = str6;
        ShopAdStruct shopAdStruct2 = shopAdStruct;
        if ((i & 1) != 0) {
            str8 = commonVideoAnchorModel.aid;
        }
        if ((i & 2) != 0) {
            str7 = commonVideoAnchorModel.groupId;
        }
        if ((i & 4) != 0) {
            str9 = commonVideoAnchorModel.requestId;
        }
        if ((i & 8) != 0) {
            list2 = commonVideoAnchorModel.anchors;
        }
        if ((i & 16) != 0) {
            str10 = commonVideoAnchorModel.authorUid;
        }
        if ((i & 32) != 0) {
            user2 = commonVideoAnchorModel.author;
        }
        if ((i & 64) != 0) {
            str11 = commonVideoAnchorModel.awemeRawAdIdStr;
        }
        if ((i & 128) != 0) {
            anchorCustomData2 = commonVideoAnchorModel.anchorCustomData;
        }
        if ((i & 256) != 0) {
            map2 = commonVideoAnchorModel.awemeExtraParams;
        }
        if ((i & 512) != 0) {
            hashMap2 = commonVideoAnchorModel.mMobParams;
        }
        if ((i & 1024) != 0) {
            bool2 = commonVideoAnchorModel.isAd;
        }
        if ((i & 2048) != 0) {
            awemeRawAd2 = commonVideoAnchorModel.awemeRawAd;
        }
        if ((i & 4096) != 0) {
            str12 = commonVideoAnchorModel.eventType;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            l2 = commonVideoAnchorModel.startClickTime;
        }
        if ((i & 16384) != 0) {
            shopAdStruct2 = commonVideoAnchorModel.shopAdStruct;
        }
        return commonVideoAnchorModel.copy(str8, str7, str9, list2, str10, user2, str11, anchorCustomData2, map2, hashMap2, bool2, awemeRawAd2, str12, l2, shopAdStruct2);
    }

    public final CommonVideoAnchorModel copy(String str, String str2, String str3, List<AnchorCommonStruct> list, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct) {
        return new CommonVideoAnchorModel(str, str2, str3, list, str4, user, str5, anchorCustomData, map, hashMap, bool, awemeRawAd, str6, l, shopAdStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAnchorModel)) {
            return false;
        }
        CommonVideoAnchorModel commonVideoAnchorModel = (CommonVideoAnchorModel) obj;
        return o.LJ(this.aid, commonVideoAnchorModel.aid) && o.LJ(this.groupId, commonVideoAnchorModel.groupId) && o.LJ(this.requestId, commonVideoAnchorModel.requestId) && o.LJ(this.anchors, commonVideoAnchorModel.anchors) && o.LJ(this.authorUid, commonVideoAnchorModel.authorUid) && o.LJ(this.author, commonVideoAnchorModel.author) && o.LJ(this.awemeRawAdIdStr, commonVideoAnchorModel.awemeRawAdIdStr) && o.LJ(this.anchorCustomData, commonVideoAnchorModel.anchorCustomData) && o.LJ(this.awemeExtraParams, commonVideoAnchorModel.awemeExtraParams) && o.LJ(this.mMobParams, commonVideoAnchorModel.mMobParams) && o.LJ(this.isAd, commonVideoAnchorModel.isAd) && o.LJ(this.awemeRawAd, commonVideoAnchorModel.awemeRawAd) && o.LJ(this.eventType, commonVideoAnchorModel.eventType) && o.LJ(this.startClickTime, commonVideoAnchorModel.startClickTime) && o.LJ(this.shopAdStruct, commonVideoAnchorModel.shopAdStruct);
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
        String str4 = this.authorUid;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        User user = this.author;
        int hashCode6 = (hashCode5 + (user == null ? 0 : user.hashCode())) * 31;
        String str5 = this.awemeRawAdIdStr;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AnchorCustomData anchorCustomData = this.anchorCustomData;
        int hashCode8 = (hashCode7 + (anchorCustomData == null ? 0 : anchorCustomData.hashCode())) * 31;
        Map<String, String> map = this.awemeExtraParams;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        HashMap<String, String> hashMap = this.mMobParams;
        int hashCode10 = (hashCode9 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        Boolean bool = this.isAd;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        AwemeRawAd awemeRawAd = this.awemeRawAd;
        int hashCode12 = (hashCode11 + (awemeRawAd == null ? 0 : awemeRawAd.hashCode())) * 31;
        String str6 = this.eventType;
        int hashCode13 = (hashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.startClickTime;
        int hashCode14 = (hashCode13 + (l == null ? 0 : l.hashCode())) * 31;
        ShopAdStruct shopAdStruct = this.shopAdStruct;
        return hashCode14 + (shopAdStruct != null ? shopAdStruct.hashCode() : 0);
    }

    public String toString() {
        return "CommonVideoAnchorModel(aid=" + this.aid + ", groupId=" + this.groupId + ", requestId=" + this.requestId + ", anchors=" + this.anchors + ", authorUid=" + this.authorUid + ", author=" + this.author + ", awemeRawAdIdStr=" + this.awemeRawAdIdStr + ", anchorCustomData=" + this.anchorCustomData + ", awemeExtraParams=" + this.awemeExtraParams + ", mMobParams=" + this.mMobParams + ", isAd=" + this.isAd + ", awemeRawAd=" + this.awemeRawAd + ", eventType=" + this.eventType + ", startClickTime=" + this.startClickTime + ", shopAdStruct=" + this.shopAdStruct + ')';
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

    public final Map<String, String> getAwemeExtraParams() {
        return this.awemeExtraParams;
    }

    public final AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public final String getAwemeRawAdIdStr() {
        return this.awemeRawAdIdStr;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final HashMap<String, String> getMMobParams() {
        return this.mMobParams;
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

    public final Boolean isAd() {
        return this.isAd;
    }

    public final void setStartClickTime(Long l) {
        this.startClickTime = l;
    }

    public CommonVideoAnchorModel(String str, String str2, String str3, List<AnchorCommonStruct> list, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map<String, String> map, HashMap<String, String> hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct) {
        this.aid = str;
        this.groupId = str2;
        this.requestId = str3;
        this.anchors = list;
        this.authorUid = str4;
        this.author = user;
        this.awemeRawAdIdStr = str5;
        this.anchorCustomData = anchorCustomData;
        this.awemeExtraParams = map;
        this.mMobParams = hashMap;
        this.isAd = bool;
        this.awemeRawAd = awemeRawAd;
        this.eventType = str6;
        this.startClickTime = l;
        this.shopAdStruct = shopAdStruct;
    }

    public /* synthetic */ CommonVideoAnchorModel(String str, String str2, String str3, List list, String str4, User user, String str5, AnchorCustomData anchorCustomData, Map map, HashMap hashMap, Boolean bool, AwemeRawAd awemeRawAd, String str6, Long l, ShopAdStruct shopAdStruct, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : user, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : anchorCustomData, (i & 256) != 0 ? null : map, (i & 512) != 0 ? null : hashMap, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : awemeRawAd, (i & 4096) != 0 ? null : str6, (i & FileUtils.BUFFER_SIZE) != 0 ? null : l, (i & 16384) == 0 ? shopAdStruct : null);
    }
}
