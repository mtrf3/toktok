package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS166S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.IDqS182S0200000_3;
import kotlin.jvm.internal.IDqS193S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8YN */
/* loaded from: classes4.dex */
public final class C8YN {
    public static <RECEIVER extends C3C8> InterfaceC65784Pro<Boolean> LIZIZ(C8YM<RECEIVER> c8ym) {
        if (c8ym.getReceiverForHostVM() != null) {
            return new AqS153S0100000_3(c8ym, 1595);
        }
        return C8XC.LJLIL;
    }

    public static Object LJIJI(AssemViewModel viewModel1, InterfaceC88472Yns block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return block.invoke(viewModel1.getVmDispatcher().getState());
    }

    public static void LJIJJ(AssemViewModel viewModel1, InterfaceC88472Yns block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        viewModel1.getVmDispatcher().LJII(new AqS169S0100000_3(block, (InterfaceC88472Yns<? super C177336xd, C76800UCe>) 843));
    }

    public static Object LJIJ(AssemViewModel viewModel1, AssemViewModel viewModel2, InterfaceC88471Ynr block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(block, "block");
        return block.invoke(viewModel1.getVmDispatcher().getState(), viewModel2.getVmDispatcher().getState());
    }

    public static Object LJIIZILJ(AssemViewModel viewModel1, AssemViewModel viewModel2, AssemViewModel viewModel3, InterfaceC88473Ynt block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(viewModel2, "viewModel2");
        o.LJIIIZ(viewModel3, "viewModel3");
        o.LJIIIZ(block, "block");
        return block.invoke(viewModel1.getVmDispatcher().getState(), viewModel2.getVmDispatcher().getState(), viewModel3.getVmDispatcher().getState());
    }

