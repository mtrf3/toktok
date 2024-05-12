package com.bytedance.ext_power_list;

import X.C212548Vu;
import X.C212888Xc;
import X.C212898Xd;
import X.C212918Xf;
import X.C212928Xg;
import X.C212938Xh;
import X.C212988Xm;
import X.C214368bA;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C88505YoP;
import X.C88507YoR;
import X.C8RL;
import X.C8V7;
import X.C8VZ;
import X.C8X3;
import X.C8XE;
import X.C8XN;
import X.C8XO;
import X.C8XV;
import X.C8XZ;
import X.InterfaceC212878Xb;
import X.InterfaceC212978Xl;
import X.InterfaceC212998Xn;
import X.InterfaceC214448bI;
import X.InterfaceC55235Lm3;
import X.SZE;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS67S0201000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AssemReusedContainer<R extends InterfaceC212998Xn<R, ITEM>, ITEM extends C8RL> implements C8XZ<R, ITEM> {
    public final InterfaceC212878Xb<? extends InterfaceC212998Xn<?, ?>, ? extends C8RL> LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public C212988Xm<R, ITEM> LJLJL;
    public C8VZ LJLJLJ;
    public ReusedUIAssem<?> LJLJLLL;
    public final ViewModelStore LJLL;
    public boolean LJLLI;

    @Override // X.InterfaceC55100Ljs
    public InterfaceC55235Lm3 getParentScope() {
        return null;
    }

    private final void LJLI() {
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryObserveLifecycle: ");
            LIZ.append(this);
            LIZ.append(", ");
            LifecycleOwner LJJLI = LJJLI();
            if (LJJLI != null) {
                lifecycle2 = LJJLI.getLifecycle();
            } else {
                lifecycle2 = null;
            }
            LIZ.append(lifecycle2);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        if (!this.LJLLI) {
            LifecycleOwner LJJLI2 = LJJLI();
            if (LJJLI2 != null && (lifecycle = LJJLI2.getLifecycle()) != null) {
                lifecycle.addObserver(this);
            }
            this.LJLLI = true;
        }
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LJLJJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJLIIIL() {
        C8XO c8xo;
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unReusedBind: ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        ReusedUIAssem<?> reusedUIAssem = LP().LIZ;
        if (reusedUIAssem != 0) {
            C8XE c8xe = reusedUIAssem.LJLJLJ;
            if (c8xe != null) {
                c8xe.LJIIL();
            }
            if (C214368bA.LJIJJ) {
                ReusedAssem.I3(reusedUIAssem, C8X3.HOSTDETACH, false, false, 6);
                if ((reusedUIAssem instanceof C8XO) && (c8xo = (C8XO) reusedUIAssem) != null) {
                    c8xo.unBind();
                }
                reusedUIAssem.C3(C8XV.LJLIL);
            }
        }
    }

    @Override // X.C8XZ
    public final AssemReusedDispatcher<R, ITEM> LP() {
        return (AssemReusedDispatcher) this.LJLJJLL.getValue();
    }

    @Override // X.C8VZ
    public final InterfaceC214448bI cq0() {
        return (InterfaceC214448bI) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC55100Ljs
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return (ViewModelStoreOwner) this.LJLJI.getValue();
    }

    public LifecycleOwner LJJLI() {
        return GW();
    }

    @Override // X.InterfaceC212998Xn
    public final InterfaceC212978Xl<R, ITEM> getChild() {
        LP().getClass();
        return new C8XN();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final void LJJLIIIJL() {
        LJLI();
    }

    @Override // X.C8XZ
    public final ViewModelStore Yb() {
        return this.LJLL;
    }

    @Override // X.C8XZ
    public ReusedUIAssem<?> Yz() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC212998Xn
    public final C212988Xm<R, ITEM> getProxy() {
        return this.LJLJL;
    }

    public AssemReusedContainer(InterfaceC212878Xb<? extends InterfaceC212998Xn<?, ?>, ? extends C8RL> proxyer) {
        o.LJIIIZ(proxyer, "proxyer");
        this.LJLIL = proxyer;
        this.LJLILLLLZI = C221108m2.LIZIZ(C212928Xg.LJLIL);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3((AssemReusedContainer) this, 61));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3((AssemReusedContainer) this, 60));
        this.LJLJJL = C221108m2.LIZIZ(C212938Xh.LJLIL);
        this.LJLJJLL = C221108m2.LIZIZ(C212918Xf.LJLIL);
        AssemReusedDispatcher<R, ITEM> LP = LP();
        Lifecycle lifecycle = getLifecycle();
        LP.getClass();
        o.LJIIIZ(lifecycle, "lifecycle");
        lifecycle.addObserver(LP.LIZIZ);
        this.LJLL = new ViewModelStore();
    }

    public void LJL(ReusedUIAssem<?> reusedUIAssem) {
        this.LJLJLLL = reusedUIAssem;
    }

    @Override // X.InterfaceC212998Xn
    public final void setProxy(C212988Xm<R, ITEM> c212988Xm) {
        this.LJLJL = c212988Xm;
    }

    public void LJJZ(int i, ITEM item) {
        if (item == null) {
            return;
        }
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReusedBind: ");
            LIZ.append(this);
            LIZ.append(", ");
            LIZ.append(i);
            LIZ.append(", ");
            LIZ.append(item);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        SZE.LJ(C65352Pkq.LIZ(C88505YoP.class), new C212888Xc(item), new AqS67S0201000_3((AssemReusedContainer) this, (AssemReusedContainer<InterfaceC212998Xn<Object, Object>, C8RL>) item, (C8RL) i, 2));
        LJLI();
        SZE.LJ(C65352Pkq.LIZ(C88507YoR.class), new C212898Xd(item), new AqS150S0200000_3((AssemReusedContainer) this, (AssemReusedContainer<InterfaceC212998Xn<Object, Object>, C8RL>) item, (C8RL) 101));
    }

    public final void LJJZZIII(int i, VideoItemParams videoItemParams) {
        if (videoItemParams == null) {
            return;
        }
        SZE.LJ(C65352Pkq.LIZ(C88505YoP.class), new C212888Xc(videoItemParams), new AqS67S0201000_3((AssemReusedContainer) this, (AssemReusedContainer<InterfaceC212998Xn<Object, Object>, C8RL>) videoItemParams, (C8RL) i, 2));
        LJLI();
        SZE.LJ(C65352Pkq.LIZ(C88507YoR.class), new C212898Xd(videoItemParams), new AqS150S0200000_3((AssemReusedContainer) this, (AssemReusedContainer<InterfaceC212998Xn<Object, Object>, C8RL>) videoItemParams, (C8RL) 101));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl;
        Lifecycle lifecycle;
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStateChanged: ");
            LIZ.append(event);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        int i = C212548Vu.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                        int i2 = C212548Vu.LIZIZ[getLifecycle().getCurrentState().ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2 || i2 == 3) {
                                getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                            }
                        } else {
                            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                        }
                        this.LJLL.clear();
                        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                        LifecycleOwner LJJLI = LJJLI();
                        if (LJJLI != null && (lifecycle = LJJLI.getLifecycle()) != null) {
                            lifecycle.removeObserver(this);
                        }
                        C212988Xm<R, ITEM> c212988Xm = this.LJLJL;
                        if (c212988Xm == null || (interfaceC212978Xl = c212988Xm.LIZIZ) == null) {
                            return;
                        }
                        interfaceC212978Xl.LJ(false);
                        return;
                    }
                    getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                    return;
                }
                getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                return;
            }
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public final void LJJLL(ReusedUIAssem<?> assem, View containerView, C8VZ component) {
        o.LJIIIZ(assem, "assem");
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(component, "component");
        this.LJLJLJ = component;
        LJL(assem);
        LP().LIZ(this, assem, containerView, this, component);
    }
}
