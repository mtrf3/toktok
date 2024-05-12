package X;

import Y.ACListenerS25S1000000_3;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193037hr {
    public static final C193037hr LIZ = new C193037hr();
    public static Animator LIZIZ;

    public static void LIZ(View view, String enterFrom) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(enterFrom, "enterFrom");
        AKT akt = new AKT(view);
        akt.LJ(R.style.ux);
        C208158Ex c208158Ex = akt.LIZ;
        c208158Ex.LJLILLLLZI = 0;
        c208158Ex.LJLJJI = 2;
        akt.LIZLLL(R.string.ty3);
        akt.LJFF(R.string.ty4);
        akt.LIZ.LJLJL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(46));
        akt.LIZJ(3000L);
        akt.LIZ.LJLJLJ = new ACListenerS25S1000000_3(enterFrom, 1);
        akt.LJII();
    }

    public static void LIZIZ(Context context, TuxIconView poiCollectIcon, boolean z) {
        o.LJIIIZ(poiCollectIcon, "poiCollectIcon");
        Integer valueOf = Integer.valueOf(R.attr.go);
        if (z) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bookmark_fill;
            c2068389v.LJ = valueOf;
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
            poiCollectIcon.setTuxIcon(c2068389v);
            return;
        }
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_bookmark;
        c2068389v2.LJ = valueOf;
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        poiCollectIcon.setTuxIcon(c2068389v2);
    }
}
