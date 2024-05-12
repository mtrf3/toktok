package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class TMY<V> extends R30<C76800UCe, Object, C76800UCe, Object> implements R37<Object, Object> {
    public abstract AbstractC73672Svk<Object> LJIIIIZZ();

    @Override // X.R37
    public final AbstractC73672Svk<Object> request() {
        return LIZ(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC68907R2p
    public final C76800UCe LJFF(C76800UCe req) {
        o.LJIIIZ(req, "req");
        return C76800UCe.LIZ;
    }

    @Override // X.R30
    public final AbstractC73672Svk<Object> LJII(C76800UCe req) {
        o.LJIIIZ(req, "req");
        return LJIIIIZZ();
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(C76800UCe req, Object obj) {
        o.LJIIIZ(req, "req");
        return obj;
    }
}
