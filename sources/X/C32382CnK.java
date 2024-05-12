package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.CnK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32382CnK extends AbstractC32375CnD {
    static {
        C221108m2.LIZIZ(C32384CnM.INSTANCE);
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        ArrayList arrayList = new ArrayList();
        C32420Cnw LJI = AbstractC32375CnD.LJI(assetsModel, 0);
        if (LJI != null) {
            arrayList.add(LJI);
        }
        C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, 0);
        if (LJIIIIZZ != null) {
            arrayList.add(LJIIIIZZ);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (PU0.LJI().LJII((C32420Cnw) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC32340Cme
    public final C32420Cnw LIZJ(AssetsModel assetsModel, int i) {
        C32420Cnw LJI = AbstractC32375CnD.LJI(assetsModel, i);
        if (LJI != null) {
            return LJI;
        }
        return AbstractC32375CnD.LJIIIIZZ(assetsModel, i);
    }
}
