package X;

import Y.ARunnableS51S0100000_15;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes16.dex */
public final class X3F extends X3D {
    public static X3E LJIIJJI;
    public final boolean LJIIJ;

    public X3F() {
        LJIIJJI = new X3E();
        this.LJIIJ = X4H.LJFF.LJIIIIZZ("remove_pause_in_call_isdownloading", 0) > 0;
    }

    @Override // X.X3D
    public final X4O LJI(int i) {
        ExecutorService LJFF;
        X3E x3e = LJIIJJI;
        if (x3e == null) {
            return null;
        }
        x3e.LIZIZ();
        X4O x4o = (X4O) ((ConcurrentHashMap) x3e.LIZ).remove(Integer.valueOf(i));
        if (x4o != null) {
            EnumC84254X4w enumC84254X4w = EnumC84254X4w.RUN_STATUS_CANCELED;
            x4o.LJLL = enumC84254X4w;
            if (x4o.LLIIIILZ != null) {
                x4o.LLIIIILZ.LJFF();
            }
            if (x4o.LJLJJL != null) {
                X4V x4v = x4o.LJLJJL;
                if (!x4v.LJIIIIZZ) {
                    x4v.LJIIIIZZ = true;
                    x4v.LJJIIJZLJL = true;
                    if (x4v.LIZJ != null && (LJFF = C84212X3g.LJFF()) != null) {
                        LJFF.execute(new ARunnableS51S0100000_15(x4v, 136));
                    }
                }
            }
            if (x4o.LLIIIILZ == null && x4o.LJLJJL == null) {
                x4o.LJIIL();
                x4o.LJLL = enumC84254X4w;
                x4o.LJIJI();
            }
            X3E.LIZJ(x4o);
        }
        return x4o;
    }

    @Override // X.X3D
    public final void LJII(int i) {
        ExecutorService LJFF;
        X3E x3e = LJIIJJI;
        if (x3e == null) {
            return;
        }
        x3e.LIZIZ();
        X4O x4o = (X4O) ((ConcurrentHashMap) x3e.LIZ).remove(Integer.valueOf(i));
        if (x4o != null) {
            EnumC84254X4w enumC84254X4w = EnumC84254X4w.RUN_STATUS_PAUSE;
            x4o.LJLL = enumC84254X4w;
            if (x4o.LLIIIILZ != null) {
                x4o.LLIIIILZ.LJJIIZ();
            }
            if (x4o.LJLJJL != null) {
                X4V x4v = x4o.LJLJJL;
                if (!x4v.LJII) {
                    x4v.LJII = true;
                    x4v.LJJIIJZLJL = true;
                    if (x4v.LIZJ != null && (LJFF = C84212X3g.LJFF()) != null) {
                        LJFF.execute(new ARunnableS51S0100000_15(x4v, 136));
                    }
                }
            }
            if (x4o.LLIIIILZ == null && x4o.LJLJJL == null) {
                x4o.LJIIL();
                x4o.LJLL = enumC84254X4w;
                x4o.LJIJI();
            }
            X3E.LIZJ(x4o);
        }
    }

    @Override // X.X3D
    public final boolean LJIILJJIL(int i) {
        DownloadInfo LJIIIZ;
        X3E x3e = LJIIJJI;
        if (x3e == null) {
            return false;
        }
        X4O x4o = (X4O) ((ConcurrentHashMap) x3e.LIZ).get(Integer.valueOf(i));
        if (x4o == null || !x4o.LJLJLLL.get() || (LJIIIZ = LJIIIZ(i)) == null) {
            return false;
        }
        if (C47261Igj.LJJIIJZLJL(LJIIIZ.getStatus())) {
            return true;
        }
        if (!this.LJIIJ) {
            LJII(i);
        }
        return false;
    }
}
