package X;

import android.view.View;
import android.widget.AutoCompleteTextView;

/* renamed from: X.VgH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80357VgH implements View.OnClickListener {
    public final /* synthetic */ C80342Vg2 LJLIL;

    public ViewOnClickListenerC80357VgH(C80342Vg2 c80342Vg2) {
        this.LJLIL = c80342Vg2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.LJFF((AutoCompleteTextView) this.LJLIL.LIZ.getEditText());
    }
}
