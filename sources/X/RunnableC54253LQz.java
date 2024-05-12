package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.service.service.IImInboxDmService;

/* renamed from: X.LQz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC54253LQz implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ LR0 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public RunnableC54253LQz(int i, int i2, LR0 lr0, int i3, int i4) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = lr0;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
    }

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateTabBadgeByCache set numCount: ");
        LIZ.append(this.LJLIL);
        LIZ.append(", dotCount: ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isBubbleShowing: ");
        HH1.LIZIZ(LIZ, this.LJLJI.LJIIZILJ, LIZ, "NCTBPManager");
        LR0 lr0 = this.LJLJI;
        if (lr0.LJIIZILJ) {
            return;
        }
        boolean z = true;
        if (this.LJLIL > 0 || this.LJLILLLLZI > 0) {
            lr0.LJIL = true;
            LR4.LJI = true;
            if (LR4.LJIIJ.compareAndSet(false, true)) {
                LR4.LIZLLL = SystemClock.uptimeMillis();
            }
            this.LJLJI.LJIIZILJ(this.LJLIL, this.LJLILLLLZI, 0);
        }
        if (this.LJLJJI >= 0) {
            IImInboxDmService LIZLLL = this.LJLJI.LIZLLL();
            if (this.LJLJJL <= 0) {
                z = false;
            }
            LIZLLL.onReceiveNoticeUnreadCount(z);
            this.LJLJI.LIZLLL().onReceiveDMUnreadCount(this.LJLJJI, false);
            this.LJLJI.LIZLLL().onUnreadBadgeShow();
        }
        LLQ LJIIIIZZ = this.LJLJI.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LJ(this.LJLIL, this.LJLJI.LJJIL);
        }
        if (this.LJLIL == 0 && this.LJLILLLLZI > 0) {
            LLQ LJIIIIZZ2 = this.LJLJI.LJIIIIZZ();
            if (LJIIIIZZ2 != null) {
                LJIIIIZZ2.LJJIJIIJIL(this.LJLJI.LJJIL);
            }
        } else {
            LLQ LJIIIIZZ3 = this.LJLJI.LJIIIIZZ();
            if (LJIIIIZZ3 != null) {
                LJIIIIZZ3.LJIILL(this.LJLJI.LJJIL);
            }
        }
        C221018lt.LJFF("NCTBPManager", "updateTabBadgeByCache end");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
