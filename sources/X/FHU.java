package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHU<T, R> implements InterfaceC48038ItG<T, R> {
    public static final FHU LJLIL = new FHU();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        C38726FHu it = (C38726FHu) obj;
        o.LJIIJ(it, "it");
        C38726FHu c38726FHu = FHL.LIZIZ;
        if (c38726FHu == null) {
            FHL.LIZIZ = it;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            C38726FHu c38726FHu2 = FHL.LIZIZ;
            String str2 = null;
            if (c38726FHu2 != null) {
                str = c38726FHu2.LJLILLLLZI;
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(",");
            LIZ.append(it.LJLILLLLZI);
            c38726FHu.LJLILLLLZI = X1D.LIZIZ(LIZ);
            C38726FHu c38726FHu3 = FHL.LIZIZ;
            if (c38726FHu3 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                C38726FHu c38726FHu4 = FHL.LIZIZ;
                if (c38726FHu4 != null) {
                    str2 = c38726FHu4.LJLIL;
                }
                LIZ2.append(str2);
                LIZ2.append(",");
                LIZ2.append(it.LJLIL);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                o.LJIIJ(LIZIZ, "<set-?>");
                c38726FHu3.LJLIL = LIZIZ;
            }
        }
        return FHL.LIZIZ;
    }
}
