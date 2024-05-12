package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AbstractC177926ya;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C177906yY;
import X.C178166yy;
import X.C1788570f;
import X.C1788670g;
import X.C1788770h;
import X.C1788870i;
import X.C184077Kh;
import X.C201247v6;
import X.C201277v9;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71Y;
import X.C73G;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C7EL;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.InterfaceC178146yw;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import Y.ACListenerS23S0100000_3;
import Y.AUListenerS92S0100000_3;
import Y.IDAListenerS72S0100000_3;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.now.interaction.assem.ICommentMentionAssemAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS1S0020000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowKeyboardFragment extends BaseNowKeyboardFragment implements KPL, C2L4 {
    public static final /* synthetic */ int LJLLJ = 0;
    public C7EL LJLJI;
    public View LJLJJI;
    public Animator LJLJJL;
    public Animator LJLJJLL;
    public C73G LJLJL;
    public ValueAnimator LJLL;
    public final C214298b3 LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C201247v6.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C201277v9.LJLIL);

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public NowKeyboardFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NowKeyboardVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 98);
        C1788670g c1788670g = C1788670g.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c1788670g, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c1788670g, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLI = c214298b3;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(CommentKeyboardScope.class);
    }

    public final void vl() {
        AbstractC177926ya abstractC177926ya;
        Editable editable;
        C1788870i c1788870i = this.LJLIL;
        if (c1788870i == null || (abstractC177926ya = c1788870i.LIZ) == null) {
            abstractC177926ya = C177906yY.LIZ;
        }
        wl().iv0(abstractC177926ya, true);
        C1788870i c1788870i2 = this.LJLIL;
        if (c1788870i2 != null) {
            editable = c1788870i2.LIZIZ;
        } else {
            editable = null;
        }
        INowKeyboardInputPanelAssemAbility LIZIZ = C178166yy.LIZIZ(C55230Lly.LIZJ(this, null));
        if (LIZIZ != null) {
            LIZIZ.yz(editable);
        }
        C1788870i c1788870i3 = this.LJLIL;
        if (c1788870i3 != null && o.LJ(c1788870i3.LIZJ, Boolean.TRUE)) {
            NowKeyboardVM wl = wl();
            wl.getClass();
            wl.setStateImmediate(new AqS1S0020000_3(true, 0));
        }
    }

    public final NowKeyboardVM wl() {
        return (NowKeyboardVM) this.LJLLI.getValue();
    }

    public final void xl() {
        ValueAnimator valueAnimator;
        C71Y.LIZLLL("NowKeyboardFragment", "showKeyboardFragment");
        if (getView() == null) {
            return;
        }
        C71Y.LIZLLL("NowKeyboardFragment", "truly showKeyboardFragment ");
        long currentTimeMillis = System.currentTimeMillis();
        C1788570f c1788570f = C1788770h.LIZ;
        if (c1788570f.LIZJ == 0) {
            c1788570f.LIZJ = currentTimeMillis;
        }
        C7EL c7el = this.LJLJI;
        if (c7el != null) {
            c7el.show();
        }
        ValueAnimator valueAnimator2 = this.LJLL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJLL) != null) {
            valueAnimator.cancel();
        }
        vl();
        this.LJLJJLL = ObjectAnimator.ofFloat(getView(), (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        this.LJLL = ofInt;
        if (ofInt != null) {
            ofInt.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.LJLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS92S0100000_3(this, 3));
        }
        ValueAnimator valueAnimator4 = this.LJLL;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(200L);
        }
        Animator animator = this.LJLJJLL;
        if (animator != null) {
            animator.setDuration(200L);
        }
        Animator animator2 = this.LJLJJLL;
        if (animator2 != null) {
            animator2.setInterpolator((Interpolator) this.LJLJLJ.getValue());
        }
        Animator animator3 = this.LJLJJLL;
        if (animator3 != null) {
            animator3.addListener(new IDAListenerS72S0100000_3(this, 2));
        }
        ValueAnimator valueAnimator5 = this.LJLL;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
        Animator animator4 = this.LJLJJLL;
        if (animator4 != null) {
            animator4.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C7EL c7el = this.LJLJI;
        if (c7el != null) {
            c7el.release();
        }
    }

    public final void LLJJIJI(C73G c73g) {
        this.LJLJL = c73g;
        View view = getView();
        if (view != null) {
            INowKeyboardInputPanelAssemAbility LIZIZ = C178166yy.LIZIZ(C55230Lly.LJ(view));
            if (LIZIZ != null) {
                LIZIZ.LLJJIJI(c73g);
            }
            InterfaceC55235Lm3 LJ = C55230Lly.LJ(view);
            Aweme aweme = null;
            ICommentMentionAssemAbility iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C55096Ljo.LIZ(LJ, ICommentMentionAssemAbility.class, null);
            if (iCommentMentionAssemAbility != null) {
                iCommentMentionAssemAbility.LLJJIJI(c73g);
            }
            NowKeyboardVM wl = wl();
            if (c73g != null) {
                aweme = c73g.LJLIL;
            }
            wl.hv0(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.BaseNowKeyboardFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Aweme aweme;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        NowKeyboardVM wl = wl();
        C73G c73g = this.LJLJL;
        if (c73g != null) {
            aweme = c73g.LJLIL;
        } else {
            aweme = null;
        }
        wl.hv0(aweme);
        View view2 = this.LJLJJI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 21), view2);
        }
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 66));
        C8YN.LJII(this, wl(), new TBT() { // from class: X.70b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLLI;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 19), 4);
        C8YN.LJII(this, wl(), new TBT() { // from class: X.70c
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C178336zF) obj).LJLJJI;
            }
        }, null, new AqS185S0100000_3(this, 20), 6);
        vl();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.qf, viewGroup, false);
        Context context = LLLLIILL.getContext();
        o.LJIIIIZZ(context, "rootView.context");
        C7EL c7el = new C7EL(context, LLLLIILL);
        this.LJLJI = c7el;
        c7el.LJLJLLL = new InterfaceC178146yw() { // from class: X.70a
            @Override // X.InterfaceC178146yw
            public final void Yc(int i) {
            }

            @Override // X.InterfaceC178146yw
            public final void LLIIJLIL() {
                NowKeyboardFragment.this.wl().kv0(0, false);
            }

            @Override // X.InterfaceC178146yw
            public final void y1(int i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("keyboardFakePopupWindow show keyboard height->");
                LIZ.append(i);
                C71Y.LIZLLL("NowKeyboardFragment", X1D.LIZIZ(LIZ));
                C7EP.LIZLLL(i);
                NowKeyboardFragment.this.wl().kv0(i, true);
            }
        };
        c7el.show();
        this.LJLJJI = LLLLIILL.findViewById(R.id.hec);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
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
