package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.XPo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84792XPo<K, V> extends AbstractQueue<InterfaceC84796XPs<K, V>> {
    public final XPV LJLIL = new XPV();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLIL.LJLIL;
        while (true) {
            XPV xpv = this.LJLIL;
            if (interfaceC84796XPs != xpv) {
                InterfaceC84796XPs<K, V> LJIIJJI = interfaceC84796XPs.LJIIJJI();
                EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
                interfaceC84796XPs.LJIILJJIL(enumC84785XPh);
                interfaceC84796XPs.LJIILIIL(enumC84785XPh);
                interfaceC84796XPs = LJIIJJI;
            } else {
                xpv.LJLIL = xpv;
                xpv.LJLILLLLZI = xpv;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        XPV xpv = this.LJLIL;
        if (xpv.LJLIL == xpv) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC84796XPs<K, V>> iterator() {
        XPV xpv = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpv.LJLIL;
        if (interfaceC84796XPs == xpv) {
            interfaceC84796XPs = null;
        }
        return new C84793XPp(this, interfaceC84796XPs);
    }

    @Override // java.util.Queue
    public final Object peek() {
        XPV xpv = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpv.LJLIL;
        if (interfaceC84796XPs == xpv) {
            return null;
        }
        return interfaceC84796XPs;
    }

    @Override // java.util.Queue
    public final Object poll() {
        XPV xpv = this.LJLIL;
        InterfaceC84796XPs<K, V> interfaceC84796XPs = xpv.LJLIL;
        if (interfaceC84796XPs == xpv) {
            return null;
        }
        remove(interfaceC84796XPs);
        return interfaceC84796XPs;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC84796XPs<K, V> interfaceC84796XPs = this.LJLIL.LJLIL; interfaceC84796XPs != this.LJLIL; interfaceC84796XPs = interfaceC84796XPs.LJIIJJI()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC84796XPs) obj).LJIIJJI() != EnumC84785XPh.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC84796XPs<K, V> interfaceC84796XPs = (InterfaceC84796XPs) obj;
        InterfaceC84796XPs<K, V> LJFF = interfaceC84796XPs.LJFF();
        InterfaceC84796XPs<K, V> LJIIJJI = interfaceC84796XPs.LJIIJJI();
        LJFF.LJIILJJIL(LJIIJJI);
        LJIIJJI.LJIILIIL(LJFF);
        InterfaceC84796XPs<K, V> interfaceC84796XPs2 = this.LJLIL.LJLILLLLZI;
        interfaceC84796XPs2.LJIILJJIL(interfaceC84796XPs);
        interfaceC84796XPs.LJIILIIL(interfaceC84796XPs2);
        XPV xpv = this.LJLIL;
        interfaceC84796XPs.LJIILJJIL(xpv);
        xpv.LJLILLLLZI = interfaceC84796XPs;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC84796XPs interfaceC84796XPs = (InterfaceC84796XPs) obj;
        InterfaceC84796XPs<K, V> LJFF = interfaceC84796XPs.LJFF();
        InterfaceC84796XPs<K, V> LJIIJJI = interfaceC84796XPs.LJIIJJI();
        LJFF.LJIILJJIL(LJIIJJI);
        LJIIJJI.LJIILIIL(LJFF);
        EnumC84785XPh enumC84785XPh = EnumC84785XPh.LJLIL;
        interfaceC84796XPs.LJIILJJIL(enumC84785XPh);
        interfaceC84796XPs.LJIILIIL(enumC84785XPh);
        if (LJIIJJI != enumC84785XPh) {
            return true;
        }
        return false;
    }
}
