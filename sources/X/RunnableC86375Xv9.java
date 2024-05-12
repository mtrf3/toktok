package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.ss.android.ugc.aweme.feed.model.live.ShowInfo;

/* renamed from: X.Xv9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC86375Xv9 implements Runnable {
    public final /* synthetic */ ShowInfoWidget LJLIL;
    public final /* synthetic */ ShowInfo LJLILLLLZI;
    public final /* synthetic */ C86369Xv3 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public RunnableC86375Xv9(ShowInfoWidget showInfoWidget, ShowInfo showInfo, C86369Xv3 c86369Xv3, int i, int i2) {
        this.LJLIL = showInfoWidget;
        this.LJLILLLLZI = showInfo;
        this.LJLJI = c86369Xv3;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LL(this.LJLILLLLZI);
            this.LJLIL.LL(this.LJLILLLLZI);
            C86369Xv3 c86369Xv3 = this.LJLJI;
            int i = this.LJLJJI;
            c86369Xv3.scrollTo((i + i) - this.LJLJJL, 0);
            C86369Xv3 c86369Xv32 = this.LJLJI;
            int i2 = this.LJLJJI;
            int LJIILL = C17N.LJIILL(40.0d);
            C86376XvA c86376XvA = c86369Xv32.LJLIL;
            if (c86376XvA != null) {
                c86376XvA.LIZ();
            }
            C86376XvA c86376XvA2 = new C86376XvA(c86369Xv32);
            c86369Xv32.LJLIL = c86376XvA2;
            c86376XvA2.LIZIZ = LJIILL;
            c86376XvA2.LIZJ = 2;
            c86376XvA2.LIZLLL = i2;
            c86376XvA2.LJFF = true;
            c86376XvA2.LJIIIIZZ.run();
        } finally {
            if (LIZ) {
            }
        }
    }
}
