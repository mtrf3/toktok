package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gzh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43341Gzh implements H2P {
    public final /* synthetic */ H1V LIZ;

    @Override // X.H2P
    public final void LIZ() {
        H1V h1v = this.LIZ;
        C41604GUm c41604GUm = h1v.LJIILIIL;
        if (c41604GUm != null) {
            GUH.LJIL(h1v.LIZJ.LIZIZ, c41604GUm);
        }
        H1V h1v2 = this.LIZ;
        C87631YaJ c87631YaJ = h1v2.LJIILJJIL;
        if (c87631YaJ != null) {
            c87631YaJ.LJI = false;
        }
        C87614Ya2 c87614Ya2 = h1v2.LJI;
        if (c87614Ya2 != null) {
            C41574GTi c41574GTi = new C41574GTi();
            c41574GTi.LIZ = "cancel_by_hw_fallback";
            c87614Ya2.LIZIZ(c41574GTi.LIZ());
            return;
        }
        o.LJIJI("net");
        throw null;
    }

    public C43341Gzh(H1V h1v) {
        this.LIZ = h1v;
    }

    @Override // X.H2P
    public final void LIZIZ(C43399H1n c43399H1n) {
        H1V h1v = this.LIZ;
        if (h1v.LIZJ.LJI == null) {
            return;
        }
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("restarting wave publisher, previous state: ");
        C87614Ya2 c87614Ya2 = h1v.LJI;
        if (c87614Ya2 != null) {
            LIZ.append(c87614Ya2.LIZJ());
            LIZ.append(", session info: ");
            LIZ.append(c43399H1n);
            LIZIZ.LIZJ("publish_flow_optimization", X1D.LIZIZ(LIZ));
            h1v.LJI(c43399H1n);
            h1v.LJII(GWB.RETRY_BY_PUBLISHER);
            return;
        }
        o.LJIJI("net");
        throw null;
    }
}
