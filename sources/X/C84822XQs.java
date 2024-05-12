package X;

/* renamed from: X.XQs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84822XQs<K, V> extends XR0<K, V> {
    public final K LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC84816XQm<K, V> LJLJI;
    public volatile InterfaceC84815XQl<K, V> LJLJJI = ConcurrentMapC84812XQi.LJZL;

    @Override // X.XR0, X.InterfaceC84816XQm
    public final InterfaceC84816XQm<K, V> LIZJ() {
        return this.LJLJI;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final InterfaceC84815XQl<K, V> LIZLLL() {
        return this.LJLJJI;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final int LJII() {
        return this.LJLILLLLZI;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final K getKey() {
        return this.LJLIL;
    }

    @Override // X.XR0, X.InterfaceC84816XQm
    public final void LJIILJJIL(InterfaceC84815XQl<K, V> interfaceC84815XQl) {
        this.LJLJJI = interfaceC84815XQl;
    }

    public C84822XQs(K k, int i, InterfaceC84816XQm<K, V> interfaceC84816XQm) {
        this.LJLIL = k;
        this.LJLILLLLZI = i;
        this.LJLJI = interfaceC84816XQm;
    }
}
