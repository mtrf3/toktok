package X;

/* loaded from: classes8.dex */
public final class HP9 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C43933HMb LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HP9(int i, C43933HMb c43933HMb, int i2, String str) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = c43933HMb;
        this.LJLJI = i2;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("media selection blocked by duration limit, errorCode=");
        LIZ.append(this.LJLIL);
        LIZ.append(", checkInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", minDuration=");
        LIZ.append(this.LJLJI);
        LIZ.append(",message=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", scene=showImportErrorToast, callStacktrace=");
        LIZ.append(android.util.Log.getStackTraceString(new Throwable()));
        return X1D.LIZIZ(LIZ);
    }
}
