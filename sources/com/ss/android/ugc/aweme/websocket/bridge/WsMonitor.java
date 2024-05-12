package com.ss.android.ugc.aweme.websocket.bridge;

import X.EnumC112394b5;
import X.QPY;
import X.R1W;
import X.R1Z;
import X.X1D;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class WsMonitor implements IWsMonitorService {
    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZ(EnumC112394b5 scene) {
        HashMap hashMap;
        long j;
        o.LJIIIZ(scene, "scene");
        if (!WsMonitorConfigExp.LIZIZ()) {
            return;
        }
        List list = (List) WsMonitorConfigExp.LJIIIZ.getValue();
        if ((list != null && list.contains(Integer.valueOf(scene.getValue()))) || (hashMap = (HashMap) R1W.LIZJ().get(scene)) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[stopTracking], scene = ");
        LIZ.append(scene);
        QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
        long uptimeMillis = SystemClock.uptimeMillis();
        if (hashMap.containsKey("scene_start_event")) {
            R1W.LJIIJ(scene, uptimeMillis);
        } else {
            switch (R1Z.LIZ[R1W.LJIIIIZZ.ordinal()]) {
                case 1:
                    j = R1W.LIZJ;
                    break;
                case 2:
                    j = R1W.LJ;
                    break;
                case 3:
                    j = R1W.LIZLLL;
                    break;
                case 4:
                    j = R1W.LJFF;
                    break;
                case 5:
                    j = R1W.LJIIL;
                    break;
                case 6:
                    j = R1W.LJIILIIL;
                    break;
            }
            if (j != 0) {
                R1W.LJIIIZ(scene, R1W.LJIIIIZZ.field(), uptimeMillis, j);
            }
        }
        Long l = (Long) hashMap.get("scene_start_time");
        if (l == null) {
            l = 0L;
        }
        hashMap.put("scene_total_time", Long.valueOf(uptimeMillis - l.longValue()));
        R1W.LJFF(scene, new AqS167S0100000_1(hashMap, (HashMap<String, Long>) 366));
        R1W.LIZJ().remove(scene);
    }

    @Override // com.ss.android.ugc.aweme.websocket.api.service.IWsMonitorService
    public final void LIZIZ(EnumC112394b5 scene) {
        o.LJIIIZ(scene, "scene");
        R1W r1w = R1W.LIZ;
        if (!WsMonitorConfigExp.LIZIZ()) {
            return;
        }
        List list = (List) WsMonitorConfigExp.LJIIIZ.getValue();
        if (list != null && list.contains(Integer.valueOf(scene.getValue()))) {
            return;
        }
        if (!R1W.LJIIJ) {
            r1w.LIZLLL();
        }
        if (R1W.LIZJ().containsKey(scene)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[startTracking], scene = ");
        LIZ.append(scene);
        QPY.LIZ("WsOnlineRateMonitor", X1D.LIZIZ(LIZ));
        R1W.LIZJ().put(scene, new HashMap());
        HashMap hashMap = (HashMap) R1W.LIZJ().get(scene);
        if (hashMap != null) {
            hashMap.put("scene_start_time", Long.valueOf(SystemClock.uptimeMillis()));
        }
        HashMap hashMap2 = (HashMap) R1W.LIZJ().get(scene);
        if (hashMap2 == null) {
            return;
        }
        hashMap2.put("scene_start_event", Long.valueOf(R1W.LJIIIIZZ.getValue()));
    }
}
