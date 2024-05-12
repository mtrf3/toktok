package com.ss.android.ugc.aweme.homepage;

import X.AXH;
import X.AbstractC2312495s;
import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.EE1;
import X.InterfaceC38852FMq;
import X.InterfaceC54080LKi;
import X.InterfaceC54099LLb;
import X.InterfaceC54132LMi;
import X.InterfaceC54150LNa;
import X.InterfaceC54434LXy;
import X.InterfaceC55381LoP;
import X.LCR;
import X.LL9;
import X.LLN;
import X.LLQ;
import X.LM8;
import X.LNV;
import X.LPP;
import X.LPZ;
import X.LUN;
import X.LUR;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.inflate.IPreDrawableInflate;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import java.util.List;

/* loaded from: classes10.dex */
public interface IHomePageService {
    void clearDrawableCache();

    EE1 getAntispamApiUploadTask();

    IFragmentMainPageIcon getFragmentMainPageIcon();

    LUN getHomePageBusiness();

    InterfaceC54099LLb getHomeTabTextManager();

    InterfaceC54132LMi getHomeTabViewModel(ActivityC45651qj activityC45651qj);

    LM8 getHomepageToolBar();

    LPZ getMainActivityProxy();

    LCR getMainFragmentProxy();

    InterfaceC54150LNa getMainHelper(ActivityC45651qj activityC45651qj);

    LifecycleRegistry getMainLifecycleRegistryWrapper(LifecycleOwner lifecycleOwner);

    LNV getMainPageFragmentProxy();

    ITabStrip getMainTabStrip(FrameLayout frameLayout);

    LL9 getMainTabTextSizeHelper();

    InterfaceC38852FMq getMainTaskHolder();

    EE1 getMobLaunchEventTask(boolean z, long j);

    IPreDrawableInflate getPreDrawableInflate();

    AbstractC53892LDc getRootNode(ActivityC45651qj activityC45651qj);

    AXH getSafeMainTabPreferences();

    LLN getScrollBasicChecker(ActivityC45651qj activityC45651qj);

    LLN getScrollFullChecker(ActivityC45651qj activityC45651qj, LLN lln);

    InterfaceC54434LXy getSlideGuideViewModel(ActivityC45651qj activityC45651qj);

    InterfaceC55381LoP getUnloginSignUpUtils();

    LUR getX2CInflateCommitter();

    LPP getXTabScrollProfileVM(ActivityC45651qj activityC45651qj);

    boolean hasSocialNow2Tab(ActivityC45651qj activityC45651qj);

    LLQ initTabBarLogic(AbstractC2312495s abstractC2312495s);

    boolean isPageActiveInMain(ActivityC45651qj activityC45651qj, int i);

    boolean isProfileActiveInMain(ActivityC45651qj activityC45651qj);

    void preloadMainActivityDrawable(Context context);

    void refreshXTabs(List<? extends InterfaceC54080LKi> list, ActivityC45651qj activityC45651qj);

    void updateMainLooperServiceDoFrameHandler();
}
