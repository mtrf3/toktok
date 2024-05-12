package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes9.dex */
public class KUY {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;
    public int LJFF = -1;

    public final void LIZLLL() {
        C8ID c8id = new C8ID(this.LIZ, null);
        c8id.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LIZIZ = c8id;
        c8id.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public KUY(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
    }

    public static KUY LIZ(Context context) {
        KUY kuy = new KUY(context);
        kuy.LIZLLL();
        return kuy;
    }

    public final void LIZIZ(View view) {
        this.LIZJ = view;
        C278517l.LIZIZ(-1, -1, view);
    }

    public final void LIZJ(View view) {
        this.LIZLLL = view;
        C278517l.LIZIZ(-1, -1, view);
    }
}
