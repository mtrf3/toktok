package X;

import Y.AfS64S0100000_12;
import Y.IDaS221S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Ste */
/* loaded from: classes13.dex */
public final class C73542Ste {
    public static final C53784L8y LIZ = C53784L8y.LJLIL;
    public static final C106854Hh LIZIZ = C106854Hh.LJLIL;
    public static final ST1 LIZJ = ST1.LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS64S0100000_12] */
    public static final <T> InterfaceC64592gB<T> LIZ(InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns) {
        if (interfaceC88472Yns == LIZ) {
            return C73674Svm.LIZLLL;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns = new AfS64S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 118);
        }
        return (InterfaceC64592gB) interfaceC88472Yns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.IDaS221S0100000_12] */
    public static final InterfaceC29937Boz LIZIZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (interfaceC65784Pro == LIZJ) {
            return C73674Svm.LIZJ;
        }
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro = new IDaS221S0100000_12(interfaceC65784Pro, 2);
        }
        return (InterfaceC29937Boz) interfaceC65784Pro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y.AfS64S0100000_12] */
    public static final InterfaceC64592gB<Throwable> LIZJ(InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns) {
        if (interfaceC88472Yns == LIZIZ) {
            return C73674Svm.LJFF;
        }
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns = new AfS64S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 118);
        }
        return (InterfaceC64592gB) interfaceC88472Yns;
    }

    public static final C73495Sst LIZLLL(AbstractC73638SvC abstractC73638SvC, InterfaceC88472Yns onError, InterfaceC88472Yns onSuccess) {
        o.LJIIJ(onError, "onError");
        o.LJIIJ(onSuccess, "onSuccess");
        return (C73495Sst) abstractC73638SvC.LJJII(LIZ(onSuccess), LIZJ(onError));
    }

    public static final InterfaceC92693kP LJI(AbstractC73547Stj abstractC73547Stj, InterfaceC88472Yns<? super Throwable, C76800UCe> onError, InterfaceC65784Pro<C76800UCe> onComplete) {
        o.LJIIJ(onError, "onError");
        o.LJIIJ(onComplete, "onComplete");
        C106854Hh c106854Hh = LIZIZ;
        if (onError == c106854Hh && onComplete == LIZJ) {
            return abstractC73547Stj.LJIIJJI();
        }
        if (onError == c106854Hh) {
            return abstractC73547Stj.LJIIIZ(new IDaS221S0100000_12(onComplete, 2));
        }
        return abstractC73547Stj.LJIIJ(new AfS64S0100000_12((InterfaceC88472Yns) onError, 118), LIZIZ(onComplete));
    }

    public static final C73411SrX LJ(AbstractC73672Svk receiver, InterfaceC88472Yns onError, InterfaceC65784Pro onComplete, InterfaceC88472Yns onNext) {
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(onError, "onError");
        o.LJIIJ(onComplete, "onComplete");
        o.LJIIJ(onNext, "onNext");
        return (C73411SrX) receiver.LJJJLL(LIZ(onNext), LIZJ(onError), LIZIZ(onComplete));
    }

    public static final C73514StC LJFF(C73608Sui c73608Sui, InterfaceC88472Yns onError, InterfaceC65784Pro onComplete, InterfaceC88472Yns onSuccess) {
        o.LJIIJ(onError, "onError");
        o.LJIIJ(onComplete, "onComplete");
        o.LJIIJ(onSuccess, "onSuccess");
        return (C73514StC) c73608Sui.LJIJ(LIZ(onSuccess), LIZJ(onError), LIZIZ(onComplete));
    }

    public static /* bridge */ /* synthetic */ C73495Sst LJII(AbstractC73638SvC abstractC73638SvC, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        if ((i & 1) != 0) {
            interfaceC88472Yns = LIZIZ;
        }
        if ((i & 2) != 0) {
            interfaceC88472Yns2 = LIZ;
        }
        return LIZLLL(abstractC73638SvC, interfaceC88472Yns, interfaceC88472Yns2);
    }

    public static /* bridge */ /* synthetic */ C73411SrX LJIIIIZZ(AbstractC73672Svk abstractC73672Svk, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i) {
        if ((i & 1) != 0) {
            interfaceC88472Yns = LIZIZ;
        }
        if ((i & 2) != 0) {
            interfaceC65784Pro = LIZJ;
        }
        if ((i & 4) != 0) {
            interfaceC88472Yns2 = LIZ;
        }
        return LJ(abstractC73672Svk, interfaceC88472Yns, interfaceC65784Pro, interfaceC88472Yns2);
    }
}
