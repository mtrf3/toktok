package Y;

import X.C141335gf;
import X.C16880lQ;
import X.C30Z;
import X.C36922EeM;
import X.C38354F3m;
import X.C3C5;
import X.C45243HpH;
import X.C48208Iw0;
import X.C57139Mbf;
import X.C66952QPk;
import X.C68542QvC;
import X.C76800UCe;
import X.C84763XOl;
import X.EF7;
import X.QJY;
import X.QOD;
import X.QOW;
import X.QOX;
import X.QPY;
import X.QQC;
import X.QX5;
import X.R1W;
import X.R1Y;
import X.X1D;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.net.NetworkApiImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS25S0000100_11;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class ACallableS9S1000000_11 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS9S1000000_11 aCallableS9S1000000_11) {
        Object LIZ;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        if (((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).enableBoe()) {
            str = ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getFrontierBoeUrl();
            if (!TextUtils.isEmpty(str)) {
                o.LJI(str);
            } else {
                str = "ws:///ws/v2";
            }
        } else {
            String LIZ2 = NetworkApiImpl.LIZIZ().LIZ();
            if (!TextUtils.isEmpty(LIZ2)) {
                try {
                    JSONArray jSONArray = new JSONArray(LIZ2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        str = jSONArray.optString(i);
                        if (!TextUtils.isEmpty(str)) {
                            o.LJIIIIZZ(str, "str");
                            if (ujb.o.LJJJLIIL(str, "wss:", false)) {
                                break;
                            }
                        }
                    }
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                if (m10exceptionOrNullimpl != null) {
                    C36922EeM.LJFF(m10exceptionOrNullimpl);
                }
            }
            str = C30Z.LIZ;
        }
        arrayList.add(str);
        QOD qod = new QOD(1239108);
        qod.LJII = "e1bd35ec9db7b8d846de66ed140b1ad9";
        qod.LJFF = 9;
        qod.LJ = EF7.LJIIIZ;
        qod.LJI = (int) EF7.LIZJ();
        qod.LJIIIIZZ = AppLog.getServerDeviceId();
        qod.LJIIIZ = AppLog.getInstallId();
        Map LIZ3 = C66952QPk.LIZ((String) ListProtector.get(arrayList, 0));
        if (LIZ3 != null) {
            ((HashMap) qod.LIZJ).putAll(LIZ3);
        }
        if (!C38354F3m.LJ("x-accept-ack")) {
            ((HashMap) qod.LIZJ).put("x-accept-ack", "1");
        }
        ((ArrayList) qod.LIZLLL).addAll(arrayList);
        String enterFrom = aCallableS9S1000000_11.s0;
        o.LJIIIZ(enterFrom, "enterFrom");
        HashMap hashMap = new HashMap();
        QJY.LJI(hashMap, false);
        hashMap.remove("mac_address");
        hashMap.put("ne", String.valueOf(C48208Iw0.LIZ()));
        if (C84763XOl.LJIIJJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_background", str2);
        hashMap.put("em", enterFrom);
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        String str3 = "prod";
        if (localTestApi.enableBoe()) {
            String boeLane = localTestApi.getBoeLane();
            if (boeLane != null) {
                str3 = boeLane;
            }
            hashMap.put("x-tt-env", str3);
            hashMap.put("x-use-boe", "1");
        } else if (localTestApi.enablePpe()) {
            String pPELane = localTestApi.getPPELane();
            if (pPELane != null) {
                str3 = pPELane;
            }
            hashMap.put("x-tt-env", str3);
            hashMap.put("x-use-ppe", "1");
        }
        String language = SettingServiceImpl.LIZ().getCurrentI18nItem(EF7.LIZIZ()).getLanguage();
        if (!TextUtils.isEmpty(language)) {
            o.LJIIIIZZ(language, "language");
            hashMap.put("language", language);
        }
        ((HashMap) qod.LIZIZ).putAll(hashMap);
        QOX LIZ4 = qod.LIZ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[connect], ");
        LIZ5.append(LIZ4);
        QPY.LIZ("WsManager", X1D.LIZIZ(LIZ5));
        R1W r1w = R1W.LIZ;
        String enterFrom2 = aCallableS9S1000000_11.s0;
        o.LJIIIZ(enterFrom2, "enterFrom");
        if (WsMonitorConfigExp.LJFF()) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("[recordStartConnection], isActivelyClosed = ");
            LIZ6.append(R1W.LJIILJJIL);
            LIZ6.append(", enterFrom = ");
            LIZ6.append(enterFrom2);
            QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ6));
            long uptimeMillis = SystemClock.uptimeMillis();
            if (R1W.LJI == 0) {
                long j = uptimeMillis - R1W.LJII;
                R1W.LJI = j;
                R1W.LJIIL(j, "prepare_time");
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("[recordPrepareTime], prepareTime = ");
                LIZ7.append(R1W.LJI);
                QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ7));
                if (R1W.LIZIZ) {
                    R1W.LJIIIIZZ = R1Y.BACKGROUND_DISCONNECTED;
                    R1W.LJFF = uptimeMillis;
                } else {
                    R1W.LJIIIIZZ = R1Y.FOREGROUND_DISCONNECTED;
                    R1W.LJ = uptimeMillis;
                }
                R1W.LJIIJJI(r1w);
            }
            if (R1W.LJIILJJIL) {
                R1W.LJIILJJIL = false;
                if (!R1W.LJ()) {
                    C57139Mbf.LIZ(new AqS25S0000100_11(uptimeMillis, 1));
                }
            }
        }
        QOW.LJ(LIZ4);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS9S1000000_11 aCallableS9S1000000_11) {
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        ((NetworkProxyAccount) qqc).LJFF(aCallableS9S1000000_11.s0);
        return null;
    }

    public static final Object call$2(ACallableS9S1000000_11 aCallableS9S1000000_11) {
        String str = aCallableS9S1000000_11.s0;
        String str2 = QX5.LIZJ;
        HashMap LIZ = C45243HpH.LIZ("username", str, "process_type", "1");
        C68542QvC.LIZ.getClass();
        QQC qqc = C68542QvC.LIZJ;
        o.LJI(qqc);
        String LJIIIIZZ = ((NetworkProxyAccount) qqc).LJIIIIZZ(str2, LIZ);
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.status_code = -1;
        try {
            QQC qqc2 = C68542QvC.LIZJ;
            o.LJI(qqc2);
            Object LJI = ((NetworkProxyAccount) qqc2).LJIIJJI().LJI(LJIIIIZZ, BaseResponse.class);
            o.LJIIIIZZ(LJI, "networkProxy!!.gson.from…BaseResponse::class.java)");
            baseResponse = (BaseResponse) LJI;
            return baseResponse;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return baseResponse;
        }
    }

    public ACallableS9S1000000_11(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
