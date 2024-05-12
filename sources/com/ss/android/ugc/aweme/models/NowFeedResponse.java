package com.ss.android.ugc.aweme.models;

import X.C16880lQ;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.ORZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.ClientControlInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.now.NowIntroductionVideoInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowFeedResponse extends BaseResponse {

    @InterfaceC65349Pkn("client_control_info")
    public final ClientControlInfo clientControlInfo;

    @InterfaceC65349Pkn("cursor")
    public final long cursor;

    @InterfaceC65349Pkn("data")
    public final List<Aweme> dataOrigin;

    @InterfaceC65349Pkn("ext_control_info")
    public final String extControlInfo;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("introduction_video_info")
    public final NowIntroductionVideoInfo introductionVideoInfo;

    @InterfaceC65349Pkn("limit_diversion_info")
    public final NowDiversionLimitInfo limitDiversionInfo;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    @InterfaceC65349Pkn("show_count")
    public final int showCount;

    @InterfaceC65349Pkn("total_count")
    public final int totalCount;

    @InterfaceC65349Pkn("user_publish_info")
    public final UserPublishInfo userPublishInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowFeedResponse)) {
            return false;
        }
        NowFeedResponse nowFeedResponse = (NowFeedResponse) obj;
        return this.cursor == nowFeedResponse.cursor && this.hasMore == nowFeedResponse.hasMore && o.LJ(this.dataOrigin, nowFeedResponse.dataOrigin) && o.LJ(this.userPublishInfo, nowFeedResponse.userPublishInfo) && this.showCount == nowFeedResponse.showCount && this.totalCount == nowFeedResponse.totalCount && o.LJ(this.extControlInfo, nowFeedResponse.extControlInfo) && o.LJ(this.clientControlInfo, nowFeedResponse.clientControlInfo) && o.LJ(this.logPbBean, nowFeedResponse.logPbBean) && o.LJ(this.introductionVideoInfo, nowFeedResponse.introductionVideoInfo) && o.LJ(this.limitDiversionInfo, nowFeedResponse.limitDiversionInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.cursor) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LLJIJIL + i) * 31;
        List<Aweme> list = this.dataOrigin;
        int hashCode = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        UserPublishInfo userPublishInfo = this.userPublishInfo;
        int hashCode2 = (((((hashCode + (userPublishInfo == null ? 0 : userPublishInfo.hashCode())) * 31) + this.showCount) * 31) + this.totalCount) * 31;
        String str = this.extControlInfo;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ClientControlInfo clientControlInfo = this.clientControlInfo;
        int hashCode4 = (hashCode3 + (clientControlInfo == null ? 0 : clientControlInfo.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        int hashCode5 = (hashCode4 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        NowIntroductionVideoInfo nowIntroductionVideoInfo = this.introductionVideoInfo;
        int hashCode6 = (hashCode5 + (nowIntroductionVideoInfo == null ? 0 : nowIntroductionVideoInfo.hashCode())) * 31;
        NowDiversionLimitInfo nowDiversionLimitInfo = this.limitDiversionInfo;
        return hashCode6 + (nowDiversionLimitInfo != null ? nowDiversionLimitInfo.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NowFeedResponse(cursor=" + this.cursor + ", hasMore=" + this.hasMore + ", dataOrigin=" + this.dataOrigin + ", userPublishInfo=" + this.userPublishInfo + ", showCount=" + this.showCount + ", totalCount=" + this.totalCount + ", extControlInfo=" + this.extControlInfo + ", clientControlInfo=" + this.clientControlInfo + ", logPbBean=" + this.logPbBean + ", introductionVideoInfo=" + this.introductionVideoInfo + ", limitDiversionInfo=" + this.limitDiversionInfo + ')';
    }

    public final List<Aweme> getData() {
        List<Aweme> list = this.dataOrigin;
        if (list != null) {
            List<Aweme> LJLL = ORZ.LJLL(list);
            Iterator<Aweme> it = LJLL.iterator();
            while (it.hasNext()) {
                it.next().setLogPbBean(this.logPbBean);
            }
            return LJLL;
        }
        return C61878OQg.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowFeedResponse(long j, boolean z, List<? extends Aweme> list, UserPublishInfo userPublishInfo, int i, int i2, String str, ClientControlInfo clientControlInfo, LogPbBean logPbBean, NowIntroductionVideoInfo nowIntroductionVideoInfo, NowDiversionLimitInfo nowDiversionLimitInfo) {
        this.cursor = j;
        this.hasMore = z;
        this.dataOrigin = list;
        this.userPublishInfo = userPublishInfo;
        this.showCount = i;
        this.totalCount = i2;
        this.extControlInfo = str;
        this.clientControlInfo = clientControlInfo;
        this.logPbBean = logPbBean;
        this.introductionVideoInfo = nowIntroductionVideoInfo;
        this.limitDiversionInfo = nowDiversionLimitInfo;
    }

    public /* synthetic */ NowFeedResponse(long j, boolean z, List list, UserPublishInfo userPublishInfo, int i, int i2, String str, ClientControlInfo clientControlInfo, LogPbBean logPbBean, NowIntroductionVideoInfo nowIntroductionVideoInfo, NowDiversionLimitInfo nowDiversionLimitInfo, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, list, userPublishInfo, i, i2, str, clientControlInfo, logPbBean, (i3 & 512) != 0 ? null : nowIntroductionVideoInfo, (i3 & 1024) == 0 ? nowDiversionLimitInfo : null);
    }
}
