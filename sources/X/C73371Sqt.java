package X;

import X.C33Q;
import Y.AfS61S0100000_9;
import Y.AfS64S0100000_12;
import Y.IDhS67S0200000_3;
import Y.IDhS96S0100000_3;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.jedi_vm.viewModel.LifecycleAwareObserver;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sqt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73371Sqt<S extends C33Q> implements C8YR<S> {
    public InterfaceC70422pa LIZ;
    public S LIZIZ;
    public final C73318Sq2 LIZJ = new C73318Sq2();
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, (C73371Sqt<C33Q>) 1219));

    public final InterfaceC73372Squ<S> LJIILIIL() {
        return (InterfaceC73372Squ) this.LIZLLL.getValue();
    }

    @Override // X.C8YR
    public final void LJIIZILJ() {
        this.LIZJ.LIZLLL();
    }

    public final AbstractC73672Svk<S> LJIIL() {
        return LJIILIIL().LIZIZ();
    }

    @Override // X.C8YR
    public final S getState() {
        return LJIILIIL().getState();
    }

    @Override // X.C8YR
    public final void LIZ(InterfaceC88472Yns<? super S, ? extends S> interfaceC88472Yns) {
        LJIILIIL().LIZ(interfaceC88472Yns);
    }

    @Override // X.C8YR
    public final void LIZLLL(InterfaceC70422pa interfaceC70422pa) {
        o.LJIIIZ(interfaceC70422pa, "<set-?>");
        this.LIZ = interfaceC70422pa;
    }

    @Override // X.C8YR
    public final void LJ(S s) {
        this.LIZIZ = s;
    }

    @Override // X.C8YR
    public final void LJI(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIIZ(reducer, "reducer");
        LJIILIIL().LIZJ(reducer);
    }

    @Override // X.C8YR
    public final void LJII(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        LJIILIIL().LIZLLL(block);
    }

    @Override // X.C8YR
    public final C213158Yd LIZIZ(LifecycleOwner lifecycleOwner, C56412MCa config, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns subscriber) {
        AbstractC73672Svk abstractC73672Svk;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        C73775SxP LJIILJJIL = LJIIL().LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, config.LIZJ, C73374Sqw.LIZIZ, config.LJI, interfaceC88472Yns, subscriber));
    }

    @Override // X.C8YR
    public final C213158Yd LJFF(TBW prop1, C56412MCa config, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns subscriber) {
        AbstractC73672Svk abstractC73672Svk;
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        C73775SxP LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new IDhS96S0100000_3(prop1, 4)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, interfaceC88472Yns, new AqS143S0200000_12(config, subscriber, 146)));
    }

    @Override // X.C8YR
    public final C213158Yd LJIIIIZZ(LifecycleOwner lifecycleOwner, TBW prop, C56412MCa config, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns2) {
        AbstractC73672Svk abstractC73672Svk;
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        C73775SxP LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new IDhS96S0100000_3(prop, 3)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, null, new AqS57S0400000_12(config, interfaceC65784Pro2, interfaceC88472Yns, interfaceC88472Yns2, 15)));
    }

    @Override // X.C8YR
    public final C213158Yd LJIIJ(LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, C56412MCa config, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr) {
        AbstractC73672Svk abstractC73672Svk;
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        C73775SxP LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new IDhS67S0200000_3(prop1, prop2, 1)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, interfaceC88472Yns, new AqS143S0200000_12(config, interfaceC88471Ynr, 147)));
    }

    public final InterfaceC92693kP LJIILJJIL(AbstractC73672Svk abstractC73672Svk, LifecycleOwner lifecycleOwner, boolean z, AbstractC73946T0k abstractC73946T0k, InterfaceC73396SrI interfaceC73396SrI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        InterfaceC88472Yns interfaceC88472Yns3 = interfaceC88472Yns;
        if (lifecycleOwner == null) {
            if (abstractC73946T0k != null) {
                abstractC73672Svk = abstractC73672Svk.LJJJ(abstractC73946T0k);
            }
            InterfaceC92693kP LJJJLIIL = abstractC73672Svk.LJJJLIIL(new AfS64S0100000_12(interfaceC88472Yns2, 136), new AfS61S0100000_9(interfaceC88472Yns3, 75));
            this.LIZJ.LIZ(LJJJLIIL);
            return LJJJLIIL;
        }
        if (abstractC73946T0k != null) {
            abstractC73672Svk = abstractC73672Svk.LJJJ(abstractC73946T0k);
        }
        boolean z2 = !z;
        if (interfaceC88472Yns3 == null) {
            interfaceC88472Yns3 = C73373Sqv.LJLIL;
        }
        LifecycleAwareObserver lifecycleAwareObserver = new LifecycleAwareObserver(lifecycleOwner, z2, false, interfaceC73396SrI, interfaceC88472Yns2, interfaceC88472Yns3, new AqS178S0100000_12(this, (C73371Sqt<C33Q>) 681));
        abstractC73672Svk.LIZ(lifecycleAwareObserver);
        this.LIZJ.LIZ(lifecycleAwareObserver);
        return lifecycleAwareObserver;
    }

    @Override // X.C8YR
    public final C213158Yd LJIIIZ(LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, C56412MCa config, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88473Ynt interfaceC88473Ynt) {
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        AbstractC73430Srq LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new OSN(prop1, prop2, prop3)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            LJIILJJIL = new C73421Srh(LJIILJJIL);
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(LJIILJJIL, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, interfaceC88472Yns, new AqS143S0200000_12(config, interfaceC88473Ynt, 148)));
    }

    @Override // X.C8YR
    public final C213158Yd LJIIJJI(LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, TBW prop4, C56412MCa config, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88474Ynu interfaceC88474Ynu) {
        AbstractC73672Svk abstractC73672Svk;
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        C73775SxP LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new OSP(prop1, prop2, prop3, prop4)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, interfaceC88472Yns, new AqS143S0200000_12(config, interfaceC88474Ynu, 149)));
    }

    @Override // X.C8YR
    public final C213158Yd LIZJ(LifecycleOwner lifecycleOwner, TBW prop1, TBW prop2, TBW prop3, TBW prop4, TBW prop5, C56412MCa config, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88475Ynv interfaceC88475Ynv) {
        AbstractC73672Svk abstractC73672Svk;
        AbstractC73946T0k abstractC73946T0k;
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(prop5, "prop5");
        o.LJIIIZ(config, "config");
        C73775SxP LJIILJJIL = LJIIL().LJJIFFI(new C113474cp(interfaceC65784Pro, config)).LJJIJL(new OSO(prop1, prop2, prop3, prop4, prop5)).LJIILJJIL(config.LIZIZ);
        if (config.LIZ) {
            abstractC73672Svk = new C73421Srh(LJIILJJIL);
        } else {
            abstractC73672Svk = LJIILJJIL;
        }
        Executor LIZ = C214368bA.LIZ();
        boolean z = config.LIZJ;
        InterfaceC73396SrI interfaceC73396SrI = config.LJI;
        if (config.LJFF) {
            abstractC73946T0k = new C73950T0o(LIZ);
        } else {
            abstractC73946T0k = C73374Sqw.LIZIZ;
        }
        return new C213158Yd(LJIILJJIL(abstractC73672Svk, lifecycleOwner, z, abstractC73946T0k, interfaceC73396SrI, interfaceC88472Yns, new AqS143S0200000_12(config, interfaceC88475Ynv, 145)));
    }
}
