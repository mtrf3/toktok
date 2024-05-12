package X;

import android.text.Editable;
import kotlin.jvm.internal.o;

/* renamed from: X.Xm7, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85815Xm7 extends C9X0 {
    public final /* synthetic */ C85812Xm4 LJLIL;

    public C85815Xm7(C85812Xm4 c85812Xm4) {
        this.LJLIL = c85812Xm4;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        this.LJLIL.LJLJLLL.LIZJ();
        C74088T5w c74088T5w = this.LJLIL.LJLJJLL;
        String str = null;
        if (c74088T5w != null) {
            if (editable != null) {
                str = editable.toString();
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            c74088T5w.setEnabled(true ^ z);
            return;
        }
        o.LJIJI("loadingButton");
        throw null;
    }
}
