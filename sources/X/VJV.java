package X;

/* loaded from: classes15.dex */
public final class VJV extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ VJT LJLILLLLZI;
    public final /* synthetic */ java.util.Map LJLJI;
    public final /* synthetic */ VJR LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VJV(int i, VJT vjt, java.util.Map map, VJR vjr) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = vjt;
        this.LJLJI = map;
        this.LJLJJI = vjr;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Bucket ");
        LIZ.append(this.LJLIL);
        LIZ.append(" is not running and receive a head task, execute ");
        LIZ.append(this.LJLILLLLZI.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
