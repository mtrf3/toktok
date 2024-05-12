package com.ss.android.ugc.aweme.follow.presenter;

import X.C16880lQ;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.follow.LastViewData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class FollowFeedList extends BaseResponse implements Cloneable, InterfaceC65316PkG {

    @InterfaceC65349Pkn("blank_panel_text")
    public String blankPanelText;

    @InterfaceC65349Pkn("snapshot_control")
    public int cacheControl;
    public long cursor;

    @InterfaceC65349Pkn("err_msg")
    public String errMsg;

    @InterfaceC65349Pkn("feed_type")
    public int feedType;

    @InterfaceC65349Pkn("fetch_recommend")
    public int fetchRecommend;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("is_recommend")
    public int isRecommend;

    @InterfaceC65349Pkn("last_view")
    public LastViewData lastViewData;
    public int level;

    @InterfaceC65349Pkn("log_pb")
    public LogPbBean logPb;

    @InterfaceC65349Pkn("data")
    public List<FollowFeed> mItems;

    @InterfaceC65349Pkn("max_cursor")
    public long maxCursor;

    @InterfaceC65349Pkn("min_cursor")
    public long minCursor;

    @InterfaceC65349Pkn("need_change_snapshot")
    public int needCache;

    @InterfaceC65349Pkn("need_delete_snapshot")
    public int needDeleteCache;

    @InterfaceC65349Pkn("new_item_count")
    public int newItemCount;

    @InterfaceC65349Pkn("new_room_count")
    public int newLiveCount;

    @InterfaceC65349Pkn("preload_data")
    public int preloadData;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @InterfaceC65349Pkn("up_phone_notice")
    public int upPhoneNotice;

    @InterfaceC65349Pkn("update_item_count")
    public int updateItemCount;

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean needCache() {
        if (this.needCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needDeleteCache() {
        if (this.needDeleteCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needUseCache() {
        if (this.cacheControl == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FollowFeedList m121clone() {
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            followFeedList.updateItemCount = this.updateItemCount;
            followFeedList.blankPanelText = this.blankPanelText;
            followFeedList.preloadData = this.preloadData;
            return followFeedList;
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public String getBlankPanelText() {
        return this.blankPanelText;
    }

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public LastViewData getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    public int getPreloadData() {
        return this.preloadData;
    }

    @Override // X.InterfaceC65316PkG
    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public int getUpdateItemCount() {
        return this.updateItemCount;
    }

    public void setBlankPanelText(String str) {
        this.blankPanelText = str;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFetchRecommend(int i) {
        this.fetchRecommend = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setIsRecommend(int i) {
        this.isRecommend = i;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(LastViewData lastViewData) {
        this.lastViewData = lastViewData;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setNewItemCount(int i) {
        this.newItemCount = i;
    }

    public void setNewLiveCount(int i) {
        this.newLiveCount = i;
    }

    public void setPreloadData(int i) {
        this.preloadData = i;
    }

    @Override // X.InterfaceC65316PkG
    public void setRequestId(String str) {
        this.requestId = str;
        List<FollowFeed> list = this.mItems;
        if (list == null) {
            return;
        }
        Iterator<FollowFeed> it = list.iterator();
        while (it.hasNext()) {
            it.next().setRequestId(str);
        }
    }

    public void setUpPhoneNotice(int i) {
        this.upPhoneNotice = i;
    }

    public void setUpdateItemCount(int i) {
        this.updateItemCount = i;
    }
}
