package X;

import androidx.lifecycle.Observer;

/* renamed from: X.K8q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51228K8q implements Observer<C29615Bjn> {
    public InterfaceC88472Yns<? super C29615Bjn, C76800UCe> LJLIL = C51234K8w.LJLIL;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C29615Bjn c29615Bjn) {
        if (c29615Bjn == null) {
            return;
        }
        this.LJLIL.invoke(c29615Bjn);
    }
}
