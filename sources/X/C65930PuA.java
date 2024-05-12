package X;

/* renamed from: X.PuA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65930PuA extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ PYQ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65930PuA(PYQ pyq, long j, long j2, long j3) {
        super(0);
        this.LJLIL = pyq;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================\ndelayInterval id: ");
        LIZ.append(this.LJLIL.LJJJJL().LJLIL.LIZ);
        LIZ.append(" interval: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" beforeDelayInterval: ");
        LIZ.append(this.LJLJI);
        LIZ.append(" afterDelayInterval: ");
        LIZ.append(this.LJLJJI);
        LIZ.append(" uuid: ");
        return JBR.LJFF(LIZ, this.LJLIL.LJJJJL().LL, "\n========================================================", LIZ);
    }
}
