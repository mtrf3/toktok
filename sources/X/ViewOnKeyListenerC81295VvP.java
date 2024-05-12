package X;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: X.VvP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnKeyListenerC81295VvP implements View.OnKeyListener {
    public final /* synthetic */ C81293VvN LJLIL;

    public ViewOnKeyListenerC81295VvP(C81293VvN c81293VvN) {
        this.LJLIL = c81293VvN;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C81293VvN c81293VvN = this.LJLIL;
        if ((!c81293VvN.LLFF && (c81293VvN.LLF || c81293VvN.getTranslationY() >= c81293VvN.LJLLILLLL)) || i != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            this.LJLIL.LIZ(false, true);
        }
        return true;
    }
}
