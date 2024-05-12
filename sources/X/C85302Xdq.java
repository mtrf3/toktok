package X;

/* renamed from: X.Xdq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85302Xdq extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C61101NyT LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C85258Xd8 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85302Xdq(C61101NyT c61101NyT, C72242sW c72242sW, boolean z, C85258Xd8 c85258Xd8) {
        super(0);
        this.LJLIL = c61101NyT;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = z;
        this.LJLJJI = c85258Xd8;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        String str2;
        String str3;
        C61101NyT c61101NyT = this.LJLIL;
        if (c61101NyT != null) {
            c61101NyT.LIZIZ();
        }
        this.LJLILLLLZI.element = System.currentTimeMillis();
        if (this.LJLJI) {
            C85258Xd8 c85258Xd8 = this.LJLJJI;
            Boolean bool = null;
            if (c85258Xd8 != null) {
                str = c85258Xd8.LIZ;
                str2 = c85258Xd8.LIZIZ;
                str3 = c85258Xd8.LIZJ;
                bool = Boolean.valueOf(c85258Xd8.LJ);
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            C85299Xdn.LJ(bool, str, str2, str3);
        }
        return C76800UCe.LIZ;
    }
}
