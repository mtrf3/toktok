package X;

import X.InterfaceC98243tM;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: X.SnK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC73150SnK<RECEIVER extends InterfaceC98243tM> {
    <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super RECEIVER, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super T, C76800UCe> interfaceC88471Ynr2);

    InterfaceC73141SnB getLifecycleOwnerHolder();

    InterfaceC73149SnJ<RECEIVER> getReceiverHolder();

    boolean getUniqueOnlyGlobal();

    <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> interfaceC88471Ynr);

    <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super RECEIVER, ? super A, ? super B, C76800UCe> interfaceC88473Ynt);

    <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu);

    <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv);

    <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super RECEIVER, ? super S, C76800UCe> interfaceC88471Ynr);

    <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns);
}
