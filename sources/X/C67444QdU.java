package X;

import java.util.concurrent.Executor;

/* renamed from: X.QdU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67444QdU implements InterfaceC67459Qdj<LFG> {
    public final C4G1<Executor> LIZ;
    public final C4G1<InterfaceC67397Qcj> LIZIZ;
    public final C4G1<LD7> LIZJ;
    public final C4G1<PSE> LIZLLL;

    @Override // X.C4G1
    public final Object get() {
        return new LFG(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
    }

    public C67444QdU(C4G1 c4g1, C4G1 c4g12, C67441QdR c67441QdR, C4G1 c4g13) {
        this.LIZ = c4g1;
        this.LIZIZ = c4g12;
        this.LIZJ = c67441QdR;
        this.LIZLLL = c4g13;
    }
}
