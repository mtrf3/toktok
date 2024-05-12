package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.TextView;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VS8 implements TextView.OnEditorActionListener {
    public final /* synthetic */ C41997Ge1 LJLIL;
    public final /* synthetic */ LynxTextAreaView LJLILLLLZI;

    public VS8(C41997Ge1 c41997Ge1, LynxTextAreaView lynxTextAreaView) {
        this.LJLIL = c41997Ge1;
        this.LJLILLLLZI = lynxTextAreaView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        if (i == 6 || i == 2 || i == 3 || i == 4 || i == 5 || i == 0) {
            LynxTextAreaView lynxTextAreaView = this.LJLILLLLZI;
            if (lynxTextAreaView.LJZL) {
                VNU lynxContext = lynxTextAreaView.mContext;
                o.LJFF(lynxContext, "lynxContext");
                VNL vnl = lynxContext.LJLJJL;
                C49615Jdb c49615Jdb = new C49615Jdb(this.LJLILLLLZI.getSign(), "confirm");
                Editable text = this.LJLIL.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                c49615Jdb.LIZJ(str, "value");
                vnl.LIZIZ(c49615Jdb);
                return false;
            }
            return false;
        }
        return false;
    }
}
