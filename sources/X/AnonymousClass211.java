package X;

import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.211, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass211 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<Object, Integer> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C0QX LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<Float, Float, Boolean> LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, Boolean> LJLJJL;
    public final /* synthetic */ C0QL LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass211(IDqS416S0100000 iDqS416S0100000, boolean z, C0QX c0qx, C515920t c515920t, IDqS28S0300000 iDqS28S0300000, C0QL c0ql) {
        super(1);
        this.LJLIL = iDqS416S0100000;
        this.LJLILLLLZI = z;
        this.LJLJI = c0qx;
        this.LJLJJI = c515920t;
        this.LJLJJL = iDqS28S0300000;
        this.LJLJJLL = c0ql;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        InterfaceC88472Yns<Object, Integer> mapping = this.LJLIL;
        o.LJIIIZ(mapping, "mapping");
        semantics.LIZJ(C07230Qd.LJJII, mapping);
        if (this.LJLILLLLZI) {
            C0QX c0qx = this.LJLJI;
            o.LJIIIZ(c0qx, "<set-?>");
            C07260Qg.LJ.LIZ(semantics, C07260Qg.LIZ[6], c0qx);
        } else {
            C0QX c0qx2 = this.LJLJI;
            o.LJIIIZ(c0qx2, "<set-?>");
            C07260Qg.LIZLLL.LIZ(semantics, C07260Qg.LIZ[5], c0qx2);
        }
        InterfaceC88471Ynr<Float, Float, Boolean> interfaceC88471Ynr = this.LJLJJI;
        if (interfaceC88471Ynr != null) {
            semantics.LIZJ(C0QY.LIZLLL, new C0QK(null, interfaceC88471Ynr));
        }
        InterfaceC88472Yns<Integer, Boolean> interfaceC88472Yns = this.LJLJJL;
        if (interfaceC88472Yns != null) {
            semantics.LIZJ(C0QY.LJ, new C0QK(null, interfaceC88472Yns));
        }
        C0QL c0ql = this.LJLJJLL;
        o.LJIIIZ(c0ql, "<set-?>");
        C07260Qg.LJIIJ.LIZ(semantics, C07260Qg.LIZ[13], c0ql);
        return C76800UCe.LIZ;
    }
}
