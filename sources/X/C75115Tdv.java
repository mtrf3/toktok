package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75115Tdv extends AbstractC76218Tvi<C75090TdW> {
    public final View LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final View LJLJI;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLILLLLZI = null;
    }

    public C75115Tdv(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(view);
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC65784Pro;
        View findViewById = view.findViewById(R.id.aup);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_allow)");
        this.LJLJI = findViewById;
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object data) {
        o.LJIIIZ(data, "data");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 130), this.LJLJI);
    }
}
