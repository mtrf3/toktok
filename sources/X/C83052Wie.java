package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wie, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83052Wie implements InterfaceC83055Wih {
    public final /* synthetic */ AbstractC83051Wid LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZIZ(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C83052Wie(AbstractC83051Wid abstractC83051Wid, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC83051Wid;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC83055Wih
    public final void LIZ(C79506VIg c79506VIg, String msg) {
        o.LJIIJ(msg, "msg");
        if (c79506VIg.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c79506VIg.LIZ;
            if (str != null) {
                linkedHashMap.put("status", str);
            }
            AbstractC83051Wid abstractC83051Wid = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC83051Wid.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
