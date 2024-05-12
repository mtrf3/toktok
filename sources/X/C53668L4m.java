package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.L4m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53668L4m {
    public final L69 LIZ;
    public final C71799SFv LIZIZ;
    public final Context LIZJ;
    public final java.util.Set<L4T> LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public View.OnClickListener LJIIJJI;

    public final java.util.Map<L4T, View> LIZ() {
        return (java.util.Map) this.LJIIIZ.getValue();
    }

    public final java.util.Map<Integer, View> LIZIZ() {
        return (java.util.Map) this.LJIIIIZZ.getValue();
    }

    public C53668L4m(L69 l69, C71799SFv c71799SFv, Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = l69;
        this.LIZIZ = c71799SFv;
        this.LIZJ = context;
        this.LIZLLL = (java.util.Set) L4Q.LIZLLL.getValue();
        this.LJ = C221108m2.LIZIZ(L51.LJLIL);
        this.LJFF = C221108m2.LIZIZ(C53678L4w.LJLIL);
        this.LJI = C221108m2.LIZIZ(C53680L4y.LJLIL);
        this.LJII = C221108m2.LIZIZ(C53675L4t.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C53673L4r.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C53672L4q.LJLIL);
        this.LJIIJ = C221108m2.LIZIZ(C53676L4u.LJLIL);
        l69.addView(c71799SFv, 0, new FrameLayout.LayoutParams(-2, -2, 17));
        c71799SFv.setId(-429227255);
    }
}
