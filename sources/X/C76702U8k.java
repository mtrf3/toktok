package X;

import android.graphics.Rect;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76702U8k implements UA1 {
    public final InterfaceC88472Yns<String, C76800UCe> LIZ;

    @Override // X.UA1
    public final void LIZ(Rect rect) {
    }

    @Override // X.UA1
    public final void LIZIZ(Rect rect, boolean z) {
    }

    @Override // X.UA1
    public final void LIZLLL(int i, int i2, C76711U8t micWindow) {
        o.LJIIIZ(micWindow, "micWindow");
    }

    public C76702U8k(AqS179S0100000_13 aqS179S0100000_13) {
        this.LIZ = aqS179S0100000_13;
    }

    @Override // X.UA1
    public final Rect LJ(Rect rect, Rect allAreaRect) {
        o.LJIIIZ(allAreaRect, "allAreaRect");
        Rect rect2 = new Rect();
        int i = rect.left + allAreaRect.left;
        rect2.left = i;
        rect2.top = rect.top + allAreaRect.top;
        rect2.right = rect.width() + i;
        rect2.bottom = rect.height() + rect2.top;
        return rect2;
    }

    @Override // X.UA1
    public final void LIZJ(int i, int i2, C76711U8t micWindow, FrameLayout.LayoutParams layoutParams, Rect allAreaRect) {
        o.LJIIIZ(micWindow, "micWindow");
        o.LJIIIZ(allAreaRect, "allAreaRect");
        SurfaceView surfaceView = micWindow.LJLIL.LIZLLL;
        if (surfaceView != null) {
            surfaceView.setTag(layoutParams);
            surfaceView.setLayoutParams(layoutParams);
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("add surface view pos = ");
            LIZ.append(i);
            interfaceC88472Yns.invoke(X1D.LIZIZ(LIZ));
        }
    }
}
