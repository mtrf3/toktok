package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.VgG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80356VgG implements TextWatcher {
    public final /* synthetic */ C80343Vg3 LJLIL;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C80356VgG(C80343Vg3 c80343Vg3) {
        this.LJLIL = c80343Vg3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        if (this.LJLIL.LIZ.getSuffixText() != null) {
            return;
        }
        C80343Vg3 c80343Vg3 = this.LJLIL;
        if (editable.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        c80343Vg3.LIZLLL(z);
    }
}
