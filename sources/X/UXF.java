package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UXF extends AbstractC65781Prl implements InterfaceC88472Yns<UXT, OSL<Long, String, Integer, Integer>> {
    public static final UXF LJLIL = new UXF();

    public UXF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final OSL<Long, String, Integer, Integer> invoke(UXT uxt) {
        UXT it = uxt;
        o.LJIIIZ(it, "it");
        return new OSL<>(Long.valueOf(it.LJLJI.LJLILLLLZI), it.LJLJI.LJLIL, Integer.valueOf(it.LJLIL), Integer.valueOf(it.LJLILLLLZI));
    }
}
