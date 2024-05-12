package X;

import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes15.dex */
public class VZ0 implements View.OnKeyListener {
    public final /* synthetic */ AbstractC79941VYz LJLIL;

    public VZ0(AbstractC79941VYz abstractC79941VYz) {
        this.LJLIL = abstractC79941VYz;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            this.LJLIL.LJ();
            return false;
        }
        return false;
    }
}
