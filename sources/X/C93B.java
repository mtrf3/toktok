package X;

/* renamed from: X.93B, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C93B extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93B(boolean z, boolean z2, boolean z3) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needTrans = ");
        LIZ.append(this.LJLIL);
        LIZ.append(", outOfFrequncy = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", inShowSet = ");
        LIZ.append(this.LJLJI);
        return X1D.LIZIZ(LIZ);
    }
}
