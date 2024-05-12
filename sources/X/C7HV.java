package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteReason;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.service.IUpvoteService;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7HV, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7HV implements IUpvoteService {
    public static final C7HV LIZIZ = new C7HV();
    public final /* synthetic */ IUpvoteService LIZ = UpvoteServiceImpl.LJJIFFI();

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteReason LIZ(String str) {
        return this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final ProfileListFragment LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LIZJ(List<? extends Aweme> awemeList, C7KB c7kb) {
        o.LJIIIZ(awemeList, "awemeList");
        this.LIZ.LIZJ(awemeList, c7kb);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC109364Qy LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJ(String aid, String str) {
        o.LJIIIZ(aid, "aid");
        this.LIZ.LJ(aid, str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJFF(String aid) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.LJFF(aid);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJI(Aweme aweme) {
        return this.LIZ.LJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final AssemViewModel<C181627Aw> LJII(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LJII(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200517tv LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final UpvoteList LJIIIZ(String aid) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.LJIIIZ(aid);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final int LJIIJ(int i, int i2) {
        return this.LIZ.LJIIJ(i, i2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final boolean LJIIJJI(String str) {
        return this.LIZ.LJIIJJI(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIIL(String itemId, UpvotePublishMobParam mobParam, String str, List<? extends TextExtraStruct> list, List<CommentImageModel> list2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Integer num, boolean z2) {
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(mobParam, "mobParam");
        this.LIZ.LJIIL(itemId, mobParam, str, list, list2, z, interfaceC65784Pro, num, z2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILIIL(Aweme aweme, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LJIILIIL(aweme, enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175126u4 LJIILJJIL() {
        return this.LIZ.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJIILLIIL(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ.LJIILLIIL(str, z, upvotePublishMobParam, z2, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final String LJIIZILJ(String str) {
        return this.LIZ.LJIIZILJ(str);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC200587u2 LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final C71W LJIJI() {
        return this.LIZ.LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC174526t6 LJIJJ(LifecycleOwner lifecycleOwner) {
        return this.LIZ.LJIJJ(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final Long LJIJJLI(String aid) {
        o.LJIIIZ(aid, "aid");
        return this.LIZ.LJIJJLI(aid);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final InterfaceC175156u7 LJIL() {
        return this.LIZ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJ(List list, java.util.Map map, C7KB c7kb) {
        this.LIZ.LJJ(list, map, c7kb);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void LJJI(UpvoteList upvoteList, UpvoteList upvoteList2) {
        this.LIZ.LJJI(upvoteList, upvoteList2);
    }

    @Override // com.ss.android.ugc.aweme.upvote.service.IUpvoteService
    public final void clearCache() {
        this.LIZ.clearCache();
    }
}
