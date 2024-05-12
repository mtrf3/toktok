package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.1AG, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AG implements AnonymousClass169 {
    public final ConstraintLayout LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final /* synthetic */ ConstraintLayout LJII;

    public C1AG(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.LJII = constraintLayout;
        this.LIZ = constraintLayout2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x027b, code lost:
    
        if (r1 != false) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C018205i r19, X.AnonymousClass168 r20) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1AG.LIZIZ(X.05i, X.168):void");
    }

    public static boolean LIZ(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
        return false;
    }
}
