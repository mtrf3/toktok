package X;

/* renamed from: X.I2z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45985I2z implements WSJ {
    public final /* synthetic */ C45984I2y LIZ;

    public C45985I2z(C45984I2y c45984I2y) {
        this.LIZ = c45984I2y;
    }

    @Override // X.WSJ
    public final boolean onTabSelected(WSF wsf, I34 i34) {
        C45984I2y c45984I2y = this.LIZ;
        ((InterfaceC45979I2t) c45984I2y.LJLJJLL.LIZ(c45984I2y, C45984I2y.LJLJL[0])).showComplexTab(0, i34.LIZJ);
        return true;
    }

    @Override // X.WSJ
    public final boolean onTabUnselected(WSF wsf, I34 i34) {
        C45984I2y c45984I2y = this.LIZ;
        ((InterfaceC45979I2t) c45984I2y.LJLJJLL.LIZ(c45984I2y, C45984I2y.LJLJL[0])).showComplexTab(8, i34.LIZJ);
        return false;
    }
}
