package X;

import android.content.Context;
import android.view.MotionEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.NXp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59521NXp {
    public final Context LIZ;
    public final C59520NXo LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;

    public final void LIZ(int i) {
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJII = false;
        this.LIZJ = i;
        if (i != 2) {
            if (i != 3) {
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
        if (i != 2) {
            if (i != 3 || this.LJII) {
                return;
            }
            int action = event.getAction();
            if (action != 0) {
                if (action != 1 || Math.abs(event.getX() - this.LJFF) >= 100.0f || Math.abs(event.getY() - this.LJI) >= 100.0f) {
                    return;
                }
                this.LIZIZ.LLFII.setState(3);
                this.LJII = true;
                return;
            }
            this.LJFF = (int) event.getX();
            this.LJI = (int) event.getY();
            return;
        }
        this.LIZLLL = C60996Nwm.LJ(this.LIZ) - C63081OpJ.LJJJJLI(this.LIZ);
    }

    public C59521NXp(Context context, C59520NXo bottomSheetContainer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(bottomSheetContainer, "bottomSheetContainer");
        this.LIZ = context;
        this.LIZIZ = bottomSheetContainer;
        this.LIZJ = 2;
        LIZ(2);
    }
}
