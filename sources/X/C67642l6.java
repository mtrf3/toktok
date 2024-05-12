package X;

/* renamed from: X.2l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67642l6 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67642l6(int i, int i2) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("navigation change ");
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
