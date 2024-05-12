package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBC extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends java.util.Map<String, ? extends String>>> {
    public static final KBC LJLIL = new KBC();

    public KBC() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends java.util.Map<String, ? extends String>> invoke() {
        FFL LJIIIZ = FFL.LJIIIZ();
        java.util.Map<String, java.util.Map<String, String>> map = C51276KAm.LIZIZ;
        LJIIIZ.getClass();
        Object LJIJ = FFL.LJIJ(true, "ec_search_entrance", 31744, java.util.Map.class, map);
        if (LJIJ == 0) {
            C51276KAm.LIZ.getClass();
        } else {
            map = LJIJ;
        }
        o.LJIIIIZZ(map, "ABManager.getInstance()\n…s::class.java) ?: DEFAULT");
        return map;
    }
}
