package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: X.0FE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0FE implements TextWatcher {
    public final EditText LJLIL;
    public C1EA LJLJI;
    public final boolean LJLILLLLZI = false;
    public boolean LJLJJI = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C0FE(EditText editText) {
        this.LJLIL = editText;
    }

    public static void LIZ(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            f LIZ = f.LIZ();
            if (editableText == null) {
                length = 0;
            } else {
                LIZ.getClass();
                length = editableText.length();
            }
            LIZ.LJI(0, length, editableText);
            if (selectionStart >= 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                    return;
                } else {
                    Selection.setSelection(editableText, selectionStart);
                    return;
                }
            }
            if (selectionEnd < 0) {
                return;
            }
            Selection.setSelection(editableText, selectionEnd);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1EA] */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.LJLIL.isInEditMode() && this.LJLJJI) {
            if ((!this.LJLILLLLZI && !f.LIZJ()) || i2 > i3 || !(charSequence instanceof Spannable)) {
                return;
            }
            int LIZIZ = f.LIZ().LIZIZ();
            if (LIZIZ != 0) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 3) {
                        return;
                    }
                } else {
                    f.LIZ().LJI(i, i3 + i, charSequence);
                    return;
                }
            }
            f LIZ = f.LIZ();
            if (this.LJLJI == null) {
                final EditText editText = this.LJLIL;
                this.LJLJI = new AnonymousClass089(editText) { // from class: X.1EA
                    public final Reference<EditText> LIZ;

                    @Override // X.AnonymousClass089
                    public final void LIZIZ() {
                        C0FE.LIZ(this.LIZ.get(), 1);
                    }

                    {
                        this.LIZ = new WeakReference(editText);
                    }
                };
            }
            LIZ.LJII(this.LJLJI);
        }
    }
}
