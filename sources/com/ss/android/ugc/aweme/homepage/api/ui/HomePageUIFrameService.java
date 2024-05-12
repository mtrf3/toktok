package com.ss.android.ugc.aweme.homepage.api.ui;

import X.AbstractC53892LDc;
import X.ActivityC45651qj;
import X.C54206LPe;
import X.C54297LSr;
import X.InterfaceC55336Lng;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.main.TabChangeManager;

/* loaded from: classes10.dex */
public interface HomePageUIFrameService {
    void afterTabChangedInMainPageFragment(String str);

    View buildInboxIcon(ActivityC45651qj activityC45651qj);

    View buildLiveIcon(ActivityC45651qj activityC45651qj);

    View buildNoticeIcon(ActivityC45651qj activityC45651qj);

    View buildProfileIcon(ActivityC45651qj activityC45651qj);

    ImageView buildScanIcon(ActivityC45651qj activityC45651qj);

    View buildSearchIcon(ActivityC45651qj activityC45651qj);

    View buildSpecialIcon(ActivityC45651qj activityC45651qj);

    View dmEntranceView(ActivityC45651qj activityC45651qj);

    View.OnClickListener getBottomClick(Context context, String str);

    Class<? extends Fragment> getFragmentClass(String str);

    Class<? extends Activity> getHomePageInflateActivityClass();

    View getInflatedLiveIcon(ActivityC45651qj activityC45651qj);

    View getInflatedSearchIcon(ActivityC45651qj activityC45651qj);

    View getInflatedSpecialIcon(ActivityC45651qj activityC45651qj);

    View.OnLongClickListener getPublishLongClickListener(ActivityC45651qj activityC45651qj);

    AbstractC53892LDc getRootNode(ActivityC45651qj activityC45651qj);

    String getTagForCurrentTabInMainPageFragment(TabChangeManager tabChangeManager, String str, String str2);

    ImageView ivScanView(ActivityC45651qj activityC45651qj);

    InterfaceC55336Lng obtainSwitchHelper(Context context, C54206LPe c54206LPe, C54297LSr c54297LSr);

    void openSessionListActivity(ActivityC45651qj activityC45651qj, Bundle bundle);

    void removeNoticeView();

    void runInTabHostRunnable(AbsFragment absFragment);

    void setTitleTabVisibility(boolean z);
}
