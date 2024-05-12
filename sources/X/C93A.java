package X;

/* renamed from: X.93A, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93A extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93A(int i, int i2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("instructionCount=");
        LIZ.append(this.LJLIL + this.LJLILLLLZI);
        LIZ.append(", historyCount=");
        LIZ.append(this.LJLIL);
        LIZ.append(", optionCount=");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
