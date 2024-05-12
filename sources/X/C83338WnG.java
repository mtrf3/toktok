package X;

import Y.ACListenerS34S0100000_14;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.WnG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83338WnG extends RecyclerView.ViewHolder {
    public final InterfaceC83334WnC LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83338WnG(View view, InterfaceC83334WnC onItemClickListener) {
        super(view);
        o.LJIIIZ(onItemClickListener, "onItemClickListener");
        this.LJLIL = onItemClickListener;
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 109), view);
    }
}
