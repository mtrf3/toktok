package X;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: X.Pfp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65041Pfp implements InterfaceC65013PfN<Object, InterfaceC65079PgR<?>> {
    public final /* synthetic */ Type LIZ;
    public final /* synthetic */ Executor LIZIZ;

    @Override // X.InterfaceC65013PfN
    public final Type LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC65013PfN
    public final Object LIZIZ(C64639PYl c64639PYl) {
        Executor executor = this.LIZIZ;
        if (executor == null) {
            return c64639PYl;
        }
        return new C65078PgQ(executor, c64639PYl);
    }

    public C65041Pfp(Type type, Executor executor) {
        this.LIZ = type;
        this.LIZIZ = executor;
    }
}
