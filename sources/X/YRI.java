package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRI implements InterfaceC87394YRq {
    public final YRR LIZ;
    public final YRJ LIZIZ;
    public YRM LIZJ;
    public final IMessageWsClient LIZLLL;
    public final List<Long> LJ;
    public int LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public volatile String LJIIIIZZ;
    public long LJIIIZ;
    public volatile java.util.Set<Integer> LJIIJ;
    public volatile long LJIIJJI;
    public int LJIIL;
    public final AtomicInteger LJIILIIL;
    public long LJIILJJIL;
    public String LJIILL;
    public final AtomicInteger LJIILLIIL;
    public Handler LJIIZILJ;
    public YMI LJIJ;

    @Override // X.YRT
    public final void startPrefetchMessage() {
    }

    @Override // X.YRT
    public final void LIZ() {
        this.LJIIZILJ = this.LIZ.LIZ.LIZLLL(new IDCallbackS369S0100000_15(this, 16));
        YMI ymi = this.LJIJ;
        if (ymi != null) {
            C30591Hz.LJJIIZI(ymi.LIZ, "uplink client start");
            YMR ymr = new YMR(ymi);
            ymr.start();
            ymi.LJFF = ymr;
        }
    }

    public final void LJIIIZ() {
        Handler handler;
        Handler handler2 = this.LJIIZILJ;
        if (handler2 != null && handler2.hasMessages(113) && (handler = this.LJIIZILJ) != null) {
            handler.removeMessages(113);
        }
    }

    public final void LJIIJ() {
        Handler handler;
        Handler handler2 = this.LJIIZILJ;
        if (handler2 != null && handler2.hasMessages(106) && (handler = this.LJIIZILJ) != null) {
            handler.removeMessages(106);
        }
    }

    public final void LJIIJJI() {
        Handler handler;
        Handler handler2 = this.LJIIZILJ;
        if (handler2 != null && handler2.hasMessages(110) && (handler = this.LJIIZILJ) != null) {
            handler.removeMessages(110);
        }
    }

    public final void LJIILIIL() {
        Message obtainMessage;
        Handler handler;
        if (!this.LIZLLL.isWsConnected()) {
            return;
        }
        this.LIZ.LIZ.LIZJ().log("MessagePortal", "trigger heartbeat timer");
        LJIIJJI();
        Handler handler2 = this.LJIIZILJ;
        if (handler2 != null && (obtainMessage = handler2.obtainMessage(110)) != null && (handler = this.LJIIZILJ) != null) {
            handler.sendMessageDelayed(obtainMessage, this.LJIIJJI * 1000);
        }
    }

    public final void LJIILJJIL() {
        long j;
        if (this.LJI > 0) {
            j = this.LJI;
        } else {
            j = 1000;
        }
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("call api after ");
        LIZ.append(j);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(109, j);
        }
    }

    @Override // X.YRT
    public final void onDestroy() {
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LIZLLL.disconnectFromWebSocket("release");
        this.LIZLLL.onRelease();
        this.LIZLLL.setCallback(null);
        YMI ymi = this.LJIJ;
        if (ymi != null) {
            ymi.LJFF();
        }
    }

    @Override // X.YRT
    public final void onStart() {
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            handler.sendEmptyMessage(101);
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        onDestroy();
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        C32077CiP c32077CiP = configuration.LIZJ;
        YMB ymb = new YMB(c32077CiP.LJLIL, c32077CiP.LJLILLLLZI, c32077CiP.LJLJI);
        YRJ yrj = configuration.LIZIZ.LIZJ;
        IMessageWsClient iMessageWsClient = null;
        if (yrj == null || yrj.LJLIL == null || configuration.LIZ.LJI == null) {
            return;
        }
        if (yrj != null) {
            iMessageWsClient = yrj.LJLIL;
        }
        o.LJI(iMessageWsClient);
        YMS yms = configuration.LIZ.LJI;
        if (yms == null || !yms.LJIIL()) {
            return;
        }
        YMS yms2 = configuration.LIZ.LJI;
        o.LJI(yms2);
        this.LJIJ = new YMI(ymb, iMessageWsClient, iMessageWsClient, yms2);
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        int i;
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            if (stopMessageConfig.LJLIL) {
                i = 104;
            } else {
                i = 102;
            }
            handler.sendEmptyMessage(i);
        }
    }

    public final void LJIIL(int i) {
        if (this.LJIIJ.contains(Integer.valueOf(i))) {
            return;
        }
        if (i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE && this.LIZJ != YRM.WS_CONNECTING) {
            return;
        }
        this.LJIIJ.add(Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("cursor", this.LJIIIIZZ);
        hashMap.put("user_id", String.valueOf(this.LIZLLL.getUserId()));
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchMessage call api ");
        LIZ.append(i);
        LIZJ.log("MessagePortal", X1D.LIZIZ(LIZ));
        this.LJIIIZ = System.currentTimeMillis();
        this.LIZLLL.apiCall(hashMap, i, true);
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchStarted();
        }
    }

    public final void LJIILL(YRM yrm) {
        int i = YRO.LIZ[yrm.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.LIZ.LIZ.context().LIZIZ = 1;
            }
        } else {
            this.LIZ.LIZ.context().LIZIZ = 0;
        }
        this.LIZJ = yrm;
    }

    public final void LJIILLIIL(String str) {
        this.LIZ.LIZ.LIZJ().log("MessagePortal", "switchToHttp");
        LJIILL(YRM.HTTP);
        LJIIJ();
        LJIIIZ();
        this.LIZLLL.disconnectFromWebSocket(str);
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            handler.sendEmptyMessage(109);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onSwitchToHttp(str);
        }
    }

    public YRI(YRR manager, YRJ yrj) {
        o.LJIIIZ(manager, "manager");
        this.LIZ = manager;
        this.LIZIZ = yrj;
        this.LIZJ = YRM.HTTP;
        IMessageWsClient iMessageWsClient = yrj.LJLIL;
        this.LIZLLL = iMessageWsClient;
        this.LJ = C47261Igj.LJJIJIL(5L);
        this.LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
        this.LJIIJ = new LinkedHashSet();
        this.LJIIJJI = 10L;
        this.LJIILIIL = new AtomicInteger(0);
        this.LJIILLIIL = new AtomicInteger();
        iMessageWsClient.setCallback(new YRH(this));
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
    }

    @Override // X.InterfaceC87394YRq
    public final void LIZIZ(long j, C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        YMI ymi = this.LJIJ;
        if (ymi != null) {
            ymi.LJI(j, request, callback, null);
        }
    }
}
