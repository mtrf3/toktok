package X;

import android.content.Context;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.IDqS195S0200000_31;
import kotlin.jvm.internal.IDqS42S0300000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aG6, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92770aG6 extends AbstractC65781Prl implements InterfaceC88472Yns<C91722ZzC, C76800UCe> {
    public final /* synthetic */ CheckoutUiState LJLIL;
    public final /* synthetic */ CheckoutViewModel LJLILLLLZI;
    public final /* synthetic */ C92145a61 LJLJI;
    public final /* synthetic */ C31431Lf LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Context LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92770aG6(CheckoutUiState checkoutUiState, CheckoutViewModel checkoutViewModel, C92145a61 c92145a61, C31431Lf c31431Lf, int i, Context context) {
        super(1);
        this.LJLIL = checkoutUiState;
        this.LJLILLLLZI = checkoutViewModel;
        this.LJLJI = c92145a61;
        this.LJLJJI = c31431Lf;
        this.LJLJJL = i;
        this.LJLJJLL = context;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C91722ZzC c91722ZzC) {
        C91722ZzC AnimatedNavHost = c91722ZzC;
        o.LJIIIZ(AnimatedNavHost, "$this$AnimatedNavHost");
        C91880a1k.LIZIZ(AnimatedNavHost, "checkout_home", C1DJ.LJFF(new C92793aGT(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL), -985530576, true));
        C91880a1k.LIZIZ(AnimatedNavHost, "select_pi", C1DJ.LJFF(new IDqS42S0300000_31(this.LJLJI, this.LJLIL, this.LJLILLLLZI, 3), -985537559, true));
        C91880a1k.LIZIZ(AnimatedNavHost, "select_pi_without_default", C1DJ.LJFF(new IDqS42S0300000_31(this.LJLJI, this.LJLIL, this.LJLILLLLZI, 4), -985537390, true));
        C91880a1k.LIZIZ(AnimatedNavHost, "select_assemble_pi", C1DJ.LJFF(new IDqS42S0300000_31(this.LJLJI, this.LJLIL, this.LJLILLLLZI, 5), -985536481, true));
        C91880a1k.LIZ(AnimatedNavHost, o.LJIILLIIL("/?url={url}&title={title}&quitWithPop={quitWithPop}&disableBackground={disableBackground}&displayBackButton={displayBackButton}&displayCloseButton={displayCloseButton}&hideLoading={hideLoading}", "webview"), C47261Igj.LJJIJIIJI(C91692Zyi.LIZ("url", C92823aGx.LJLIL), C91692Zyi.LIZ("title", C92826aH0.LJLIL), C91692Zyi.LIZ("quitWithPop", C92829aH3.LJLIL), C91692Zyi.LIZ("disableBackground", C92764aG0.LJLIL), C91692Zyi.LIZ("displayBackButton", C92766aG2.LJLIL), C91692Zyi.LIZ("displayCloseButton", C92769aG5.LJLIL), C91692Zyi.LIZ("hideLoading", C92773aG9.LJLIL)), C1DJ.LJFF(new IDqS42S0300000_31(this.LJLILLLLZI, this.LJLJJLL, this.LJLJI, 1), -985534557, true));
        C91880a1k.LIZIZ(AnimatedNavHost, "pay_result", C1DJ.LJFF(new IDqS42S0300000_31(this.LJLIL, this.LJLILLLLZI, this.LJLJJLL, 2), -985546579, true));
        C91880a1k.LIZIZ(AnimatedNavHost, "error_page", C1DJ.LJFF(new IDqS195S0200000_31(this.LJLILLLLZI, this.LJLIL, 1), -985545470, true));
        return C76800UCe.LIZ;
    }
}
