package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLQ implements T2N {
    public final XLL<?> LJLIL;
    public final long LJLILLLLZI;
    public final Object LJLJI;
    public final InterfaceC67352kd<C76800UCe> LJLJJI;

    @Override // X.T2N
    public final void dispose() {
        XLL<?> xll = this.LJLIL;
        synchronized (xll) {
            if (this.LJLILLLLZI >= xll.LJIIL()) {
                Object[] objArr = xll.LJLJLJ;
                o.LJI(objArr);
                int i = (int) this.LJLILLLLZI;
                if (objArr[(objArr.length - 1) & i] == this) {
                    objArr[i & (objArr.length - 1)] = C79853Bl.LIZ;
                    xll.LJIIIIZZ();
                }
            }
        }
    }

    public XLQ(XLL xll, long j, Object obj, XKS xks) {
        this.LJLIL = xll;
        this.LJLILLLLZI = j;
        this.LJLJI = obj;
        this.LJLJJI = xks;
    }
}
