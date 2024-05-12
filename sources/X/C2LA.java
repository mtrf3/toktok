package X;

/* renamed from: X.2LA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2LA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2LA(int i, String str, String str2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger ");
        LIZ.append(this.LJLIL);
        LIZ.append(' ');
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(' ');
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }
}
