package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.CsZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC32707CsZ implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C32690CsI LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        boolean z;
        o.LJIIIZ(v, "v");
        C0NB.LIZIZ(this.LJLIL.LJZI, "onViewAttachedToWindow landscape");
        C32690CsI c32690CsI = this.LJLIL;
        AbstractC32698CsQ<?> abstractC32698CsQ = c32690CsI.LJLJLJ;
        if (abstractC32698CsQ != null) {
            z = abstractC32698CsQ.LIZJ;
        } else {
            z = true;
        }
        C32457CoX.LIZJ(z, c32690CsI.LJZL, this.LJLILLLLZI, c32690CsI.LLD, c32690CsI.LJLJJL, c32690CsI.LLFFF, c32690CsI.LLF, c32690CsI.LL, c32690CsI.LJLJJI, c32690CsI.LLFZ, c32690CsI.LLFII, c32690CsI.LJLLI, c32690CsI.LJLLJ);
        this.LJLIL.LJZL = false;
    }

    public ViewOnAttachStateChangeListenerC32707CsZ(C32690CsI c32690CsI, View view) {
        this.LJLIL = c32690CsI;
        this.LJLILLLLZI = view;
    }
}
