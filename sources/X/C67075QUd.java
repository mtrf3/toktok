package X;

import Y.ARunnableS47S0100000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sync.settings.SettingsV2;
import com.bytedance.sync.v2.compensate.CompensatorImpl;
import java.util.ArrayList;

/* renamed from: X.QUd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67075QUd implements QU3 {
    public CompensatorImpl LJLIL;
    public final Context LJLILLLLZI;
    public final C67040QSu LJLJI;
    public final QW8 LJLJJI;
    public C67076QUe LJLJJL;

    @Override // X.QU3
    public final void LJIILJJIL() {
        CompensatorImpl compensatorImpl = new CompensatorImpl(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(compensatorImpl, 80);
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            aRunnableS47S0100000_11.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(aRunnableS47S0100000_11);
        }
        SettingsV2 LIZIZ = QUW.LIZJ(compensatorImpl.LJLIL).LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Compensator] start compensator. compensator will run after ");
        long j = 1000;
        LIZ.append((LIZIZ.eventSendDelay * 1000) + 1000);
        LIZ.append("ms");
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        Handler handler = (Handler) compensatorImpl.LJLILLLLZI.LIZLLL(new Object[0]);
        ARunnableS47S0100000_11 aRunnableS47S0100000_112 = compensatorImpl.LJLL;
        if (LIZIZ.LIZIZ()) {
            j = 1000 + (LIZIZ.eventSendDelay * 1000);
        }
        handler.postDelayed(aRunnableS47S0100000_112, j);
        C67076QUe c67076QUe = new C67076QUe(this.LJLILLLLZI, this.LJLJI);
        SettingsV2 LIZIZ2 = QUW.LIZJ(c67076QUe.LJLJJL).LIZIZ();
        QUW LIZJ = QUW.LIZJ(c67076QUe.LJLJJL);
        synchronized (LIZJ.LJLJJI) {
            ((ArrayList) LIZJ.LJLJJI).add(c67076QUe);
        }
        ((InterfaceC67063QTr) QPG.LIZ(InterfaceC67063QTr.class)).LJJIJIIJI(c67076QUe);
        c67076QUe.LJLJLJ = c67076QUe.LJLJJI.LIZJ.LJFF();
        C66629QCz.LIZJ("[SocketPoll] start socket poll.");
        c67076QUe.LIZIZ(LIZIZ2, c67076QUe.LJLJLJ);
        c67076QUe.LJLILLLLZI.set(true);
        this.LJLIL = compensatorImpl;
        this.LJLJJL = c67076QUe;
    }

    @Override // X.QU3
    public final void LJIILL() {
        InterfaceC67082QUk interfaceC67082QUk;
        CompensatorImpl compensatorImpl = this.LJLIL;
        if (compensatorImpl != null) {
            compensatorImpl.LJLJLJ.set(true);
            if (compensatorImpl.LJLJLJ.get()) {
                if (compensatorImpl.LJLJJLL != null) {
                    compensatorImpl.LJLJJLL.LIZIZ();
                } else if (((Handler) compensatorImpl.LJLILLLLZI.LIZLLL(new Object[0])).hasCallbacks(compensatorImpl.LJLL)) {
                    C66629QCz.LIZ("[Compensator] reset start delay task and run right now");
                    ((Handler) compensatorImpl.LJLILLLLZI.LIZLLL(new Object[0])).removeCallbacks(compensatorImpl.LJLL);
                    ((Handler) compensatorImpl.LJLILLLLZI.LIZLLL(new Object[0])).post(compensatorImpl.LJLL);
                }
            }
        }
        C67076QUe c67076QUe = this.LJLJJL;
        if (c67076QUe != null) {
            c67076QUe.LJLIL.set(true);
            if (c67076QUe.LJLIL.get() && (interfaceC67082QUk = c67076QUe.LJLJL) != null) {
                interfaceC67082QUk.LIZIZ();
            }
        }
    }

    @Override // X.QU3
    public final void reset() {
        CompensatorImpl compensatorImpl = this.LJLIL;
        if (compensatorImpl != null) {
            ((Handler) compensatorImpl.LJLILLLLZI.LIZLLL(new Object[0])).removeCallbacksAndMessages(null);
            QUW LIZJ = QUW.LIZJ(compensatorImpl.LJLIL);
            synchronized (LIZJ.LJLJJI) {
                ((ArrayList) LIZJ.LJLJJI).remove(compensatorImpl);
            }
            ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(compensatorImpl, 81);
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                aRunnableS47S0100000_11.run();
            } else {
                new Handler(C16880lQ.LLJJJJ()).post(aRunnableS47S0100000_11);
            }
            if (compensatorImpl.LJLJJLL != null) {
                compensatorImpl.LJLJJLL.destroy();
                compensatorImpl.LJLJJLL = null;
            }
            this.LJLIL = null;
        }
        C67076QUe c67076QUe = this.LJLJJL;
        if (c67076QUe != null) {
            QUW.LIZJ(c67076QUe.LJLJJL).LIZLLL(c67076QUe);
            ((Handler) c67076QUe.LJLJI.LIZLLL(new Object[0])).removeMessages(101);
            ((Handler) c67076QUe.LJLJI.LIZLLL(new Object[0])).removeMessages(102);
            this.LJLJJL = null;
        }
    }

    @Override // X.QU3
    public final void LIZ(C67101QVd c67101QVd) {
        CompensatorImpl compensatorImpl = this.LJLIL;
        if (compensatorImpl != null && compensatorImpl.LJLJLLL.get() && compensatorImpl.LJLJJLL != null) {
            compensatorImpl.LJLJJLL.LIZ(c67101QVd);
        }
        C67076QUe c67076QUe = this.LJLJJL;
        if (c67076QUe != null) {
            InterfaceC67082QUk interfaceC67082QUk = c67076QUe.LJLJL;
            if (c67076QUe.LJLILLLLZI.get() && c67076QUe.LJLJL != null) {
                interfaceC67082QUk.LIZ(c67101QVd);
            }
        }
    }

    public C67075QUd(Context context, C67040QSu c67040QSu, QUD qud) {
        this.LJLILLLLZI = context;
        this.LJLJI = c67040QSu;
        this.LJLJJI = qud;
    }
}
