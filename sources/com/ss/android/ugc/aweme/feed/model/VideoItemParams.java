package com.ss.android.ugc.aweme.feed.model;

import X.AnonymousClass901;
import X.C74R;
import X.C78983UzD;
import X.C7G9;
import X.C85C;
import X.C91Z;
import X.InterfaceC213078Xv;
import X.M89;
import androidx.fragment.app.Fragment;
import com.bytedance.touchpoint.core.model.TextLink;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class VideoItemParams implements InterfaceC213078Xv {
    public String adapterType;
    public BaseFeedPageParams baseFeedPageParams;
    public C7G9 commodityCard;
    public C91Z component;
    public int currentPosition;
    public DataCenter dataCenter;
    public Fragment fragment;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public C74R mAdOpenCallBack;
    public Aweme mAweme;
    public int mAwemeFromPage;
    public volatile String mEnterMethodValue;
    public volatile String mEventType;
    public String mFrom;
    public volatile int mPageType;
    public volatile JSONObject mRequestId;
    public Aweme mWidgetAweme;
    public int storyPosition;
    public TextLink textLink;
    public String trackerData;
    public C85C videoCellDescAbility;
    public String fromTab = "HOME";
    public String toTab = "HOME";

    public static VideoItemParams newBuilder() {
        return new VideoItemParams();
    }

    @Override // X.InterfaceC213078Xv
    public Aweme getAweme() {
        return this.mAweme;
    }

    public VideoItemParams setAdOpenCallBack(C74R c74r) {
        this.mAdOpenCallBack = c74r;
        return this;
    }

    public void setAweme(Aweme aweme) {
        this.mAweme = aweme;
    }

    public VideoItemParams setAwemeFromPage(int i) {
        this.mAwemeFromPage = i;
        return this;
    }

    public VideoItemParams setBaseFeedParams(BaseFeedPageParams baseFeedPageParams) {
        this.baseFeedPageParams = baseFeedPageParams;
        return this;
    }

    public VideoItemParams setCommodityCard(C7G9 c7g9) {
        this.commodityCard = c7g9;
        return this;
    }

    public VideoItemParams setComponent(C91Z c91z) {
        this.component = c91z;
        return this;
    }

    public VideoItemParams setDataCenter(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment) {
        this.fragment = fragment;
        return this;
    }

    public VideoItemParams setFrom(String str) {
        this.mFrom = str;
        return this;
    }

    public VideoItemParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public VideoItemParams setFromTab(String str) {
        this.fromTab = str;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public VideoItemParams setToTab(String str) {
        this.toTab = str;
        return this;
    }

    public VideoItemParams setVideoCellDescAbility(C85C c85c) {
        this.videoCellDescAbility = c85c;
        return this;
    }

    public VideoItemParams setwidgetAweme(Aweme aweme) {
        this.mWidgetAweme = aweme;
        return this;
    }

    public static VideoItemParams newBuilder(BaseFeedPageParams baseFeedPageParams, AnonymousClass901 anonymousClass901, C91Z c91z, Fragment fragment, String str, DataCenter dataCenter, C85C c85c, C7G9 c7g9) {
        VideoItemParams videoItemParams = new VideoItemParams();
        videoItemParams.setEventType(baseFeedPageParams.eventType);
        videoItemParams.setMyProfile(baseFeedPageParams.isMyProfile);
        videoItemParams.setPageType(baseFeedPageParams.pageType);
        videoItemParams.setFromPostList(baseFeedPageParams.isFromPostList);
        videoItemParams.setFragment(fragment);
        videoItemParams.setEnterMethodValue(str);
        videoItemParams.setDataCenter(dataCenter);
        videoItemParams.setComponent(c91z);
        videoItemParams.setBaseFeedParams(baseFeedPageParams);
        videoItemParams.setVideoCellDescAbility(c85c);
        videoItemParams.setFrom(baseFeedPageParams.param.getFrom());
        videoItemParams.setCommodityCard(c7g9);
        videoItemParams.setAwemeFromPage(baseFeedPageParams.awemeFromPage);
        if (baseFeedPageParams.eventType == null) {
            C78983UzD.LJIILL("event type null ");
        }
        M89 m89 = baseFeedPageParams.param;
        if (m89 != null) {
            videoItemParams.trackerData = m89.getTracker();
        }
        if (anonymousClass901 != null) {
            videoItemParams.setAdOpenCallBack(anonymousClass901.d2());
        }
        return videoItemParams;
    }
}
