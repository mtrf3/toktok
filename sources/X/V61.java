package X;

/* loaded from: classes14.dex */
public final class V61 extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ Integer LJLIL;
    public final /* synthetic */ V63 LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C79187V5z LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V61(Integer num, V63 v63, Integer num2, boolean z, C79187V5z c79187V5z, boolean z2, String str, long j, int i) {
        super(2);
        this.LJLIL = num;
        this.LJLILLLLZI = v63;
        this.LJLJI = num2;
        this.LJLJJI = z;
        this.LJLJJL = c79187V5z;
        this.LJLJJLL = z2;
        this.LJLJL = str;
        this.LJLJLJ = j;
        this.LJLJLLL = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        long j;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if ((num.intValue() & 11) != 2 || !interfaceC24520xk2.LIZ()) {
            float f = 0;
            if (this.LJLIL != null) {
                f += this.LJLILLLLZI.LJ + 4;
            }
            if (this.LJLJI != null) {
                f += this.LJLILLLLZI.LJ + 4;
            }
            float f2 = this.LJLILLLLZI.LIZIZ - f;
            if (this.LJLJJI || this.LJLJJLL) {
                j = this.LJLJJL.LIZ;
            } else {
                j = this.LJLJJL.LJII;
            }
            C79053V0v.LIZIZ(this.LJLJL, C09290Yb.LJIIZILJ(C09290Yb.LJIILJJIL(InterfaceC07790Sh.LJJJI, f2 - 16)), j, this.LJLILLLLZI.LIZLLL, this.LJLJLJ, null, 2, false, 1, true, null, null, null, interfaceC24520xk2, ((this.LJLJLLL >> 3) & 14) | 907542528, 0, 7328);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
