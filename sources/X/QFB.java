package X;

import J.N;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ttnet.org.chromium.net.impl.CronetFrontierClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.CronetClient;

/* loaded from: classes12.dex */
public final class QFB {
    public static QEK LJIIJJI;
    public static final String LJIIL = UUID.randomUUID().toString();
    public static volatile AtomicInteger LJIILIIL = new AtomicInteger(0);
    public static volatile int LJIILJJIL = -1;
    public final IWsChannelClient LIZ;
    public CronetFrontierClient LJI;
    public QFK LJIIIZ;
    public final C64880PdE LJIIJ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public int LIZLLL = 10000;
    public int LJ = 10000;
    public final java.util.Map<Integer, Boolean> LJFF = new ConcurrentHashMap();
    public volatile int LJII = -1;
    public volatile boolean LJIIIIZZ = false;

    public final void LIZ() {
        QFK qfk = this.LJIIIZ;
        if (qfk != null) {
            qfk.LIZLLL();
            this.LJIIIZ.LIZIZ();
        }
        CronetFrontierClient cronetFrontierClient = this.LJI;
        if (cronetFrontierClient != null) {
            synchronized (cronetFrontierClient.LJIILL) {
                if (cronetFrontierClient.LJIILJJIL != 0) {
                    N.MKRYs$fc(cronetFrontierClient.LJIILJJIL, cronetFrontierClient);
                    cronetFrontierClient.LJIILJJIL = 0L;
                }
            }
            QFG LIZ = QFG.LIZ();
            String str = LJIIL;
            LIZ.getClass();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                Iterator<Map.Entry<QF9, Runnable>> it = LIZ.LIZJ.entrySet().iterator();
                while (it.hasNext()) {
                    QF9 key = it.next().getKey();
                    if (str.equals(key.LJLJI)) {
                        it.remove();
                        LIZ.LIZ.remove(key);
                    }
                }
                Iterator<Map.Entry<QF9, ScheduledFuture>> it2 = LIZ.LIZIZ.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<QF9, ScheduledFuture> next = it2.next();
                    if (str.equals(next.getKey().LJLJI)) {
                        ScheduledFuture value = next.getValue();
                        if (value != null) {
                            value.cancel(true);
                        }
                        it2.remove();
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public QFB(IWsChannelClient iWsChannelClient) {
        this.LIZ = iWsChannelClient;
        this.LJIIJ = new C64880PdE(iWsChannelClient);
        try {
            Object newInstance = Class.forName("com.bytedance.ttnet.TTNetInit").newInstance();
            Reflect.on(newInstance).call("getInitCompletedLatch");
            Reflect.on(newInstance).call("preInitCronetKernel");
        } catch (Throwable unused) {
            Logger.debug();
        }
        LJIIJJI = CronetClient.getCronetEngine();
    }

    public final void LIZIZ(int i) {
        if (this.LJI != null) {
            this.LJI.LIZ(new QFI(i, new QFN(this)));
        }
    }

    public final void LIZJ(List list, java.util.Map map) {
        int intValue;
        LJIILIIL.incrementAndGet();
        Object obj = map.get("channel_id");
        if (obj == null) {
            intValue = -1;
        } else {
            intValue = ((Integer) obj).intValue();
        }
        if (LJIILJJIL == -1 && intValue > 0 && LJIILIIL.get() == 1) {
            LJIILJJIL = intValue;
        }
        QFA LIZLLL = LJIIJJI.LIZLLL(this.LJIIJ, C16880lQ.LLLLZLLIL());
        LIZLLL.LIZLLL = list;
        LIZLLL.LJFF = String.valueOf(map.get("app_key"));
        LIZLLL.LJII = ((Integer) map.get("fpid")).intValue();
        LIZLLL.LJIIJ = ((Integer) map.get("app_version")).intValue();
        LIZLLL.LJ = ((Integer) map.get("aid")).intValue();
        LIZLLL.LJI = CastLongProtector.parseLong((String) map.get("device_id"));
        LIZLLL.LJIIIIZZ = CastLongProtector.parseLong((String) map.get("iid"));
        LIZLLL.LJIILIIL = false;
        if (map.containsKey("sid")) {
            LIZLLL.LJIIIZ = (String) map.get("sid");
        }
        String str = (String) map.get("extra");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split("&")) {
                if (!TextUtils.isEmpty(str2)) {
                    String[] split = str2.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
        }
        LIZLLL.LJIIJJI = hashMap;
        try {
            HashMap hashMap2 = new HashMap();
            java.util.Map map2 = null;
            try {
                map2 = (java.util.Map) Class.forName("com.bytedance.ttnet.clientkey.ClientKeyManager").getMethod("getClientKeyHeaders", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused) {
            }
            Logger.debug();
            if (map2 != null && !map2.isEmpty()) {
                hashMap2.putAll(map2);
            }
            java.util.Map map3 = (java.util.Map) map.get("custom_headers");
            if (map3 != null && !map3.isEmpty()) {
                hashMap2.putAll(map3);
            }
            if (!hashMap2.isEmpty()) {
                LIZLLL.LJIIL = hashMap2;
            }
        } catch (Throwable unused2) {
        }
        QFK LIZ = LIZLLL.LIZ();
        this.LJIIIZ = LIZ;
        LIZ.LIZJ();
    }
}
