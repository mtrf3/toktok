package X;

import java.util.concurrent.Executor;

/* renamed from: X.QdS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67442QdS implements InterfaceC67459Qdj<C67384QcW> {
    public final C4G1<Executor> LIZ;
    public final C4G1<InterfaceC67483Qe7> LIZIZ;
    public final C4G1<LD7> LIZJ;
    public final C4G1<InterfaceC67397Qcj> LIZLLL;
    public final C4G1<PSE> LJ;

    @Override // X.C4G1
    public final Object get() {
        return new C67384QcW(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get(), this.LJ.get());
    }

    public C67442QdS(C4G1 c4g1, C4G1 c4g12, C67441QdR c67441QdR, C4G1 c4g13, C4G1 c4g14) {
        this.LIZ = c4g1;
        this.LIZIZ = c4g12;
        this.LIZJ = c67441QdR;
        this.LIZLLL = c4g13;
        this.LJ = c4g14;
    }
}
