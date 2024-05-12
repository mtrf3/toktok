package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.1ft, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38931ft extends C15E {
    public int LJ;

    @Override // X.C15E
    public final void LIZIZ(int i, Context context) {
        int LIZJ;
        o.LJIIIZ(context, "context");
        int size = View.MeasureSpec.getSize(i);
        if (LIZ(size, context)) {
            return;
        }
        int i2 = this.LJ;
        if (size >= i2) {
            i2 = size;
        }
        this.LJ = i2;
        int LJIIIZ = KL2.LJIIIZ(context);
        int i3 = this.LJ;
        if (LJIIIZ < i3) {
            LJIIIZ = i3;
        }
        if (C15430j5.LIZ(context) != 0) {
            LIZJ = C15430j5.LIZ(context);
            C0NB.LJIIIZ("KeyBoardObservable", "ScreenUtils.getNavigationBarHeight");
        } else {
            LIZJ = (int) KL2.LIZJ(context, 48.0f);
            C0NB.LJIIIZ("KeyBoardObservable", "UIUtils.dip2Px(context, NAVIGATION_BAR_DEFAULT_HEIGHT.toFloat()).toInt()");
        }
        int LIZ = C15450j7.LIZ(context);
        StringBuilder LIZJ2 = C06460Ne.LIZJ("sH: ", LJIIIZ, ", mH: ", size, ", nH: ");
        C15890jp.LIZIZ(LIZJ2, LIZJ, ", bH: ", LIZ, ", kv: ");
        LIZJ2.append(this.LIZLLL);
        LIZJ2.append(", last height:");
        LIZJ2.append(this.LIZIZ);
        C0NB.LJIIIZ("KeyBoardObservable", X1D.LIZIZ(LIZJ2));
        int i4 = LJIIIZ - size;
        if (Math.abs(i4) <= LIZJ + LIZ + 1) {
            if (this.LIZLLL) {
                this.LIZLLL = false;
                LIZJ(Math.abs(LJIIIZ - this.LIZIZ), false);
                return;
            }
            return;
        }
        this.LIZIZ = size;
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        LIZJ(Math.abs(i4), true);
    }
}
