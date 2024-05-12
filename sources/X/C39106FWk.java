package X;

import Y.ARunnableS10S0101000_6;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS9S0101000_5;
import Y.ARunnableS9S0201000_6;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.impl.StrategyImpl;
import java.util.LinkedList;

/* renamed from: X.FWk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39106FWk {
    public static volatile C39106FWk LJII;
    public C39103FWh LIZ;
    public C39102FWg LIZIZ;
    public C39104FWi LIZJ;
    public C39112FWq LIZLLL;
    public C39111FWp LJ;
    public C39107FWl LJFF;
    public final C39105FWj LJI;

    public static C39106FWk LIZ() {
        if (LJII == null) {
            synchronized (C39106FWk.class) {
                if (LJII == null) {
                    LJII = new C39106FWk();
                }
            }
        }
        return LJII;
    }

    public final void LIZIZ() {
        C39105FWj c39105FWj = this.LJI;
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = new ARunnableS12S0101000_8(3, this, 5);
        c39105FWj.getClass();
        if (Looper.myLooper() == null) {
            return;
        }
        synchronized (c39105FWj) {
            Handler handler = c39105FWj.LIZ.get();
            if (handler != null) {
                Message obtain = Message.obtain(handler, new ARunnableS9S0201000_6(1, c39105FWj, aRunnableS12S0101000_8, 7));
                obtain.obj = C39105FWj.LJFF;
                handler.sendMessageAtFrontOfQueue(obtain);
            }
        }
    }

    public final void LIZJ() {
        this.LJI.getClass();
        if (((Boolean) C34710Djm.LJJL.getValue()).booleanValue()) {
            C39103FWh c39103FWh = new C39103FWh();
            this.LIZ = c39103FWh;
            this.LJI.LIZ(c39103FWh);
        }
        if (((Boolean) C34710Djm.LJJLI.getValue()).booleanValue()) {
            C39102FWg c39102FWg = new C39102FWg();
            this.LIZIZ = c39102FWg;
            this.LJI.LIZ(c39102FWg);
        }
        if (((Boolean) C34710Djm.LJJLIIIIJ.getValue()).booleanValue()) {
            C39104FWi c39104FWi = new C39104FWi();
            this.LIZJ = c39104FWi;
            this.LJI.LIZ(c39104FWi);
        }
        if (((Boolean) C34710Djm.LJJLIIIJ.getValue()).booleanValue()) {
            C39112FWq c39112FWq = new C39112FWq();
            this.LIZLLL = c39112FWq;
            this.LJI.LIZ(c39112FWq);
        }
        if (((Boolean) C34710Djm.LJJLIIIJILLIZJL.getValue()).booleanValue()) {
            C39111FWp c39111FWp = new C39111FWp();
            this.LJ = c39111FWp;
            this.LJI.LIZ(c39111FWp);
        }
        if (StrategyImpl.LIZIZ().LJJIJIL()) {
            C39107FWl c39107FWl = new C39107FWl();
            this.LJFF = c39107FWl;
            this.LJI.LIZ(c39107FWl);
            this.LJI.LIZJ.set(new C39108FWm());
        }
        C39105FWj c39105FWj = this.LJI;
        c39105FWj.getClass();
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        synchronized (c39105FWj) {
            Handler handler = c39105FWj.LIZ.get();
            if (handler == null) {
                handler = new HandlerC39113FWr(Looper.myLooper());
                c39105FWj.LIZ.set(handler);
            }
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, new ARunnableS10S0101000_6(2, c39105FWj, 13)));
            if (c39105FWj.LIZLLL.get() == null) {
                c39105FWj.LIZLLL.set(new LinkedList());
            }
        }
        this.LJI.LIZ.get().postDelayed(new ARunnableS9S0101000_5(2, this, 6), 5000L);
    }

    public C39106FWk() {
        if (C39105FWj.LJI == null) {
            synchronized (C39105FWj.class) {
                if (C39105FWj.LJI == null) {
                    C39105FWj.LJI = new C39105FWj();
                }
            }
        }
        this.LJI = C39105FWj.LJI;
    }
}
