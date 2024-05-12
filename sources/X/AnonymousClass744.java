package X;

import Y.ACListenerS21S0101000_2;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS31S0101000_14;
import Y.AObserverS47S0201000_3;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS22S0200000_3;
import Y.IDCListenerS10S0101000;
import Y.IDCListenerS204S0100000_3;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.managementv2.CommentManagementAssemVM;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentBatchManagementViewModel;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommerceCommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import o3.IDaS89S0000000_3;
import o3.h0;

/* renamed from: X.744, reason: invalid class name */
/* loaded from: classes4.dex */
public class AnonymousClass744 extends AbstractC1796373f implements InterfaceC1798073w {
    public static C198747r4 LLILII;
    public Comment LJLILLLLZI;
    public final View LJLJI;
    public final FrameLayout LJLJJI;
    public final SmartAvatarImageView LJLJJL;
    public final C71897SJp LJLJJLL;
    public final TuxTextView LJLJL;
    public final C2064988n LJLJLJ;
    public final View LJLJLLL;
    public final C2064988n LJLL;
    public final View LJLLI;
    public final C76S LJLLILLLL;
    public final AnonymousClass711 LJLLJ;
    public final int LJLLL;
    public String LJLLLL;
    public Aweme LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public boolean LJZI;
    public final SmartAvatarImageView LJZL;
    public final View LL;
    public final AnonymousClass708 LLD;
    public final C176216vp LLF;
    public C175976vR LLFF;
    public boolean LLFFF;
    public final CommentBatchManagementViewModel LLFII;
    public CommentManagementAssemVM LLFZ;
    public final CommentViewModelImpl LLI;
    public final AObserverS47S0201000_3 LLIFFJFJJ;
    public AnonymousClass748 LLII;
    public C174386ss LLIIII;
    public final boolean LLIIIILZ;
    public final View LLIIIJ;
    public final TextView LLIIIL;
    public final WeakReference<AbsFragment> LLIIIZ;
    public final TuxIconView LLIIJI;
    public final boolean LLIIJLIL;
    public InterfaceC100393wp LLIIL;
    public final C53691L5j LLIILII;
    public final C181937Cb LLIILZL;
    public final C74V LLIIZ;
    public final InterfaceC1797373p LLIL;

    public void Y() {
    }

    @Override // X.InterfaceC1798073w
    public final void LLIIIILZ() {
        this.LLIIZ.LIZJ(this.LJLILLLLZI);
    }

    public final HashMap<String, String> Q() {
        Aweme aweme = this.LJLLLLLL;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", this.LJLLLL);
        hashMap.put("group_id", this.LJLILLLLZI.getAwemeId());
        hashMap.put("enter_comment_id", this.LJLILLLLZI.getCid());
        if (aweme != null) {
            hashMap.put("is_feed_liked", String.valueOf(aweme.isLike()));
            hashMap.put("is_feed_collected", String.valueOf(aweme.isCollected()));
            hashMap.put("is_feed_comment_clicked", String.valueOf(aweme.isCommentClicked()));
            hashMap.put("is_feed_forward_clicked", String.valueOf(aweme.isForwardClicked()));
        }
        return hashMap;
    }

