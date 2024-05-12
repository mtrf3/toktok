package com.ss.android.ugc.aweme.service;

import X.ActivityC45651qj;
import X.C54406LWw;
import X.EnumC54603Lbr;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;

/* loaded from: classes10.dex */
public interface IFeedSkylightService {
    BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment);

    StoryGetFeedByPageResponse LIZIZ(long j, String str, EnumC54603Lbr enumC54603Lbr);

    void LIZJ(SocialFriendsFeedFragment socialFriendsFeedFragment, boolean z);

    void LIZLLL(Fragment fragment, String str);

    boolean LJ(ActivityC45651qj activityC45651qj);

    boolean LJFF(Fragment fragment);

    void LJI(Fragment fragment, C54406LWw c54406LWw);

    void LJII(Fragment fragment);
}
