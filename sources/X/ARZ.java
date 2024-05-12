package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes5.dex */
public final class ARZ implements ON0 {
    public final /* synthetic */ C68322mC<C26231ARf> LIZ;

    @Override // X.ON0
    public final void C2() {
        ARH arh;
        List<ARL> list;
        ARL arl;
        C26231ARf c26231ARf = this.LIZ.element;
        AbstractC243009gG abstractC243009gG = null;
        if (c26231ARf != null) {
            abstractC243009gG = c26231ARf.LJI();
        }
        if (!(abstractC243009gG instanceof ARH) || (arh = (ARH) abstractC243009gG) == null || (list = arh.LJFF) == null || (arl = (ARL) ListProtector.get(list, 0)) == null) {
            return;
        }
        arl.LIZIZ(true);
    }

    public ARZ(C68322mC<C26231ARf> c68322mC) {
        this.LIZ = c68322mC;
    }
}
