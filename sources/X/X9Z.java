package X;

import Y.ARunnableS51S0100000_15;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X9Z implements ViewTreeObserver.OnDrawListener {
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
        this.LJLJI.post(new ARunnableS51S0100000_15(this, 4));
    }

    public X9Z(View v, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(callback, "callback");
        this.LJLIL = v;
        this.LJLILLLLZI = callback;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
    }
}
