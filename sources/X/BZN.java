package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveLandscapeEnterOp;
import defpackage.g0;

/* loaded from: classes6.dex */
public final class BZN {
    public final Context LIZ;
    public final InterfaceC28271B7r LIZIZ;
    public final boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public final int LJFF;
    public final int LJI = LIZ(8);
    public final int LJII = LIZ(80);
    public final int LJIIIIZZ = LIZ(150);
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public BZQ LJIILL;
    public VelocityTracker LJIILLIIL;

    public final int LIZ(int i) {
        return (int) ((i * this.LIZ.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        BZQ bzq = this.LJIILL;
        if (bzq != null && ((C30095BrX) bzq).LIZIZ()) {
            return false;
        }
        C025107z c025107z = ((BZM) this.LIZIZ).LJLJI;
        if (c025107z != null && c025107z.isDrawerOpen(3)) {
            return false;
        }
        C025107z c025107z2 = ((BZM) this.LIZIZ).LJLJI;
        if (c025107z2 != null && c025107z2.isDrawerOpen(5)) {
            return false;
        }
        if ((GameLiveLandscapeEnterOp.INSTANCE.getValue() && g0.LJIILJJIL(this.LIZ) != null && C29306Beo.LJIIZILJ(g0.LJIILJJIL(this.LIZ).getRequestedOrientation())) || this.LJIIL || this.LJIILIIL || !this.LJIILJJIL) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(float f) {
        if ((f > 0.0f && ((BZM) this.LIZIZ).LIZIZ(3)) || (f < 0.0f && ((BZM) this.LIZIZ).LIZIZ(5))) {
            return true;
        }
        return false;
    }

    public BZN(Context context, InterfaceC28271B7r interfaceC28271B7r) {
        this.LIZ = context;
        this.LIZIZ = interfaceC28271B7r;
        this.LJFF = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LIZJ = CCJ.LIZ(context);
    }
}
