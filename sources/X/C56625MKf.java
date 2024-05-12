package X;

import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MKf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56625MKf {
    public static final C56625MKf LIZ = new C56625MKf();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C60742Zy.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56631MKl.LJLIL);
    public static final C96533qb LIZLLL = new C96533qb(C7MY.LIZIZ(41), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 32766);
    public static final C96533qb LJ = new C96533qb(C7MY.LIZIZ(44), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 32766);
    public static final C96533qb LJFF;
    public static final C96533qb LJI;
    public static final C96533qb LJII;
    public static final C96533qb LJIIIIZZ;
    public static final C96533qb LJIIIZ;

    public static C96533qb LIZLLL() {
        int LIZIZ2 = C7MY.LIZIZ(56);
        int LIZIZ3 = C7MY.LIZIZ(42);
        int LIZIZ4 = C7MY.LIZIZ(40);
        int LIZIZ5 = LIZIZ();
        int LIZJ2 = LIZJ();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        return new C96533qb(0, LIZIZ2, LIZIZ3, LIZIZ4, 0, 16, 0, LIZIZ5, LIZJ2, 0, 0, 0, c2068389v.LIZ(EF7.LIZIZ()), 15569);
    }

    static {
        C96533qb c96533qb;
        int i;
        SY9 sy9 = null;
        if (!((Boolean) C53349Kwj.LIZIZ.getValue()).booleanValue()) {
            i = 42;
            c96533qb = new C96533qb(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, null, 32750);
        } else {
            i = 42;
            sy9 = null;
            c96533qb = new C96533qb(C7MY.LIZIZ(72), 56, 0, 0, 42, 0, 61, 0, 0, 0, 0, 0, null, 32684);
        }
        LJFF = c96533qb;
        LJI = new C96533qb(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), 0, 0, i, 16, 51, LIZIZ(), LIZJ(), C7MY.LIZIZ(3), 51, C7MY.LIZIZ(12), sy9, 20621);
        LJII = new C96533qb(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)), 0, 0, i, 16, 51, LIZIZ(), LIZJ(), C7MY.LIZIZ(3), 51, 0, null, 28813);
        LJIIIIZZ = new C96533qb(0, C7MY.LIZIZ(48), 0, 0, i, 16, 51, LIZIZ(), LIZJ(), C7MY.LIZIZ(3), 51, 0, null, 28813);
        LJIIIZ = new C96533qb(0, C7MY.LIZIZ(48), C7MY.LIZIZ(38), C7MY.LIZIZ(34), 0, 0, 0, 0, 0, 0, 0, 0, null, 32753);
    }

    public static int LIZIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static int LIZJ() {
        return ((Number) LIZJ.getValue()).intValue();
    }

    public static void LIZ(AbsUserCardInboxWidget widget) {
        o.LJIIIZ(widget, "widget");
        widget.LJII(1, LIZLLL);
        widget.LJII(4, LJIIIIZZ);
        widget.LJII(3, LJIIIZ);
    }
}
