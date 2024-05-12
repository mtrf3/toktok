package X;

/* renamed from: X.PuB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65931PuB extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ PYQ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65931PuB(boolean z, String str, String str2, int i, PYQ pyq) {
        super(0);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = pyq;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" \n========================================================(NetworkPipeline)\n");
        if (this.LJLIL) {
            str = "filterAllowNetworkEvent: true";
        } else {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(" id: ");
        LIZ.append(this.LJLJJI);
        LIZ.append(" uuid: ");
        LIZ.append(this.LJLJJL.LJJJJL().LL);
        LIZ.append("\ntype: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" subType: ");
        return JBR.LJFF(LIZ, this.LJLJI, "\n========================================================", LIZ);
    }
}
