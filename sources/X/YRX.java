package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRX implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public final HandlerThread LIZJ;
    public final Handler LIZLLL;
    public final List<C87390YRm> LJ;

    @Override // X.YRT
    public final void LIZ() {
    }

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 5;
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
    public final void onDestroy() {
        synchronized (this) {
            ((ArrayList) this.LJ).clear();
        }
        this.LIZLLL.removeCallbacksAndMessages(null);
        this.LIZJ.quit();
    }

    @Override // X.YRT
    public final void onRelease() {
        synchronized (this) {
            ((ArrayList) this.LJ).clear();
        }
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    @Override // X.YRT
    public final void onStart() {
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        this.LIZLLL.removeCallbacksAndMessages(null);
    }

    public YRX(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        HandlerThread handlerThread = new HandlerThread("MessagePortal-Dispatch");
        this.LIZJ = handlerThread;
        this.LJ = new ArrayList();
        handlerThread.start();
        this.LIZLLL = new Handler(handlerThread.getLooper(), new IDCallbackS369S0100000_15(this, 7));
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            IMessage iMessage = (IMessage) it.next();
            if (this.LIZIZ.LJIIL.get(iMessage.getIntType()) != null && !this.LIZIZ.LJIILL.onMessage(iMessage)) {
                if (this.LIZIZ.LJIIJJI(iMessage)) {
                    arrayList.add(new C87390YRm(iMessage, true, 12));
                } else {
                    arrayList2.add(new C87390YRm(iMessage, false, 14));
                }
            }
        }
        synchronized (this) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = ((ArrayList) this.LJ).iterator();
                int i2 = -1;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        if (((C87390YRm) next).LJLILLLLZI) {
                            i2 = i;
                        }
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                ((ArrayList) this.LJ).addAll(i2 + 1, arrayList);
            }
            ((ArrayList) this.LJ).addAll(arrayList2);
        }
        if ((!arrayList.isEmpty()) || (!arrayList2.isEmpty())) {
            if (this.LIZLLL.hasMessages(205)) {
                this.LIZLLL.removeMessages(205);
            }
            this.LIZLLL.sendEmptyMessage(205);
        }
    }
}
