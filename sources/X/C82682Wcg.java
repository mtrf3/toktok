package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.Wcg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82682Wcg {
    public Integer LIZ;
    public View LIZIZ;
    public ViewGroup LIZJ;
    public WHL LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public long LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final TimeInterpolator LJIILIIL;
    public final TimeInterpolator LJIILJJIL;
    public C90W LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public View LJIJ;
    public View LJIJI;
    public WHL LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public View.OnClickListener LJJ;
    public boolean LJJI;
    public InterfaceC82688Wcm LJJIFFI;
    public InterfaceC82689Wcn LJJII;
    public boolean LJJIII;

    public C82682Wcg() {
        WHL whl = WHL.TOP;
        this.LIZLLL = whl;
        this.LJII = -1L;
        this.LJIIIIZZ = -1;
        this.LJIIJ = -1L;
        this.LJIIJJI = true;
        this.LJIIL = true;
        this.LJIILIIL = C55953Lxd.LJIIJ();
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.61f, 1.0f, 0.88f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(0.61f, 1f, 0.88f, 1f)");
        this.LJIILJJIL = LIZIZ;
        this.LJIILLIIL = -1;
        this.LJIIZILJ = -1;
        this.LJIJJ = whl;
        this.LJIJJLI = true;
        this.LJIL = true;
    }

    public final void LIZ(WHL whl) {
        o.LJIIIZ(whl, "<set-?>");
        this.LIZLLL = whl;
    }
}
