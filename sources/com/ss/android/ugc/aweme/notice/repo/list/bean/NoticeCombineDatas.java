package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeCombineDatas {

    @InterfaceC65349Pkn("follow_request")
    public final FollowRequest followRequest;

    @InterfaceC65349Pkn("live_message")
    public List<CombineLiveNotice> liveNotices;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("top_live")
    public RecommendAvatars recommendAvatars;

    @InterfaceC65349Pkn("report_inbox")
    public final List<NoticeItems> reportNotice;

    @InterfaceC65349Pkn("shop_creator_inbox")
    public List<NoticeItems> shopCreator;

    @InterfaceC65349Pkn("tiktok_shop_inbox")
    public List<NoticeItems> shopNotice;

    @InterfaceC65349Pkn("show_following_popup")
    public final Boolean showFollowingPopup;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeCombineDatas() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeCombineDatas copy$default(NoticeCombineDatas noticeCombineDatas, RecommendAvatars recommendAvatars, FollowRequest followRequest, List list, List list2, List list3, List list4, LogPbBean logPbBean, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            recommendAvatars = noticeCombineDatas.recommendAvatars;
        }
        if ((i & 2) != 0) {
            followRequest = noticeCombineDatas.followRequest;
        }
        if ((i & 4) != 0) {
            list = noticeCombineDatas.liveNotices;
        }
        if ((i & 8) != 0) {
            list2 = noticeCombineDatas.shopNotice;
        }
        if ((i & 16) != 0) {
            list3 = noticeCombineDatas.shopCreator;
        }
        if ((i & 32) != 0) {
            list4 = noticeCombineDatas.reportNotice;
        }
        if ((i & 64) != 0) {
            logPbBean = noticeCombineDatas.logPb;
        }
        if ((i & 128) != 0) {
            bool = noticeCombineDatas.showFollowingPopup;
        }
        return noticeCombineDatas.copy(recommendAvatars, followRequest, list, list2, list3, list4, logPbBean, bool);
    }

    public final NoticeCombineDatas copy(RecommendAvatars recommendAvatars, FollowRequest followRequest, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3, List<NoticeItems> list4, LogPbBean logPbBean, Boolean bool) {
        return new NoticeCombineDatas(recommendAvatars, followRequest, list, list2, list3, list4, logPbBean, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeCombineDatas)) {
            return false;
        }
        NoticeCombineDatas noticeCombineDatas = (NoticeCombineDatas) obj;
        return o.LJ(this.recommendAvatars, noticeCombineDatas.recommendAvatars) && o.LJ(this.followRequest, noticeCombineDatas.followRequest) && o.LJ(this.liveNotices, noticeCombineDatas.liveNotices) && o.LJ(this.shopNotice, noticeCombineDatas.shopNotice) && o.LJ(this.shopCreator, noticeCombineDatas.shopCreator) && o.LJ(this.reportNotice, noticeCombineDatas.reportNotice) && o.LJ(this.logPb, noticeCombineDatas.logPb) && o.LJ(this.showFollowingPopup, noticeCombineDatas.showFollowingPopup);
    }

    public int hashCode() {
        RecommendAvatars recommendAvatars = this.recommendAvatars;
        int hashCode = (recommendAvatars == null ? 0 : recommendAvatars.hashCode()) * 31;
        FollowRequest followRequest = this.followRequest;
        int hashCode2 = (hashCode + (followRequest == null ? 0 : followRequest.hashCode())) * 31;
        List<CombineLiveNotice> list = this.liveNotices;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<NoticeItems> list2 = this.shopNotice;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<NoticeItems> list3 = this.shopCreator;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<NoticeItems> list4 = this.reportNotice;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        int hashCode7 = (hashCode6 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        Boolean bool = this.showFollowingPopup;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeCombineDatas(recommendAvatars=");
        LIZ.append(this.recommendAvatars);
        LIZ.append(", followRequest=");
        LIZ.append(this.followRequest);
        LIZ.append(", liveNotices=");
        LIZ.append(this.liveNotices);
        LIZ.append(", shopNotice=");
        LIZ.append(this.shopNotice);
        LIZ.append(", shopCreator=");
        LIZ.append(this.shopCreator);
        LIZ.append(", reportNotice=");
        LIZ.append(this.reportNotice);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(", showFollowingPopup=");
        return C78920UyC.LIZIZ(LIZ, this.showFollowingPopup, ')', LIZ);
    }

    public final FollowRequest getFollowRequest() {
        return this.followRequest;
    }

    public final List<CombineLiveNotice> getLiveNotices() {
        return this.liveNotices;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final RecommendAvatars getRecommendAvatars() {
        return this.recommendAvatars;
    }

    public final List<NoticeItems> getReportNotice() {
        return this.reportNotice;
    }

    public final List<NoticeItems> getShopCreator() {
        return this.shopCreator;
    }

    public final List<NoticeItems> getShopNotice() {
        return this.shopNotice;
    }

    public final Boolean getShowFollowingPopup() {
        return this.showFollowingPopup;
    }

    public final void setLiveNotices(List<CombineLiveNotice> list) {
        this.liveNotices = list;
    }

    public final void setRecommendAvatars(RecommendAvatars recommendAvatars) {
        this.recommendAvatars = recommendAvatars;
    }

    public final void setShopCreator(List<NoticeItems> list) {
        this.shopCreator = list;
    }

    public final void setShopNotice(List<NoticeItems> list) {
        this.shopNotice = list;
    }

    public NoticeCombineDatas(RecommendAvatars recommendAvatars, FollowRequest followRequest, List<CombineLiveNotice> list, List<NoticeItems> list2, List<NoticeItems> list3, List<NoticeItems> list4, LogPbBean logPbBean, Boolean bool) {
        this.recommendAvatars = recommendAvatars;
        this.followRequest = followRequest;
        this.liveNotices = list;
        this.shopNotice = list2;
        this.shopCreator = list3;
        this.reportNotice = list4;
        this.logPb = logPbBean;
        this.showFollowingPopup = bool;
    }

    public /* synthetic */ NoticeCombineDatas(RecommendAvatars recommendAvatars, FollowRequest followRequest, List list, List list2, List list3, List list4, LogPbBean logPbBean, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : recommendAvatars, (i & 2) != 0 ? null : followRequest, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : logPbBean, (i & 128) == 0 ? bool : null);
    }
}
