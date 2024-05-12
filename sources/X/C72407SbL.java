package X;

/* renamed from: X.SbL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72407SbL extends AbstractC65781Prl implements InterfaceC88472Yns<Float, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ A90 LJLILLLLZI;
    public final /* synthetic */ C56K LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72407SbL(float f, A90 a90, C56K c56k) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = a90;
        this.LJLJI = c56k;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Float f) {
        float floatValue = f.floatValue();
        A90 a90 = this.LJLILLLLZI;
        C56K c56k = this.LJLJI;
        float f2 = this.LJLIL;
        float f3 = (1.0f / f2) * 100;
        float f4 = 100.0f;
        if (f3 < 100.0f) {
            f4 = C43881HKb.LIZ(1, f2, floatValue, f3);
        }
        if (a90.isShowing() && f4 > c56k.element) {
            c56k.element = f4;
            a90.LIZLLL(f4);
        }
        return C76800UCe.LIZ;
    }
}
