package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.api.anchor_data.RealtimeLiveCenterLayoutTab;

/* loaded from: classes14.dex */
public final class UEK extends AbstractC03120Ai {
    public final List<RealtimeLiveCenterLayoutTab> LIZ;
    public final List<RealtimeLiveCenterLayoutTab> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public UEK(List<RealtimeLiveCenterLayoutTab> list, List<RealtimeLiveCenterLayoutTab> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab = (RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZ, i);
        RealtimeLiveCenterLayoutTab realtimeLiveCenterLayoutTab2 = (RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZIZ, i2);
        if (o.LJ(realtimeLiveCenterLayoutTab.layoutName, realtimeLiveCenterLayoutTab2.layoutName) && o.LJ(realtimeLiveCenterLayoutTab.lynxUrl, realtimeLiveCenterLayoutTab2.lynxUrl)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZ, i)).layoutName, ((RealtimeLiveCenterLayoutTab) ListProtector.get(this.LIZIZ, i2)).layoutName);
    }
}
