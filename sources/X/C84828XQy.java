package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.XQy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84828XQy<K, V> extends C84814XQk<K, V> {
    public volatile long LJLJJI;
    public InterfaceC84816XQm<K, V> LJLJJL;
    public InterfaceC84816XQm<K, V> LJLJJLL;

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJFF() {
        return this.LJLJJLL;
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
    public final void LJIILIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJJLL = interfaceC84816XQm;
    }

    @Override // X.C84814XQk, X.InterfaceC84816XQm
    public final void LJIIZILJ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJJL = interfaceC84816XQm;
    }

    public C84828XQy(int i, InterfaceC84816XQm interfaceC84816XQm, Object obj, ReferenceQueue referenceQueue) {
        super(i, interfaceC84816XQm, obj, referenceQueue);
        this.LJLJJI = Long.MAX_VALUE;
        EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
        this.LJLJJL = enumC84825XQv;
        this.LJLJJLL = enumC84825XQv;
    }
}
