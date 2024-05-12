package com.bytedance.assem.arch.reused;

import X.C212428Vi;
import X.C213178Yf;
import X.C213198Yh;
import X.C214368bA;
import X.C221108m2;
import X.C33Q;
import X.C39557Ffl;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C73849Syb;
import X.C76800UCe;
import X.C8RL;
import X.C8V7;
import X.C8W0;
import X.C8X0;
import X.C8X3;
import X.C8X4;
import X.C8X7;
import X.C8X8;
import X.C8XE;
import X.C8XG;
import X.C8XK;
import X.C8YM;
import X.C8YN;
import X.C8YZ;
import X.InterfaceC212848Wy;
import X.InterfaceC212858Wz;
import X.InterfaceC222288nw;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QXX;
import X.TBW;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class ReusedAssem<RECEIVER extends C3C8> extends C8W0 implements C8YM<RECEIVER>, InterfaceC212848Wy<RECEIVER>, C3C8, C8YZ {
    public C8XE LJLJLJ;
    public boolean LJLL;
    public C8XK LJLLI;
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;
    public boolean LJLJI = true;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3((ReusedAssem) this, 30));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3((ReusedAssem) this, 31));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3((ReusedAssem) this, 32));
    public final C8XG LJLJL = new C8XG();
    public final CopyOnWriteArraySet<InterfaceC212858Wz<?, ?>> LJLJLLL = new CopyOnWriteArraySet<>();
    public QXX LJLLILLLL = C8X8.LJLIL;

    public abstract void E3();

    public void F3() {
    }

    @Override // X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC212848Wy
    public final RECEIVER getActualReceiver() {
        return this;
    }

    @Override // X.C8YM
    public final RECEIVER getReceiverForHostVM() {
        return this;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void A3() {
        CopyOnWriteArraySet<InterfaceC212858Wz<?, ?>> copyOnWriteArraySet = this.LJLJLLL;
        if (copyOnWriteArraySet != null) {
            Iterator<InterfaceC212858Wz<?, ?>> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
    }

    public void H3() {
        if (!this.LJLIL) {
            C212428Vi.LJ(new AqS153S0100000_3((ReusedAssem) this, 33));
        }
    }

    @Override // X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        if (C214368bA.LJIJJ) {
            C8XK c8xk = this.LJLLI;
            if (c8xk != null) {
                return (C8YZ) c8xk.LJLJI.getValue();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C8XE c8xe = this.LJLJLJ;
        o.LJII(c8xe, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.LifecycleOwnerHolder");
        return c8xe;
    }

    @Override // X.C8YM
    public final InterfaceC212848Wy<RECEIVER> getActualReceiverHolder() {
        if (C214368bA.LJIJJ) {
            C8XK c8xk = this.LJLLI;
            if (c8xk != null) {
                return c8xk;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C8XE c8xe = this.LJLJLJ;
        o.LJII(c8xe, "null cannot be cast to non-null type com.bytedance.tiktok.proxy.ReceiverHolder<RECEIVER of com.bytedance.assem.arch.reused.ReusedAssem>");
        return c8xe;
    }

    @Override // X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return (LifecycleOwner) this.LJLJJI.getValue();
    }

    @Override // X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return (LifecycleOwner) this.LJLJJL.getValue();
    }

    @Override // X.C8W0
    public final void handleOnResume() {
        this._lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        onResume();
    }

    public final <T> T v3() {
        C8XE c8xe = this.LJLJLJ;
        if (c8xe != null) {
            return (T) c8xe.LJLIL;
        }
        return null;
    }

    public final LifecycleRegistry x3() {
        return (LifecycleRegistry) this.LJLJJLL.getValue();
    }

    @Override // X.C8W0
    public void onCreate() {
        super.onCreate();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // X.C8W0
    public void onDestroy() {
        super.onDestroy();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.C8W0
    public void onPause() {
        super.onPause();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @Override // X.C8W0
    public void onResume() {
        C73849Syb<C8X4> LJII;
        super.onResume();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        if (C214368bA.LJIJJ) {
            K3(true);
            return;
        }
        C8XE c8xe = this.LJLJLJ;
        if (c8xe == null || (LJII = c8xe.LJII()) == null) {
            return;
        }
        LJII.onNext(new C8X4(C8X3.HOSTRESUME, this));
    }

    @Override // X.C8W0
    public void onStart() {
        super.onStart();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @Override // X.C8W0
    public void onStop() {
        C73849Syb<C8X4> LJII;
        super.onStop();
        x3().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        C8XE c8xe = this.LJLJLJ;
        if (c8xe != null && (LJII = c8xe.LJII()) != null) {
            LJII.onNext(new C8X4(C8X3.HOSTSTOP, this));
        }
        if (C214368bA.LJIJJ) {
            I3(this, C8X3.HOSTSTOP, false, false, 6);
        }
    }

    public final void C3(InterfaceC88472Yns<? super ReusedAssem<?>, C76800UCe> interfaceC88472Yns) {
        List<C8W0> children = getChildren();
        if (children != null) {
            for (C8W0 c8w0 : children) {
                o.LJIIIZ(c8w0, "<this>");
                if ((c8w0 instanceof ReusedAssem) && c8w0 != null) {
                    interfaceC88472Yns.invoke(c8w0);
                }
            }
        }
    }

    public final void K3(boolean z) {
        if (this.LJLIL && x3().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            C8XK c8xk = this.LJLLI;
            if (c8xk != null) {
                ((LifecycleRegistry) c8xk.LJLJJI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
            I3(this, C8X3.HOSTRESUME, z, false, 4);
            return;
        }
        I3(this, C8X3.HOSTSTOP, false, false, 6);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LJIILL(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public static void I3(ReusedAssem reusedAssem, C8X3 c8x3, boolean z, boolean z2, int i) {
        Class cls;
        C8V7 c8v7;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        reusedAssem.getClass();
        o.LJIIIZ(c8x3, "case");
        Class<?> cls2 = reusedAssem.getClass();
        InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> interfaceC65350Pko = C214368bA.LIZJ;
        if (interfaceC65350Pko != null) {
            cls = C39557Ffl.LIZ(interfaceC65350Pko);
        } else {
            cls = null;
        }
        if (o.LJ(cls2, cls) && (c8v7 = C214368bA.LIZIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("toBindState  ");
            LIZ.append(reusedAssem);
            LIZ.append(", ");
            LIZ.append(c8x3);
            LIZ.append(", ");
            LIZ.append(reusedAssem.LJLLILLLL);
            LIZ.append(", ");
            LIZ.append(z);
            LIZ.append(", ");
            LIZ.append(z2);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        int i2 = C8X0.LIZ[c8x3.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    reusedAssem.LJLILLLLZI = true;
                }
            } else {
                C8XK c8xk = reusedAssem.LJLLI;
                if (c8xk != null) {
                    ((LifecycleRegistry) c8xk.LJLJJI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                }
            }
        } else {
            C8XK c8xk2 = reusedAssem.LJLLI;
            if (c8xk2 != null) {
                ((LifecycleRegistry) c8xk2.LJLJJI.getValue()).handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            }
            reusedAssem.LJLILLLLZI = true;
        }
        QXX qxx = reusedAssem.LJLLILLLL;
        QXX LLLII = qxx.LLLII(c8x3);
        reusedAssem.LJLLILLLL = LLLII;
        if ((o.LJ(LLLII, qxx) && !z2) || !o.LJ(reusedAssem.LJLLILLLL, C8X7.LJLIL)) {
            return;
        }
        if (z && !reusedAssem.LJLILLLLZI) {
            return;
        }
        reusedAssem.LJLILLLLZI = false;
        C8RL c8rl = (C8RL) reusedAssem.v3();
        if (c8rl == null) {
            return;
        }
        C212428Vi.LJ(new AqS150S0200000_3(reusedAssem, (ReusedAssem<C3C8>) c8rl, (C8RL) 74));
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LIZLLL(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super RECEIVER, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LJIILIIL(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super RECEIVER, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C8YN.LIZJ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super RECEIVER, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C8YN.LJ(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C8YN.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C8YN.LJI(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
