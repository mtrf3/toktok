package X;

import android.text.Editable;

/* renamed from: X.SDg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71732SDg extends C113664d8 {
    public final /* synthetic */ C71731SDf LJLIL;

    public C71732SDg(C71731SDf c71731SDf) {
        this.LJLIL = c71731SDf;
    }

    @Override // X.C113664d8, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.LJLIL.getEnableAutoHide()) {
            C71731SDf c71731SDf = this.LJLIL;
            c71731SDf.setIndicatorVisible(c71731SDf.LJLILLLLZI.invoke().booleanValue());
        }
    }
}
