package X;

import android.view.View;

/* loaded from: classes15.dex */
public class WN9 extends WMU {
    @Override // X.WMU
    public final void LIZJ(Class cls, Class cls2) {
    }

    public WN9(int i) {
    }

    @Override // X.WMU
    public final void LIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        View view = c82158WMg.LIZIZ;
        View view2 = c82158WMg2.LIZIZ;
        WN7.LIZIZ(view);
        WN7.LIZIZ(view2);
        view.setVisibility(0);
        this.LIZ.getOverlay().add(view);
        runnable.run();
    }

    @Override // X.WMU
    public final void LIZIZ(C82158WMg c82158WMg, C82158WMg c82158WMg2, Runnable runnable, C43356Gzw c43356Gzw) {
        runnable.run();
    }
}
