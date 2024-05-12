package X;

/* loaded from: classes12.dex */
public final class PZT extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZT(C76732zl c76732zl, long j) {
        super(0);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("httpEngineField tryCost:");
        LIZ.append(this.LJLIL.element);
        LIZ.append(" bodyDelayInterval:");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
