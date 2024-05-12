package X;

/* renamed from: X.1vS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48581vS extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public final /* synthetic */ double LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ double LJLJJI;
    public final /* synthetic */ double LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48581vS(double d, double d2, double d3, double d4, double d5) {
        super(1);
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
        this.LJLJJI = d4;
        this.LJLJJL = d5;
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Double d) {
        double doubleValue = d.doubleValue();
        return Double.valueOf((Math.exp(this.LJLJJI * doubleValue) * this.LJLJI) + (Math.exp(this.LJLILLLLZI * doubleValue) * this.LJLIL) + this.LJLJJL);
    }
}
