package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.CnF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32377CnF extends AbstractC32375CnD {
    public C32377CnF() {
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 310));
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        ArrayList arrayList = new ArrayList();
        C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, 0);
        if (LIZLLL != null) {
            arrayList.add(LIZLLL);
        }
        C32420Cnw LJ = AbstractC32375CnD.LJ(assetsModel, 0);
        if (LJ != null) {
            arrayList.add(LJ);
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
        C32420Cnw LJIIIIZZ = AbstractC32375CnD.LJIIIIZZ(assetsModel, i);
        if (PU0.LJI().LJII(LJIIIIZZ)) {
            return LJIIIIZZ;
        }
        C32420Cnw LJ = AbstractC32375CnD.LJ(assetsModel, i);
        if (PU0.LJI().LJII(LJ)) {
            return LJ;
        }
        C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, i);
        if (LIZLLL != null) {
            return LIZLLL;
        }
        return LJIIIIZZ;
    }
}
