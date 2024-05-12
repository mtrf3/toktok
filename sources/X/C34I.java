package X;

/* renamed from: X.34I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34I extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C71052qb LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34I(C71052qb c71052qb, long j, long j2) {
        super(0);
        this.LJLIL = c71052qb;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C34J c34j = this.LJLIL.LJFF;
        if (c34j != null) {
            c34j.onPositionUpdate(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
