package X;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: X.Vff, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80319Vff implements TextWatcher {
    public final /* synthetic */ C80315Vfb LJLIL;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C80319Vff(C80315Vfb c80315Vfb) {
        this.LJLIL = c80315Vfb;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.LJLIL.LJIJ(!r2.LLLFFI, false);
        C80315Vfb c80315Vfb = this.LJLIL;
        if (c80315Vfb.LJLJLJ) {
            c80315Vfb.LJIILIIL(editable.length());
        }
        C80315Vfb c80315Vfb2 = this.LJLIL;
        if (c80315Vfb2.LJLLLL) {
            c80315Vfb2.LJIJI(editable.length());
        }
    }
}
