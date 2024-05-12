package X;

import com.google.gson.internal.b;

/* renamed from: X.1wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49401wm extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC07790Sh, InterfaceC24520xk, Integer, InterfaceC07790Sh> {
    public final /* synthetic */ boolean LJLIL = true;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C31431Lf LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C0UP LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49401wm(C31431Lf c31431Lf, C0UP c0up, boolean z, boolean z2) {
        super(3);
        this.LJLILLLLZI = z;
        this.LJLJI = c31431Lf;
        this.LJLJJI = z2;
        this.LJLJJL = c0up;
    }

    @Override // X.InterfaceC88473Ynt
    public final InterfaceC07790Sh invoke(InterfaceC07790Sh interfaceC07790Sh, InterfaceC24520xk interfaceC24520xk, Integer num) {
        C0UT c0ut;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        C111074Xn.LIZIZ(num, interfaceC07790Sh, "$this$composed", interfaceC24520xk2, 1478351300);
        C0SP LIZIZ = C08240Ua.LIZIZ(interfaceC24520xk2);
        interfaceC24520xk2.LJJIIJ(773894976);
        interfaceC24520xk2.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk2.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        if (LJIILL == C24500xi.LIZIZ) {
            LJIILL = new C35821as(C24610xt.LJII(MBB.INSTANCE, interfaceC24520xk2));
            interfaceC24520xk2.LJJIII(LJIILL);
        }
        interfaceC24520xk2.LJJIJIIJIL();
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJIILL).LJLIL;
        interfaceC24520xk2.LJJIJIIJIL();
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        InterfaceC07790Sh LJJII = b.LJJII(c1m1, false, new C49391wl(this.LJLILLLLZI, this.LJLIL, this.LJLJJI, this.LJLJI, interfaceC70422pa));
        if (this.LJLIL) {
            c0ut = C0UT.Vertical;
        } else {
            c0ut = C0UT.Horizontal;
        }
        boolean LIZJ = C08240Ua.LIZJ((EnumC23500w6) interfaceC24520xk2.LJIILLIIL(AnonymousClass057.LJIIJ), c0ut, this.LJLILLLLZI);
        C31431Lf c31431Lf = this.LJLJI;
        InterfaceC07790Sh LIZIZ2 = C08250Ub.LIZIZ(c1m1, c31431Lf, c0ut, LIZIZ, this.LJLJJI, LIZJ, this.LJLJJL, c31431Lf.LIZIZ);
        InterfaceC07790Sh LLLIIIL = V1B.LJLIIL(C0SK.LIZ(LJJII, c0ut), LIZIZ).LLLIIIL(LIZIZ2).LLLIIIL(new C49041wC(this.LJLJI, this.LJLILLLLZI, this.LJLIL, LIZIZ));
        interfaceC24520xk2.LJJIJIIJIL();
        return LLLIIIL;
    }
}
