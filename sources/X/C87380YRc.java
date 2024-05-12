package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YRc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87380YRc implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public long LIZJ;
    public final long LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public Handler LJII;
    public final List<IMessage> LJIIIIZZ;
    public final transient Object LJIIIZ;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 1;
    }

    @Override // X.InterfaceC87391YRn
    public final Looper LJII() {
        return null;
    }

    @Override // X.YRT
    public final void onStart() {
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void LIZ() {
        this.LJII = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 13));
    }

    public final void LJIIIZ() {
        int i = (int) (this.LIZLLL / this.LIZJ);
        MessageMonitor LIZJ = this.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("expect dispatch count: ");
        LIZ.append(i);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        int size = ((CopyOnWriteArrayList) this.LJIIIIZZ).size() / i;
        this.LJFF = size;
        int i2 = this.LJ;
        if (size < i2) {
            size = i2;
        }
        this.LJFF = size;
        this.LIZ.LIZJ().monitorMsgDispatchSize(this.LJFF, ((CopyOnWriteArrayList) this.LJIIIIZZ).size(), false, this.LIZLLL, this.LJFF, this.LIZ.context().LIZIZ, this.LIZ.context().LIZJ, 1);
        MessageMonitor LIZJ2 = this.LIZ.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("next time dispatch size: ");
        LIZ2.append(this.LJFF);
        LIZJ2.log("MessagePortal", X1D.LIZIZ(LIZ2));
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJIIIIZZ).clear();
        Handler handler = this.LJII;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LJIIIIZZ).clear();
        Handler handler = this.LJII;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC87391YRn
    public final List<IMessage> LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        C87379YRb c87379YRb = configuration.LIZ;
        this.LIZJ = c87379YRb.LJIIIZ;
        this.LJ = c87379YRb.LJIIJ;
        this.LJI = c87379YRb.LJIILLIIL;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        Handler handler;
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler2 = this.LJII;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if (stopMessageConfig.LJLIL && (handler = this.LJII) != null) {
            handler.sendEmptyMessage(213);
        }
    }

    public final void LJIIJ(boolean z) {
        Handler handler = this.LJII;
        if (handler != null && handler.hasMessages(212)) {
            return;
        }
        if (!z) {
            Handler handler2 = this.LJII;
            if (handler2 != null) {
                handler2.sendEmptyMessage(212);
                return;
            }
            return;
        }
        Handler handler3 = this.LJII;
        if (handler3 == null) {
            return;
        }
        handler3.sendEmptyMessageDelayed(212, this.LIZJ);
    }

    public C87380YRc(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        this.LIZJ = 50L;
        this.LIZLLL = 1000L;
        this.LJ = 3;
        this.LJFF = 3;
        this.LJIIIIZZ = new CopyOnWriteArrayList();
        this.LJIIIZ = new Object();
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        if (this.LJI) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                IMessage iMessage = (IMessage) it.next();
                if (!this.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                    if (this.LIZIZ.LJIIJJI(iMessage)) {
                        arrayList.add(iMessage);
                    } else {
                        synchronized (this.LJIIIZ) {
                            ((CopyOnWriteArrayList) this.LJIIIIZZ).add(iMessage);
                        }
                    }
                }
            }
            Handler handler = this.LJII;
            if (handler != null) {
                if (!arrayList.isEmpty()) {
                    handler.sendMessageDelayed(handler.obtainMessage(232, arrayList), j);
                    return;
                }
                LJIIIZ();
                Handler handler2 = this.LJII;
                if (handler2 != null && handler2.hasMessages(212)) {
                    return;
                }
                handler.sendEmptyMessageDelayed(212, j);
                return;
            }
            return;
        }
        Handler handler3 = this.LJII;
        if (handler3 != null) {
            handler3.sendMessageDelayed(handler3.obtainMessage(211, list), j);
        }
    }
}
