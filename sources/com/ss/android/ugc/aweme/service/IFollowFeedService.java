package com.ss.android.ugc.aweme.service;

import X.ActivityC45651qj;
import X.C50420Jqa;
import X.EE1;
import X.LKJ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public interface IFollowFeedService {
    BaseDetailShareVM<?, ?, Long> LIZ(Fragment fragment);

    void LIZIZ(ArrayList<String> arrayList);

    boolean LIZJ();

    LKJ LIZLLL(ActivityC45651qj activityC45651qj);

    Fragment LJ();

    boolean LJFF(C50420Jqa c50420Jqa);

    boolean LJI();

    boolean LJII(ActivityC45651qj activityC45651qj);

    void LJIIIIZZ(Context context, List<FollowingInterestUser> list);

    EE1 LJIIIZ(Context context);

    List<Aweme> LJIIJ(List<? extends FollowFeed> list);

    void LJIIJJI(Context context);

    void LJIIL();

    int LJIILIIL();

    void LJIILJJIL();

    void refreshComment(Fragment fragment);
}
