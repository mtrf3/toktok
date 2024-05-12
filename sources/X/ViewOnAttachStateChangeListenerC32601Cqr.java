package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Cqr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC32601Cqr implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C32600Cqq LJLIL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
    }

    public ViewOnAttachStateChangeListenerC32601Cqr(C32600Cqq c32600Cqq) {
        this.LJLIL = c32600Cqq;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        boolean z;
        o.LJIIIZ(v, "v");
        C0NB.LIZIZ(this.LJLIL.LLFII, "onViewAttachedToWindow portrait");
        C32600Cqq c32600Cqq = this.LJLIL;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = c32600Cqq.LJZ;
        if (abstractC32698CsQ != null) {
            z = abstractC32698CsQ.LIZJ;
        } else {
            z = true;
        }
        C32457CoX.LIZJ(z, c32600Cqq.LLFZ, c32600Cqq.itemView, c32600Cqq.LLIFFJFJJ, c32600Cqq.LJLJJLL, c32600Cqq.LJLJLJ, c32600Cqq.LLII, c32600Cqq.LLI, c32600Cqq.LJLJJI, c32600Cqq.LJLL, c32600Cqq.LJLJLLL, c32600Cqq.LJLLILLLL, c32600Cqq.LJLLLL);
        this.LJLIL.LLFZ = false;
    }
}
