package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHV<T, R> implements InterfaceC48038ItG<T, R> {
    public static final FHV LJLIL = new FHV();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        C38726FHu it = (C38726FHu) obj;
        o.LJIIJ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sync config, taskId: ");
        LIZ.append(it.LJLIL);
        LIZ.append(", proxyItemIds: ");
        LIZ.append(it.LJLILLLLZI);
        X1D.LIZIZ(LIZ);
        return null;
    }
}
