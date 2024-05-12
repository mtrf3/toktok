package X;

/* loaded from: classes16.dex */
public final class XR2<K, V> extends C84822XQs<K, V> {
    public volatile long LJLJJL;
    public InterfaceC84816XQm<K, V> LJLJJLL;
    public InterfaceC84816XQm<K, V> LJLJL;

    @Override // X.XR0, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJFF() {
        return this.LJLJL;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LJIIJJI() {
        return this.LJLJJLL;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final long LJIIL() {
        return this.LJLJJL;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final void LJIIIZ(long j) {
        this.LJLJJL = j;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final void LJIILIIL(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJL = interfaceC84816XQm;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final void LJIIZILJ(InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLJJLL = interfaceC84816XQm;
    }

    public XR2(K k, int i, InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        super(k, i, interfaceC84816XQm);
        this.LJLJJL = Long.MAX_VALUE;
        EnumC84825XQv enumC84825XQv = EnumC84825XQv.LJLIL;
        this.LJLJJLL = enumC84825XQv;
        this.LJLJL = enumC84825XQv;
    }
}
