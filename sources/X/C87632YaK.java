package X;

/* renamed from: X.YaK, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87632YaK extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C87631YaJ LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ERR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87632YaK(C87631YaJ c87631YaJ, Object obj, ERR err) {
        super(0);
        this.LJLIL = c87631YaJ;
        this.LJLILLLLZI = obj;
        this.LJLJI = err;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AbstractC41873Gc1 LJI = this.LJLIL.LJI();
        if (LJI != null) {
            LJI.LJ(this.LJLILLLLZI, this.LJLJI);
        }
        return C76800UCe.LIZ;
    }
}
