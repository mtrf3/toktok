package X;

import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65040Pfo<R> implements InterfaceC65013PfN<R, CompletableFuture<R>> {
    public final Type LIZ;

    @Override // X.InterfaceC65013PfN
    public final Type LIZ() {
        return this.LIZ;
    }

    public C65040Pfo(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65013PfN
    public final Object LIZIZ(C64639PYl c64639PYl) {
        C65043Pfr c65043Pfr = new C65043Pfr(c64639PYl);
        c64639PYl.LLLZ(new C65039Pfn(c65043Pfr));
        return c65043Pfr;
    }
}
