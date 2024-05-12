package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GpP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42703GpP extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends String>> {
    public static final C42703GpP LJLIL = new C42703GpP();

    public C42703GpP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends String> invoke() {
        List<String> cacheCleanDefaultWhiteList = C2YJ.LIZIZ.LIZ.getCacheCleanDefaultWhiteList();
        o.LJIIIIZZ(cacheCleanDefaultWhiteList, "get().cacheCleanDefaultWhiteList");
        return ORZ.LLJJ(cacheCleanDefaultWhiteList);
    }
}
