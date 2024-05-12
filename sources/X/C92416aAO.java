package X;

import kotlin.jvm.internal.IDqS33S0300000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aAO, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92416aAO extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92416aAO(boolean z, String str, C1OH c1oh, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC65784Pro interfaceC65784Pro3) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = c1oh;
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJJL = interfaceC65784Pro2;
        this.LJLJJLL = interfaceC65784Pro3;
    }

    public final InterfaceC07790Sh invoke(InterfaceC07790Sh composed, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(composed, "$this$composed");
        interfaceC24520xk.LJJIIJ(-286680064);
        Object obj = this.LJLJI;
        interfaceC24520xk.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            interfaceC24520xk.LJJIII(obj);
        } else {
            obj = LJIILL;
        }
        interfaceC24520xk.LJJIJIIJIL();
        InterfaceC07790Sh LIZJ = C07720Sa.LIZJ(composed, (C1OH) obj, null, this.LJLIL, this.LJLILLLLZI, null, new IDqS33S0300000_31(this.LJLJJI, this.LJLJJL, this.LJLJJLL, 0), 16);
        interfaceC24520xk.LJJIJIIJIL();
        return LIZJ;
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        return invoke(interfaceC07790Sh, interfaceC24520xk, num.intValue());
    }
}
