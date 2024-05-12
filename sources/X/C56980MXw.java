package X;

import Y.IDLListenerS60S0200000_9;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.MXw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56980MXw implements C0A3 {
    public final /* synthetic */ C34K LJLIL;

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
    }

    public C56980MXw(C34K c34k) {
        this.LJLIL = c34k;
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        o.LJIIIZ(view, "view");
        C34K c34k = this.LJLIL;
        if (!c34k.element) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS60S0200000_9(view, c34k, 3));
    }
}
