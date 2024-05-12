package com.ss.android.ugc.aweme.main.homepageImpl;

import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.C2U8;
import X.C54206LPe;
import X.C54297LSr;
import X.HG3;
import X.InterfaceC55336Lng;
import X.InterfaceC55381LoP;
import X.LM2;
import X.LM4;
import X.LNZ;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class HomePageUIFrameServiceCommonImpl implements HomePageUIFrameService {
    public static final int $stable = 0;

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void afterTabChangedInMainPageFragment(String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildInboxIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildLiveIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildNoticeIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildProfileIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ ImageView buildScanIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildSearchIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View buildSpecialIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View dmEntranceView(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View.OnClickListener getBottomClick(Context context, String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ Class<? extends Fragment> getFragmentClass(String str);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ Class<? extends Activity> getHomePageInflateActivityClass();

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedLiveIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedSearchIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View getInflatedSpecialIcon(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ View.OnLongClickListener getPublishLongClickListener(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ AbstractC53892LDc getRootNode(ActivityC45651qj activityC45651qj);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ ImageView ivScanView(ActivityC45651qj activityC45651qj);

    public abstract /* synthetic */ void liveIconGenerator(LM4 lm4);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ InterfaceC55336Lng obtainSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void openSessionListActivity(ActivityC45651qj activityC45651qj, Bundle bundle);

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public abstract /* synthetic */ void removeNoticeView();

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void runInTabHostRunnable(AbsFragment fragment) {
        MainActivity mainActivity;
        o.LJIIIZ(fragment, "fragment");
        if (fragment.isViewValid()) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if ((mo49getActivity instanceof MainActivity) && (mainActivity = (MainActivity) mo49getActivity) != null) {
                mainActivity.refreshSlideSwitchCanScrollRight();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public void setTitleTabVisibility(boolean z) {
        C2U8.LIZ(new LM2(z));
    }

    @Override // com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService
    public String getTagForCurrentTabInMainPageFragment(TabChangeManager manager, String str, String str2) {
        boolean z;
        o.LJIIIZ(manager, "manager");
        if ((o.LJ("NOTIFICATION", str2) || o.LJ("USER", str2)) && !HG3.LJIILL().isLogin()) {
            z = true;
        } else {
            z = false;
        }
        String str3 = "";
        if (z) {
            InterfaceC55381LoP unloginSignUpUtils = LNZ.LIZIZ.getUnloginSignUpUtils();
            if (str2 == null) {
                str2 = "";
            }
            String LIZ = unloginSignUpUtils.LIZ(manager, str2);
            if (LIZ != null) {
                str3 = LIZ;
            }
            return str3;
        }
        return str2;
    }
}
