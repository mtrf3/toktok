package X;

import Y.ACListenerS33S0100000_13;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75844Tpg extends AbstractC31414CUo<C75766ToQ, C75845Tph> {
    public final InterfaceC75846Tpi LIZIZ;

    public C75844Tpg(InterfaceC75846Tpi listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZIZ = listener;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C75845Tph holder, C75766ToQ user) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(user, "user");
        C16880lQ.LJIIJ(new ACListenerS33S0100000_13(this, 201), holder.itemView);
    }

    @Override // X.AbstractC31414CUo
    public final C75845Tph LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(layoutInflater, R.layout.d83, parent, false);
        o.LJIIIIZZ(view, "view");
        return new C75845Tph(view);
    }
}
