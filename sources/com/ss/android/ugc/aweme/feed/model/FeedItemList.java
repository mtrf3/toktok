package com.ss.android.ugc.aweme.feed.model;

import X.C15280iq;
import X.C1DH;
import X.C79004UzY;
import X.F1W;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import X.RKZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.CommercePitayaInfo;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyRspStruct;
import com.ss.android.ugc.aweme.feed.model.prompt.FeedPromptStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public class FeedItemList implements InterfaceC65316PkG, IFeedItemList, F1W {
    public volatile boolean appendCache;

    @InterfaceC65349Pkn("aweme_acl")
    public AwemeACLShare awemeACLShareInfo;

    @InterfaceC65349Pkn("block_code")
    public int blockCode;

    @InterfaceC65349Pkn("card_insert_results")
    public List<CardInsertResultInfo> cardInsertResults;

    @InterfaceC65349Pkn("commerce_pitaya_info")
    public CommercePitayaInfo commercePitayaInfo;

    @InterfaceC65349Pkn("consistency_rsp")
    public ConsistencyRspStruct consistencyRsp;

    @InterfaceC65349Pkn("cursor")
    public long cursor;

    @InterfaceC65349Pkn("DebugInfo")
    public String debugInfo;

    @InterfaceC65349Pkn("disable_adjust_for_cache")
    public boolean disableAdjustForCache;

    @InterfaceC65349Pkn("enable_re_rank")
    public boolean enableReRank;

    @InterfaceC65349Pkn("error_code")
    public int error_code;

    @InterfaceC65349Pkn("extra")
    public Extra extra;
    public int fetchType;

    @InterfaceC65349Pkn("has_ad")
    public boolean hasAd;

    @InterfaceC65349Pkn("has_locate_item")
    public boolean hasLocateItem;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("is_hiding_invalid_item")
    public int hidingInvalidItem;

    @InterfaceC65349Pkn("guide_word")
    public HotSearchGuideWord hotSearchGuideWord;

    @InterfaceC65349Pkn("hotsoon_text")
    public String hotSoonText;

    @InterfaceC65349Pkn("hotsoon_filtered_count")
    public int hotsoonFilteredCount;

    @InterfaceC65349Pkn("hotsoon_has_more")
    public int hotsoonHasMore;

    @InterfaceC65349Pkn("invalid_item_count")
    public int invalidItemCount;

    @InterfaceC65349Pkn("invalid_item_id_list")
    public List<String> invalidItemIdList;

    @InterfaceC65349Pkn("invalid_item_text")
    public String invalidItemText;

    @InterfaceC65349Pkn("is_clear_invalid_item")
    public int isClearInvalidItem;
    public boolean isFromCacheFiled;
    public boolean isFromLocalCache;
    public boolean isFromSplitData;
    public boolean isFromUnusedFeed;

    @InterfaceC65349Pkn("is_non_personalized")
    public boolean isNonPersonalized;

    @InterfaceC65349Pkn("aweme_list")
    public List<Aweme> items;
    public String lastRequestId;
    public Map<String, String> localExtra = new HashMap();

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn(alternate = {"max_time"}, value = "max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn(alternate = {"min_time"}, value = "min_cursor")
    public long minCursor;
    public transient Long networkInfoKey;
    public transient RKZ pbData;

    @InterfaceC65349Pkn("preload_ads")
    public List<Aweme> preloadAds;

    @InterfaceC65349Pkn("proactive_login_config")
    public String proactiveLoginConfig;

    @InterfaceC65349Pkn("prompt")
    public FeedPromptStruct promptResult;

    @InterfaceC65349Pkn("refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("status_code")
    public int status_code;

    @InterfaceC65349Pkn("status_msg")
    public String status_msg;

    @InterfaceC65349Pkn("topview_over_delivery_result")
    public String topViewOverDeliveryResult;

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FeedItemList m120clone() {
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        feedItemList.items = C1DH.LJFF(this.items);
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        feedItemList.awemeACLShareInfo = this.awemeACLShareInfo;
        feedItemList.debugInfo = this.debugInfo;
        return feedItemList;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.IFeedItemList
    public List<Aweme> getItems() {
        List<Aweme> list = this.items;
        if (list == null || list.size() <= 0) {
            return this.items;
        }
        try {
            ArrayList arrayList = new ArrayList(this.items);
            if (needSetPbToAweme(arrayList)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Aweme) it.next()).setLogPbBean(this.logPb);
                }
            }
        } catch (Exception e) {
            C15280iq.LIZIZ("FeedItemList", e.toString());
        }
        return this.items;
    }

    public boolean isForceAppend() {
        if (this.replaceFake || this.appendCache) {
            return true;
        }
        return false;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public int size() {
        if (C79004UzY.LJJIFFI(this.items)) {
            return 0;
        }
        return this.items.size();
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    private boolean needSetPbToAweme(List<Aweme> list) {
        if (list == null || list.size() == 0 || ((Aweme) ListProtector.get(list, 0)).getLogPbBean() != null) {
            return false;
        }
        return true;
    }

    public FeedItemList setIsNonPersonalized(boolean z) {
        this.isNonPersonalized = z;
        return this;
    }

    @Override // X.F1W
    public void setNetworkInfoKey(Long l) {
        this.networkInfoKey = l;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
