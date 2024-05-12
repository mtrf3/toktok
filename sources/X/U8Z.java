package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8Z {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ ViewGroup LIZIZ;

    public final void LIZ() {
        U8H u8h = this.LIZ;
        u8h.LJJJJJ.LJJJ(u8h.LJJIII());
        U8H u8h2 = this.LIZ;
        if (u8h2.LIZ.LJI) {
            return;
        }
        if (!o.LJ(u8h2.LJJIII().getParent(), this.LIZ.LJIIJJI)) {
            this.LIZ.getClass();
            String LJJJ = U8H.LJJJ(986);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.LJJIJ());
            LIZ.append(":onMeasured layoutView.parent updated");
            C32014ChO.LIZ(LJJJ, X1D.LIZIZ(LIZ));
            U8H.LJJJJLL(this.LIZ.LJJIII());
            U8H u8h3 = this.LIZ;
            u8h3.LJIIJJI.addView(u8h3.LJJIII());
        }
        if (!o.LJ(this.LIZ.LJIIJJI.getParent(), this.LIZIZ)) {
            this.LIZ.getClass();
            String LJJJ2 = U8H.LJJJ(991);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LIZ.LJJIJ());
            LIZ2.append(":onMeasured containerFrameLayout.parent updated");
            C32014ChO.LIZ(LJJJ2, X1D.LIZIZ(LIZ2));
            U8H.LJJJJLL(this.LIZ.LJIIJJI);
            this.LIZIZ.addView(this.LIZ.LJIIJJI);
        }
    }

    public U8Z(U8H u8h, ViewGroup viewGroup) {
        this.LIZ = u8h;
        this.LIZIZ = viewGroup;
    }
}
