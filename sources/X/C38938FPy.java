package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.FPy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38938FPy extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public final /* synthetic */ C38935FPv LJLIL;
    public final /* synthetic */ Iterator LJLILLLLZI;
    public final /* synthetic */ C38937FPx LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38938FPy(C38935FPv c38935FPv, Iterator it, C38937FPx c38937FPx, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        super(1);
        this.LJLIL = c38935FPv;
        this.LJLILLLLZI = it;
        this.LJLJI = c38937FPx;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        if (this.LJLILLLLZI.hasNext()) {
            C38935FPv c38935FPv = this.LJLIL;
            Iterator it = this.LJLILLLLZI;
            C38937FPx c38937FPx = this.LJLJI;
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJJI;
            InterfaceC88472Yns interfaceC88472Yns2 = this.LJLJJL;
            c38935FPv.getClass();
            try {
                ((FQ4) it.next()).LIZ(interfaceC88472Yns, c38937FPx, new C38938FPy(c38935FPv, it, c38937FPx, interfaceC88472Yns, interfaceC88472Yns2));
            } catch (Exception e) {
                interfaceC88472Yns2.invoke(e);
            }
        } else {
            this.LJLJJL.invoke(throwable);
        }
        return C76800UCe.LIZ;
    }
}
