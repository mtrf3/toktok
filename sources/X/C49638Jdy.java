package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;

/* renamed from: X.Jdy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49638Jdy {
    public static C49640Je0 LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C49637Jdx.INSTANCE);

    public static void LIZ() {
        C49640Je0 c49640Je0;
        Long l;
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (LJ == null || !J1C.LIZLLL(LJ) || (c49640Je0 = LIZ) == null) {
            return;
        }
        c49640Je0.LJIJ = System.currentTimeMillis();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("record start auto play time:");
        C49640Je0 c49640Je02 = LIZ;
        if (c49640Je02 != null) {
            l = Long.valueOf(c49640Je02.LJIJ);
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" in this search ");
        X1D.LIZIZ(LIZ2);
        C62822Ol8 c62822Ol8 = LIZIZ;
        ((Handler) c62822Ol8.getValue()).removeCallbacksAndMessages(null);
        Handler handler = (Handler) c62822Ol8.getValue();
        C49640Je0 c49640Je03 = LIZ;
        if (c49640Je03 != null) {
            C49640Je0 c49640Je04 = new C49640Je0();
            c49640Je04.LJIIZILJ = c49640Je03.LJIIZILJ;
            c49640Je04.LJIJ = c49640Je03.LJIJ;
            handler.postDelayed(new RunnableC49639Jdz(c49640Je04), 1000L);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
