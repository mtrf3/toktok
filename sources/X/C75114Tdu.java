package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tdu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75114Tdu extends AbstractC76218Tvi<C75091TdX> {
    public InterfaceC75137TeH LJLIL;
    public final View LJLILLLLZI;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLIL = null;
    }

    public C75114Tdu(View view, InterfaceC75137TeH interfaceC75137TeH) {
        super(view);
        this.LJLIL = interfaceC75137TeH;
        View findViewById = view.findViewById(R.id.auv);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.btn_back)");
        this.LJLILLLLZI = findViewById;
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object data) {
        o.LJIIIZ(data, "data");
        o.LJIIIIZZ(this.itemView.findViewById(R.id.cv7), "itemView.findViewById(R.id.empty_container)");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 169), this.LJLILLLLZI);
    }
}
