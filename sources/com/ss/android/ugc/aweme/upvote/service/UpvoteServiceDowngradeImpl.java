package com.ss.android.ugc.aweme.upvote.service;

import X.ActivityC45651qj;
import X.C181627Aw;
import X.C183197Gx;
import X.C183227Ha;
import X.C183237Hb;
import X.C183247Hc;
import X.C183257Hd;
import X.C183267He;
import X.C183277Hf;
import X.C183287Hg;
import X.C183297Hh;
import X.C183307Hi;
import X.C221108m2;
import X.C62822Ol8;
import X.C71W;
import X.C76800UCe;
import X.C7HI;
import X.C7JY;
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
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UpvoteServiceDowngradeImpl implements IUpvoteService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C183247Hc.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C183257Hd.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C183227Ha.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C183267He.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C183237Hb.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C183277Hf.LJLIL);

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteReason LIZ(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final ProfileListFragment LIZIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LIZJ(List<? extends Aweme> awemeList, C7KB c7kb) {
        o.LJIIIZ(awemeList, "awemeList");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJ(String aid, String str) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJFF(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJI(Aweme aweme) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C181627Aw> LJII(ActivityC45651qj activityC45651qj) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteList LJIIIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJIIJ(int i, int i2) {
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIIJJI(String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIL(String itemId, UpvotePublishMobParam mobParam, String str, List<? extends TextExtraStruct> list, List<CommentImageModel> list2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num, boolean z2) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(mobParam, "mobParam");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILIIL(Aweme aweme, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILL() {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILLIIL(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final String LJIIZILJ(String str) {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC174526t6 LJIJJ(LifecycleOwner lifecycleOwner) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Long LJIJJLI(String aid) {
        o.LJIIIZ(aid, "aid");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJ(List list, Map map, C7KB c7kb) {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJI(UpvoteList upvoteList, UpvoteList upvoteList2) {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void clearCache() {
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC109364Qy LIZLLL() {
        return (C7HI) this.LJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200517tv LJIIIIZZ() {
        return (C183307Hi) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175126u4 LJIILJJIL() {
        return (C183197Gx) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200587u2 LJIJ() {
        return (C7JY) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C71W LJIJI() {
        return (C183297Hh) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175156u7 LJIL() {
        return (C183287Hg) this.LIZIZ.getValue();
    }
}
