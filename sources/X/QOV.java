package X;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.SsWsApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QOV {
    public static final QON LIZ = new QON();
    public static final java.util.Map<Integer, QOL> LIZIZ = new ConcurrentHashMap();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static boolean LIZLLL = true;

    public static SsWsApp LIZ(QOX qox) {
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
                                            qoy.LJIIJ = qox.LJ;
                                            qoy.LJII = TextUtils.join("&", arrayList.toArray());
                                            qoy.LJIIJJI = z;
                                            qoy.LJIIL = list;
                                            qoy.LJIILIIL = qox.LJIIL;
                                            qoy.LJIILJJIL = typeValue;
                                            qoy.LJIILL = z2;
                                            qoy.LJIILLIIL = list2;
                                            return qoy.LIZ();
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

    public static QOL LIZIZ(int i) {
        return (QOL) ((ConcurrentHashMap) LIZIZ).get(Integer.valueOf(i));
    }

    public static QOL LIZJ(Context context, QOX qox, QOQ qoq) {
        boolean compareAndSet = LIZJ.compareAndSet(false, true);
        QON qon = LIZ;
        if (compareAndSet) {
            if (LIZLLL) {
                qon.LJ(2, context);
            } else {
                qon.LJ(1, context);
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                C16880lQ.LJJLIIIJILLIZJL(new C48856JFk(context, QMS.LIZIZ(context)), context, intentFilter);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        QOL qol = new QOL(context, qox, qoq);
        ((ConcurrentHashMap) LIZIZ).put(Integer.valueOf(qox.LIZ), qol);
        qol.LIZJ.LIZ(qol.LIZLLL, qol.LJ);
        return qol;
    }
}
