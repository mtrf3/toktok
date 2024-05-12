package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS4S0600000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SnQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73156SnQ {
    public static Object LJIJJ(C73139Sn9 middleware1, InterfaceC88472Yns block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(block, "block");
        return block.invoke(middleware1.LIZJ().invoke(middleware1.LIZLLL().lv0()));
    }

    public static void LJIIL(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, InterfaceC88471Ynr interfaceC88471Ynr) {
        interfaceC73150SnK.subscribe(jediViewModel, new C73165SnZ(), interfaceC88471Ynr);
    }

    public static Object LJIJI(C73139Sn9 middleware1, C73139Sn9 middleware2, InterfaceC88471Ynr block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(block, "block");
        return block.invoke(middleware1.LIZJ().invoke(middleware1.LIZLLL().lv0()), middleware2.LIZJ().invoke(middleware2.LIZLLL().lv0()));
    }

    public static InterfaceC92693kP LJIIIIZZ(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, TBW tbw, InterfaceC88471Ynr interfaceC88471Ynr) {
        return interfaceC73150SnK.selectSubscribe(jediViewModel, tbw, new C73165SnZ<>(), interfaceC88471Ynr);
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at> InterfaceC92693kP LJIIJJI(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super RECEIVER, ? super S, C76800UCe> subscriber) {
        o.LJIIJ(subscribe, "$this$subscribe");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIJIIJIL(subscribe, lifecycleOwner, config, new AqS116S0300000_12(receiverHolder, interfaceC73150SnK, subscriber, 2));
    }

    public static Object LJIILL(JediViewModel viewModel1, JediViewModel viewModel2, JediViewModel viewModel3, InterfaceC88473Ynt block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(block, "block");
        return block.invoke(viewModel1.lv0(), viewModel2.lv0(), viewModel3.lv0());
    }

    public static Object LJIJ(C73139Sn9 middleware1, C73139Sn9 middleware2, C73139Sn9 middleware3, InterfaceC88473Ynt block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(block, "block");
        return block.invoke(middleware1.LIZJ().invoke(middleware1.LIZLLL().lv0()), middleware2.LIZJ().invoke(middleware2.LIZLLL().lv0()), middleware3.LIZJ().invoke(middleware3.LIZLLL().lv0()));
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, A> InterfaceC92693kP LIZJ(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIIJZLJL(config, selectSubscribe, lifecycleOwner, prop1, new AqS57S0400000_12(receiverHolder, interfaceC73150SnK, prop1, subscriber, 1));
    }

    public static InterfaceC92693kP LJII(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, TBT tbt, TBT tbt2, InterfaceC88473Ynt interfaceC88473Ynt) {
        return interfaceC73150SnK.selectSubscribe(jediViewModel, tbt, tbt2, new C73165SnZ<>(), interfaceC88473Ynt);
    }

    public static Object LJIILJJIL(JediViewModel viewModel1, JediViewModel viewModel2, JediViewModel viewModel3, JediViewModel viewModel4, InterfaceC88474Ynu block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(viewModel4, "viewModel4");
        o.LJIIJ(block, "block");
        return block.invoke(viewModel1.lv0(), viewModel2.lv0(), viewModel3.lv0(), viewModel4.lv0());
    }

    public static Object LJIIZILJ(C73139Sn9 middleware1, C73139Sn9 middleware2, C73139Sn9 middleware3, C73139Sn9 middleware4, InterfaceC88474Ynu block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(middleware4, "middleware4");
        o.LJIIJ(block, "block");
        return block.invoke(middleware1.LIZJ().invoke(middleware1.LIZLLL().lv0()), middleware2.LIZJ().invoke(middleware2.LIZLLL().lv0()), middleware3.LIZJ().invoke(middleware3.LIZLLL().lv0()), middleware4.LIZJ().invoke(middleware4.LIZLLL().lv0()));
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, A, B> InterfaceC92693kP LIZLLL(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super RECEIVER, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIIZ(config, selectSubscribe, lifecycleOwner, prop1, prop2, new C73158SnS(receiverHolder, interfaceC73150SnK, prop1, prop2, subscriber));
    }

    public static void LJIIIZ(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, TBT tbt, TBT tbt2, TBT tbt3, InterfaceC88474Ynu interfaceC88474Ynu) {
        interfaceC73150SnK.selectSubscribe(jediViewModel, tbt, tbt2, tbt3, new C73165SnZ<>(), interfaceC88474Ynu);
    }

    public static Object LJIILIIL(JediViewModel viewModel1, JediViewModel viewModel2, JediViewModel viewModel3, JediViewModel viewModel4, JediViewModel viewModel5, InterfaceC88475Ynv block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(viewModel4, "viewModel4");
        o.LJIIJ(viewModel5, "viewModel5");
        o.LJIIJ(block, "block");
        return block.invoke(viewModel1.lv0(), viewModel2.lv0(), viewModel3.lv0(), viewModel4.lv0(), viewModel5.lv0());
    }

    public static Object LJIILLIIL(C73139Sn9 middleware1, C73139Sn9 middleware2, C73139Sn9 middleware3, C73139Sn9 middleware4, C73139Sn9 middleware5, InterfaceC88475Ynv block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(middleware4, "middleware4");
        o.LJIIJ(middleware5, "middleware5");
        o.LJIIJ(block, "block");
        return block.invoke(middleware1.LIZJ().invoke(middleware1.LIZLLL().lv0()), middleware2.LIZJ().invoke(middleware2.LIZLLL().lv0()), middleware3.LIZJ().invoke(middleware3.LIZLLL().lv0()), middleware4.LIZJ().invoke(middleware4.LIZLLL().lv0()), middleware5.LIZJ().invoke(middleware5.LIZLLL().lv0()));
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, T> InterfaceC92693kP LIZ(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super RECEIVER, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIJ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIJ(prop, "prop");
        o.LJIIJ(config, "config");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIIJZLJL(config, asyncSubscribe, lifecycleOwner, prop, new AqS4S0600000_12(receiverHolder, interfaceC73150SnK, prop, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 0));
    }

    public static void LIZIZ(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, TBZ tbz, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr2, int i) {
        C73165SnZ<C73140SnA> c73165SnZ;
        InterfaceC88471Ynr interfaceC88471Ynr3 = interfaceC88471Ynr;
        InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
        InterfaceC88471Ynr interfaceC88471Ynr4 = null;
        if ((i & 2) != 0) {
            c73165SnZ = new C73165SnZ<>();
        } else {
            c73165SnZ = null;
        }
        if ((i & 4) != 0) {
            interfaceC88471Ynr3 = null;
        }
        if ((i & 8) != 0) {
            interfaceC88472Yns2 = null;
        }
        if ((i & 16) == 0) {
            interfaceC88471Ynr4 = interfaceC88471Ynr2;
        }
        interfaceC73150SnK.asyncSubscribe(jediViewModel, tbz, c73165SnZ, interfaceC88471Ynr3, interfaceC88472Yns2, interfaceC88471Ynr4);
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, A, B, C> InterfaceC92693kP LJ(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIIZI(config, selectSubscribe, lifecycleOwner, prop1, prop2, prop3, new C73159SnT(receiverHolder, interfaceC73150SnK, prop1, prop2, prop3, subscriber));
    }

    public static void LJIIJ(InterfaceC73150SnK interfaceC73150SnK, JediViewModel jediViewModel, TBT tbt, TBW tbw, TBT tbt2, TBT tbt3, InterfaceC88475Ynv interfaceC88475Ynv) {
        interfaceC73150SnK.selectSubscribe(jediViewModel, tbt, tbw, tbt2, tbt3, new C73165SnZ<>(), interfaceC88475Ynv);
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP LJFF(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIJ(config, selectSubscribe, lifecycleOwner, prop1, prop2, prop3, prop4, new C73160SnU(receiverHolder, interfaceC73150SnK, prop1, prop2, prop3, prop4, subscriber));
    }

    public static <RECEIVER extends InterfaceC98243tM, S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP LJI(InterfaceC73150SnK<? extends RECEIVER> interfaceC73150SnK, JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C73165SnZ<TMF> config, InterfaceC88476Ynw<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(prop5, "prop5");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        InterfaceC73149SnJ<? extends RECEIVER> receiverHolder = interfaceC73150SnK.getReceiverHolder();
        LifecycleOwner lifecycleOwner = interfaceC73150SnK.getLifecycleOwnerHolder().getLifecycleOwner();
        TMC.LJIIJJI(interfaceC73150SnK, config);
        return TMC.LJJIJIIJI(config, selectSubscribe, lifecycleOwner, prop1, prop2, prop3, prop4, prop5, new C73155SnP(receiverHolder, interfaceC73150SnK, prop1, prop2, prop3, prop4, prop5, subscriber));
    }
}
