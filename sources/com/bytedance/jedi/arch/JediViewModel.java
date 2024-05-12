package com.bytedance.jedi.arch;

import X.AbstractC26082ALm;
import X.AbstractC73547Stj;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.AbstractC73946T0k;
import X.C157166Eu;
import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C72816Shw;
import X.C73137Sn7;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73162SnW;
import X.C73164SnY;
import X.C73165SnZ;
import X.C73167Snb;
import X.C73168Snc;
import X.C73269SpF;
import X.C73318Sq2;
import X.C73421Srh;
import X.C73461SsL;
import X.C73775SxP;
import X.C76800UCe;
import X.CallableC73166Sna;
import X.InterfaceC61312at;
import X.InterfaceC65784Pro;
import X.InterfaceC72817Shx;
import X.InterfaceC73163SnX;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC92693kP;
import X.MJ4;
import X.TBT;
import X.TBW;
import X.TMC;
import X.TMF;
import X.TMG;
import X.W1T;
import X.X1D;
import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import Y.IDhS105S0100000_12;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.internal.LifecycleAwareObserver;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0500000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class JediViewModel<S extends InterfaceC61312at> extends ViewModel {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJL;
    public S LJLILLLLZI;
    public final C5H3 LJLIL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 75));
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public final InterfaceC72817Shx LJLJJI = new C72816Shw();

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(JediViewModel.class), "storeOwner", "getStoreOwner()Lcom/bytedance/jedi/arch/internal/StoreOwner;");
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    public static /* synthetic */ void Dv0() {
    }

    private final C73162SnW<S> mv0() {
        return (C73162SnW) this.LJLIL.getValue();
    }

    public abstract S kv0();

    public void onStart() {
    }

    public final InterfaceC73163SnX<S> jv0() {
        S s = this.LJLILLLLZI;
        if (s != null) {
            return C73269SpF.LIZ.invoke(this, s);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot visit store before ViewModel(");
        LIZ.append(getClass());
        LIZ.append(") is initialized");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.LJLJI.LIZLLL();
    }

    public final S lv0() {
        return mv0().getState();
    }

    public final AbstractC73672Svk<S> nv0() {
        return mv0().LIZIZ();
    }

    public final void Bv0(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIJ(reducer, "reducer");
        mv0().LIZJ(reducer);
    }

    public final void Cv0(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIJ(reducer, "reducer");
        mv0().LIZLLL(reducer);
    }

    public final void Gv0(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIJ(block, "block");
        mv0().LJ(block);
    }

    public final InterfaceC92693kP disposeOnClear(InterfaceC92693kP disposeOnClear) {
        o.LJIIJ(disposeOnClear, "$this$disposeOnClear");
        this.LJLJI.LIZ(disposeOnClear);
        return disposeOnClear;
    }

    public final <PROP, MW extends C73139Sn9<S, PROP>> void iv0(MW middleware) {
        o.LJIIJ(middleware, "middleware");
        C73318Sq2 disposables = this.LJLJI;
        o.LJIIJ(disposables, "disposables");
        middleware.LJLIL = disposables;
        middleware.LJLILLLLZI = this;
    }

    public final void ov0(InterfaceC88472Yns<? super S, ? extends S> argsAcceptor) {
        o.LJIIJ(argsAcceptor, "argsAcceptor");
        if (this.LJLILLLLZI == null) {
            this.LJLILLLLZI = argsAcceptor.invoke(kv0());
            onStart();
        }
    }

    public final void setState(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIJ(reducer, "reducer");
        Cv0(reducer);
    }

    public final void setStateImmediate(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIJ(reducer, "reducer");
        Bv0(reducer);
    }

    public final void withState(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIJ(block, "block");
        Gv0(block);
    }

    public final void withStateImmediate(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIJ(block, "block");
        block.invoke(lv0());
    }

    public final InterfaceC92693kP Ev0(C73165SnZ<S> config, InterfaceC88472Yns<? super S, C76800UCe> subscriber) {
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIJIIJIL(this, null, config, subscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC92693kP execute(AbstractC73638SvC<T> execute, InterfaceC88471Ynr<? super S, ? super AbstractC26082ALm<? extends T>, ? extends S> stateReducer) {
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(stateReducer, "stateReducer");
        AbstractC73672Svk<T> LJJIIJZLJL = execute.LJJIIJZLJL();
        o.LJFF(LJJIIJZLJL, "toObservable()");
        return execute(LJJIIJZLJL, C73167Snb.LJLIL, stateReducer);
    }

    public final InterfaceC92693kP execute(AbstractC73547Stj execute, InterfaceC88471Ynr<? super S, ? super AbstractC26082ALm<C76800UCe>, ? extends S> stateReducer) {
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(stateReducer, "stateReducer");
        return execute(new C73461SsL(execute, CallableC73166Sna.LJLIL, null), stateReducer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC92693kP execute(AbstractC73672Svk<T> execute, InterfaceC88471Ynr<? super S, ? super AbstractC26082ALm<? extends T>, ? extends S> stateReducer) {
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(stateReducer, "stateReducer");
        return execute(execute, MJ4.LJLIL, stateReducer);
    }

    public final <T, V> InterfaceC92693kP execute(AbstractC73672Svk<T> execute, InterfaceC88472Yns<? super T, ? extends V> mapper, InterfaceC88471Ynr<? super S, ? super AbstractC26082ALm<? extends V>, ? extends S> stateReducer) {
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(mapper, "mapper");
        o.LJIIJ(stateReducer, "stateReducer");
        setState(new AqS178S0100000_12((InterfaceC88471Ynr) stateReducer, 87));
        InterfaceC92693kP LJJJJZI = execute.LJJIJL(new IDhS105S0100000_12(mapper, 3)).LJJJJ(C73137Sn7.LJLIL).LJJJJZI(new AfS61S0200000_12(this, stateReducer, 0));
        disposeOnClear(LJJJJZI);
        return LJJJJZI;
    }

    public final <A> InterfaceC92693kP rv0(TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88472Yns<? super A, C76800UCe> subscriber) {
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIIJZLJL(config, this, null, prop1, subscriber);
    }

    public final <T, V> InterfaceC92693kP execute(AbstractC73638SvC<T> execute, InterfaceC88472Yns<? super T, ? extends V> mapper, InterfaceC88471Ynr<? super S, ? super AbstractC26082ALm<? extends V>, ? extends S> stateReducer) {
        o.LJIIJ(execute, "$this$execute");
        o.LJIIJ(mapper, "mapper");
        o.LJIIJ(stateReducer, "stateReducer");
        AbstractC73672Svk<T> LJJIIJZLJL = execute.LJJIIJZLJL();
        o.LJFF(LJJIIJZLJL, "toObservable()");
        return execute(LJJIIJZLJL, mapper, stateReducer);
    }

    public final <A, B> InterfaceC92693kP sv0(TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88471Ynr<? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIIZ(config, this, null, prop1, prop2, subscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP Fv0(JediViewModel jediViewModel, C73165SnZ c73165SnZ, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.Ev0(c73165SnZ, interfaceC88472Yns);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
    }

    public final <T> InterfaceC92693kP gv0(TBW<S, ? extends AbstractC26082ALm<? extends T>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2) {
        AbstractC73672Svk<T> abstractC73672Svk;
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(config, "config");
        C73775SxP LJIILJJIL = nv0().LJJIJL(new C73164SnY(prop1, interfaceC65784Pro, interfaceC88472Yns, interfaceC88472Yns2)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh<>(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        return pv0(abstractC73672Svk, null, config.LJ, config.LIZJ, config.LJFF, new AqS16S0500000_12(config, this, null, prop1, interfaceC65784Pro, interfaceC88472Yns, interfaceC88472Yns2, 4));
    }

    public final <A, B, C> InterfaceC92693kP tv0(TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88473Ynt<? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIIZI(config, this, null, prop1, prop2, prop3, subscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP wv0(JediViewModel jediViewModel, TBW tbw, C73165SnZ c73165SnZ, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.rv0(tbw, c73165SnZ, interfaceC88472Yns);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public final <T> InterfaceC92693kP pv0(AbstractC73672Svk<T> source, LifecycleOwner lifecycleOwner, boolean z, boolean z2, AbstractC73946T0k abstractC73946T0k, InterfaceC88472Yns<? super T, C76800UCe> subscriber) {
        o.LJIIJ(source, "source");
        o.LJIIJ(subscriber, "subscriber");
        if (lifecycleOwner == null) {
            if (abstractC73946T0k != null) {
                source = source.LJJJ(abstractC73946T0k);
            }
            InterfaceC92693kP LJJJJZI = source.LJJJJZI(new AfS64S0100000_12((InterfaceC88472Yns) subscriber, 14));
            disposeOnClear(LJJJJZI);
            return LJJJJZI;
        }
        if (abstractC73946T0k != null) {
            source = source.LJJJ(abstractC73946T0k);
        }
        LifecycleAwareObserver lifecycleAwareObserver = new LifecycleAwareObserver(lifecycleOwner, !z, z2, subscriber);
        source.LIZ(lifecycleAwareObserver);
        disposeOnClear(lifecycleAwareObserver);
        return lifecycleAwareObserver;
    }

    public final <A, B, C, D> InterfaceC92693kP uv0(TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88474Ynu<? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIJ(config, this, null, prop1, prop2, prop3, prop4, subscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP xv0(JediViewModel jediViewModel, TBW tbw, TBW tbw2, C73165SnZ c73165SnZ, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.sv0(tbw, tbw2, c73165SnZ, interfaceC88471Ynr);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public final <A, B, C, D, E> InterfaceC92693kP vv0(TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C73165SnZ<TMF> config, InterfaceC88475Ynv<? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> subscriber) {
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(prop5, "prop5");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return TMC.LJJIJIIJI(config, this, null, prop1, prop2, prop3, prop4, prop5, subscriber);
    }

    public static InterfaceC92693kP hv0(JediViewModel jediViewModel, TBW tbw, C73165SnZ c73165SnZ, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        C73165SnZ c73165SnZ2 = c73165SnZ;
        InterfaceC88472Yns interfaceC88472Yns3 = interfaceC88472Yns;
        if (obj == null) {
            if ((i & 2) != 0) {
                c73165SnZ2 = new C73165SnZ();
            }
            InterfaceC88472Yns interfaceC88472Yns4 = null;
            if ((i & 4) != 0) {
                interfaceC88472Yns3 = null;
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro2 = null;
            }
            if ((i & 16) == 0) {
                interfaceC88472Yns4 = interfaceC88472Yns2;
            }
            return jediViewModel.gv0(tbw, c73165SnZ2, interfaceC88472Yns3, interfaceC65784Pro2, interfaceC88472Yns4);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP yv0(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, C73165SnZ c73165SnZ, InterfaceC88473Ynt interfaceC88473Ynt, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.tv0(tbw, tbw2, tbw3, c73165SnZ, interfaceC88473Ynt);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public static InterfaceC92693kP qv0(JediViewModel jediViewModel, AbstractC73672Svk abstractC73672Svk, LifecycleOwner lifecycleOwner, boolean z, boolean z2, AbstractC73946T0k abstractC73946T0k, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                abstractC73946T0k = C73168Snc.LIZIZ;
            }
            return jediViewModel.pv0(abstractC73672Svk, lifecycleOwner, z, z2, abstractC73946T0k, interfaceC88472Yns);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lifecycleAwareSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP zv0(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, C73165SnZ c73165SnZ, InterfaceC88474Ynu interfaceC88474Ynu, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.uv0(tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88474Ynu);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC92693kP Av0(JediViewModel jediViewModel, TBW tbw, TBW tbw2, TBW tbw3, TBW tbw4, TBW tbw5, C73165SnZ c73165SnZ, InterfaceC88475Ynv interfaceC88475Ynv, int i, Object obj) {
        if (obj == null) {
            if ((i & 32) != 0) {
                c73165SnZ = new C73165SnZ();
            }
            return jediViewModel.vv0(tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88475Ynv);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }
}
