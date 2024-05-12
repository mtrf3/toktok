package X;

import android.app.Application;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XFW {
    public final XFV LIZ(Application application) {
        o.LJIIIZ(application, "application");
        XFV xfv = XFV.LJI;
        if (xfv == null) {
            synchronized (this) {
                xfv = XFV.LJI;
                if (xfv == null) {
                    xfv = new XFV(application);
                    XFV.LJI = xfv;
                }
            }
        }
        return xfv;
    }
}
