package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.CnU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32392CnU extends AbstractC32375CnD {
    public C32392CnU() {
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 312));
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        ArrayList arrayList = new ArrayList();
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
        return AbstractC32375CnD.LJIIIIZZ(assetsModel, i);
    }
}
