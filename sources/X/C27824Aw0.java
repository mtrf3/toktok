package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Aw0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27824Aw0 implements InterfaceC025208a {
    public final /* synthetic */ OrderSubmitActivity LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;

    public C27824Aw0(OrderSubmitActivity orderSubmitActivity, C76732zl c76732zl) {
        this.LJLIL = orderSubmitActivity;
        this.LJLILLLLZI = c76732zl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC025208a
    public final void onBackStackChanged() {
        int LJJJJIZL = this.LJLIL.getSupportFragmentManager().LJJJJIZL();
        if (LJJJJIZL > 0) {
            Fragment LJJJIL = this.LJLIL.getSupportFragmentManager().LJJJIL(this.LJLIL.getSupportFragmentManager().LJJJJI(LJJJJIZL - 1).getName());
            if (LJJJIL != 0 && (LJJJIL instanceof InterfaceC27825Aw1)) {
                ((InterfaceC27825Aw1) LJJJIL).onVisible();
            }
            InterfaceC36571c5 interfaceC36571c5 = this.LJLIL.LJLJLLL;
            if (interfaceC36571c5 != null && (interfaceC36571c5 instanceof InterfaceC27825Aw1)) {
                ((InterfaceC27825Aw1) interfaceC36571c5).onInVisible();
            }
            this.LJLIL.LJLJLLL = LJJJIL;
        }
        if (LJJJJIZL <= this.LJLILLLLZI.element) {
            if (LJJJJIZL == 0) {
                OrderSubmitViewModel LLII = this.LJLIL.LLII();
                LLII.getClass();
                if (o.LJ(null, "order_submit_fragment")) {
                    LLII.LLI = false;
                }
                LLII.setState(new AqS170S0100000_4((C27822Avy) null, 1241));
            } else {
                C08Y LJJJJI = this.LJLIL.getSupportFragmentManager().LJJJJI(this.LJLIL.getSupportFragmentManager().LJJJJIZL() - 1);
                o.LJIIIIZZ(LJJJJI, "supportFragmentManager.g….backStackEntryCount - 1)");
                OrderSubmitViewModel LLII2 = this.LJLIL.LLII();
                String name = LJJJJI.getName();
                if (name == null) {
                    name = "";
                }
                C27822Avy c27822Avy = new C27822Avy(name, true);
                LLII2.getClass();
                if (o.LJ(c27822Avy.LIZ, "order_submit_fragment")) {
                    LLII2.LLI = false;
                }
                LLII2.setState(new AqS170S0100000_4(c27822Avy, 1241));
            }
        }
        this.LJLILLLLZI.element = LJJJJIZL;
    }
}
