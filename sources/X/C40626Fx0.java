package X;

import android.os.Debug;
import android.os.Message;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* renamed from: X.Fx0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40626Fx0 extends PthreadThread {
    public final long LJLIL;
    public volatile boolean LJLILLLLZI;
    public final /* synthetic */ C40624Fwy LJLJI;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        while (!this.LJLILLLLZI) {
            try {
                try {
                    Thread.sleep(this.LJLIL);
                    LJ();
                    LIZLLL();
                } catch (Exception unused) {
                    this.LJLILLLLZI = true;
                }
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public final void LIZLLL() {
        long nanoTime = System.nanoTime();
        if (this.LJLJI.LJIIJ >= 0 && nanoTime - this.LJLJI.LJIIJ > this.LJLJI.LJIIJJI && this.LJLJI.LJIIJ != this.LJLJI.LJIJI) {
            C40624Fwy c40624Fwy = this.LJLJI;
            c40624Fwy.LJIJI = c40624Fwy.LJIIJ;
            C15610jN.LIZ().postAtFrontOfQueue(this.LJLJI.LJJ);
        }
    }

    public final void LJ() {
        if (Debug.isDebuggerConnected()) {
            return;
        }
        long nanoTime = System.nanoTime();
        if (this.LJLJI.LJIJJ > 0) {
            C40624Fwy c40624Fwy = this.LJLJI;
            if (c40624Fwy.LJIIZILJ > 0) {
                long j = nanoTime - c40624Fwy.LJIJJ;
                C40624Fwy c40624Fwy2 = this.LJLJI;
                if (j > c40624Fwy2.LJIIZILJ && !c40624Fwy2.LJIJJLI) {
                    this.LJLJI.LJIJJLI = true;
                    C15610jN.LIZ().sendMessageAtFrontOfQueue(Message.obtain(C15610jN.LIZ(), this.LJLJI.LJJIFFI));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40626Fx0(C40624Fwy c40624Fwy, double d) {
        super("FWatchDogWorkThread");
        float f;
        this.LJLJI = c40624Fwy;
        if (C40627Fx1.LJLILLLLZI < 0) {
            if (C40627Fx1.LIZ() > 0.0f) {
                f = 1000 / C40627Fx1.LIZ();
            } else {
                f = 16.666668f;
            }
            C40627Fx1.LJLILLLLZI = (long) Math.ceil(f);
        }
        this.LJLIL = (long) (C40627Fx1.LJLILLLLZI * d);
    }
}
