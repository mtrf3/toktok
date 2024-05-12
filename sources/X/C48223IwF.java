package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.IwF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48223IwF implements InterfaceC48224IwG {
    public final List<C47986IsQ<?>> LIZ = new ArrayList();

    @Override // X.InterfaceC48224IwG
    public final <T> void LIZ(InterfaceC59479NVz<T> param) {
        o.LJIIJ(param, "param");
        for (C47986IsQ<?> c47986IsQ : this.LIZ) {
            Class cls = c47986IsQ.LIZ;
            if (cls != null) {
                T t = c47986IsQ.LIZIZ;
                if (t != null) {
                    param.LIZIZ(cls, t);
                } else {
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.Any");
                }
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            }
        }
    }

    @Override // X.InterfaceC48224IwG
    public final <T> void LIZIZ(Class<T> cls, T t) {
        C47986IsQ c47986IsQ = new C47986IsQ(cls, t);
        if (!((ArrayList) this.LIZ).contains(c47986IsQ)) {
            ((ArrayList) this.LIZ).add(c47986IsQ);
        }
    }
}
