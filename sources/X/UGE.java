package X;

import Y.IDLListenerS63S0200000_13;
import android.view.View;
import android.view.Window;

/* loaded from: classes14.dex */
public final class UGE {
    public final View LIZ;
    public int LIZIZ;
    public UGH LIZJ;
    public final int LIZLLL;
    public final IDLListenerS63S0200000_13 LJ;

    public UGE(ActivityC45651qj activityC45651qj) {
        View view;
        Window window;
        if (activityC45651qj != null && (window = activityC45651qj.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZ = view;
        this.LIZLLL = 200;
        this.LJ = new IDLListenerS63S0200000_13(this, activityC45651qj, 0);
    }
}
