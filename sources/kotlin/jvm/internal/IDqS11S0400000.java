package kotlin.jvm.internal;

import X.AbstractC11740d8;
import X.AbstractC65781Prl;
import X.C07070Pn;
import X.C08350Ul;
import X.C111074Xn;
import X.C11850dJ;
import X.C15010iP;
import X.C17J;
import X.C18810oX;
import X.C1JX;
import X.C23U;
import X.C24340xS;
import X.C24380xW;
import X.C24400xY;
import X.C24500xi;
import X.C24570xp;
import X.C24610xt;
import X.C24780yA;
import X.C2FO;
import X.C32691Qb;
import X.C35931b3;
import X.C35991b9;
import X.C43991o3;
import X.C76800UCe;
import X.InterfaceC07790Sh;
import X.InterfaceC14950iJ;
import X.InterfaceC24350xT;
import X.InterfaceC24420xa;
import X.InterfaceC24520xk;
import X.InterfaceC35841au;
import X.InterfaceC88473Ynt;
import android.os.Trace;
import com.google.android.play.core.assetpacks.r2;
import java.util.List;

/* loaded from: classes.dex */
public class IDqS11S0400000 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS11S0400000 iDqS11S0400000, Object obj, Object obj2, Object obj3) {
        Object obj4;
        InterfaceC07790Sh interfaceC07790Sh = (InterfaceC07790Sh) obj;
        InterfaceC24520xk interfaceC24520xk = (InterfaceC24520xk) obj2;
        C111074Xn.LIZIZ((Number) obj3, interfaceC07790Sh, "$this$composed", interfaceC24520xk, 1634330012);
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = C17J.LIZIZ(1.0f);
            interfaceC24520xk.LJJIII(LJIILL);
        }
        interfaceC24520xk.LJJIJIIJIL();
        C07070Pn c07070Pn = (C07070Pn) LJIILL;
        AbstractC11740d8 abstractC11740d8 = (AbstractC11740d8) iDqS11S0400000.l0;
        boolean z = true;
        if ((abstractC11740d8 instanceof C32691Qb) && ((C32691Qb) abstractC11740d8).LIZIZ == C11850dJ.LJI) {
            z = false;
        }
        if (((C18810oX) iDqS11S0400000.l1).LIZIZ() && C08350Ul.LIZIZ(((C15010iP) iDqS11S0400000.l2).LIZIZ) && z) {
            C15010iP c15010iP = (C15010iP) iDqS11S0400000.l2;
            C24610xt.LIZLLL(c15010iP.LIZ, new C08350Ul(c15010iP.LIZIZ), new C2FO(c07070Pn, null), interfaceC24520xk);
            obj4 = r2.LJIIIIZZ(interfaceC07790Sh, new C23U(c07070Pn, (InterfaceC14950iJ) iDqS11S0400000.l3, (C15010iP) iDqS11S0400000.l2, (C18810oX) iDqS11S0400000.l1, (AbstractC11740d8) iDqS11S0400000.l0));
        } else {
            obj4 = InterfaceC07790Sh.LJJJI;
        }
        interfaceC24520xk.LJJIJIIJIL();
        return obj4;
    }

    public static final Object invoke$1(IDqS11S0400000 iDqS11S0400000, Object obj, Object obj2, Object obj3) {
        C35991b9 c35991b9;
        C24570xp c24570xp = (C24570xp) obj2;
        C1JX.LJIIIZ((InterfaceC24420xa) obj, "<anonymous parameter 0>", c24570xp, "slots", (InterfaceC24350xT) obj3, "<anonymous parameter 2>");
        C24340xS c24340xS = (C24340xS) iDqS11S0400000.l0;
        C35931b3 c35931b3 = (C35931b3) iDqS11S0400000.l1;
        C24380xW c24380xW = (C24380xW) iDqS11S0400000.l2;
        C24380xW c24380xW2 = (C24380xW) iDqS11S0400000.l3;
        Trace.beginSection("composeChange:movableContentStateResolve");
        if (c24340xS == null) {
            try {
                c24340xS = c35931b3.LIZJ.LJIIJ(c24380xW);
                if (c24340xS == null) {
                    C24780yA.LIZJ("Could not resolve state for movable content");
                    throw null;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        List LJJI = c24570xp.LJJI(c24340xS.LIZ);
        if (!LJJI.isEmpty()) {
            InterfaceC35841au interfaceC35841au = c24380xW2.LIZJ;
            o.LJII(interfaceC35841au, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C43991o3 c43991o3 = (C43991o3) interfaceC35841au;
            int size = LJJI.size();
            for (int i = 0; i < size; i++) {
                C24400xY anchor = (C24400xY) LJJI.get(i);
                o.LJIIIZ(anchor, "anchor");
                Object LJJIL = c24570xp.LJJIL(c24570xp.LIZJ(anchor), 0);
                if (LJJIL instanceof C35991b9) {
                    c35991b9 = (C35991b9) LJJIL;
                } else {
                    c35991b9 = null;
                }
                if (c35991b9 != null) {
                    c35991b9.LIZIZ = c43991o3;
                }
            }
        }
        Trace.endSection();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0400000(AbstractC11740d8 abstractC11740d8, C18810oX c18810oX, C15010iP c15010iP, InterfaceC14950iJ interfaceC14950iJ, int i) {
        super(3);
        this.$t = i;
        this.l0 = abstractC11740d8;
        this.l1 = c18810oX;
        this.l2 = c15010iP;
        this.l3 = interfaceC14950iJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS11S0400000(C24340xS c24340xS, C35931b3 c35931b3, C24380xW c24380xW, C24380xW c24380xW2, int i) {
        super(3);
        this.$t = i;
        this.l0 = c24340xS;
        this.l1 = c35931b3;
        this.l2 = c24380xW;
        this.l3 = c24380xW2;
    }
}
