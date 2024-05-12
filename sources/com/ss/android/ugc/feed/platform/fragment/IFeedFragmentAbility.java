package com.ss.android.ugc.feed.platform.fragment;

import X.C2K0;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;

/* loaded from: classes2.dex */
public interface IFeedFragmentAbility extends C2K0 {
    ILoadMoreAbility PZ();

    IPageStateAbility RP();

    IRefreshAbility YE();

    IViewPagerComponentAbility getViewPagerComponentAbility();
}
