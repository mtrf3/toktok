package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.GsH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42881GsH {
    public final Context LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public int LJ = -1;

    public C42881GsH(Context context) {
        if (context != null) {
            this.LIZ = context;
            return;
        }
        throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
    }

    public static C42881GsH LIZ(Context context) {
        C42881GsH c42881GsH = new C42881GsH(context);
        C42883GsJ c42883GsJ = new C42883GsJ(context, null);
        c42883GsJ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        c42881GsH.LIZIZ = c42883GsJ;
        c42883GsJ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c42881GsH;
    }
}
