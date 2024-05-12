package X;

import Y.ACListenerS22S0101000_3;
import Y.ACListenerS24S0101000_5;
import Y.ACListenerS26S0101000_8;
import Y.ACListenerS32S0101000_15;
import Y.AObserverS59S0101000_3;
import Y.IDCListenerS204S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.745, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass745 extends AbstractC1796373f implements InterfaceC1796473g {
    public static final /* synthetic */ int LLILZ = 0;
    public final View LJLILLLLZI;
    public final View LJLJI;
    public final C72434Sbm LJLJJI;
    public final C71897SJp LJLJJL;
    public final View LJLJJLL;
    public final TuxTextView LJLJL;
    public final C2064988n LJLJLJ;
    public final TextView LJLJLLL;
    public final C76S LJLL;
    public final AnonymousClass711 LJLLI;
    public final TuxTextView LJLLILLLL;
    public final TuxTextView LJLLJ;
    public final ViewStub LJLLL;
    public C62846OlW LJLLLL;
    public final TextView LJLLLLLL;
    public final TextView LJLZ;
    public final View LJZ;
    public final TextView LJZI;
    public final FrameLayout LJZL;
    public final SmartAvatarImageView LL;
    public final AnonymousClass708 LLD;
    public final InterfaceC1797373p LLF;
    public Comment LLFF;
    public C176216vp LLFFF;
    public KS8 LLFII;
    public final CommentBatchManagementViewModel LLFZ;
    public CommentManagementAssemVM LLI;
    public C74B LLIFFJFJJ;
    public final AObserverS59S0101000_3 LLII;
    public final CommentViewModelImpl LLIIII;
    public C174386ss LLIIIILZ;
    public String LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public Aweme LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public final WeakReference<AbsFragment> LLIILII;
    public final boolean LLIILZL;
    public final boolean LLIIZ;
    public final C76E LLIL;
    public final boolean LLILII;
    public InterfaceC100393wp LLILIL;
    public final C53691L5j LLILL;
    public final C181937Cb LLILLIZIL;
    public final C74V LLILLJJLI;
    public V8L LLILLL;

    @Override // X.InterfaceC1796473g
    public final void LLLFF() {
    }

    @Override // X.InterfaceC1796473g
    public final void LLIIIILZ() {
        this.LLILLJJLI.LIZJ(this.LLFF);
    }

    @Override // X.InterfaceC1796473g
    public final void LLLLZ() {
        boolean z;
        Comment comment = this.LLFF;
        if (comment == null) {
            return;
        }
        if (C174446sy.LIZLLL(comment)) {
            TextView textView = this.LJLLLLLL;
            if (textView != null) {
                C27740Aue.LJIIJ(false, textView, this.LJLZ);
            }
            if (this.LLFF.getAliasAweme() == null) {
                Q();
            }
        } else {
            TextView textView2 = this.LJLLLLLL;
            if (textView2 != null) {
                textView2.setVisibility(0);
                if (this.LLFF.getAliasAweme() == null) {
                    z = true;
                } else {
                    z = false;
                }
                C27740Aue.LJIIJ(z, this.LJLZ);
                TextView textView3 = this.LJLLLLLL;
                if (this.LLIILZL) {
                    textView3.setText(C86036Xpg.LIZIZ(this.LLFF.getCreateTime() * 1000));
                } else {
                    textView3.setText(C57105Mb7.LIZJ(this.LLFF.getCreateTime() * 1000, this.itemView.getContext()));
                }
            }
            if (this.LLFF.getAliasAweme() == null && !this.LLIIZ && !C178406zM.LJIIJ(this.LLIIJI)) {
                g0();
            }
        }
        C174446sy.LJIIJ(this.LLFF, this.LJLLILLLL);
        C78996UzQ.LJJIJIIJIL(this.LLFF);
        C174446sy.LIZLLL(this.LLFF);
        String LIZIZ = C1799274i.LIZIZ(this.LLFF, false);
        if (this.LLFF.getAliasAweme() != null && LIZIZ.isEmpty()) {
            LIZIZ = this.LLFF.getAliasAweme().getDesc();
        }
        if (!TextUtils.isEmpty(LIZIZ)) {
            this.LJLJLJ.setText(LIZIZ);
            this.LJLJLJ.setVisibility(0);
            C118824lS.LIZJ(this.LJLJLJ, null);
        } else {
            this.LJLJLJ.setVisibility(8);
        }
        o.LJIIIZ(this.LLFF, "<this>");
        this.LJLJLJ.setMentionSpanColor(C78886Uxe.LJJIFFI(R.attr.bw, 0, this.LJLJLJ.getContext()));
        this.LJLJLJ.setMentionSpanStyle(1);
        this.LJLJLJ.setOnSpanClickListener(new C76Z() { // from class: X.743
            @Override // X.C76Z
            public final void LIZ(TextExtraStruct textExtraStruct) {
                AnonymousClass745 anonymousClass745 = AnonymousClass745.this;
                anonymousClass745.getClass();
                if (textExtraStruct.getUserId().equals(((RBX) HG3.LJIILL()).getCurUserId())) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("enter_from", anonymousClass745.LLIIIJ);
                    FMX.LJIIL("self_mention_click", c188727au.LIZ);
                }
                if (C84763XOl.LJIIIIZZ() != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), "aweme://user/profile/");
                    buildRoute.withParam("uid", textExtraStruct.getUserId());
                    buildRoute.withParam("sec_uid", textExtraStruct.getSecUid());
                    buildRoute.open();
                }
                anonymousClass745.LJLJLJ.getContext();
                FMX.LJII("name", 0L, "comment_at", textExtraStruct.getUserId());
                anonymousClass745.c0(textExtraStruct.getUserId(), "comment_at");
                ((CommentListFragment) anonymousClass745.LLF).To();
            }
        });
        List<TextExtraStruct> LIZJ = C1799274i.LIZJ(this.LLFF, this.LJLJLJ.getContext(), true);
        if (C8DR.LIZ()) {
            C78996UzQ.LJJJIL(this.LJLJLJ);
            final Context context = this.LJLJLJ.getContext();
            for (TextExtraStruct textExtraStruct : LIZJ) {
                if (textExtraStruct.getType() == 6) {
                    if (this.LJLJLJ.getSearchIconDrawable() == null) {
                        C2064988n c2064988n = this.LJLJLJ;
                        c2064988n.setSearchIconDrawable(C78996UzQ.LJII(c2064988n.getContext()));
                    }
                    this.LJLJLJ.setSearchOnSpanClickListener(new C76Z() { // from class: X.74A
                        @Override // X.C76Z
                        public final void LIZ(TextExtraStruct textExtraStruct2) {
                            AnonymousClass745 anonymousClass745 = AnonymousClass745.this;
                            Context context2 = context;
                            anonymousClass745.getClass();
                            C74Z.LJJII(textExtraStruct2, anonymousClass745.LLFF, anonymousClass745.LLIIIJ);
                            Z9N.LIZIZ.LLLLZ(context2, textExtraStruct2.getSearchKeyword(), anonymousClass745.P());
                            ((CommentListFragment) anonymousClass745.LLF).To();
                        }
                    });
                    C74Z.LJJIII(textExtraStruct, this.LLFF, this.LLIIIJ);
                }
            }
        }
        this.LJLJLJ.LJJJJ(LIZJ);
        this.LJLJLJ.setMovementMethod(LinkMovementMethod.getInstance());
        AnonymousClass893 anonymousClass893 = AnonymousClass893.LIZ;
        C74H c74h = new C74H(P());
        anonymousClass893.getClass();
        AnonymousClass893.LIZJ = c74h;
        this.LJLJLJ.setMovementMethod(anonymousClass893);
        if (this.LJLJLJ.getVisibility() == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.LJLJLJ.getText());
            this.LJLJLJ.setText(spannableStringBuilder);
        }
        C78886Uxe.LJJLIIIJ(-2, this.LJLJLJ);
        this.LJLJJL.setOnCheckedChangeListener(new IDCListenerS204S0100000_3(this, 5));
    }

    @Override // X.InterfaceC1796473g
    public final void LLZZLLIL() {
        AnonymousClass708 anonymousClass708;
        Comment comment = this.LLFF;
        if (comment != null && (anonymousClass708 = this.LLD) != null) {
            anonymousClass708.LJIIJ(Boolean.valueOf(comment.isUserDigged()), Integer.valueOf(this.LLFF.getDiggCount()), Boolean.valueOf(this.LLFF.isAuthorDigged), true, false);
            this.LLD.LJIIIZ(Boolean.valueOf(this.LLFF.isUserBuried()));
        }
    }

    public final HashMap<String, String> P() {
        Aweme aweme = this.LLIIJI;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", this.LLIIIJ);
        hashMap.put("group_id", this.LLFF.getAwemeId());
        hashMap.put("enter_comment_id", this.LLFF.getCid());
        if (aweme != null) {
            hashMap.put("is_feed_liked", String.valueOf(aweme.isLike()));
            hashMap.put("is_feed_collected", String.valueOf(aweme.isCollected()));
            hashMap.put("is_feed_comment_clicked", String.valueOf(aweme.isCommentClicked()));
            hashMap.put("is_feed_forward_clicked", String.valueOf(aweme.isForwardClicked()));
        }
        return hashMap;
    }

    public final void Q() {
        AnonymousClass708 anonymousClass708 = this.LLD;
        if (anonymousClass708 != null) {
            anonymousClass708.setVisibility(8);
        }
    }

    public final boolean T() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        boolean z = true;
        if (this.LLILII) {
            CommentManagementAssemVM commentManagementAssemVM = this.LLI;
            if (commentManagementAssemVM != null) {
                z = true ^ commentManagementAssemVM.hv0(this.LLFF);
            }
            return V(z);
        }
        if (!TextUtils.isEmpty(this.LLFF.getCid()) && (commentBatchManagementViewModel = this.LLFZ) != null) {
            z = true ^ ((HashMap) commentBatchManagementViewModel.LJLJJI).containsKey(this.LLFF.getCid());
        }
        return U(z);
    }

    public final boolean X() {
        if (this.LLILII) {
            CommentManagementAssemVM commentManagementAssemVM = this.LLI;
            if (commentManagementAssemVM != null && commentManagementAssemVM.iv0()) {
                return true;
            }
            return false;
        }
        CommentBatchManagementViewModel commentBatchManagementViewModel = this.LLFZ;
        if (commentBatchManagementViewModel != null && commentBatchManagementViewModel.jv0().getValue().booleanValue()) {
            return true;
        }
        return false;
    }

    public final void a0() {
        this.LJLJJL.setChecked(false);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setBackgroundColor(view.getResources().getColor(R.color.cz));
        }
    }

    public final void f0() {
        this.LJLJJL.setChecked(true);
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setBackgroundColor(C78886Uxe.LJJIFFI(R.attr.cv, R.color.ay, view.getContext()));
        }
    }

    public final void g0() {
        AnonymousClass708 anonymousClass708;
        if (!C174446sy.LIZLLL(this.LLFF) && (anonymousClass708 = this.LLD) != null) {
            anonymousClass708.setVisibility(0);
        }
    }

    public final void i0() {
        if (this.LJLLL != null) {
            Aweme aliasAweme = this.LLFF.getAliasAweme();
            if (aliasAweme != null) {
                if (this.LJLLLL == null) {
                    this.LJLLLL = (C62846OlW) this.LJLLL.inflate();
                }
                this.LJLLLL.setVisibility(0);
                Video video = aliasAweme.getVideo();
                if (this.LJLLLL == null || video == null || video.getCover() == null || C79004UzY.LJJIFFI(video.getCover().getUrlList())) {
                    return;
                }
                UrlModel cover = video.getCover();
                C62846OlW c62846OlW = this.LJLLLL;
                if (c62846OlW != null) {
                    V92 hierarchy = c62846OlW.getHierarchy();
                    V8L v8l = this.LLILLL;
                    if (v8l == null) {
                        float LJIILLIIL = C32151Nz.LJIILLIIL(2);
                        v8l = new V8L();
                        v8l.LJ(LJIILLIIL, LJIILLIIL, LJIILLIIL, LJIILLIIL);
                        this.LLILLL = v8l;
                    }
                    hierarchy.LJIL(v8l);
                }
                this.LJLLLL.setBackgroundColor(EF7.LIZIZ().getResources().getColor(R.color.ay));
                if (this.LLFII == null) {
                    this.LLFII = new KS8(this);
                }
                C74P.LIZ(this.LJLLLL, cover, this.LLFII);
                return;
            }
            C62846OlW c62846OlW2 = this.LJLLLL;
            if (c62846OlW2 == null) {
                return;
            }
            c62846OlW2.setVisibility(8);
        }
    }

    @Override // X.InterfaceC1796473g
    public final void LLIFFJFJJ(Aweme aweme) {
        this.LLIIJI = aweme;
    }

    @Override // X.InterfaceC1796473g
    public final void LLII(String str) {
        this.LLIIIJ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [X.74B] */
    @Override // X.InterfaceC1796473g
    public final void LLJL(Comment comment) {
        boolean containsKey;
        AbsFragment absFragment;
        C76E c76e;
        User curUser;
        W5F LJ;
        if (comment == null) {
            return;
        }
        C181937Cb c181937Cb = this.LLILLIZIL;
        if (c181937Cb != null) {
            c181937Cb.LJIIL(comment, null);
        }
        this.LLFF = comment;
        if (comment.isUserDigged() && this.LLFF.getDiggCount() == 0) {
            this.LLFF.setDiggCount(1);
        }
        g0();
        InterfaceC176226vq LJ2 = AnonymousClass710.LJ(this.LJLL, this.LJLLI, this.LLF, false, this.LLFF, this.LLFFF, this.LJLJLJ.getContext());
        AnonymousClass708 anonymousClass708 = this.LLD;
        if (anonymousClass708 != null) {
            anonymousClass708.LIZ(this.LLFF, this.LLIIJI, this.LLIIIJ, this.LLIIIZ);
            this.LLD.setFragmentReference(this.LLIILII);
            this.LLD.LJIIIIZZ();
        }
        C176216vp c176216vp = this.LLFFF;
        Context context = this.LJLJLJ.getContext();
        Comment comment2 = this.LLFF;
        C74C c74c = new C74C();
        c74c.LIZ = this.LLIIIZ;
        c74c.LIZIZ = this.LLIIIL;
        c74c.LIZJ = comment.getCid();
        c74c.LJ = this.LLIIIJ;
        c74c.LJFF = comment.getCommentLanguage();
        comment.isAuthorDigged();
        comment.isAuthorPin();
        c74c.LIZLLL = "comment_panel";
        C74D LIZ = c74c.LIZ();
        Context context2 = this.LJLJLJ.getContext();
        C2064988n c2064988n = this.LJLJLJ;
        c176216vp.LIZ(context, comment2, LIZ, new C74I(context2, c2064988n), new C74I(c2064988n.getContext(), null), LJ2);
        LLLLZ();
        User user = this.LLFF.getUser();
        if (comment.getCommerceInfo() == null) {
            int LJIILL = C17N.LJIILL(24.0d);
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
                if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                    LJ = W5U.LJ(R.drawable.b0p);
                } else {
                    LJ = W5U.LJII(C78939UyV.LJ(avatarThumb));
                    LJ.LJIILIIL = C175166u8.LIZ(this.LJLJJI.getContext(), 20.0f);
                }
                if ((C176826wo.LIZ() & 256) == 256) {
                    LJ.LJIILIIL(J7H.LIZ(100));
                    LJ.LJII = LJIILL;
                    LJ.LJIIIIZZ = LJIILL;
                    LJ.LJJIJIIJIL = true;
                    LJ.LIZIZ("CommentViewHolder");
                    LJ.LJJIIJ = this.LJLJJI;
                    LJ.LJ();
                } else {
                    LJ.LJIILIIL(J7H.LIZ(100));
                    LJ.LJII = LJIILL;
                    LJ.LJIIIIZZ = LJIILL;
                    LJ.LJJIJIIJIL = true;
                    LJ.LIZIZ("CommentViewHolder");
                    LJ.LJJIIJ = this.LJLJJI;
                    C16880lQ.LLJJJ(LJ);
                }
                if (C176536wL.LIZ().LIZ) {
                    if (TextUtils.isEmpty(user.getUserDisplayName())) {
                        this.LJLJL.setText(C1799274i.LJ(user, this.LLIIIJ));
                    } else {
                        this.LJLJL.setText(user.getUserDisplayName());
                    }
                } else {
                    this.LJLJL.setText(C1799274i.LJ(user, this.LLIIIJ));
                }
            }
        } else {
            CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
            int LJIILL2 = C17N.LJIILL(24.0d);
            W5F LJIIIIZZ = W5U.LJIIIIZZ(commerceInfo.getAvartalUrl());
            LJIIIIZZ.LJIILIIL = C175166u8.LIZ(this.LJLJJI.getContext(), 20.0f);
            LJIIIIZZ.LJIILIIL(J7H.LIZ(100));
            LJIIIIZZ.LJII = LJIILL2;
            LJIIIIZZ.LJIIIIZZ = LJIILL2;
            LJIIIIZZ.LJJIJIIJIL = true;
            LJIIIIZZ.LIZIZ("CommentViewHolder");
            LJIIIIZZ.LJJIIJ = this.LJLJJI;
            C16880lQ.LLJJJ(LJIIIIZZ);
            this.LJLJL.setText(commerceInfo.getNickName());
        }
        if (this.LLIIZ && (c76e = this.LLIL) != null) {
            Aweme aweme = this.LLIIJI;
            String str = this.LLIIIJ;
            c76e.LIZIZ = aweme;
            c76e.LIZJ = str;
            c76e.LIZ(this.LLFF);
        } else {
            new C76E(this.itemView, this.LLIIJI, this.LLIIIJ, true, false).LIZ(this.LLFF);
        }
        if (!TextUtils.isEmpty(this.LLFF.getReplyToUserName()) && !TextUtils.equals(CardStruct.IStatusCode.DEFAULT, this.LLFF.getReplyToReplyCommentId())) {
            C27740Aue.LJIIJ(false, this.LJLJLLL);
            if (this.LJLILLLLZI != null) {
                this.LJZ.post(new RunnableC23230vf(5, this));
            }
        } else {
            if (this.LJLILLLLZI != null) {
                AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                anonymousClass064.LJII((ConstraintLayout) this.LJLILLLLZI);
                anonymousClass064.LJI(R.id.l8c, 6);
                anonymousClass064.LJI(R.id.l8c, 7);
                anonymousClass064.LJI(R.id.mh7, 7);
                anonymousClass064.LJIIIZ(R.id.l8c, 6, R.id.bm6, 7, C32151Nz.LJIILLIIL(8));
                anonymousClass064.LJIIIIZZ(R.id.l8c, 7, R.id.mgy, 6);
                anonymousClass064.LJIIIIZZ(R.id.mh7, 7, R.id.e1x, 6);
                anonymousClass064.LIZIZ((ConstraintLayout) this.LJLILLLLZI);
            }
            C74G.LIZ(this.LJLJLLL, comment.getRelationLabel());
        }
        if (C176016vV.LIZ()) {
            g0();
            i0();
        } else if (this.LLFF.getAliasAweme() == null) {
            g0();
            C62846OlW c62846OlW = this.LJLLLL;
            if (c62846OlW != null && c62846OlW.getVisibility() == 0) {
                this.LJLLLL.setVisibility(8);
            }
        } else {
            Q();
            this.LLIIL = true;
            this.LJLLJ.setVisibility(8);
            i0();
        }
        if (this.LLILII && this.LLI == null && (absFragment = this.LLIILII.get()) != 0) {
            this.LLI = C178466zS.LIZIZ(absFragment, (InterfaceC175696uz) absFragment);
            this.LLIFFJFJJ = new InterfaceC175676ux() { // from class: X.74B
                @Override // X.InterfaceC175676ux
                public final void LIZ(boolean z) {
                    boolean z2;
                    AnonymousClass745 anonymousClass745 = AnonymousClass745.this;
                    Comment comment3 = anonymousClass745.LLFF;
                    if (comment3 != null && anonymousClass745.LJLJJL != null) {
                        int i = 0;
                        if (comment3.getAliasAweme() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        C71897SJp c71897SJp = anonymousClass745.LJLJJL;
                        if (z) {
                            if (z2) {
                                i = 4;
                            }
                        } else {
                            i = 8;
                        }
                        c71897SJp.setVisibility(i);
                        if (z) {
                            anonymousClass745.Q();
                            return;
                        }
                        if (!anonymousClass745.LLIIZ && C178406zM.LJIIJ(anonymousClass745.LLIIJI)) {
                            anonymousClass745.a0();
                            anonymousClass745.Q();
                        } else {
                            if (!C174446sy.LIZLLL(anonymousClass745.LLFF) && !anonymousClass745.LLIIL) {
                                anonymousClass745.g0();
                            }
                            anonymousClass745.a0();
                        }
                    }
                }
            };
        }
        if (X() && this.LLFF.getAliasAweme() == null) {
            if (this.LLILII) {
                containsKey = this.LLI.hv0(this.LLFF);
            } else {
                containsKey = ((HashMap) this.LLFZ.LJLJJI).containsKey(this.LLFF.getCid());
            }
            if (containsKey) {
                f0();
            } else {
                a0();
            }
        }
        if (this.LLIIJLIL) {
            C27740Aue.LJIIJ(false, this.LJLZ);
        }
        if (!this.LLIIZ && C178406zM.LJIIJ(this.LLIIJI)) {
            Q();
        }
        h0(comment.isAuthorDigged);
        if (this.LLIILII.get() != null && this.LLILIL == null) {
            L6F l6f = L6F.LIZIZ;
            C212068Ty c212068Ty = new C212068Ty(L61.STORY, this.LLILL, this, EnumC53719L6l.COMMENT);
            c212068Ty.LIZ(this.LLIIIJ);
            c212068Ty.LJFF = "interaction_panel";
            c212068Ty.LJIIIZ = false;
            this.LLILIL = l6f.LIZ.LIZIZ(c212068Ty);
        }
        C181937Cb c181937Cb2 = this.LLILLIZIL;
        if (c181937Cb2 != null) {
            c181937Cb2.LJIIL(null, this.LLILIL);
        }
        InterfaceC100393wp interfaceC100393wp = this.LLILIL;
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(user);
        }
        C74V c74v = this.LLILLJJLI;
        c74v.LJII = this.LLIIIJ;
        c74v.LIZ(comment);
    }

    @Override // X.InterfaceC1796473g
    public final void LLLLIL(boolean z) {
        this.LLIIJLIL = z;
    }

    @Override // X.InterfaceC1796473g
    public final void LLLLLZL(String str) {
        this.LLIIIZ = str;
    }

    public final boolean U(boolean z) {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (this.LLFF.getAliasAweme() != null || !X()) {
            return false;
        }
        String cid = this.LLFF.getCid();
        if (!TextUtils.isEmpty(cid) && (commentBatchManagementViewModel = this.LLFZ) != null) {
            java.util.Map<String, Comment> map = commentBatchManagementViewModel.LJLJJI;
            if (z) {
                f0();
                ((HashMap) map).put(cid, this.LLFF);
            } else {
                a0();
                ((HashMap) map).remove(cid);
            }
            this.LLFZ.iv0().postValue(Integer.valueOf(((HashMap) map).size()));
        }
        return true;
    }

    public final boolean V(boolean z) {
        if (this.LLFF.getAliasAweme() != null || !X()) {
            return false;
        }
        String cid = this.LLFF.getCid();
        if (!TextUtils.isEmpty(cid) && this.LLI != null) {
            if (z) {
                f0();
                CommentManagementAssemVM commentManagementAssemVM = this.LLI;
                Comment comment = this.LLFF;
                commentManagementAssemVM.getClass();
                o.LJIIIZ(cid, "cid");
                o.LJIIIZ(comment, "comment");
                ((HashMap) commentManagementAssemVM.LJLIL).put(cid, comment);
                commentManagementAssemVM.setState(new AqS169S0100000_3(commentManagementAssemVM, 13));
            } else {
                a0();
                CommentManagementAssemVM commentManagementAssemVM2 = this.LLI;
                commentManagementAssemVM2.getClass();
                o.LJIIIZ(cid, "cid");
                ((HashMap) commentManagementAssemVM2.LJLIL).remove(cid);
                commentManagementAssemVM2.setState(new AqS169S0100000_3(commentManagementAssemVM2, 14));
            }
        }
        return true;
    }

    public final void h0(boolean z) {
        User author;
        if (this.LJLLJ != null) {
            if (z) {
                C74J.LIZIZ(this.LJZL, true);
                Aweme aweme = this.LLIIJI;
                if (aweme == null || (author = aweme.getAuthor()) == null) {
                    return;
                }
                int LJIILL = C17N.LJIILL(16.0d);
                W5F LJI = C1JX.LJI(author);
                LJI.LJIILIIL(J7H.LIZ(100));
                LJI.LJIILIIL = C175166u8.LIZ(this.LL.getContext(), 16.0f);
                LJI.LJII = LJIILL;
                LJI.LJIIIIZZ = LJIILL;
                LJI.LIZIZ("CommentViewHolder");
                LJI.LJJIIJ = this.LL;
                C16880lQ.LLJJJ(LJI);
                return;
            }
            C74J.LIZIZ(this.LJZL, false);
        }
    }

    @Override // X.InterfaceC1796473g
    public final void setAwemeId(String str) {
        this.LLIIIL = str;
    }

    public static void Y(AnonymousClass745 anonymousClass745, View view) {
        anonymousClass745.getClass();
        int id = view.getId();
        if (id == R.id.mh7) {
            if (C6ZT.LIZ(view) || TextUtils.isEmpty(anonymousClass745.LLFF.getReplyToUserId()) || anonymousClass745.LLF == null || C84763XOl.LJIIIIZZ() == null) {
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(C84763XOl.LJIIIIZZ(), "aweme://user/profile/");
            buildRoute.withParam("uid", anonymousClass745.LLFF.getReplyToUserId());
            buildRoute.open();
            anonymousClass745.c0(anonymousClass745.LLFF.getReplyToUserId(), "click_name");
            return;
        }
        if (id != R.id.fqy) {
            return;
        }
        ((CommentListFragment) anonymousClass745.LLF).Dn(view);
    }

    public final void N(View view, String str) {
        InterfaceC1797373p interfaceC1797373p;
        if (this.LLFF == null || C6ZT.LIZ(view)) {
            return;
        }
        if (TextUtils.equals(str, "click_button")) {
            if (!T()) {
                ((CommentListFragment) this.LLF).In(this.LLFF);
                return;
            }
            return;
        }
        User user = this.LLFF.getUser();
        if (user == null) {
            return;
        }
        if (user.isAdFake()) {
            C5S1 c5s1 = new C5S1(view.getContext());
            c5s1.LIZJ(R.string.b95);
            c5s1.LJ();
        } else {
            if (TextUtils.isEmpty(user.getUid()) || (interfaceC1797373p = this.LLF) == null) {
                return;
            }
            interfaceC1797373p.LLZZLLIL(this.LLFF, user, str);
        }
    }

    public final void c0(String str, String str2) {
        int i;
        Aweme aweme = this.LLIIJI;
        int i2 = 0;
        if (aweme != null && aweme.isPinnedByArtist()) {
            i = 1;
        } else {
            i = 0;
        }
        Aweme aweme2 = this.LLIIJI;
        if (aweme2 != null && aweme2.getIsBehindTheSongVideoType().booleanValue()) {
            i2 = 1;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LLIIIJ);
        c188727au.LJIIIZ("to_user_id", str);
        c188727au.LJIIIZ("group_id", this.LLIIIL);
        c188727au.LJIIIZ("author_id", this.LLIIIZ);
        c188727au.LJIIIZ("enter_method", str2);
        c188727au.LIZLLL(str.equals(((RBX) HG3.LJIILL()).getCurUserId()) ? 1 : 0, "self_click");
        c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(this.itemView.getContext(), this.LLIIJI), "music_name");
        c188727au.LIZLLL(i, "artist_label");
        c188727au.LIZLLL(i2, "bts_type");
        C220488l2.LIZIZ.LJII(this.LLIIJI, c188727au);
        C222578oP.LIZIZ(c188727au, this.LLIIJI, null, null, null);
        FMX.LJIIL("enter_personal_detail", c188727au.LIZ);
    }

    public AnonymousClass745(View view, AbsFragment absFragment, InterfaceC1797373p interfaceC1797373p) {
        super(view);
        FFL.LJIIIZ().getClass();
        this.LLIILZL = FFL.LJ(31744, "standardize_timestamp", true, false);
        boolean LIZ = C7CA.LIZ();
        this.LLIIZ = LIZ;
        boolean LIZ2 = C178016yj.LIZ();
        this.LLILII = LIZ2;
        this.LLIILII = new WeakReference<>(absFragment);
        View view2 = view.findViewById(R.id.bs_);
        this.LJLILLLLZI = view2;
        View findViewById = view.findViewById(R.id.fl8);
        this.LJLJI = findViewById;
        C72434Sbm c72434Sbm = (C72434Sbm) view.findViewById(R.id.abh);
        this.LJLJJI = c72434Sbm;
        C53691L5j c53691L5j = (C53691L5j) view.findViewById(R.id.dfe);
        this.LLILL = c53691L5j;
        this.LJLJJL = (C71897SJp) view.findViewById(R.id.ge2);
        View findViewById2 = view.findViewById(R.id.e1x);
        this.LJLJJLL = findViewById2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        this.LJLJL = tuxTextView;
        view.findViewById(R.id.blr);
        C2064988n c2064988n = (C2064988n) view.findViewById(R.id.bst);
        this.LJLJLJ = c2064988n;
        view.findViewById(R.id.bm6);
        TextView textView = (TextView) view.findViewById(R.id.mgy);
        this.LJLJLLL = textView;
        this.LJLL = (C76S) view.findViewById(R.id.lk9);
        this.LJLLI = (AnonymousClass711) view.findViewById(R.id.lka);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.hzt);
        this.LJLLILLLL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.fri);
        this.LJLLJ = tuxTextView3;
        this.LJLLL = (ViewStub) view.findViewById(R.id.n5a);
        this.LJLLLLLL = (TextView) view.findViewById(R.id.bmc);
        View mRootView = view.findViewById(R.id.bmd);
        view.findViewById(R.id.l8c);
        TextView textView2 = (TextView) view.findViewById(R.id.ble);
        this.LJLZ = textView2;
        this.LJZ = view.findViewById(R.id.iwi);
        view.findViewById(R.id.f9r);
        TextView textView3 = (TextView) view.findViewById(R.id.mh7);
        this.LJZI = textView3;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fqy);
        this.LJZL = frameLayout;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.fqz);
        Drawable LJIIIIZZ = C79045V0n.LJIIIIZZ(R.attr.l1, view.getContext());
        if (LJIIIIZZ != null) {
            tuxIconView.setImageDrawable(LJIIIIZZ);
        }
        this.LL = (SmartAvatarImageView) view.findViewById(R.id.fqx);
        this.LLD = (AnonymousClass708) view.findViewById(R.id.c_s);
        if (LIZ) {
            this.LLIL = new C76E(view, this.LLIIJI, this.LLIIIJ, true, false);
        }
        C16880lQ.LJIJI(textView3, new ACListenerS26S0101000_8(1, this, 4));
        C74J.LIZJ(c2064988n);
        if (C1803676a.LIZ()) {
            C74J.LIZ(c2064988n);
        }
        C16880lQ.LJIILJJIL(frameLayout, new ACListenerS24S0101000_5(4, this, 0));
        this.LLF = interfaceC1797373p;
        C16880lQ.LJIIJ(new ACListenerS22S0101000_3(1, this, 0), view);
        view.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 12));
        if (tuxTextView2 != null) {
            tuxTextView2.setOnTouchListener(new View.OnTouchListener() { // from class: X.74L
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1 || action == 3) {
                            C7FC.LIZ(0.5f, view3, false);
                        }
                    } else {
                        C7FC.LIZ(0.5f, view3, true);
                    }
                    return false;
                }
            });
            C16880lQ.LJJJJI(tuxTextView2, new ACListenerS32S0101000_15(1, this, 3));
        }
        C88463da c88463da = C88463da.LIZ;
        c88463da.LIZ(findViewById, EnumC1796673i.CELL);
        EnumC1796673i type = EnumC1796673i.AVATAR;
        float LJIILL = C17N.LJIILL(36.0d);
        o.LJIIIZ(type, "type");
        C88463da.LIZIZ(c72434Sbm, type, LJIILL, null);
        C16880lQ.LJJIJL(c72434Sbm, new ACListenerS32S0101000_15(0, this, 13));
        c2064988n.setPressAlpha(0.2f);
        EnumC1796673i enumC1796673i = EnumC1796673i.USERNAME;
        c88463da.LIZ(textView3, enumC1796673i);
        EnumC1796673i enumC1796673i2 = EnumC1796673i.BUTTON;
        c88463da.LIZ(frameLayout, enumC1796673i2);
        c88463da.LIZ(tuxTextView, enumC1796673i);
        c88463da.LIZ(textView2, enumC1796673i2);
        c88463da.LIZ(textView, enumC1796673i2);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0101000_15(1, this, 18));
        C16880lQ.LJIJI(textView2, new ACListenerS22S0101000_3(0, this, 13));
        int i = 2;
        C16880lQ.LJIJI(textView, new ACListenerS32S0101000_15(2, this, 2));
        this.LLFFF = new C176216vp(c2064988n.getContext());
        C1806877g.LIZ(c2064988n);
        if (Build.VERSION.SDK_INT >= 23) {
            c2064988n.setBreakStrategy(0);
        }
        this.LLIIII = C174516t5.LIZ(absFragment);
        if (!LIZ2) {
            this.LLFZ = CommentBatchManagementViewModel.hv0(absFragment);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
        marginLayoutParams.width = (int) KL2.LIZJ(view.getContext(), 12.0f);
        findViewById2.setLayoutParams(marginLayoutParams);
        this.LLII = new AObserverS59S0101000_3(0, this, 0);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        tuxTextView3.setBackground(c110614Vt.LIZ(view.getContext()));
        if (C7EI.LIZ(EnumC53719L6l.COMMENT)) {
            this.LLILLIZIL = new C181937Cb(new WeakReference(this.LLFF), new WeakReference(this.LLILIL), new WeakReference(c53691L5j));
            C37179EiV.LIZ().post(new C09H(i, this, view));
        }
        o.LJIIIZ(mRootView, "mRootView");
        ViewGroup.LayoutParams layoutParams = mRootView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(0));
            int marginStart = marginLayoutParams2.getMarginStart();
            int marginEnd = marginLayoutParams2.getMarginEnd();
            marginLayoutParams2.setMarginStart(marginStart);
            marginLayoutParams2.topMargin = LJJIIZ;
            marginLayoutParams2.setMarginEnd(marginEnd);
            marginLayoutParams2.bottomMargin = LJJIIZ2;
            mRootView.setLayoutParams(layoutParams);
            mRootView.setPaddingRelative(mRootView.getPaddingStart(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), mRootView.getPaddingEnd(), C7MY.LIZIZ(4));
            o.LJIIIZ(view2, "view");
            view2.setPaddingRelative(view2.getPaddingStart(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), view2.getPaddingEnd(), C7MY.LIZIZ(4));
            C74J.LIZLLL(c2064988n);
            C74J.LJ(tuxTextView3);
            C74V c74v = new C74V();
            this.LLILLJJLI = c74v;
            c74v.LIZIZ(view, absFragment, interfaceC1797373p);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
