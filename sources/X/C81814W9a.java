package X;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.List;

/* renamed from: X.W9a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81814W9a {
    public static C81814W9a LIZJ;
    public final boolean LIZ;
    public final WBS LIZIZ;

    public static C81814W9a LJIIJ() {
        if (LIZJ == null) {
            LIZJ = new C81814W9a();
        }
        return LIZJ;
    }

    public final boolean LIZ() {
        if (this.LIZIZ.LJJIII.LIZ() != null && ((Boolean) this.LIZIZ.LJJIII.LIZ()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.LIZIZ.LJJIJIIJI.LIZ() != null && ((Boolean) this.LIZIZ.LJJIJIIJI.LIZ()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ.LJJIJIL.LIZ() != null && ((Boolean) this.LIZIZ.LJJIJIL.LIZ()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final List<C208518Gh> LIZLLL() {
        return (List) this.LIZIZ.LJIJJLI.LIZ();
    }

    public final Bitmap.Config LJ() {
        return (Bitmap.Config) this.LIZIZ.LIZIZ.LIZ();
    }

    public final WE8 LJFF() {
        return (WE8) this.LIZIZ.LJIJJ.LIZ();
    }

    public final Context LJI() {
        return (Context) this.LIZIZ.LIZ.LIZ();
    }

    public final AbstractC61742OLa LJII() {
        return (AbstractC61742OLa) this.LIZIZ.LJIILL.LIZ();
    }

    public final File LJIIIIZZ() {
        return (File) this.LIZIZ.LJ.LIZ();
    }

    public final QGA LJIIIZ() {
        return (QGA) this.LIZIZ.LIZLLL.LIZ();
    }

    public final int LJIIJJI() {
        if (this.LIZIZ.LIZJ.LIZ() == null) {
            return 0;
        }
        return ((Integer) this.LIZIZ.LIZJ.LIZ()).intValue();
    }

    public final boolean LJIIL() {
        if (this.LIZIZ.LJIL.LIZ() != null && ((Boolean) this.LIZIZ.LJIL.LIZ()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        if (this.LIZIZ.LJIJ.LIZ() != null && ((Boolean) this.LIZIZ.LJIJ.LIZ()).booleanValue()) {
            return true;
        }
        return false;
    }

    public C81814W9a() {
        this.LIZIZ = new WBS();
    }

    public C81814W9a(C81816W9c c81816W9c) {
        WBS wbs = new WBS();
        this.LIZIZ = wbs;
        wbs.LIZ.LIZIZ(c81816W9c.LIZ);
        wbs.LIZLLL.LIZIZ(c81816W9c.LIZIZ);
        wbs.LJ.LIZIZ(c81816W9c.LIZJ);
        wbs.LJII.LIZIZ(Long.valueOf(c81816W9c.LIZLLL));
        wbs.LJFF.LIZIZ(Long.valueOf(c81816W9c.LJ));
        wbs.LJI.LIZIZ(0L);
        wbs.LJIIIIZZ.LIZIZ(0L);
        wbs.LJIIIZ.LIZIZ(Integer.valueOf(c81816W9c.LJFF));
        wbs.LJIILL.LIZIZ(c81816W9c.LJI);
        wbs.LIZIZ.LIZIZ(c81816W9c.LJII);
        wbs.LIZJ.LIZIZ(Integer.valueOf(c81816W9c.LJIIIIZZ));
        wbs.LJIILLIIL.LIZIZ(Boolean.valueOf(c81816W9c.LJIIIZ));
        wbs.LJIJ.LIZIZ(Boolean.valueOf(c81816W9c.LJIIJJI));
        wbs.LJIJI.LIZIZ(c81816W9c.LJIIL);
        wbs.LJIIJ.LIZIZ(Boolean.valueOf(c81816W9c.LJIILJJIL));
        wbs.LJIIZILJ.LIZIZ(Boolean.valueOf(c81816W9c.LJIIJ));
        wbs.LJIJJLI.LIZIZ(c81816W9c.LJIJI);
        wbs.LJIL.LIZIZ(Boolean.TRUE);
        wbs.LJIILJJIL.LIZIZ(Boolean.valueOf(c81816W9c.LJIJ));
        wbs.LJIIJJI.LIZIZ(Boolean.valueOf(c81816W9c.LJIILL));
        wbs.LJIIL.LIZIZ(Boolean.valueOf(c81816W9c.LJIILLIIL));
        wbs.LJIILIIL.LIZIZ(c81816W9c.LJIIZILJ);
        wbs.LJJ.LIZIZ(null);
        wbs.LJIJJ.LIZIZ(c81816W9c.LJIILIIL);
        wbs.LJJI.LIZIZ(Boolean.valueOf(c81816W9c.LJIJJ));
        wbs.LJJIFFI.LIZIZ(c81816W9c.LJIL);
        wbs.LJJII.LIZIZ(Boolean.valueOf(c81816W9c.LJIJJLI));
        Boolean bool = Boolean.FALSE;
        wbs.LJJIII.LIZIZ(bool);
        wbs.LJJIIJZLJL.LIZIZ(null);
        wbs.LJJIIJ.LIZIZ(bool);
        wbs.LJJIIZI.LIZIZ(bool);
        wbs.LJJIIZ.LIZIZ(bool);
        wbs.LJJIJ.LIZIZ(bool);
        wbs.LJJIJIIJI.LIZIZ(bool);
        this.LIZ = c81816W9c.LJJ;
    }
}
