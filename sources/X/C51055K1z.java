package X;

import java.util.List;

/* renamed from: X.K1z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51055K1z extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C51055K1z LJLIL = new C51055K1z();

    public C51055K1z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        List<? extends String> LLJI;
        FFL LJIIIZ = FFL.LJIIIZ();
        C61878OQg c61878OQg = C51054K1y.LIZ;
        LJIIIZ.getClass();
        Iterable iterable = (Iterable) FFL.LJIJ(true, "search_lynx_reload_black_list", 31744, List.class, c61878OQg);
        if (iterable != null && (LLJI = ORZ.LLJI(iterable)) != null) {
            return LLJI;
        }
        return c61878OQg;
    }
}
