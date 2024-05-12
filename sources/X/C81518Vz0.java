package X;

import Y.AObjectS89S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vz0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81518Vz0 extends WM7 implements InterfaceC143795kd {
    public final ShortVideoContext LJLIL;
    public final WSE LJLILLLLZI;
    public final C40871j1<Integer> LJLJI;
    public final C0IB<Boolean> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public View LJLJJLL;
    public int LJLJL;
    public ViewOnTouchListenerC81419VxP LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;
    public WS0 LJLLI;

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

    public final C119344mI LLJILJILJ() {
        return (C119344mI) this.LJLJJL.getValue();
    }

    public final int LLJILJIL(Object obj) {
        if (obj == null) {
            return -1;
        }
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = this.LJLJLJ;
        if (viewOnTouchListenerC81419VxP != null) {
            int tabCount = viewOnTouchListenerC81419VxP.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJLJ;
                if (viewOnTouchListenerC81419VxP2 != null) {
                    if (o.LJ(obj, viewOnTouchListenerC81419VxP2.LIZLLL(i))) {
                        return i;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            }
            return -1;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.bqs);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.complex_top_tab_host)");
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP = (ViewOnTouchListenerC81419VxP) requireViewById;
        this.LJLJLJ = viewOnTouchListenerC81419VxP;
        View findViewById = viewOnTouchListenerC81419VxP.findViewById(R.id.bqr);
        o.LJIIIIZZ(findViewById, "tabHost.findViewById(R.id.complex_tab_selected_bg)");
        this.LJLJJLL = findViewById;
        if (this.LJLL) {
            findViewById.setBackground(C04270Et.LIZIZ(requireActivity(), R.drawable.sp));
            View view = this.LJLJJLL;
            if (view != null) {
                C1JI.LJJIIZI(view, -1, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24))));
                ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP2 = this.LJLJLJ;
                if (viewOnTouchListenerC81419VxP2 != null) {
                    viewOnTouchListenerC81419VxP2.setSelectedTextColor(R.attr.do);
                    ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP3 = this.LJLJLJ;
                    if (viewOnTouchListenerC81419VxP3 != null) {
                        viewOnTouchListenerC81419VxP3.setUnselectedTextColor(R.attr.dk);
                        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP4 = this.LJLJLJ;
                        if (viewOnTouchListenerC81419VxP4 != null) {
                            viewOnTouchListenerC81419VxP4.setTabHostGestureListener(new C81412VxI(this));
                        } else {
                            o.LJIJI("tabHost");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tabHost");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabHost");
                    throw null;
                }
            } else {
                o.LJIJI("selectedBg");
                throw null;
            }
        }
        ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP5 = this.LJLJLJ;
        if (viewOnTouchListenerC81419VxP5 != null) {
            viewOnTouchListenerC81419VxP5.setVisibility(8);
            WSE wse = this.LJLILLLLZI;
            C81413VxJ c81413VxJ = new C81413VxJ(this);
            wse.getClass();
            wse.LJIIIZ = c81413VxJ;
            WSE wse2 = this.LJLILLLLZI;
            ShortVideoContext shortVideoContext = this.LJLIL;
            ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP6 = this.LJLJLJ;
            if (viewOnTouchListenerC81419VxP6 != null) {
                wse2.LJI(shortVideoContext, viewOnTouchListenerC81419VxP6);
                this.LJLJI.LIZIZ(this, new AObjectS89S0100000_14(this, 190));
                C0IB<Boolean> c0ib = this.LJLJJI;
                if (c0ib != null) {
                    c0ib.LIZIZ(this, new AObjectS89S0100000_14(this, 191));
                    return;
                }
                return;
            }
            o.LJIJI("tabHost");
            throw null;
        }
        o.LJIJI("tabHost");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ds0, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public C81518Vz0(ShortVideoContext shortVideoContext, WSE wse, C40871j1<Integer> c40871j1, C0IB<Boolean> relayoutEvent, C29901Fi<Boolean> c29901Fi) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(relayoutEvent, "relayoutEvent");
        this.LJLIL = shortVideoContext;
        this.LJLILLLLZI = wse;
        this.LJLJI = c40871j1;
        this.LJLJJI = relayoutEvent;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 209));
        this.LJLJL = -1;
        if (C44363Hb5.LIZ()) {
            i = 25;
        } else {
            i = 40;
        }
        this.LJLJLLL = C7MY.LIZIZ(i);
        this.LJLL = C52286Kfa.LIZ();
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
