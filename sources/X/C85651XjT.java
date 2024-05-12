package X;

import android.text.Editable;

/* renamed from: X.XjT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85651XjT extends C9X0 {
    public final /* synthetic */ C85648XjQ LJLIL;

    public C85651XjT(C85648XjQ c85648XjQ) {
        this.LJLIL = c85648XjQ;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        this.LJLIL.LJLJJI.LIZ();
        C74088T5w c74088T5w = this.LJLIL.LJLJJL;
        boolean z = false;
        if (editable != null && (obj = editable.toString()) != null && obj.length() > 0) {
            z = true;
        }
        c74088T5w.setEnabled(z);
    }
}
