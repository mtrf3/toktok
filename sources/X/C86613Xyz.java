package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86613Xyz implements InterfaceC86630XzG {
    public final /* synthetic */ AbstractC86604Xyq LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C86613Xyz(AbstractC86604Xyq abstractC86604Xyq, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86604Xyq;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC86630XzG
    public final void LIZ(C86622Xz8 c86622Xz8, String msg) {
        o.LJIIJ(msg, "msg");
        if (c86622Xz8.LIZ != null && c86622Xz8.LIZLLL != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c86622Xz8.LIZ;
            if (str != null) {
                linkedHashMap.put("httpCode", str);
                String str2 = c86622Xz8.LIZLLL;
                if (str2 != null) {
                    linkedHashMap.put("filePath", str2);
                    int i = c86622Xz8.LIZIZ;
                    if (i == null) {
                        i = 0;
                    }
                    linkedHashMap.put("clientCode", i);
                    java.util.Map<String, ? extends Object> map = c86622Xz8.LIZJ;
                    if (map != null) {
                        linkedHashMap.put("header", map);
                    }
                    AbstractC86604Xyq abstractC86604Xyq = this.LIZ;
                    InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                    abstractC86604Xyq.getClass();
                    AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }

    @Override // X.InterfaceC86630XzG
    public final void onFailure(int i, String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, i, str, 8);
    }
}
