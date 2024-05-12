package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.W8k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81798W8k implements InterfaceC81770W7i {
    public final W5O LIZ;
    public final String LIZIZ;
    public final InterfaceC81754W6s LIZJ;
    public final Object LIZLLL;
    public final W50 LJ;
    public boolean LJFF;
    public W92 LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public final List<InterfaceC81847WAh> LJIIIZ = new ArrayList();

    @Override // X.InterfaceC81770W7i
    public final synchronized boolean LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC81770W7i
    public final synchronized boolean LJFF() {
        return this.LJFF;
    }

    public final void LJIIJ() {
        synchronized (this) {
            if (!this.LJIIIIZZ) {
                this.LJIIIIZZ = true;
                Iterator it = new ArrayList(this.LJIIIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC81847WAh) it.next()).LIZJ();
                }
            }
        }
    }

    @Override // X.InterfaceC81770W7i
    public final synchronized W92 getPriority() {
        return this.LJI;
    }

    @Override // X.InterfaceC81770W7i
    public final InterfaceC81754W6s LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC81770W7i
    public final Object LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC81770W7i
    public final W5O LJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC81770W7i
    public final W50 LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC81770W7i
    public final String getId() {
        return this.LIZIZ;
    }

    public static void LJII(List<InterfaceC81847WAh> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC81847WAh> it = list.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
    }

    public static void LJIIIIZZ(List<InterfaceC81847WAh> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC81847WAh> it = list.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    public static void LJIIIZ(List<InterfaceC81847WAh> list) {
        if (list == null) {
            return;
        }
        Iterator<InterfaceC81847WAh> it = list.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ();
        }
    }

    @Override // X.InterfaceC81770W7i
    public final void LIZLLL(WB7 wb7) {
        boolean z;
        synchronized (this) {
            ((ArrayList) this.LJIIIZ).add(wb7);
            z = this.LJIIIIZZ;
        }
        if (z) {
            wb7.LIZJ();
        }
    }

    public final synchronized List<InterfaceC81847WAh> LJIIJJI(boolean z) {
        if (z == this.LJII) {
            return null;
        }
        this.LJII = z;
        return new ArrayList(this.LJIIIZ);
    }

    public final synchronized List<InterfaceC81847WAh> LJIIL(boolean z) {
        if (z == this.LJFF) {
            return null;
        }
        this.LJFF = z;
        return new ArrayList(this.LJIIIZ);
    }

    public final synchronized List<InterfaceC81847WAh> LJIILIIL(W92 w92) {
        if (w92 == this.LJI) {
            return null;
        }
        this.LJI = w92;
        return new ArrayList(this.LJIIIZ);
    }

    public C81798W8k(W5O w5o, String str, InterfaceC81754W6s interfaceC81754W6s, Object obj, W50 w50, boolean z, boolean z2, W92 w92) {
        this.LIZ = w5o;
        this.LIZIZ = str;
        this.LIZJ = interfaceC81754W6s;
        this.LIZLLL = obj;
        this.LJ = w50;
        this.LJFF = z;
        this.LJI = w92;
        this.LJII = z2;
    }
}
