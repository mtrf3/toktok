package X;

/* renamed from: X.YaL, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87633YaL extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C87631YaJ LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87633YaL(C87631YaJ c87631YaJ, Object obj, Object obj2, boolean z, int i, int i2) {
        super(0);
        this.LJLIL = c87631YaJ;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = z;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        AbstractC41873Gc1 LJI = this.LJLIL.LJI();
        if (LJI != null) {
            LJI.LJFF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        }
        return C76800UCe.LIZ;
    }
}
