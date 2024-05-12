package X;

import Y.IDhS105S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Szo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73924Szo<V, K1, V1> implements C3EO<V, OSZ<? extends K1, ? extends V1>> {
    public final InterfaceC68914R2w<K1, V1> LIZ;
    public final AbstractC73922Szm<?, V, K1, V1> LIZIZ;

    @Override // X.C3EO
    public final InterfaceC115714gR<OSZ<K1, V1>> LIZ(AbstractC73672Svk<V> upstream) {
        o.LJIIJ(upstream, "upstream");
        if (this.LIZIZ instanceof C73920Szk) {
            InterfaceC115714gR<OSZ<K1, V1>> LJJIII = new C73424Srk(upstream, new IDhS105S0100000_12(this, 28)).LJJIII(new IDhS105S0100000_12(this, 29), false);
            o.LJFF(LJJIII, "upstream.flatMapIterable…                        }");
            return LJJIII;
        }
        throw new RuntimeException();
    }

    public C73924Szo(InterfaceC68914R2w<K1, V1> to, AbstractC73922Szm<?, V, K1, V1> mergeStrategy) {
        o.LJIIJ(to, "to");
        o.LJIIJ(mergeStrategy, "mergeStrategy");
        this.LIZ = to;
        this.LIZIZ = mergeStrategy;
    }
}
