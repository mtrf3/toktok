package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xz7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86621Xz7 implements InterfaceC86632XzI {
    public final /* synthetic */ AbstractC86619Xz5 LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    @Override // X.InterfaceC86632XzI
    public final void LJIILL(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C86621Xz7(AbstractC86619Xz5 abstractC86619Xz5, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86619Xz5;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC86632XzI
    public final void LIZ(C79508VIi c79508VIi, String msg) {
        o.LJIIJ(msg, "msg");
        if (c79508VIi.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c79508VIi.LIZ;
            if (str != null) {
                linkedHashMap.put("result", str);
            }
            AbstractC86619Xz5 abstractC86619Xz5 = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC86619Xz5.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
