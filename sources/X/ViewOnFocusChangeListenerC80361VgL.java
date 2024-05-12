package X;

import android.view.View;

/* renamed from: X.VgL, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnFocusChangeListenerC80361VgL implements View.OnFocusChangeListener {
    public final /* synthetic */ C80342Vg2 LJLIL;

    public ViewOnFocusChangeListenerC80361VgL(C80342Vg2 c80342Vg2) {
        this.LJLIL = c80342Vg2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        this.LJLIL.LIZ.setEndIconActivated(z);
        if (!z) {
            this.LJLIL.LJ(false);
            this.LJLIL.LJIIIIZZ = false;
        }
    }
}
