package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YRd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87381YRd implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public final HandlerThread LIZJ;
    public final Handler LIZLLL;
    public long LJ;
    public final long LJFF;
    public int LJI;
    public int LJII;
    public final List<IMessage> LJIIIIZZ;

    @Override // X.YRT
    public final void LIZ() {
    }

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 6;
    }

    @Override // X.InterfaceC87391YRn
    public final List<IMessage> LJFF() {
        return null;
    }

    @Override // X.YRT
    public final void onStart() {
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.InterfaceC87391YRn
    public final Looper LJII() {
        return this.LIZJ.getLooper();
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJIIIIZZ).clear();
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LIZJ.quit();
    }

    @Override // X.YRT
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LJIIIIZZ).clear();
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        C87379YRb c87379YRb = configuration.LIZ;
        this.LJ = c87379YRb.LJIIIZ;
        this.LJI = c87379YRb.LJIIJ;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        this.LIZLLL.removeCallbacksAndMessages(null);
        if (stopMessageConfig.LJLIL) {
            this.LIZLLL.sendEmptyMessage(213);
        }
    }

    public C87381YRd(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        HandlerThread handlerThread = new HandlerThread("MessagePortal-AsyncOPTWindow-Dispatch");
        this.LIZJ = handlerThread;
        this.LJ = 50L;
        this.LJFF = 1000L;
        this.LJI = 3;
        this.LJII = 3;
        this.LJIIIIZZ = new CopyOnWriteArrayList();
        handlerThread.start();
        this.LIZLLL = new Handler(handlerThread.getLooper(), new IDCallbackS369S0100000_15(this, 8));
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler = this.LIZLLL;
        handler.sendMessageDelayed(handler.obtainMessage(211, list), j);
    }
}
