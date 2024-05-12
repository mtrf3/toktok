package X;

import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtU, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91368ZtU extends RecyclerView.ViewHolder implements InterfaceC91083Zot {
    public final View LJLIL;

    public C91368ZtU(View view) {
        super(view);
        this.LJLIL = view;
    }

    @Override // X.InterfaceC91083Zot
    public final void setConfig(C91084Zou config) {
        InterfaceC91083Zot interfaceC91083Zot;
        o.LJIIIZ(config, "config");
        KeyEvent.Callback callback = this.LJLIL;
        if ((callback instanceof InterfaceC91083Zot) && (interfaceC91083Zot = (InterfaceC91083Zot) callback) != null) {
            interfaceC91083Zot.setConfig(config);
        }
    }
}
