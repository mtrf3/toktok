package X;

import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGS extends F9E {
    public final InterfaceC84562XGs<InterfaceC57357MfB> LJLIL;
    public final XH8 LJLILLLLZI;
    public final XGL LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public XGS(XGL mota, InterfaceC84562XGs operation, XH8 motaContext) {
        o.LJIIIZ(operation, "operation");
        o.LJIIIZ(motaContext, "motaContext");
        o.LJIIIZ(mota, "mota");
        this.LJLIL = operation;
        this.LJLILLLLZI = motaContext;
        this.LJLJI = mota;
        this.LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, (XGS) 911));
    }
}
