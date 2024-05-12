package X;

/* renamed from: X.5VP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5VP extends AbstractC65781Prl implements InterfaceC88472Yns<Float, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C43544H7c LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5VP(int i, C76732zl c76732zl, boolean z, C43544H7c c43544H7c) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = z;
        this.LJLJJI = c43544H7c;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Float f) {
        int floatValue = (int) (f.floatValue() * this.LJLIL);
        int i = floatValue - this.LJLILLLLZI.element;
        if (i > 0) {
            if (!this.LJLJI) {
                this.LJLJJI.LJJII(i);
            }
            this.LJLILLLLZI.element = floatValue;
        }
        return C76800UCe.LIZ;
    }
}
