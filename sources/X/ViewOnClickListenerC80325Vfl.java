package X;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.Vfl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80325Vfl implements View.OnClickListener {
    public final /* synthetic */ C80326Vfm LJLIL;

    public ViewOnClickListenerC80325Vfl(C80326Vfm c80326Vfm) {
        this.LJLIL = c80326Vfm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText = this.LJLIL.LIZ.getEditText();
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (this.LJLIL.LIZLLL()) {
            editText.setTransformationMethod(null);
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            editText.setSelection(selectionEnd);
        }
        C80315Vfb c80315Vfb = this.LJLIL.LIZ;
        c80315Vfb.LJIIJ(c80315Vfb.LLJ, c80315Vfb.LLJIJIL);
    }
}
