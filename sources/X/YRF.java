package X;

import Y.IDCallbackS369S0100000_15;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YRF implements InterfaceC87394YRq {
    public final YRR LIZ;
    public YRJ LIZIZ;
    public YRL LIZJ;
    public final IMessageWsClient LIZLLL;
    public final List<Long> LJ;
    public int LJFF;
    public C30176Bsq LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile String LJIIIZ;
    public long LJIIJ;
    public volatile java.util.Set<Integer> LJIIJJI;
    public volatile long LJIIL;
    public int LJIILIIL;
    public final AtomicInteger LJIILJJIL;
    public long LJIILL;
    public String LJIILLIIL;
    public final AtomicInteger LJIIZILJ;
    public Handler LJIJ;
    public Handler LJIJI;
    public YMI LJIJJ;
    public long LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public long LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public final List<IMessage> LJJIJIIJI;
    public final List<ProtoApiResult> LJJIJIIJIL;
    public final YRG LJJIJIL;

    @Override // X.YRT
    public final void LIZ() {
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onReady");
        this.LJIJ = this.LIZ.LIZ.LIZLLL(new IDCallbackS369S0100000_15(this, 14));
        this.LJIJI = this.LIZ.LIZ.LIZ(new IDCallbackS369S0100000_15(this, 15));
        if (this.LIZIZ.LJLJLLL) {
            LJIL(YRL.WS_CONNECTING);
            Handler handler = this.LJIJ;
            if (handler != null) {
                handler.sendEmptyMessage(105);
            }
        }
        YMI ymi = this.LJIJJ;
        if (ymi != null) {
            C30591Hz.LJJIIZI(ymi.LIZ, "uplink client start");
            YMR ymr = new YMR(ymi);
            ymr.start();
            ymi.LJFF = ymr;
        }
        LJIILIIL();
    }

    public final void LJIIIZ() {
        Handler handler;
        Handler handler2 = this.LJIJI;
        if (handler2 != null && handler2.hasMessages(113) && (handler = this.LJIJI) != null) {
            handler.removeMessages(113);
        }
    }

    public final void LJIIJ() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 != null && handler2.hasMessages(106) && (handler = this.LJIJ) != null) {
            handler.removeMessages(106);
        }
    }

    public final void LJIIJJI() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 != null && handler2.hasMessages(110) && (handler = this.LJIJ) != null) {
            handler.removeMessages(110);
        }
    }

    public final void LJIIL() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 != null && handler2.hasMessages(115) && (handler = this.LJIJ) != null) {
            handler.removeMessages(115);
        }
    }

    public final void LJIILIIL() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 != null && handler2.hasMessages(LiveTryModeCountDownThresholdSetting.DEFAULT) && (handler = this.LJIJ) != null) {
            handler.removeMessages(LiveTryModeCountDownThresholdSetting.DEFAULT);
        }
    }

    public final void LJIJ() {
        Message obtainMessage;
        Handler handler;
        if (!this.LIZLLL.isWsConnected()) {
            return;
        }
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "trigger heartbeat timer");
        LJIIJJI();
        Handler handler2 = this.LJIJ;
        if (handler2 != null && (obtainMessage = handler2.obtainMessage(110)) != null && (handler = this.LJIJ) != null) {
            handler.sendMessageDelayed(obtainMessage, this.LJIIL * 1000);
        }
    }

    public final void LJIJJ() {
        long j;
        if (this.LJII > 0) {
            j = this.LJII;
        } else {
            j = 1000;
        }
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("call api after ");
        LIZ.append(j);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        Handler handler = this.LJIJI;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(109, j);
        }
    }

    public final void LJIJJLI() {
        Handler handler;
        Handler handler2 = this.LJIJ;
        if (handler2 != null && !handler2.hasMessages(114) && (handler = this.LJIJ) != null) {
            handler.sendEmptyMessage(114);
        }
    }

    @Override // X.YRT
    public final void onDestroy() {
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onDestroy");
        Handler handler = this.LJIJ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        int i = this.LJJIII;
        int i2 = this.LJJIIJZLJL;
        int i3 = this.LJJIIJ;
        int i4 = this.LJJIFFI;
        int i5 = this.LJJII;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        YRW LJFF = this.LIZ.LIZ.LJFF();
        LJFF.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("all_dispatch_times", Integer.valueOf(LJFF.LJJII));
        linkedHashMap2.put("dispatch_limit_times", Integer.valueOf(LJFF.LJJIII));
        linkedHashMap.putAll(linkedHashMap2);
        LIZJ.monitorWSReuseMessage(i, i2, i3, i4, i5, linkedHashMap);
        this.LIZ.LIZ.LIZJ().monitorWSReuseCount(this.LJJIIZ);
        this.LIZLLL.disconnectFromWebSocket("release");
        this.LIZLLL.setCallback(null);
        YMI ymi = this.LJIJJ;
        if (ymi != null) {
            ymi.LJFF();
        }
    }

    @Override // X.YRT
    public final void onRelease() {
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onRelease");
        this.LJJ = false;
        this.LJJIIZI = false;
        this.LJJIJ = false;
        ((CopyOnWriteArrayList) this.LJJIJIIJI).clear();
        ((CopyOnWriteArrayList) this.LJJIJIIJIL).clear();
        this.LIZLLL.setCallback(null);
        LJIIIZ();
        LJIIL();
        LJIIJ();
        Handler handler = this.LJIJI;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJFF = 0;
        this.LIZ.LIZ.context().LIZLLL = 0L;
        this.LJII = 0L;
        this.LJIILIIL = 0;
        this.LJIJJLI = 0L;
        ((CopyOnWriteArrayList) this.LJ).clear();
        ((CopyOnWriteArraySet) this.LJIIJJI).clear();
        this.LJJI = 0L;
        this.LJIL = false;
        this.LIZLLL.onRelease();
        if (this.LIZJ == YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(YRL.WS_CONNECTED);
        }
        LJIJI(this.LIZIZ.LJLJL);
    }

    @Override // X.YRT
    public final void onStart() {
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStart strategyState: ");
        LIZ.append(this.LIZJ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        this.LJJIII++;
        this.LJI = null;
        this.LIZLLL.setCallback(this.LJJIJIL);
        if (!this.LIZIZ.LJLJLJ.LJLIL && this.LIZJ == YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(YRL.WS_CONNECTED);
        }
        Handler handler = this.LJIJ;
        if (handler != null) {
            handler.sendEmptyMessage(101);
        }
        LJIILIIL();
    }

    @Override // X.YRT
    public final void startPrefetchMessage() {
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPrefetchMessage strategyState: ");
        LIZ.append(this.LIZJ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        Handler handler = this.LJIJ;
        if (handler != null) {
            handler.sendEmptyMessage(121);
        }
    }

    @Override // X.YRT
    public final void LIZLLL(C32075CiN configuration) {
        o.LJIIIZ(configuration, "configuration");
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onCreate");
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
        this.LJIJJ = new YMI(ymb, iMessageWsClient, iMessageWsClient, yms2);
    }

    @Override // X.YRT
    public final void LJIIIIZZ(C30176Bsq stopMessageConfig) {
        o.LJIIIZ(stopMessageConfig, "stopMessageConfig");
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "onStop");
        this.LJJ = false;
        this.LJI = stopMessageConfig;
        Handler handler = this.LJIJ;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(102, stopMessageConfig));
        }
    }

    public final boolean LJIILJJIL(long j) {
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZJ2 = V10.LIZJ("checkDimensionValid, result dimension: ", j, ", portal dimension: ");
        LIZJ2.append(this.LIZ.LIZ.context().LIZJ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZJ2));
        if (j == 0 || this.LIZ.LIZ.context().LIZJ == j) {
            return true;
        }
        return false;
    }

    public final synchronized boolean LJIILL(boolean z) {
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("checkFirstMessageValid, result isFirst: ");
        LIZ.append(z);
        LIZ.append(", current isFirstMessageHandled: ");
        LIZ.append(this.LJIL);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        if (!z) {
            return true;
        }
        boolean z2 = this.LJIL;
        this.LJIL = true;
        return !z2;
    }

    public final void LJIILLIIL(int i) {
        boolean z;
        YRL yrl;
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LJ = C7MY.LJ("fetchMessage call api fetchRule: ", i, ", strategyState: ");
        LJ.append(this.LIZJ);
        LJ.append(", isStarted: ");
        LJ.append(this.LJJ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LJ));
        if (((CopyOnWriteArraySet) this.LJIIJJI).contains(Integer.valueOf(i))) {
            return;
        }
        if ((i == MessageApiConstant.FetchRule.FETCH_DATA_FOR_WS_ALONGSIDE && ((yrl = this.LIZJ) == YRL.HTTP || yrl == YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP)) || !this.LJJ) {
            return;
        }
        ((CopyOnWriteArraySet) this.LJIIJJI).add(Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("cursor", this.LJIIIZ);
        hashMap.put("user_id", String.valueOf(this.LIZLLL.getUserId()));
        hashMap.put("wss_version", "2");
        MessageMonitor LIZJ2 = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchMessage call api ");
        LIZ.append(i);
        LIZJ2.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        this.LJIIJ = System.currentTimeMillis();
        C32087CiZ c32087CiZ = this.LIZIZ.LJLJLJ;
        if (!c32087CiZ.LJLIL || this.LJJ || c32087CiZ.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL.apiCall(hashMap, i, z);
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onImFetchStarted();
        }
    }

    public final void LJIIZILJ(long j) {
        Message obtainMessage;
        Handler handler;
        this.LIZ.LIZ.LIZJ().log("MessagePortalReuse", "trigger fallback timer");
        LJIIJ();
        Handler handler2 = this.LJIJ;
        if (handler2 != null && (obtainMessage = handler2.obtainMessage(106, "ws_connect_timeout")) != null && (handler = this.LJIJ) != null) {
            handler.sendMessageDelayed(obtainMessage, j);
        }
    }

    public final void LJIJI(long j) {
        Handler handler;
        Message obtainMessage;
        Handler handler2;
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("trigger release delay disconnect timer, releaseDelayDisconnectTime: ");
        LIZ.append(j);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        LJIILIIL();
        if (j > 0 && (handler = this.LJIJ) != null && (obtainMessage = handler.obtainMessage(LiveTryModeCountDownThresholdSetting.DEFAULT)) != null && (handler2 = this.LJIJ) != null) {
            handler2.sendMessageDelayed(obtainMessage, j);
        }
    }

    public final void LJIL(YRL yrl) {
        int i = YRN.LIZ[yrl.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 || i == 4) {
                this.LIZ.LIZ.context().LIZIZ = 2;
            }
        } else {
            this.LIZ.LIZ.context().LIZIZ = 0;
        }
        this.LIZJ = yrl;
    }

    public final void LJJ(String str) {
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("switchToHttp, reason: ");
        LIZ.append(str);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        LJIL(YRL.HTTP);
        LJIIJ();
        LJIIIZ();
        LJIIL();
        this.LIZLLL.disconnectFromWebSocket(str);
        Handler handler = this.LJIJI;
        if (handler != null) {
            handler.sendEmptyMessage(109);
        }
        Iterator it = ((CopyOnWriteArrayList) this.LIZ.LIZ.LJI().LIZ).iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).onSwitchToHttp(str);
        }
    }

    public YRF(YRR manager, YRJ yrj) {
        o.LJIIIZ(manager, "manager");
        this.LIZ = manager;
        this.LIZIZ = yrj;
        this.LIZJ = YRL.HTTP;
        IMessageWsClient iMessageWsClient = yrj.LJLIL;
        this.LIZLLL = iMessageWsClient;
        this.LJ = new CopyOnWriteArrayList();
        this.LJIIIZ = CardStruct.IStatusCode.DEFAULT;
        this.LJIIJJI = new CopyOnWriteArraySet();
        this.LJIIL = 10L;
        this.LJIILJJIL = new AtomicInteger(0);
        this.LJIIZILJ = new AtomicInteger();
        this.LJJIJIIJI = new CopyOnWriteArrayList();
        this.LJJIJIIJIL = new CopyOnWriteArrayList();
        YRG yrg = new YRG(this);
        this.LJJIJIL = yrg;
        iMessageWsClient.setCallback(yrg);
    }

    @Override // X.YRT
    public final void LJ(long j, C32075CiN currentConfiguration) {
        Handler handler;
        o.LJIIIZ(currentConfiguration, "currentConfiguration");
        YRJ yrj = currentConfiguration.LIZIZ.LIZJ;
        if (yrj == null) {
            yrj = this.LIZIZ;
        }
        this.LIZIZ = yrj;
        MessageMonitor LIZJ = this.LIZ.LIZ.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResetDimension strategyState: ");
        LIZ.append(this.LIZJ);
        LIZJ.log("MessagePortalReuse", X1D.LIZIZ(LIZ));
        this.LIZLLL.setCallback(this.LJJIJIL);
        if (this.LIZJ == YRL.WS_CONNECTED_AND_ENTER_ROOM_RESP) {
            LJIL(YRL.WS_CONNECTED);
        }
        if (this.LIZJ == YRL.HTTP && this.LIZIZ.LJLJLLL && (handler = this.LJIJ) != null) {
            handler.sendEmptyMessage(105);
        }
        LJIILIIL();
    }

    @Override // X.InterfaceC87394YRq
    public final void LIZIZ(long j, C64972Pei request, YMF callback) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(callback, "callback");
        YMI ymi = this.LJIJJ;
        if (ymi != null) {
            ymi.LJI(j, request, callback, null);
        }
    }
}
