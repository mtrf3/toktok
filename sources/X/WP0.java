package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WP0 extends WM7 implements InterfaceC143795kd {
    public final C62822Ol8 LJLIL;
    public C82247WPr LJLILLLLZI;
    public C81320Vvo LJLJI;
    public WP7 LJLJJI;
    public boolean LJLJJL;
    public final C73318Sq2 LJLJJLL;
    public final WP2 LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public boolean LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC65784Pro<InterfaceC142225i6> LJLLILLLL;
    public final InterfaceC65784Pro<InterfaceC82236WPg> LJLLJ;
    public final InterfaceC81328Vvw LJLLL;
    public final InterfaceC82245WPp LJLLLL;

    public final FilterPanelViewModel LLJILJILJ() {
        return (FilterPanelViewModel) this.LJLIL.getValue();
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

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LJLJJLL.LJLILLLLZI) {
            this.LJLJJLL.dispose();
        }
        C44659Hfr.LIZ.clear();
        C44659Hfr.LIZIZ.clear();
        C44659Hfr.LIZJ = null;
    }

    public static final /* synthetic */ C82247WPr LLJILJIL(WP0 wp0) {
        C82247WPr c82247WPr = wp0.LJLILLLLZI;
        if (c82247WPr != null) {
            return c82247WPr;
        }
        o.LJIJI("filterView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIIZILJ(viewModel1, block);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ds5, viewGroup, false, "inflater.inflate(R.layou…_scene, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJIIIZ(this, subscribe, config, subscriber);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> selectNonNullSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectNonNullSubscribe, "$this$selectNonNullSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LIZJ(this, selectNonNullSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJ(this, selectSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> subscribeEvent, TBW<S, ? extends C45927I0t<? extends A>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(subscribeEvent, "$this$subscribeEvent");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LJIIJ(this, subscribeEvent, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJFF(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    public WP0(C82622Wbi diContainer, AqS164S0100000_14 aqS164S0100000_14, AqS164S0100000_14 aqS164S0100000_142, InterfaceC81328Vvw interfaceC81328Vvw, InterfaceC82245WPp interfaceC82245WPp, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLLI = diContainer;
        this.LJLLILLLL = aqS164S0100000_14;
        this.LJLLJ = aqS164S0100000_142;
        this.LJLLL = interfaceC81328Vvw;
        this.LJLLLL = interfaceC82245WPp;
        this.LJLIL = C221108m2.LIZIZ(new AqS161S0200000_14(this, C65352Pkq.LIZ(FilterPanelViewModel.class), 0));
        this.LJLJJLL = new C73318Sq2();
        WP2 wp2 = new WP2(null);
        this.LJLJL = wp2;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(wp2);
        }
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 10));
        this.LJLL = true;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73297Sph.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJI(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJII(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88475Ynv);
    }
}
