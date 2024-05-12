package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y8P {
    public final /* synthetic */ Y8M LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public Y8P(Y8M y8m, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = y8m;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZ(Y8R y8r, String msg) {
        Boolean bool;
        o.LJIIJ(msg, "msg");
        Boolean bool2 = y8r.LIZ;
        if (bool2 != null) {
            bool2.booleanValue();
            if (y8r.LIZIZ != null && (bool = y8r.LIZJ) != null) {
                bool.booleanValue();
                if (y8r.LIZLLL != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool3 = y8r.LIZ;
                    if (bool3 != null) {
                        linkedHashMap.put("useBOE", bool3);
                        String str = y8r.LIZIZ;
                        if (str != null) {
                            linkedHashMap.put("boeChannel", str);
                            Boolean bool4 = y8r.LIZJ;
                            if (bool4 != null) {
                                linkedHashMap.put("usePPE", bool4);
                                String str2 = y8r.LIZLLL;
                                if (str2 != null) {
                                    linkedHashMap.put("ppeChannel", str2);
                                    Y8M y8m = this.LIZ;
                                    InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                                    y8m.getClass();
                                    AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                                    return;
                                }
                                o.LJIIZILJ();
                                throw null;
                            }
                            o.LJIIZILJ();
                            throw null;
                        }
                        o.LJIIZILJ();
                        throw null;
                    }
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
