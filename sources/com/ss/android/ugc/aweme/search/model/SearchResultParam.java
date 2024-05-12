package com.ss.android.ugc.aweme.search.model;

import X.C16880lQ;
import X.C208398Fv;
import X.C35613DyL;
import X.C50287JoR;
import X.C50492Jrk;
import X.C50948Jz6;
import X.C51244K9g;
import X.KAK;
import X.Z9N;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class SearchResultParam implements Serializable, Cloneable {
    public static final long serialVersionUID = -6308997306432769373L;
    public String appName;
    public String appTheme;
    public C208398Fv capsuleWords;
    public KAK ecomTargetTab;
    public String enterFromSecond;
    public String enterFromSub;
    public String enterMethod;
    public String eventKeyword;
    public C50287JoR filterOption;
    public String fromSearchSubtag;
    public int generalSearchSortType;
    public String groupId;
    public String hashtagId;
    public int index;
    public boolean isFeedCollected;
    public boolean isFeedCommentClicked;
    public boolean isFeedForwardClicked;
    public boolean isFeedLiked;
    public boolean isFromGeneralSug;
    public boolean isOpenNewSearchContainer;
    public int isPullRefresh;
    public boolean isResearchFilterBarShow;
    public String isRichSug;
    public String isSarRecall;
    public String keyword;
    public String landTap;
    public String lastSearchId;
    public boolean mIsFilterFromSchema;
    public C50492Jrk mTimeParam;
    public String preSearchId;
    public String prefetchId;
    public String prefetchType;
    public String queryState;
    public String realSearchWord;
    public String recreateTabName;
    public C51244K9g resultAttachCard;
    public int screenHeight;
    public int screenWidth;
    public String singleTabType;
    public String sugHint;
    public String sugShopId;
    public String sugType;
    public String sugUserId;
    public String switchTab;
    public String trendingEventId;
    public String trendingWordsId;
    public String utmSource;
    public String wordType;
    public long MODULE_RESEARCH = 1;
    public String searchFrom = "";
    public String entrySearchSource = "";
    public int forceIndex = -1;
    public String sugGenerateType = CardStruct.IStatusCode.DEFAULT;
    public int needCorrect = 1;
    public int shouldRecordInHistory = 1;
    public Map<String, Object> ecomRecomSearchParamMap = new ConcurrentHashMap();
    public final C35613DyL attachProductsInfo = new C35613DyL();
    public boolean isPreloadShopResult = false;
    public boolean isECEntranceMiddlePreload = false;
    public boolean isECEntrance = false;
    public boolean sugIsLiveSug = false;
    public boolean isSongRecognition = false;
    public String songID = null;
    public C50948Jz6 searchEnterParam = Z9N.LIZIZ.LJJLIIIJLJLI();

    public int getId() {
        int i;
        int i2 = this.index * 31;
        String str = this.keyword;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public String getLandTap() {
        String str = this.landTap;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getLastSearchId() {
        String str = this.lastSearchId;
        this.lastSearchId = null;
        return str;
    }

    public String getSearchEnterFromPage() {
        C50948Jz6 c50948Jz6 = this.searchEnterParam;
        if (c50948Jz6 != null && !TextUtils.isEmpty(c50948Jz6.getEnterSearchFrom())) {
            return this.searchEnterParam.getEnterSearchFrom();
        }
        return "";
    }

    public String getSugHint() {
        String str = this.sugHint;
        if (str == null) {
            return "";
        }
        return str;
    }

    public long getVisibleModules() {
        int i = 0;
        if (this.isResearchFilterBarShow) {
            i = (int) (0 | this.MODULE_RESEARCH);
        }
        return i;
    }

    public SearchResultParam copy() {
        try {
            return (SearchResultParam) clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.keyword = this.keyword;
            searchResultParam.index = this.index;
            searchResultParam.enterMethod = this.enterMethod;
            searchResultParam.filterOption = this.filterOption;
            searchResultParam.isOpenNewSearchContainer = this.isOpenNewSearchContainer;
            searchResultParam.searchFrom = this.searchFrom;
            searchResultParam.realSearchWord = this.realSearchWord;
            searchResultParam.needCorrect = this.needCorrect;
            searchResultParam.lastSearchId = this.lastSearchId;
            searchResultParam.shouldRecordInHistory = this.shouldRecordInHistory;
            return searchResultParam;
        }
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppTheme() {
        return this.appTheme;
    }

    public C35613DyL getAttachProductsInfo() {
        return this.attachProductsInfo;
    }

    public C208398Fv getCapsuleWords() {
        return this.capsuleWords;
    }

    public Map<String, Object> getEcomRecomSearchParamMap() {
        return this.ecomRecomSearchParamMap;
    }

    public KAK getEcomTargetTab() {
        return this.ecomTargetTab;
    }

    public String getEnterFromSecond() {
        return this.enterFromSecond;
    }

    public String getEnterFromSub() {
        return this.enterFromSub;
    }

    public String getEnterMethod() {
        return this.enterMethod;
    }

    public String getEventKeyword() {
        return this.eventKeyword;
    }

    public C50287JoR getFilterOption() {
        return this.filterOption;
    }

    public int getForceIndex() {
        return this.forceIndex;
    }

    public String getFromSearchSubtag() {
        return this.fromSearchSubtag;
    }

    public int getGeneralSearchSortType() {
        return this.generalSearchSortType;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getHashtagId() {
        return this.hashtagId;
    }

    public int getIndex() {
        return this.index;
    }

    public boolean getIsFilterFromSchema() {
        return this.mIsFilterFromSchema;
    }

    public boolean getIsFromGeneralSug() {
        return this.isFromGeneralSug;
    }

    public boolean getIsPreloadShopResult() {
        return this.isPreloadShopResult;
    }

    public int getIsPullRefresh() {
        return this.isPullRefresh;
    }

    public String getIsRichSug() {
        return this.isRichSug;
    }

    public String getIsSarRecall() {
        return this.isSarRecall;
    }

    public boolean getIsSongRecognition() {
        return this.isSongRecognition;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public int getNeedCorrect() {
        return this.needCorrect;
    }

    public String getPreSearchId() {
        return this.preSearchId;
    }

    public String getPrefetchId() {
        return this.prefetchId;
    }

    public String getPrefetchType() {
        return this.prefetchType;
    }

    public String getQueryState() {
        return this.queryState;
    }

    public String getRealSearchWord() {
        return this.realSearchWord;
    }

    public String getRecreateTabName() {
        return this.recreateTabName;
    }

    public C51244K9g getResultAttachCard() {
        return this.resultAttachCard;
    }

    public int getScreenHeight() {
        return this.screenHeight;
    }

    public int getScreenWidth() {
        return this.screenWidth;
    }

    public C50948Jz6 getSearchEnterParam() {
        return this.searchEnterParam;
    }

    public String getSearchFrom() {
        return this.searchFrom;
    }

    public int getShouldRecordInHistory() {
        return this.shouldRecordInHistory;
    }

    public String getSingleTabType() {
        return this.singleTabType;
    }

    public String getSongID() {
        return this.songID;
    }

    public String getSugGenerateType() {
        return this.sugGenerateType;
    }

    public boolean getSugIsLiveSug() {
        return this.sugIsLiveSug;
    }

    public String getSugShopId() {
        return this.sugShopId;
    }

    public String getSugType() {
        return this.sugType;
    }

    public String getSugUserId() {
        return this.sugUserId;
    }

    public String getSwitchTab() {
        return this.switchTab;
    }

    public C50492Jrk getTimeParam() {
        return this.mTimeParam;
    }

    public String getTrendingEventId() {
        return this.trendingEventId;
    }

    public String getTrendingWordsId() {
        return this.trendingWordsId;
    }

    public String getUtmSource() {
        return this.utmSource;
    }

    public String getWordType() {
        return this.wordType;
    }

    public boolean isFeedCollected() {
        return this.isFeedCollected;
    }

    public boolean isFeedCommentClicked() {
        return this.isFeedCommentClicked;
    }

    public boolean isFeedForwardClicked() {
        return this.isFeedForwardClicked;
    }

    public boolean isFeedLiked() {
        return this.isFeedLiked;
    }

    public boolean isOpenNewSearchContainer() {
        return this.isOpenNewSearchContainer;
    }

    public boolean isResearchFilterBarShow() {
        return this.isResearchFilterBarShow;
    }

    public String getEntrySearchSource(Boolean bool) {
        if (bool.booleanValue() && TextUtils.isEmpty(this.entrySearchSource)) {
            return this.enterMethod;
        }
        return this.entrySearchSource;
    }

    public SearchResultParam setAppName(String str) {
        this.appName = str;
        return this;
    }

    public SearchResultParam setAppTheme(String str) {
        this.appTheme = str;
        return this;
    }

    public SearchResultParam setCapsuleWords(C208398Fv c208398Fv) {
        this.capsuleWords = c208398Fv;
        return this;
    }

    public SearchResultParam setEcomTargetTab(KAK kak) {
        this.ecomTargetTab = kak;
        return this;
    }

    public void setEnterFromSecond(String str) {
        this.enterFromSecond = str;
    }

    public SearchResultParam setEnterFromSub(String str) {
        this.enterFromSub = str;
        return this;
    }

    public SearchResultParam setEnterMethod(String str) {
        this.enterMethod = str;
        this.entrySearchSource = str;
        return this;
    }

    public SearchResultParam setEventKeyword(String str) {
        this.eventKeyword = str;
        return this;
    }

    public void setFeedCollected(boolean z) {
        this.isFeedCollected = z;
    }

    public void setFeedCommentClicked(boolean z) {
        this.isFeedCommentClicked = z;
    }

    public void setFeedForwardClicked(boolean z) {
        this.isFeedForwardClicked = z;
    }

    public void setFeedLiked(boolean z) {
        this.isFeedLiked = z;
    }

    public SearchResultParam setFilterOption(C50287JoR c50287JoR) {
        this.filterOption = c50287JoR;
        return this;
    }

    public SearchResultParam setForceIndex(int i) {
        this.forceIndex = i;
        return this;
    }

    public SearchResultParam setFromSearchSubtag(String str) {
        this.fromSearchSubtag = str;
        return this;
    }

    public SearchResultParam setGeneralSearchSortType(int i) {
        this.generalSearchSortType = i;
        return this;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setHashtagId(String str) {
        this.hashtagId = str;
    }

    public SearchResultParam setIndex(int i) {
        this.index = i;
        return this;
    }

    public SearchResultParam setIsFilterFromSchema(boolean z) {
        this.mIsFilterFromSchema = z;
        return this;
    }

    public SearchResultParam setIsFromGeneralSug(boolean z) {
        this.isFromGeneralSug = z;
        return this;
    }

    public SearchResultParam setIsPreloadShopResult(boolean z) {
        this.isPreloadShopResult = z;
        return this;
    }

    public void setIsPullRefresh(int i) {
        this.isPullRefresh = i;
    }

    public SearchResultParam setIsRichSug(String str) {
        this.isRichSug = str;
        return this;
    }

    public SearchResultParam setIsSarRecall(String str) {
        this.isSarRecall = str;
        return this;
    }

    public void setIsSongRecognition(boolean z) {
        this.isSongRecognition = z;
    }

    public SearchResultParam setKeyword(String str) {
        this.keyword = str;
        return this;
    }

    public SearchResultParam setLandTap(String str) {
        this.landTap = str;
        return this;
    }

    public SearchResultParam setLastSearchId(String str) {
        this.lastSearchId = str;
        return this;
    }

    public SearchResultParam setNeedCorrect(int i) {
        this.needCorrect = i;
        return this;
    }

    public SearchResultParam setOpenNewSearchContainer(boolean z) {
        this.isOpenNewSearchContainer = z;
        return this;
    }

    public SearchResultParam setPreSearchId(String str) {
        this.preSearchId = str;
        return this;
    }

    public void setPrefetchId(String str) {
        this.prefetchId = str;
    }

    public void setPrefetchType(String str) {
        this.prefetchType = str;
    }

    public SearchResultParam setQueryState(String str) {
        this.queryState = str;
        return this;
    }

    public SearchResultParam setRealSearchWord(String str) {
        this.realSearchWord = str;
        return this;
    }

    public SearchResultParam setRecreateTabName(String str) {
        this.recreateTabName = str;
        return this;
    }

    public void setResearchFilterBarShow(boolean z) {
        this.isResearchFilterBarShow = z;
    }

    public SearchResultParam setResultAttachCard(C51244K9g c51244K9g) {
        this.resultAttachCard = c51244K9g;
        return this;
    }

    public SearchResultParam setScreenHeight(int i) {
        this.screenHeight = i;
        return this;
    }

    public SearchResultParam setScreenWidth(int i) {
        this.screenWidth = i;
        return this;
    }

    public SearchResultParam setSearchEnterParam(C50948Jz6 c50948Jz6) {
        this.searchEnterParam = c50948Jz6;
        return this;
    }

    public SearchResultParam setSearchFrom(String str) {
        setEnterMethod(str);
        this.searchFrom = str;
        return this;
    }

    public SearchResultParam setShouldRecordInHistory(int i) {
        this.shouldRecordInHistory = i;
        return this;
    }

    public SearchResultParam setSingleTabType(String str) {
        this.singleTabType = str;
        return this;
    }

    public void setSongID(String str) {
        this.songID = str;
    }

    public SearchResultParam setSugGenerateType(Boolean bool) {
        if (bool.booleanValue()) {
            this.sugGenerateType = "1";
        } else {
            this.sugGenerateType = CardStruct.IStatusCode.DEFAULT;
        }
        return this;
    }

    public SearchResultParam setSugHint(String str) {
        this.sugHint = str;
        return this;
    }

    public SearchResultParam setSugIsLiveSug(boolean z) {
        this.sugIsLiveSug = z;
        return this;
    }

    public SearchResultParam setSugShopId(String str) {
        this.sugShopId = str;
        return this;
    }

    public SearchResultParam setSugType(String str) {
        this.sugType = str;
        return this;
    }

    public SearchResultParam setSugUserId(String str) {
        this.sugUserId = str;
        return this;
    }

    public SearchResultParam setSwitchTab(String str) {
        this.switchTab = str;
        return this;
    }

    public SearchResultParam setTimeParam(C50492Jrk c50492Jrk) {
        this.mTimeParam = c50492Jrk;
        return this;
    }

    public SearchResultParam setTrendingEventId(String str) {
        this.trendingEventId = str;
        return this;
    }

    public SearchResultParam setTrendingWordsId(String str) {
        this.trendingWordsId = str;
        return this;
    }

    public SearchResultParam setUtmSource(String str) {
        this.utmSource = str;
        return this;
    }

    public SearchResultParam setWordType(String str) {
        this.wordType = str;
        return this;
    }

    public SearchResultParam setEnterMethod(String str, boolean z) {
        this.enterMethod = str;
        if (z) {
            this.entrySearchSource = str;
        }
        return this;
    }
}
