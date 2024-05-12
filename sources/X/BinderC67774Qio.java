package X;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: X.Qio, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67774Qio extends BinderC67788Qj2 {
    public final WeakReference<C67761Qib> LJLIL;

    public BinderC67774Qio(C67761Qib c67761Qib) {
        this.LJLIL = new WeakReference<>(c67761Qib);
    }

    @Override // X.InterfaceC67967Qlv
    public final void LLIIJLIL(zak zakVar) {
        C67761Qib c67761Qib = this.LJLIL.get();
        if (c67761Qib == null) {
            return;
        }
        c67761Qib.LIZ.LJIIIIZZ(new C67768Qii(c67761Qib, c67761Qib, zakVar));
    }
}
