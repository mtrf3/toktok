package X;

/* renamed from: X.25B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25B extends AbstractC65781Prl implements InterfaceC88472Yns<C10430b1, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ InterfaceC35811ar<C10430b1> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25B(float f, InterfaceC35811ar<C10430b1> interfaceC35811ar) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = interfaceC35811ar;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C10430b1 c10430b1) {
        long j = c10430b1.LIZ;
        float LIZLLL = C10430b1.LIZLLL(j) * this.LJLIL;
        float LIZIZ = C10430b1.LIZIZ(j) * this.LJLIL;
        if (C10430b1.LIZLLL(this.LJLILLLLZI.getValue().LIZ) != LIZLLL || C10430b1.LIZIZ(this.LJLILLLLZI.getValue().LIZ) != LIZIZ) {
            this.LJLILLLLZI.setValue(new C10430b1(C1DF.LIZIZ(LIZLLL, LIZIZ)));
        }
        return C76800UCe.LIZ;
    }
}
