package X;

/* renamed from: X.Cnm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32410Cnm extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C32399Cnb LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ AbstractC32415Cnr LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32410Cnm(C32399Cnb c32399Cnb, long j, String str, AbstractC32415Cnr abstractC32415Cnr) {
        super(0);
        this.LJLIL = c32399Cnb;
        this.LJLILLLLZI = j;
        this.LJLJI = str;
        this.LJLJJI = abstractC32415Cnr;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C32399Cnb c32399Cnb = this.LJLIL;
        if (c32399Cnb != null) {
            c32399Cnb.LJII = true;
            c32399Cnb.LJIIJJI = this.LJLILLLLZI;
            c32399Cnb.LIZIZ(EnumC32408Cnk.DONE);
        }
        C32399Cnb c32399Cnb2 = this.LJLIL;
        if (c32399Cnb2 != null) {
            String str = this.LJLJI;
            if (str == null) {
                str = "";
            }
            c32399Cnb2.LJIIJ = str;
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LJLJJI;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ(c32399Cnb2);
        }
        return C76800UCe.LIZ;
    }
}
