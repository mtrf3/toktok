package X;

import java.util.List;

/* loaded from: classes10.dex */
public final class L4K extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final L4K LJLIL = new L4K();

    public L4K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<? extends String> LLJI;
        FFL LJIIIZ = FFL.LJIIIZ();
        C61878OQg c61878OQg = L4J.LIZ;
        LJIIIZ.getClass();
        Iterable iterable = (Iterable) FFL.LJIJ(true, "search_lynx_multi_thread_white_list", 31744, List.class, c61878OQg);
        if (iterable != null && (LLJI = ORZ.LLJI(iterable)) != null) {
            return LLJI;
        }
        return c61878OQg;
    }
}
