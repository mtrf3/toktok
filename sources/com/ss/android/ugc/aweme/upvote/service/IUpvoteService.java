package com.ss.android.ugc.aweme.upvote.service;

import X.ActivityC45651qj;
import X.C181627Aw;
import X.C71W;
import X.C76800UCe;
import X.C7KB;
import X.InterfaceC109364Qy;
import X.InterfaceC174526t6;
import X.InterfaceC175126u4;
import X.InterfaceC175156u7;
import X.InterfaceC200517tv;
import X.InterfaceC200587u2;
import X.InterfaceC65784Pro;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IUpvoteService {
    UpvoteReason LIZ(String str);

    ProfileListFragment LIZIZ();

    void LIZJ(List<? extends Aweme> list, C7KB c7kb);

    InterfaceC109364Qy LIZLLL();

    void LJ(String str, String str2);

    boolean LJFF(String str);

    boolean LJI(Aweme aweme);

    AssemViewModel<C181627Aw> LJII(ActivityC45651qj activityC45651qj);

    InterfaceC200517tv LJIIIIZZ();

    UpvoteList LJIIIZ(String str);

    int LJIIJ(int i, int i2);

    boolean LJIIJJI(String str);

    void LJIIL(String str, UpvotePublishMobParam upvotePublishMobParam, String str2, List<? extends TextExtraStruct> list, List<CommentImageModel> list2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num, boolean z2);

    void LJIILIIL(Aweme aweme, String str);

    InterfaceC175126u4 LJIILJJIL();

    void LJIILL();

    void LJIILLIIL(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    String LJIIZILJ(String str);

    InterfaceC200587u2 LJIJ();

    C71W LJIJI();

    InterfaceC174526t6 LJIJJ(LifecycleOwner lifecycleOwner);

    Long LJIJJLI(String str);

    InterfaceC175156u7 LJIL();

    void LJJ(List list, Map map, C7KB c7kb);

    void LJJI(UpvoteList upvoteList, UpvoteList upvoteList2);

    void clearCache();
}
