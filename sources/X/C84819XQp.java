package X;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: X.XQp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84819XQp<K, V> extends AbstractQueue<InterfaceC84816XQm<K, V>> {
    public final XR8 LJLIL = new XR8();

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLIL.LJLIL;
        while (true) {
            XR8 xr8 = this.LJLIL;
            if (interfaceC84816XQm != xr8) {
                InterfaceC84816XQm<K, V> LJIIJJI = interfaceC84816XQm.LJIIJJI();
                EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
                interfaceC84816XQm.LJIIZILJ(enumC84825XQv);
                interfaceC84816XQm.LJIILIIL(enumC84825XQv);
                interfaceC84816XQm = LJIIJJI;
            } else {
                xr8.LJLIL = xr8;
                xr8.LJLILLLLZI = xr8;
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        XR8 xr8 = this.LJLIL;
        if (xr8.LJLIL == xr8) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<InterfaceC84816XQm<K, V>> iterator() {
        XR8 xr8 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr8.LJLIL;
        if (interfaceC84816XQm == xr8) {
            interfaceC84816XQm = null;
        }
        return new XRC(this, interfaceC84816XQm);
    }

    @Override // java.util.Queue
    public final Object peek() {
        XR8 xr8 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr8.LJLIL;
        if (interfaceC84816XQm == xr8) {
            return null;
        }
        return interfaceC84816XQm;
    }

    @Override // java.util.Queue
    public final Object poll() {
        XR8 xr8 = this.LJLIL;
        InterfaceC84816XQm<K, V> interfaceC84816XQm = xr8.LJLIL;
        if (interfaceC84816XQm == xr8) {
            return null;
        }
        remove(interfaceC84816XQm);
        return interfaceC84816XQm;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (InterfaceC84816XQm<K, V> interfaceC84816XQm = this.LJLIL.LJLIL; interfaceC84816XQm != this.LJLIL; interfaceC84816XQm = interfaceC84816XQm.LJIIJJI()) {
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (((InterfaceC84816XQm) obj).LJIIJJI() != EnumC84825XQv.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        InterfaceC84816XQm<K, V> interfaceC84816XQm = (InterfaceC84816XQm) obj;
        InterfaceC84816XQm<K, V> LJFF = interfaceC84816XQm.LJFF();
        InterfaceC84816XQm<K, V> LJIIJJI = interfaceC84816XQm.LJIIJJI();
        LJFF.LJIIZILJ(LJIIJJI);
        LJIIJJI.LJIILIIL(LJFF);
        InterfaceC84816XQm<K, V> interfaceC84816XQm2 = this.LJLIL.LJLILLLLZI;
        interfaceC84816XQm2.LJIIZILJ(interfaceC84816XQm);
        interfaceC84816XQm.LJIILIIL(interfaceC84816XQm2);
        XR8 xr8 = this.LJLIL;
        interfaceC84816XQm.LJIIZILJ(xr8);
        xr8.LJLILLLLZI = interfaceC84816XQm;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        InterfaceC84816XQm interfaceC84816XQm = (InterfaceC84816XQm) obj;
        InterfaceC84816XQm<K, V> LJFF = interfaceC84816XQm.LJFF();
        InterfaceC84816XQm<K, V> LJIIJJI = interfaceC84816XQm.LJIIJJI();
        LJFF.LJIIZILJ(LJIIJJI);
        LJIIJJI.LJIILIIL(LJFF);
        EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
        interfaceC84816XQm.LJIIZILJ(enumC84825XQv);
        interfaceC84816XQm.LJIILIIL(enumC84825XQv);
        if (LJIIJJI != enumC84825XQv) {
            return true;
        }
        return false;
    }
}
