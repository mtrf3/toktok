package X;

/* renamed from: X.SYk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72282SYk extends AbstractC65781Prl implements InterfaceC65784Pro<C72291SYt> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C76732zl LJLJJI;
    public final /* synthetic */ C76732zl LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ C76732zl LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72282SYk(C76732zl c76732zl, int i, C76732zl c76732zl2, C76732zl c76732zl3, C76732zl c76732zl4, C76732zl c76732zl5, C76732zl c76732zl6) {
        super(0);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = i;
        this.LJLJI = c76732zl2;
        this.LJLJJI = c76732zl3;
        this.LJLJJL = c76732zl4;
        this.LJLJJLL = c76732zl5;
        this.LJLJL = c76732zl6;
    }

    @Override // X.InterfaceC65784Pro
    public final C72291SYt invoke() {
        float f = this.LJLIL.element * 1.0f;
        float f2 = this.LJLILLLLZI;
        return new C72291SYt(f / f2, (this.LJLJI.element * 1.0f) / f2, (this.LJLJJI.element * 1.0f) / f2, (this.LJLJJL.element * 1.0f) / f2, (this.LJLJJLL.element * 1.0f) / f2, (this.LJLJL.element * 1.0f) / f2);
    }
}
