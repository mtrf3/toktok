package X;

import Y.ARunnableS42S0100000_6;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.F7p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38461F7p implements M5A {
    public static volatile boolean LJLIL = true;

    @Override // X.M5A
    public final void onAppEnterBackGround() {
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (HG3.LJIILL() == null || LJLIL) {
            LJLIL = false;
            return;
        }
        if (((RBX) HG3.LJIILL()).isLogin()) {
            a.LJ().LJFF();
        }
        LJLIL = false;
        if (C33806DOo.LIZ()) {
            C38995FSd.LIZIZ().submit(new ARunnableS42S0100000_6(this, 3));
        } else {
            LIZ();
        }
    }

    public static void LIZ() {
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "connectivity");
            o.LJII(LLILL, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo LJJLI = C16880lQ.LJJLI((ConnectivityManager) LLILL);
            C48202Ivu c48202Ivu = C2NU.LIZ;
            c48202Ivu.getClass();
            synchronized (C48202Ivu.class) {
                c48202Ivu.LIZ = LJJLI;
                c48202Ivu.LJFF(LJJLI);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
