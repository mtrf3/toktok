package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.7EW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7EW extends C182567Em {
    @Override // X.C182567Em
    public final void LIZIZ(int i, Context context) {
        int LIZJ;
        int size = View.MeasureSpec.getSize(i);
        if (LIZ(size, context)) {
            return;
        }
        int i2 = C53946LFe.LIZJ(context, null).LIZJ;
        if (C60996Nwm.LIZLLL(context) != 0) {
            LIZJ = C60996Nwm.LIZLLL(context);
        } else {
            LIZJ = (int) KL2.LIZJ(context, 48.0f);
        }
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        StringBuilder LIZJ2 = C06460Ne.LIZJ("sH: ", i2, ", mH: ", size, ", nH: ");
        C15890jp.LIZIZ(LIZJ2, LIZJ, ", bH: ", LJJJJLI, ", kv: ");
        LIZJ2.append(this.LJ);
        C36922EeM.LIZLLL(3, "KeyBoardObservable", X1D.LIZIZ(LIZJ2));
        int i3 = i2 - size;
        if (Math.abs(i3) <= LIZJ + LJJJJLI) {
            if (this.LJ) {
                this.LJ = false;
                LIZLLL(Math.abs(i2 - this.LIZIZ), false);
                return;
            }
            return;
        }
        this.LIZIZ = size;
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        LIZLLL(Math.abs(i3), true);
    }
}
