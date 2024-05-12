package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Em, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C182567Em {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public List<InterfaceC182577En> LIZLLL;
    public boolean LJ;

    static {
        C16880lQ.LJLLJ(C182567Em.class);
    }

    public final void LIZJ(InterfaceC182577En interfaceC182577En) {
        if (this.LIZLLL == null) {
            this.LIZLLL = new ArrayList();
        }
        this.LIZLLL.add(interfaceC182577En);
    }

    public final boolean LIZ(int i, Context context) {
        if (!C1DH.LJJIIZI()) {
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
        if (Math.abs(i3) < KL2.LIZJ(context, 80.0f)) {
            return;
        }
        if (Build.VERSION.SDK_INT == 30) {
            long nanoTime = System.nanoTime() / 1000000;
            if (nanoTime - this.LIZJ > 100) {
                this.LIZJ = nanoTime;
            } else {
                return;
            }
        }
        if (i3 > 0) {
            this.LJ = true;
        } else {
            this.LJ = false;
        }
        LIZLLL(Math.abs(i3), this.LJ);
        this.LIZIZ = size;
    }

    public final void LIZLLL(int i, boolean z) {
        List<InterfaceC182577En> list = this.LIZLLL;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((InterfaceC182577En) it.next()).LLILLL(i, z);
            }
        }
    }
}
