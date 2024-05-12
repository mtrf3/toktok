package X;

import android.view.View;

/* renamed from: X.U2s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnLongClickListenerC76554U2s implements View.OnLongClickListener {
    public final /* synthetic */ C76549U2n LJLIL;

    public ViewOnLongClickListenerC76554U2s(C76549U2n c76549U2n) {
        this.LJLIL = c76549U2n;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C1C8 LJ;
        InterfaceC76555U2t interfaceC76555U2t = this.LJLIL.LJLIL;
        if (interfaceC76555U2t != null && (LJ = interfaceC76555U2t.LJ()) != null) {
            LJ.LJIJI(this.LJLIL);
            return false;
        }
        return false;
    }
}
