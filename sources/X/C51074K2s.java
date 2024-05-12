package X;

import androidx.lifecycle.Observer;

/* renamed from: X.K2s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51074K2s implements Observer<C31610Cas> {
    public InterfaceC88472Yns<? super C31610Cas, C76800UCe> LJLIL = C51077K2v.LJLIL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C31610Cas c31610Cas) {
        if (c31610Cas == null) {
            return;
        }
        this.LJLIL.invoke(c31610Cas);
    }
}
