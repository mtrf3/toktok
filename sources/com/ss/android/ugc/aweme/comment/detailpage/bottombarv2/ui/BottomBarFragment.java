package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C176996x5;
import X.C178236z5;
import X.C178596zf;
import X.C1B3;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C221108m2;
import X.C224748ru;
import X.C27740Aue;
import X.C29S;
import X.C2L4;
import X.C33Q;
import X.C38816FLg;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C50420Jqa;
import X.C53816LAe;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C57092Lx;
import X.C61447O9r;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C71Y;
import X.C74Z;
import X.C76800UCe;
import X.C76965UIn;
import X.C77321UWf;
import X.C8VV;
import X.C8YZ;
import X.C90903hW;
import X.InterfaceC178126yu;
import X.InterfaceC178496zV;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC55317LnN;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KL2;
import X.KPL;
import X.LFH;
import X.M89;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import X.X1D;
import X.Y87;
import X.Z89;
import Y.ACListenerS29S1200000_10;
import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import Y.ARunnableS4S0301000_3;
import Y.ARunnableS9S0110000_3;
import Y.IDAListenerS1S0110000_3;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomDefaultCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomExposedCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomMusicShootCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomQuickCommentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomViewerListAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.scope.DetailPageBottomBarScope;
import com.ss.android.ugc.aweme.comment.gift.ui.GiftAnimationFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes4.dex */
public final class BottomBarFragment extends AbsFragment implements InterfaceC55317LnN, DetailBottomBarAbility, BottomBarViewAbility, KPL, C2L4 {
    public static String LJZI;
    public static String LJZL;
    public ViewGroup LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public View LJLJJI;
    public InterfaceC178496zV LJLJJL;
    public InterfaceC178126yu LJLJLJ;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public ObjectAnimator LJLLLL;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 91));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 92));
    public String LJLJLLL = "";
    public String LJLL = "";
    public boolean LJLLL = true;
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 93));
    public boolean LJLZ = true;

    @Override // X.InterfaceC55317LnN
    public final void I4() {
        this.LJLLI = true;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.setEnabled(false);
    }

    @Override // X.InterfaceC55317LnN
    public final void N() {
        LJZL = null;
        LJZI = null;
    }

    @Override // X.InterfaceC55317LnN
    public final void Zh() {
        this.LJLLI = false;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(this.LJLLILLLL ? 4 : 0);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.setEnabled(true);
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void Dl() {
        Resources resources;
        ViewGroup viewGroup = this.LJLIL;
        int i = 0;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        C27740Aue.LJIIIZ(0, this.LJLJI);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            i = resources.getDimensionPixelOffset(R.dimen.gr);
        }
        C57092Lx.LIZ.getClass();
        int i2 = i + C61447O9r.LJIIL;
        View view = this.LJLILLLLZI;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final C176996x5 EJ() {
        return (C176996x5) this.LJLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final boolean IT() {
        return wl().LIZ("default_comment");
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final void TK() {
        String str;
        InterfaceC178496zV interfaceC178496zV = this.LJLJJL;
        if (interfaceC178496zV != null) {
            Aweme aweme = getAweme();
            M89 qT = qT();
            if (qT == null || (str = qT.getCid()) == null) {
                str = "";
            }
            interfaceC178496zV.l(str, aweme);
        }
    }

    @Override // X.InterfaceC55317LnN, com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void X5() {
        C71Y.LIZ("CommentInputFragment", "resetEdit");
        if (this.LJLLJ || getContext() == null) {
            return;
        }
        isViewValid();
        Aweme aweme = getAweme();
        if (aweme != null && !aweme.isProhibited()) {
            EJ().LJJJJLI();
        }
        AbstractBottomPriorityComponent LIZIZ = wl().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.X5();
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void d3() {
        C71Y.LIZ("xjccccc", "input fragment updateWhenPageSelected");
        if (!isViewValid()) {
            return;
        }
        C71Y.LIZ("CommentInputFragment", "updateAssem when page selected");
        Gl();
    }

    @Override // X.InterfaceC55317LnN
    public final void fj() {
        View view;
        if (this.LJLIL != null && o.LJ(wl().LIZJ, "default_comment") && (view = this.LJLJJI) != null && view.getVisibility() == 0) {
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            BottomDefaultCommentAssem LIZJ = wl().LIZJ();
            if (LIZJ != null) {
                C224748ru c224748ru = LIZJ.LJLJL;
                if (c224748ru != null) {
                    c224748ru.setEnabled(true);
                }
                C224748ru c224748ru2 = LIZJ.LJLJL;
                if (c224748ru2 == null) {
                    return;
                }
                c224748ru2.setFocusable(true);
            }
        }
    }

    public final Aweme getAweme() {
        InterfaceC178496zV interfaceC178496zV = this.LJLJJL;
        if (interfaceC178496zV != null) {
            return interfaceC178496zV.getCommentInputAweme();
        }
        return null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(DetailPageBottomBarScope.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final M89 qT() {
        InterfaceC178496zV interfaceC178496zV = this.LJLJJL;
        if (interfaceC178496zV != null) {
            return interfaceC178496zV.s3();
        }
        return null;
    }

    public final C178236z5 wl() {
        return (C178236z5) this.LJLLLLLL.getValue();
    }

    public final void xl() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 1;
                view2.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void Gl() {
        try {
            wl().LJ();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateAssem throw error: ");
            LIZ.append(e.getMessage());
            C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility, com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final C176996x5 L1() {
        return EJ();
    }

    @Override // X.InterfaceC55317LnN
    public final void b7() {
        AbstractBottomPriorityComponent LIZIZ;
        if (isViewValid() && (LIZIZ = wl().LIZIZ()) != null) {
            LIZIZ.H3();
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void dismissAllowingStateLoss() {
        Fragment LJJJIL;
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (LJJJIL = fragmentManager.LJJJIL("comment_input_tag")) != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJIIIZ(LJJJIL);
            c1b3.LJI();
        }
    }

    @Override // X.InterfaceC55317LnN
    public final boolean g0() {
        if (EJ().LJJIIZI() && (o.LJ(wl().LIZJ, "default_comment") || o.LJ(wl().LIZJ, "quick_comment"))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final Aweme getCommentInputAweme() {
        return getAweme();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, X.InterfaceC49940Jiq
    public final boolean isViewValid() {
        if (super.isViewValid() && getContext() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLJJL = null;
        Object value = this.LJLJJLL.getValue();
        value.getClass();
        EventBus.LIZJ().LJIJ(value);
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b7();
        String str = LJZI;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = LJZL;
        if (str3 != null) {
            str2 = str3;
        }
        w0(str, str2);
        InterfaceC178496zV interfaceC178496zV = this.LJLJJL;
        if (interfaceC178496zV != null) {
            C50420Jqa c50420Jqa = new C50420Jqa(9, (Object) null);
            c50420Jqa.LJLJI = null;
            interfaceC178496zV.onInternalEvent(c50420Jqa);
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void R7() {
        isViewValid();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final String getEnterFrom() {
        return this.LJLJLLL;
    }

    public final boolean Al(Configuration configuration) {
        LFH.LIZIZ.LIZLLL().LJIILIIL();
        if (C53816LAe.LJI(mo49getActivity(), configuration) && C53816LAe.LJ(this.LJLL) != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void Ls(Comment comment) {
        C1B3 c1b3;
        FragmentManager supportFragmentManager;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            c1b3 = new C1B3(supportFragmentManager);
        } else {
            c1b3 = null;
        }
        GiftAnimationFragment giftAnimationFragment = new GiftAnimationFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("comment", comment);
        giftAnimationFragment.setArguments(bundle);
        if (c1b3 != null) {
            giftAnimationFragment.show(c1b3, "GiftAnimationFragment");
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void V9(boolean z) {
        int i;
        View view;
        View view2;
        if (this.LJLJJI != null && o.LJ(wl().LIZJ, "default_comment")) {
            View view3 = this.LJLJJI;
            if (view3 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                view3.setVisibility(i);
            }
            BottomDefaultCommentAssem LIZJ = wl().LIZJ();
            if (LIZJ != null) {
                C224748ru c224748ru = LIZJ.LJLJL;
                if (c224748ru != null) {
                    c224748ru.setEnabled(!z);
                }
                C224748ru c224748ru2 = LIZJ.LJLJL;
                if (c224748ru2 != null) {
                    c224748ru2.setFocusable(!z);
                }
            }
            Aweme aweme = getAweme();
            if (aweme != null && (view = this.LJLJJI) != null && view.getVisibility() == 0 && (view2 = this.LJLJJI) != null) {
                C16880lQ.LJIIJ(new ACListenerS38S0200000_3(aweme, this, 23), view2);
            }
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void ae(boolean z) {
        float f;
        View view = this.LJLILLLLZI;
        if (view != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            if (z) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        this.LJLLILLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility
    public final void as0(AbstractBottomPriorityComponent protocol) {
        o.LJIIIZ(protocol, "protocol");
        C178236z5 wl = wl();
        wl.getClass();
        if (wl.LIZLLL().containsKey(protocol.y2())) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("storeProtocol: ");
        LIZ.append(protocol.y2());
        C71Y.LIZ("BottomBarProtocolManager", X1D.LIZIZ(LIZ));
        wl.LIZLLL().put(protocol.y2(), protocol);
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility
    public final void f40(float f) {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            C178596zf.LIZ(viewGroup.getAlpha(), f, this.LJLIL);
        }
        View view = this.LJLJI;
        if (view != null) {
            C178596zf.LIZ(view.getAlpha(), f, this.LJLJI);
        }
    }

    @Override // X.InterfaceC55317LnN
    public final boolean h(boolean z) {
        if (!isViewValid()) {
            return false;
        }
        Aweme aweme = getAweme();
        if ((aweme != null && aweme.isProhibitedAndShouldTell()) || Z89.LIZIZ.LIZIZ(getAweme())) {
            z = false;
        }
        if (z) {
            if (!this.LJLZ) {
                if (!C54838Lfe.LIZIZ(getAweme())) {
                    return false;
                }
                InterfaceC178496zV interfaceC178496zV = this.LJLJJL;
                if (interfaceC178496zV != null && interfaceC178496zV.De()) {
                    return false;
                }
                Dl();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" first bind  show ");
                LIZ.append(this.LJLLL);
                C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setInputVisible visibleFlag set ");
                LIZ2.append(true);
                C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ2));
                this.LJLZ = true;
                if (this.LJLLL) {
                    this.LJLLL = false;
                } else {
                    vl(z);
                }
            }
        } else if (this.LJLZ) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" first bind  hide ");
            LIZ3.append(this.LJLLL);
            C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("setInputVisible visibleFlag set ");
            LIZ4.append(false);
            C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ4));
            this.LJLZ = false;
            if (this.LJLLL) {
                this.LJLLL = false;
                xl();
            } else {
                vl(z);
            }
            isViewValid();
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55317LnN
    public final void ml(float f) {
        int i;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setAlpha(f);
        }
        View view2 = this.LJLILLLLZI;
        boolean z = false;
        if (view2 != null) {
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (f > 0.0f) {
            z = true;
        }
        h(z);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        View view = getView();
        if (view != null) {
            int LIZJ = (int) KL2.LIZJ(view.getContext(), newConfig.screenWidthDp);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width != LIZJ) {
                    layoutParams.width = LIZJ;
                }
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        EJ().LLILZ = Al(newConfig);
    }

    public final void vl(final boolean z) {
        float f;
        ObjectAnimator objectAnimator;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addShowAndHideAnimation ");
        LIZ.append(z);
        C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ));
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator objectAnimator2 = this.LJLLLL;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("addShowAndHideAnimation cancel anim isShow = ");
            LIZ2.append(z);
            C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ2));
            ObjectAnimator objectAnimator3 = this.LJLLLL;
            if (objectAnimator3 != null) {
                objectAnimator3.cancel();
            }
        }
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null && (objectAnimator = ObjectAnimator.ofFloat(viewGroup, "alpha", viewGroup.getAlpha(), f)) != null) {
            objectAnimator.setDuration(300L);
            objectAnimator.setInterpolator(new LinearInterpolator());
            objectAnimator.addListener(new Animator.AnimatorListener() { // from class: X.6zd
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("addShowAndHideAnimation ");
                    LIZ3.append(z);
                    LIZ3.append(" animation start ");
                    C71Y.LIZ("CommentInputFragment", X1D.LIZIZ(LIZ3));
                }
            });
            objectAnimator.addListener(new IDAListenerS1S0110000_3(this, z, 1));
        } else {
            objectAnimator = null;
        }
        this.LJLLLL = objectAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // X.InterfaceC55317LnN
    public final void zd(boolean z) {
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.post(new ARunnableS9S0110000_3(this, z, 0));
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC178496zV interfaceC178496zV;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            int i = C61447O9r.LJIILJJIL;
            C57092Lx.LIZ.getClass();
            int LIZ = C61447O9r.LIZ();
            if (i == 0) {
                i = LIZ;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.height = i;
            viewGroup.setLayoutParams(layoutParams);
        }
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundResource(R.drawable.bop);
        }
        C61447O9r c61447O9r = C57092Lx.LIZ;
        ViewGroup viewGroup3 = this.LJLIL;
        View view2 = this.LJLJI;
        View view3 = this.LJLJJI;
        c61447O9r.getClass();
        if (view2 != null) {
            C38816FLg.LIZJ(new ARunnableS4S0301000_3(2, view2, viewGroup3, view3, 1));
        }
        EJ().LLILZ = Al(null);
        C55096Ljo.LJIIL(C55230Lly.LIZJ(this, null), this, DetailBottomBarAbility.class, null, getViewLifecycleOwner());
        C55096Ljo.LJIIL(C55230Lly.LIZJ(this, null), this, BottomBarViewAbility.class, null, getViewLifecycleOwner());
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C62814Ol0.LJJIIJZLJL(LIZJ, BottomBarProtocol.class, C47261Igj.LJJIJIL(new BottomExposedCommentAssem()));
        C62814Ol0.LJJIIJZLJL(LIZJ, BottomBarProtocol.class, C47261Igj.LJJIJIL(new BottomViewerListAssem()));
        C62814Ol0.LJJIIJZLJL(LIZJ, BottomBarProtocol.class, C47261Igj.LJJIJIL(new BottomQuickCommentAssem()));
        C62814Ol0.LJJIIJZLJL(LIZJ, BottomBarProtocol.class, C47261Igj.LJJIJIL(new BottomDefaultCommentAssem()));
        C62814Ol0.LJJIIJZLJL(LIZJ, BottomBarProtocol.class, C47261Igj.LJJIJIL(new BottomMusicShootCommentAssem()));
        C8VV.LIZ(this, false, new AqS107S0300000_3(C62814Ol0.LJIJ(C55230Lly.LIZJ(this, null), BottomBarProtocol.class), (List<? extends BottomBarProtocol>) this, (BottomBarFragment) view, (View) 34));
        if (this.LJLLI) {
            I4();
        }
        ae(this.LJLLILLLL);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            SlideData slideData = (SlideData) ViewModelProviders.of(mo49getActivity).get(SlideData.class);
            if (slideData.LJLIL == null) {
                slideData.LJLIL = new MutableLiveData<>();
            }
            slideData.LJLIL.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 6));
            if (slideData.LJLILLLLZI == null) {
                slideData.LJLILLLLZI = new MutableLiveData<>();
            }
            slideData.LJLILLLLZI.observe(getViewLifecycleOwner(), new AObserverS71S0100000_3(this, 7));
        }
        if (!C54838Lfe.LIZIZ(getAweme()) || ((interfaceC178496zV = this.LJLJJL) != null && interfaceC178496zV.De())) {
            h(false);
        }
        C71Y.LIZ("CommentInputFragment", "updateAssem when init");
        Gl();
    }

    @Override // X.InterfaceC55317LnN
    public final void w0(String reportReason, String reportReasonType) {
        BottomDefaultCommentAssem LIZJ;
        o.LJIIIZ(reportReason, "reportReason");
        o.LJIIIZ(reportReasonType, "reportReasonType");
        if (TextUtils.isEmpty(reportReason) || TextUtils.isEmpty(reportReasonType)) {
            return;
        }
        boolean z = true;
        this.LJLLJ = true;
        LJZI = reportReason;
        LJZL = reportReasonType;
        if (!o.LJ(wl().LIZJ, "default_comment") || (LIZJ = wl().LIZJ()) == null) {
            return;
        }
        TuxIconView tuxIconView = LIZJ.LJLJLJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        TuxIconView tuxIconView2 = LIZJ.LJLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        }
        TuxIconView tuxIconView3 = LIZJ.LJLJLLL;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(8);
        }
        TuxTextView tuxTextView = LIZJ.LJLLJ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
        C224748ru c224748ru = LIZJ.LJLJL;
        if (c224748ru != null) {
            c224748ru.setText(reportReason);
        }
        C224748ru c224748ru2 = LIZJ.LJLJL;
        if (c224748ru2 != null) {
            c224748ru2.setEnabled(false);
        }
        Aweme aweme = LIZJ.getAweme();
        if (aweme == null || !C63081OpJ.LJLL(aweme)) {
            z = false;
        }
        AwemeCommerceStruct awemeCommerceStruct = null;
        if (!z) {
            TuxTextView tuxTextView2 = LIZJ.LJLLJ;
            if (tuxTextView2 == null) {
                return;
            }
            C16880lQ.LJJJJI(tuxTextView2, null);
            return;
        }
        Aweme aweme2 = LIZJ.getAweme();
        if (aweme2 != null) {
            awemeCommerceStruct = aweme2.getCommerceVideoAuthInfo();
        }
        TuxTextView tuxTextView3 = LIZJ.LJLLJ;
        if (tuxTextView3 == null) {
            return;
        }
        C16880lQ.LJJJJI(tuxTextView3, new ACListenerS29S1200000_10(LIZJ, awemeCommerceStruct, reportReasonType, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        View view;
        View view2;
        CommentImageModel commentImageModel;
        if (!C77321UWf.LIZLLL(getAweme(), false)) {
            return;
        }
        if (i2 == 100 && intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("selectedMediaData = ");
            LIZ.append(parcelableArrayListExtra);
            C71Y.LIZ("PhotoComment", X1D.LIZIZ(LIZ));
            if (parcelableArrayListExtra != null) {
                if (EJ().LJZL != null) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = this.LJLJLLL;
                if (z) {
                    str = "replace";
                } else {
                    str = "add";
                }
                C74Z.LJIIIZ(str2, str);
                if (z) {
                    C74Z.LJIJI(this.LJLJLLL, "replace");
                }
                List<CommentImageModel> list = EJ().LJZL;
                if (list != null && !list.isEmpty()) {
                    Y87.LIZ((CommentImageModel) ListProtector.get(list, 0));
                }
                EJ().LJZL = C77321UWf.LJIILIIL(parcelableArrayListExtra);
                if (EJ().LJZL != null && (!r0.isEmpty())) {
                    List<CommentImageModel> list2 = EJ().LJZL;
                    if (list2 != null) {
                        commentImageModel = (CommentImageModel) ListProtector.get(list2, 0);
                    } else {
                        commentImageModel = null;
                    }
                    Y87.LJI(commentImageModel);
                }
                if (i == 10002 && (view = this.LJLILLLLZI) != null && view.getParent() != null && (view2 = this.LJLILLLLZI) != null) {
                    view2.post(new ARunnableS39S0100000_3(this, 26));
                }
            }
        }
        EJ().LL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        int i = 0;
        View LIZJ = C16970lZ.LIZJ(R.layout.pn, mo49getActivity(), viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                i = C63081OpJ.LJJJJL(mo49getActivity);
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, -2);
            layoutParams.addRule(12);
            LIZJ.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                i = C63081OpJ.LJJJJL(mo49getActivity2);
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, -2);
            layoutParams2.gravity = 80;
            LIZJ.setLayoutParams(layoutParams2);
        } else {
            ActivityC45651qj mo49getActivity3 = mo49getActivity();
            if (mo49getActivity3 != null) {
                i = C63081OpJ.LJJJJL(mo49getActivity3);
            }
            LIZJ.setLayoutParams(new ViewGroup.LayoutParams(i, -2));
        }
        this.LJLIL = (ViewGroup) LIZJ.findViewById(R.id.aov);
        this.LJLJJI = LIZJ.findViewById(R.id.sj);
        this.LJLILLLLZI = LIZJ.findViewById(R.id.bs8);
        this.LJLJI = LIZJ.findViewById(R.id.kyg);
        try {
            ViewTreeLifecycleOwner.set(LIZJ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZJ, this);
            C10A.LIZIZ(LIZJ, this);
            ActivityC45651qj mo49getActivity4 = mo49getActivity();
            if (mo49getActivity4 instanceof C29S) {
                c29s = (C29S) mo49getActivity4;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LIZJ;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
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
