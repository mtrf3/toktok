package X;

import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedState;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I5Y extends AbstractC143775kb implements InterfaceC143795kd {
    public I5V LJLIL;
    public W1U LJLILLLLZI;
    public CutMultiVideoViewModel LJLJJI;
    public CutVideoSpeedViewModel LJLJJL;
    public CutVideoViewModel LJLJJLL;
    public float LJLJL;
    public boolean LJLJI = true;
    public EnumC82528WaC LJLJLJ = EnumC82528WaC.NORMAL;

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

    public final CutVideoSpeedViewModel LLJILJILJ() {
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.LJLJJL;
        if (cutVideoSpeedViewModel != null) {
            return cutVideoSpeedViewModel;
        }
        o.LJIJI("speedViewModel");
        throw null;
    }

    public void LLJJ() {
        W1U w1u = this.LJLILLLLZI;
        if (w1u != null) {
            ViewGroup.LayoutParams layoutParams = w1u.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = (int) this.LJLJL;
            W1U w1u2 = this.LJLILLLLZI;
            if (w1u2 != null) {
                w1u2.setLayoutParams(layoutParams2);
                return;
            } else {
                o.LJIJI("speedView");
                throw null;
            }
        }
        o.LJIJI("speedView");
        throw null;
    }

    public static EnumC82528WaC LLJILJIL(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return EnumC82528WaC.FAST;
                }
                throw new IllegalArgumentException(KMP.LJ("unknown view: ", i));
            }
            return EnumC82528WaC.NORMAL;
        }
        return EnumC82528WaC.SLOW;
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CutMultiVideoViewModel cutMultiVideoViewModel = (CutMultiVideoViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(CutMultiVideoViewModel.class);
        o.LJIIIZ(cutMultiVideoViewModel, "<set-?>");
        this.LJLJJI = cutMultiVideoViewModel;
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(CutVideoSpeedViewModel.class);
        o.LJIIIIZZ(LIZ, "SAAJediViewModelProvider…eedViewModel::class.java]");
        this.LJLJJL = (CutVideoSpeedViewModel) LIZ;
        JediViewModel LIZ2 = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(CutVideoViewModel.class);
        o.LJIIIIZZ(LIZ2, "of(this).get(CutVideoViewModel::class.java)");
        this.LJLJJLL = (CutVideoViewModel) LIZ2;
        selectNonNullSubscribe(LLJILJILJ(), new TBT() { // from class: X.E2o
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoSpeedState) obj).getEnable();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 62));
        selectNonNullSubscribe(LLJILJILJ(), new TBT() { // from class: X.E2s
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((CutVideoSpeedState) obj).getVisible();
            }
        }, new C73165SnZ<>(), new AqS189S0100000_7(this, 64));
        ((LiveData) LLJILJILJ().LJLJL.getValue()).observe(this, new AObserverS75S0100000_7(this, 87));
        ((LiveData) LLJILJILJ().LJLJJLL.getValue()).observe(this, new AObserverS75S0100000_7(this, 89));
        ((LiveData) LLJILJILJ().LJLJLJ.getValue()).observe(this, new AObserverS75S0100000_7(this, 91));
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLJL = C44729Hgz.LJIIL(context, 163.0f);
        W1U w1u = (W1U) view;
        this.LJLILLLLZI = w1u;
        String string = getString(R.string.rek);
        o.LJIIIIZZ(string, "getString(R.string.slow)");
        w1u.LIZ(string);
        String string2 = getString(R.string.rko);
        o.LJIIIIZZ(string2, "getString(R.string.standard)");
        w1u.LIZ(string2);
        String string3 = getString(R.string.g_y);
        o.LJIIIIZZ(string3, "getString(R.string.fast)");
        w1u.LIZ(string3);
        W1U w1u2 = this.LJLILLLLZI;
        if (w1u2 != null) {
            w1u2.setCurrentItem(1);
            W1U w1u3 = this.LJLILLLLZI;
            if (w1u3 != null) {
                w1u3.setOnItemChangeListener(new I5A(this));
                return;
            } else {
                o.LJIJI("speedView");
                throw null;
            }
        }
        o.LJIJI("speedView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbw, viewGroup, false, "inflater.inflate(R.layou…_speed, container, false)");
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
