package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CnI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32380CnI extends AbstractC32375CnD {
    static {
        C221108m2.LIZIZ(C32385CnN.INSTANCE);
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        List list;
        C32420Cnw LJIIJ = AbstractC32375CnD.LJIIJ(assetsModel, 0);
        if (LJIIJ != null) {
            list = C47261Igj.LJJIJ(LJIIJ);
        } else {
            C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, 0);
            if (LIZLLL != null) {
                list = C47261Igj.LJJIJ(LIZLLL);
            } else {
                C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, 0);
                if (LJIIIIZZ != null) {
                    list = C47261Igj.LJJIJ(LJIIIIZZ);
                } else {
                    list = C61878OQg.INSTANCE;
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (PU0.LJI().LJII((C32420Cnw) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC32340Cme
    public final C32420Cnw LIZJ(AssetsModel assetsModel, int i) {
        C32420Cnw LJIIJ = AbstractC32375CnD.LJIIJ(assetsModel, i);
        if (LJIIJ != null) {
            return LJIIJ;
        }
        C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, i);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        return AbstractC32375CnD.LJIIIIZZ(assetsModel, i);
    }
}
