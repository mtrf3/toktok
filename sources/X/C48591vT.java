package X;

/* renamed from: X.1vT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48591vT extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public final /* synthetic */ double LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ double LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48591vT(double d, double d2, double d3, double d4) {
        super(1);
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
        this.LJLJJI = d4;
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Double d) {
        double doubleValue = d.doubleValue();
        double d2 = this.LJLIL;
        double d3 = this.LJLILLLLZI;
        double exp = Math.exp(d3 * doubleValue) * d2 * d3;
        double d4 = this.LJLJI;
        double d5 = this.LJLJJI;
        return Double.valueOf((Math.exp(d5 * doubleValue) * d4 * d5) + exp);
    }
}
