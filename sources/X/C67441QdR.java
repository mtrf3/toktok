package X;

import android.content.Context;

/* renamed from: X.QdR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67441QdR implements InterfaceC67459Qdj<LD7> {
    public final C4G1<Context> LIZ;
    public final C4G1<InterfaceC67397Qcj> LIZIZ;
    public final C4G1<AbstractC67420Qd6> LIZJ;
    public final C4G1<InterfaceC67370QcI> LIZLLL;

    @Override // X.C4G1
    public final Object get() {
        Context context = this.LIZ.get();
        InterfaceC67397Qcj interfaceC67397Qcj = this.LIZIZ.get();
        AbstractC67420Qd6 abstractC67420Qd6 = this.LIZJ.get();
        this.LIZLLL.get();
        return new C67418Qd4(context, interfaceC67397Qcj, abstractC67420Qd6);
    }

    public C67441QdR(C4G1 c4g1, C4G1 c4g12, C67426QdC c67426QdC) {
        C67457Qdh c67457Qdh = C67468Qds.LIZ;
        this.LIZ = c4g1;
        this.LIZIZ = c4g12;
        this.LIZJ = c67426QdC;
        this.LIZLLL = c67457Qdh;
    }
}
