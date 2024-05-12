package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes15.dex */
public final class W9G {
    public static boolean LIZIZ = true;
    public static W9G LIZJ = null;
    public final WBO LIZ;

    public final W87 LIZ() {
        return (W87) this.LIZ.LJIIIIZZ.LIZ();
    }

    public final W9Q LIZIZ() {
        return this.LIZ.LIZ();
    }

    public final InterfaceC81862WAw LIZJ() {
        return (InterfaceC81862WAw) this.LIZ.LJI.LIZ();
    }

    public final InterfaceC81819W9f LIZLLL() {
        return (InterfaceC81819W9f) this.LIZ.LJIIIZ.LIZ();
    }

    public final W9O LJ() {
        return (W9O) this.LIZ.LJJIFFI.LIZ();
    }

    public final int LJFF() {
        return ((Integer) this.LIZ.LJIILLIIL.LIZ()).intValue();
    }

    public final W8K LJI() {
        return (W8K) this.LIZ.LJIJJ.LIZ();
    }

    public W9G() {
        WBO wbo = new WBO();
        this.LIZ = wbo;
        wbo.LIZ().getClass();
        if (wbo.LIZ() != null) {
            wbo.LIZ().getClass();
        }
    }

    /* JADX WARN: Finally extract failed */
    public W9G(W9H w9h) {
        WBO wbo = new WBO();
        this.LIZ = wbo;
        C81939WDv.LIZIZ();
        WAS was = w9h.LJIILL;
        was.getClass();
        wbo.LJJII.LIZIZ(new W9Q(was));
        Object obj = w9h.LIZIZ;
        wbo.LIZIZ.LIZIZ(obj == null ? new W6A((ActivityManager) C16880lQ.LLILL(w9h.LIZJ, "activity")) : obj);
        wbo.LIZJ.LIZIZ(new C81743W6h());
        Bitmap.Config config = w9h.LIZ;
        wbo.LIZ.LIZIZ(config == null ? Bitmap.Config.ARGB_8888 : config);
        wbo.LIZLLL.LIZIZ(W5N.LJI());
        Context context = w9h.LIZJ;
        context.getClass();
        wbo.LJ.LIZIZ(context);
        wbo.LJI.LIZIZ(new W9M(new C78605Ut7()));
        wbo.LJFF.LIZIZ(Boolean.valueOf(w9h.LIZLLL));
        Object obj2 = w9h.LJ;
        wbo.LJII.LIZIZ(obj2 == null ? new W9F() : obj2);
        Object obj3 = w9h.LJI;
        if (obj3 == null) {
            synchronized (C81864WAy.class) {
                if (C81864WAy.LIZ == null) {
                    C81864WAy.LIZ = new C81864WAy();
                }
                obj3 = C81864WAy.LIZ;
            }
        }
        wbo.LJIIIZ.LIZIZ(obj3);
        wbo.LJIIJ.LIZIZ(null);
        wbo.LJIIJJI.LIZIZ(null);
        wbo.LJIIL.LIZIZ(null);
        wbo.LJIILIIL.LIZIZ(new W9U());
        W9L w9l = w9h.LJII;
        if (w9l == null) {
            Context context2 = w9h.LIZJ;
            try {
                C81939WDv.LIZIZ();
                w9l = new W9K(context2).LIZ();
                C81939WDv.LIZIZ();
            } catch (Throwable th) {
                C81939WDv.LIZIZ();
                throw th;
            }
        }
        wbo.LJIILJJIL.LIZIZ(w9l);
        Object obj4 = w9h.LJIIIIZZ;
        wbo.LJIILL.LIZIZ(obj4 == null ? C81859WAt.LIZIZ() : obj4);
        wbo.LIZ().getClass();
        wbo.LJIILLIIL.LIZIZ(0);
        wbo.LJIJ.LIZIZ(30000);
        C81939WDv.LIZIZ();
        Object obj5 = w9h.LJIIIZ;
        wbo.LJIIZILJ.LIZIZ(obj5 == null ? new C66696QFo(((Integer) wbo.LJIJ.LIZ()).intValue()) : obj5);
        C81939WDv.LIZIZ();
        wbo.LJIJI.LIZIZ(null);
        W8K w8k = w9h.LJIIJ;
        wbo.LJIJJ.LIZIZ(w8k == null ? new W8K(new W8L(new WAT())) : w8k);
        wbo.LJIJJLI.LIZIZ(new W9R());
        Collection collection = w9h.LJIIJJI;
        wbo.LJIL.LIZIZ(collection == null ? new HashSet() : collection);
        Boolean bool = Boolean.TRUE;
        wbo.LJJ.LIZIZ(bool);
        Object obj6 = w9h.LJIIL;
        wbo.LJJI.LIZIZ(obj6 == null ? wbo.LJIILJJIL.LIZ() : obj6);
        HashMap<String, W9L> hashMap = w9h.LJIILIIL;
        if (hashMap == null) {
            try {
                C81939WDv.LIZIZ();
                hashMap = new HashMap<>();
                C81939WDv.LIZIZ();
            } catch (Throwable th2) {
                C81939WDv.LIZIZ();
                throw th2;
            }
        }
        wbo.LJJIIJ.LIZIZ(hashMap);
        wbo.LJJIFFI.LIZIZ(w9h.LJIILJJIL);
        int i = ((W8K) wbo.LJIJJ.LIZ()).LIZ.LIZJ.LIZLLL;
        Object obj7 = w9h.LJFF;
        wbo.LJIIIIZZ.LIZIZ(obj7 == null ? new C64345PNd(i) : obj7);
        wbo.LJJIII.LIZIZ(bool);
        wbo.LJJIIJZLJL.LIZIZ(bool);
        LIZIZ = true;
        wbo.LIZ().getClass();
        wbo.LIZ().getClass();
        C81939WDv.LIZIZ();
    }

    public static W9H LJII(Context context) {
        W9H w9h = new W9H(context);
        if (C78596Usy.LJJIL(C34268Dce.LJLIL) || C78596Usy.LJJIL(C34269Dcf.LJLIL)) {
            w9h.LJFF = new E4V();
        }
        return w9h;
    }
}
