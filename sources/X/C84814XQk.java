package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.XQk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84814XQk<K, V> extends WeakReference<K> implements InterfaceC84816XQm<K, V> {
    public final int LJLIL;
    public final InterfaceC84816XQm<K, V> LJLILLLLZI;
    public volatile InterfaceC84815XQl<K, V> LJLJI;

    @Override // X.InterfaceC84816XQm
    public InterfaceC84816XQm<K, V> LJ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public InterfaceC84816XQm<K, V> LJFF() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public InterfaceC84816XQm<K, V> LJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public long LJIIIIZZ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public InterfaceC84816XQm<K, V> LJIIJJI() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public long LJIIL() {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public final K getKey() {
        return get();
    }

    @Override // X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC84816XQm
    public final InterfaceC84815XQl<K, V> LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC84816XQm
    public final int LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC84816XQm
    public void LJIIIZ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public void LJIIJ(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public void LJIILIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public final void LJIILJJIL(InterfaceC84815XQl<K, V> interfaceC84815XQl) {
        this.LJLJI = interfaceC84815XQl;
    }

    @Override // X.InterfaceC84816XQm
    public void LJIILL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public void LJIILLIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC84816XQm
    public void LJIIZILJ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        throw new UnsupportedOperationException();
    }

    public C84814XQk(int i, InterfaceC84816XQm interfaceC84816XQm, Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.LJLJI = ConcurrentMapC84812XQi.LJZL;
        this.LJLIL = i;
        this.LJLILLLLZI = interfaceC84816XQm;
    }
}
