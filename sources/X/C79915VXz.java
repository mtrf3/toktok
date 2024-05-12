package X;

import Y.ARunnableS18S0101000_14;
import android.text.Editable;

/* renamed from: X.VXz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79915VXz extends VY1 {
    public final /* synthetic */ ViewOnTouchListenerC82857WfV LJLIL;

    public C79915VXz(ViewOnTouchListenerC82857WfV viewOnTouchListenerC82857WfV) {
        this.LJLIL = viewOnTouchListenerC82857WfV;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.LJLIL.LJLLJ.post(new ARunnableS18S0101000_14(1, this, 24));
    }
}
