package X;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.EuZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37927EuZ {
    public static C37922EuU LIZ(C37928Eua c37928Eua) {
        C37922EuU c37922EuU = new C37922EuU();
        View view = c37928Eua.LIZIZ;
        if (c37922EuU.LIZIZ == null) {
            c37922EuU.LIZIZ = new WeakReference<>(view);
        }
        String str = c37928Eua.LIZJ;
        c37922EuU.LIZLLL = str;
        c37922EuU.LJFF(InterfaceC37930Euc.class, new C37929Eub(str));
        c37922EuU.LJFF(InterfaceC31922Cfu.class, c37928Eua.LIZLLL);
        c37922EuU.LJI(Context.class, c37928Eua.LIZ);
        return c37922EuU;
    }
}
