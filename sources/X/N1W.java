package X;

import android.webkit.WebBackForwardList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1W extends AbstractC65781Prl implements InterfaceC88472Yns<C58620MzY, C76800UCe> {
    public final /* synthetic */ N1V LJLIL;
    public final /* synthetic */ C72242sW LJLILLLLZI;
    public final /* synthetic */ C72242sW LJLJI;
    public final /* synthetic */ WebBackForwardList LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ C68322mC<String> LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1W(N1V n1v, C72242sW c72242sW, C72242sW c72242sW2, WebBackForwardList webBackForwardList, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, String str) {
        super(1);
        this.LJLIL = n1v;
        this.LJLILLLLZI = c72242sW;
        this.LJLJI = c72242sW2;
        this.LJLJJI = webBackForwardList;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = c68322mC2;
        this.LJLJL = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C58620MzY c58620MzY) {
        int i;
        C58620MzY logAd = c58620MzY;
        o.LJIIIZ(logAd, "$this$logAd");
        C58684N1k.LIZ.getClass();
        logAd.LJII(C58684N1k.LJIILJJIL, Integer.valueOf(this.LJLIL.LIZIZ));
        logAd.LJII(C58684N1k.LJIILL, this.LJLIL.LJII);
        logAd.LJII(C58684N1k.LJJI, this.LJLIL.LJII);
        logAd.LJII(C58684N1k.LJIILLIIL, Long.valueOf(this.LJLILLLLZI.element));
        logAd.LJII(C58684N1k.LJIJJ, Long.valueOf(this.LJLJI.element));
        logAd.LJII(C58684N1k.LJIJJLI, Long.valueOf(System.currentTimeMillis() - this.LJLIL.LJIIIIZZ));
        logAd.LJII(C58684N1k.LJJIIZI, Integer.valueOf(this.LJLIL.LJIILIIL));
        C56593MIz c56593MIz = C58684N1k.LJJIJ;
        WebBackForwardList webBackForwardList = this.LJLJJI;
        if (webBackForwardList != null) {
            i = webBackForwardList.getSize();
        } else {
            i = -1;
        }
        logAd.LJII(c56593MIz, Integer.valueOf(i));
        logAd.LJII(C58684N1k.LJJIJIIJI, this.LJLJJL.element);
        logAd.LJII(C58684N1k.LJJIJIIJIL, this.LJLJJLL.element);
        logAd.LJII(C58684N1k.LJJIJIL, Integer.valueOf(this.LJLIL.LJIILLIIL));
        logAd.LJII(C58684N1k.LJJJJL, "iab");
        logAd.LJII(C58684N1k.LIZLLL, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
