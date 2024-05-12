package X;

/* renamed from: X.1vR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48571vR extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public final /* synthetic */ double LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48571vR(double d, double d2, double d3) {
        super(1);
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Double d) {
        double doubleValue = d.doubleValue();
        double d2 = this.LJLIL;
        double d3 = this.LJLILLLLZI;
        double d4 = doubleValue * d3;
        return Double.valueOf(Math.exp(d4) * ((this.LJLJI * d3) + ((1 + d4) * d2)));
    }
}
