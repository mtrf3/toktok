package X;

import android.view.MotionEvent;
import android.view.Window;

/* loaded from: classes6.dex */
public final class C0S extends WindowCallbackC25670zb {
    public final /* synthetic */ C0Q LJLILLLLZI;

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C73411SrX c73411SrX = this.LJLILLLLZI.LJIIJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        C73411SrX c73411SrX = this.LJLILLLLZI.LJIIJ;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        super.onWindowFocusChanged(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S(Window.Callback callback, C0Q c0q) {
        super(callback);
        this.LJLILLLLZI = c0q;
    }
}
