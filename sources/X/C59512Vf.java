package X;

/* renamed from: X.2Vf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59512Vf extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59512Vf(long j, String str, String str2) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j = this.LJLIL;
        if (j >= 0 && j <= 10000) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
            c188727au.LJIIIZ("enter_method", this.LJLJI);
            c188727au.LJ(this.LJLIL, "widget_cost");
            FMX.LJIIL("recommend_diagnosis", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }
}
