package com.bytedance.applog;

import X.C66735QHb;
import X.C66760QIa;
import X.C66765QIf;
import X.C66769QIj;
import X.C66799QJn;
import X.InterfaceC66835QKx;
import X.InterfaceC66837QKz;
import X.QI3;
import X.QI4;
import X.QI6;
import X.QIB;
import X.QIG;
import X.QIK;
import X.QIP;
import X.QIQ;
import X.QJA;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class AppLog {
    public static final QI3 LIZ = new QI3();
    public static volatile boolean LIZIZ = false;

    public static String LIZIZ() {
        C66799QJn LJ;
        C66760QIa c66760QIa = LIZ.LJIJJ;
        if (c66760QIa == null || (LJ = ((C66765QIf) c66760QIa.LIZ()).LJ()) == null) {
            return "";
        }
        return LJ.LJLJJI;
    }

    public static String LIZJ() {
        C66799QJn LJ;
        C66760QIa c66760QIa = LIZ.LJIJJ;
        if (c66760QIa == null || (LJ = ((C66765QIf) c66760QIa.LIZ()).LJ()) == null) {
            return "";
        }
        return LJ.LJLILLLLZI;
    }

    public static String LJ() {
        QI3 qi3 = LIZ;
        if (qi3.LJIILIIL != null) {
            return String.valueOf(qi3.LJIILIIL.LJLLI.LIZ);
        }
        return null;
    }

    public static String getSessionId() {
        QI3 qi3 = LIZ;
        if (qi3.LJIILIIL != null) {
            return qi3.LJIILIIL.LJLLI.LJ;
        }
        return null;
    }

    public static void LIZ(QJA qja) {
        QI3 qi3 = LIZ;
        synchronized (qi3) {
            if (qi3.LJIJ == null) {
                qi3.LJIJ = new C66769QIj();
            }
            qi3.LJIJ.LIZ.add(qja);
        }
    }

    public static void LIZLLL(Map<String, String> map) {
        C66799QJn LJ = ((C66765QIf) LIZ.LJIJJ.LIZ()).LJ();
        if (LJ != null) {
            String str = LJ.LJLIL;
            if (!TextUtils.isEmpty(str)) {
                map.put("device_id", str);
            }
            String str2 = LJ.LJLILLLLZI;
            if (!TextUtils.isEmpty(str2)) {
                map.put("install_id", str2);
            }
            String str3 = LJ.LJLJI;
            if (!TextUtils.isEmpty(str3)) {
                map.put("openudid", str3);
            }
            String str4 = LJ.LJLJJI;
            if (!TextUtils.isEmpty(str4)) {
                map.put("clientudid", str4);
            }
        }
    }

    public static void LJI(String str) {
        QI3 qi3 = LIZ;
        if (qi3.LJIIL != null) {
            QI6 qi6 = qi3.LJIIL;
            synchronized (qi6) {
                Set LIZIZ2 = QI6.LIZIZ(qi6.LIZJ.LIZIZ());
                Set LIZIZ3 = QI6.LIZIZ(qi6.LIZLLL.optString("ab_sdk_version"));
                LIZIZ3.removeAll(LIZIZ2);
                LIZIZ3.addAll(QI6.LIZIZ(str));
                qi6.LIZJ.LJFF(str);
                StringBuilder sb = new StringBuilder();
                Iterator it = ((HashSet) LIZIZ3).iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    if (it.hasNext()) {
                        sb.append(",");
                    }
                }
                qi6.LJ(sb.toString());
            }
        }
    }

    public static void LJII(HashMap<String, Object> hashMap) {
        JSONObject jSONObject;
        C66760QIa c66760QIa = LIZ.LJIJJ;
        QIP qip = c66760QIa.LIZJ;
        JSONObject jSONObject2 = null;
        if (qip != null) {
            InterfaceC66835QKx LIZ2 = c66760QIa.LIZ();
            if (!hashMap.isEmpty()) {
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject LIZ3 = qip.LIZ(qip.LIZ.LJIIJ);
                        if (LIZ3 != null) {
                            C66735QHb.LIZJ(jSONObject, LIZ3);
                        }
                        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                            if (!TextUtils.isEmpty(entry.getKey())) {
                                jSONObject.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        jSONObject2 = jSONObject;
                        qip.LIZ.LJJIZ.LJIILL(Collections.singletonList("CustomHeaderAdapter"), "appendHeaderInfo failed", th, new Object[0]);
                        jSONObject = jSONObject2;
                        qip.LIZIZ(jSONObject, LIZ2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                qip.LIZIZ(jSONObject, LIZ2);
                return;
            }
            return;
        }
        c66760QIa.LIZLLL.LJJIZ.LJIIIIZZ(1, null, "headerAdapter is null when setHeaderInfo. maybe not init?", new Object[0]);
    }

    public static void onEvent(String str) {
        LIZ.onEvent(str);
    }

    public static void onEventV3(String str) {
        LIZ.onEventV3(str);
    }

    public static void LJFF(String str, String str2) {
        QI3 qi3 = LIZ;
        if (qi3.LJIILIIL != null) {
            QI4 qi4 = qi3.LJIILIIL;
            InterfaceC66837QKz interfaceC66837QKz = qi4.LJLIL;
            Application application = qi4.LJLJI.LJIIJ;
            C66765QIf c66765QIf = (C66765QIf) ((C66760QIa) interfaceC66837QKz).LIZ();
            c66765QIf.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("app_language", str);
            hashMap.put("app_region", str2);
            c66765QIf.LIZLLL.LIZIZ(application).LJFF(application, hashMap, true);
            qi4.LJIIL(qi4.LJLJJL, 0);
        }
    }

    public static void onEventV3(String str, JSONObject jSONObject) {
        QI3 qi3 = LIZ;
        qi3.LIZLLL.LJ(QIQ.event_v3, QIK.init);
        qi3.LJIIIZ(str, jSONObject);
    }

    public static void onMiscEvent(String str, JSONObject jSONObject) {
        QI3 qi3 = LIZ;
        QIB qib = qi3.LIZLLL;
        QIQ qiq = QIQ.log_data;
        qib.LJ(qiq, QIK.init);
        if (TextUtils.isEmpty(str) || jSONObject.length() <= 0) {
            qi3.LJJIZ.LJIIJJI("call onEventData with invalid params, return", new Object[0]);
            qi3.LIZLLL.LJ(qiq, QIK.f_block);
            return;
        }
        try {
            qi3.LJIIJJI(new QIG(qi3.LJIIIZ, str, jSONObject));
        } catch (Exception e) {
            qi3.LJJIZ.LJIILL(null, "call onEventData get exception: ", e, new Object[0]);
            qi3.LIZLLL.LJ(QIQ.log_data, QIK.f_block);
        }
    }

    public static void onEventV3(String str, Bundle bundle) {
        LIZ.LJIIIIZZ(str, bundle);
    }
}
