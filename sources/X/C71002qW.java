package X;

/* renamed from: X.2qW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71002qW extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C71052qb LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71002qW(int i, int i2, int i3, C71052qb c71052qb) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = c71052qb;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setServerListener onError serviceId: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", what: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" extra: ");
        LIZ.append(this.LJLJI);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        C71052qb c71052qb = this.LJLJJI;
        InterfaceC71012qX interfaceC71012qX = c71052qb.LJ;
        if (interfaceC71012qX != null) {
            interfaceC71012qX.LIZ(this.LJLIL, c71052qb.LJIIIIZZ);
        }
        return C76800UCe.LIZ;
    }
}
