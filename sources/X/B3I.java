package X;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class B3I {
    public boolean LIZIZ;
    public final WeakReference<View> LIZ = new WeakReference<>(null);
    public int LIZJ = 1;

    public final void LIZ() {
        int i;
        View view = this.LIZ.get();
        if (view != null) {
            if (this.LIZIZ && this.LIZJ == 1) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
            }
        }
    }
}
