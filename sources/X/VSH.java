package X;

import android.text.Editable;
import android.view.View;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VSH implements View.OnFocusChangeListener {
    public final /* synthetic */ C41997Ge1 LJLIL;
    public final /* synthetic */ LynxBaseInputView LJLILLLLZI;

    public VSH(C41997Ge1 c41997Ge1, LynxBaseInputView lynxBaseInputView) {
        this.LJLIL = c41997Ge1;
        this.LJLILLLLZI = lynxBaseInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        String str = null;
        if (z) {
            LynxBaseInputView lynxBaseInputView = this.LJLILLLLZI;
            if (lynxBaseInputView.LJZ) {
                VNU lynxContext = lynxBaseInputView.mContext;
                o.LJFF(lynxContext, "lynxContext");
                VNL vnl = lynxContext.LJLJJL;
                C49615Jdb c49615Jdb = new C49615Jdb(this.LJLILLLLZI.getSign(), "focus");
                Editable text = this.LJLIL.getText();
                if (text != null) {
                    str = text.toString();
                }
                c49615Jdb.LIZJ(str, "value");
                vnl.LIZIZ(c49615Jdb);
            }
            if (this.LJLILLLLZI.LLIIIL.LIZ()) {
                this.LJLILLLLZI.LLIIIL.LJ();
                return;
            }
            return;
        }
        LynxBaseInputView lynxBaseInputView2 = this.LJLILLLLZI;
        if (!lynxBaseInputView2.LJZI) {
            return;
        }
        VNU lynxContext2 = lynxBaseInputView2.mContext;
        o.LJFF(lynxContext2, "lynxContext");
        VNL vnl2 = lynxContext2.LJLJJL;
        C49615Jdb c49615Jdb2 = new C49615Jdb(this.LJLILLLLZI.getSign(), "blur");
        Editable text2 = this.LJLIL.getText();
        if (text2 != null) {
            str = text2.toString();
        }
        c49615Jdb2.LIZJ(str, "value");
        vnl2.LIZIZ(c49615Jdb2);
    }
}
