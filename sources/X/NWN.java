package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWN {
    public final Context LIZ;
    public final C59501NWv LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;

    public final void LIZ(int i) {
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJII = false;
        this.LIZJ = i;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                    } else {
                        this.LIZLLL = (int) KL2.LIZJ(this.LIZ, 64.0f);
                        this.LJ = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
                        return;
                    }
                }
                this.LIZLLL = (int) KL2.LIZJ(this.LIZ, 64.0f);
                this.LJ = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
                return;
            }
            this.LIZLLL = (int) (C60996Nwm.LJ(this.LIZ) * 0.7316341829085458d);
            this.LJ = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
            return;
        }
        this.LIZLLL = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
    }

    public final void LIZIZ(MotionEvent event) {
        o.LJIIIZ(event, "event");
        int i = this.LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 5) {
                    return;
                }
            } else {
                this.LIZLLL = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
                return;
            }
        }
        if (this.LJII) {
            return;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1 || Math.abs(event.getX() - this.LJFF) >= 100.0f || Math.abs(event.getY() - this.LJI) >= 100.0f) {
                return;
            }
            this.LIZIZ.LJIJJLI();
            this.LJII = true;
            return;
        }
        this.LJFF = (int) event.getX();
        this.LJI = (int) event.getY();
    }

    public NWN(Context context, C59501NWv bottomSheetContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bottomSheetContainer, "bottomSheetContainer");
        this.LIZ = context;
        this.LIZIZ = bottomSheetContainer;
        this.LIZJ = 2;
        LIZ(2);
    }
}
