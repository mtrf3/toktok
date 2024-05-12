package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.vm.NearbySkylightViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Lbb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54587Lbb {
    public View LIZ;
    public NearbySkylightViewModel LIZIZ;
    public boolean LIZJ;
    public View LIZLLL;
    public C54570LbK LJ;
    public AnimatorSet LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public int LJIIIZ = -1;

    public final float LIZ() {
        View view = this.LIZ;
        if (view != null) {
            view.measure(0, 0);
            View view2 = this.LIZ;
            if (view2 != null) {
                int measuredHeight = view2.getMeasuredHeight();
                int i = this.LJIIIZ;
                if (i < 0) {
                    View view3 = this.LIZ;
                    if (view3 != null) {
                        Context context = view3.getContext();
                        o.LJIIIIZZ(context, "containerView.context");
                        i = C63081OpJ.LJJJJLI(context);
                    } else {
                        o.LJIJI("containerView");
                        throw null;
                    }
                }
                NearbySkylightViewModel nearbySkylightViewModel = this.LIZIZ;
                if (nearbySkylightViewModel != null) {
                    nearbySkylightViewModel.LJLILLLLZI = i;
                    StringBuilder LIZ = X1D.LIZ();
                    View view4 = this.LIZ;
                    if (view4 != null) {
                        LIZ.append(view4.getY());
                        LIZ.append(',');
                        float f = measuredHeight;
                        LIZ.append(f);
                        LIZ.append(',');
                        LIZ.append(i);
                        LIZ.append(',');
                        LIZ.append(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                        X1D.LIZIZ(LIZ);
                        View view5 = this.LIZ;
                        if (view5 != null) {
                            return ((view5.getY() + f) - i) + C7MY.LIZIZ(16);
                        }
                        o.LJIJI("containerView");
                        throw null;
                    }
                    o.LJIJI("containerView");
                    throw null;
                }
                o.LJIJI("vm");
                throw null;
            }
            o.LJIJI("containerView");
            throw null;
        }
        o.LJIJI("containerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(float r13, float r14, boolean r15, boolean r16, X.InterfaceC65784Pro<X.C76800UCe> r17) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54587Lbb.LIZIZ(float, float, boolean, boolean, X.Pro):void");
    }
}
