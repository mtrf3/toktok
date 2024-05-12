package X;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YbQ, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87700YbQ extends AbstractC87705YbV implements InterfaceC87720Ybk {
    public List<C87721Ybl> LJI = new ArrayList();
    public Boolean LJII;
    public Matrix LJIIIIZZ;
    public VWP LJIIIZ;
    public String LJIIJ;

    @Override // X.InterfaceC87720Ybk
    public final List<C87721Ybl> LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC87720Ybk
    public final void LIZIZ(AbstractC87705YbV abstractC87705YbV) {
        if (abstractC87705YbV instanceof C87706YbW) {
            this.LJI.add(abstractC87705YbV);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Gradient elements cannot contain ");
        LIZ.append(abstractC87705YbV);
        LIZ.append(" elements.");
        throw new VU3(X1D.LIZIZ(LIZ));
    }
}
