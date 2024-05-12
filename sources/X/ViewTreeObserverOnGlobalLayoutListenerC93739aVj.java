package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* renamed from: X.aVj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC93739aVj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C93738aVi LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;

    public ViewTreeObserverOnGlobalLayoutListenerC93739aVj(C93738aVi c93738aVi, C76732zl c76732zl) {
        this.LJLIL = c93738aVi;
        this.LJLILLLLZI = c76732zl;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.LJLIL.LIZ.getWindowVisibleDisplayFrame(rect);
        C76732zl c76732zl = this.LJLILLLLZI;
        int i = c76732zl.element;
        if (i == 0) {
            c76732zl.element = rect.height();
            return;
        }
        if (i == rect.height()) {
            return;
        }
        int height = this.LJLILLLLZI.element - rect.height();
        C93738aVi c93738aVi = this.LJLIL;
        if (c93738aVi.LIZIZ + height >= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rootViewVisibleHeight: ");
            LIZ.append(this.LJLILLLLZI.element);
            C94034aaU.LIZ("KeyBoardUtils", X1D.LIZIZ(LIZ));
            C93738aVi c93738aVi2 = this.LJLIL;
            c93738aVi2.LIZIZ += height;
            Iterator<InterfaceC93737aVh> it = c93738aVi2.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(height);
            }
            C93738aVi c93738aVi3 = this.LJLIL;
            c93738aVi3.LIZ(c93738aVi3.LIZIZ);
        } else {
            c93738aVi.LIZIZ = 0;
            Iterator<InterfaceC93737aVh> it2 = c93738aVi.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(0);
            }
            this.LJLIL.LIZ(-1);
        }
        this.LJLILLLLZI.element = rect.height();
    }
}
