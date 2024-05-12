package X;

import android.text.Editable;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VS9 implements InterfaceC41548GSi {
    public final /* synthetic */ LynxTextAreaView LIZ;

    @Override // X.InterfaceC41548GSi
    public final boolean LIZ() {
        Editable text = LynxTextAreaView.LJJIJIL(this.LIZ).getText();
        boolean z = false;
        if (text == null || text.length() != 0) {
            loop0: while (true) {
                z = false;
                for (VSC vsc : this.LIZ.LLILII) {
                    if (!z) {
                        Editable text2 = LynxTextAreaView.LJJIJIL(this.LIZ).getText();
                        if (text2 != null) {
                            o.LJFF(text2, "mEditText.text!!");
                            if (vsc.LIZ(text2)) {
                            }
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    }
                    z = true;
                }
            }
        }
        return z;
    }

    public VS9(LynxTextAreaView lynxTextAreaView) {
        this.LIZ = lynxTextAreaView;
    }
}
