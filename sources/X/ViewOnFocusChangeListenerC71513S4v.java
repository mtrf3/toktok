package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.S4v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnFocusChangeListenerC71513S4v implements TextWatcher, View.OnFocusChangeListener {
    public EditText LJLIL;
    public TextView LJLILLLLZI;
    public int LJLJI = 100;
    public View.OnFocusChangeListener LJLJJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        TextView textView;
        boolean z;
        if (editable == null || (obj = editable.toString()) == null || (textView = this.LJLILLLLZI) == null) {
            return;
        }
        if (obj.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ(obj.length(), textView, z);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i;
        Editable text;
        View.OnFocusChangeListener onFocusChangeListener = this.LJLJJI;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        if (!o.LJ(view, this.LJLIL)) {
            return;
        }
        boolean z2 = false;
        if (z) {
            EditText editText = this.LJLIL;
            if (editText != null) {
                editText.addTextChangedListener(this);
            }
            EditText editText2 = this.LJLIL;
            if (editText2 != null && (text = editText2.getText()) != null) {
                i = text.length();
            } else {
                i = 0;
            }
            TextView textView = this.LJLILLLLZI;
            if (textView != null) {
                if (i > 0) {
                    z2 = true;
                }
                LIZ(i, textView, z2);
                return;
            }
            return;
        }
        EditText editText3 = this.LJLIL;
        if (editText3 != null) {
            editText3.removeTextChangedListener(this);
        }
        TextView textView2 = this.LJLILLLLZI;
        if (textView2 == null) {
            return;
        }
        LIZ(0, textView2, false);
    }

    public final void LIZ(int i, TextView textView, boolean z) {
        if (z) {
            OUP.LJJLIIIJ(textView);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append('/');
            LIZ.append(this.LJLJI);
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        OUP.LJIJJLI(textView);
        textView.setText("");
    }
}
