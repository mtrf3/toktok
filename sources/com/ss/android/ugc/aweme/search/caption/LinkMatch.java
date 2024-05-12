package com.ss.android.ugc.aweme.search.caption;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public final class LinkMatch implements Serializable {

    @InterfaceC65349Pkn("caption_anchor")
    public CaptionAnchor captionAnchor;

    @InterfaceC65349Pkn("caption_info")
    public CaptionInfo captionInfo;

    @InterfaceC65349Pkn("match_info")
    public List<MatchInfo> matchInfoList;

    @InterfaceC65349Pkn("query_limit")
    public int queryLimit;

    @InterfaceC65349Pkn("total_limit")
    public int totalLimit;

    public final CaptionAnchor getCaptionAnchor() {
        return this.captionAnchor;
    }

    public final CaptionInfo getCaptionInfo() {
        return this.captionInfo;
    }

    public final List<MatchInfo> getMatchInfoList() {
        return this.matchInfoList;
    }

    public final int getQueryLimit() {
        return this.queryLimit;
    }

    public final int getTotalLimit() {
        return this.totalLimit;
    }

    public final void setCaptionAnchor(CaptionAnchor captionAnchor) {
        this.captionAnchor = captionAnchor;
    }

    public final void setCaptionInfo(CaptionInfo captionInfo) {
        this.captionInfo = captionInfo;
    }

    public final void setMatchInfoList(List<MatchInfo> list) {
        this.matchInfoList = list;
    }

    public final void setQueryLimit(int i) {
        this.queryLimit = i;
    }

    public final void setTotalLimit(int i) {
        this.totalLimit = i;
    }
}
