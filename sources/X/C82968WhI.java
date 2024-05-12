package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WhI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82968WhI implements InterfaceC82969WhJ {
    public final /* synthetic */ AbstractC82971WhL LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public final void LIZIZ() {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, "Context not provided in host", 8);
    }

    public C82968WhI(AbstractC82971WhL abstractC82971WhL, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82971WhL;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC82969WhJ
    public final void LIZ(C79501VIb c79501VIb, String msg) {
        o.LJIIJ(msg, "msg");
        String str = c79501VIb.LIZ;
        if (str != null) {
            try {
                String upperCase = str.toUpperCase();
                o.LJFF(upperCase, "(this as java.lang.String).toUpperCase()");
                VFP.valueOf(upperCase);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str2 = c79501VIb.LIZ;
                if (str2 != null) {
                    linkedHashMap.put("action", str2);
                    AbstractC82971WhL abstractC82971WhL = this.LIZ;
                    InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
                    abstractC82971WhL.getClass();
                    AbstractC37780EsC.LJI(interfaceC31943CgF, msg, linkedHashMap);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            } catch (Exception unused) {
            }
        }
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, -5, null, 12);
    }
}
