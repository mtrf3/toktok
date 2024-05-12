package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.VbL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80051VbL implements InterfaceC80017Van, InterfaceC80059VbT {
    public final CopyOnWriteArrayList<InterfaceC80059VbT> LJLIL = new CopyOnWriteArrayList<>();

    public final void LIZ() {
        this.LJLIL.clear();
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIJ() {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                InterfaceC80059VbT next = it.next();
                if (!z) {
                    z = next.LJIJ();
                }
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LIZIZ(C48651J7n c48651J7n) {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                InterfaceC80059VbT next = it.next();
                if (!z) {
                    z = next.LIZIZ(c48651J7n);
                }
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJI(C48651J7n c48651J7n) {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                InterfaceC80059VbT next = it.next();
                if (!z) {
                    z = next.LJI(c48651J7n);
                }
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJII(C48651J7n c48651J7n) {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                InterfaceC80059VbT next = it.next();
                if (!z) {
                    z = next.LJII(c48651J7n);
                }
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // X.InterfaceC80059VbT
    public final boolean LJIIIZ(C48651J7n c48651J7n) {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                InterfaceC80059VbT next = it.next();
                if (!z) {
                    z = next.LJIIIZ(c48651J7n);
                }
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return z;
    }

    @Override // X.InterfaceC80017Van
    public final void LJIIJJI(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        if (!this.LJLIL.contains(interceptor)) {
            this.LJLIL.add(interceptor);
        }
    }

    @Override // X.InterfaceC80017Van
    public final void LJIILL(InterfaceC80059VbT interceptor) {
        o.LJIIJ(interceptor, "interceptor");
        this.LJLIL.remove(interceptor);
    }

    @Override // X.InterfaceC80059VbT
    public final C73363Sql LJIJI(C73363Sql c73363Sql) {
        Iterator<InterfaceC80059VbT> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            try {
                c73363Sql = it.next().LJIJI(c73363Sql);
            } catch (Exception e) {
                J7Z.LIZ("MusicPlayerOperationInterceptorDispatcher", e.getMessage());
            }
        }
        return c73363Sql;
    }
}
