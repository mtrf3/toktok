package X;

import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: X.OhY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62600OhY implements InterfaceC62716OjQ {
    public final /* synthetic */ ViewOnClickListenerC62596OhU LIZ;

    public C62600OhY(ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU) {
        this.LIZ = viewOnClickListenerC62596OhU;
    }

    @Override // X.InterfaceC62716OjQ
    public final void LJIIIIZZ(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return;
                }
                this.LIZ.LJLJI = true;
                return;
            }
            ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU = this.LIZ;
            viewOnClickListenerC62596OhU.LJLJI = false;
            long currentTimeMillis = System.currentTimeMillis();
            ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU2 = this.LIZ;
            int i = viewOnClickListenerC62596OhU2.LJLIL;
            viewOnClickListenerC62596OhU.LJLJJL = currentTimeMillis + i;
            RunnableC62601OhZ runnableC62601OhZ = viewOnClickListenerC62596OhU2.LJLJJI;
            runnableC62601OhZ.LJLIL = false;
            RelativeLayout relativeLayout = viewOnClickListenerC62596OhU2.LJLJLJ;
            if (relativeLayout == null) {
                return;
            }
            relativeLayout.postDelayed(runnableC62601OhZ, i);
            return;
        }
        ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU3 = this.LIZ;
        viewOnClickListenerC62596OhU3.LJLJI = true;
        RunnableC62601OhZ runnableC62601OhZ2 = viewOnClickListenerC62596OhU3.LJLJJI;
        if (runnableC62601OhZ2 == null) {
            return;
        }
        runnableC62601OhZ2.LJLIL = true;
    }
}
