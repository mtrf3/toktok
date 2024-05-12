package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes16.dex */
public class XPO<K, V> extends WeakReference<K> implements InterfaceC84796XPs<K, V> {
    public final int LJLIL;
    public final InterfaceC84796XPs<K, V> LJLILLLLZI;
    public volatile XPL<K, V> LJLJI;

    @Override // X.InterfaceC84796XPs
    public InterfaceC84796XPs<K, V> LJ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public InterfaceC84796XPs<K, V> LJFF() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public InterfaceC84796XPs<K, V> LJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public long LJIIIIZZ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public InterfaceC84796XPs<K, V> LJIIJJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public long LJIIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public final K getKey() {
        return get();
    }

    @Override // X.InterfaceC84796XPs
    public final InterfaceC84796XPs<K, V> LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC84796XPs
    public final XPL<K, V> LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC84796XPs
    public final int LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC84796XPs
    public void LJIIIZ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public void LJIIJ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public void LJIILIIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public void LJIILJJIL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public void LJIILL(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84796XPs
    public final void LJIILLIIL(XPL<K, V> xpl) {
        this.LJLJI = xpl;
    }

    @Override // X.InterfaceC84796XPs
    public void LJIIZILJ(InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        throw new UnsupportedOperationException();
    }

    public XPO(int i, InterfaceC84796XPs interfaceC84796XPs, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.LJLJI = XQ3.LLFF;
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC84796XPs;
    }
}
