package X;

import android.text.Editable;
import android.view.View;

/* renamed from: X.Vfq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80330Vfq implements View.OnClickListener {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public ViewOnClickListenerC80330Vfq(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text = this.LJLIL.LIZ.getEditText().getText();
        if (text != null) {
            text.clear();
        }
        C80315Vfb c80315Vfb = this.LJLIL.LIZ;
        c80315Vfb.LJIIJ(c80315Vfb.LLJ, c80315Vfb.LLJIJIL);
    }
}
