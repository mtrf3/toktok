package X;

import android.widget.EditText;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TMA implements InterfaceC83564Wqu {
    public final /* synthetic */ TM8 LJLIL;

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
    }

    public TMA(TM8 tm8) {
        this.LJLIL = tm8;
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardHide(int i) {
        this.LJLIL.LIZIZ().K4();
        EditText editText = this.LJLIL.LIZIZ;
        if (editText != null) {
            editText.clearFocus();
        } else {
            o.LJIJI("searchEditView");
            throw null;
        }
    }

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardShow(int i) {
        this.LJLIL.LIZIZ().K4();
    }
}
