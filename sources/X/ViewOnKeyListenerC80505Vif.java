package X;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;

/* renamed from: X.Vif, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnKeyListenerC80505Vif implements TextView.OnEditorActionListener, View.OnKeyListener {
    public final C80503Vid LJLIL;
    public final C80503Vid LJLILLLLZI;
    public final TimeModel LJLJI;
    public boolean LJLJJI;

    public final void LIZ(int i) {
        boolean z;
        C80503Vid c80503Vid = this.LJLILLLLZI;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        c80503Vid.setChecked(z);
        C80503Vid c80503Vid2 = this.LJLIL;
        if (i != 10) {
            z2 = false;
        }
        c80503Vid2.setChecked(z2);
        this.LJLJI.LJLJJI = i;
    }

    public ViewOnKeyListenerC80505Vif(C80503Vid c80503Vid, C80503Vid c80503Vid2, TimeModel timeModel) {
        this.LJLIL = c80503Vid;
        this.LJLILLLLZI = c80503Vid2;
        this.LJLJI = timeModel;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            LIZ(12);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.LJLJJI) {
            return false;
        }
        boolean z = true;
        this.LJLJJI = true;
        EditText editText = (EditText) view;
        if (this.LJLJI.LJLJJI == 12) {
            if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                LIZ(10);
            }
            z = false;
        } else {
            Editable text = editText.getText();
            if (text != null && i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                LIZ(12);
            }
            z = false;
        }
        this.LJLJJI = false;
        return z;
    }
}
