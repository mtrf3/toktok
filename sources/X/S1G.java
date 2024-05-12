package X;

/* loaded from: classes13.dex */
public final class S1G extends AbstractC65781Prl implements InterfaceC88474Ynu<Integer, Integer, Integer, Integer, C76800UCe> {
    public final /* synthetic */ S1E LJLIL;
    public final /* synthetic */ C188727au LJLILLLLZI;
    public final /* synthetic */ S1F LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1G(C188727au c188727au, S1F s1f, S1E s1e) {
        super(4);
        this.LJLIL = s1e;
        this.LJLILLLLZI = c188727au;
        this.LJLJI = s1f;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        ((S1T) this.LJLIL).LJJJJJ(num.intValue(), num2.intValue(), 0, num3.intValue(), num4.intValue(), 0);
        this.LJLIL.LJ(this.LJLILLLLZI);
        this.LJLJI.LJIIIIZZ().requestLayout();
        return C76800UCe.LIZ;
    }
}
