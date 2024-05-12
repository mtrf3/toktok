package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.09i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C028609i {
    public AbstractC03050Ab LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZLLL() {
        this.LIZIZ = -1;
        this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZLLL = false;
        this.LJ = false;
    }

    public final void LIZ() {
        int LJIIJ;
        if (this.LIZLLL) {
            LJIIJ = this.LIZ.LJI();
        } else {
            LJIIJ = this.LIZ.LJIIJ();
        }
        this.LIZJ = LJIIJ;
    }

    public C028609i() {
        LIZLLL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorInfo{mPosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mCoordinate=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mLayoutFromEnd=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mValid=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, '}', LIZ);
    }

    public final void LIZIZ(int i, View view) {
        if (this.LIZLLL) {
            this.LIZJ = this.LIZ.LJIIL() + this.LIZ.LIZIZ(view);
        } else {
            this.LIZJ = this.LIZ.LJ(view);
        }
        this.LIZIZ = i;
    }

    public final void LIZJ(int i, View view) {
        int LJIIL = this.LIZ.LJIIL();
        if (LJIIL >= 0) {
            LIZIZ(i, view);
            return;
        }
        this.LIZIZ = i;
        if (this.LIZLLL) {
            int LJI = (this.LIZ.LJI() - LJIIL) - this.LIZ.LIZIZ(view);
            this.LIZJ = this.LIZ.LJI() - LJI;
            if (LJI > 0) {
                int LIZJ = this.LIZJ - this.LIZ.LIZJ(view);
                int LJIIJ = this.LIZ.LJIIJ();
                int min = LIZJ - (Math.min(this.LIZ.LJ(view) - LJIIJ, 0) + LJIIJ);
                if (min < 0) {
                    this.LIZJ = Math.min(LJI, -min) + this.LIZJ;
                    return;
                }
                return;
            }
            return;
        }
        int LJ = this.LIZ.LJ(view);
        int LJIIJ2 = LJ - this.LIZ.LJIIJ();
        this.LIZJ = LJ;
        if (LJIIJ2 <= 0) {
            return;
        }
        int LJI2 = (this.LIZ.LJI() - Math.min(0, (this.LIZ.LJI() - LJIIL) - this.LIZ.LIZIZ(view))) - (this.LIZ.LIZJ(view) + LJ);
        if (LJI2 >= 0) {
            return;
        }
        this.LIZJ -= Math.min(LJIIJ2, -LJI2);
    }
}
