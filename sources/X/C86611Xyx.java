package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Xyx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86611Xyx implements InterfaceC86631XzH {
    public final /* synthetic */ AbstractC86600Xym LIZ;
    public final /* synthetic */ C86609Xyv LIZIZ;
    public final /* synthetic */ EnumC37847EtH LIZJ;
    public final /* synthetic */ InterfaceC31943CgF LIZLLL;

    @Override // X.InterfaceC86631XzH
    public final void LIZIZ(C86616Xz2 c86616Xz2, String msg) {
        o.LJIIJ(msg, "msg");
        java.util.Map LIZ = C86617Xz3.LIZ(c86616Xz2);
        if (LIZ == null) {
            this.LIZ.LJIIIZ(-5, this.LIZIZ.LIZ(), this.LIZIZ.getUrl(), "Invalid results", -1, this.LIZJ.name());
            AbstractC37780EsC.LJFF(this.LIZ, this.LIZLLL, -5, null, 12);
        } else {
            AbstractC86600Xym abstractC86600Xym = this.LIZ;
            InterfaceC31943CgF interfaceC31943CgF = this.LIZLLL;
            abstractC86600Xym.getClass();
            AbstractC37780EsC.LJI(interfaceC31943CgF, msg, LIZ);
        }
    }

    @Override // X.InterfaceC86631XzH
    public final void LIZ(int i, String msg, C86616Xz2 c86616Xz2) {
        java.util.Map linkedHashMap;
        o.LJIIJ(msg, "msg");
        if (c86616Xz2 != null) {
            linkedHashMap = C86617Xz3.LIZ(c86616Xz2);
            if (linkedHashMap == null) {
                AbstractC37780EsC.LJFF(this.LIZ, this.LIZLLL, i, msg, 8);
                return;
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        AbstractC86600Xym abstractC86600Xym = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZLLL;
        abstractC86600Xym.getClass();
        AbstractC37780EsC.LJ(interfaceC31943CgF, i, msg, linkedHashMap);
    }

    public C86611Xyx(AbstractC86600Xym abstractC86600Xym, C86609Xyv c86609Xyv, EnumC37847EtH enumC37847EtH, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86600Xym;
        this.LIZIZ = c86609Xyv;
        this.LIZJ = enumC37847EtH;
        this.LIZLLL = interfaceC31943CgF;
    }
}
