package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorState;
import com.ss.android.ugc.gamora.editor.filter.indicator.EditFilterIndicatorViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SqG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73332SqG extends WM7 implements InterfaceC143795kd {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public ViewStub LJLJI;
    public FilterBean LJLJJI;
    public boolean LJLJJL;
    public final FilterBean LJLJJLL;
    public final InterfaceC82236WPg LJLJL;

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
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJJI = this.LJLJJLL;
        selectNonNullSubscribe((JediViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.SqH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditFilterIndicatorState) obj).getCurrentFilter();
            }
        }, new C73165SnZ<>(), new AqS194S0100000_12(this, 262));
    }

    public C73332SqG(FilterBean filterBean, InterfaceC82236WPg filterRepository) {
        o.LJIIIZ(filterRepository, "filterRepository");
        this.LJLJJLL = filterBean;
        this.LJLJL = filterRepository;
        this.LJLIL = C221108m2.LIZIZ(new AqS159S0200000_12(this, C65352Pkq.LIZ(EditFilterIndicatorViewModel.class), 95));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1215));
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIIZILJ(viewModel1, block);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cce, container, false);
        View findViewById = LLLLIILL.findViewById(R.id.kme);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.stub_filter_indicator)");
        this.LJLJI = (ViewStub) findViewById;
        return LLLLIILL;
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
