package com.ss.android.ugc.aweme.view.autocreation;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C40328FsC;
import X.C43045Guv;
import X.C62822Ol8;
import X.C72600SeS;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C76800UCe;
import X.C79902VXm;
import X.C90903hW;
import X.EnumC72807Shn;
import X.HW1;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC72616Sei;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.TBT;
import X.TBW;
import X.TMG;
import X.ViewOnTouchListenerC82377WUr;
import X.W1T;
import X.W5F;
import X.W5U;
import X.WV3;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviAutoCreationCameraContainerFragment extends Fragment implements InterfaceC151715xP, WV3, MessageCenter.Listener {
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 933));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 934));

    @Override // X.WV3
    public final void LJJIJIIJIL() {
    }

    @Override // X.WV3
    public final void LJJJJI() {
    }

    @Override // X.WV3
    public final boolean LJLLLLLL() {
        return false;
    }

    @Override // X.WV3
    public final void LLIL(int i) {
    }

    @Override // X.WV3
    public final void LLJJJJJIL() {
    }

    @Override // X.WV3
    public final void LLLLIILLL() {
    }

    @Override // X.WV3
    public final void LLLLLZL(float f) {
    }

    @Override // X.WV3
    public final boolean LLLLZ() {
        return false;
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // X.WV3
    public final /* synthetic */ void ba() {
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

    @Override // X.WV3
    public final void LLLZL() {
        InterfaceC72616Sei naviManager;
        InterfaceC72616Sei naviManager2;
        InterfaceC72616Sei naviManager3;
        C79902VXm c79902VXm = (C79902VXm) _$_findCachedViewById(R.id.i7o);
        if (c79902VXm != null && (naviManager3 = c79902VXm.getNaviManager()) != null) {
            naviManager3.LJJJJIZL(66671, 1, 1, "");
        }
        C79902VXm c79902VXm2 = (C79902VXm) _$_findCachedViewById(R.id.i7o);
        if (c79902VXm2 != null && (naviManager2 = c79902VXm2.getNaviManager()) != null) {
            naviManager2.LJJJJIZL(66672, 1, 1, "");
        }
        C79902VXm c79902VXm3 = (C79902VXm) _$_findCachedViewById(R.id.i7o);
        if (c79902VXm3 != null && (naviManager = c79902VXm3.getNaviManager()) != null) {
            naviManager.LJJJJIZL(66673, 0, 1, "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MessageCenter.removeListener(this);
        InterfaceC72616Sei naviManager = ((C79902VXm) _$_findCachedViewById(R.id.i7o)).getNaviManager();
        if (naviManager != null) {
            naviManager.LJJJI("");
        }
        InterfaceC72616Sei naviManager2 = ((C79902VXm) _$_findCachedViewById(R.id.i7o)).getNaviManager();
        if (naviManager2 != null) {
            naviManager2.LJJLIIIJ(false);
        }
        ((C79902VXm) _$_findCachedViewById(R.id.i7o)).setCamera(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        InterfaceC72616Sei naviManager;
        super.onStart();
        MessageCenter.setListener(this);
        if (getContext() != null && (naviManager = ((C79902VXm) _$_findCachedViewById(R.id.i7o)).getNaviManager()) != null) {
            Context context = getContext();
            o.LJI(context);
            naviManager.LJJLIIIJL(HW1.LIZIZ(context).getResourceFinder());
        }
        W5F LJFF = W5U.LJFF(UriProtector.parse("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/navi_avatar_outline.png"));
        LJFF.LIZJ = getContext();
        LJFF.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.i7k);
        LJFF.LJIJJ = EnumC72807Shn.FIT_CENTER;
        C16880lQ.LLJJJ(LJFF);
        ((ViewOnTouchListenerC82377WUr) _$_findCachedViewById(R.id.i7m)).LJLIL = true;
        ((ViewOnTouchListenerC82377WUr) _$_findCachedViewById(R.id.i7m)).LJIILIIL(1, true);
        ((ViewOnTouchListenerC82377WUr) _$_findCachedViewById(R.id.i7m)).LJIILJJIL();
        ((ViewOnTouchListenerC82377WUr) _$_findCachedViewById(R.id.i7m)).setRecordListener(this);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.i7j), new ACListenerS32S0100000_12(this, 0));
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.SeT
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getScanStickerPath();
            }
        }, new AqS194S0100000_12(this, 0));
    }

    public final void vl(int i) {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            C40328FsC.LIZLLL(mo49getActivity, i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ((ProfileNaviEditorViewModel) this.LJLILLLLZI.getValue()).Pv0(true);
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c6t, viewGroup, false);
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

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C43045Guv.LIZLLL(new C72600SeS(i, i2, this, str), 0L);
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
