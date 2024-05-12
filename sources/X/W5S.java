package X;

import android.graphics.Bitmap;
import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public final class W5S implements Callable<Object> {
    public final /* synthetic */ C81392Vwy LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ W68 LJLJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.LJLIL.LJIIJ()) {
            C81392Vwy<Bitmap> LIZJ = W8E.LJII().LJIIJ().LIZJ((Bitmap) this.LJLIL.LJI());
            C81392Vwy LJIIL = C81392Vwy.LJIIL(new W5C(LIZJ, W8A.LIZLLL, 0));
            C81392Vwy LJI = this.LJLJI.LIZ.LJI(new C245519kJ(this.LJLILLLLZI), LJIIL, null);
            C81392Vwy.LJ(LIZJ);
            C81392Vwy.LJ(LJI);
            C81392Vwy.LJ(LJIIL);
        }
        return null;
    }

    public W5S(W68 w68, C81392Vwy c81392Vwy, String str) {
        this.LJLJI = w68;
        this.LJLIL = c81392Vwy;
        this.LJLILLLLZI = str;
    }
}
