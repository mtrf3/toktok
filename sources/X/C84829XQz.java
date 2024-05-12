package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XQz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84829XQz<K, V> extends C84814XQk<K, V> {
    public volatile long LJLJJI;
    public InterfaceC84816XQm<K, V> LJLJJL;
    public InterfaceC84816XQm<K, V> LJLJJLL;
    public volatile long LJLJL;
    public InterfaceC84816XQm<K, V> LJLJLJ;
    public InterfaceC84816XQm<K, V> LJLJLLL;

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJ() {
        return this.LJLJLLL;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJFF() {
        return this.LJLJJLL;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJI() {
        return this.LJLJLJ;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final long LJIIIIZZ() {
        return this.LJLJL;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJIIJJI() {
        return this.LJLJJL;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final long LJIIL() {
        return this.LJLJJI;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIIIZ(long j) {
        this.LJLJJI = j;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIIJ(long j) {
        this.LJLJL = j;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIILIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJJLL = interfaceC84816XQm;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIILL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJLLL = interfaceC84816XQm;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIILLIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJLJ = interfaceC84816XQm;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIIZILJ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJJL = interfaceC84816XQm;
    }

    public C84829XQz(int i, InterfaceC84816XQm interfaceC84816XQm, Object obj, ReferenceQueue referenceQueue) {
        super(i, interfaceC84816XQm, obj, referenceQueue);
        this.LJLJJI = Long.MAX_VALUE;
        EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
        this.LJLJJL = enumC84825XQv;
        this.LJLJJLL = enumC84825XQv;
        this.LJLJL = Long.MAX_VALUE;
        this.LJLJLJ = enumC84825XQv;
        this.LJLJLLL = enumC84825XQv;
    }
}
