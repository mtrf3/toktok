package com.ss.android.ugc.aweme.vision.model;

import X.C221108m2;
import X.C5H3;
import X.EnumC51280KAq;
import X.KEQ;
import X.UC7;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchBusinessEnterParams implements Serializable {
    public String attachProducts;
    public final C5H3 ecSearchSessionId$delegate;
    public String enterFrom;
    public String enterMethod;
    public Integer filterBy;
    public String fromMiddleBackFromResult;
    public String groupId;
    public String imagePath;
    public Integer isFilterSearch;
    public String isFromComment;
    public Integer isFromVideo;
    public String lastFromGroupId;
    public String latestSearchId;
    public String originIsMallTab;
    public String personalContextInfo;
    public String photoSearchPreviousPage;
    public String photoSearchPreviousSearchType;
    public Integer recallShield;
    public int rootEnterFromType;
    public String searchChannel;
    public String searchContext;
    public final C5H3 searchSessionId$delegate;
    public Integer sortType;
    public String trafficSourceList;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchBusinessEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 4194303, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotoSearchBusinessEnterParams copy$default(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, String str16, int i, Integer num5, int i2, Object obj) {
        String str17 = str5;
        String str18 = str4;
        String str19 = str3;
        String str20 = str;
        String str21 = str2;
        String str22 = str13;
        String str23 = str12;
        String str24 = str11;
        String str25 = str6;
        Integer num6 = num;
        String str26 = str7;
        String str27 = str8;
        String str28 = str9;
        String str29 = str10;
        Integer num7 = num5;
        String str30 = str15;
        int i3 = i;
        String str31 = str14;
        Integer num8 = num2;
        Integer num9 = num3;
        Integer num10 = num4;
        String str32 = str16;
        if ((i2 & 1) != 0) {
            str20 = photoSearchBusinessEnterParams.enterFrom;
        }
        if ((i2 & 2) != 0) {
            str21 = photoSearchBusinessEnterParams.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str19 = photoSearchBusinessEnterParams.trafficSourceList;
        }
        if ((i2 & 8) != 0) {
            str18 = photoSearchBusinessEnterParams.groupId;
        }
        if ((i2 & 16) != 0) {
            str17 = photoSearchBusinessEnterParams.fromMiddleBackFromResult;
        }
        if ((i2 & 32) != 0) {
            num6 = photoSearchBusinessEnterParams.isFromVideo;
        }
        if ((i2 & 64) != 0) {
            str25 = photoSearchBusinessEnterParams.isFromComment;
        }
        if ((i2 & 128) != 0) {
            str26 = photoSearchBusinessEnterParams.lastFromGroupId;
        }
        if ((i2 & 256) != 0) {
            str27 = photoSearchBusinessEnterParams.attachProducts;
        }
        if ((i2 & 512) != 0) {
            str28 = photoSearchBusinessEnterParams.photoSearchPreviousPage;
        }
        if ((i2 & 1024) != 0) {
            str29 = photoSearchBusinessEnterParams.photoSearchPreviousSearchType;
        }
        if ((i2 & 2048) != 0) {
            str24 = photoSearchBusinessEnterParams.originIsMallTab;
        }
        if ((i2 & 4096) != 0) {
            str23 = photoSearchBusinessEnterParams.latestSearchId;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            str22 = photoSearchBusinessEnterParams.searchContext;
        }
        if ((i2 & 16384) != 0) {
            str31 = photoSearchBusinessEnterParams.personalContextInfo;
        }
        if ((32768 & i2) != 0) {
            str30 = photoSearchBusinessEnterParams.searchChannel;
        }
        if ((65536 & i2) != 0) {
            num8 = photoSearchBusinessEnterParams.isFilterSearch;
        }
        if ((131072 & i2) != 0) {
            num9 = photoSearchBusinessEnterParams.sortType;
        }
        if ((262144 & i2) != 0) {
            num10 = photoSearchBusinessEnterParams.filterBy;
        }
        if ((524288 & i2) != 0) {
            str32 = photoSearchBusinessEnterParams.imagePath;
        }
        if ((1048576 & i2) != 0) {
            i3 = photoSearchBusinessEnterParams.rootEnterFromType;
        }
        if ((i2 & 2097152) != 0) {
            num7 = photoSearchBusinessEnterParams.recallShield;
        }
        String str33 = str28;
        String str34 = str29;
        String str35 = str24;
        String str36 = str23;
        return photoSearchBusinessEnterParams.copy(str20, str21, str19, str18, str17, num6, str25, str26, str27, str33, str34, str35, str36, str22, str31, str30, num8, num9, num10, str32, i3, num7);
    }

    public final PhotoSearchBusinessEnterParams copy(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, String str16, int i, Integer num5) {
        return new PhotoSearchBusinessEnterParams(str, str2, str3, str4, str5, num, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num2, num3, num4, str16, i, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchBusinessEnterParams)) {
            return false;
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = (PhotoSearchBusinessEnterParams) obj;
        return o.LJ(this.enterFrom, photoSearchBusinessEnterParams.enterFrom) && o.LJ(this.enterMethod, photoSearchBusinessEnterParams.enterMethod) && o.LJ(this.trafficSourceList, photoSearchBusinessEnterParams.trafficSourceList) && o.LJ(this.groupId, photoSearchBusinessEnterParams.groupId) && o.LJ(this.fromMiddleBackFromResult, photoSearchBusinessEnterParams.fromMiddleBackFromResult) && o.LJ(this.isFromVideo, photoSearchBusinessEnterParams.isFromVideo) && o.LJ(this.isFromComment, photoSearchBusinessEnterParams.isFromComment) && o.LJ(this.lastFromGroupId, photoSearchBusinessEnterParams.lastFromGroupId) && o.LJ(this.attachProducts, photoSearchBusinessEnterParams.attachProducts) && o.LJ(this.photoSearchPreviousPage, photoSearchBusinessEnterParams.photoSearchPreviousPage) && o.LJ(this.photoSearchPreviousSearchType, photoSearchBusinessEnterParams.photoSearchPreviousSearchType) && o.LJ(this.originIsMallTab, photoSearchBusinessEnterParams.originIsMallTab) && o.LJ(this.latestSearchId, photoSearchBusinessEnterParams.latestSearchId) && o.LJ(this.searchContext, photoSearchBusinessEnterParams.searchContext) && o.LJ(this.personalContextInfo, photoSearchBusinessEnterParams.personalContextInfo) && o.LJ(this.searchChannel, photoSearchBusinessEnterParams.searchChannel) && o.LJ(this.isFilterSearch, photoSearchBusinessEnterParams.isFilterSearch) && o.LJ(this.sortType, photoSearchBusinessEnterParams.sortType) && o.LJ(this.filterBy, photoSearchBusinessEnterParams.filterBy) && o.LJ(this.imagePath, photoSearchBusinessEnterParams.imagePath) && this.rootEnterFromType == photoSearchBusinessEnterParams.rootEnterFromType && o.LJ(this.recallShield, photoSearchBusinessEnterParams.recallShield);
    }

    public int hashCode() {
        String str = this.enterFrom;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trafficSourceList;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fromMiddleBackFromResult;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.isFromVideo;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.isFromComment;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastFromGroupId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.attachProducts;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.photoSearchPreviousPage;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.photoSearchPreviousSearchType;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.originIsMallTab;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.latestSearchId;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.searchContext;
        int hashCode14 = (hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.personalContextInfo;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.searchChannel;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num2 = this.isFilterSearch;
        int hashCode17 = (hashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sortType;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.filterBy;
        int hashCode19 = (hashCode18 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str16 = this.imagePath;
        int hashCode20 = (((hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31) + this.rootEnterFromType) * 31;
        Integer num5 = this.recallShield;
        return hashCode20 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String getEcSearchSessionId() {
        return (String) this.ecSearchSessionId$delegate.getValue();
    }

    public final String getSearchSessionId() {
        return (String) this.searchSessionId$delegate.getValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhotoSearchBusinessEnterParams(enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", trafficSourceList=");
        sb.append(this.trafficSourceList);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", fromMiddleBackFromResult=");
        sb.append(this.fromMiddleBackFromResult);
        sb.append(", isFromVideo=");
        sb.append(this.isFromVideo);
        sb.append(", isFromComment=");
        sb.append(this.isFromComment);
        sb.append(", lastFromGroupId=");
        sb.append(this.lastFromGroupId);
        sb.append(", attachProducts=");
        sb.append(this.attachProducts);
        sb.append(", photoSearchPreviousPage=");
        sb.append(this.photoSearchPreviousPage);
        sb.append(", photoSearchPreviousSearchType=");
        sb.append(this.photoSearchPreviousSearchType);
        sb.append(", originIsMallTab=");
        sb.append(this.originIsMallTab);
        sb.append(", latestSearchId=");
        sb.append(this.latestSearchId);
        sb.append(", searchContext=");
        sb.append(this.searchContext);
        sb.append(", personalContextInfo=");
        sb.append(this.personalContextInfo);
        sb.append(", searchChannel=");
        sb.append(this.searchChannel);
        sb.append(", isFilterSearch=");
        sb.append(this.isFilterSearch);
        sb.append(", sortType=");
        sb.append(this.sortType);
        sb.append(", filterBy=");
        sb.append(this.filterBy);
        sb.append(", imagePath=");
        sb.append(this.imagePath);
        sb.append(", rootEnterFromType=");
        sb.append(this.rootEnterFromType);
        sb.append(", recallShield=");
        return UC7.LIZ(sb, this.recallShield, ')');
    }

    public final String getAttachProducts() {
        return this.attachProducts;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Integer getFilterBy() {
        return this.filterBy;
    }

    public final String getFromMiddleBackFromResult() {
        return this.fromMiddleBackFromResult;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getLastFromGroupId() {
        return this.lastFromGroupId;
    }

    public final String getLatestSearchId() {
        return this.latestSearchId;
    }

    public final String getOriginIsMallTab() {
        return this.originIsMallTab;
    }

    public final String getPersonalContextInfo() {
        return this.personalContextInfo;
    }

    public final String getPhotoSearchPreviousPage() {
        return this.photoSearchPreviousPage;
    }

    public final String getPhotoSearchPreviousSearchType() {
        return this.photoSearchPreviousSearchType;
    }

    public final Integer getRecallShield() {
        return this.recallShield;
    }

    public final int getRootEnterFromType() {
        return this.rootEnterFromType;
    }

    public final String getSearchChannel() {
        return this.searchChannel;
    }

    public final String getSearchContext() {
        return this.searchContext;
    }

    public final Integer getSortType() {
        return this.sortType;
    }

    public final String getTrafficSourceList() {
        return this.trafficSourceList;
    }

    public final Integer isFilterSearch() {
        return this.isFilterSearch;
    }

    public final String isFromComment() {
        return this.isFromComment;
    }

    public final Integer isFromVideo() {
        return this.isFromVideo;
    }

    public final void setAttachProducts(String str) {
        this.attachProducts = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFilterBy(Integer num) {
        this.filterBy = num;
    }

    public final void setFilterSearch(Integer num) {
        this.isFilterSearch = num;
    }

    public final void setFromComment(String str) {
        this.isFromComment = str;
    }

    public final void setFromMiddleBackFromResult(String str) {
        this.fromMiddleBackFromResult = str;
    }

    public final void setFromVideo(Integer num) {
        this.isFromVideo = num;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setImagePath(String str) {
        this.imagePath = str;
    }

    public final void setLastFromGroupId(String str) {
        this.lastFromGroupId = str;
    }

    public final void setLatestSearchId(String str) {
        this.latestSearchId = str;
    }

    public final void setOriginIsMallTab(String str) {
        this.originIsMallTab = str;
    }

    public final void setPersonalContextInfo(String str) {
        this.personalContextInfo = str;
    }

    public final void setPhotoSearchPreviousPage(String str) {
        this.photoSearchPreviousPage = str;
    }

    public final void setPhotoSearchPreviousSearchType(String str) {
        this.photoSearchPreviousSearchType = str;
    }

    public final void setRecallShield(Integer num) {
        this.recallShield = num;
    }

    public final void setRootEnterFromType(int i) {
        this.rootEnterFromType = i;
    }

    public final void setSearchChannel(String str) {
        this.searchChannel = str;
    }

    public final void setSearchContext(String str) {
        this.searchContext = str;
    }

    public final void setSortType(Integer num) {
        this.sortType = num;
    }

    public final void setTrafficSourceList(String str) {
        this.trafficSourceList = str;
    }

    public PhotoSearchBusinessEnterParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, String str16, int i, Integer num5) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.trafficSourceList = str3;
        this.groupId = str4;
        this.fromMiddleBackFromResult = str5;
        this.isFromVideo = num;
        this.isFromComment = str6;
        this.lastFromGroupId = str7;
        this.attachProducts = str8;
        this.photoSearchPreviousPage = str9;
        this.photoSearchPreviousSearchType = str10;
        this.originIsMallTab = str11;
        this.latestSearchId = str12;
        this.searchContext = str13;
        this.personalContextInfo = str14;
        this.searchChannel = str15;
        this.isFilterSearch = num2;
        this.sortType = num3;
        this.filterBy = num4;
        this.imagePath = str16;
        this.rootEnterFromType = i;
        this.recallShield = num5;
        this.searchSessionId$delegate = C221108m2.LIZIZ(KEQ.LJLIL);
        this.ecSearchSessionId$delegate = C221108m2.LIZIZ(new AqS158S0100000_8(this, 367));
    }

    public /* synthetic */ PhotoSearchBusinessEnterParams(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num2, Integer num3, Integer num4, String str16, int i, Integer num5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? 0 : num, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? null : str9, (i2 & 1024) != 0 ? null : str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & FileUtils.BUFFER_SIZE) != 0 ? "" : str13, (i2 & 16384) == 0 ? str14 : "", (32768 & i2) != 0 ? null : str15, (65536 & i2) != 0 ? null : num2, (131072 & i2) != 0 ? null : num3, (262144 & i2) != 0 ? null : num4, (524288 & i2) != 0 ? null : str16, (1048576 & i2) != 0 ? EnumC51280KAq.MALL.getValue() : i, (i2 & 2097152) != 0 ? null : num5);
    }
}
