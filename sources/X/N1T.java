package X;

import com.ss.android.ugc.aweme.log.AdWebLogModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1T extends AbstractC65781Prl implements InterfaceC88472Yns<C58620MzY, C76800UCe> {
    public final /* synthetic */ N1V LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ AdWebLogModel LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ AdWebLogModel LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1T(N1V n1v, long j, long j2, String str, int i, AdWebLogModel adWebLogModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, AdWebLogModel adWebLogModel2) {
        super(1);
        this.LJLIL = n1v;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = adWebLogModel;
        this.LJLJL = interfaceC65784Pro;
        this.LJLJLJ = adWebLogModel2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C58620MzY c58620MzY) {
        C58620MzY logAd = c58620MzY;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(this.LJLIL.LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, this.LJLIL.LJII);
        logAd.LJII(C58684N1k.LJIILLIIL, Long.valueOf(this.LJLILLLLZI));
        logAd.LJII(C58684N1k.LJIIZILJ, Long.valueOf(this.LJLIL.LIZJ));
        logAd.LJII(C58684N1k.LJIJ, Long.valueOf(this.LJLIL.LJ));
        logAd.LJII(C58684N1k.LJIJI, Long.valueOf(this.LJLJI));
        logAd.LJII(C58684N1k.LJJIIJ, this.LJLJJI);
        logAd.LJII(C58684N1k.LJJIIJZLJL, Integer.valueOf(this.LJLJJL));
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(this.LJLIL.LJIILLIIL));
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LJJIFFI, Integer.valueOf(this.LJLJJLL.getPreloadH5Type()));
        logAd.LJII(C58684N1k.LJJII, Integer.valueOf(this.LJLIL.LJIIZILJ));
        logAd.LJII(C58684N1k.LJJIII, Integer.valueOf(this.LJLIL.LJIJ));
        this.LJLJL.invoke();
        N1O.LIZ = this.LJLJLJ;
        N1V n1v = this.LJLIL;
        N1O.LIZIZ = n1v.LIZIZ;
        N1O.LIZJ = 2;
        N1O.LIZLLL = n1v.LJII;
        N1O.LJ = Integer.valueOf(n1v.LJIILLIIL);
        return C76800UCe.LIZ;
    }
}
