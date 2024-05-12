package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.XPr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84795XPr<K, V> extends AbstractQueue<InterfaceC84796XPs<K, V>> {
    public final XPW LJLIL = new XPW();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLIL.LJLIL;
        while (true) {
            XPW xpw = this.LJLIL;
            if (interfaceC84796XPs != xpw) {
                InterfaceC84796XPs<K, V> LJI = interfaceC84796XPs.LJI();
                EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
                interfaceC84796XPs.LJIILL(enumC84785XPh);
                interfaceC84796XPs.LJIIZILJ(enumC84785XPh);
                interfaceC84796XPs = LJI;
            } else {
                xpw.LJLIL = xpw;
                xpw.LJLILLLLZI = xpw;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        XPW xpw = this.LJLIL;
        if (xpw.LJLIL == xpw) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC84796XPs<K, V>> iterator() {
        XPW xpw = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpw.LJLIL;
        if (interfaceC84796XPs == xpw) {
            interfaceC84796XPs = null;
        }
        return new C84794XPq(this, interfaceC84796XPs);
    }

    @Override // java.util.Queue
    public final Object peek() {
        XPW xpw = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpw.LJLIL;
        if (interfaceC84796XPs == xpw) {
            return null;
        }
        return interfaceC84796XPs;
    }

    @Override // java.util.Queue
    public final Object poll() {
        XPW xpw = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpw.LJLIL;
        if (interfaceC84796XPs == xpw) {
            return null;
        }
        remove(interfaceC84796XPs);
        return interfaceC84796XPs;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLIL.LJLIL; interfaceC84796XPs != this.LJLIL; interfaceC84796XPs = interfaceC84796XPs.LJI()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC84796XPs) obj).LJI() != EnumC84785XPh.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC84796XPs<K, V> interfaceC84796XPs = (InterfaceC84796XPs) obj;
        InterfaceC84796XPs<K, V> LJ = interfaceC84796XPs.LJ();
        InterfaceC84796XPs<K, V> LJI = interfaceC84796XPs.LJI();
        LJ.LJIILL(LJI);
        LJI.LJIIZILJ(LJ);
        InterfaceC84796XPs<K, V> interfaceC84796XPs2 = this.LJLIL.LJLILLLLZI;
        interfaceC84796XPs2.LJIILL(interfaceC84796XPs);
        interfaceC84796XPs.LJIIZILJ(interfaceC84796XPs2);
        XPW xpw = this.LJLIL;
        interfaceC84796XPs.LJIILL(xpw);
        xpw.LJLILLLLZI = interfaceC84796XPs;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC84796XPs interfaceC84796XPs = (InterfaceC84796XPs) obj;
        InterfaceC84796XPs<K, V> LJ = interfaceC84796XPs.LJ();
        InterfaceC84796XPs<K, V> LJI = interfaceC84796XPs.LJI();
        LJ.LJIILL(LJI);
        LJI.LJIIZILJ(LJ);
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        interfaceC84796XPs.LJIILL(enumC84785XPh);
        interfaceC84796XPs.LJIIZILJ(enumC84785XPh);
        if (LJI != enumC84785XPh) {
            return true;
        }
        return false;
    }
}
