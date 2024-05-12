package com.ss.android.ugc.aweme.feed.assem.ability;

import X.AbstractC55082Lja;
import X.C2II;
import X.C2K0;
import X.C2L3;
import X.IDP;
import X.IDR;
import X.InterfaceC222998p5;
import X.InterfaceC51691KQl;
import X.InterfaceC55235Lm3;
import X.LKF;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface IFeedPanelPlatformAbility extends C2K0 {
    void checkCanScrollState();

    void dismissToolTip();

    AbstractC55082Lja getAbstractFeedAdapter();

    Aweme getAwemeByIndex(int i);

    int getAwesomeSplashStatus();

    int getCurIndex();

    Aweme getCurrentAweme();

    String getCurrentAwemeId();

    int getCurrentIndex();

    InterfaceC51691KQl getFollowPresenter();

    IDR getIBaseListFragmentPanel();

    int getItemCount();

    ILoadMoreAbility getLoadMoreComponentAbility();

    JSONObject getMobBaseJsonObject();

    String getPanelEventType();

    long getPanelId();

    int getPanelPageType();

    C2L3 getPanelToolTipHelper();

    InterfaceC222998p5 getPinchListener();

    IPlayButtonAbility getPlayButtonComponentAbility();

    IPlayerComponentAbility getPlayerComponentAbility();

    IDP getPlayerController();

    LKF getSplitContainer();

    C2II getStoryFeedListHelper();

    InterfaceC55235Lm3 getVScope();

    IViewPagerComponentAbility getViewPagerComponentAbility();

    boolean isCommentDialogShowing();

    boolean isMixDetailCleanMode();

    boolean isNoDialogPopup();

    boolean isPageChangeByLatest();

    boolean isPageChangeDown();

    void loopCurrentStory();

    void onAdapterFinish();

    void onAdapterStart();

    boolean onPageSelectedToCheckCanPlay(Aweme aweme, int i, boolean z);

    void restoreStoryPlayMode();

    boolean shouldShowNewUserProgress();

    void showIvPlay();

    void showToolslTip(Aweme aweme, String str, String str2, int i);
}
