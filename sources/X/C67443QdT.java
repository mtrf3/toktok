package X;

import android.content.Context;

/* renamed from: X.QdT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67443QdT implements InterfaceC67459Qdj<C67470Qdu> {
    public final C4G1<Context> LIZ;
    public final C4G1<InterfaceC67370QcI> LIZIZ;
    public final C4G1<InterfaceC67370QcI> LIZJ;

    @Override // X.C4G1
    public final Object get() {
        return new C67470Qdu(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get());
    }

    public C67443QdT(C67448QdY c67448QdY) {
        C67456Qdg c67456Qdg = C67467Qdr.LIZ;
        C67457Qdh c67457Qdh = C67468Qds.LIZ;
        this.LIZ = c67448QdY;
        this.LIZIZ = c67456Qdg;
        this.LIZJ = c67457Qdh;
    }
}
