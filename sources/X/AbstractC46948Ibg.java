package X;

import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ibg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC46948Ibg implements InterfaceC46926IbK {
    public final InterfaceC46949Ibh LIZ;
    public List<? extends InterfaceC46969Ic1> LIZIZ;
    public List<? extends InterfaceC46947Ibf> LIZJ;
    public IY3 LIZLLL;

    public AbstractC46948Ibg(InterfaceC46949Ibh interfaceC46949Ibh) {
        this.LIZ = interfaceC46949Ibh;
    }

    @Override // X.InterfaceC46926IbK
    public final void LIZ(IY3 iy3) {
        this.LIZLLL = iy3;
    }

    public final <T extends IYN> List<T> LIZJ(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.LIZ != null && !list.isEmpty()) {
            Pair<Double, Double> LIZLLL = this.LIZ.LIZLLL();
            java.util.Set<String> LIZ = this.LIZ.LIZ();
            if (LIZLLL != null && this.LIZ.LIZJ() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                z = true;
            } else {
                z = false;
            }
            for (T t : list) {
                if (z) {
                    double bitRate = t.getBitRate();
                    if (bitRate >= ((Double) LIZLLL.first).doubleValue() && bitRate <= ((Double) LIZLLL.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (LIZ != null && LIZ.contains(t.getGearName())) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 == null || Math.abs(t3.getBitRate() - this.LIZ.LIZJ()) < Math.abs(t2.getBitRate() - this.LIZ.LIZJ())) {
                            t2 = t3;
                        }
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(ListProtector.get(list, 0));
                }
            }
        }
        return arrayList;
    }
}
