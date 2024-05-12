package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LNZ implements IHomePageService {
    public static final LNZ LIZIZ = new LNZ();
    public final /* synthetic */ IHomePageService LIZ = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void clearDrawableCache() {
        this.LIZ.clearDrawableCache();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final EE1 getAntispamApiUploadTask() {
        return this.LIZ.getAntispamApiUploadTask();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final IFragmentMainPageIcon getFragmentMainPageIcon() {
        return this.LIZ.getFragmentMainPageIcon();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LUN getHomePageBusiness() {
        return this.LIZ.getHomePageBusiness();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC54099LLb getHomeTabTextManager() {
        return this.LIZ.getHomeTabTextManager();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC54132LMi getHomeTabViewModel(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getHomeTabViewModel(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LM8 getHomepageToolBar() {
        return this.LIZ.getHomepageToolBar();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LPZ getMainActivityProxy() {
        return this.LIZ.getMainActivityProxy();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LCR getMainFragmentProxy() {
        return this.LIZ.getMainFragmentProxy();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC54150LNa getMainHelper(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getMainHelper(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LifecycleRegistry getMainLifecycleRegistryWrapper(LifecycleOwner provider) {
        o.LJIIIZ(provider, "provider");
        return this.LIZ.getMainLifecycleRegistryWrapper(provider);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LNV getMainPageFragmentProxy() {
        return this.LIZ.getMainPageFragmentProxy();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final ITabStrip getMainTabStrip(FrameLayout viewGroup) {
        o.LJIIIZ(viewGroup, "viewGroup");
        return this.LIZ.getMainTabStrip(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LL9 getMainTabTextSizeHelper() {
        return this.LIZ.getMainTabTextSizeHelper();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC38852FMq getMainTaskHolder() {
        return this.LIZ.getMainTaskHolder();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final EE1 getMobLaunchEventTask(boolean z, long j) {
        return this.LIZ.getMobLaunchEventTask(z, j);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final IPreDrawableInflate getPreDrawableInflate() {
        return this.LIZ.getPreDrawableInflate();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final AbstractC53892LDc getRootNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getRootNode(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final AXH getSafeMainTabPreferences() {
        return this.LIZ.getSafeMainTabPreferences();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LLN getScrollBasicChecker(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getScrollBasicChecker(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LLN getScrollFullChecker(ActivityC45651qj activity, LLN scrollBasicChecker) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(scrollBasicChecker, "scrollBasicChecker");
        return this.LIZ.getScrollFullChecker(activity, scrollBasicChecker);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC54434LXy getSlideGuideViewModel(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getSlideGuideViewModel(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final InterfaceC55381LoP getUnloginSignUpUtils() {
        return this.LIZ.getUnloginSignUpUtils();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LUR getX2CInflateCommitter() {
        return this.LIZ.getX2CInflateCommitter();
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LPP getXTabScrollProfileVM(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.getXTabScrollProfileVM(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final boolean hasSocialNow2Tab(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.hasSocialNow2Tab(activity);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final LLQ initTabBarLogic(AbstractC2312495s mainBottomTabView) {
        o.LJIIIZ(mainBottomTabView, "mainBottomTabView");
        return this.LIZ.initTabBarLogic(mainBottomTabView);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final boolean isPageActiveInMain(ActivityC45651qj activityC45651qj, int i) {
        return this.LIZ.isPageActiveInMain(activityC45651qj, i);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final boolean isProfileActiveInMain(ActivityC45651qj activityC45651qj) {
        return this.LIZ.isProfileActiveInMain(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void preloadMainActivityDrawable(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.preloadMainActivityDrawable(context);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void refreshXTabs(List<? extends InterfaceC54080LKi> topList, ActivityC45651qj activityC45651qj) {
        o.LJIIIZ(topList, "topList");
        this.LIZ.refreshXTabs(topList, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.homepage.IHomePageService
    public final void updateMainLooperServiceDoFrameHandler() {
        this.LIZ.updateMainLooperServiceDoFrameHandler();
    }
}
