package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xyc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86590Xyc implements InterfaceC45882Hza {
    public final /* synthetic */ AbstractC86588Xya LIZ;
    public final /* synthetic */ InterfaceC31943CgF LIZIZ;

    public C86590Xyc(AbstractC86588Xya abstractC86588Xya, InterfaceC31943CgF interfaceC31943CgF) {
        this.LIZ = abstractC86588Xya;
        this.LIZIZ = interfaceC31943CgF;
    }

    @Override // X.InterfaceC45882Hza
    public final void LIZIZ(C86593Xyf c86593Xyf, String msg) {
        o.LJIIJ(msg, "msg");
        java.util.Map LIZ = C86594Xyg.LIZ(c86593Xyf);
        AbstractC86588Xya abstractC86588Xya = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC86588Xya.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, msg, LIZ);
    }

    @Override // X.InterfaceC45882Hza
    public final void LIZ(int i, String msg, C86593Xyf c86593Xyf) {
        o.LJIIJ(msg, "msg");
        if (c86593Xyf == null) {
            AbstractC37780EsC.LJFF(this.LIZ, this.LIZIZ, i, msg, 8);
            return;
        }
        java.util.Map LIZ = C86594Xyg.LIZ(c86593Xyf);
        AbstractC86588Xya abstractC86588Xya = this.LIZ;
        InterfaceC31943CgF interfaceC31943CgF = this.LIZIZ;
        abstractC86588Xya.getClass();
        AbstractC37780EsC.LJ(interfaceC31943CgF, i, msg, LIZ);
    }
}
