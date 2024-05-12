package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* loaded from: classes15.dex */
public final class VPX {
    public static int LJIILIIL = ViewConfiguration.getLongPressTimeout();
    public static final int LJIILJJIL = ViewConfiguration.getTapTimeout();
    public int LIZ;
    public final VPW LIZIZ;
    public final InterfaceC79685VPd LIZJ;
    public final InterfaceC79684VPc LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public MotionEvent LJII;
    public MotionEvent LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;

    public final void LIZ() {
        this.LIZIZ.removeMessages(1);
        this.LIZIZ.removeMessages(2);
        this.LIZIZ.removeMessages(3);
        this.LJ = false;
        this.LJI = false;
        if (this.LJFF) {
            this.LJFF = false;
        }
    }

    public VPX(VNU vnu, C79682VPa c79682VPa, Handler handler) {
        boolean z;
        int scaledTouchSlop;
        if (vnu != null && vnu.getApplicationInfo().targetSdkVersion >= 8) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = new VPW(this, handler);
        this.LIZJ = c79682VPa;
        this.LIZLLL = c79682VPa;
        this.LJIIJJI = true;
        this.LJIIL = z;
        if (vnu == null) {
            scaledTouchSlop = ViewConfiguration.getTouchSlop();
        } else {
            scaledTouchSlop = ViewConfiguration.get(vnu).getScaledTouchSlop();
        }
        this.LIZ = scaledTouchSlop * scaledTouchSlop;
    }
}
