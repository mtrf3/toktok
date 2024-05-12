package X;

import Y.ARunnableS41S0100000_5;
import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CXB extends AbstractC32209CkX {
    public final /* synthetic */ CXA<T> LIZ;

    public CXB(CXA<T> cxa) {
        this.LIZ = cxa;
    }

    @Override // X.AbstractC32664Crs
    public final void LJ(W4W<C81392Vwy<W5A>> dataSource) {
        o.LJIIIZ(dataSource, "dataSource");
        dataSource.close();
        this.LIZ.LJFF = false;
    }

    @Override // X.AbstractC32209CkX
    public final void LJI(Bitmap bitmap) {
        W4W<C81392Vwy<W5A>> w4w = this.LIZ.LJ;
        if (w4w != null && w4w.LIZIZ() && bitmap != null && !bitmap.isRecycled()) {
            CXA<T> cxa = this.LIZ;
            Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            o.LJIIIIZZ(copy, "bitmap.copy(Bitmap.Config.ARGB_8888, true)");
            cxa.getClass();
            cxa.LJI = copy;
            AbstractC31476CWy abstractC31476CWy = this.LIZ;
            abstractC31476CWy.LIZIZ.post(new ARunnableS41S0100000_5(abstractC31476CWy, 230));
            this.LIZ.LJFF = false;
        } else {
            this.LIZ.LJFF = false;
        }
        W4W<C81392Vwy<W5A>> w4w2 = this.LIZ.LJ;
        if (w4w2 != null) {
            w4w2.close();
        }
    }
}
