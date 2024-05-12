package X;

import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ryd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71303Ryd implements InterfaceC73206SoE {
    public final ViewGroup LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final View LJLJI;
    public final C8ID LJLJJI;

    @Override // X.InterfaceC73206SoE
    public final View getView() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC73206SoE
    public final void LIZIZ(int i) {
        switch (i) {
            case 241:
                this.LJLJJI.setVisibility(8);
                this.LJLJI.findViewById(R.id.g92).setVisibility(8);
                return;
            case 242:
                this.LJLJJI.setVisibility(0);
                this.LJLJI.findViewById(R.id.g92).setVisibility(8);
                return;
            case 243:
                this.LJLJJI.setVisibility(8);
                this.LJLJI.findViewById(R.id.g92).setVisibility(8);
                return;
            case 244:
                this.LJLJJI.setVisibility(8);
                this.LJLJI.findViewById(R.id.g92).setVisibility(0);
                C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 158), this.LJLJI);
                return;
            default:
                return;
        }
    }

    public C71303Ryd(ViewGroup container, InterfaceC65784Pro onRetry) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(container.getContext()), R.layout.zv, container, false);
        o.LJIIIIZZ(LLLLIILL, "from(container.context).…g_view, container, false)");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(onRetry, "onRetry");
        this.LJLIL = container;
        this.LJLILLLLZI = onRetry;
        this.LJLJI = LLLLIILL;
        View findViewById = LLLLIILL.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.loading_view)");
        this.LJLJJI = (C8ID) findViewById;
    }
}
