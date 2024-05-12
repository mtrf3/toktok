package X;

import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1uJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47871uJ extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C07160Pw<S> LJLIL;
    public final /* synthetic */ S LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<C1IC<S>, C06600Ns> LJLJJI;
    public final /* synthetic */ C1IC<S> LJLJJL;
    public final /* synthetic */ InterfaceC88474Ynu<InterfaceC06520Nk, S, InterfaceC24520xk, Integer, C76800UCe> LJLJJLL;
    public final /* synthetic */ C48211ur<S> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C47871uJ(C07160Pw<S> c07160Pw, S s, int i, InterfaceC88472Yns<? super C1IC<S>, C06600Ns> interfaceC88472Yns, C1IC<S> c1ic, InterfaceC88474Ynu<? super InterfaceC06520Nk, ? super S, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88474Ynu, C48211ur<S> c48211ur) {
        super(2);
        this.LJLIL = c07160Pw;
        this.LJLILLLLZI = s;
        this.LJLJI = i;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = c1ic;
        this.LJLJJLL = interfaceC88474Ynu;
        this.LJLJL = c48211ur;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            InterfaceC88472Yns<C1IC<S>, C06600Ns> interfaceC88472Yns = this.LJLJJI;
            Object obj = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(-3687241);
            C06600Ns LJIILL = interfaceC24520xk2.LJIILL();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJIILL == c24490xh) {
                LJIILL = interfaceC88472Yns.invoke(obj);
                interfaceC24520xk2.LJJIII(LJIILL);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            C06600Ns c06600Ns = (C06600Ns) LJIILL;
            Boolean valueOf = Boolean.valueOf(o.LJ(this.LJLIL.LIZJ().LIZJ(), this.LJLILLLLZI));
            InterfaceC88472Yns<C1IC<S>, C06600Ns> interfaceC88472Yns2 = this.LJLJJI;
            Object obj2 = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(-3686930);
            boolean LJIJJ = interfaceC24520xk2.LJIJJ(valueOf);
            Object LJIILL2 = interfaceC24520xk2.LJIILL();
            if (LJIJJ || LJIILL2 == c24490xh) {
                LJIILL2 = interfaceC88472Yns2.invoke(obj2).LIZIZ;
                interfaceC24520xk2.LJJIII(LJIILL2);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            AbstractC06620Nu abstractC06620Nu = (AbstractC06620Nu) LJIILL2;
            S s = this.LJLILLLLZI;
            C07160Pw<S> c07160Pw = this.LJLIL;
            interfaceC24520xk2.LJJIIJ(-3687241);
            Object LJIILL3 = interfaceC24520xk2.LJIILL();
            if (LJIILL3 == c24490xh) {
                LJIILL3 = new C48071ud(o.LJ(s, c07160Pw.LIZLLL()));
                interfaceC24520xk2.LJJIII(LJIILL3);
            }
            interfaceC24520xk2.LJJIJIIJIL();
            C48071ud c48071ud = (C48071ud) LJIILL3;
            AbstractC06580Nq abstractC06580Nq = c06600Ns.LIZ;
            InterfaceC07790Sh LJJIIJ = C77412UZs.LJJIIJ(InterfaceC07790Sh.LJJJI, new IDqS425S0100000(c06600Ns, 1));
            c48071ud.LJLIL = o.LJ(this.LJLILLLLZI, this.LJLIL.LIZLLL());
            C06500Ni.LIZJ(this.LJLIL, new IDqS416S0100000((Object) this.LJLILLLLZI, (Object) 109), LJJIIJ.LLLIIIL(c48071ud), abstractC06580Nq, abstractC06620Nu, C1DJ.LJ(interfaceC24520xk2, -819913132, new C48021uY(this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJI, this.LJLJL)), interfaceC24520xk2, (this.LJLJI & 14) | 196608, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
