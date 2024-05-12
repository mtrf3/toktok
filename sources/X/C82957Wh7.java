package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wh7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82957Wh7 {
    public final /* synthetic */ AbstractC82961WhB LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C82957Wh7(AbstractC82961WhB abstractC82961WhB, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82961WhB;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZ(C79502VIc c79502VIc, String msg) {
        o.LJIIJ(msg, "msg");
        if (c79502VIc.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map<String, ? extends Object> map = c79502VIc.LIZ;
            if (map != null) {
                linkedHashMap.put("apiParams", map);
            }
            AbstractC82961WhB abstractC82961WhB = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC82961WhB.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
