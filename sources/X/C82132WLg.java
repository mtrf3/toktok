package X;

import Y.ARunnableS33S0200000_14;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.WLg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82132WLg implements TextWatcher {
    public final /* synthetic */ C83374Wnq LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C83374Wnq c83374Wnq = this.LJLIL;
        c83374Wnq.LJLLJ.mView.post(new ARunnableS33S0200000_14(this.LJLILLLLZI, c83374Wnq, 33));
    }

    public C82132WLg(C83374Wnq c83374Wnq, EditText editText) {
        this.LJLIL = c83374Wnq;
        this.LJLILLLLZI = editText;
    }
}
