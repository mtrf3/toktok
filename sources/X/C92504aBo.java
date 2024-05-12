package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aBo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92504aBo extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C1OH LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92504aBo(boolean z, String str, C1OH c1oh, InterfaceC88472Yns interfaceC88472Yns, boolean z2) {
        super(3);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = c1oh;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = z2;
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
        InterfaceC07790Sh LIZJ = C07720Sa.LIZJ(composed, (C1OH) obj, null, this.LJLIL, this.LJLILLLLZI, null, new C92503aBn(this.LJLJJI, this.LJLJJL), 16);
        interfaceC24520xk.LJJIJIIJIL();
        return LIZJ;
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        return invoke(interfaceC07790Sh, interfaceC24520xk, num.intValue());
    }
}
