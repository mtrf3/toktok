package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O00 implements O01 {
    public final /* synthetic */ O03 LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "getGeckoInfo ability is not implemented", 8);
    }

    public O00(O03 o03, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = o03;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.O01
    public final void LIZ(C61195Nzz c61195Nzz, String msg) {
        o.LJIIJ(msg, "msg");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = c61195Nzz.LIZ;
        if (bool != null) {
            linkedHashMap.put("needUpdate", Boolean.valueOf(bool.booleanValue()));
        }
        Long l = c61195Nzz.LIZIZ;
        if (l != null) {
            linkedHashMap.put("totalSize", Long.valueOf(l.longValue()));
        }
        String str = c61195Nzz.LIZJ;
        if (str != null) {
            linkedHashMap.put("version", str);
        }
        linkedHashMap.put("status", Integer.valueOf(c61195Nzz.LJ.getValue()));
        Long l2 = c61195Nzz.LIZLLL;
        if (l2 != null) {
            linkedHashMap.put("localVersion", Long.valueOf(l2.longValue()));
        }
        O03 o03 = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        o03.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
    }
}
