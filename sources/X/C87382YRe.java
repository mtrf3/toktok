package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YRe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87382YRe implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public Handler LJFF;
    public final List<IMessage> LJI;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 2;
    }

    @Override // X.InterfaceC87391YRn
    public final List<IMessage> LJFF() {
        return null;
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
        this.LJFF = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 12));
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJI).clear();
        Handler handler = this.LJFF;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LJI).clear();
        Handler handler = this.LJFF;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        C87379YRb c87379YRb = configuration.LIZ;
        this.LIZJ = c87379YRb.LJIIJJI;
        this.LIZLLL = c87379YRb.LJIIL;
        this.LJ = c87379YRb.LJIILIIL;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        Handler handler;
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler2 = this.LJFF;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if (stopMessageConfig.LJLIL && (handler = this.LJFF) != null) {
            handler.sendEmptyMessage(223);
        }
    }

    public final void LJIIIZ(boolean z) {
        Handler handler = this.LJFF;
        if (handler != null && handler.hasMessages(222)) {
            return;
        }
        if (!z) {
            Handler handler2 = this.LJFF;
            if (handler2 != null) {
                handler2.sendEmptyMessage(222);
                return;
            }
            return;
        }
        Handler handler3 = this.LJFF;
        if (handler3 == null) {
            return;
        }
        handler3.sendEmptyMessageDelayed(222, this.LIZJ);
    }

    public C87382YRe(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        this.LIZJ = 50L;
        this.LIZLLL = 8;
        this.LJ = -1;
        this.LJI = new CopyOnWriteArrayList();
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler = this.LJFF;
        if (handler != null) {
            handler.sendMessageDelayed(handler.obtainMessage(221, list), j);
        }
    }
}
