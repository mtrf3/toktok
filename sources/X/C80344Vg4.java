package X;

import android.text.Editable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* renamed from: X.Vg4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80344Vg4 extends C80335Vfv {
    public final /* synthetic */ C80342Vg2 LJLIL;

    public C80344Vg4(C80342Vg2 c80342Vg2) {
        this.LJLIL = c80342Vg2;
    }

    @Override // X.C80335Vfv, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        EditText editText = this.LJLIL.LIZ.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (this.LJLIL.LJIILIIL.isTouchExplorationEnabled() && autoCompleteTextView.getKeyListener() != null && !this.LJLIL.LIZJ.hasFocus()) {
                autoCompleteTextView.dismissDropDown();
            }
            autoCompleteTextView.post(new RunnableC80351VgB(this, autoCompleteTextView));
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
