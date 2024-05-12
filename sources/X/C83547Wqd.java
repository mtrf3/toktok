package X;

import Y.IDLListenerS199S0100000_14;
import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: X.Wqd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83547Wqd {
    public final View LIZ;
    public int LIZIZ;
    public InterfaceC83564Wqu LIZJ;
    public final int LIZLLL;
    public final IDLListenerS199S0100000_14 LJ;
    public final C5NP LJFF;

    public final void LIZ() {
        View view = this.LIZ;
        if (view != null && this.LJ != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.LJ);
        }
        this.LIZJ = null;
    }

    public final void LIZIZ(InterfaceC83564Wqu interfaceC83564Wqu) {
        this.LIZJ = interfaceC83564Wqu;
        View view = this.LIZ;
        if (view != null && this.LJ != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.LJ);
        }
    }

    public C83547Wqd(Activity activity, C5SL c5sl) {
        View view;
        Window window;
        this.LJFF = c5sl;
        if (activity != null && (window = activity.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZ = view;
        this.LIZLLL = 200;
        this.LJ = new IDLListenerS199S0100000_14(this, 7);
    }
}
