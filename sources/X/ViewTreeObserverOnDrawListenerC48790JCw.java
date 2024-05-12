package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.JCw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnDrawListenerC48790JCw implements ViewTreeObserver.OnDrawListener {
    public final View LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final Handler LJLJI;
    public boolean LJLJJI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
        this.LJLILLLLZI.invoke();
        this.LJLJI.post(new ARunnableS44S0100000_8(this, 158));
    }

    public ViewTreeObserverOnDrawListenerC48790JCw(View v, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(callback, "callback");
        this.LJLIL = v;
        this.LJLILLLLZI = callback;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
    }
}
