package X;

import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65037Pfl<R> implements InterfaceC65013PfN<R, CompletableFuture<C64653PYz<R>>> {
    public final Type LIZ;

    @Override // X.InterfaceC65013PfN
    public final Type LIZ() {
        return this.LIZ;
    }

    public C65037Pfl(Type type) {
        this.LIZ = type;
    }

    @Override // X.InterfaceC65013PfN
    public final Object LIZIZ(C64639PYl c64639PYl) {
        C65042Pfq c65042Pfq = new C65042Pfq(c64639PYl);
        c64639PYl.LLLZ(new C65038Pfm(c65042Pfq));
        return c65042Pfq;
    }
}
