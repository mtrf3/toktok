package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.IRd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46613IRd implements InterfaceC46610IRa {
    public final List<LinkedHashMap<Long, Long>> LIZ = new ArrayList();
    public final List<LinkedHashMap<Long, Long>> LIZIZ = new ArrayList();
    public long LIZJ = 0;
    public long LIZLLL = 0;
    public long LJ = 0;
    public double LJFF = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;

    public final long LIZ() {
        if (this.LIZJ == 0 && !((ArrayList) this.LIZ).isEmpty()) {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((LinkedHashMap) it.next()).entrySet().iterator();
                while (it2.hasNext()) {
                    Long l = (Long) ((Map.Entry) it2.next()).getValue();
                    this.LIZJ = l.longValue() + this.LIZJ;
                }
            }
        }
        return this.LIZJ;
    }

    public final String toString() {
        return "cputime:{deltaTime:" + this.LIZLLL + " usage:" + this.LJFF + " totaltime:" + LIZ() + "}";
    }
}
