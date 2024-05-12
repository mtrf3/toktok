package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92794aGU extends AbstractC65781Prl implements InterfaceC88472Yns<C91722ZzC, C76800UCe> {
    public final /* synthetic */ C92145a61 LJLIL;
    public final /* synthetic */ C92204a6y LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLJJI;
    public final /* synthetic */ C08370Un LJLJJL;
    public final /* synthetic */ PIViewModel LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ C05P LJLJLJ;
    public final /* synthetic */ View LJLJLLL;
    public final /* synthetic */ Boolean LJLL;
    public final /* synthetic */ C92330a90 LJLLI;
    public final /* synthetic */ InterfaceC35811ar<Boolean> LJLLILLLL;
    public final /* synthetic */ Boolean LJLLJ;
    public final /* synthetic */ float LJLLL;
    public final /* synthetic */ int LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92794aGU(C92145a61 c92145a61, C92204a6y c92204a6y, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC35811ar<Boolean> interfaceC35811ar, C08370Un c08370Un, PIViewModel pIViewModel, int i, C05P c05p, View view, Boolean bool, C92330a90 c92330a90, InterfaceC35811ar<Boolean> interfaceC35811ar2, Boolean bool2, float f, int i2) {
        super(1);
        this.LJLIL = c92145a61;
        this.LJLILLLLZI = c92204a6y;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC35811ar;
        this.LJLJJL = c08370Un;
        this.LJLJJLL = pIViewModel;
        this.LJLJL = i;
        this.LJLJLJ = c05p;
        this.LJLJLLL = view;
        this.LJLL = bool;
        this.LJLLI = c92330a90;
        this.LJLLILLLL = interfaceC35811ar2;
        this.LJLLJ = bool2;
        this.LJLLL = f;
        this.LJLLLL = i2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C91722ZzC c91722ZzC) {
        C91722ZzC AnimatedNavHost = c91722ZzC;
        o.LJIIIZ(AnimatedNavHost, "$this$AnimatedNavHost");
        C40431iJ LJFF = C1DJ.LJFF(new C92804aGe(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL), -985535091, true);
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        C91880a1k.LIZJ(AnimatedNavHost, "available_methods", c61878OQg, LJFF);
        C91880a1k.LIZJ(AnimatedNavHost, "form_page", c61878OQg, C1DJ.LJFF(new C92767aG3(this.LJLJJLL, this.LJLL, this.LJLJI, this.LJLIL, this.LJLLI, this.LJLJJL, this.LJLJL, this.LJLLILLLL, this.LJLJLJ, this.LJLJLLL), -985542187, true));
        C91880a1k.LIZJ(AnimatedNavHost, o.LJIILLIIL("/?url={url}&title={title}&quitWithPop={quitWithPop}&disableBackground={disableBackground}", "webview"), C47261Igj.LJJIJIIJI(C91692Zyi.LIZ("url", C92772aG8.LJLIL), C91692Zyi.LIZ("title", C92776aGC.LJLIL), C91692Zyi.LIZ("quitWithPop", C92779aGF.LJLIL), C91692Zyi.LIZ("disableBackground", C92786aGM.LJLIL)), C1DJ.LJFF(new C92791aGR(this.LJLJJLL, this.LJLLJ, this.LJLIL, this.LJLLL, this.LJLJJL, this.LJLJI, this.LJLLLL, this.LJLJL), -985543185, true));
        C91880a1k.LIZJ(AnimatedNavHost, "error_page", c61878OQg, C1DJ.LJFF(new C92792aGS(this.LJLJJLL, this.LJLJI, this.LJLJL), -985550009, true));
        return C76800UCe.LIZ;
    }
}
