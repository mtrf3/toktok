package X;

import X.InterfaceC57357MfB;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGR<D extends InterfaceC57357MfB> {
    public final XGL LIZ;
    public final InterfaceC84562XGs<D> LIZIZ;
    public XH8 LIZJ;

    public final InterfaceC65462ha<XGX<D>> LIZIZ() {
        XGS xgs = new XGS(this.LIZ, this.LIZIZ, this.LIZJ);
        XGL xgl = xgs.LJLJI;
        XGS xgs2 = new XGS(xgl, xgs.LJLIL, xgs.LJLILLLLZI);
        InterfaceC84562XGs<InterfaceC57357MfB> interfaceC84562XGs = xgs2.LJLIL;
        if (interfaceC84562XGs instanceof XGE) {
            return new XGZ(ORZ.LLIIJI(new C84563XGt(xgl.LIZ), ORZ.LLIIJI(xgl.LIZLLL.getValue(), ORZ.LLIIJI(xgl.LJ.getValue(), C47261Igj.LJJIJ(xgl.LIZJ.getValue()))))).LIZ(xgs2);
        }
        if (interfaceC84562XGs instanceof InterfaceC57356MfA) {
            return new XGZ(ORZ.LLIIJI(new C84563XGt(xgl.LIZ), ORZ.LLIIJI(xgl.LIZIZ.getValue(), C47261Igj.LJJIJ(xgl.LIZJ.getValue())))).LIZ(xgs2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("this operation: ");
        LIZ.append(xgs2);
        LIZ.append(" not support");
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public final void LIZ(XHD xhd) {
        this.LIZJ = this.LIZJ.LIZJ(xhd);
    }

    public XGR(XGL mota, InterfaceC84562XGs operation, XH8 gContext) {
        o.LJIIIZ(gContext, "gContext");
        o.LJIIIZ(mota, "mota");
        o.LJIIIZ(operation, "operation");
        this.LIZ = mota;
        this.LIZIZ = operation;
        this.LIZJ = gContext;
    }
}