    public static <RECEIVER extends C3C8, S extends C33Q> InterfaceC222288nw LJIILL(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, C56412MCa<S> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super S, C76800UCe> subscriber) {
        C213158Yd LIZIZ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LIZIZ = vmDispatcher.LIZIZ(actualLifecycleOwner, config, interfaceC88472Yns, new AqS134S0200000_3(actualReceiverHolder, subscriber, 256));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LIZIZ(c8ym);
            LIZIZ = vmDispatcher2.LIZIZ(ownLifecycleOwner, config, interfaceC88472Yns, new AqS134S0200000_3(c8ym, subscriber, 257));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1603));
        return LIZIZ;
    }

    public static /* synthetic */ void LJIILLIIL(C8YM c8ym, AssemViewModel assemViewModel, C56412MCa c56412MCa, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        if ((i & 1) != 0) {
            c56412MCa = C213688a4.LIZIZ(assemViewModel.usedInReusedScene);
        }
        c8ym.subscribe(assemViewModel, c56412MCa, null, interfaceC88471Ynr);
    }

    public static <RECEIVER extends C3C8, S extends C33Q, A> InterfaceC222288nw LIZLLL(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> subscriber) {
        InterfaceC222288nw LJFF;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) receiver, 1600), false);
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJFF = C8YQ.LIZ(vmDispatcher, actualLifecycleOwner, prop1, config, null, interfaceC88472Yns, new AqS134S0200000_3(actualReceiverHolder, subscriber, 252), 8);
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if ((ownLifecycleOwner == null || !receiver.useOwnerLifecycle) && (ownLifecycleOwner = c8ym.getHostLifecycleOwner()) == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) receiver, 1601), false);
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJFF = vmDispatcher2.LJFF(prop1, config, ownLifecycleOwner, interfaceC88472Yns, LIZIZ(c8ym), new AqS134S0200000_3(c8ym, subscriber, 253));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1596));
        return LJFF;
    }

    public static /* synthetic */ InterfaceC222288nw LJII(C8YM c8ym, AssemViewModel assemViewModel, TBW tbw, C56412MCa c56412MCa, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        C56412MCa c56412MCa2 = c56412MCa;
        if ((i & 2) != 0) {
            c56412MCa2 = C213688a4.LIZIZ(assemViewModel.usedInReusedScene);
        }
        return c8ym.selectSubscribe(assemViewModel, tbw, c56412MCa2, null, interfaceC88471Ynr);
    }

    public static <RECEIVER extends C3C8, S extends C33Q, A> InterfaceC222288nw LJIILIIL(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> subscriber) {
        InterfaceC222288nw LJFF;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            config.LJFF = true;
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJFF = C8YQ.LIZ(vmDispatcher, actualLifecycleOwner, prop1, config, null, interfaceC88472Yns, new AqS134S0200000_3(actualReceiverHolder, subscriber, 254), 8);
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            config.LJFF = true;
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJFF = vmDispatcher2.LJFF(prop1, config, ownLifecycleOwner, interfaceC88472Yns, LIZIZ(c8ym), new AqS134S0200000_3(c8ym, subscriber, 255));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1602));
        return LJFF;
    }

    public static void LJIILJJIL(C8YM c8ym, AssemViewModel assemViewModel, TBT tbt, C56412MCa c56412MCa, InterfaceC88471Ynr interfaceC88471Ynr, int i) {
        C56412MCa c56412MCa2 = c56412MCa;
        if ((i & 2) != 0) {
            MBA context = assemViewModel.getInternalAssemVMScope$assem_release().getCoroutineContext();
            o.LJIIIZ(context, "context");
            c56412MCa2 = new C56412MCa();
            c56412MCa2.LJ = context;
            c56412MCa2.LJFF = true;
        }
        c8ym.selectSubscribeOnAsync(assemViewModel, tbt, c56412MCa2, null, interfaceC88471Ynr);
    }

    public static <RECEIVER extends C3C8, S extends C33Q, T> InterfaceC222288nw LIZ(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends AbstractC72932td<? extends T>> prop, C56412MCa<C213178Yf<AbstractC72932td<T>>> config, InterfaceC88471Ynr<? super RECEIVER, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super RECEIVER, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super T, C76800UCe> interfaceC88471Ynr2) {
        InterfaceC222288nw LIZ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LIZ = C8YQ.LIZ(vmDispatcher, actualLifecycleOwner, prop, config, null, null, new AqS49S0400000_3(actualReceiverHolder, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 12), 24);
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LIZ = C8YQ.LIZ(vmDispatcher2, ownLifecycleOwner, prop, config, LIZIZ(c8ym), null, new AqS49S0400000_3(c8ym, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 13), 16);
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1594));
        return LIZ;
    }

    public static InterfaceC222288nw LIZJ(AssemViewModel receiver, C8YM c8ym, C56412MCa config, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt subscriber, TBW prop1, TBW prop2) {
        InterfaceC222288nw LJIIJ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJIIJ = vmDispatcher.LJIIJ(actualLifecycleOwner, prop1, prop2, config, C8YX.LJLIL, interfaceC88472Yns, new AqS166S0200000_3(actualReceiverHolder, (InterfaceC212848Wy<C3C8>) subscriber, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) 22));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJIIJ = vmDispatcher2.LJIIJ(ownLifecycleOwner, prop1, prop2, config, LIZIZ(c8ym), interfaceC88472Yns, new AqS166S0200000_3(c8ym, (C8YM<C3C8>) subscriber, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) 23));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3(receiver, 1604));
        return LJIIJ;
    }

    public static /* synthetic */ void LJIIJ(C8YM c8ym, AssemViewModel assemViewModel, TBT tbt, TBT tbt2, C56412MCa c56412MCa, InterfaceC88473Ynt interfaceC88473Ynt, int i) {
        C56412MCa c56412MCa2 = c56412MCa;
        if ((i & 4) != 0) {
            c56412MCa2 = C213688a4.LIZIZ(assemViewModel.usedInReusedScene);
        }
        c8ym.selectSubscribe(assemViewModel, tbt, tbt2, c56412MCa2, null, interfaceC88473Ynt);
    }

    public static InterfaceC222288nw LJIIL(AssemViewModel receiver, C8YM c8ym, C56412MCa config, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt subscriber, TBW prop1, TBW prop2) {
        InterfaceC222288nw LJIIJ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            config.LJFF = true;
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJIIJ = vmDispatcher.LJIIJ(actualLifecycleOwner, prop1, prop2, config, C8YX.LJLIL, interfaceC88472Yns, new AqS166S0200000_3(actualReceiverHolder, (InterfaceC212848Wy<C3C8>) subscriber, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) 24));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            config.LJFF = true;
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJIIJ = vmDispatcher2.LJIIJ(ownLifecycleOwner, prop1, prop2, config, LIZIZ(c8ym), interfaceC88472Yns, new AqS166S0200000_3(c8ym, (C8YM<C3C8>) subscriber, (InterfaceC88473Ynt<C3C8, Object, Object, C76800UCe>) 25));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3(receiver, 1605));
        return LJIIJ;
    }

    public static <RECEIVER extends C3C8, S extends C33Q, A, B, C> InterfaceC222288nw LJ(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C56412MCa<OSK<A, B, C>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        C213158Yd LJIIIZ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJIIIZ = vmDispatcher.LJIIIZ(actualLifecycleOwner, prop1, prop2, prop3, config, C8YY.LJLIL, interfaceC88472Yns, new IDqS182S0200000_3(actualReceiverHolder, subscriber, 4));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJIIIZ = vmDispatcher2.LJIIIZ(ownLifecycleOwner, prop1, prop2, prop3, config, LIZIZ(c8ym), interfaceC88472Yns, new IDqS182S0200000_3(c8ym, subscriber, 5));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1597));
        return LJIIIZ;
    }

    public static /* synthetic */ void LJIIJJI(C8YM c8ym, AssemViewModel assemViewModel, TBT tbt, TBW tbw, TBT tbt2, C56412MCa c56412MCa, InterfaceC88474Ynu interfaceC88474Ynu, int i) {
        C56412MCa c56412MCa2 = c56412MCa;
        if ((i & 8) != 0) {
            c56412MCa2 = C213688a4.LIZIZ(assemViewModel.usedInReusedScene);
        }
        c8ym.selectSubscribe(assemViewModel, tbt, tbw, tbt2, c56412MCa2, null, interfaceC88474Ynu);
    }

    public static <RECEIVER extends C3C8, S extends C33Q, A, B, C, D> InterfaceC222288nw LJFF(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C56412MCa<OSL<A, B, C, D>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        C213158Yd LJIIJJI;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LJIIJJI = vmDispatcher.LJIIJJI(actualLifecycleOwner, prop1, prop2, prop3, prop4, config, C8YU.LJLIL, interfaceC88472Yns, new IDqS193S0200000_3(actualReceiverHolder, subscriber, 0));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LJIIJJI = vmDispatcher2.LJIIJJI(ownLifecycleOwner, prop1, prop2, prop3, prop4, config, LIZIZ(c8ym), interfaceC88472Yns, new IDqS193S0200000_3(c8ym, subscriber, 1));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1598));
        return LJIIJJI;
    }

    public static <RECEIVER extends C3C8, S extends C33Q, A, B, C, D, E> InterfaceC222288nw LJI(C8YM<RECEIVER> c8ym, AssemViewModel<S> receiver, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C56412MCa<OSM<A, B, C, D, E>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> subscriber) {
        C213158Yd LIZJ;
        o.LJIIIZ(receiver, "$receiver");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LIZ("default", C65352Pkq.LIZ(C88508YoS.class));
        if (receiver.usedInReusedScene) {
            InterfaceC212848Wy<RECEIVER> actualReceiverHolder = c8ym.getActualReceiverHolder();
            C8YR<S> vmDispatcher = receiver.getVmDispatcher();
            LifecycleOwner actualLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            C213688a4.LIZ(c8ym, config, receiver.usedInReusedScene, receiver.isHolderVM());
            LIZJ = vmDispatcher.LIZJ(actualLifecycleOwner, prop1, prop2, prop3, prop4, prop5, config, C8YV.LJLIL, interfaceC88472Yns, new C8YO(actualReceiverHolder, subscriber));
        } else {
            LifecycleOwner ownLifecycleOwner = c8ym.getOwnLifecycleOwner();
            if (ownLifecycleOwner == null || !receiver.useOwnerLifecycle) {
                ownLifecycleOwner = c8ym.getHostLifecycleOwner();
            }
            C8YR<S> vmDispatcher2 = receiver.getVmDispatcher();
            if (ownLifecycleOwner == null) {
                ownLifecycleOwner = c8ym.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            C213688a4.LIZ(c8ym, config, false, receiver.isHolderVM());
            LIZJ = vmDispatcher2.LIZJ(ownLifecycleOwner, prop1, prop2, prop3, prop4, prop5, config, LIZIZ(c8ym), interfaceC88472Yns, new C8YP(c8ym, subscriber));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88508YoS.class), "default", new AqS153S0100000_3((AssemViewModel) receiver, 1599));
        return LIZJ;
    }
}
