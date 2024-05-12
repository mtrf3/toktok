package X;

import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* renamed from: X.SiQ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC72846SiQ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view = this.LJLIL;
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        while (true) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getWidth() >= i && viewGroup.getHeight() >= i2) {
                C5NP LIZLLL = C82891Wg3.LIZLLL();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("expandViewTouchArea: ");
                LIZ.append(this.LJLIL);
                LIZ.append(", ");
                LIZ.append(viewGroup);
                LIZLLL.d(X1D.LIZIZ(LIZ));
                View view2 = this.LJLIL;
                int i3 = this.LJLILLLLZI;
                int i4 = this.LJLJI;
                TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                if (touchDelegate instanceof C72845SiP) {
                    ((ArrayList) ((C72845SiP) touchDelegate).LIZ).add(new C72847SiR(i3, i4, null, view2, viewGroup));
                    return;
                } else {
                    C72845SiP c72845SiP = new C72845SiP(view2);
                    viewGroup.setTouchDelegate(c72845SiP);
                    ((ArrayList) c72845SiP.LIZ).add(new C72847SiR(i3, i4, null, view2, viewGroup));
                    return;
                }
            }
            view = (View) parent;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC72846SiQ(int i, int i2, View view) {
        this.LJLIL = view;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