    public final boolean T() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        boolean z = true;
        if (this.LLIIIILZ) {
            CommentManagementAssemVM commentManagementAssemVM = this.LLFZ;
            if (commentManagementAssemVM != null) {
                z = true ^ commentManagementAssemVM.hv0(this.LJLILLLLZI);
            }
            return V(z);
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI.getCid()) && (commentBatchManagementViewModel = this.LLFII) != null) {
            z = true ^ ((HashMap) commentBatchManagementViewModel.LJLJJI).containsKey(this.LJLILLLLZI.getCid());
        }
        return U(z);
    }

    public final boolean X() {
        if (this.LLIIIILZ) {
            CommentManagementAssemVM commentManagementAssemVM = this.LLFZ;
            if (commentManagementAssemVM != null && commentManagementAssemVM.iv0()) {
                return true;
            }
            return false;
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.LLFII;
        if (commentBatchManagementViewModel != null && commentBatchManagementViewModel.jv0().getValue().booleanValue()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        this.LJLJJLL.setChecked(false);
        View view = this.LLIIIJ;
        if (view != null) {
            view.setBackgroundColor(0);
        }
    }

    public final void c0() {
        this.LJLJJLL.setChecked(true);
        Integer LJI = C79045V0n.LJI(R.attr.cf, this.LLIIIJ.getContext());
        View view = this.LLIIIJ;
        if (view != null && LJI != null) {
            view.setBackgroundColor(LJI.intValue());
        }
    }

    public final void g0() {
        boolean z;
        C78996UzQ.LJJIJIIJIL(this.LJLILLLLZI);
        C174446sy.LIZLLL(this.LJLILLLLZI);
        String LIZIZ = C1799274i.LIZIZ(this.LJLILLLLZI, false);
        if (!TextUtils.isEmpty(LIZIZ)) {
            C2059186h.LIZ(this.LJLJLJ, LIZIZ);
            this.LJLJLJ.setVisibility(0);
            C118824lS.LIZJ(this.LJLJLJ, null);
        } else {
            this.LJLJLJ.setVisibility(8);
        }
        o.LJIIIZ(this.LJLILLLLZI, "<this>");
        this.LJLJLJ.setMentionSpanColor(C78886Uxe.LJJIFFI(R.attr.bw, 0, this.LJLJLJ.getContext()));
        this.LJLJLJ.setMentionSpanStyle(1);
        this.LJLJLJ.setOnSpanClickListener(new C76Z() { // from class: X.747
            @Override // X.C76Z
            public final void LIZ(TextExtraStruct textExtraStruct) {
                int i;
                AnonymousClass744 anonymousClass744 = AnonymousClass744.this;
                anonymousClass744.getClass();
                if (textExtraStruct.getUserId().equals(((RBX) HG3.LJIILL()).getCurUserId())) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", anonymousClass744.LJLLLL);
                    FMX.LJIIL("self_mention_click", c188727au.LIZ);
                }
                if (C84763XOl.LJIIIIZZ() != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), "aweme://user/profile/");
                    buildRoute.withParam("uid", textExtraStruct.getUserId());
                    buildRoute.withParam("extra_from_pre_page", "notification_page");
                    buildRoute.withParam("sec_uid", textExtraStruct.getSecUid());
                    buildRoute.open();
                }
                anonymousClass744.LJLJLJ.getContext();
                FMX.LJII("name", 0L, "comment_at", textExtraStruct.getUserId());
                Aweme aweme = anonymousClass744.LJLLLLLL;
                int i2 = 0;
                if (aweme != null && aweme.isPinnedByArtist()) {
                    i = 1;
                } else {
                    i = 0;
                }
                Aweme aweme2 = anonymousClass744.LJLLLLLL;
                if (aweme2 != null && aweme2.getIsBehindTheSongVideoType().booleanValue()) {
                    i2 = 1;
                }
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", anonymousClass744.LJLLLL);
                c188727au2.LJIIIZ("to_user_id", textExtraStruct.getUserId());
                c188727au2.LJIIIZ("group_id", anonymousClass744.LJLZ);
                c188727au2.LJIIIZ("author_id", anonymousClass744.LJZ);
                c188727au2.LJIIIZ("enter_method", "comment_at");
                c188727au2.LIZLLL(textExtraStruct.getUserId().equals(((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0, "self_click");
                c188727au2.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(anonymousClass744.itemView.getContext(), anonymousClass744.LJLLLLLL), "music_name");
                c188727au2.LIZLLL(i, "artist_label");
                c188727au2.LIZLLL(i2, "bts_type");
                C220488l2.LIZIZ.LJII(anonymousClass744.LJLLLLLL, c188727au2);
                C222578oP.LIZIZ(c188727au2, anonymousClass744.LJLLLLLL, null, null, null);
                FMX.LJIIL("enter_personal_detail", c188727au2.LIZ);
                C38987FRv.LJI(LSC.PROFILE);
                ((CommentListFragment) anonymousClass744.LLIL).To();
            }
        });
        if (this.LLFF != null && ((this.LJLILLLLZI.getCommentType() == 1 || V16.LJJIZ(this.LJLILLLLZI)) && this.LJLILLLLZI.isAuthorPin())) {
            this.LLFF.LJ(true);
        } else {
            C175976vR c175976vR = this.LLFF;
            if (c175976vR != null) {
                c175976vR.LJ(false);
            }
        }
        List<TextExtraStruct> LIZJ = C1799274i.LIZJ(this.LJLILLLLZI, this.LJLJLJ.getContext(), true);
        if (V16.LJJIZ(this.LJLILLLLZI) && V16.LJJIIZ(this.LJLILLLLZI)) {
            LIZJ.clear();
        }
        if (C8DR.LIZ()) {
            C78996UzQ.LJJJIL(this.LJLJLJ);
            final Context context = this.LJLJLJ.getContext();
            for (TextExtraStruct textExtraStruct : LIZJ) {
                if (textExtraStruct.getType() == 6) {
                    if (this.LJLJLJ.getSearchIconDrawable() == null) {
                        C2064988n c2064988n = this.LJLJLJ;
                        c2064988n.setSearchIconDrawable(C78996UzQ.LJII(c2064988n.getContext()));
                    }
                    this.LJLJLJ.setSearchOnSpanClickListener(new C76Z() { // from class: X.749
                        @Override // X.C76Z
                        public final void LIZ(TextExtraStruct textExtraStruct2) {
                            AnonymousClass744 anonymousClass744 = AnonymousClass744.this;
                            Context context2 = context;
                            anonymousClass744.getClass();
                            C74Z.LJJII(textExtraStruct2, anonymousClass744.LJLILLLLZI, anonymousClass744.LJLLLL);
                            Z9N z9n = Z9N.LIZIZ;
                            z9n.LLI(anonymousClass744.LJLILLLLZI.getLogPb().getImprId());
                            z9n.LLLLZ(context2, textExtraStruct2.getSearchKeyword(), anonymousClass744.Q());
                            ((CommentListFragment) anonymousClass744.LLIL).To();
                        }
                    });
                    C74Z.LJJIII(textExtraStruct, this.LJLILLLLZI, this.LJLLLL);
                }
            }
            Iterator<TextExtraStruct> it = LIZJ.iterator();
            while (it.hasNext()) {
                if (it.next().getType() == 6) {
                    z = true;
                    break;
                }
            }
        } else {
            C2064988n c2064988n2 = this.LJLJLJ;
            c2064988n2.setSearchSpanColor(C79045V0n.LJI(R.attr.go, c2064988n2.getContext()).intValue());
        }
        z = false;
        this.LJLJLJ.LJJJJ(LIZJ);
        AnonymousClass893 anonymousClass893 = AnonymousClass893.LIZ;
        C74H c74h = new C74H(Q());
        anonymousClass893.getClass();
        AnonymousClass893.LIZJ = c74h;
        this.LJLJLJ.setMovementMethod(anonymousClass893);
        if (this.LJLJLJ.getVisibility() == 0) {
            C116724i4 c116724i4 = new C116724i4();
            if (z && C90193gN.LIZ()) {
                if (this.LJLILLLLZI.getCommentType() == 1 && this.LJLILLLLZI.isAuthorPin()) {
                    c116724i4.LIZIZ(this.LJLJLJ.getText().subSequence(0, 1));
                    c116724i4.LIZLLL(this.LJLJLJ.getText().subSequence(1, this.LJLJLJ.getText().length()));
                } else {
                    c116724i4.LIZLLL(this.LJLJLJ.getText());
                }
            } else {
                c116724i4.LIZIZ(this.LJLJLJ.getText());
            }
            C2059186h.LIZ(this.LJLJLJ, c116724i4.LIZ);
        }
        C78886Uxe.LJJLIIIJ(-2, this.LJLJLJ);
    }

    public void LLLLZ() {
        g0();
    }

    public void LLII(String str) {
        this.LJLLLL = str;
    }

    public final boolean U(boolean z) {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (X()) {
            String cid = this.LJLILLLLZI.getCid();
            if (!TextUtils.isEmpty(cid) && (commentBatchManagementViewModel = this.LLFII) != null) {
                java.util.Map<String, Comment> map = commentBatchManagementViewModel.LJLJJI;
                if (z) {
                    c0();
                    ((HashMap) map).put(cid, this.LJLILLLLZI);
                } else {
                    a0();
                    ((HashMap) map).remove(cid);
                }
                this.LLFII.iv0().postValue(Integer.valueOf(((HashMap) map).size()));
                return true;
            }
            return true;
        }
        return false;
    }

    public final boolean V(boolean z) {
        if (X()) {
            String cid = this.LJLILLLLZI.getCid();
            if (this.LLFZ != null) {
                if (z) {
                    c0();
                    CommentManagementAssemVM commentManagementAssemVM = this.LLFZ;
                    Comment comment = this.LJLILLLLZI;
                    commentManagementAssemVM.getClass();
                    o.LJIIIZ(cid, "cid");
                    o.LJIIIZ(comment, "comment");
                    ((HashMap) commentManagementAssemVM.LJLIL).put(cid, comment);
                    commentManagementAssemVM.setState(new AqS169S0100000_3(commentManagementAssemVM, 13));
                    return true;
                }
                a0();
                CommentManagementAssemVM commentManagementAssemVM2 = this.LLFZ;
                commentManagementAssemVM2.getClass();
                o.LJIIIZ(cid, "cid");
                ((HashMap) commentManagementAssemVM2.LJLIL).remove(cid);
                commentManagementAssemVM2.setState(new AqS169S0100000_3(commentManagementAssemVM2, 14));
                return true;
            }
            return true;
        }
        return false;
    }

    public final void f0(User user) {
        User curUser;
        boolean z;
        if (user != null) {
            UrlModel avatarThumb = user.getAvatarThumb();
            if (C176536wL.LIZ().LIZJ) {
                curUser = AV1.LIZIZ();
            } else {
                HG3.LJIIL();
                curUser = HG3.LJLJL.LJFF().getCurUser();
            }
            if (curUser != null && curUser.getUid() != null && curUser.getUid().equals(user.getUid())) {
                avatarThumb = curUser.getAvatarThumb();
            }
            if (avatarThumb != null && avatarThumb.getUrlList() != null && avatarThumb.getUrlList().size() != 0) {
                if ((C176826wo.LIZ() & 256) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
                    LJII.LJIILIIL(J7H.LIZ(100));
                    LJII.LJIILIIL = C175166u8.LIZ(this.LJLJJL.getContext(), 36.0f);
                    int i = this.LJLLL;
                    LJII.LJII = i;
                    LJII.LJIIIIZZ = i;
                    LJII.LJJIJIIJIL = true;
                    LJII.LIZIZ("CommentViewHolder");
                    LJII.LJJIIJ = this.LJLJJL;
                    LJII.LJ();
                } else {
                    W5F LJII2 = W5U.LJII(C78939UyV.LJ(avatarThumb));
                    LJII2.LJIILIIL(J7H.LIZ(100));
                    LJII2.LJIILIIL = C175166u8.LIZ(this.LJLJJL.getContext(), 36.0f);
                    int i2 = this.LJLLL;
                    LJII2.LJII = i2;
                    LJII2.LJIIIIZZ = i2;
                    LJII2.LJJIJIIJIL = true;
                    LJII2.LIZIZ("CommentViewHolder");
                    LJII2.LJJIIJ = this.LJLJJL;
                    C16880lQ.LLJJJ(LJII2);
                }
            }
            if (C176536wL.LIZ().LIZ) {
                if (TextUtils.isEmpty(user.getUserDisplayName())) {
                    C2059186h.LIZ(this.LJLJL, C1799274i.LJ(user, this.LJLLLL));
                } else {
                    C2059186h.LIZ(this.LJLJL, user.getUserDisplayName());
                }
            } else {
                C2059186h.LIZ(this.LJLJL, C1799274i.LJ(user, this.LJLLLL));
            }
            AJ9.LJ(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LJLJL);
            Y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v47, types: [X.748] */
    public void N(Comment comment, Rect rect) {
        boolean containsKey;
        AbsFragment absFragment;
        if (comment == null || this.LJLJLJ == null) {
            return;
        }
        C181937Cb c181937Cb = this.LLIILZL;
        if (c181937Cb != null) {
            c181937Cb.LJIIL(comment, null);
        }
        this.LJLILLLLZI = comment;
        if (comment.isUserDigged() && this.LJLILLLLZI.getDiggCount() == 0) {
            this.LJLILLLLZI.setDiggCount(1);
        }
        AnonymousClass708 anonymousClass708 = this.LLD;
        if (anonymousClass708 != null) {
            anonymousClass708.setVisibility(0);
        }
        InterfaceC176226vq LJ = AnonymousClass710.LJ(this.LJLLILLLL, this.LJLLJ, this.LLIL, true, this.LJLILLLLZI, this.LLF, this.LJLJLJ.getContext());
        AnonymousClass708 anonymousClass7082 = this.LLD;
        if (anonymousClass7082 != null) {
            anonymousClass7082.LIZ(this.LJLILLLLZI, this.LJLLLLLL, this.LJLLLL, this.LJZ);
            this.LLD.setFragmentReference(this.LLIIIZ);
        }
        C176216vp c176216vp = this.LLF;
        Context context = this.LJLJLJ.getContext();
        Comment comment2 = this.LJLILLLLZI;
        C74C c74c = new C74C();
        c74c.LIZ = this.LJZ;
        c74c.LIZIZ = this.LJLZ;
        c74c.LIZJ = comment.getCid();
        c74c.LJ = this.LJLLLL;
        c74c.LJFF = comment.getCommentLanguage();
        comment.isAuthorDigged();
        comment.isAuthorPin();
        c74c.LIZLLL = "comment_panel";
        C74D LIZ = c74c.LIZ();
        Context context2 = this.LJLJLJ.getContext();
        C2064988n c2064988n = this.LJLJLJ;
        c176216vp.LIZ(context, comment2, LIZ, new C74I(context2, c2064988n), new C74I(c2064988n.getContext(), this.LJLL), LJ);
        C175976vR c175976vR = this.LLFF;
        if (c175976vR != null) {
            Context context3 = this.LJLJLJ.getContext();
            C2064988n mentionTextView = this.LJLJLJ;
            C76S statusView = this.LJLLILLLL;
            o.LJIIIZ(context3, "context");
            o.LJIIIZ(mentionTextView, "mentionTextView");
            o.LJIIIZ(statusView, "statusView");
            c175976vR.LIZLLL = comment;
            c175976vR.LIZ = statusView;
            c175976vR.LIZJ = new C175466uc();
            C175976vR c175976vR2 = this.LLFF;
            TuxIconView iconLayout = this.LLIIJI;
            c175976vR2.getClass();
            o.LJIIIZ(iconLayout, "iconLayout");
            c175976vR2.LIZIZ = iconLayout;
            if ((this.LJLILLLLZI.getCommentType() == 1 || V16.LJJIZ(this.LJLILLLLZI)) && this.LJLILLLLZI.isAuthorPin()) {
                this.LLFF.LJ(true);
            } else {
                this.LLFF.LJ(false);
            }
        }
        View view = this.LJLJLLL;
        if (view != null) {
            view.setVisibility(8);
        }
        LLLLZ();
        User user = comment.getUser();
        if (comment.getCommerceInfo() == null) {
            if (C178446zQ.LIZJ && CommentListFragment.LLLLLZL) {
                if (LLILII == null) {
                    LLILII = new C198747r4(this.LJLJJL.getResources().getDimension(R.dimen.ji), C78886Uxe.LJJIFFI(R.attr.cf, R.color.al, this.LJLJJL.getContext()));
                }
                this.LJLJJL.setImageDrawable(LLILII);
                C37179EiV.LIZ().post(new ARunnableS22S0200000_3(user, this, 72));
            } else {
                f0(user);
            }
        } else {
            CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
            W5F LJIIIIZZ = W5U.LJIIIIZZ(commerceInfo.getAvartalUrl());
            LJIIIIZZ.LJIILIIL(J7H.LIZ(100));
            LJIIIIZZ.LJIILIIL = C175166u8.LIZ(this.LJLJJL.getContext(), 36.0f);
            int i = this.LJLLL;
            LJIIIIZZ.LJII = i;
            LJIIIIZZ.LJIIIIZZ = i;
            LJIIIIZZ.LJJIJIIJIL = true;
            LJIIIIZZ.LIZIZ("CommentViewHolder");
            LJIIIIZZ.LJJIIJ = this.LJLJJL;
            C16880lQ.LLJJJ(LJIIIIZZ);
            C2059186h.LIZ(this.LJLJL, commerceInfo.getNickName());
        }
        if (this.LLIIIILZ && this.LLFZ == null && (absFragment = this.LLIIIZ.get()) != 0) {
            this.LLFZ = C178466zS.LIZIZ(absFragment, (InterfaceC175696uz) absFragment);
            this.LLII = new InterfaceC175676ux() { // from class: X.748
                @Override // X.InterfaceC175676ux
                public final void LIZ(boolean z) {
                    float f;
                    int i2;
                    AnonymousClass708 anonymousClass7083;
                    AnonymousClass744 anonymousClass744 = AnonymousClass744.this;
                    if (anonymousClass744.LJLJJLL != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) anonymousClass744.LJLJJI.getLayoutParams();
                        Context context4 = anonymousClass744.itemView.getContext();
                        if (z) {
                            f = 12.0f;
                        } else {
                            f = 0.0f;
                        }
                        marginLayoutParams.setMarginStart((int) KL2.LIZJ(context4, f));
                        anonymousClass744.LJLJJI.setLayoutParams(marginLayoutParams);
                        C71897SJp c71897SJp = anonymousClass744.LJLJJLL;
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        c71897SJp.setVisibility(i2);
                        if (z) {
                            AnonymousClass708 anonymousClass7084 = anonymousClass744.LLD;
                            if (anonymousClass7084 != null) {
                                anonymousClass7084.setVisibility(8);
                            }
                        } else if (!anonymousClass744.LLIIJLIL && C178406zM.LJIIJ(anonymousClass744.LJLLLLLL)) {
                            AnonymousClass708 anonymousClass7085 = anonymousClass744.LLD;
                            if (anonymousClass7085 != null) {
                                anonymousClass7085.setVisibility(8);
                            }
                        } else {
                            if (!C174446sy.LIZLLL(anonymousClass744.LJLILLLLZI) && (anonymousClass7083 = anonymousClass744.LLD) != null) {
                                anonymousClass7083.setVisibility(0);
                            }
                            anonymousClass744.a0();
                        }
                        C71Y.LIZ("unPin", "managementStatus");
                        C78886Uxe.LJJLIIIJ(-2, anonymousClass744.LJLJLJ);
                    }
                }
            };
        }
        if (X()) {
            if (this.LLIIIILZ) {
                containsKey = this.LLFZ.hv0(this.LJLILLLLZI);
            } else {
                containsKey = ((HashMap) this.LLFII.LJLJJI).containsKey(this.LJLILLLLZI.getCid());
            }
            if (containsKey) {
                c0();
            } else {
                a0();
            }
        }
        if (this.LJZI) {
            C27740Aue.LJIIJ(false, this.LLIIIL);
        }
        if (this.LLIIIZ.get() != null && this.LLIIL == null) {
            L6F l6f = L6F.LIZIZ;
            C212068Ty c212068Ty = new C212068Ty(L61.STORY, this.LLIILII, this, EnumC53719L6l.COMMENT);
            c212068Ty.LIZ(this.LJLLLL);
            c212068Ty.LJFF = "interaction_panel";
            c212068Ty.LJIIIZ = false;
            this.LLIIL = l6f.LIZ.LIZIZ(c212068Ty);
        }
        C181937Cb c181937Cb2 = this.LLIILZL;
        if (c181937Cb2 != null) {
            c181937Cb2.LJIIL(null, this.LLIIL);
        }
        InterfaceC100393wp interfaceC100393wp = this.LLIIL;
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(user);
        }
        C74V c74v = this.LLIIZ;
        c74v.LJII = this.LJLLLL;
        c74v.LIZ(comment);
    }

    public final void P(View view, String str) {
        InterfaceC1797373p interfaceC1797373p;
        if (this.LJLILLLLZI == null || C6ZT.LIZ(view)) {
            return;
        }
        if (TextUtils.equals(str, "click_button")) {
            if (!T()) {
                ((CommentListFragment) this.LLIL).In(this.LJLILLLLZI);
                return;
            }
            return;
        }
        User user = this.LJLILLLLZI.getUser();
        if (user == null) {
            return;
        }
        if (user.isAdFake()) {
            C5S1 c5s1 = new C5S1(view.getContext());
            c5s1.LIZJ(R.string.b95);
            c5s1.LJ();
        } else {
            if (TextUtils.isEmpty(user.getUid()) || (interfaceC1797373p = this.LLIL) == null) {
                return;
            }
            interfaceC1797373p.LLZZLLIL(this.LJLILLLLZI, user, str);
        }
    }

    public AnonymousClass744(View view, AbsFragment absFragment, InterfaceC1797373p interfaceC1797373p) {
        super(view);
        this.LLFFF = true;
        boolean LIZ = C178016yj.LIZ();
        this.LLIIIILZ = LIZ;
        boolean LIZ2 = C7CA.LIZ();
        this.LLIIJLIL = LIZ2;
        this.LLIIIZ = new WeakReference<>(absFragment);
        this.LJLLL = C63081OpJ.LJIJJLI(view.getContext(), 36.0f);
        this.LJLJI = view.findViewById(R.id.fl8);
        this.LJLJJI = (FrameLayout) view.findViewById(R.id.dc_);
        C53691L5j c53691L5j = (C53691L5j) view.findViewById(R.id.dfe);
        this.LLIILII = c53691L5j;
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.abh);
        this.LJLJJL = smartAvatarImageView;
        C71897SJp c71897SJp = (C71897SJp) view.findViewById(R.id.ge2);
        this.LJLJJLL = c71897SJp;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        this.LJLJL = tuxTextView;
        C2064988n c2064988n = (C2064988n) view.findViewById(R.id.bst);
        this.LJLJLJ = c2064988n;
        View findViewById = view.findViewById(R.id.iw5);
        this.LJLJLLL = findViewById;
        view.findViewById(R.id.iwk);
        C2064988n c2064988n2 = (C2064988n) view.findViewById(R.id.iw6);
        this.LJLL = c2064988n2;
        if (Build.VERSION.SDK_INT >= 23) {
            if (findViewById != null) {
                c2064988n2.setBreakStrategy(0);
            }
            c2064988n.setBreakStrategy(0);
        }
        this.LJLLI = view.findViewById(R.id.iw7);
        this.LJLLILLLL = (C76S) view.findViewById(R.id.lk9);
        this.LJLLJ = (AnonymousClass711) view.findViewById(R.id.lka);
        View findViewById2 = view.findViewById(R.id.bs_);
        this.LLIIIJ = findViewById2;
        TextView textView = (TextView) view.findViewById(R.id.ble);
        this.LLIIIL = textView;
        this.LLIIJI = (TuxIconView) view.findViewById(R.id.ejs);
        this.LJZL = (SmartAvatarImageView) view.findViewById(R.id.fqx);
        this.LL = view.findViewById(R.id.nb5);
        this.LLD = (AnonymousClass708) view.findViewById(R.id.c_s);
        View findViewById3 = view.findViewById(R.id.e1x);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
        marginLayoutParams.width = (int) KL2.LIZJ(view.getContext(), 12.0f);
        findViewById3.setLayoutParams(marginLayoutParams);
        C88463da c88463da = C88463da.LIZ;
        c88463da.LIZ(findViewById2, EnumC1796673i.CELL);
        c88463da.LIZ(smartAvatarImageView, EnumC1796673i.AVATAR);
        c2064988n.setPressAlpha(0.2f);
        c88463da.LIZ(tuxTextView, EnumC1796673i.USERNAME);
        c88463da.LIZ(textView, EnumC1796673i.BUTTON);
        C16880lQ.LJJJJL(smartAvatarImageView, new IDCListenerS10S0101000(1, this, 8));
        smartAvatarImageView.setImportantForAccessibility(2);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS31S0101000_14(0, this, 4));
        C16880lQ.LJIJI(textView, new ACListenerS21S0101000_2(0, this, 9));
        this.LLIL = interfaceC1797373p;
        C74J.LIZJ(c2064988n);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 308), this.itemView);
        this.LLF = new C176216vp(view.getContext());
        if (!LIZ2 || C176306vy.LIZ() != 1) {
            this.LLFF = new C175976vR();
        }
        C1806877g.LIZ(c2064988n);
        C1806877g.LIZ(c2064988n2);
        this.LLI = C174516t5.LIZ(absFragment);
        if (!LIZ) {
            this.LLFII = CommentBatchManagementViewModel.hv0(absFragment);
        }
        this.LLIFFJFJJ = new AObserverS47S0201000_3(0, this, view, 1);
        c71897SJp.setOnCheckedChangeListener(new IDCListenerS204S0100000_3((AnonymousClass746) this, 4));
        if (C7EI.LIZ(EnumC53719L6l.COMMENT)) {
            this.LLIILZL = new C181937Cb(new WeakReference(this.LJLILLLLZI), new WeakReference(this.LLIIL), new WeakReference(c53691L5j));
            C37179EiV.LIZ().post(new ARunnableS18S0201000_15(0, this, view, 7));
        }
        C74V c74v = new C74V();
        this.LLIIZ = c74v;
        c74v.LIZIZ(view, absFragment, interfaceC1797373p);
        h0.LJIJI(textView, new IDaS89S0000000_3(8));
    }
}
