package X;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.15E, reason: invalid class name */
/* loaded from: classes.dex */
public class C15E {
    public int LIZ;
    public int LIZIZ;
    public List<C15G> LIZJ;
    public boolean LIZLLL;

    static {
        C16880lQ.LJLLJ(C15E.class);
    }

    public final boolean LIZ(int i, Context context) {
        String LIZ = PCI.LIZ("ro.vivo.os.build.display.id");
        if (C38354F3m.LJ(LIZ) || !LIZ.toLowerCase().contains("funtouch")) {
            return false;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int i2 = point.y;
        if (i > i2) {
            return true;
        }
        int i3 = this.LIZ;
        if (i3 == 0) {
            this.LIZ = i2;
        } else if (i3 != i2) {
            return true;
        }
        return false;
    }

    public void LIZIZ(int i, Context context) {
        int size = View.MeasureSpec.getSize(i);
        if (LIZ(size, context)) {
            return;
        }
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            this.LIZIZ = size;
            return;
        }
        if (i2 == size) {
            return;
        }
        int i3 = i2 - size;
        if (Math.abs(i3) < B9K.LIZ(context, 80.0f)) {
            this.LIZIZ = Math.max(this.LIZIZ, size);
            return;
        }
        if (i3 > 0) {
            this.LIZLLL = true;
        } else {
            this.LIZLLL = false;
        }
        LIZJ(Math.abs(i3), this.LIZLLL);
        this.LIZIZ = size;
    }

    public final void LIZJ(int i, boolean z) {
        List<C15G> list = this.LIZJ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C15G) it.next()).LLILLL(i, z);
            }
        }
    }
}
