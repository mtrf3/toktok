package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Et5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37835Et5 {
    public final /* synthetic */ AbstractC37834Et4 LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C37835Et5(AbstractC37834Et4 abstractC37834Et4, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC37834Et4;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZ(C37836Et6 c37836Et6, String msg) {
        o.LJIIJ(msg, "msg");
        Boolean bool = c37836Et6.LIZ;
        if (bool != null) {
            bool.booleanValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool2 = c37836Et6.LIZ;
            if (bool2 != null) {
                linkedHashMap.put("isAvailable", bool2);
                linkedHashMap.put("params", c37836Et6.LIZIZ);
                linkedHashMap.put("results", c37836Et6.LIZJ);
                AbstractC37834Et4 abstractC37834Et4 = this.LIZ;
                InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                abstractC37834Et4.getClass();
                AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
