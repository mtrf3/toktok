package X;

import Y.ACListenerS47S0200000_13;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75117Tdx extends AbstractC76218Tvi<C74899TaR> {
    public final View LJLIL;
    public InterfaceC75126Te6 LJLILLLLZI;
    public final View LJLJI;
    public final View LJLJJI;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLILLLLZI = null;
    }

    public C75117Tdx(View view, InterfaceC75126Te6 interfaceC75126Te6) {
        super(view);
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC75126Te6;
        View findViewById = view.findViewById(R.id.man);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_load_more)");
        this.LJLJI = findViewById;
        View findViewById2 = view.findViewById(R.id.e9p);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.ic_load_more)");
        this.LJLJJI = findViewById2;
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C74899TaR data = (C74899TaR) obj;
        o.LJIIIZ(data, "data");
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(this, data, 40), this.LJLJI);
        C16880lQ.LJIIJ(new ACListenerS47S0200000_13(this, data, 41), this.LJLJJI);
    }
}
