package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.QdQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67440QdQ implements InterfaceC67459Qdj<C67380QcS> {
    public final C4G1<Context> LIZ;
    public final C4G1<InterfaceC67483Qe7> LIZIZ;
    public final C4G1<InterfaceC67397Qcj> LIZJ;
    public final C4G1<LD7> LIZLLL;
    public final C4G1<Executor> LJ;
    public final C4G1<PSE> LJFF;
    public final C4G1<InterfaceC67370QcI> LJI;
    public final C4G1<InterfaceC67370QcI> LJII;
    public final C4G1<InterfaceC66854QLq> LJIIIIZZ;

    @Override // X.C4G1
    public final Object get() {
        return new C67380QcS(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get(), this.LJ.get(), this.LJFF.get(), this.LJI.get(), this.LJII.get(), this.LJIIIIZZ.get());
    }

    public C67440QdQ(C4G1 c4g1, C4G1 c4g12, C4G1 c4g13, C67441QdR c67441QdR, C4G1 c4g14, C4G1 c4g15, C4G1 c4g16) {
        C67456Qdg c67456Qdg = C67467Qdr.LIZ;
        C67457Qdh c67457Qdh = C67468Qds.LIZ;
        this.LIZ = c4g1;
        this.LIZIZ = c4g12;
        this.LIZJ = c4g13;
        this.LIZLLL = c67441QdR;
        this.LJ = c4g14;
        this.LJFF = c4g15;
        this.LJI = c67456Qdg;
        this.LJII = c67457Qdh;
        this.LJIIIIZZ = c4g16;
    }
}
