package X;

import Y.IDLListenerS199S0100000_14;
import android.app.Activity;
import android.view.View;
import android.view.Window;

/* renamed from: X.Wnz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83383Wnz {
    public final View LIZ;
    public int LIZIZ;
    public InterfaceC83388Wo4 LIZJ;
    public final int LIZLLL;
    public final IDLListenerS199S0100000_14 LJ;

    public C83383Wnz(Activity activity) {
        View view;
        Window window = activity.getWindow();
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        this.LIZ = view;
        this.LIZLLL = 200;
        this.LJ = new IDLListenerS199S0100000_14(this, 9);
    }
}
