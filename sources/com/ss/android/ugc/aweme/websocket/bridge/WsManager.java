package com.ss.android.ugc.aweme.websocket.bridge;

import X.C10K;
import X.C221108m2;
import X.C2NU;
import X.C33806DOo;
import X.C35754E1m;
import X.C36922EeM;
import X.C38995FSd;
import X.C56228M4y;
import X.C57139Mbf;
import X.C58219Mt5;
import X.C61212O0q;
import X.C62822Ol8;
import X.C67136QWm;
import X.C84763XOl;
import X.EF7;
import X.EnumC66933QOr;
import X.FKB;
import X.InterfaceC67145QWv;
import X.InterfaceC67148QWy;
import X.L2B;
import X.OCM;
import X.QMR;
import X.QOW;
import X.QPV;
import X.QPY;
import X.QWZ;
import X.R1W;
import X.R1Y;
import X.X1D;
import Y.ACallableS9S1000000_11;
import Y.ARunnableS47S0100000_11;
import android.app.Application;
import android.os.SystemClock;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import com.ss.android.ugc.aweme.websocket.api.service.IWsService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS25S0000100_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class WsManager implements IWsService {
    public static final /* synthetic */ int LJII = 0;
    public volatile boolean LIZIZ;
    public volatile EnumC66933QOr LIZ = EnumC66933QOr.CONNECTION_UNKNOWN;
    public String LIZJ = "";
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C58219Mt5.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C61212O0q.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(OCM.LJLIL);
    public final QWZ LJI = new QWZ(this);

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZIZ() {
        ((CopyOnWriteArraySet) this.LJFF.getValue()).remove(C56228M4y.LJLIL);
    }

    public final ConcurrentHashMap<C35754E1m, InterfaceC67148QWy> LJIIL() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final boolean isConnected() {
        if (this.LIZ == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIJ() {
        LJIIL().remove(new C35754E1m(1777, 1777));
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final String LJI() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final EnumC66933QOr getState() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZ(String enterFrom) {
        boolean z;
        o.LJIIIZ(enterFrom, "enterFrom");
        EF7.LIZIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            if (C36922EeM.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("WsModule - ");
                LIZ.append("WsManager");
                C36922EeM.LIZLLL(6, X1D.LIZIZ(LIZ), "[connect], failed! network unavailable!");
                return;
            }
            return;
        }
        if (L2B.LIZIZ()) {
            QPY.LIZ("WsManager", "[connect], failed! caused by REVERSE_WS");
        } else {
            C10K.LIZJ(new ACallableS9S1000000_11(enterFrom, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZLLL(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        msg.channelId = 1239108;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[sendMsg], ");
        LIZ.append(msg);
        QPY.LIZ("WsManager", X1D.LIZIZ(LIZ));
        if (C33806DOo.LIZ()) {
            C38995FSd.LIZJ().submit(new ARunnableS47S0100000_11(msg, 57));
        } else {
            QOW.LJFF(msg);
        }
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJFF(Application application) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        QPY.LIZ("WsManager", "[initSDK]");
        R1W.LIZ.LIZLLL();
        QOW.LIZIZ(application, this.LJI);
        C84763XOl.LJI().LJJJJZI(C67136QWm.LJLIL);
        C38995FSd.LJ().scheduleAtFixedRate(QPV.LJLIL, 300 - ((SystemClock.uptimeMillis() - FKB.LJ) / 1000), 300L, TimeUnit.SECONDS);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJII(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        LJIIIZ(enterFrom);
        LIZ("unknown");
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIIIZZ(InterfaceC67145QWv listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArraySet) this.LJFF.getValue()).add(listener);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[close], enterFrom = ");
        LIZ.append(enterFrom);
        QPY.LIZ("WsManager", X1D.LIZIZ(LIZ));
        if (WsMonitorConfigExp.LJFF() && R1W.LJIIIIZZ != R1Y.UNKNOWN) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[recordActivelyCloseConnection], enterFrom = ");
            LIZ2.append(enterFrom);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ2));
            if (!R1W.LJIILJJIL) {
                R1W.LJIILJJIL = true;
                C57139Mbf.LIZ(new AqS25S0000100_11(SystemClock.uptimeMillis(), 0));
            }
        }
        QOW.LJI();
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJIIJJI(InterfaceC67148QWy listener) {
        o.LJIIIZ(listener, "listener");
        ((CopyOnWriteArraySet) this.LJ.getValue()).remove(listener);
        for (Map.Entry<C35754E1m, InterfaceC67148QWy> entry : LJIIL().entrySet()) {
            if (o.LJ(entry.getValue(), listener)) {
                LJIIL().remove(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LJ(byte[] bArr, Map map) {
        QMR qmr = new QMR(1239108);
        qmr.LJIIIIZZ = 0L;
        qmr.LIZJ = 0L;
        qmr.LIZLLL = 9000;
        qmr.LJ = 4;
        qmr.LJFF = bArr;
        qmr.LJI = "";
        qmr.LJII = "";
        if (!((HashMap) map).isEmpty() && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                ((HashMap) qmr.LIZIZ).put(entry.getKey(), entry.getValue());
            }
        }
        LIZLLL(qmr.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsService
    public final void LIZJ(int i, int i2, InterfaceC67148QWy listener) {
        o.LJIIIZ(listener, "listener");
        if (i == -10000 && i2 == -10000) {
            ((CopyOnWriteArraySet) this.LJ.getValue()).add(listener);
        } else {
            LJIIL().put(new C35754E1m(i, i2), listener);
        }
    }
}
