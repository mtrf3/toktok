package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRY implements InterfaceC87391YRn {
    public final YRK LIZ;
    public final YRW LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public Handler LJ;
    public final List<IMessage> LJFF;

    @Override // X.InterfaceC87391YRn
    public final int LIZJ() {
        return 7;
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
        this.LJ = this.LIZ.LJ(new IDCallbackS369S0100000_15(this, 11));
    }

    public final int LJIIIZ() {
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJFF);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LIZ.LJFF().LJJII++;
        ArrayList arrayList2 = null;
        if (!arrayList.isEmpty()) {
            arrayList2 = arrayList;
        }
        if (arrayList2 == null) {
            return 0;
        }
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            IMessage iMessage = (IMessage) it.next();
            this.LIZIZ.LJIIL(iMessage, false);
            ((CopyOnWriteArrayList) this.LJFF).remove(iMessage);
            Object obj = iMessage.getExtraParams().get("param_direct_dispatch");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                this.LIZ.LIZJ().monitorMsgP2pDispatchDirectly(arrayList.size(), iMessage.getMethodName(), SystemClock.elapsedRealtime() - iMessage.getLocalTimestamp(), iMessage.getMessageFrom(), false, this.LIZIZ.LJJ, 7, iMessage.getExtraParams());
            }
            i++;
            if (SystemClock.uptimeMillis() - uptimeMillis > this.LIZLLL) {
                return i;
            }
        }
        return i;
    }

    @Override // X.YRT
    public final void onDestroy() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        ((CopyOnWriteArrayList) this.LJFF).clear();
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC87391YRn
    public final List<IMessage> LJFF() {
        return this.LJFF;
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        C87379YRb c87379YRb = configuration.LIZ;
        this.LIZJ = c87379YRb.LJIIIZ;
        this.LIZLLL = c87379YRb.LJIILL;
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        Handler handler;
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler2 = this.LJ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        if (stopMessageConfig.LJLIL && (handler = this.LJ) != null) {
            handler.sendEmptyMessage(213);
        }
    }

    public YRY(YRK portal, YRW dispatcher) {
        o.LJIIIZ(portal, "portal");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LIZ = portal;
        this.LIZIZ = dispatcher;
        this.LIZJ = 50L;
        this.LIZLLL = 8;
        this.LJFF = new CopyOnWriteArrayList();
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87391YRn
    public final void LJI(long j, List list) {
        Handler handler;
        Boolean bool;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMessage iMessage = (IMessage) it.next();
            if (!this.LIZIZ.LJIILJJIL.onMessage(iMessage)) {
                if (this.LIZIZ.LJIIJJI(iMessage)) {
                    java.util.Map<String, Object> extraParams = iMessage.getExtraParams();
                    o.LJIIIIZZ(extraParams, "message.extraParams");
                    extraParams.put("param_direct_dispatch", Boolean.TRUE);
                    arrayList.add(iMessage);
                } else {
                    ((CopyOnWriteArrayList) this.LJFF).add(iMessage);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = ((CopyOnWriteArrayList) this.LJFF).iterator();
            int i = -1;
            int i2 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Object obj = ((IMessage) next).getExtraParams().get("param_direct_dispatch");
                    if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            ((CopyOnWriteArrayList) this.LJFF).addAll(i + 1, arrayList);
        }
        Handler handler2 = this.LJ;
        if ((handler2 != null && handler2.hasMessages(212)) || (handler = this.LJ) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(212, j);
    }
}
