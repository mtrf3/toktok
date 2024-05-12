package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Whi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82994Whi implements VJ0 {
    public final /* synthetic */ AbstractC82995Whj LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    @Override // X.VJ0
    public final void LJIILL(String str) {
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, 0, str, 8);
    }

    public C82994Whi(AbstractC82995Whj abstractC82995Whj, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC82995Whj;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.VJ0
    public final void onSuccess(C61335O5j c61335O5j, String msg) {
        o.LJIIJ(msg, "msg");
        java.util.Map LIZ = C61334O5i.LIZ(c61335O5j);
        AbstractC82995Whj abstractC82995Whj = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC82995Whj.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, LIZ);
    }
}
