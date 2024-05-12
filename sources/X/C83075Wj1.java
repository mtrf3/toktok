package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Wj1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83075Wj1 implements InterfaceC83079Wj5 {
    public final /* synthetic */ AbstractC83074Wj0 LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZIZ(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C83075Wj1(AbstractC83074Wj0 abstractC83074Wj0, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC83074Wj0;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC83079Wj5
    public final void LIZ(C83077Wj3 c83077Wj3, String msg) {
        o.LJIIJ(msg, "msg");
        if (c83077Wj3.LIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = c83077Wj3.LIZ;
            if (str != null) {
                linkedHashMap.put("status", str);
            }
            Boolean bool = c83077Wj3.LIZIZ;
            if (bool != null) {
                linkedHashMap.put("alreadyLoggedIn", Boolean.valueOf(bool.booleanValue()));
            }
            AbstractC83074Wj0 abstractC83074Wj0 = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
            abstractC83074Wj0.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
            return;
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
