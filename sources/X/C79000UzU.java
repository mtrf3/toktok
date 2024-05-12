package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel;
import kotlin.jvm.internal.o;

/* renamed from: X.UzU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79000UzU implements InterfaceC79002UzW, ITQ {
    public static boolean LJLIL = false;
    public static SmartFeedLoadMoreExperiment$FeedLoadMoreMLModel LJLILLLLZI = null;
    public static int LJLJI = 10;
    public static int LJLJJI;
    public static long LJLJJL;
    public static boolean LJLJJLL;
    public static int LJLJL;

    @Override // X.ITQ
    public void LIZIZ(String str) {
        throw null;
    }

    public static final boolean LJ(Intent intent) {
        o.LJIIIZ(intent, "<this>");
        int intExtra = intent.getIntExtra("extra_ttep_enter_preview_page", 0);
        if (intExtra != 1 && intExtra != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC79002UzW
    public WUW LIZLLL(C79001UzV c79001UzV) {
        return new C82379WUt(c79001UzV.LIZ, c79001UzV.LIZIZ, c79001UzV.LIZJ, c79001UzV.LIZLLL, c79001UzV.LJ, c79001UzV.LJFF, c79001UzV.LJI, c79001UzV.LJII, c79001UzV.LJIIIIZZ, c79001UzV.LJIIIZ, c79001UzV.LJIIJ, c79001UzV.LJIIJJI, c79001UzV.LJIIL, c79001UzV.LJIILIIL, c79001UzV.LJIILJJIL, c79001UzV.LJIILL, c79001UzV.LJIILLIIL, c79001UzV.LJIIZILJ, c79001UzV.LJIJ);
    }

    public static final void LIZJ(Throwable th, InterfaceC67352kd interfaceC67352kd) {
        OUR.LJ(th, interfaceC67352kd);
        throw th;
    }
}
