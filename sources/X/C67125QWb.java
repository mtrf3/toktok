package X;

import Y.ACallableS38S1100000_11;
import Y.ARunnableS12S0101000_8;
import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.google.android.play.core.assetpacks.s0;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.QWb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67125QWb implements M5A {
    public static final String LJLJJLL = C67125QWb.class.getName();
    public static final String LJLJL;
    public static String LJLJLJ;
    public static String LJLJLLL;
    public static final C67125QWb LJLL;
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public long LJLJJI;
    public final HashMap<EnumC54358LVa, java.util.Set<InterfaceC54360LVc>> LJLJJL = new HashMap<>();

    @QD3
    public void onEvent(C42324GjI c42324GjI) {
    }

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("wss://");
        LJLJL = JBR.LJFF(LIZ, "frontier-va.tiktokv.com", "/ws/v2", LIZ);
        LJLJLLL = "";
        LJLL = new C67125QWb();
    }

    public static void LJ() {
        HashMap hashMap = new HashMap();
        hashMap.put("IsBackground", String.valueOf(WSHelperImpl.LIZIZ().isAppBackground() ? 1 : 0));
        C2U8.LIZ(new C115124fU(new s0(LJLJLJ, new C67134QWk(9000, 0L, 0L, 4, new byte[]{0}, "", "", hashMap))));
    }

    public C67125QWb() {
        if (FCD.LJI(EF7.LIZIZ())) {
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);
        }
    }

    @Override // X.M5A
    public final void onAppEnterBackGround() {
        LJ();
    }

    @Override // X.M5A
    public final void onAppEnterForeground() {
        LJ();
    }

    public static void LIZJ(String str) {
        C4HW iMErrorMonitor;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("1.1->recordWsConnect: ");
        LIZ.append(str);
        C36922EeM.LIZLLL(4, "WsLancet", X1D.LIZIZ(LIZ));
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        if (createIIMServicebyMonsterPlugin != null && (iMErrorMonitor = createIIMServicebyMonsterPlugin.getIMErrorMonitor()) != null) {
            iMErrorMonitor.LIZ(str);
        }
    }

    public final void LIZ(String str) {
        if (C33884DRo.LIZLLL()) {
            C10K.LIZIZ(new ACallableS38S1100000_11(this, str, 1), C38995FSd.LIZIZ(), null);
        } else {
            LIZIZ(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67125QWb.LIZIZ(java.lang.String):void");
    }

    @QD3
    public void onEvent(C67139QWp c67139QWp) {
        LVZ lvz;
        QWW qww = c67139QWp.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReceivedMsgEvent receive message method=");
        LIZ.append(qww.LIZLLL);
        LIZ.append("  service=");
        LIZ.append(qww.LJ);
        LIZ.append(" url=");
        LIZ.append(qww.LIZ);
        X1D.LIZIZ(LIZ);
        Object obj = qww.LIZJ;
        if (!(obj instanceof LVZ) || (lvz = (LVZ) obj) == null) {
            return;
        }
        java.util.Set<InterfaceC54360LVc> set = this.LJLJJL.get(lvz.getType());
        if (set == null) {
            return;
        }
        Iterator<InterfaceC54360LVc> it = set.iterator();
        while (it.hasNext()) {
            it.next().LJIIL(lvz);
        }
    }

    @QD3
    public void onEvent(C67141QWr c67141QWr) {
        C67146QWw c67146QWw = c67141QWr.LJLIL;
        if (!this.LJLILLLLZI && this.LJLJI) {
            this.LJLILLLLZI = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.LJLJJI);
                jSONObject.put("errorResponse", c67146QWw.LIZ);
                jSONObject.put("ws_connect_type", c67146QWw.LIZIZ);
                C09900aA.LJIIJJI("aweme_long_connection_error_rate", 1, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.LJLJI = false;
    }

    @QD3
    public void onEvent(C67138QWo c67138QWo) {
        C74218TAw c74218TAw = c67138QWo.LJLIL;
        if (this.LJLJI) {
            this.LJLILLLLZI = false;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total_duration", SystemClock.uptimeMillis() - this.LJLJJI);
                jSONObject.put("ws_connect_type", c74218TAw.LJLIL);
                C09900aA.LJIIJJI("aweme_long_connection_error_rate", 0, jSONObject);
            } catch (Exception unused) {
            }
        }
        this.LJLJI = false;
    }

    @QD3
    public void onEvent(C56842Ky c56842Ky) {
        Activity LJIIIIZZ;
        if (C2NU.LIZ.LIZIZ()) {
            LIZ("netstate_change");
        } else {
            if (WSHelperImpl.LIZIZ().isAppBackground() || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
                return;
            }
            LJIIIIZZ.runOnUiThread(new ARunnableS12S0101000_8(2, LJIIIIZZ, 4));
        }
    }

    @QD3
    public void onEvent(C67142QWs c67142QWs) {
        C0HK c0hk = c67142QWs.LJLIL;
        Object obj = c0hk.LIZIZ;
        if ((obj == null || obj == EnumC67133QWj.CLOSED) && this.LJLIL) {
            this.LJLIL = false;
            LIZ("ws_status_change");
        }
        if (c0hk.LIZIZ == EnumC67133QWj.OPENING) {
            this.LJLJJI = SystemClock.uptimeMillis();
            this.LJLJI = true;
        }
    }

    public final void LIZLLL(EnumC54358LVa enumC54358LVa, InterfaceC54360LVc interfaceC54360LVc) {
        if (interfaceC54360LVc == null) {
            return;
        }
        java.util.Set<InterfaceC54360LVc> set = this.LJLJJL.get(enumC54358LVa);
        if (set == null) {
            set = new HashSet<>();
            this.LJLJJL.put(enumC54358LVa, set);
        }
        set.add(interfaceC54360LVc);
    }
}
