package X;

/* renamed from: X.Ptd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65897Ptd extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65897Ptd(int i, boolean z) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addInterceptor id: ");
        LIZ.append(this.LJLIL);
        LIZ.append(" result: ");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
