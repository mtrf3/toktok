package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxInputView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSD implements TextView.OnEditorActionListener {
    public final /* synthetic */ LynxInputView LJLIL;

    public VSD(LynxInputView lynxInputView) {
        this.LJLIL = lynxInputView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 2 && i != 3 && i != 4 && i != 5 && i != 0) {
            return false;
        }
        LynxInputView lynxInputView = this.LJLIL;
        if (lynxInputView.LJZL) {
            VNU lynxContext = lynxInputView.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(this.LJLIL.getSign(), "confirm");
            C41997Ge1 c41997Ge1 = this.LJLIL.LLIIL;
            String str = null;
            if (c41997Ge1 != null) {
                Editable text = c41997Ge1.getText();
                if (text != null) {
                    str = text.toString();
                }
                c49615Jdb.LIZJ(str, "value");
                vnl.LIZIZ(c49615Jdb);
            } else {
                o.LJIJI("mEditText");
                throw null;
            }
        }
        if (i == 5) {
            return false;
        }
        this.LJLIL.setFocus(false);
        return true;
    }
}
