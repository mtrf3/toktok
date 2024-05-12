package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.VgI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnFocusChangeListenerC80358VgI implements View.OnFocusChangeListener {
    public final /* synthetic */ C80343Vg3 LJLIL;

    public ViewOnFocusChangeListenerC80358VgI(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
        C80343Vg3 c80343Vg3 = this.LJLIL;
        if (!z3 || !z) {
            z2 = false;
        }
        c80343Vg3.LIZLLL(z2);
    }
}
