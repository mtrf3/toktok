package X;

import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.OCp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61523OCp implements InterfaceC61530OCw {
    @Override // X.InterfaceC61530OCw
    public final void LIZ(Object obj) {
        if (obj != null && EBC.LIZ.LJFF() == null) {
            java.util.Map map = (java.util.Map) obj;
            C61521OCn c61521OCn = C61528OCu.LIZ;
            synchronized (c61521OCn) {
                OC6.LIZ("gecko-debug-tag", "loop interval update", map);
                for (String str : map.keySet()) {
                    C61522OCo c61522OCo = (C61522OCo) ((ConcurrentHashMap) c61521OCn.LIZIZ).get(str);
                    LoopInterval loopInterval = (LoopInterval) map.get(str);
                    if (c61522OCo != null && loopInterval != null) {
                        c61522OCo.LIZIZ(loopInterval.getInterval());
                        ((ConcurrentHashMap) c61521OCn.LIZJ).put(str, Integer.valueOf(loopInterval.getInterval()));
                    }
                }
            }
        }
    }
}
