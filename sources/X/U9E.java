package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9E {
    public final U92 LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public Layout LJ;
    public java.util.Map<Integer, Integer> LJFF;

    public final boolean LIZ() {
        if (this.LJFF == null || !(!r0.isEmpty())) {
            return false;
        }
        return true;
    }

    public U9E(U92 micPositionManager) {
        o.LJIIIZ(micPositionManager, "micPositionManager");
        this.LIZ = micPositionManager;
        this.LIZIZ = "Zoom/MappingHelper";
    }
}
