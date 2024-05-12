package X;

/* loaded from: classes12.dex */
public final class PU5 implements InterfaceC64509PTl<Object> {
    public final /* synthetic */ XJL<Object> LIZ;

    public PU5(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZ(C32420Cnw c32420Cnw, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("suspendProduce onProgress ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LLLLIIIILLL());
        C0NB.LJIIIZ("GiftFileDownloadUtils", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZIZ(C32420Cnw c32420Cnw, C32425Co1 c32425Co1) {
        if (!this.LIZ.isActive()) {
            return;
        }
        XJL<Object> xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(c32425Co1);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("suspendProduce onFailure ");
        LIZ2.append(c32425Co1);
        LIZ2.append(' ');
        LIZ2.append(C16880lQ.LLLLIIIILLL());
        C0NB.LJIIIZ("GiftFileDownloadUtils", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC64509PTl
    public final void LIZJ(C32420Cnw c32420Cnw, Object obj) {
        if (this.LIZ.isActive()) {
            XJL<Object> xjl = this.LIZ;
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
        }
    }
}
