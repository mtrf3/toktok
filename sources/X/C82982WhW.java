package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WhW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82982WhW {
    public final /* synthetic */ AbstractC82981WhV LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "Context not provided in host", 8);
    }

    public C82982WhW(AbstractC82981WhV abstractC82981WhV, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82981WhV;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZIZ(C82983WhX c82983WhX, String msg) {
        o.LJIIJ(msg, "msg");
        if (c82983WhX.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<String> list = c82983WhX.LIZ;
            if (list != null) {
                linkedHashMap.put("keys", list);
            }
            AbstractC82981WhV abstractC82981WhV = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC82981WhV.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
