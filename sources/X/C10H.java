package X;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.10H, reason: invalid class name */
/* loaded from: classes.dex */
public final class C10H implements Closeable {
    public final Object LJLIL = new Object();
    public final List<C10G> LJLILLLLZI = new ArrayList();
    public boolean LJLJI;
    public boolean LJLJJI;

    public final void LIZ() {
        synchronized (this.LJLIL) {
            LIZLLL();
            if (this.LJLJI) {
                return;
            }
            this.LJLJI = true;
            Iterator it = new ArrayList(this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                it.next();
                C10G.LIZ();
            }
        }
    }

    public final C36581c6 LIZIZ() {
        C36581c6 c36581c6;
        synchronized (this.LJLIL) {
            LIZLLL();
            c36581c6 = new C36581c6(0, this);
        }
        return c36581c6;
    }

    public final boolean LIZJ() {
        boolean z;
        synchronized (this.LJLIL) {
            LIZLLL();
            z = this.LJLJI;
        }
        return z;
    }

    public final void LIZLLL() {
        if (!this.LJLJJI) {
        } else {
            throw new IllegalStateException("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LJLIL) {
            if (this.LJLJJI) {
                return;
            }
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                ((C10G) it.next()).close();
            }
            ((ArrayList) this.LJLILLLLZI).clear();
            this.LJLJJI = true;
        }
    }

    public final String toString() {
        return C16880lQ.LLLZI(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{C10H.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(LIZJ())});
    }

    public C10H() {
        C38995FSd.LJ();
    }

    public final void LJ(C10G c10g) {
        synchronized (this.LJLIL) {
            LIZLLL();
            ((ArrayList) this.LJLILLLLZI).remove(c10g);
        }
    }
}
