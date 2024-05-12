package X;

/* renamed from: X.22D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22D extends AbstractC65781Prl implements InterfaceC65784Pro<Double> {
    public final /* synthetic */ C22K LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ double LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22D(C22K c22k, String str, double d) {
        super(0);
        this.LJLIL = c22k;
        this.LJLILLLLZI = str;
        this.LJLJI = d;
    }

    @Override // X.InterfaceC65784Pro
    public final Double invoke() {
        double d;
        d = super/*X.1mf*/.getDouble(this.LJLILLLLZI, this.LJLJI);
        return Double.valueOf(d);
    }
}
