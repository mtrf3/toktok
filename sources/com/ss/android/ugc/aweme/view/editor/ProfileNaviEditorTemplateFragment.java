package com.ss.android.ugc.aweme.view.editor;

import X.AML;
import X.AbstractC029409q;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C26227ARb;
import X.C29S;
import X.C3C5;
import X.C53202KuM;
import X.C62822Ol8;
import X.C72604SeW;
import X.C72610Sec;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C90903hW;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC72613Sef;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.RTR;
import X.TBV;
import X.TBW;
import X.TMG;
import X.UC0;
import X.W1T;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviEditorTemplateFragment extends Fragment implements InterfaceC151715xP, InterfaceC72613Sef {
    public final boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL;

    public ProfileNaviEditorTemplateFragment() {
        this(false);
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.gy_);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.gy_)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
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

    @Override // X.InterfaceC72613Sef
    public final void vc() {
        Gl(new AqS162S0100000_12(this, 946));
    }

    public final ProfileNaviEditorViewModel wl() {
        return (ProfileNaviEditorViewModel) this.LJLJI.getValue();
    }

    public final ProfileNaviOnboardingViewModel xl() {
        return (ProfileNaviOnboardingViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Al(null);
        ProfileNaviOnboardingViewModel xl = xl();
        xl.getClass();
        xl.withState(new AqS172S0100000_6(xl, 71));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBV() { // from class: X.Sev
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarList();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarList((List) obj2);
            }
        }, new AqS194S0100000_12(this, 3));
        C73156SnQ.LJIIIIZZ(this, xl(), new TBV() { // from class: X.See
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviOnboardingState) obj).getStarterAvatarId();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviOnboardingState) obj).setStarterAvatarId((Integer) obj2);
            }
        }, new AqS194S0100000_12(this, 4));
    }

    public final C72610Sec vl() {
        if (((RecyclerView) _$_findCachedViewById(R.id.gy_)).getAdapter() instanceof C72610Sec) {
            AbstractC029409q adapter = ((RecyclerView) _$_findCachedViewById(R.id.gy_)).getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.view.adapter.ProfileNaviStarterAvatarListAdapter");
            return (C72610Sec) adapter;
        }
        return null;
    }

    public ProfileNaviEditorTemplateFragment(boolean z) {
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = z;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 947));
        this.LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 945));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 948));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (X.C53246Kv4.LIZIZ == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Al(java.util.List<X.RTR> r8) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorTemplateFragment.Al(java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Dl(RTR rtr) {
        int i;
        ProfileNaviOnboardingViewModel xl = xl();
        int LIZ = rtr.LIZ();
        xl.getClass();
        xl.setState(new AqS36S0001000_12(LIZ, 9));
        ((ProfileNaviSwitcherViewModel) this.LJLJJI.getValue()).Nv0(new ProfileNaviDataModel(null, null, null, null, rtr.LIZJ, null, 47, null));
        ProfileNaviEditorViewModel wl = wl();
        boolean z = this.LJLIL;
        boolean z2 = !z;
        wl.getClass();
        if ((!z2 && C53202KuM.LIZ()) || z) {
            i = 1;
        } else {
            i = 0;
        }
        if (((ProfileNaviEditorState) wl.lv0()).getCurrentTabIndex() != i) {
            wl.setStateImmediate(new AqS36S0001000_12(i, 8));
        }
        ProfileNaviEditorViewModel wl2 = wl();
        wl2.getClass();
        wl2.setState(new AqS16S0010000_12(false, 8));
    }

    public final void Gl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ProfileNaviEditorViewModel wl = wl();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (wl.Hv0(requireActivity).getHasEdited()) {
            ActivityC45651qj requireActivity2 = requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            C26227ARb c26227ARb = new C26227ARb(requireActivity2);
            c26227ARb.LJ(R.string.c0f);
            c26227ARb.LIZ(R.string.c0c);
            c26227ARb.LJII = true;
            UC0.LIZJ(c26227ARb, new AqS178S0100000_12(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 303));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.InterfaceC72613Sef
    public final void e5(RTR starterAvatar) {
        o.LJIIIZ(starterAvatar, "starterAvatar");
        Gl(new AqS159S0200000_12(starterAvatar, this, 39));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C72604SeW.LIZ);
        FMX.LJIIL("show_avatar_edit_page", c188727au.LIZ);
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c77, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
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
