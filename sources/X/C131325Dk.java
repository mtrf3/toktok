package X;

/* renamed from: X.5Dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131325Dk extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, Float, C76800UCe> {
    public final /* synthetic */ C56K LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131325Dk(C56K c56k, C76732zl c76732zl, int i) {
        super(2);
        this.LJLIL = c56k;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Float f) {
        boolean booleanValue = bool.booleanValue();
        this.LJLIL.element += f.floatValue();
        if (this.LJLILLLLZI.element >= this.LJLJI) {
            StringBuilder LJI = JBR.LJI("isRough: ", booleanValue, ", total average cost: ");
            LJI.append(this.LJLIL.element / this.LJLILLLLZI.element);
            C131935Ft.LJ("VideoFrameCache", X1D.LIZIZ(LJI));
            this.LJLILLLLZI.element = 0;
        }
        return C76800UCe.LIZ;
    }
}
