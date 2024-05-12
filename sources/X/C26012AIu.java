package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AIu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26012AIu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, AI8 ai8) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        if (ai8 != null) {
            ai8.setIcon(c2068389v);
        }
    }

    public static void LIZIZ(AI8 ai8, String title) {
        o.LJIIIZ(title, "title");
        if (ai8 == null) {
            return;
        }
        T5R t5r = new T5R(title);
        t5r.LIZ(42);
        ai8.setTitle(t5r);
    }
}
