package X;

import Y.ARunnableS37S0100000_1;
import Y.IDCListenerS242S0100000_1;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.4RY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RY implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int LJLJJL = 0;
    public final View LJLIL;
    public final InterfaceC98193tH LJLILLLLZI;
    public final Handler LJLJI;
    public boolean LJLJJI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            this.LJLILLLLZI.LIZIZ();
            this.LJLJI.postAtFrontOfQueue(new ARunnableS37S0100000_1(this, 162));
            this.LJLJI.post(new ARunnableS37S0100000_1(this, 163));
        }
    }

    public C4RY(View view, InterfaceC98193tH firstDrawCallback) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(firstDrawCallback, "firstDrawCallback");
        this.LJLIL = view;
        this.LJLILLLLZI = firstDrawCallback;
        this.LJLJI = new Handler(C16880lQ.LLJJJJ());
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(this);
        } else {
            view.addOnAttachStateChangeListener(new IDCListenerS242S0100000_1(this, 4));
        }
    }
}
