package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.KMj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnKeyListenerC51585KMj implements View.OnKeyListener {
    public final /* synthetic */ C51584KMi LJLIL;

    public ViewOnKeyListenerC51585KMj(C51584KMi c51584KMi) {
        this.LJLIL = c51584KMi;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.LJLIL.LIZIZ && keyEvent.getAction() == 1 && i == 4) {
            this.LJLIL.LIZJ();
            return true;
        }
        return false;
    }
}
