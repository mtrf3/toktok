package X;

import Y.IDhS105S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Szn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73923Szn<K, V, K1, V1> implements C3EO<OSZ<? extends K, ? extends V>, OSZ<? extends K1, ? extends V1>> {
    public final InterfaceC68914R2w<K1, V1> LIZ;
    public final AbstractC73922Szm<K, V, K1, V1> LIZIZ;

    @Override // X.C3EO
    public final InterfaceC115714gR<OSZ<K1, V1>> LIZ(AbstractC73672Svk<OSZ<K, V>> upstream) {
        o.LJIIJ(upstream, "upstream");
        return upstream.LJJIII(new IDhS105S0100000_12(this, 30), false).LJJIFFI(C73926Szq.LJLIL);
    }

    public C73923Szn(InterfaceC68914R2w<K1, V1> to, AbstractC73922Szm<K, V, K1, V1> mergeStrategy) {
        o.LJIIJ(to, "to");
        o.LJIIJ(mergeStrategy, "mergeStrategy");
        this.LIZ = to;
        this.LIZIZ = mergeStrategy;
    }
}
