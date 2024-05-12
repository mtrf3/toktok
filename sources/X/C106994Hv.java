package X;

/* renamed from: X.4Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106994Hv extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C4I1 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106994Hv(String str, boolean z, C73434Sru c73434Sru) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = c73434Sru;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C106844Hg.LIZJ(this.LJLIL, "success", null, this.LJLILLLLZI);
        ((C73434Sru) this.LJLJI).onComplete();
        return C76800UCe.LIZ;
    }
}
