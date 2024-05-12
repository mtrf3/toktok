package X;

import Y.ARunnableS10S0101000_6;
import android.text.Editable;

/* loaded from: classes15.dex */
public final class VY0 extends VY1 {
    public final /* synthetic */ ViewOnTouchListenerC82857WfV LJLIL;

    public VY0(ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV) {
        this.LJLIL = viewOnTouchListenerC82857WfV;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.LJLIL.LJLLILLLL.post(new ARunnableS10S0101000_6(3, this, 9));
    }
}
