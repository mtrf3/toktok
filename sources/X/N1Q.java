package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1Q extends AbstractC65781Prl implements InterfaceC88472Yns<C58620MzY, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ N1V LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1Q(boolean z, String str, N1V n1v, boolean z2, boolean z3) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
        this.LJLJI = n1v;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C58620MzY c58620MzY) {
        C58620MzY logAd = c58620MzY;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJJLIL, Integer.valueOf(this.LJLIL ? 1 : 0));
        logAd.LJII(C58684N1k.LJJLJ, this.LJLILLLLZI);
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(this.LJLJI.LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, this.LJLJI.LJII);
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(this.LJLJI.LJIILLIIL));
        logAd.LJII(C58684N1k.LJJIIZI, Integer.valueOf(this.LJLJI.LJIILIIL));
        if (!this.LJLJJI) {
            logAd.LJII(C58684N1k.LJJLJLI, Integer.valueOf(!this.LJLJJL ? 1 : 0));
        }
        return C76800UCe.LIZ;
    }
}
