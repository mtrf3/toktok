package com.ss.android.ugc.aweme.view.customview;

import X.AML;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C36396EQe;
import X.C3C5;
import X.C43045Guv;
import X.C62822Ol8;
import X.C72593SeL;
import X.C72672Sfc;
import X.C72673Sfd;
import X.C72676Sfg;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73318Sq2;
import X.C76800UCe;
import X.C79902VXm;
import X.C90903hW;
import X.H78;
import X.HW1;
import X.InterfaceC151715xP;
import X.InterfaceC61312at;
import X.InterfaceC72616Sei;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC84498XEg;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.TBT;
import X.TBV;
import X.TBW;
import X.TMG;
import X.W1T;
import X.X1D;
import X.XDU;
import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.gamora.recorder.navi.core.MessageReceiverLifecycleImpl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class ProfileNaviGLSurfaceFragment extends Fragment implements InterfaceC151715xP, MessageCenter.Listener {
    public C73318Sq2 LJLILLLLZI;
    public C36396EQe LJLJI;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 938));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 939));

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    public abstract int getLayout();

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

    public abstract C79902VXm wl();

    public abstract void xl();

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C73318Sq2 c73318Sq2 = this.LJLILLLLZI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLILLLLZI = null;
        MessageCenter.removeListener(this);
        MessageCenter.destroy();
        C36396EQe c36396EQe = this.LJLJI;
        if (c36396EQe != null) {
            c36396EQe.LJLJI.LIZ(c36396EQe);
            C73318Sq2 c73318Sq22 = c36396EQe.LJLJJL;
            if (c73318Sq22 != null) {
                c73318Sq22.dispose();
            }
            c36396EQe.LJLJJL = null;
        }
        this.LJLJI = null;
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ProfileNaviEditorViewModel vl() {
        return (ProfileNaviEditorViewModel) this.LJLJJI.getValue();
    }

    public final void Dl() {
        vl().getClass();
        if (C72593SeL.LIZIZ == null) {
            return;
        }
        String sceneStickerPath = vl().Hv0(this).getSceneStickerPath();
        if (sceneStickerPath == null || sceneStickerPath.length() == 0) {
            vl().Pv0(false);
        } else {
            Il(sceneStickerPath);
        }
    }

    public final void Hl() {
        InterfaceC72616Sei naviManager;
        C79902VXm wl = wl();
        if (wl != null && (naviManager = wl.getNaviManager()) != null) {
            naviManager.LJJJI("");
        }
        ProfileNaviEditorViewModel vl = vl();
        vl.getClass();
        vl.setStateImmediate(new AqS16S0010000_12(false, 10));
        C72673Sfd.LIZ.clear();
        C72673Sfd.LIZIZ = null;
        C79902VXm wl2 = wl();
        if (wl2 != null) {
            wl2.setCamera(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Hl();
        C79902VXm wl = wl();
        if (wl != null) {
            wl.onPause();
        }
        this.LJLIL.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C79902VXm wl = wl();
        if (wl != null) {
            wl.onResume();
        }
        Dl();
    }

    public void Al(C73318Sq2 c73318Sq2) {
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getCurrentMessage();
            }
        }, new AqS194S0100000_12(this, 143)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviEditorState) obj).getSceneStickerPath();
            }
        }, new AqS194S0100000_12(this, 144)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, vl(), new TBT() { // from class: X.Sfj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((ProfileNaviEditorState) obj).getFps());
            }
        }, new AqS194S0100000_12(this, 145)));
        c73318Sq2.LIZ(C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJL.getValue(), new TBV() { // from class: X.9zz
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((ProfileNaviSwitcherState) obj).getHasNaviChanged());
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setHasNaviChanged(((Boolean) obj2).booleanValue());
            }
        }, new AqS194S0100000_12(this, 146)));
    }

    public final void Il(String str) {
        InterfaceC72616Sei naviManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setting scene sticker path ");
        LIZ.append(str);
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        C79902VXm wl = wl();
        if (wl != null && (naviManager = wl.getNaviManager()) != null) {
            naviManager.LJJJI(str);
        }
    }

    public final void Gl(Runnable runnable, long j) {
        this.LJLIL.removeCallbacksAndMessages(null);
        if (j != 0) {
            this.LJLIL.postDelayed(runnable, j);
        } else {
            this.LJLIL.post(runnable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        InterfaceC72616Sei naviManager;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        Al(c73318Sq2);
        this.LJLILLLLZI = c73318Sq2;
        xl();
        ProfileNaviEditorViewModel vl = vl();
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        vl.init(requireContext);
        MessageCenter.removeListener(this);
        MessageCenter.setListener(this);
        C79902VXm wl = wl();
        if (wl != null && (naviManager = wl.getNaviManager()) != null) {
            Lifecycle lifecycle = getLifecycle();
            o.LJIIIIZZ(lifecycle, "lifecycle");
            C36396EQe c36396EQe = new C36396EQe(new XDU(((InterfaceC84498XEg) HW1.LIZIZ.getValue()).LJLJJLL()), new C72676Sfg(naviManager), new MessageReceiverLifecycleImpl(lifecycle));
            this.LJLJI = c36396EQe;
            c36396EQe.LJLJI.LIZIZ(c36396EQe);
            c36396EQe.LJLJJL = new C73318Sq2();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater.cloneInContext(new ContextThemeWrapper(mo49getActivity(), R.style.Theme.DeviceDefault.NoActionBar.Fullscreen)), getLayout(), viewGroup, false);
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
        C43045Guv.LIZLLL(new C72672Sfc(i, i2, i3, str, this), 0L);
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
