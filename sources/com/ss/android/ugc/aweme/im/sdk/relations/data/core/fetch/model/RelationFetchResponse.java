package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import java.util.List;

/* loaded from: classes2.dex */
public final class RelationFetchResponse extends BaseResponse {

    @InterfaceC65349Pkn("block_results")
    public List<MentionCheckResult> blockResults;

    @InterfaceC65349Pkn("followings")
    public List<? extends IMUser> followings;

    @InterfaceC65349Pkn("has_more")
    public int hasMore;

    @InterfaceC65349Pkn("hotsoon_hide_text")
    public String hotSoonNotice;

    @InterfaceC65349Pkn("hotsoon_hide_en_text")
    public String hotSoonNoticeEn;

    @InterfaceC65349Pkn("max_time")
    public long maxTime;

    @InterfaceC65349Pkn("min_time")
    public long minTime;

    @InterfaceC65349Pkn("next_req_count")
    public int nextReqCount;

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public final List<MentionCheckResult> getBlockResults() {
        return this.blockResults;
    }

    public final List<IMUser> getFollowings() {
        return this.followings;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final String getHotSoonNotice() {
        return this.hotSoonNotice;
    }

    public final String getHotSoonNoticeEn() {
        return this.hotSoonNoticeEn;
    }

    public final long getMaxTime() {
        return this.maxTime;
    }

    public final long getMinTime() {
        return this.minTime;
    }

    public final int getNextReqCount() {
        return this.nextReqCount;
    }

    public final void setBlockResults(List<MentionCheckResult> list) {
        this.blockResults = list;
    }

    public final void setFollowings(List<? extends IMUser> list) {
        this.followings = list;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setHotSoonNotice(String str) {
        this.hotSoonNotice = str;
    }

    public final void setHotSoonNoticeEn(String str) {
        this.hotSoonNoticeEn = str;
    }

    public final void setMaxTime(long j) {
        this.maxTime = j;
    }

    public final void setMinTime(long j) {
        this.minTime = j;
    }

    public final void setNextReqCount(int i) {
        this.nextReqCount = i;
    }
}
