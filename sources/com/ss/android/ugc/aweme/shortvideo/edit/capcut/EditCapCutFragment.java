package com.ss.android.ugc.aweme.shortvideo.edit.capcut;

import X.AMD;
import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C145475nL;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C25903AEp;
import X.C29S;
import X.C3C5;
import X.C42501Gm9;
import X.C51729KRx;
import X.C51731KRz;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C78496UrM;
import X.C90903hW;
import X.InterfaceC151715xP;
import X.InterfaceC219588ja;
import X.InterfaceC61312at;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.KL2;
import X.KS0;
import X.SY4;
import X.TBT;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS22S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutState;
import com.ss.ttvideoengine.TTVideoEngine;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EditCapCutFragment extends Fragment implements InterfaceC219588ja, InterfaceC151715xP, AMD<C25903AEp> {
    public boolean LJLJI;
    public boolean LJLJJI;
    public TTVideoEngine LJLJJL;
    public Surface LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C25903AEp LJLIL = new C25903AEp();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 213));

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS157S0100000_7(this, 202));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    public final EditCapCutViewModel vl() {
        return (EditCapCutViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        TTVideoEngine tTVideoEngine = this.LJLJJL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
        }
        this.LJLJJL = null;
        Surface surface = this.LJLJJLL;
        if (surface != null) {
            surface.release();
        }
        this.LJLJJLL = null;
        this.LJLJI = false;
        this.LJLJJI = false;
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        TTVideoEngine tTVideoEngine;
        super.onPause();
        if (getUserVisibleHint() && this.LJLJI && _$_findCachedViewById(R.id.kw8).getVisibility() == 0 && (tTVideoEngine = this.LJLJJL) != null) {
            tTVideoEngine.LJJL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint() && this.LJLJI && _$_findCachedViewById(R.id.kw8).getVisibility() == 0) {
            TTVideoEngine tTVideoEngine = this.LJLJJL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJJLI();
            }
            vl().Mv0(false, true);
        }
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLIL;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.KRy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCapCutState) obj).getUiElements();
            }
        }, new AqS190S0100000_8(this, 62));
        C73156SnQ.LIZIZ(this, vl(), new TBT() { // from class: X.KS1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCapCutState) obj).getLoadingEvent();
            }
        }, new AqS189S0100000_7(this, 68), new AqS173S0100000_7(this, 313), new AqS189S0100000_7(this, 69), 2);
        EditCapCutViewModel vl = vl();
        KS0 ks0 = new TBT() { // from class: X.KS0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCapCutState) obj).getGotoGPPlayEvent();
            }
        };
        C73165SnZ c73165SnZ = new C73165SnZ();
        c73165SnZ.LIZ = true;
        C73157SnR.LIZIZ(this, vl, ks0, c73165SnZ, new AqS189S0100000_7(this, 70));
        EditCapCutViewModel vl2 = vl();
        C51729KRx c51729KRx = new TBT() { // from class: X.KRx
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCapCutState) obj).getGotoCCEvent();
            }
        };
        C73165SnZ c73165SnZ2 = new C73165SnZ();
        c73165SnZ2.LIZ = true;
        C73157SnR.LIZIZ(this, vl2, c51729KRx, c73165SnZ2, new AqS189S0100000_7(this, 67));
        EditCapCutViewModel vl3 = vl();
        C51731KRz c51731KRz = new TBT() { // from class: X.KRz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditCapCutState) obj).getSaveDraftToastEvent();
            }
        };
        C73165SnZ c73165SnZ3 = new C73165SnZ();
        c73165SnZ3.LIZ = true;
        C73157SnR.LIZIZ(this, vl3, c51731KRz, c73165SnZ3, C145475nL.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        TTVideoEngine tTVideoEngine;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-4102000448338438003");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/shortvideo/edit/capcut/EditCapCutFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/shortvideo/edit/capcut/EditCapCutFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.LJLJI) {
            if (z) {
                TTVideoEngine tTVideoEngine2 = this.LJLJJL;
                if (tTVideoEngine2 != null) {
                    tTVideoEngine2.LJJLI();
                }
            } else {
                TTVideoEngine tTVideoEngine3 = this.LJLJJL;
                if (tTVideoEngine3 != null) {
                    tTVideoEngine3.LJJL();
                }
            }
        } else if (!this.LJLJJI && this.LJLJJLL != null && z && (tTVideoEngine = this.LJLJJL) != null) {
            tTVideoEngine.LJJLI();
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/shortvideo/edit/capcut/EditCapCutFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        float LJIIJJI = KL2.LJIIJJI(getContext()) - (KL2.LIZJ(getContext(), 48.0f) * 2);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.kw8).getLayoutParams();
        layoutParams.width = (int) LJIIJJI;
        layoutParams.height = (int) ((LJIIJJI / 16) * 9);
        _$_findCachedViewById(R.id.kw8).setLayoutParams(layoutParams);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.avz), new ACListenerS22S0100000_2(this, 126));
        _$_findCachedViewById(R.id.ddo).setOutlineProvider(new C42501Gm9(this));
        _$_findCachedViewById(R.id.ddo).setClipToOutline(true);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bj7, viewGroup, false, "inflater.inflate(R.layou…ap_cut, container, false)");
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
