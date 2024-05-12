package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fe0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39448Fe0 {
    public final /* synthetic */ AbstractC39447Fdz LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C39448Fe0(AbstractC39447Fdz abstractC39447Fdz, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC39447Fdz;
        this.LIZIZ = interfaceC31943CgF;
    }

    public final void LIZ(int i, String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, i, str, 8);
    }

    public final void LIZIZ(C39449Fe1 c39449Fe1, String msg) {
        o.LJIIJ(msg, "msg");
        if (c39449Fe1.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Map<String, Object> map = c39449Fe1.LIZ;
            if (map != null) {
                linkedHashMap.put("settings", map);
            }
            AbstractC39447Fdz abstractC39447Fdz = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC39447Fdz.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
