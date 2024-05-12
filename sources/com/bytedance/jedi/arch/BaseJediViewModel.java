package com.bytedance.jedi.arch;

import X.C164536cz;
import X.C73165SnZ;
import X.C73536StY;
import X.InterfaceC143795kd;
import X.InterfaceC61312at;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import X.TBT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class BaseJediViewModel<S extends InterfaceC61312at> extends JediViewModel<S> {
    public final S Hv0(final LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return (S) new InterfaceC143795kd() { // from class: X.5kK
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

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                Lifecycle lifecycle = LifecycleOwner.this.getLifecycle();
                o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
                return lifecycle;
            }

            @Override // X.InterfaceC73150SnK
            public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
                o.LJIIIZ(viewModel1, "viewModel1");
                o.LJIIIZ(block, "block");
                return (R) C73297Sph.LJIIZILJ(viewModel1, block);
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
        }.withState(this, C164536cz.LJLIL);
    }

    public static /* synthetic */ InterfaceC92693kP Jv0(BaseJediViewModel baseJediViewModel, LifecycleOwner lifecycleOwner, TBT tbt, InterfaceC88472Yns interfaceC88472Yns) {
        return baseJediViewModel.Iv0(lifecycleOwner, tbt, new C73165SnZ(), interfaceC88472Yns);
    }

    public static /* synthetic */ InterfaceC92693kP Lv0(BaseJediViewModel baseJediViewModel, LifecycleOwner lifecycleOwner, TBT tbt, InterfaceC88472Yns interfaceC88472Yns) {
        return baseJediViewModel.Kv0(lifecycleOwner, tbt, new C73165SnZ(), interfaceC88472Yns);
    }

    public final InterfaceC92693kP Iv0(LifecycleOwner lifecycleOwner, TBT prop1, C73165SnZ config, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return Kv0(lifecycleOwner, prop1, config, new AqS168S0100000_2(interfaceC88472Yns, 41));
    }

    public final InterfaceC92693kP Kv0(LifecycleOwner lifecycleOwner, TBT prop1, C73165SnZ config, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C73536StY.LJLIL.LJJJJZ();
        }
        final InterfaceC92693kP rv0 = rv0(prop1, config, interfaceC88472Yns);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.jedi.arch.BaseJediViewModel$selectSubscribe$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                if (!InterfaceC92693kP.this.isDisposed()) {
                    InterfaceC92693kP.this.dispose();
                }
            }
        });
        return rv0;
    }
}
