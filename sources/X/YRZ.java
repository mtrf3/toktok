package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.MessageSEI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRZ implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public Handler LIZJ;
    public Handler LIZLLL;
    public final List<IMessage> LJ;
    public final List<MessageSEI> LJFF;
    public final List<MessageSEI> LJI;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 4;
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
        this.LIZJ = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 5));
        this.LIZLLL = this.LIZ.LIZLLL(new IDCallbackS369S0100000_15(this, 6));
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LIZLLL;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.LIZLLL;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler = this.LIZJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (stopMessageConfig.LJLIL) {
            ((CopyOnWriteArrayList) this.LJ).clear();
            ((CopyOnWriteArrayList) this.LJFF).clear();
            ((CopyOnWriteArrayList) this.LJI).clear();
        }
    }

    public final void LJIIIZ(List<? extends IMessage> list) {
        Message obtainMessage;
        MessageMonitor LIZJ = this.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("scheduleFeatureMessageDispatch size=");
        LIZ.append(((ArrayList) list).size());
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        Handler handler = this.LIZJ;
        if (handler != null && (obtainMessage = handler.obtainMessage(251, list)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public YRZ(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        this.LJ = new CopyOnWriteArrayList();
        this.LJFF = new CopyOnWriteArrayList();
        this.LJI = new CopyOnWriteArrayList();
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler = this.LIZLLL;
        if (handler != null) {
            handler.sendMessageDelayed(handler.obtainMessage(152, list), j);
        }
    }
}
