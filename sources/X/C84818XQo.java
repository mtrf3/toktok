package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.XQo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84818XQo<K, V> extends AbstractQueue<InterfaceC84816XQm<K, V>> {
    public final XR7 LJLIL = new XR7();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLIL.LJLIL;
        while (true) {
            XR7 xr7 = this.LJLIL;
            if (interfaceC84816XQm != xr7) {
                InterfaceC84816XQm<K, V> LJI = interfaceC84816XQm.LJI();
                EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
                interfaceC84816XQm.LJIILLIIL(enumC84825XQv);
                interfaceC84816XQm.LJIILL(enumC84825XQv);
                interfaceC84816XQm = LJI;
            } else {
                xr7.LJLIL = xr7;
                xr7.LJLILLLLZI = xr7;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        XR7 xr7 = this.LJLIL;
        if (xr7.LJLIL == xr7) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC84816XQm<K, V>> iterator() {
        XR7 xr7 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr7.LJLIL;
        if (interfaceC84816XQm == xr7) {
            interfaceC84816XQm = null;
        }
        return new XRB(this, interfaceC84816XQm);
    }

    @Override // java.util.Queue
    public final Object peek() {
        XR7 xr7 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr7.LJLIL;
        if (interfaceC84816XQm == xr7) {
            return null;
        }
        return interfaceC84816XQm;
    }

    @Override // java.util.Queue
    public final Object poll() {
        XR7 xr7 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr7.LJLIL;
        if (interfaceC84816XQm == xr7) {
            return null;
        }
        remove(interfaceC84816XQm);
        return interfaceC84816XQm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLIL.LJLIL; interfaceC84816XQm != this.LJLIL; interfaceC84816XQm = interfaceC84816XQm.LJI()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC84816XQm) obj).LJI() != EnumC84825XQv.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC84816XQm<K, V> interfaceC84816XQm = (InterfaceC84816XQm) obj;
        InterfaceC84816XQm<K, V> LJ = interfaceC84816XQm.LJ();
        InterfaceC84816XQm<K, V> LJI = interfaceC84816XQm.LJI();
        LJ.LJIILLIIL(LJI);
        LJI.LJIILL(LJ);
        InterfaceC84816XQm<K, V> interfaceC84816XQm2 = this.LJLIL.LJLILLLLZI;
        interfaceC84816XQm2.LJIILLIIL(interfaceC84816XQm);
        interfaceC84816XQm.LJIILL(interfaceC84816XQm2);
        XR7 xr7 = this.LJLIL;
        interfaceC84816XQm.LJIILLIIL(xr7);
        xr7.LJLILLLLZI = interfaceC84816XQm;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC84816XQm interfaceC84816XQm = (InterfaceC84816XQm) obj;
        InterfaceC84816XQm<K, V> LJ = interfaceC84816XQm.LJ();
        InterfaceC84816XQm<K, V> LJI = interfaceC84816XQm.LJI();
        LJ.LJIILLIIL(LJI);
        LJI.LJIILL(LJ);
        EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
        interfaceC84816XQm.LJIILLIIL(enumC84825XQv);
        interfaceC84816XQm.LJIILL(enumC84825XQv);
        if (LJI != enumC84825XQv) {
            return true;
        }
        return false;
    }
}
