package X;

/* loaded from: classes10.dex */
public final class LS0 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LS0(int i, int i2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        int i;
        int i2 = this.LJLIL;
        if (i2 != 99 && i2 != 101) {
            i = 1;
        } else {
            i = 3;
        }
        C54262LRi c54262LRi = new C54262LRi(i);
        LVL lvl = LVL.LJLIL;
        int i3 = this.LJLIL;
        int i4 = this.LJLILLLLZI;
        lvl.getClass();
        LVL.LJJIIZ(i3, i4, c54262LRi);
        LVL.LJJIIJ().put(Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI));
        c54262LRi.LIZLLL(this.LJLIL, this.LJLILLLLZI);
        c54262LRi.post();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setNoticeCount end ");
        LIZ.append(c54262LRi);
        C221018lt.LJFF("NCManager", X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }
}
