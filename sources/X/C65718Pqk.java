package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: X.Pqk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65718Pqk implements Closeable {
    public static final InterfaceC65721Pqn LJLJJI;
    public final InterfaceC65721Pqn LJLIL;
    public final Deque<Closeable> LJLILLLLZI = new ArrayDeque(4);
    public Throwable LJLJI;

    static {
        InterfaceC65721Pqn interfaceC65721Pqn;
        if (C65719Pql.LIZIZ != null) {
            interfaceC65721Pqn = C65719Pql.LIZ;
        } else {
            interfaceC65721Pqn = C65720Pqm.LIZ;
        }
        LJLJJI = interfaceC65721Pqn;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.LJLJI;
        while (!((ArrayDeque) this.LJLILLLLZI).isEmpty()) {
            Closeable closeable = (Closeable) ((ArrayDeque) this.LJLILLLLZI).removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.LJLIL.LIZ(closeable, th, th2);
                }
            }
        }
        if (this.LJLJI != null || th == null) {
            return;
        }
        if (!IOException.class.isInstance(th)) {
            C36747EbX.LIZJ(th);
            throw new AssertionError(th);
        }
        throw ((Throwable) IOException.class.cast(th));
    }

    public C65718Pqk(InterfaceC65721Pqn interfaceC65721Pqn) {
        interfaceC65721Pqn.getClass();
        this.LJLIL = interfaceC65721Pqn;
    }
}
