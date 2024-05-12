package X;

/* renamed from: X.QdN, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67437QdN implements InterfaceC67459Qdj<C67379QcR> {
    public final C4G1<InterfaceC67370QcI> LIZ;
    public final C4G1<InterfaceC67370QcI> LIZIZ;
    public final C4G1<AbstractC67423Qd9> LIZJ;
    public final C4G1<C79383VDn> LIZLLL;
    public final C4G1<String> LJ;

    @Override // X.C4G1
    public final Object get() {
        InterfaceC67469Qdt c67427QdD;
        InterfaceC67370QcI interfaceC67370QcI = this.LIZ.get();
        InterfaceC67370QcI interfaceC67370QcI2 = this.LIZIZ.get();
        AbstractC67423Qd9 abstractC67423Qd9 = this.LIZJ.get();
        C79383VDn c79383VDn = this.LIZLLL.get();
        C4G1<String> c4g1 = this.LJ;
        if (c4g1 instanceof InterfaceC67469Qdt) {
            c67427QdD = (InterfaceC67469Qdt) c4g1;
        } else {
            c4g1.getClass();
            c67427QdD = new C67427QdD(c4g1);
        }
        return new C67379QcR(interfaceC67370QcI, interfaceC67370QcI2, abstractC67423Qd9, c79383VDn, c67427QdD);
    }

    public C67437QdN(C67447QdX c67447QdX, C67445QdV c67445QdV) {
        C67456Qdg c67456Qdg = C67467Qdr.LIZ;
        C67457Qdh c67457Qdh = C67468Qds.LIZ;
        C67436QdM c67436QdM = C67466Qdq.LIZ;
        this.LIZ = c67456Qdg;
        this.LIZIZ = c67457Qdh;
        this.LIZJ = c67436QdM;
        this.LIZLLL = c67447QdX;
        this.LJ = c67445QdV;
    }
}
