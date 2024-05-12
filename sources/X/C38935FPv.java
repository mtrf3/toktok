package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.FPv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38935FPv implements FQ4<C38937FPx> {
    public final List<FQ4<C38937FPx>> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C38935FPv(List<? extends FQ4<C38937FPx>> list) {
        this.LIZ = list;
    }

    @Override // X.FQ4
    public final void LIZ(InterfaceC88472Yns resolve, Object obj, InterfaceC88472Yns interfaceC88472Yns) {
        C38937FPx input = (C38937FPx) obj;
        o.LJIIJ(input, "input");
        o.LJIIJ(resolve, "resolve");
        Iterator<FQ4<C38937FPx>> it = this.LIZ.iterator();
        if (!it.hasNext()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("None of BridgeRegistryTransformer processor for func name: ");
            LIZ.append(input.LJLIL);
            interfaceC88472Yns.invoke(new Throwable(X1D.LIZIZ(LIZ)));
            return;
        }
        try {
            it.next().LIZ(resolve, input, new C38938FPy(this, it, input, resolve, interfaceC88472Yns));
        } catch (Exception e) {
            interfaceC88472Yns.invoke(e);
        }
    }
}
