package X;

import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WcR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82667WcR extends AbstractC65781Prl implements InterfaceC88473Ynt<View, MotionEvent, AbstractC82670WcU, Boolean> {
    public static final C82667WcR LJLIL = new C82667WcR();

    public C82667WcR() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final Boolean invoke(View view, MotionEvent motionEvent, AbstractC82670WcU targetViewType) {
        int LIZ;
        View targetView = view;
        MotionEvent _event = motionEvent;
        o.LJIIIZ(targetView, "targetView");
        o.LJIIIZ(_event, "_event");
        o.LJIIIZ(targetViewType, "targetViewType");
        int[] iArr = new int[2];
        targetView.getLocationOnScreen(iArr);
        int rawX = (int) _event.getRawX();
        int rawY = (int) _event.getRawY();
        boolean z = false;
        int i = iArr[0];
        int i2 = iArr[1];
        int measuredWidth = targetView.getMeasuredWidth() + i;
        int measuredHeight = targetView.getMeasuredHeight() + iArr[1];
        boolean LJ = o.LJ(targetViewType, C82677Wcb.LIZJ);
        Float valueOf = Float.valueOf(12.0f);
        if (LJ) {
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
            measuredWidth += LJJIIZ;
            i -= LJJIIZ;
        } else {
            if (o.LJ(targetViewType, C82674WcY.LIZJ)) {
                LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf));
            } else if (o.LJ(targetViewType, C82676Wca.LIZJ)) {
                LIZ = C278817o.LIZ(8.0f);
            } else {
                o.LJ(targetViewType, C82675WcZ.LIZJ);
            }
            i -= LIZ;
            measuredWidth += LIZ;
        }
        if (i2 <= rawY && rawY <= measuredHeight && i <= rawX && rawX <= measuredWidth) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
