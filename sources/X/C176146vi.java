package X;

import android.content.Context;
import android.widget.Toast;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.IManagementTitleAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.6vi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176146vi implements InterfaceC176256vt {
    public final /* synthetic */ Comment LIZ;
    public final /* synthetic */ InterfaceC174756tT LIZIZ;
    public final /* synthetic */ InterfaceC174316sl LIZJ;
    public final /* synthetic */ CommentListFragment LIZLLL;

    @Override // X.InterfaceC176256vt
    public final void LJI() {
        if (this.LIZLLL.jn()) {
            return;
        }
        C74Z.LJIJJLI(this.LIZLLL.LJLILLLLZI.getEnterFrom(), 0, this.LIZ);
        LJIILL(0, 0, R.string.ga6, 0, 0, this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LJIIJ() {
        if (this.LIZLLL.jn()) {
            return;
        }
        C74Z.LJIJJLI(this.LIZLLL.LJLILLLLZI.getEnterFrom(), 1, this.LIZ);
        LJIILL(1, 1, R.string.ga4, R.raw.icon_tick_fill, R.attr.e8, this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LIZ() {
        this.LIZLLL.io(this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LIZIZ() {
        CommentListFragment commentListFragment = this.LIZLLL;
        InterfaceC174756tT interfaceC174756tT = this.LIZIZ;
        commentListFragment.getClass();
        if (interfaceC174756tT != null) {
            interfaceC174756tT.resetTranslate();
        }
        CommentListFragment commentListFragment2 = this.LIZLLL;
        if (commentListFragment2.LJLJI != null) {
            C74Z.LJJIJIL(this.LIZ, "tap_comment", this.LIZLLL.LJLILLLLZI.getEnterFrom(), C178406zM.LJ(commentListFragment2.LLIZLLLIL, this.LIZ), this.LIZLLL.LJLJI);
        }
    }

    @Override // X.InterfaceC176256vt
    public final void LIZJ() {
        CommentListFragment commentListFragment = this.LIZLLL;
        InterfaceC174756tT interfaceC174756tT = this.LIZIZ;
        commentListFragment.getClass();
        if (interfaceC174756tT != null) {
            interfaceC174756tT.translate();
        }
        CommentListFragment commentListFragment2 = this.LIZLLL;
        if (commentListFragment2.LJLJI != null) {
            int LJ = C178406zM.LJ(commentListFragment2.LLIZLLLIL, this.LIZ);
            CommentListFragment commentListFragment3 = this.LIZLLL;
            commentListFragment3.LLJILJIL.LJLJI = true;
            C74Z.LJJIJL(this.LIZ, "tap_comment", commentListFragment3.LJLILLLLZI.getEnterFrom(), LJ, this.LIZLLL.LJLJI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.4KX] */
    @Override // X.InterfaceC176256vt
    public final void LIZLLL() {
        boolean LIZ;
        ActivityC45651qj activity = this.LIZLLL.mo49getActivity();
        final Comment comment = this.LIZ;
        final Aweme aweme = this.LIZLLL.LJLJI;
        o.LJIIIZ(activity, "activity");
        if (C4LD.LIZIZ.LJIJI(comment)) {
            LIZ = false;
        } else {
            LIZ = C7GJ.LIZ(comment, aweme);
        }
        C4LD.LIZ.LJIIIZ(activity, aweme, comment, C0H1.LIZ("enter_method", "icon"), C7GJ.LIZ(comment, aweme), LIZ, new C62415OeZ() { // from class: X.4KX
            public final /* synthetic */ String LIZJ = "icon";

            @Override // X.C62415OeZ, X.InterfaceC110854Wr
            public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
                o.LJIIIZ(channel, "channel");
                o.LJIIIZ(context, "context");
                Aweme aweme2 = Aweme.this;
                Comment comment2 = comment;
                String key = channel.key();
                String str = this.LIZJ;
                C188727au c188727au = new C188727au();
                if (aweme2 != null) {
                    c188727au.LJI("group_id", aweme2.getAid());
                    c188727au.LJI("author_id", aweme2.getAuthorUid());
                }
                if (comment2 != null) {
                    c188727au.LJI("comment_id", comment2.getCid());
                    c188727au.LJI("comment_author_id", comment2.getUser().getUid());
                }
                c188727au.LJI("platform", key);
                c188727au.LJI("enter_method", str);
                FMX.LJIIL("share_comment", c188727au.LIZ);
            }
        });
        C1793872g.LJIIJJI(comment, aweme, "share_comment", V16.LJJIZ(comment));
    }

    @Override // X.InterfaceC176256vt
    public final void LJ() {
        String diggTye;
        int i;
        if (this.LIZLLL.jn()) {
            return;
        }
        CommentListFragment commentListFragment = this.LIZLLL;
        Comment comment = this.LIZ;
        commentListFragment.mo49getActivity();
        if (C2NU.LIZ.LIZIZ()) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                J9P.LIZJ(commentListFragment, commentListFragment.getEventType(), "like_comment", null, null);
                return;
            }
            if (comment != null) {
                C175416uX c175416uX = C176096vd.LJ;
                c175416uX.LIZIZ();
                c175416uX.LIZIZ = System.currentTimeMillis();
                if (comment.isUserBuried()) {
                    diggTye = String.valueOf(4);
                } else {
                    diggTye = String.valueOf(3);
                }
                C174616tF c174616tF = commentListFragment.LLILLL;
                if (c174616tF != null && c174616tF.LJIL()) {
                    o.LJIIIZ(diggTye, "diggTye");
                    c175416uX.LJI = diggTye;
                    c175416uX.LJFF = C176096vd.LIZIZ();
                    c175416uX.LIZLLL = System.currentTimeMillis();
                    if (commentListFragment.LLILLL.LJIILL(comment.getCid(), comment.getAwemeId(), diggTye, commentListFragment.LJLILLLLZI.getCommentTag())) {
                        if (diggTye.equals(String.valueOf(3))) {
                            C26045AKb c26045AKb = new C26045AKb(commentListFragment);
                            c26045AKb.LJIIIIZZ(R.string.k3);
                            c26045AKb.LJIIJ();
                            C74Z.LIZLLL(comment, "comment_dislike_toast_show");
                        } else {
                            C26045AKb c26045AKb2 = new C26045AKb(commentListFragment);
                            c26045AKb2.LJIIIIZZ(R.string.k1);
                            c26045AKb2.LJIIJ();
                            C74Z.LIZLLL(comment, "comment_dislike_cancel_toast_show");
                        }
                    }
                    commentListFragment.LLILLL.LJLIL.getClass();
                }
                if (comment.getUser() != null) {
                    commentListFragment.LLJJIJI = comment.getUser().getUid();
                }
                commentListFragment.LLJJIII = comment.getCid();
                if (comment.getCommentType() == 2) {
                    i = commentListFragment.LLIZLLLIL.LJFF(comment.getReplyId());
                } else if (comment.getCommentType() == 1) {
                    i = commentListFragment.LLIZLLLIL.LJFF(comment.getCid());
                } else {
                    i = -1;
                }
                if (commentListFragment.LJLJI != null) {
                    boolean LJJIZ = V16.LJJIZ(comment);
                    if (diggTye.equals(String.valueOf(3))) {
                        C74Z.LIZJ("comment_dislike_click", comment, commentListFragment.LJLJI, i, true, LJJIZ);
                        return;
                    } else {
                        C74Z.LIZJ("comment_dislike_cancel_click", comment, commentListFragment.LJLJI, i, true, LJJIZ);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C26045AKb c26045AKb3 = new C26045AKb(commentListFragment);
        c26045AKb3.LJIIIIZZ(R.string.img);
        c26045AKb3.LJIIJ();
    }

    @Override // X.InterfaceC176256vt
    public final void LJFF() {
        String cid = this.LIZ.getCid();
        String enterFrom = this.LIZLLL.LJLILLLLZI.getEnterFrom();
        C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
        if (cid == null) {
            cid = "";
        }
        LIZLLL.LJIIIZ("comment_id", cid);
        LIZLLL.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("comment_long_press_popup_batch_ck", LIZLLL.LIZ);
        CommentListFragment commentListFragment = this.LIZLLL;
        if (commentListFragment.LLLLLJIL) {
            IManagementTitleAbility LIZ = C178466zS.LIZ(commentListFragment, commentListFragment);
            if (LIZ != null) {
                LIZ.MN();
                return;
            }
            return;
        }
        commentListFragment.yn("pop_up");
    }

    @Override // X.InterfaceC176256vt
    public final void LJII() {
        CommentListFragment commentListFragment = this.LIZLLL;
        if (commentListFragment.LLILZLL.LJLJLJ != null) {
            commentListFragment.Po(this.LIZJ, commentListFragment.getContext());
        } else {
            commentListFragment.om(this.LIZJ, false);
        }
    }

    @Override // X.InterfaceC176256vt
    public final void LJIIIIZZ() {
        this.LIZLLL.em(this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LJIIIZ() {
        this.LIZLLL.ao(this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LJIIJJI() {
        this.LIZLLL.hm(this.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LJIIL() {
        CommentListFragment commentListFragment = this.LIZLLL;
        Comment comment = this.LIZ;
        Aweme aweme = commentListFragment.LJLJI;
        CommentSharePackage.Companion.getClass();
        CommentSharePackage LIZIZ = C119414mP.LIZIZ(aweme, comment, true, null);
        C62394OeE c62394OeE = new C62394OeE();
        c62394OeE.LJIIZILJ = LIZIZ;
        c62394OeE.LJIILIIL = R.string.r5i;
        c62394OeE.LJIILLIIL = R.string.cg_;
        ShareDependService.LIZ.getClass();
        C16880lQ.LIZ(C44498HdG.LIZ().LJI(commentListFragment.mo49getActivity(), new C62387Oe7(c62394OeE), R.style.a6y));
        C1793872g.LJIIJJI(comment, commentListFragment.LJLJI, "send_to_friend", V16.LJJIZ(comment));
    }

    @Override // X.InterfaceC176256vt
    public final void LJIILJJIL() {
        this.LIZLLL.pm(this.LIZJ);
    }

    @Override // X.InterfaceC176256vt
    public final void onCancel() {
        boolean z;
        String str;
        String enterFrom = this.LIZLLL.LJLILLLLZI.getEnterFrom();
        if (this.LIZ.getAliasAweme() != null) {
            z = true;
        } else {
            z = false;
        }
        C188727au LJIIIIZZ = JBR.LJIIIIZZ("enter_from", enterFrom, "enter_method", "click_blank");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJIIIIZZ.LJI("is_video", str);
        FMX.LJIIL("close_comment_tab", LJIIIIZZ.LIZ);
    }

    @Override // X.InterfaceC176256vt
    public final void LJIILIIL(CommentVideoModel.Type type, Comment comment) {
        if (this.LIZLLL.mo49getActivity() != null && MSAdaptionService.LJIIL().LIZIZ(this.LIZLLL.mo49getActivity())) {
            C16880lQ.LLZILL(Toast.makeText(this.LIZLLL.mo49getActivity(), this.LIZLLL.getString(R.string.f1i), 0));
        } else {
            this.LIZLLL.LLIZ.LJJJJIZL(comment, type, "comment_press");
        }
    }

    public C176146vi(CommentListFragment commentListFragment, Comment comment, C176216vp c176216vp, C175976vR c175976vR) {
        this.LIZLLL = commentListFragment;
        this.LIZ = comment;
        this.LIZIZ = c176216vp;
        this.LIZJ = c175976vR;
    }

    public final void LJIILL(int i, final int i2, final int i3, final int i4, final int i5, final Comment comment) {
        C10K<BaseResponse> collectComment = UserFavoritesApi.LIZ.collectComment(comment.getCid(), i);
        if (collectComment != null) {
            C176116vf c176116vf = C176096vd.LIZLLL;
            c176116vf.LIZIZ();
            String valueOf = String.valueOf(i2);
            o.LJIIIZ(valueOf, "<set-?>");
            c176116vf.LJI = valueOf;
            c176116vf.LJFF = C176096vd.LIZIZ();
            c176116vf.LIZLLL = System.currentTimeMillis();
            collectComment.LJ(new C10I() { // from class: X.6vj
                @Override // X.C10I
                public final Object then(C10K c10k) {
                    C176146vi c176146vi = C176146vi.this;
                    Comment comment2 = comment;
                    int i6 = i2;
                    int i7 = i3;
                    int i8 = i4;
                    int i9 = i5;
                    c176146vi.getClass();
                    C176116vf c176116vf2 = C176096vd.LIZLLL;
                    c176116vf2.LJ = System.currentTimeMillis();
                    C176096vd.LIZJ(c176116vf2);
                    if (!c10k.LJIILJJIL() && !c10k.LJIIL()) {
                        comment2.setCollectStatus(i6);
                        C2U8.LIZ(new C176166vk(comment2));
                        CommentFavoriteServiceImpl.LIZJ().LIZ(i6, comment2.getCid());
                        c176146vi.LIZLLL.Vo(i7, i8, i9);
                        return null;
                    }
                    return null;
                }
            }, C10K.LJIIIIZZ, null);
        }
    }
}
