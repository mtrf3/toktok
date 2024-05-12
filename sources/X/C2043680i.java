package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.80i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2043680i implements IDR {
    public final Aweme LJLIL;
    public final Context LJLILLLLZI;
    public final Fragment LJLJI;
    public final C2RC LJLJJI;
    public final M89 LJLJJL;

    @Override // X.IDR
    public final /* synthetic */ void deleteUserStory(int i) {
    }

    @Override // X.IDR
    public final /* synthetic */ void disableHotComment(String str) {
    }

    @Override // X.IDR
    public final String getContentSource() {
        return null;
    }

    @Override // X.InterfaceC46246IDa
    public final int getCurIndex() {
        return 0;
    }

    @Override // X.IDR
    public final /* synthetic */ IFeedPanelPlatformAbility getFeedPanelPlatformAbility() {
        return null;
    }

    @Override // X.InterfaceC46246IDa
    public final int getIndexByAweme(Aweme aweme) {
        return 0;
    }

    @Override // X.InterfaceC46246IDa
    public final int getItemCount() {
        return 1;
    }

    @Override // X.IDR
    public final String getLikeEnterMethod() {
        return null;
    }

    @Override // X.IDR
    public final Aweme getNextAweme(Aweme aweme) {
        return null;
    }

    @Override // X.IDR
    public final String getOmSdkContentUrl(Aweme aweme) {
        return null;
    }

    @Override // X.IDR
    public final boolean getPageResumed() {
        return true;
    }

    @Override // X.IDR
    public final InterfaceC222998p5 getPinchListener() {
        return null;
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListIdKey() {
        return "";
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListIdValue() {
        return "";
    }

    @Override // X.IDR
    public final /* synthetic */ String getPlayListType() {
        return "";
    }

    @Override // X.IDR
    public final Aweme getPrevAweme(Aweme aweme) {
        return null;
    }

    @Override // X.IDR
    public final String getSearchKeyword() {
        return null;
    }

    @Override // X.IDR
    public final /* synthetic */ String getSimKitSceneID() {
        return null;
    }

    @Override // X.IDR
    public final String getTabName() {
        return null;
    }

    @Override // X.IDR
    public final boolean getUserVisibleHint() {
        return true;
    }

    @Override // X.IDR
    public final C80796VnM getViewPager() {
        return null;
    }

    @Override // X.IDR
    public final void handleMobShowEvent() {
    }

    @Override // X.IDR
    public final void handlePlay(Aweme aweme) {
    }

    @Override // X.IDR
    public final void handlePlay(Aweme aweme, boolean z) {
    }

    @Override // X.IDR
    public final boolean hasSlideOperation() {
        return false;
    }

    @Override // X.IDR
    public final void hideIvPlay() {
    }

    @Override // X.IDR
    public final /* synthetic */ void hideShareStayHomeGuide(long j, long j2) {
    }

    @Override // X.IDR
    public final boolean isAdHasClickRefresh() {
        return false;
    }

    @Override // X.IDR
    public final boolean isDetail() {
        return false;
    }

    @Override // X.IDR
    public final boolean isIvPlayVisible() {
        return false;
    }

    @Override // X.IDR
    public final boolean isResumed() {
        return true;
    }

    @Override // X.IDR
    public final boolean isScrollDragging() {
        return false;
    }

    @Override // X.IDR
    public final /* synthetic */ void makeCurrentPlayScene() {
    }

    @Override // X.IDR
    public final void onPlayCompletedToShowShareGuide(String str) {
    }

    @Override // X.IDR
    public final void onPlayCompletedToShowSwipeUpGuide() {
    }

    @Override // X.IDR
    public final /* synthetic */ void onPlayProgressChange(String str, float f) {
        throw null;
    }

    @Override // X.IDR
    public final void onPlayProgressChange(String str, float f, long j) {
    }

    @Override // X.IDR
    public final void onPlaying(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ void onPreparePlay(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ void onProgressUpdated(String str, int i) {
    }

    @Override // X.IDR
    public final void onRenderFirstFrame(String str) {
    }

    @Override // X.IDR
    public final /* synthetic */ void onResumePlay4Landscape(String str) {
    }

    @Override // X.IDR
    public final void onStoryPageSelected() {
    }

    @Override // X.IDR
    public final /* synthetic */ void onVideoPaused(String str) {
    }

    @Override // X.IDR
    public final void postRequestId() {
    }

    @Override // X.IDR
    public final /* synthetic */ void resetShareButtonStatus() {
    }

    @Override // X.IDR
    public final void setPageResumed(boolean z) {
    }

    @Override // X.IDR
    public final void setVideoAppLogDuration(long j) {
    }

    @Override // X.IDR
    public final /* synthetic */ boolean shouldShowSeekBar() {
        return true;
    }

    @Override // X.IDR
    public final void showFollowGuide() {
    }

    @Override // X.IDR
    public final void showIvPlay() {
    }

    @Override // X.IDR
    public final void showNotInterestedTutorialInternal() {
    }

    @Override // X.IDR
    public final void showScrollToFeedFollowGuide() {
    }

    @Override // X.IDR
    public final /* synthetic */ boolean showShareStayHomeGuide() {
        return false;
    }

    @Override // X.IDR
    public final void showStrengthenGuide() {
    }

    @Override // X.IDR
    public final void showStrengthenGuideInternal() {
    }

    @Override // X.IDR
    public final void startLineProgressBarAnimation() {
    }

    @Override // X.IDR
    public final void stopLineProgressBarAnimation() {
    }

    @Override // X.IDR
    public final void trackLivePlay(String str) {
    }

    @Override // X.IDR
    public final boolean tryMoveToNext(boolean z) {
        return false;
    }

    @Override // X.IDR
    public final boolean tryMoveToPrevInBg() {
        return false;
    }

    @Override // X.IDR
    public final String getEnterFromRequestId() {
        return C227768wm.LJIILL(this.LJLJJL.getPageType(), this.LJLIL);
    }

    @Override // X.IDR
    public final String getEventType() {
        return this.LJLJJL.getEventType();
    }

    @Override // X.IDR
    public final JSONObject getMobBaseJsonObject() {
        Aweme aweme = this.LJLIL;
        int pageType = this.LJLJJL.getPageType();
        String enterMethodValue = this.LJLJJL.getEnterMethodValue();
        o.LJI(enterMethodValue);
        return V16.LJIJJ(aweme, enterMethodValue, getEventType(), pageType);
    }

    @Override // X.IDR
    public final String getPreviousPage() {
        return this.LJLJJL.getPreviousPage();
    }

    @Override // X.IDR
    public final String getTracker() {
        return this.LJLJJL.getTracker();
    }

    @Override // X.IDR
    public final InterfaceC46330IGg getPlayerManager() {
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        o.LJIIIIZZ(LJJLIIIIJ, "inst()");
        return LJJLIIIIJ;
    }

    @Override // X.IDR
    public final Context getContext() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC46246IDa
    public final C2MA getCurFeedViewHolder() {
        return this.LJLJJI;
    }

    @Override // X.IDR
    public final C2MA getCurViewHolder() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC46246IDa
    public final Aweme getCurrentAweme() {
        return this.LJLIL;
    }

    @Override // X.IDR
    public final Aweme getCurrentPlayAweme() {
        return this.LJLIL;
    }

    @Override // X.IDR
    public final Fragment getFragment() {
        return this.LJLJI;
    }

    @Override // X.IDR
    public final M89 getParam() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC46246IDa
    public final Aweme getAwemeByIndex(int i) {
        return this.LJLIL;
    }

    @Override // X.IDR
    public final String getEnterFrom(boolean z) {
        return this.LJLJJL.getFrom();
    }

    @Override // X.InterfaceC46246IDa
    public final C2MA getViewHolderByAwemeId(String str) {
        return this.LJLJJI;
    }

    @Override // X.IDR
    public final boolean postDelayed(Runnable runnable, long j) {
        C1DH.LJJIJIIJIL(400L, runnable);
        return true;
    }

    public C2043680i(Aweme aweme, PostModeDetailParams postModeDetailParams, Context context, Fragment fragment) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = context;
        this.LJLJI = fragment;
        this.LJLJJI = new C2RC(aweme);
        M89 m89 = new M89();
        if (postModeDetailParams != null) {
            m89.setPageType(postModeDetailParams.pageType);
            m89.setEventType(postModeDetailParams.eventType);
            m89.setFrom(postModeDetailParams.feedParamFrom);
            m89.setPreviousPage(postModeDetailParams.previousPage);
        }
        this.LJLJJL = m89;
    }
}
