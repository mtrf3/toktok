package X;

import android.text.Editable;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* renamed from: X.Wqn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83557Wqn implements InterfaceC85603Xo {
    public final /* synthetic */ C83553Wqj LIZ;

    public C83557Wqn(C83553Wqj c83553Wqj) {
        this.LIZ = c83553Wqj;
    }

    @Override // X.InterfaceC85603Xo
    public final void LIZ(String data) {
        Editable text;
        int i;
        o.LJIIIZ(data, "data");
        EditText editText = this.LIZ.LJLIL;
        if (editText != null && (text = editText.getText()) != null) {
            EditText editText2 = this.LIZ.LJLIL;
            if (editText2 != null) {
                i = editText2.length();
            } else {
                i = 0;
            }
            text.replace(0, i, data);
        }
        this.LIZ.LIZ();
        this.LIZ.setVisibility(8);
    }
}
