package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public interface IDR extends InterfaceC46246IDa {
    void deleteUserStory(int i);

    void disableHotComment(String str);

    String getContentSource();

    Context getContext();

    C2MA getCurViewHolder();

    Aweme getCurrentPlayAweme();

    String getEnterFrom(boolean z);

    String getEnterFromRequestId();

    String getEventType();

    IFeedPanelPlatformAbility getFeedPanelPlatformAbility();

    Fragment getFragment();

    String getLikeEnterMethod();

    JSONObject getMobBaseJsonObject();

    Aweme getNextAweme(Aweme aweme);

    String getOmSdkContentUrl(Aweme aweme);

    boolean getPageResumed();

    M89 getParam();

    InterfaceC222998p5 getPinchListener();

    String getPlayListIdKey();

    String getPlayListIdValue();

    String getPlayListType();

    InterfaceC46330IGg getPlayerManager();

    Aweme getPrevAweme(Aweme aweme);

    String getPreviousPage();

    String getSearchKeyword();

    String getSimKitSceneID();

    String getTabName();

    String getTracker();

    boolean getUserVisibleHint();

    C80796VnM getViewPager();

    void handleMobShowEvent();

    void handlePlay(Aweme aweme);

    void handlePlay(Aweme aweme, boolean z);

    boolean hasSlideOperation();

    void hideIvPlay();

    void hideShareStayHomeGuide(long j, long j2);

    boolean isAdHasClickRefresh();

    boolean isDetail();

    boolean isIvPlayVisible();

    boolean isResumed();

    boolean isScrollDragging();

    void makeCurrentPlayScene();

    void onPlayCompletedToShowShareGuide(String str);

    void onPlayCompletedToShowSwipeUpGuide();

    void onPlayProgressChange(String str, float f);

    void onPlayProgressChange(String str, float f, long j);

    void onPlaying(String str);

    void onPreparePlay(String str);

    void onProgressUpdated(String str, int i);

    void onRenderFirstFrame(String str);

    void onResumePlay4Landscape(String str);

    void onStoryPageSelected();

    void onVideoPaused(String str);

    boolean postDelayed(Runnable runnable, long j);

    void postRequestId();

    void resetShareButtonStatus();

    void setPageResumed(boolean z);

    void setVideoAppLogDuration(long j);

    boolean shouldShowSeekBar();

    void showFollowGuide();

    void showIvPlay();

    void showNotInterestedTutorialInternal();

    void showScrollToFeedFollowGuide();

    boolean showShareStayHomeGuide();

    void showStrengthenGuide();

    void showStrengthenGuideInternal();

    void startLineProgressBarAnimation();

    void stopLineProgressBarAnimation();

    void trackLivePlay(String str);

    boolean tryMoveToNext(boolean z);

    boolean tryMoveToPrevInBg();
}
