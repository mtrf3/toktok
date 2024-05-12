package X;

import Y.ARunnableS10S0210000_11;
import Y.ARunnableS47S0100000_11;
import android.app.Application;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QOW {
    public static volatile boolean LIZJ;
    public static Application LIZLLL;
    public static String LJII;
    public static boolean LJIIIIZZ;
    public static final Object LIZ = new Object();
    public static final QOS LIZIZ = new QOS();
    public static final C66916QOa LJ = new C66916QOa();
    public static final java.util.Map<Integer, QOX> LJFF = new ConcurrentHashMap();
    public static final java.util.Map<Integer, AbstractC64867Pd1> LJI = new ConcurrentHashMap();

    public static void LIZ() {
        if (LIZJ) {
        } else {
            throw new IllegalStateException("please init first");
        }
    }

    public static void LIZLLL() {
        LIZ();
        synchronized (LIZ) {
        }
    }

    public static void LJI() {
        LIZ();
        WsConstants.remove(1239108);
        ((ConcurrentHashMap) LJFF).remove(1239108);
        synchronized (LIZ) {
        }
        LIZLLL();
        LIZIZ.LIZJ(1239108, LIZLLL);
    }

    public static void LIZJ(QOX qox) {
        C78946Uyc.LJJIFFI("3->doRealRegisterOrParametersChangedMethod ");
        ((ConcurrentHashMap) LJFF).put(Integer.valueOf(qox.LIZ), qox);
        java.util.Map<String, String> map = qox.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            if (entry != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(android.net.Uri.encode((String) C1FJ.LIZJ(LIZ2, (String) entry.getKey(), "=", entry)));
                arrayList.add(X1D.LIZIZ(LIZ2));
            }
        }
        int i = qox.LJII;
        if (i > 0) {
            String str = qox.LIZIZ;
            if (!C38354F3m.LJ(str)) {
                String str2 = qox.LIZJ;
                if (!C38354F3m.LJ(str2)) {
                    int i2 = qox.LJI;
                    if (i2 > 0) {
                        String str3 = qox.LJIIIIZZ;
                        if (!C38354F3m.LJ(str3)) {
                            int i3 = qox.LJIIIZ;
                            if (i3 > 0) {
                                int i4 = qox.LIZ;
                                if (i4 > 0) {
                                    boolean z = qox.LJIIJ;
                                    List<Integer> list = qox.LJIIJJI;
                                    if (!z || (list != null && !list.isEmpty())) {
                                        boolean z2 = qox.LJIILJJIL;
                                        List<Integer> list2 = qox.LJIILL;
                                        if (!z || list2 != null) {
                                            WsConstants.initServiceState(i4, list);
                                            int typeValue = qox.LJIILIIL.getTypeValue();
                                            QOY qoy = new QOY();
                                            qoy.LIZ = i;
                                            qoy.LIZIZ = str;
                                            qoy.LIZJ = str2;
                                            qoy.LJFF = i2;
                                            qoy.LJI = str3;
                                            qoy.LJIIIZ = qox.LJFF;
                                            qoy.LIZLLL = i3;
                                            qoy.LJ = 0;
                                            qoy.LJIIIIZZ = i4;
                                            qoy.LJII = TextUtils.join("&", arrayList.toArray());
                                            qoy.LJIIJ = qox.LJ;
                                            qoy.LJIIJJI = z;
                                            qoy.LJIIL = list;
                                            qoy.LJIILIIL = qox.LJIIL;
                                            qoy.LJIILJJIL = typeValue;
                                            qoy.LJIILL = z2;
                                            qoy.LJIILLIIL = list2;
                                            LIZIZ.LIZ(LIZLLL, qoy.LIZ());
                                            return;
                                        }
                                        throw new IllegalArgumentException("monitorServiceIdList cannot be empty when private protocol is enabled.");
                                    }
                                    throw new IllegalArgumentException("ServiceIdList cannot be empty when private protocol is enabled.");
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    public static void LJ(QOX qox) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", QOZ.LIZ);
        jSONObject.put("status", 2);
        C09900aA.LJI("aweme_long_connection_status", jSONObject, null, null);
        C78946Uyc.LJJIFFI("2->registerChannel ");
        LIZ();
        synchronized (LIZ) {
            LIZJ(qox);
        }
    }

    public static void LJFF(WsChannelMsg wsChannelMsg) {
        LIZ();
        if (wsChannelMsg != null) {
            if (wsChannelMsg.channelId > 0) {
                if (wsChannelMsg.service >= 0) {
                    if (wsChannelMsg.method > 0) {
                        if (wsChannelMsg.LIZ() != null) {
                            LIZIZ.LIZLLL(LIZLLL, wsChannelMsg);
                            return;
                        }
                        throw new IllegalArgumentException("illegal payload");
                    }
                    throw new IllegalArgumentException("illegal method");
                }
                throw new IllegalArgumentException("illegal service");
            }
            throw new IllegalArgumentException("illegal channelId");
        }
        throw new IllegalArgumentException("WsChannelMsg can't be null");
    }

    public static void LIZIZ(Application application, QOQ qoq) {
        boolean z;
        new C66919QOd();
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        LIZLLL = application;
        String LIZJ2 = C36842Ed4.LIZJ(application);
        LJII = LIZJ2;
        if (LIZJ2 == null || LIZJ2.contains(":") || !LIZJ2.equals(application.getPackageName())) {
            z = false;
            String str = LJII;
            if (str != null && str.endsWith(":push")) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    Application application2 = LIZLLL;
                    Application application3 = LIZLLL;
                    if (QMP.LIZ == null) {
                        synchronized (QMH.class) {
                            if (QMP.LIZ == null) {
                                QMP.LIZ = QMP.LIZ(application3);
                            }
                        }
                    }
                    C16880lQ.LJJLIIIJ(application2, new C48856JFk(application3, QMP.LIZ), intentFilter);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            z = true;
            C66879QMp c66879QMp = new C66879QMp();
            c66879QMp.LJLILLLLZI = LJ;
            application.registerActivityLifecycleCallbacks(c66879QMp);
            WsConstants.setOnMessageReceiveListener(qoq);
            WsConstants.setOptLogic(null);
            WsConstants.setBindWsChannelServiceListener(null);
            C66455Q6h LIZIZ2 = C66455Q6h.LIZIZ(application);
            if (LIZIZ2 != null) {
                C66454Q6g c66454Q6g = LIZIZ2.LIZ;
                c66454Q6g.getClass();
                QM3 qm3 = new QM3(c66454Q6g.LIZ);
                qm3.LIZIZ.put("key_enable_offline_detect", Boolean.FALSE);
                qm3.LIZIZ();
            }
        }
        QOS qos = LIZIZ;
        Application application4 = LIZLLL;
        qos.getClass();
        if (z) {
            RunnableC39007FSp.LIZIZ(new ARunnableS10S0210000_11(qos, application4, 0));
        } else {
            RunnableC39007FSp.LIZIZ(new ARunnableS47S0100000_11(application4, 1));
        }
    }
}
