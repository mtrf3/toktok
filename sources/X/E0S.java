package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E0S implements E0U {
    public volatile InterfaceC35522Dws LJLIL;
    public final List<E0U> LJLILLLLZI = new ArrayList();

    public final void LIZIZ() {
        synchronized (this.LJLILLLLZI) {
            ((ArrayList) this.LJLILLLLZI).clear();
        }
    }

    public final void LIZ(E0U listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLILLLLZI) {
            ((ArrayList) this.LJLILLLLZI).add(listener);
            InterfaceC35522Dws interfaceC35522Dws = this.LJLIL;
            if (interfaceC35522Dws == null) {
                return;
            }
            if (interfaceC35522Dws instanceof E0R) {
                listener.LJJJ(((E0R) interfaceC35522Dws).LIZ, ((E0R) interfaceC35522Dws).LIZIZ, ((E0R) interfaceC35522Dws).LIZJ, ((E0R) interfaceC35522Dws).LIZLLL);
            } else if (interfaceC35522Dws instanceof C35523Dwt) {
                listener.LJJJLIIL(((C35523Dwt) interfaceC35522Dws).LIZ);
            } else if (interfaceC35522Dws instanceof E0T) {
                listener.LJJJJJ(((E0T) interfaceC35522Dws).LIZ, ((E0T) interfaceC35522Dws).LIZIZ);
            } else if (interfaceC35522Dws instanceof C35521Dwr) {
                listener.LJJJJI(((C35521Dwr) interfaceC35522Dws).LIZ);
            }
        }
    }

    public final void LIZJ(E0U listener) {
        o.LJIIIZ(listener, "listener");
        synchronized (this.LJLILLLLZI) {
            ((ArrayList) this.LJLILLLLZI).remove(listener);
        }
    }

    @Override // X.E0U
    public final void LJJJJI(String str) {
        this.LJLIL = new C35521Dwr(str);
        synchronized (this.LJLILLLLZI) {
            Iterator<E0U> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LJJJJI(str);
            }
        }
    }

    @Override // X.E0U
    public final void LJJJLIIL(String str) {
        if (!(this.LJLIL instanceof C35523Dwt)) {
            this.LJLIL = new C35523Dwt(str);
            synchronized (this.LJLILLLLZI) {
                Iterator<E0U> it = this.LJLILLLLZI.iterator();
                while (it.hasNext()) {
                    it.next().LJJJLIIL(str);
                }
            }
        }
    }

    @Override // X.E0U
    public final void LJIIJ(String str, boolean z) {
        synchronized (this.LJLILLLLZI) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                ((E0U) it.next()).LJIIJ(str, z);
            }
        }
    }

    @Override // X.E0U
    public final void LJJJJJ(String str, float f) {
        this.LJLIL = new E0T(str, f);
        synchronized (this.LJLILLLLZI) {
            Iterator<E0U> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LJJJJJ(str, f);
            }
        }
    }

    @Override // X.E0U
    public final void LJJJ(String str, int i, int i2, String str2) {
        this.LJLIL = new E0R(str, i, i2, str2);
        synchronized (this.LJLILLLLZI) {
            Iterator<E0U> it = this.LJLILLLLZI.iterator();
            while (it.hasNext()) {
                it.next().LJJJ(str, i, i2, str2);
            }
        }
    }
}
