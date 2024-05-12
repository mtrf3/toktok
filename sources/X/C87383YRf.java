package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.YRf, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87383YRf implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public Handler LIZJ;
    public final List<IMessage> LIZLLL;
    public volatile int LJ;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 0;
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
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
        this.LIZJ = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 9));
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC87391YRn
    public final List<IMessage> LJFF() {
        return this.LIZLLL;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        Handler handler;
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler2 = this.LIZJ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if (stopMessageConfig.LJLIL && (handler = this.LIZJ) != null) {
            handler.sendEmptyMessage(206);
        }
    }

    public final void LJIIIZ(boolean z) {
        Handler handler = this.LIZJ;
        if (handler != null && handler.hasMessages(205)) {
            return;
        }
        if (!z) {
            Handler handler2 = this.LIZJ;
            if (handler2 != null) {
                handler2.sendEmptyMessage(205);
                return;
            }
            return;
        }
        Handler handler3 = this.LIZJ;
        if (handler3 == null) {
            return;
        }
        handler3.sendEmptyMessageDelayed(205, 200L);
    }

    public C87383YRf(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJ = 1;
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.sendMessageDelayed(handler.obtainMessage(201, list), j);
        }
    }
}
