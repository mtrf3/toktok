package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Szi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73918Szi<K, V, K1, V1> extends AbstractC73922Szm<K, V, K1, V1> {
    public InterfaceC88471Ynr<? super K, ? super V, ? extends K1> LIZIZ;
    public InterfaceC88473Ynt<? super K, ? super V, ? super V1, ? extends V1> LIZJ;

    public C73918Szi() {
        this(0);
    }

    public /* synthetic */ C73918Szi(int i) {
        this(C73917Szh.LJLIL, C73331SqF.LJLIL);
    }

    public C73918Szi(InterfaceC88471Ynr<? super K, ? super V, ? extends K1> key, InterfaceC88473Ynt<? super K, ? super V, ? super V1, ? extends V1> merge) {
        o.LJIIJ(key, "key");
        o.LJIIJ(merge, "merge");
        this.LIZIZ = key;
        this.LIZJ = merge;
    }
}
