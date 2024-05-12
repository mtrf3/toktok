package X;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.cast.framework.CastOptions;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Zll, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class BinderC90889Zll extends AbstractBinderC90690ZiY {
    public final ZY5 LJLIL;
    public final java.util.Map<C90101ZXt, java.util.Set<AbstractC90102ZXu>> LJLILLLLZI = new HashMap();
    public final C90319ZcZ LJLJI;

    public final void LLJI(MediaSessionCompat mediaSessionCompat) {
        C90106ZXy c90106ZXy;
        this.LJLIL.getClass();
        C90605ZhB c90605ZhB = ZY5.LIZJ;
        c90605ZhB.LJJIII = mediaSessionCompat;
        if (mediaSessionCompat != null) {
            c90106ZXy = new C90106ZXy(c90605ZhB, mediaSessionCompat);
        } else {
            c90106ZXy = null;
        }
        C90106ZXy c90106ZXy2 = c90605ZhB.LJJII;
        if (c90106ZXy2 != null) {
            c90106ZXy2.LIZ();
        }
        c90605ZhB.LJJII = c90106ZXy;
        if (c90106ZXy != null) {
            c90605ZhB.LJIIJJI();
        }
    }

    public final void LLZZJLIL(C90101ZXt c90101ZXt) {
        Iterator it = ((java.util.Set) ((HashMap) this.LJLILLLLZI).get(c90101ZXt)).iterator();
        while (it.hasNext()) {
            this.LJLIL.LJI((AbstractC90102ZXu) it.next());
        }
    }

    public BinderC90889Zll(ZY5 zy5, CastOptions castOptions) {
        boolean z;
        this.LJLIL = zy5;
        if (Build.VERSION.SDK_INT > 30) {
            boolean z2 = castOptions.zzj;
            boolean z3 = castOptions.zzk;
            C90508Zfc c90508Zfc = new C90508Zfc();
            c90508Zfc.LIZ = z2;
            c90508Zfc.LIZIZ = z3;
            C90509Zfd c90509Zfd = new C90509Zfd(c90508Zfc);
            ZY5.LIZIZ();
            C90605ZhB c90605ZhB = ZY5.LIZJ;
            C90509Zfd c90509Zfd2 = c90605ZhB.LJIILIIL;
            c90605ZhB.LJIILIIL = c90509Zfd;
            if (c90605ZhB.LIZIZ) {
                if (c90509Zfd2 == null) {
                    z = false;
                } else {
                    z = c90509Zfd2.LIZIZ;
                }
                if (z != c90509Zfd.LIZIZ) {
                    C90597Zh3 c90597Zh3 = c90605ZhB.LIZJ;
                    c90597Zh3.LJLJJL = c90605ZhB.LJIL;
                    if (!c90597Zh3.LJLJJLL) {
                        c90597Zh3.LJLJJLL = true;
                        c90597Zh3.LJLJI.sendEmptyMessage(2);
                    }
                }
            }
            if (z2) {
                C90272Zbo.LIZ(EnumC90770Zjq.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (z3) {
                C90319ZcZ c90319ZcZ = new C90319ZcZ();
                this.LJLJI = c90319ZcZ;
                C90674ZiI c90674ZiI = new C90674ZiI(c90319ZcZ);
                ZY5.LIZIZ();
                ZY5.LIZJ.LJJI = c90674ZiI;
                C90272Zbo.LIZ(EnumC90770Zjq.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    public final void LLJJIII(C90101ZXt c90101ZXt, int i) {
        Iterator it = ((java.util.Set) ((HashMap) this.LJLILLLLZI).get(c90101ZXt)).iterator();
        while (it.hasNext()) {
            this.LJLIL.LIZ(c90101ZXt, (AbstractC90102ZXu) it.next(), i);
        }
    }
}
