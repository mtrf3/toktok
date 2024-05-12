package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WhP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82975WhP {
    public final /* synthetic */ AbstractC82976WhQ LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C82975WhP(AbstractC82976WhQ abstractC82976WhQ, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82976WhQ;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZ(C79504VIe c79504VIe, String msg) {
        o.LJIIJ(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = c79504VIe.LIZ;
        if (obj != null) {
            linkedHashMap.put("data", obj);
        }
        AbstractC82976WhQ abstractC82976WhQ = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC82976WhQ.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
    }
}
