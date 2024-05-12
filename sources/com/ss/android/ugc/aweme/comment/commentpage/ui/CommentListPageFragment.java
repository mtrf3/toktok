package com.ss.android.ugc.aweme.comment.commentpage.ui;

import X.AV1;
import X.ActivityC45651qj;
import X.AnonymousClass700;
import X.AnonymousClass759;
import X.AnonymousClass765;
import X.C118234kV;
import X.C174366sq;
import X.C174676tL;
import X.C175236uF;
import X.C176096vd;
import X.C176186vm;
import X.C176746wg;
import X.C176776wj;
import X.C176826wo;
import X.C178016yj;
import X.C1791971n;
import X.C17N;
import X.C188727au;
import X.C1B3;
import X.C1JD;
import X.C222578oP;
import X.C2U8;
import X.C2UD;
import X.C32151Nz;
import X.C35979EAd;
import X.C47261Igj;
import X.C47959Irz;
import X.C50420Jqa;
import X.C53816LAe;
import X.C54838Lfe;
import X.C56702Kk;
import X.C65777Prh;
import X.C71Y;
import X.C75D;
import X.C75E;
import X.C75J;
import X.C75K;
import X.C75M;
import X.C75N;
import X.C75O;
import X.C75S;
import X.C75V;
import X.C75W;
import X.C75Z;
import X.C76800UCe;
import X.C76A;
import X.C78886Uxe;
import X.C78977Uz7;
import X.C79004UzY;
import X.C79045V0n;
import X.C7CA;
import X.C7DE;
import X.C7GH;
import X.C7GI;
import X.C80683VlX;
import X.C80684VlY;
import X.C80688Vlc;
import X.ExecutorC142245i8;
import X.FMX;
import X.FNH;
import X.InterfaceC173976sD;
import X.InterfaceC175696uz;
import X.InterfaceC1800674w;
import X.InterfaceC218588hy;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC80690Vle;
import X.InterfaceC81204Vtw;
import X.LFH;
import X.LTT;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.SY9;
import X.X1D;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS7S0101000_3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentColorModeViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.viewmodel.CommentOrientationVM;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.likelist.ui.LikeListFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListAuthorizationFragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListFragment;
import com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout;
import com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public class CommentListPageFragment extends AbsFragment implements InterfaceC173976sD, C75J, InterfaceC81204Vtw, InterfaceC175696uz {
    public static final int LLILLIZIL = C17N.LJIILL(16.0d);
    public static final int LLILLJJLI = C17N.LJIILL(99.0d);
    public static long LLILLL;
    public View LJLIL;
    public CommentNestedLayout LJLILLLLZI;
    public TuxIconView LJLJI;
    public View LJLJJI;
    public TuxTextView LJLJJL;
    public TuxIconView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxIconView LJLJLJ;
    public ViewGroup LJLJLLL;
    public ViewPager LJLL;
    public C7DE LJLLI;
    public C80684VlY LJLLILLLL;
    public View LJLLJ;
    public Widget LJLLLLLL;
    public C75O LJLZ;
    public DataCenter LJZ;
    public AnonymousClass765<?> LJZI;
    public WidgetManager LJZL;
    public ViewGroup LL;
    public InterfaceC72642tA<C50420Jqa> LLF;
    public Aweme LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public long LLII;
    public long LLIIII;
    public long LLIIIILZ;
    public CommentColorModeViewModel LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public boolean LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public CommentOrientationVM LLILII;
    public InterfaceC65784Pro<C76800UCe> LLILIL;
    public final Map<Integer, View> LLILL = new LinkedHashMap();
    public final List<Fragment> LJLLL = new ArrayList();
    public final List<Integer> LJLLLL = new ArrayList();
    public C174366sq LLD = new C174366sq("");
    public int LLIFFJFJJ = -1;
    public String LLIIIJ = "";
    public final boolean LLIILII = C178016yj.LIZ();

    @Override // X.InterfaceC81204Vtw
    public final String F6() {
        return "comment_page_tablet";
    }

    @Override // X.InterfaceC81204Vtw
    public final void Q2() {
    }

    @Override // X.InterfaceC81204Vtw
    public final Fragment R4() {
        return this;
    }

    @Override // X.InterfaceC173976sD
    public final int Ed() {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            return viewGroup.getMeasuredHeight();
        }
        return 0;
    }

    public final Fragment Il() {
        if (((ArrayList) this.LJLLLL).isEmpty() || ((ArrayList) this.LJLLL).isEmpty()) {
            return null;
        }
        return (Fragment) ListProtector.get(this.LJLLL, ((ArrayList) this.LJLLLL).indexOf(0));
    }

    @Override // X.InterfaceC81204Vtw
    public final float LLJJJJLIIL() {
        return LFH.LIZIZ.LIZLLL().LJIILJJIL().LLJJJJLIIL();
    }

    public final void Ll() {
        C174366sq c174366sq = this.LLD;
        if (c174366sq != null && c174366sq.isSplitMode()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLILIL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        CommentNestedLayout commentNestedLayout = this.LJLILLLLZI;
        if (commentNestedLayout == null) {
            return;
        }
        commentNestedLayout.LIZLLL("");
    }

    public final void Ml() {
        if (C79004UzY.LJJIFFI(this.LJLLL)) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 instanceof AnonymousClass759) {
                ((AnonymousClass759) interfaceC36571c5).LLJLILLLLZIIL(((ArrayList) this.LJLLL).size());
            }
        }
    }

    @Override // X.InterfaceC81204Vtw
    public final void Og() {
        Ol("");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c6 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Yl() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment.Yl():void");
    }

    @Override // X.InterfaceC173976sD
    public final void show() {
        C75O c75o;
        InterfaceC218588hy interfaceC218588hy;
        CommentNestedLayout commentNestedLayout = this.LJLILLLLZI;
        if (commentNestedLayout != null) {
            C174366sq c174366sq = this.LLD;
            if (c174366sq != null) {
                c75o = c174366sq.getOnShowHeightChangeListener();
            } else {
                c75o = null;
            }
            this.LJLZ = c75o;
            commentNestedLayout.setOnShowHeightChangeListener(new C75O() { // from class: X.75L
                @Override // X.C75O
                public final void O4(float f, float f2) {
                    C75O c75o2;
                    if (f2 == 0.0f || (c75o2 = CommentListPageFragment.this.LJLZ) == null) {
                        return;
                    }
                    c75o2.O4(f, f2);
                }
            });
            C174366sq c174366sq2 = this.LLD;
            if (c174366sq2 != null) {
                interfaceC218588hy = c174366sq2.getOnScrollStateChangedListener();
            } else {
                interfaceC218588hy = null;
            }
            commentNestedLayout.setOnScrollStateChangedListener(interfaceC218588hy);
            CommentNestedLayout.LIZIZ(commentNestedLayout, true, true, null, 4);
            C78977Uz7.LJJLIIIIJ(new ARunnableS10S0101000_6(commentNestedLayout, 12));
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            tuxIconView.performAccessibilityAction(64, null);
        }
    }

    public final void vl() {
        AnonymousClass759 anonymousClass759;
        if (C79004UzY.LJJIFFI(this.LJLLL)) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if ((interfaceC36571c5 instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) interfaceC36571c5) != null) {
                if (((ArrayList) this.LJLLL).size() != 1) {
                    z = false;
                }
                anonymousClass759.qc(z);
            }
        }
        int i = 8;
        if (((ArrayList) this.LJLLL).size() > 1) {
            C80684VlY c80684VlY = this.LJLLILLLL;
            if (c80684VlY != null) {
                c80684VlY.setVisibility(0);
            }
            TuxTextView tuxTextView = this.LJLJJL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            View view = this.LJLJJI;
            if (view != null) {
                C78886Uxe.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)), view);
            }
            if (C75S.LIZ()) {
                this.LLIL = C47959Irz.LIZJ(48, (int) getResources().getDimension(R.dimen.gq));
                if (C75S.LIZ()) {
                    this.LLIIZ = this.LLIL;
                }
            }
            C80684VlY c80684VlY2 = this.LJLLILLLL;
            if (c80684VlY2 != null) {
                c80684VlY2.setSelectedTabIndicatorHeight(C17N.LJIILL(2.0d));
            }
            View view2 = this.LJLLJ;
            if (view2 != null) {
                C174366sq c174366sq = this.LLD;
                if (c174366sq == null || !c174366sq.isSplitMode()) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
        } else {
            View view3 = this.LJLJJI;
            if (view3 != null) {
                C78886Uxe.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)), view3);
            }
            this.LLIL = C47959Irz.LIZJ(40, (int) getResources().getDimension(R.dimen.gq));
            if (C75S.LIZ()) {
                this.LLIIZ = this.LLIL;
            }
            C80684VlY c80684VlY3 = this.LJLLILLLL;
            if (c80684VlY3 != null) {
                c80684VlY3.setVisibility(8);
            }
            TuxTextView tuxTextView2 = this.LJLJJL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            View view4 = this.LJLLJ;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        Ml();
        Wl(0);
    }

    public final boolean xl() {
        Aweme aweme;
        if ((((Number) C76A.LIZ.getValue()).intValue() & 1) == 1 && (aweme = this.LLFF) != null && AV1.LJIJI(aweme.getAuthorUid())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC173976sD
    public final boolean y5() {
        CommentNestedLayout commentNestedLayout = this.LJLILLLLZI;
        if (commentNestedLayout == null || commentNestedLayout.LLI == null || !commentNestedLayout.LLILLIZIL) {
            return false;
        }
        return true;
    }

    public static boolean Rl() {
        if (CommentServiceImpl.LJJL().LJIIIIZZ() && C7GH.LJII()) {
            return true;
        }
        return false;
    }

    public final void Xl() {
        if (!C7GI.LIZ()) {
            return;
        }
        Set LIZ = C75V.LIZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : LIZ) {
            InterfaceC1800674w interfaceC1800674w = (InterfaceC1800674w) obj;
            if (interfaceC1800674w.LIZ() == 5 || interfaceC1800674w.LIZ() == 4) {
                arrayList.add(obj);
            }
        }
        Ql(ORZ.LLJILLL(arrayList));
    }

    @Override // androidx.fragment.app.Fragment
    public final Context getContext() {
        Context context = super.getContext();
        CommentColorModeViewModel commentColorModeViewModel = this.LLIIIL;
        if (commentColorModeViewModel == null) {
            return context;
        }
        if (context == null) {
            return null;
        }
        return commentColorModeViewModel.gv0(context);
    }

    @Override // X.InterfaceC175696uz
    public final String ic() {
        return String.valueOf(hashCode());
    }

    @Override // X.InterfaceC173976sD, X.C75J
    public final boolean isShowing() {
        CommentNestedLayout commentNestedLayout;
        if (!isVisible() || (commentNestedLayout = this.LJLILLLLZI) == null || !commentNestedLayout.LJI()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WidgetManager widgetManager = this.LJZL;
        if (widgetManager != null) {
            widgetManager.Il(this.LJLLLLLL);
        }
        ((LinkedHashMap) this.LLILL).clear();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLFII) {
            this.LLFII = false;
        } else if (isShowing() && this.LLIIII != 0) {
            this.LLIIIILZ = (System.currentTimeMillis() - this.LLIIII) + this.LLIIIILZ;
            this.LLIIII = 0L;
        }
        Xl();
    }

    public final void onShow() {
        AnonymousClass759 anonymousClass759;
        boolean z;
        if (mo49getActivity() != null) {
            C174366sq c174366sq = this.LLD;
            int i = 0;
            if (c174366sq != null && c174366sq.isSplitMode()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                LTT.LJ(requireActivity);
            } else {
                ActivityC45651qj requireActivity2 = requireActivity();
                o.LJIIIIZZ(requireActivity2, "requireActivity()");
                LTT.LIZJ(requireActivity2);
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            }
            C2U8.LIZ(new C56702Kk(1, i));
        }
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        if (((Boolean) C7CA.LJ.getValue()).booleanValue()) {
            FNH.LIZLLL(FNH.LIZ, new String[]{"start_jit_block"}, 500L, 4);
        }
        if (C7CA.LIZIZ()) {
            FNH.LIZLLL(FNH.LIZ, new String[]{"start_boot_finish"}, 500L, 4);
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if ((interfaceC36571c5 instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) interfaceC36571c5) != null) {
                mo49getActivity();
                anonymousClass759.ig();
            }
        }
        Pl(true);
        Xl();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLIIII = System.currentTimeMillis();
    }

    @Override // X.InterfaceC81204Vtw
    public final void Of() {
        onShow();
    }

    @Override // X.InterfaceC173976sD
    public final TuxTextView Xb() {
        return this.LJLJJL;
    }

    public static boolean Al(Aweme aweme) {
        if (aweme == null || aweme.nowPostInfo != null || !AV1.LJIJI(aweme.getAuthorUid()) || !C7GH.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC81204Vtw
    public final void Aj(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            Object obj = params[1];
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            LLIFFJFJJ((Aweme) obj);
            Object obj2 = params[0];
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.param.VideoCommentPageParam");
            Sl((C174366sq) obj2);
            onShow();
        }
    }

    @Override // X.InterfaceC173976sD
    public final void E8(boolean z) {
        CommentNestedLayout commentNestedLayout;
        ObjectAnimator objectAnimator;
        C174366sq c174366sq = this.LLD;
        if ((c174366sq == null || !c174366sq.isSplitMode()) && (commentNestedLayout = this.LJLILLLLZI) != null) {
            if (z && commentNestedLayout.LJI()) {
                commentNestedLayout.LJII(new C75E(C75D.HIDE_START));
            }
            ObjectAnimator objectAnimator2 = commentNestedLayout.LLF;
            if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = commentNestedLayout.LLF) != null) {
                objectAnimator.cancel();
            }
            commentNestedLayout.setVisibility(8);
            if (commentNestedLayout.LJ()) {
                float f = commentNestedLayout.LJZ;
                if (f > 0.0f) {
                    commentNestedLayout.setTranslationX(f);
                }
            } else {
                float f2 = commentNestedLayout.LJLZ;
                if (f2 > 0.0f) {
                    commentNestedLayout.setTranslationY(f2);
                }
            }
            commentNestedLayout.LJIIIIZZ();
            commentNestedLayout.setStateInternal(1);
        }
    }

    @Override // X.InterfaceC173976sD
    public final void Hj(String str) {
        CommentNestedLayout commentNestedLayout;
        C174366sq c174366sq = this.LLD;
        if ((c174366sq == null || !c174366sq.isSplitMode()) && (commentNestedLayout = this.LJLILLLLZI) != null) {
            commentNestedLayout.LIZLLL(str);
        }
    }

    public final String Jl(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            C174366sq c174366sq = this.LLD;
            if (c174366sq != null) {
                str2 = c174366sq.getEventType();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(str2, "notification_page")) {
                return "click_notification";
            }
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.C75J
    public final void Kc(Comment comment) {
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 instanceof C75J) {
                ((C75J) interfaceC36571c5).Kc(comment);
            }
        }
    }

    public final String Kl(int i) {
        if (((ArrayList) this.LJLLLL).size() == 1 || (((ArrayList) this.LJLLLL).size() > 1 && i < 0)) {
            i = 0;
        } else if (C79004UzY.LJJIFFI(this.LJLLLL) || i < 0 || i >= ((ArrayList) this.LJLLLL).size()) {
            return "";
        }
        int intValue = ((Number) ListProtector.get(this.LJLLLL, i)).intValue();
        if (intValue != 1 && intValue != 2) {
            if (intValue != 3) {
                if (intValue != 4) {
                    if (intValue != 5) {
                        return "comment";
                    }
                    return "views_auth";
                }
                return "views";
            }
            return "view";
        }
        return "like";
    }

    public final void LLIFFJFJJ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (this.LLFF == aweme) {
            return;
        }
        this.LLFF = aweme;
        if (!C79004UzY.LJJIFFI(this.LJLLL)) {
            Iterator it = ((ArrayList) this.LJLLL).iterator();
            while (it.hasNext()) {
                InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
                if (interfaceC36571c5 instanceof AnonymousClass759) {
                    ((AnonymousClass759) interfaceC36571c5).LJJLIIIJ(aweme);
                }
            }
        }
    }

    public final void Ol(String str) {
        Map LIZJ;
        int i;
        TuxIconView tuxIconView = this.LJLJI;
        ArrayList arrayList = null;
        if (tuxIconView != null) {
            tuxIconView.performAccessibilityAction(128, null);
        }
        this.LLIIIZ = false;
        this.LLIIJI = false;
        if (mo49getActivity() != null) {
            C174366sq c174366sq = this.LLD;
            if (c174366sq == null || !c174366sq.isSplitMode()) {
                ActivityC45651qj requireActivity = requireActivity();
                o.LJIIIIZZ(requireActivity, "requireActivity()");
                LTT.LIZJ(requireActivity);
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = mo49getActivity.hashCode();
            } else {
                i = 0;
            }
            C2U8.LIZ(new C56702Kk(0, i));
        }
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            LifecycleOwner lifecycleOwner = (Fragment) it.next();
            if (lifecycleOwner instanceof AnonymousClass759) {
                mo49getActivity();
                ((AnonymousClass759) lifecycleOwner).d2(str);
            }
            if (lifecycleOwner != null) {
                IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZJ(lifecycleOwner);
            }
        }
        Pl(false);
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C35979EAd LIZJ2 = C75W.LIZJ();
            if (LIZJ2 != null && (LIZJ = LIZJ2.LIZJ()) != null) {
                arrayList = new ArrayList(LIZJ.size());
                for (Map.Entry entry : LIZJ.entrySet()) {
                    Object value = entry.getValue();
                    o.LJIIIIZZ(value, "it.value");
                    long longValue = ((Number) value).longValue();
                    Object key = entry.getKey();
                    o.LJIIIIZZ(key, "it.key");
                    arrayList.add(new C75K(longValue, (String) key));
                }
            }
            C75W.LIZ.storeString(C75W.LIZJ, GsonProtectorUtils.toJson(C75W.LIZIZ, arrayList));
        }
    }

    public final void Pl(boolean z) {
        long j;
        String eventType;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4 = null;
        if (z) {
            if (this.LLII == 0) {
                this.LLII = System.currentTimeMillis();
            }
            this.LLI = true;
            if (!this.LLFZ) {
                C174366sq c174366sq = this.LLD;
                if (c174366sq != null) {
                    num = Integer.valueOf(c174366sq.getLocatePageType());
                } else {
                    num = null;
                }
                int LJZ = ORZ.LJZ(num, this.LJLLLL);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onVisibleToUser locate:");
                LIZ.append(num);
                LIZ.append("  position:");
                LIZ.append(LJZ);
                LIZ.append("  current position:");
                LIZ.append(this.LLIFFJFJJ);
                C71Y.LIZ("comment_page", X1D.LIZIZ(LIZ));
                C174366sq c174366sq2 = this.LLD;
                if (c174366sq2 != null) {
                    str3 = c174366sq2.getEnterMethod();
                } else {
                    str3 = null;
                }
                Hl(this.LLIFFJFJJ, str3);
                this.LLFZ = true;
            } else {
                C71Y.LIZ("comment_page", "onVisibleToUser locate: has mob");
            }
            String str5 = "";
            if (this.LLFF != null && TcmServiceImpl.LJIJI().LIZLLL(this.LLFF)) {
                Aweme aweme = this.LLFF;
                if (aweme != null) {
                    str = aweme.getAuthorUid();
                } else {
                    str = null;
                }
                C174366sq c174366sq3 = this.LLD;
                if (c174366sq3 == null || (str2 = c174366sq3.getEventType()) == null) {
                    str2 = "";
                }
                C2U8.LIZ(new C75N(str, str2));
            }
            Aweme aweme2 = this.LLFF;
            if (aweme2 != null && BAAnchorServiceImpl.LJII().LIZLLL(aweme2) != null) {
                String aid = aweme2.getAid();
                if (aid == null) {
                    aid = "";
                }
                C174366sq c174366sq4 = this.LLD;
                if (c174366sq4 != null && (eventType = c174366sq4.getEventType()) != null) {
                    str5 = eventType;
                }
                C2U8.LIZ(new C75M(aid, str5));
            }
            C174366sq c174366sq5 = this.LLD;
            if (c174366sq5 != null) {
                str4 = c174366sq5.getEventType();
            }
            String param = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new C2UD(str4));
            IEventCenter LJ = EventCenter.LJ();
            o.LJIIIIZZ(param, "param");
            LJ.LIZ("ec_anchor_open_comment", param);
            return;
        }
        if (this.LLII == 0) {
            return;
        }
        this.LLI = false;
        C174366sq c174366sq6 = this.LLD;
        if (c174366sq6 != null) {
            str4 = c174366sq6.getEnterMethod();
        }
        int i = this.LLIFFJFJJ;
        long currentTimeMillis = System.currentTimeMillis() - this.LLII;
        long j2 = this.LLIIIILZ;
        if (currentTimeMillis > j2) {
            j = currentTimeMillis - j2;
        } else {
            j = 0;
        }
        this.LLII = 0L;
        this.LLIIII = 0L;
        this.LLIIIILZ = 0L;
        Dl(i, str4, "close", j);
    }

    public final void Ql(Set<InterfaceC1800674w> set) {
        for (InterfaceC1800674w interfaceC1800674w : set) {
            if (interfaceC1800674w.LIZIZ(this.LLFF)) {
                int LIZ = interfaceC1800674w.LIZ();
                if (((ArrayList) this.LJLLLL).contains(Integer.valueOf(LIZ))) {
                    continue;
                } else {
                    ActivityC45651qj requireActivity = requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    Fragment LIZJ = interfaceC1800674w.LIZJ(requireActivity, this.LLD, this.LLFF, this);
                    if (LIZJ == null) {
                        return;
                    }
                    ((ArrayList) this.LJLLL).add(LIZJ);
                    ((ArrayList) this.LJLLLL).add(Integer.valueOf(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("pageItemChange add Item ");
                    LIZ2.append(LIZ);
                    C71Y.LIZLLL("comment_page", X1D.LIZIZ(LIZ2));
                    AnonymousClass765<?> anonymousClass765 = this.LJZI;
                    if (anonymousClass765 != null) {
                        anonymousClass765.notifyDataSetChanged();
                    }
                    vl();
                    wl(true);
                }
            } else {
                int LIZ3 = interfaceC1800674w.LIZ();
                if (!((ArrayList) this.LJLLLL).isEmpty() && this.LJZI != null) {
                    int size = ((ArrayList) this.LJLLLL).size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (((Number) ListProtector.get(this.LJLLLL, i)).intValue() == LIZ3) {
                            ListProtector.remove(this.LJLLLL, i);
                            ListProtector.remove(this.LJLLL, i);
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("removeListByType pageType:");
                            LIZ4.append(LIZ3);
                            C71Y.LIZLLL("comment_page", X1D.LIZIZ(LIZ4));
                            AnonymousClass765<?> anonymousClass7652 = this.LJZI;
                            if (anonymousClass7652 != null) {
                                anonymousClass7652.notifyDataSetChanged();
                            }
                            vl();
                            wl(false);
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
    }

    @Override // X.C75J
    public final void Ri(Comment comment) {
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 instanceof C75J) {
                ((C75J) interfaceC36571c5).Ri(comment);
            }
        }
    }

    public final void Sl(C174366sq c174366sq) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        C174366sq c174366sq2;
        ViewGroup viewGroup;
        C174366sq c174366sq3;
        AnonymousClass759 anonymousClass759;
        C174366sq c174366sq4;
        C174366sq c174366sq5;
        C174366sq c174366sq6;
        C174366sq c174366sq7;
        if (c174366sq.isForceRefresh() || this.LLIIIZ || this.LLIIJI) {
            z = true;
        } else {
            z = false;
        }
        c174366sq.forceRefresh(z);
        String aid = c174366sq.getAid();
        C174366sq c174366sq8 = this.LLD;
        String str2 = null;
        if (c174366sq8 == null || (str = c174366sq8.getAid()) == null) {
            str = "";
        }
        if (TextUtils.equals(aid, str) && (c174366sq5 = this.LLD) != null && c174366sq.isCommentClose() == c174366sq5.isCommentClose() && (c174366sq6 = this.LLD) != null && c174366sq.isCommentLimited() == c174366sq6.isCommentLimited() && (c174366sq7 = this.LLD) != null && c174366sq.isEnableComment() == c174366sq7.isEnableComment()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c174366sq.getLocatePageType() == 4 && Al(this.LLFF) && !((ArrayList) this.LJLLLL).contains(4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentListPageFragment: resetPageParam() => differentAweme = ");
        LIZ.append(z2);
        LIZ.append(" forceResetPage =  ");
        LIZ.append(z3);
        C176186vm.LIZ(X1D.LIZIZ(LIZ));
        if (!z2 && !z3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("CommentListPageFragment: resetPageParam() => differentAweme = false, new aid = ");
            LIZ2.append(c174366sq.getAid());
            C176186vm.LIZ(X1D.LIZIZ(LIZ2));
            String enterMethod = c174366sq.getEnterMethod();
            C174366sq c174366sq9 = this.LLD;
            if (c174366sq9 != null) {
                str2 = c174366sq9.getEnterMethod();
            }
            if (!TextUtils.equals(enterMethod, str2) && (c174366sq4 = this.LLD) != null) {
                c174366sq4.setEnterMethod(c174366sq.getEnterMethod());
            }
            Tl(c174366sq);
            C118234kV it = C47261Igj.LJJ(this.LJLLLL).iterator();
            while (it.LJLJI) {
                Object obj = ListProtector.get(this.LJLLL, it.nextInt());
                if ((obj instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) obj) != null) {
                    anonymousClass759.Be(c174366sq);
                }
            }
            return;
        }
        this.LLD = c174366sq;
        Context context = getContext();
        if (context != null && z2 && (c174366sq3 = this.LLD) != null) {
            Aweme aweme = c174366sq3.getAweme();
            if ((C175236uF.LIZ() & 2) == 2 && aweme != null) {
                C176746wg.LIZIZ(c174366sq3, aweme, context);
            }
            if ((C176826wo.LIZ() & 1) == 1) {
                C176776wj.LJFF(c174366sq3, c174366sq3.getAweme());
            }
        }
        if (getContext() != null && (viewGroup = this.LL) != null) {
            viewGroup.setVisibility(8);
        }
        Ql(C75V.LIZ());
        C174366sq c174366sq10 = this.LLD;
        if (c174366sq10 != null && c174366sq10.getLocatePageType() < 0 && (c174366sq2 = this.LLD) != null) {
            c174366sq2.setLocatePageType(0);
        }
        Tl(this.LLD);
        if (!C79004UzY.LJJIFFI(this.LJLLL)) {
            Iterator it2 = ((ArrayList) this.LJLLL).iterator();
            while (it2.hasNext()) {
                InterfaceC36571c5 interfaceC36571c5 = (Fragment) it2.next();
                if (interfaceC36571c5 instanceof AnonymousClass759) {
                    ((AnonymousClass759) interfaceC36571c5).Be(c174366sq);
                }
            }
        }
        DataCenter dataCenter = this.LJZ;
        if (dataCenter != null) {
            dataCenter.jv0(new OSZ(this.LLFF, this.LLD), "comment_aweme_and_params");
        }
        Yl();
    }

    public final void Tl(C174366sq c174366sq) {
        int i;
        AnonymousClass765<?> anonymousClass765;
        AnonymousClass759 anonymousClass759;
        if (c174366sq == null || c174366sq.getLocatePageType() < 0) {
            return;
        }
        if (C79004UzY.LJJIFFI(this.LJLLLL)) {
            ViewPager viewPager = this.LJLL;
            if (viewPager != null && (anonymousClass765 = this.LJZI) != null && anonymousClass765.getCount() > 0) {
                viewPager.setCurrentItem(0, false);
                Object obj = ListProtector.get(this.LJLLL, 0);
                if ((obj instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) obj) != null) {
                    anonymousClass759.Y8(true);
                    return;
                }
                return;
            }
            return;
        }
        int locatePageType = c174366sq.getLocatePageType();
        int size = ((ArrayList) this.LJLLLL).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Number) ListProtector.get(this.LJLLLL, i2)).intValue() == locatePageType) {
                if (this.LJLL != null) {
                    AnonymousClass765<?> anonymousClass7652 = this.LJZI;
                    if (anonymousClass7652 != null) {
                        i = anonymousClass7652.getCount();
                    } else {
                        i = 0;
                    }
                    if (i > i2) {
                        if (c174366sq.isSmoothScrollLocate()) {
                            ExecutorC142245i8.LJLILLLLZI.LIZ(400L, new ARunnableS7S0101000_3(i2, this, 2));
                            return;
                        } else {
                            Vl(i2, false);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void Wl(int i) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryOpenSwipeToRight2Close ");
        LIZ.append(i);
        C71Y.LIZ("comment_page", X1D.LIZIZ(LIZ));
        if (i >= ((ArrayList) this.LJLLLL).size()) {
            return;
        }
        int indexOf = ((ArrayList) this.LJLLLL).indexOf(Integer.valueOf(i));
        CommentNestedLayout commentNestedLayout = this.LJLILLLLZI;
        if (commentNestedLayout != null) {
            if (indexOf == 0 && i == 0) {
                z = true;
            } else {
                z = false;
            }
            commentNestedLayout.setEnableSwipeRightToClose(z);
        }
    }

    @Override // X.InterfaceC173976sD
    public final void a3(AnonymousClass759 pageItem) {
        C80684VlY c80684VlY;
        C80688Vlc LJIIJ;
        o.LJIIIZ(pageItem, "pageItem");
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (o.LJ(pageItem, next)) {
                    i = i2;
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i < 0 || (c80684VlY = this.LJLLILLLL) == null || (LJIIJ = c80684VlY.LJIIJ(i)) == null) {
            return;
        }
        LJIIJ.LIZIZ = pageItem.v(requireContext());
        LJIIJ.LIZIZ();
    }

    @Override // X.InterfaceC81204Vtw
    public final void b2(Object... params) {
        ViewGroup viewGroup;
        o.LJIIIZ(params, "params");
        if (params.length == 2) {
            Object obj = params[1];
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            LLIFFJFJJ((Aweme) obj);
            Object obj2 = params[0];
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.param.VideoCommentPageParam");
            C174366sq c174366sq = (C174366sq) obj2;
            if (getContext() != null && (viewGroup = this.LL) != null) {
                viewGroup.setVisibility(8);
            }
            Ql(C75V.LIZ());
            if (c174366sq.getLocatePageType() < 0) {
                c174366sq.setLocatePageType(0);
            }
            Tl(c174366sq);
            if (!C79004UzY.LJJIFFI(this.LJLLL)) {
                Iterator it = ((ArrayList) this.LJLLL).iterator();
                while (it.hasNext()) {
                    InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
                    if (interfaceC36571c5 instanceof AnonymousClass759) {
                        ((AnonymousClass759) interfaceC36571c5).Oa(c174366sq);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC173976sD
    public final void kk(boolean z) {
        TuxIconView tuxIconView;
        C174366sq c174366sq = this.LLD;
        int i = 0;
        if (c174366sq != null && c174366sq.isSplitMode()) {
            return;
        }
        C174366sq c174366sq2 = this.LLD;
        if ((c174366sq2 != null && c174366sq2.isLandscapeMode()) || (tuxIconView = this.LJLJI) == null) {
            return;
        }
        if (z) {
            i = 8;
        }
        tuxIconView.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String str;
        super.onActivityCreated(bundle);
        if (bundle != null) {
            boolean z = bundle.getBoolean("should_remove", false);
            this.LLFII = z;
            if (z) {
                E8(false);
                FragmentManager fragmentManager = getFragmentManager();
                if (fragmentManager != null) {
                    C1B3 c1b3 = new C1B3(fragmentManager);
                    c1b3.LJJI(this);
                    c1b3.LJI();
                    return;
                }
                return;
            }
            Serializable serializable = bundle.getSerializable("page_param");
            if (serializable instanceof C174366sq) {
                this.LLD = (C174366sq) serializable;
                IAwemeService LIZ = AwemeService.LIZ();
                C174366sq c174366sq = this.LLD;
                if (c174366sq == null || (str = c174366sq.getAid()) == null) {
                    str = "";
                }
                this.LLFF = LIZ.i6(str);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        LFH lfh = LFH.LIZIZ;
        lfh.LIZLLL().LJIILIIL();
        if (C53816LAe.LJI(mo49getActivity(), newConfig)) {
            E8(true);
        }
        lfh.LIZLLL().LJIILJJIL().LLJL(mo49getActivity(), this.LJLL, newConfig);
        this.LLIIIZ = true;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C174366sq c174366sq;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("id");
            if (serializable instanceof C174366sq) {
                c174366sq = (C174366sq) serializable;
            } else {
                c174366sq = null;
            }
            this.LLD = c174366sq;
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        C1JD.LJIILIIL("CommentListPageFragment onSaveInstanceState");
        outState.putBoolean("should_remove", true);
        outState.putSerializable("page_param", this.LLD);
    }

    @Override // X.C75J
    public final void r4(AnonymousClass700 anonymousClass700) {
        this.LLF = anonymousClass700;
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 instanceof C75J) {
                ((C75J) interfaceC36571c5).r4(anonymousClass700);
            }
        }
    }

    public final void wl(boolean z) {
        C80684VlY c80684VlY;
        int i;
        C174366sq c174366sq = this.LLD;
        if ((c174366sq != null && c174366sq.isSplitMode()) || (c80684VlY = this.LJLLILLLL) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c80684VlY.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int marginEnd = marginLayoutParams.getMarginEnd();
        if (z) {
            i = LLILLJJLI;
        } else {
            i = LLILLIZIL;
        }
        if (marginEnd == i) {
            return;
        }
        marginLayoutParams.setMarginEnd(i);
        C80684VlY c80684VlY2 = this.LJLLILLLL;
        if (c80684VlY2 == null) {
            return;
        }
        c80684VlY2.setLayoutParams(marginLayoutParams);
    }

    public final void Gl(int i, int i2) {
        CommentNestedLayout commentNestedLayout = this.LJLILLLLZI;
        if (commentNestedLayout != null) {
            if (commentNestedLayout.getPaddingTop() != i) {
                commentNestedLayout.setPadding(0, i, 0, 0);
            }
            ViewGroup.LayoutParams layoutParams = commentNestedLayout.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.bottomMargin != i2) {
                marginLayoutParams.bottomMargin = i2;
                commentNestedLayout.setLayoutParams(marginLayoutParams);
            }
        }
        Fragment Il = Il();
        if (Il instanceof CommentListFragment) {
            ((CommentListFragment) Il).Jl(i2);
        }
    }

    public final void Hl(int i, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        long j2;
        long j3;
        String str6;
        User author;
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        long j4;
        NowPostInfo nowPostInfo;
        NowPostInfo nowPostInfo2;
        Aweme aweme = this.LLFF;
        Integer num = null;
        if (aweme != null) {
            str2 = aweme.getAuthorUid();
        } else {
            str2 = null;
        }
        if ((AV1.LJIJI(str2) && C54838Lfe.LJIIZILJ(this.LLFF)) || xl()) {
            Aweme aweme2 = this.LLFF;
            if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null && nowPostInfo.getNowMediaType() != null) {
                Aweme aweme3 = this.LLFF;
                if (aweme3 != null && (nowPostInfo2 = aweme3.nowPostInfo) != null) {
                    str3 = nowPostInfo2.getNowMediaType();
                } else {
                    str3 = null;
                }
            } else {
                str3 = "post";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", Jl(str));
            C174366sq c174366sq = this.LLD;
            if (c174366sq != null) {
                str4 = c174366sq.getEventType();
            } else {
                str4 = null;
            }
            c188727au.LJIIIZ("enter_from", str4);
            c188727au.LJIIIZ("tab_name", Kl(i));
            C174366sq c174366sq2 = this.LLD;
            if (c174366sq2 != null) {
                str5 = c174366sq2.getAid();
            } else {
                str5 = null;
            }
            c188727au.LJIIIZ("group_id", str5);
            Aweme aweme4 = this.LLFF;
            long j5 = 0;
            if (aweme4 != null) {
                j = Long.valueOf(aweme4.getCreateTime());
            } else {
                j = 0L;
            }
            c188727au.LJFF(j, "video_create_time");
            if (this.LLFF != null) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Aweme aweme5 = this.LLFF;
                if (aweme5 != null) {
                    j4 = aweme5.getCreateTime();
                } else {
                    j4 = 0;
                }
                j2 = currentTimeMillis - j4;
            } else {
                j2 = 0;
            }
            c188727au.LJ(j2, "video_elapsed_time");
            C222578oP.LIZJ(c188727au, this.LLFF, null, null, 14);
            Aweme aweme6 = this.LLFF;
            if (aweme6 == null || (statistics2 = aweme6.getStatistics()) == null) {
                j3 = 0;
            } else {
                j3 = statistics2.getPlayCount();
            }
            c188727au.LJ(j3, "vv_cnt");
            Aweme aweme7 = this.LLFF;
            if (aweme7 != null && (statistics = aweme7.getStatistics()) != null) {
                j5 = statistics.getDiggCount();
            }
            c188727au.LJ(j5, "like_count");
            c188727au.LJIIIZ("now_type", str3);
            Aweme aweme8 = this.LLFF;
            if (aweme8 != null && (author = aweme8.getAuthor()) != null) {
                str6 = author.getUid();
            } else {
                str6 = null;
            }
            c188727au.LJIIIZ("author_id", str6);
            Aweme aweme9 = this.LLFF;
            if (aweme9 != null) {
                num = Integer.valueOf(aweme9.getFollowStatus());
            }
            c188727au.LJFF(num, "follow_status");
            FMX.LJIIL("enter_author_reaction_panel", c188727au.LIZ);
        }
    }

    public final void Nl(C80688Vlc c80688Vlc, boolean z) {
        int intValue;
        if (!Rl()) {
            return;
        }
        if (z) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Integer LJI = C79045V0n.LJI(R.attr.go, requireContext);
            if (LJI != null) {
                intValue = LJI.intValue();
            }
            intValue = 0;
        } else {
            Context requireContext2 = requireContext();
            o.LJIIIIZZ(requireContext2, "requireContext()");
            Integer LJI2 = C79045V0n.LJI(R.attr.gx, requireContext2);
            if (LJI2 != null) {
                intValue = LJI2.intValue();
            }
            intValue = 0;
        }
        if (c80688Vlc != null) {
            Drawable drawable = c80688Vlc.LIZ;
            if (drawable != null && (drawable instanceof SY9)) {
                SY9 sy9 = (SY9) drawable;
                if (sy9 != null) {
                    sy9.LJ(intValue);
                }
                c80688Vlc.LIZ = sy9;
                c80688Vlc.LIZIZ();
            }
            C80683VlX c80683VlX = c80688Vlc.LJII;
            if (c80683VlX != null) {
                TextView customTextView = c80683VlX.getCustomTextView();
                if ((customTextView instanceof TuxTextView) && customTextView != null) {
                    customTextView.setTextColor(intValue);
                }
            }
        }
    }

    @Override // X.InterfaceC81204Vtw
    public final void O7(int i, int i2) {
        this.LLIIJLIL = i;
        this.LLIIL = i2;
        Gl(i, i2);
    }

    public final void Vl(int i, boolean z) {
        AnonymousClass759 anonymousClass759;
        this.LLFZ = false;
        ViewPager viewPager = this.LJLL;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, z);
        }
        Object obj = ListProtector.get(this.LJLLL, i);
        if (obj instanceof AnonymousClass759) {
            anonymousClass759 = (AnonymousClass759) obj;
        } else {
            anonymousClass759 = null;
        }
        if (anonymousClass759 != null) {
            anonymousClass759.Y8(true);
        }
        this.LLIFFJFJJ = i;
        C7DE c7de = this.LJLLI;
        if (c7de != null) {
            c7de.LIZIZ = true;
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        CommentServiceImpl.LJJL().LJJJJZ(new InterfaceC1800674w() { // from class: X.75U
            @Override // X.InterfaceC1800674w
            public final int LIZ() {
                return 4;
            }

            @Override // X.InterfaceC1800674w
            public final boolean LIZIZ(Aweme aweme) {
                if (aweme != null && !C178406zM.LJIIJ(aweme) && AV1.LJIJI(aweme.getAuthorUid()) && C7GH.LIZ(aweme) && C7GH.LJI()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1800674w
            public final Fragment LIZJ(ActivityC45651qj activityC45651qj, C174366sq c174366sq, Aweme aweme, InterfaceC173976sD container) {
                o.LJIIIZ(container, "container");
                VideoViewerListFragment videoViewerListFragment = new VideoViewerListFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("id", c174366sq);
                videoViewerListFragment.setArguments(bundle2);
                videoViewerListFragment.LJLJJL = c174366sq;
                videoViewerListFragment.LJLJJLL = aweme;
                videoViewerListFragment.LJLJJI = container;
                videoViewerListFragment.LJLIL = C7GH.LJ(aweme);
                return videoViewerListFragment;
            }
        });
        CommentServiceImpl.LJJL().LJJJJZ(new InterfaceC1800674w() { // from class: X.78t
            @Override // X.InterfaceC1800674w
            public final int LIZ() {
                return 1;
            }

            @Override // X.InterfaceC1800674w
            public final boolean LIZIZ(Aweme aweme) {
                if ((((Number) C76A.LIZ.getValue()).intValue() & 1) == 1 && aweme != null && AV1.LJIJI(aweme.getAuthorUid())) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1800674w
            public final Fragment LIZJ(ActivityC45651qj activityC45651qj, C174366sq c174366sq, Aweme aweme, InterfaceC173976sD container) {
                o.LJIIIZ(container, "container");
                LikeListFragment likeListFragment = new LikeListFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("id", c174366sq);
                likeListFragment.setArguments(bundle2);
                likeListFragment.LJLJI = c174366sq;
                likeListFragment.LJLJJLL = container;
                likeListFragment.LJLIL = aweme;
                likeListFragment.LJLILLLLZI = C1811378z.LIZ(activityC45651qj).iv0(aweme);
                return likeListFragment;
            }
        });
        CommentServiceImpl.LJJL().LJJJJZ(new InterfaceC1800674w() { // from class: X.736
            @Override // X.InterfaceC1800674w
            public final int LIZ() {
                return 5;
            }

            @Override // X.InterfaceC1800674w
            public final boolean LIZIZ(Aweme aweme) {
                if (aweme != null && !C178406zM.LJIIJ(aweme) && AV1.LJIJI(aweme.getAuthorUid()) && C7GH.LIZ(aweme) && !C7GH.LJI() && C7GI.LIZ()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1800674w
            public final Fragment LIZJ(ActivityC45651qj activityC45651qj, C174366sq c174366sq, Aweme aweme, InterfaceC173976sD container) {
                o.LJIIIZ(container, "container");
                VideoViewerListAuthorizationFragment videoViewerListAuthorizationFragment = new VideoViewerListAuthorizationFragment();
                videoViewerListAuthorizationFragment.LJLIL = C7GH.LJ(aweme);
                videoViewerListAuthorizationFragment.LJLJI = c174366sq;
                videoViewerListAuthorizationFragment.LJLILLLLZI = aweme;
                return videoViewerListAuthorizationFragment;
            }
        });
        C174676tL c174676tL = C176096vd.LJFF;
        c174676tL.LJI = System.currentTimeMillis();
        this.LJZ = DataCenter.gv0(ViewModelProviders.of(this), this);
        WidgetManager xl = WidgetManager.xl(null, this, view, getContext());
        this.LJZL = xl;
        if (xl != null) {
            xl.Hl(this.LJZ);
            CommentHeaderWidget LJIJI = AdCommentDependImpl.LJJIIJZLJL().LJIJI(new AqS153S0100000_3(this, 1535));
            this.LJLLLLLL = LJIJI;
            xl.Al(R.id.bsh, LJIJI);
        }
        DataCenter dataCenter = this.LJZ;
        if (dataCenter != null) {
            dataCenter.jv0(new OSZ(this.LLFF, this.LLD), "comment_aweme_and_params");
        }
        if (((ArrayList) this.LJLLL).size() == 0 && !xl() && !Al(this.LLFF)) {
            z = true;
        } else {
            z = false;
        }
        C174366sq c174366sq = this.LLD;
        if (c174366sq != null) {
            c174366sq.setShowTitle(z);
        }
        C174366sq c174366sq2 = this.LLD;
        Aweme aweme = this.LLFF;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("id", c174366sq2);
        CommentListFragment commentListFragment = new CommentListFragment();
        commentListFragment.setArguments(bundle2);
        commentListFragment.LLIFFJFJJ(aweme);
        if (c174366sq2 != null) {
            commentListFragment.LJLILLLLZI = c174366sq2;
        }
        commentListFragment.LLI = this.LJLJJLL;
        commentListFragment.LLIFFJFJJ = this.LJLJL;
        commentListFragment.LLII = this.LJLJLJ;
        if (this.LLIILII) {
            commentListFragment.LLLLLJLJLL = this;
        }
        commentListFragment.LLLILZLLLI = false;
        commentListFragment.LLLILZJ = this;
        commentListFragment.LLJJI = this.LLF;
        ((ArrayList) this.LJLLL).add(commentListFragment);
        C176186vm.LIZ("mFragmentLists.add  COMMENT_LIST");
        ((ArrayList) this.LJLLLL).add(0);
        Ql(C75V.LIZ());
        vl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("int CommentPageFragmentAdapter fragmentSize ");
        LIZ.append(((ArrayList) this.LJLLL).size());
        C176186vm.LIZ(X1D.LIZIZ(LIZ));
        FragmentManager childFragmentManager = getChildFragmentManager();
        List<Fragment> list = this.LJLLL;
        o.LJII(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.bytedance.ies.uikit.base.AbsFragment>");
        AnonymousClass765<?> anonymousClass765 = new AnonymousClass765<>(childFragmentManager, C65777Prh.LIZIZ(list), this.LJLLLL);
        this.LJZI = anonymousClass765;
        ViewPager viewPager = this.LJLL;
        if (viewPager != null) {
            viewPager.setAdapter(anonymousClass765);
        }
        C80684VlY c80684VlY = this.LJLLILLLL;
        if (c80684VlY != null) {
            c80684VlY.LIZIZ(new InterfaceC80690Vle() { // from class: X.757
                @Override // X.InterfaceC80690Vle
                public final void LIZIZ(C80688Vlc tab) {
                    o.LJIIIZ(tab, "tab");
                }

                @Override // X.InterfaceC80690Vle
                public final void LIZ(C80688Vlc c80688Vlc) {
                    String str;
                    AnonymousClass759 anonymousClass759;
                    String str2;
                    long j;
                    CommentListPageFragment commentListPageFragment = CommentListPageFragment.this;
                    if (((Number) ListProtector.get(commentListPageFragment.LJLLLL, c80688Vlc.LIZLLL)).intValue() == 2) {
                        str = "like_list";
                    } else {
                        str = "";
                    }
                    commentListPageFragment.LLIIIJ = str;
                    CommentListPageFragment commentListPageFragment2 = CommentListPageFragment.this;
                    if (commentListPageFragment2.LLII != 0) {
                        if (commentListPageFragment2.LLFFF) {
                            str2 = "click_label";
                        } else {
                            str2 = "slide";
                        }
                        int i = c80688Vlc.LIZLLL;
                        long currentTimeMillis = System.currentTimeMillis() - commentListPageFragment2.LLII;
                        long j2 = commentListPageFragment2.LLIIIILZ;
                        if (currentTimeMillis > j2) {
                            j = currentTimeMillis - j2;
                        } else {
                            j = 0;
                        }
                        commentListPageFragment2.LLII = 0L;
                        commentListPageFragment2.LLIIII = 0L;
                        commentListPageFragment2.LLIIIILZ = 0L;
                        commentListPageFragment2.Dl(i, str2, "change_tab", j);
                    }
                    CommentListPageFragment.this.Ml();
                    CommentListPageFragment.this.Nl(c80688Vlc, false);
                    Object obj = ListProtector.get(CommentListPageFragment.this.LJLLL, c80688Vlc.LIZLLL);
                    if ((obj instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) obj) != null) {
                        anonymousClass759.Y8(false);
                    }
                }

                @Override // X.InterfaceC80690Vle
                public final void LIZJ(C80688Vlc tab) {
                    AnonymousClass759 anonymousClass759;
                    CommentListFragment commentListFragment2;
                    String str;
                    o.LJIIIZ(tab, "tab");
                    C174366sq c174366sq3 = CommentListPageFragment.this.LLD;
                    if (c174366sq3 != null) {
                        c174366sq3.getEnterFrom();
                    }
                    C174366sq c174366sq4 = CommentListPageFragment.this.LLD;
                    if (c174366sq4 != null) {
                        c174366sq4.getEnterMethod();
                    }
                    CommentListPageFragment.this.LLII = System.currentTimeMillis();
                    CommentListPageFragment commentListPageFragment = CommentListPageFragment.this;
                    if (commentListPageFragment.LLIFFJFJJ != -1) {
                        if (commentListPageFragment.LLI) {
                            if (commentListPageFragment.LLFFF) {
                                str = "click_label";
                            } else {
                                str = "slide";
                            }
                        } else {
                            C174366sq c174366sq5 = commentListPageFragment.LLD;
                            if (c174366sq5 == null || (str = c174366sq5.getEnterMethod()) == null) {
                                str = "";
                            }
                        }
                        commentListPageFragment.Hl(tab.LIZLLL, str);
                    }
                    CommentListPageFragment commentListPageFragment2 = CommentListPageFragment.this;
                    int i = tab.LIZLLL;
                    commentListPageFragment2.LLIFFJFJJ = i;
                    Object obj = ListProtector.get(commentListPageFragment2.LJLLL, i);
                    if ((obj instanceof CommentListFragment) && (commentListFragment2 = (CommentListFragment) obj) != null) {
                        commentListFragment2.LJLILLLLZI.setTempEnterMethod(CommentListPageFragment.this.LLIIIJ);
                    }
                    CommentListPageFragment.this.Ml();
                    CommentListPageFragment.this.Nl(tab, true);
                    Object obj2 = ListProtector.get(CommentListPageFragment.this.LJLLL, tab.LIZLLL);
                    if ((obj2 instanceof AnonymousClass759) && (anonymousClass759 = (AnonymousClass759) obj2) != null) {
                        anonymousClass759.Y8(true);
                    }
                    CommentListPageFragment commentListPageFragment3 = CommentListPageFragment.this;
                    commentListPageFragment3.LLFFF = false;
                    commentListPageFragment3.LLFZ = true;
                    C37179EiV.LIZ().postDelayed(new Runnable() { // from class: X.75I
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                C13930gf.LIZLLL(false);
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    }, 500L);
                }
            });
            c80684VlY.setOnTabClickListener(new C75Z() { // from class: X.6zU
                @Override // X.C75Z
                public final void LIZ(C80688Vlc tab) {
                    o.LJIIIZ(tab, "tab");
                    CommentListPageFragment.this.LLFFF = true;
                    tab.LIZ();
                    Boolean LJ = C27740Aue.LJ(tab.LJII);
                    o.LJIIIIZZ(LJ, "isDoubleClick(tab.view)");
                    if (LJ.booleanValue()) {
                        int intValue = ((Number) ListProtector.get(CommentListPageFragment.this.LJLLLL, tab.LIZLLL)).intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 4) {
                                    return;
                                }
                                C2U8.LIZ(new C174406su(EnumC177756yJ.VIEWER_LIST));
                                return;
                            }
                            C2U8.LIZ(new C174406su(EnumC177756yJ.LIKE_LIST));
                            return;
                        }
                        C2U8.LIZ(new C174406su(EnumC177756yJ.COMMENT_LIST));
                    }
                }
            });
            c80684VlY.setupWithViewPager(this.LJLL);
            if (Rl()) {
                c80684VlY.setTabMargin(10);
            }
        }
        Yl();
        Tl(this.LLD);
        show();
        if (!C1791971n.LIZ()) {
            TcmServiceImpl.LJIJI().LJIILL(this.LLFF, "comment");
        }
        a.LJFF().LJFF().observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 5));
        c174676tL.LJII = System.currentTimeMillis();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:1|(1:3)|4|(1:6)|7|(1:184)(1:11)|12|(2:16|(1:18))|19|(1:21)|22|(3:24|(1:182)(1:28)|(38:30|(1:32)(1:181)|33|(1:35)|36|(1:38)(1:180)|39|(3:41|(1:43)(1:178)|(3:45|(1:47)(1:177)|(29:49|50|(1:56)|57|(1:61)|62|(1:176)|64|65|66|67|(1:69)|70|(1:72)|73|(1:75)|76|(8:78|(7:81|(1:90)|83|(1:89)|85|(1:88)|87)|91|(1:112)|93|(4:100|(1:109)(1:102)|(1:104)(1:106)|105)|95|(1:99))|113|(1:172)(1:117)|(13:119|(5:121|(3:123|(1:125)(1:140)|(3:127|128|(3:130|(1:132)(1:134)|133)(3:135|(1:137)(1:139)|138)))|141|128|(0)(0))|142|(1:144)|145|(1:147)|148|(1:157)|150|(1:152)|153|(1:155)|156)|158|(1:160)|161|162|163|(1:165)|166|167)))|179|50|(3:52|54|56)|57|(2:59|61)|62|(0)|64|65|66|67|(0)|70|(0)|73|(0)|76|(0)|113|(1:115)|172|(0)|158|(0)|161|162|163|(0)|166|167))|183|(0)(0)|33|(0)|36|(0)(0)|39|(0)|179|50|(0)|57|(0)|62|(0)|64|65|66|67|(0)|70|(0)|73|(0)|76|(0)|113|(0)|172|(0)|158|(0)|161|162|163|(0)|166|167) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04d2, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x023d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x023e, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c5 A[Catch: all -> 0x04d1, TryCatch #0 {all -> 0x04d1, blocks: (B:163:0x04b0, B:165:0x04c5, B:166:0x04c8), top: B:162:0x04b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ae  */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.75G] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r21, android.view.ViewGroup r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.C75J
    public final void xk(Exception e, int i, Comment comment) {
        o.LJIIIZ(e, "e");
        if (((ArrayList) this.LJLLL).isEmpty()) {
            return;
        }
        Iterator it = ((ArrayList) this.LJLLL).iterator();
        while (it.hasNext()) {
            InterfaceC36571c5 interfaceC36571c5 = (Fragment) it.next();
            if (interfaceC36571c5 instanceof C75J) {
                ((C75J) interfaceC36571c5).xk(e, i, comment);
            }
        }
    }

    public final void Dl(int i, String str, String str2, long j) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        long j2;
        String str9;
        User author;
        AwemeStatistics statistics;
        NowPostInfo nowPostInfo;
        NowPostInfo nowPostInfo2;
        Aweme aweme = this.LLFF;
        Integer num = null;
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        if ((AV1.LJIJI(str3) && C54838Lfe.LJIIZILJ(this.LLFF)) || xl()) {
            Aweme aweme2 = this.LLFF;
            if (aweme2 != null && (nowPostInfo2 = aweme2.nowPostInfo) != null) {
                str4 = nowPostInfo2.getNowMediaType();
            } else {
                str4 = null;
            }
            String str10 = "post";
            if (str4 == null) {
                str5 = "post";
            } else {
                Aweme aweme3 = this.LLFF;
                if (aweme3 != null && (nowPostInfo = aweme3.nowPostInfo) != null) {
                    str5 = nowPostInfo.getNowMediaType();
                } else {
                    str5 = null;
                }
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_method", Jl(str));
            C174366sq c174366sq = this.LLD;
            if (c174366sq != null) {
                str6 = c174366sq.getEventType();
            } else {
                str6 = null;
            }
            c188727au.LJIIIZ("enter_from", str6);
            c188727au.LJIIIZ("tab_name", Kl(i));
            C174366sq c174366sq2 = this.LLD;
            if (c174366sq2 != null) {
                str7 = c174366sq2.getAid();
            } else {
                str7 = null;
            }
            c188727au.LJIIIZ("group_id", str7);
            c188727au.LJ(j, "duration");
            c188727au.LJIIIZ("exit_method", str2);
            if (C54838Lfe.LJIIZILJ(this.LLFF)) {
                str10 = "story";
            }
            c188727au.LJIIIZ("story_type", str10);
            Aweme aweme4 = this.LLFF;
            if (aweme4 != null) {
                str8 = C54838Lfe.LJI(aweme4);
            } else {
                str8 = null;
            }
            c188727au.LJIIIZ("story_collection_id", str8);
            Aweme aweme5 = this.LLFF;
            if (aweme5 == null || (statistics = aweme5.getStatistics()) == null) {
                j2 = 0;
            } else {
                j2 = statistics.getPlayCount();
            }
            c188727au.LJ(j2, "vv_cnt");
            c188727au.LJIIIZ("now_type", str5);
            Aweme aweme6 = this.LLFF;
            if (aweme6 != null && (author = aweme6.getAuthor()) != null) {
                str9 = author.getUid();
            } else {
                str9 = null;
            }
            c188727au.LJIIIZ("author_id", str9);
            Aweme aweme7 = this.LLFF;
            if (aweme7 != null) {
                num = Integer.valueOf(aweme7.getFollowStatus());
            }
            c188727au.LJFF(num, "follow_status");
            FMX.LJIIL("close_author_reaction_panel", c188727au.LIZ);
        }
    }
}
