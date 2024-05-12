package X;

/* renamed from: X.EuG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37908EuG implements InterfaceC37916EuO {
    public final /* synthetic */ OSZ LIZ;
    public final /* synthetic */ C37905EuD LIZIZ;

    public C37908EuG(OSZ osz, C37905EuD c37905EuD) {
        this.LIZ = osz;
        this.LIZIZ = c37905EuD;
    }

    @Override // X.InterfaceC37916EuO
    public final void LJI(C37911EuJ c37911EuJ, C37955Ev1 c37955Ev1) {
        String str = this.LIZIZ.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dealWithCloseEvent, bridgeName: ");
        LIZ.append((String) this.LIZ.getFirst());
        LIZ.append("}, result: ");
        LIZ.append(c37911EuJ.toString());
        C37887Etv.LIZ(str, X1D.LIZIZ(LIZ));
    }
}
