package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NNZ extends AbstractC65781Prl implements InterfaceC88472Yns<C59257NNl, InterfaceC1039145z<? extends String>> {
    public static final NNZ LJLIL = new NNZ();

    public NNZ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final InterfaceC1039145z<? extends String> invoke(C59257NNl c59257NNl) {
        C59257NNl it = c59257NNl;
        o.LJIIIZ(it, "it");
        java.util.Set<String> set = it.clickTracking;
        if (set != null) {
            return ORZ.LJLIIIL(set);
        }
        return OJA.LIZ;
    }
}
