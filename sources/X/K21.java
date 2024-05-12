package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class K21 extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final K21 LJLIL = new K21();

    public K21() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<? extends String> LLJI;
        FFL LJIIIZ = FFL.LJIIIZ();
        C61878OQg c61878OQg = K20.LIZ;
        LJIIIZ.getClass();
        Iterable iterable = (Iterable) FFL.LJIJ(true, "search_lynx_reload_white_list", 31744, List.class, c61878OQg);
        if (iterable != null && (LLJI = ORZ.LLJI(iterable)) != null) {
            return LLJI;
        }
        return c61878OQg;
    }
}
