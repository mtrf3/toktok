package X;

/* renamed from: X.2L9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2L9 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2L9(String str, int i) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append('_');
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
