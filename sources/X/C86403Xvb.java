package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xvb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86403Xvb implements InterfaceC86407Xvf {
    public final /* synthetic */ AbstractC86404Xvc LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C86403Xvb(AbstractC86404Xvc abstractC86404Xvc, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86404Xvc;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC86407Xvf
    public final void onFailure(int i, String msg) {
        o.LJIIJ(msg, "msg");
        AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, i, msg, 8);
    }

    @Override // X.InterfaceC86407Xvf
    public final void onSuccess(C61335O5j result, String msg) {
        o.LJIIJ(result, "result");
        o.LJIIJ(msg, "msg");
        java.util.Map LIZ = C61334O5i.LIZ(result);
        AbstractC86404Xvc abstractC86404Xvc = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC86404Xvc.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, LIZ);
    }
}
