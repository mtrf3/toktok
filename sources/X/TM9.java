package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ TM8 LJLIL;

    public TM9(TM8 tm8) {
        this.LJLIL = tm8;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String obj;
        if (i != 3) {
            return false;
        }
        TM8 tm8 = this.LJLIL;
        EditText editText = tm8.LIZIZ;
        if (editText != null) {
            Editable text = editText.getText();
            if (text == null || (obj = text.toString()) == null || obj.length() == 0) {
                TMB.LIZIZ(C82890Wg2.LJFF, tm8.LJIILIIL.getContext(), R.string.tc6).LIZ();
            } else {
                tm8.LJFF(obj);
            }
            return true;
        }
        o.LJIJI("searchEditView");
        throw null;
    }
}
