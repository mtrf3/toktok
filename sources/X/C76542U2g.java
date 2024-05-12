package X;

import Y.ACListenerS33S0100000_13;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.U2g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76542U2g extends AbstractC76220Tvk<C53606L2c> {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76542U2g(View view, InterfaceC65784Pro<C76800UCe> listener) {
        super(view);
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    @Override // X.AbstractC76220Tvk
    public final void L(int i, Object data) {
        o.LJIIIZ(data, "data");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 221), this.itemView);
    }
}
