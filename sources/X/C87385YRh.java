package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YRh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87385YRh implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public Handler LIZJ;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 3;
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
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
        this.LIZJ = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 10));
    }

    @Override // X.YRT
    public final void onDestroy() {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public C87385YRh(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.sendMessageDelayed(handler.obtainMessage(231, list), j);
        }
    }
}
