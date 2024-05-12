package X;

import X.C07160Pw;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS4S0100100;
import kotlin.jvm.internal.o;

/* renamed from: X.1IC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1IC<S> implements InterfaceC07150Pv<S> {
    public final C07160Pw<S> LIZ;
    public InterfaceC07760Se LIZIZ;
    public EnumC23500w6 LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final java.util.Map<S, InterfaceC24760y8<C23490w5>> LJ;
    public C07160Pw.a.C0000a LJFF;

    @Override // X.InterfaceC07150Pv
    public final S LIZIZ() {
        return this.LIZ.LIZJ().LIZIZ();
    }

    @Override // X.InterfaceC07150Pv
    public final S LIZJ() {
        return this.LIZ.LIZJ().LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long LJ(C1IC c1ic) {
        C23490w5 c23490w5;
        C07160Pw.a.C0000a c0000a = c1ic.LJFF;
        if (c0000a == null || (c23490w5 = (C23490w5) c0000a.getValue()) == null) {
            return ((C23490w5) c1ic.LIZLLL.getValue()).LIZ;
        }
        return c23490w5.LIZ;
    }

    public final boolean LJFF(int i) {
        if (i == 0) {
            return true;
        }
        if (i == 4 && this.LIZJ == EnumC23500w6.Ltr) {
            return true;
        }
        if (i == 5 && this.LIZJ == EnumC23500w6.Rtl) {
            return true;
        }
        return false;
    }

    public final boolean LJI(int i) {
        if (i != 1 && ((i != 4 || this.LIZJ != EnumC23500w6.Rtl) && (i != 5 || this.LIZJ != EnumC23500w6.Ltr))) {
            return false;
        }
        return true;
    }

    public static C1I9 LJII(C1IC c1ic, int i) {
        C41391jr LJJIJIIJI = C1JI.LJJIJIIJI(0.0f, 0.0f, new C23450w1(C07180Py.LIZ()), 3);
        C48131uj initialOffset = C48131uj.LJLIL;
        c1ic.getClass();
        o.LJIIIZ(initialOffset, "initialOffset");
        if (c1ic.LJFF(i)) {
            return C06670Nz.LJIIIZ(LJJIJIIJI, new IDqS416S0100000(new IDqS172S0200000(c1ic, (C1IC<Object>) initialOffset, (InterfaceC88472Yns<? super Integer, Integer>) 18), 110));
        }
        if (c1ic.LJI(i)) {
            return C06670Nz.LJIIIZ(LJJIJIIJI, new IDqS416S0100000(new IDqS172S0200000(c1ic, (C1IC<Object>) initialOffset, (InterfaceC88472Yns<? super Integer, Integer>) 19), 110));
        }
        if (i == 2) {
            return C06670Nz.LJIIJ(LJJIJIIJI, new IDqS172S0200000(c1ic, (C1IC<Object>) initialOffset, (InterfaceC88472Yns<? super Integer, Integer>) 20));
        }
        if (i == 3) {
            return C06670Nz.LJIIJ(LJJIJIIJI, new IDqS172S0200000(c1ic, (C1IC<Object>) initialOffset, (InterfaceC88472Yns<? super Integer, Integer>) 21));
        }
        return AbstractC06580Nq.LIZ;
    }

    public static C1IB LJIIIIZZ(C1IC c1ic, int i) {
        C41391jr LJJIJIIJI = C1JI.LJJIJIIJI(0.0f, 0.0f, new C23450w1(C07180Py.LIZ()), 3);
        C48161um targetOffset = C48161um.LJLIL;
        c1ic.getClass();
        o.LJIIIZ(targetOffset, "targetOffset");
        if (c1ic.LJFF(i)) {
            return C06670Nz.LJIIL(LJJIJIIJI, new IDqS416S0100000(new IDqS172S0200000(c1ic, (C1IC<Object>) targetOffset, (InterfaceC88472Yns<? super Integer, Integer>) 22), 112));
        }
        if (c1ic.LJI(i)) {
            return C06670Nz.LJIIL(LJJIJIIJI, new IDqS416S0100000(new IDqS172S0200000(c1ic, (C1IC<Object>) targetOffset, (InterfaceC88472Yns<? super Integer, Integer>) 13), 112));
        }
        if (i == 2) {
            return C06670Nz.LJIILIIL(LJJIJIIJI, new IDqS172S0200000(c1ic, (C1IC<Object>) targetOffset, (InterfaceC88472Yns<? super Integer, Integer>) 14));
        }
        if (i == 3) {
            return C06670Nz.LJIILIIL(LJJIJIIJI, new IDqS172S0200000(c1ic, (C1IC<Object>) targetOffset, (InterfaceC88472Yns<? super Integer, Integer>) 15));
        }
        return AbstractC06620Nu.LIZ;
    }

    @Override // X.InterfaceC07150Pv
    public final boolean LIZ(S s, S s2) {
        return C07140Pu.LIZ(this, s, s2);
    }

    /* renamed from: X.1IC$b */
    /* loaded from: classes.dex */
    public final class b extends AbstractC48141uk {
        public final C07160Pw<S>.a<C23490w5, C1JN> LJLIL;
        public final InterfaceC24760y8<InterfaceC06430Nb> LJLILLLLZI;
        public final /* synthetic */ C1IC<S> LJLJI;

        public b(C1IC c1ic, C07160Pw.a sizeAnimation, InterfaceC35811ar interfaceC35811ar) {
            o.LJIIIZ(sizeAnimation, "sizeAnimation");
            this.LJLJI = c1ic;
            this.LJLIL = sizeAnimation;
            this.LJLILLLLZI = interfaceC35811ar;
        }

        @Override // X.InterfaceC44951pb
        public final InterfaceC273515n LJIILL(InterfaceC44861pS receiver, InterfaceC39071g7 interfaceC39071g7, long j) {
            InterfaceC273515n LJJLIL;
            o.LJIIIZ(receiver, "$receiver");
            AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(j);
            C07160Pw.a.C0000a LIZ = this.LJLIL.LIZ(new IDqS172S0200000(this.LJLJI, this, 17), new IDqS416S0100000(this.LJLJI, 115));
            C1IC<S> c1ic = this.LJLJI;
            c1ic.LJFF = LIZ;
            LJJLIL = receiver.LJJLIL((int) (((C23490w5) LIZ.getValue()).LIZ >> 32), C23490w5.LIZIZ(((C23490w5) LIZ.getValue()).LIZ), C113554cx.LJJJLIIL(), new IDqS4S0100100(LJJJIL, c1ic.LIZIZ.q(C78996UzQ.LIZIZ(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI), ((C23490w5) LIZ.getValue()).LIZ, EnumC23500w6.Ltr), 1));
            return LJJLIL;
        }
    }

    public C1IC(C07160Pw<S> transition, InterfaceC07760Se contentAlignment, EnumC23500w6 layoutDirection) {
        o.LJIIIZ(transition, "transition");
        o.LJIIIZ(contentAlignment, "contentAlignment");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        this.LIZ = transition;
        this.LIZIZ = contentAlignment;
        this.LIZJ = layoutDirection;
        this.LIZLLL = C78966Uyw.LJJJIL(new C23490w5(0L));
        this.LJ = new LinkedHashMap();
    }

    public static final long LIZLLL(C1IC c1ic, long j, long j2) {
        return c1ic.LIZIZ.q(j, j2, EnumC23500w6.Ltr);
    }
}
