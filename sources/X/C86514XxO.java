package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.innerpush.ui.InnerPushPullUpLayout;

/* renamed from: X.XxO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86514XxO implements InterfaceC62716OjQ {
    public final /* synthetic */ C86493Xx3 LIZ;

    public C86514XxO(C86493Xx3 c86493Xx3) {
        this.LIZ = c86493Xx3;
    }

    @Override // X.InterfaceC62716OjQ
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return;
                    }
                } else {
                    this.LIZ.LJLJJI = true;
                    return;
                }
            }
            C86493Xx3 c86493Xx3 = this.LIZ;
            c86493Xx3.LJLJJI = false;
            long currentTimeMillis = System.currentTimeMillis();
            C86493Xx3 c86493Xx32 = this.LIZ;
            c86493Xx3.LJLJJL = currentTimeMillis + c86493Xx32.LJLJJLL;
            c86493Xx32.LIZJ();
            return;
        }
        C86493Xx3 c86493Xx33 = this.LIZ;
        c86493Xx33.LJLJJI = true;
        RunnableC86513XxN runnableC86513XxN = c86493Xx33.LJLJL;
        runnableC86513XxN.LJLIL = true;
        InnerPushPullUpLayout innerPushPullUpLayout = c86493Xx33.LJLIL;
        if (innerPushPullUpLayout == null) {
            return;
        }
        innerPushPullUpLayout.removeCallbacks(runnableC86513XxN);
    }
}
