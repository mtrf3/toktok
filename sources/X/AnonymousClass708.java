package X;

import Y.AObserverS71S0100000_3;
import Y.IDAListenerS72S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentLikeViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import o3.h0;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.708, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass708 extends FrameLayout implements KPL, LifecycleOwner, ViewModelStoreOwner {
    public final LifecycleRegistry LJLIL;
    public final ViewModelStore LJLILLLLZI;
    public Comment LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public Aweme LJLJL;
    public WeakReference<AbsFragment> LJLJLJ;
    public final boolean LJLJLLL;
    public TuxIconView LJLL;
    public TuxIconView LJLLI;
    public RelativeLayout LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxIconView LJLLL;
    public TuxIconView LJLLLL;
    public RelativeLayout LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public AnimatorSet LJZI;
    public AnimatorSet LJZL;
    public AnimatorSet LL;
    public AnimatorSet LLD;
    public boolean LLF;
    public boolean LLFF;
    public AnimatorSet LLFFF;
    public AnimatorSet LLFII;
    public AnimatorSet LLFZ;
    public AnimatorSet LLI;
    public final CommentLikeViewModel LLIFFJFJJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass708(Context context) {
        this(context, null, 6);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnonymousClass708(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LIZJ() {
        RelativeLayout relativeLayout;
        boolean z;
        boolean z2;
        String str;
        int i;
        String str2;
        Comment comment;
        Comment comment2;
        int i2;
        getContext();
        if (C2NU.LIZ.LIZIZ()) {
            if (!C174446sy.LIZLLL(this.LJLJI)) {
                Comment comment3 = this.LJLJI;
                AbsFragment absFragment = null;
                if (comment3 != null && comment3.getCid() != null && (relativeLayout = this.LJLLLLLL) != null && relativeLayout.getVisibility() == 0) {
                    String str3 = "";
                    if (!((RBX) HG3.LJIILL()).isLogin()) {
                        LJI();
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        String str4 = this.LJLJJI;
                        C40883G2t c40883G2t = new C40883G2t();
                        c40883G2t.LIZLLL("login_title", "");
                        c40883G2t.LIZLLL("group_id", this.LJLJJL);
                        c40883G2t.LIZLLL("author_id", this.LJLJJLL);
                        c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(this.LJLJJL));
                        J9P.LIZIZ(LJIIIIZZ, str4, "like_comment", (Bundle) c40883G2t.LIZ, null);
                        return;
                    }
                    if (C78949Uyf.LJIIJ(this.LJLJI)) {
                        Comment comment4 = this.LJLJI;
                        if (comment4 != null && comment4.isUserBuried()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z3 = !z;
                        if (z3) {
                            AnimatorSet animatorSet = this.LLFZ;
                            if (animatorSet != null) {
                                animatorSet.start();
                            }
                        } else {
                            AnimatorSet animatorSet2 = this.LLI;
                            if (animatorSet2 != null) {
                                animatorSet2.start();
                            }
                        }
                        Comment comment5 = this.LJLJI;
                        if (comment5 != null && comment5.isAuthorDigged()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z3 && (comment2 = this.LJLJI) != null && comment2.isUserDigged()) {
                            if (TextUtils.equals(this.LJLJJLL, ((RBX) HG3.LJIILL()).getCurUserId())) {
                                z2 = false;
                            }
                            Comment comment6 = this.LJLJI;
                            if (comment6 != null) {
                                i2 = comment6.getDiggCount() - 1;
                            } else {
                                i2 = 0;
                            }
                            LJIIJ(Boolean.FALSE, Integer.valueOf(i2), Boolean.valueOf(z2), true, true);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("onHateClicked: comment id ");
                        Comment comment7 = this.LJLJI;
                        if (comment7 != null) {
                            str = comment7.getCid();
                        } else {
                            str = null;
                        }
                        LIZ.append(str);
                        LIZ.append(", toHateState ");
                        LIZ.append(z3);
                        C71Y.LIZLLL("LikeAndHateView", X1D.LIZIZ(LIZ));
                        CommentLikeViewModel commentLikeViewModel = this.LLIFFJFJJ;
                        if (z3) {
                            i = 3;
                        } else {
                            i = 4;
                        }
                        commentLikeViewModel.gv0(i, z2);
                        if (z3) {
                            str2 = "comment_dislike_click";
                        } else {
                            str2 = "comment_dislike_cancel_click";
                        }
                        Comment comment8 = this.LJLJI;
                        if ((comment8 != null && comment8.getCommentType() == 1) || ((comment = this.LJLJI) != null && comment.getCommentType() == 223)) {
                            Comment comment9 = this.LJLJI;
                            if (comment9 != null) {
                                str3 = comment9.getCid();
                            }
                            str3 = null;
                        } else {
                            Comment comment10 = this.LJLJI;
                            if (comment10 != null && comment10.getCommentType() == 2) {
                                Comment comment11 = this.LJLJI;
                                if (comment11 != null) {
                                    str3 = comment11.getReplyId();
                                }
                                str3 = null;
                            }
                        }
                        WeakReference<AbsFragment> weakReference = this.LJLJLJ;
                        if (weakReference != null) {
                            absFragment = weakReference.get();
                        }
                        o.LJII(absFragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment");
                        int LJFF = ((CommentListFragment) absFragment).LLIZLLLIL.LJFF(str3);
                        Comment comment12 = this.LJLJI;
                        C74Z.LIZJ(str2, comment12, this.LJLJL, LJFF, false, V16.LJJIZ(comment12));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        LJI();
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }

    public final void LIZLLL() {
        boolean z;
        int i;
        boolean z2;
        Comment comment;
        int i2;
        if (!this.LLIFFJFJJ.LJLJI && !C174446sy.LIZLLL(this.LJLJI)) {
            Comment comment2 = this.LJLJI;
            String str = null;
            if (comment2 != null && comment2.getCid() != null) {
                RelativeLayout relativeLayout = this.LJLLILLLL;
                int i3 = 1;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    getContext();
                    if (C2NU.LIZ.LIZIZ()) {
                        if (!((RBX) HG3.LJIILL()).isLogin()) {
                            LJII();
                            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                            String str2 = this.LJLJJI;
                            C40883G2t c40883G2t = new C40883G2t();
                            c40883G2t.LIZLLL("login_title", "");
                            c40883G2t.LIZLLL("group_id", this.LJLJJL);
                            c40883G2t.LIZLLL("author_id", this.LJLJJLL);
                            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(this.LJLJJL));
                            J9P.LIZIZ(LJIIIIZZ, str2, "like_comment", (Bundle) c40883G2t.LIZ, null);
                            return;
                        }
                        if (C78949Uyf.LJIIJ(this.LJLJI)) {
                            Comment comment3 = this.LJLJI;
                            if (comment3 != null && comment3.isUserDigged()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z3 = !z;
                            Comment comment4 = this.LJLJI;
                            if (comment4 != null) {
                                int diggCount = comment4.getDiggCount();
                                if (z3) {
                                    i2 = 1;
                                } else {
                                    i2 = -1;
                                }
                                i = diggCount + i2;
                            } else {
                                i = 0;
                            }
                            Comment comment5 = this.LJLJI;
                            if (comment5 != null && comment5.isAuthorDigged()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (TextUtils.equals(this.LJLJJLL, ((RBX) HG3.LJIILL()).getCurUserId())) {
                                z2 = z3;
                            }
                            if (z2) {
                                C74Z.LJIL("show");
                            }
                            if (z3) {
                                AnimatorSet animatorSet = this.LL;
                                if (animatorSet != null) {
                                    animatorSet.start();
                                }
                            } else {
                                AnimatorSet animatorSet2 = this.LLD;
                                if (animatorSet2 != null) {
                                    animatorSet2.start();
                                }
                            }
                            LJIIJ(Boolean.valueOf(z3), Integer.valueOf(i), Boolean.valueOf(z2), false, true);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("onLikeClicked: comment id ");
                            Comment comment6 = this.LJLJI;
                            if (comment6 != null) {
                                str = comment6.getCid();
                            }
                            LIZ.append(str);
                            LIZ.append(", toDiggState ");
                            LIZ.append(z3);
                            LIZ.append(", toDiggCount ");
                            LIZ.append(i);
                            C71Y.LIZLLL("LikeAndHateView", X1D.LIZIZ(LIZ));
                            if (z3 && (comment = this.LJLJI) != null && comment.isUserBuried()) {
                                LJIIIZ(Boolean.FALSE);
                            }
                            CommentLikeViewModel commentLikeViewModel = this.LLIFFJFJJ;
                            if (!z3) {
                                i3 = 2;
                            }
                            commentLikeViewModel.gv0(i3, z2);
                            return;
                        }
                        return;
                    }
                    LJII();
                    C26045AKb c26045AKb = new C26045AKb(this);
                    c26045AKb.LJIIIIZZ(R.string.img);
                    c26045AKb.LJIIJ();
                }
            }
        }
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void LIZIZ() {
        AnimatorSet LIZ = C158976Lt.LIZ(this.LJLLI);
        this.LJZL = LIZ;
        LIZ.addListener(new IDAListenerS72S0100000_3(this, 54));
        AnimatorSet LIZ2 = C158976Lt.LIZ(this.LJLL);
        this.LJZI = LIZ2;
        LIZ2.addListener(new IDAListenerS72S0100000_3(this, 55));
        AnimatorSet LIZJ = C158976Lt.LIZJ(this.LJLL, this.LJLLI);
        this.LLD = LIZJ;
        LIZJ.addListener(new IDAListenerS72S0100000_3(this, 56));
        AnimatorSet LIZIZ = C158976Lt.LIZIZ(this.LJLLI, this.LJLL);
        this.LL = LIZIZ;
        LIZIZ.addListener(new IDAListenerS72S0100000_3(this, 57));
        AnimatorSet LIZ3 = C158976Lt.LIZ(this.LJLLLL);
        this.LLFII = LIZ3;
        LIZ3.addListener(new IDAListenerS72S0100000_3(this, 58));
        AnimatorSet LIZ4 = C158976Lt.LIZ(this.LJLLL);
        this.LLFFF = LIZ4;
        LIZ4.addListener(new IDAListenerS72S0100000_3(this, 59));
        AnimatorSet LIZJ2 = C158976Lt.LIZJ(this.LJLLL, this.LJLLLL);
        this.LLI = LIZJ2;
        LIZJ2.addListener(new IDAListenerS72S0100000_3(this, 60));
        AnimatorSet LIZIZ2 = C158976Lt.LIZIZ(this.LJLLLL, this.LJLLL);
        this.LLFZ = LIZIZ2;
        LIZIZ2.addListener(new IDAListenerS72S0100000_3(this, 61));
        RelativeLayout relativeLayout = this.LJLLILLLL;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(new IDTListenerS113S0100000_3(this, 2));
        }
        RelativeLayout relativeLayout2 = this.LJLLLLLL;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnTouchListener(new IDTListenerS113S0100000_3(this, 3));
        }
    }

    public final void LJI() {
        TuxIconView tuxIconView = this.LJLLL;
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        TuxIconView tuxIconView2 = this.LJLLLL;
        if (tuxIconView2 != null) {
            tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    public final void LJII() {
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            tuxIconView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
        TuxIconView tuxIconView2 = this.LJLLI;
        if (tuxIconView2 != null) {
            tuxIconView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
        }
    }

    public final void LJIIIIZZ() {
        int i;
        RelativeLayout.LayoutParams layoutParams;
        KL2.LJIILLIIL(0, this.LJLLLLLL);
        TuxTextView tuxTextView = this.LJLLJ;
        Comment comment = this.LJLJI;
        if (comment != null && comment.getDiggCount() == 0) {
            i = 4;
        } else {
            i = 0;
        }
        KL2.LJIILLIIL(i, tuxTextView);
        RelativeLayout relativeLayout = this.LJLLILLLL;
        ViewGroup.LayoutParams layoutParams2 = null;
        if (relativeLayout != null) {
            layoutParams2 = relativeLayout.getLayoutParams();
        }
        if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.removeRule(21);
            layoutParams.addRule(16, R.id.e33);
            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42625Go9.LIZIZ(this);
        this.LJLIL.setCurrentState(Lifecycle.State.CREATED);
        this.LLIFFJFJJ.LJLILLLLZI.observe(this, new AObserverS71S0100000_3(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLIL.setCurrentState(Lifecycle.State.DESTROYED);
        this.LJLILLLLZI.clear();
        C42625Go9.LIZJ(this);
    }

    public final Aweme getAweme() {
        return this.LJLJL;
    }

    public final WeakReference<AbsFragment> getFragmentReference() {
        return this.LJLJLJ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LJLIL;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final CommentLikeViewModel getVM() {
        return this.LLIFFJFJJ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.LJLILLLLZI;
    }

    public final void LJIIIZ(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            TuxIconView tuxIconView = this.LJLLL;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(1.0f);
            }
            TuxIconView tuxIconView2 = this.LJLLLL;
            if (tuxIconView2 != null) {
                tuxIconView2.setAlpha(0.0f);
            }
            RelativeLayout relativeLayout = this.LJLLLLLL;
            if (relativeLayout != null) {
                h0.LJJII(relativeLayout, getContext().getString(R.string.ad4));
                return;
            }
            return;
        }
        TuxIconView tuxIconView3 = this.LJLLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setAlpha(0.0f);
        }
        TuxIconView tuxIconView4 = this.LJLLLL;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(1.0f);
        }
        RelativeLayout relativeLayout2 = this.LJLLLLLL;
        if (relativeLayout2 == null) {
            return;
        }
        h0.LJJII(relativeLayout2, getContext().getString(R.string.ad7));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLikeClick(C176406w8 likeEvent) {
        String str;
        o.LJIIIZ(likeEvent, "likeEvent");
        Comment comment = likeEvent.LJLIL;
        String str2 = null;
        if (comment != null) {
            str = comment.getCid();
        } else {
            str = null;
        }
        Comment comment2 = this.LJLJI;
        if (comment2 != null) {
            str2 = comment2.getCid();
        }
        if (o.LJ(str, str2)) {
            LIZLLL();
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i != 4 && i != 8) {
                return;
            }
            this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            return;
        }
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        this.LJLIL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public final void setAweme(Aweme aweme) {
        this.LJLJL = aweme;
    }

    public final void setFragmentReference(WeakReference<AbsFragment> weakReference) {
        this.LJLJLJ = weakReference;
    }

    public final void LJFF(AnonymousClass704 action, Throwable th) {
        Integer valueOf;
        C38306F1q c38306F1q;
        C38306F1q c38306F1q2;
        CommentListFragment commentListFragment;
        C38306F1q c38306F1q3;
        C38306F1q c38306F1q4;
        o.LJIIIZ(action, "action");
        int i = AnonymousClass703.LIZ[action.ordinal()];
        AbsFragment absFragment = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        valueOf = Integer.valueOf(R.string.cgn);
                        if ((th instanceof C38333F2r) && (c38306F1q4 = (C38306F1q) th) != null && c38306F1q4.getErrorCode() == 3002043) {
                            valueOf = Integer.valueOf(R.string.cgo);
                        }
                    }
                    if (!(th instanceof C38333F2r) && (c38306F1q2 = (C38306F1q) th) != null && c38306F1q2.getErrorCode() == 3002043) {
                        WeakReference<AbsFragment> weakReference = this.LJLJLJ;
                        if (weakReference != null) {
                            absFragment = weakReference.get();
                        }
                        if ((absFragment instanceof CommentListFragment) && (commentListFragment = (CommentListFragment) absFragment) != null) {
                            commentListFragment.LJLILLLLZI.setCommentClose(true);
                            commentListFragment.mo(commentListFragment.LJLILLLLZI, false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                valueOf = Integer.valueOf(R.string.cgn);
            } else {
                valueOf = Integer.valueOf(R.string.tdd);
                if ((th instanceof C38333F2r) && (c38306F1q3 = (C38306F1q) th) != null && c38306F1q3.getErrorCode() == 3002043) {
                    valueOf = Integer.valueOf(R.string.dmc);
                }
            }
        } else {
            valueOf = Integer.valueOf(R.string.ei0);
            if ((th instanceof C38333F2r) && (c38306F1q = (C38306F1q) th) != null && c38306F1q.getErrorCode() == 3002043) {
                valueOf = Integer.valueOf(R.string.dmb);
            }
        }
        if (valueOf != null) {
            C1A7.LJIJJLI(getContext(), th, valueOf.intValue());
        }
        if (!(th instanceof C38333F2r)) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass708(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass708.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r10 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        r11 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r12 = r20.LJLJL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r6 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        r5 = r6.getPageType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r5 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        r13 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        r5 = r6.isHotPlayer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        r7 = r5.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        r14 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        r15 = r6.getLastGroupId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r16 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        r17 = r6.getNewsId();
        r18 = r6.getVideoFrom();
        r19 = r6.getAdditionalParams();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        r3.LJLJLJ = new X.AnonymousClass706(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r4 = X.X1D.LIZ();
        r4.append("diggView bind: comment id ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
    
        if (r21 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        r3 = r21.getCid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        r4.append(r3);
        r4.append(", isDigg ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
    
        if (r21 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
    
        r3 = java.lang.Boolean.valueOf(r21.isUserDigged());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
    
        r4.append(r3);
        r4.append(", diggCount ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e7, code lost:
    
        if (r21 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        r3 = java.lang.Integer.valueOf(r21.getDiggCount());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
    
        r4.append(r3);
        X.C71Y.LIZLLL("LikeAndHateView", X.X1D.LIZIZ(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
    
        if (r20.LJLJLLL != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
    
        LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (r21 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r4 = java.lang.Boolean.valueOf(r21.isUserDigged());
        r5 = java.lang.Integer.valueOf(r21.getDiggCount());
        r6 = java.lang.Boolean.valueOf(r21.isAuthorDigged);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011c, code lost:
    
        LJIIJ(r4, r5, r6, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        if (r21 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r2 = java.lang.Boolean.valueOf(r21.isUserBuried());
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
    
        LJIIIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        r4 = null;
        r5 = null;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0134, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0136, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0138, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013a, code lost:
    
        r17 = null;
        r18 = null;
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0142, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0091, code lost:
    
        if (r6 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0080, code lost:
    
        r11 = r6.getEventType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0084, code lost:
    
        if (r11 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0075, code lost:
    
        if (r6 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.comment.model.Comment r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass708.LIZ(com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public final void LJIIJ(Boolean bool, Integer num, Boolean bool2, boolean z, boolean z2) {
        long j;
        int i;
        int i2;
        int i3 = 0;
        if (z) {
            if (o.LJ(bool, Boolean.TRUE)) {
                TuxIconView tuxIconView = this.LJLLI;
                if (tuxIconView != null) {
                    tuxIconView.setAlpha(0.0f);
                }
                TuxIconView tuxIconView2 = this.LJLL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setAlpha(1.0f);
                }
                RelativeLayout relativeLayout = this.LJLLILLLL;
                if (relativeLayout != null) {
                    String string = getContext().getString(R.string.ad6);
                    o.LJIIIIZZ(string, "context.getString(R.stri…rYou_commments_btn_liked)");
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    h0.LJJII(relativeLayout, C208078Ep.LIZ(string, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(i2)))));
                }
            } else {
                TuxIconView tuxIconView3 = this.LJLLI;
                if (tuxIconView3 != null) {
                    tuxIconView3.setAlpha(1.0f);
                }
                TuxIconView tuxIconView4 = this.LJLL;
                if (tuxIconView4 != null) {
                    tuxIconView4.setAlpha(0.0f);
                }
                RelativeLayout relativeLayout2 = this.LJLLILLLL;
                if (relativeLayout2 != null) {
                    String string2 = getContext().getString(R.string.ad8);
                    o.LJIIIIZZ(string2, "context.getString(R.stri…u_commments_btn_notLiked)");
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 0;
                    }
                    h0.LJJII(relativeLayout2, C208078Ep.LIZ(string2, C51029K0z.LJJIIZI(new OSZ("number", String.valueOf(i)))));
                }
            }
        }
        TuxTextView tuxTextView = this.LJLLJ;
        if (tuxTextView != null) {
            if (num != null && num.intValue() == 0) {
                i3 = 4;
            }
            tuxTextView.setVisibility(i3);
            if (num != null) {
                j = num.intValue();
            } else {
                j = 0;
            }
            tuxTextView.setText(C77123UOp.LJJIIJ(j));
            if (o.LJ(bool, Boolean.TRUE)) {
                tuxTextView.setTextColorRes(R.attr.eb);
            } else {
                tuxTextView.setTextColorRes(R.attr.gx);
            }
        }
        if (z2) {
            Boolean bool3 = Boolean.TRUE;
            String str = null;
            if (o.LJ(bool2, bool3)) {
                Comment comment = this.LJLJI;
                if (comment != null) {
                    str = comment.getCid();
                }
                C2U8.LIZ(new C2UX(str, bool3));
                return;
            }
            Comment comment2 = this.LJLJI;
            if (comment2 != null) {
                str = comment2.getCid();
            }
            C2U8.LIZ(new C2UX(str, Boolean.FALSE));
        }
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
