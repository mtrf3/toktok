package com.ss.android.ugc.aweme.friendstab.service;

import X.ActivityC45651qj;
import X.C8W0;
import X.EnumC36206EIw;
import X.LGH;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.friendstab.model.SingleTabCounter;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public interface ISocial2TabDelegateService {
    boolean checkSearchRestriction();

    boolean friendsTabStylePrivacyHint();

    LGH generateToolbarIconView(Context context);

    List<User> getEducateAvatarUserList();

    List<String> getEducateItemIdList();

    Fragment getFriendsTabFragment();

    BottomTabProtocol getFriendsTabProtocol();

    List<Integer> getSocial2TabFeedTypeList();

    String getSocial2TabTabName();

    C8W0 initFriendsTabMainPageFragmentAssem();

    C8W0 initSocial2TabAssem(ActivityC45651qj activityC45651qj, ExecutorService executorService);

    void initialize(ActivityC45651qj activityC45651qj, boolean z);

    ArrayList<SingleTabCounter> multiCounterSnapshot();

    void onMultiTabLanding(String str);

    void preloadFriendsTabViews(Context context);

    void registerRedDotBytesync();

    void runColdStartTaskV2(boolean z, EnumC36206EIw enumC36206EIw);

    boolean shouldInitSocial2Tab();

    boolean shouldShowFriendsTab();

    void showFriendsIntroSheet();

    void social2TabPublishLanding(Context context);

    void tryToShowForcePermissionDialog();
}
