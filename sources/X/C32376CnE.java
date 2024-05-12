package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftByteVC1OptResourceSetting;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.CnE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32376CnE extends AbstractC32375CnD {
    public C32376CnE() {
        C221108m2.LIZIZ(new AqS155S0100000_5(this, 311));
    }

    @Override // X.InterfaceC32340Cme
    public final boolean LIZ(AssetsModel assetsModel) {
        ArrayList arrayList = new ArrayList();
        C32420Cnw LJII = AbstractC32375CnD.LJII(assetsModel, 0);
        if (LJII != null) {
            arrayList.add(LJII);
        }
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
            if (assetsModel != null && AbstractC32375CnD.LJIILIIL(assetsModel)) {
                C32366Cn4.LJIIIIZZ(assetsModel);
            }
            return LJIIIIZZ;
        }
        C32420Cnw LJ = AbstractC32375CnD.LJ(assetsModel, i);
        if (PU0.LJI().LJII(LJ)) {
            if (assetsModel != null && AbstractC32375CnD.LJIILIIL(assetsModel)) {
                C32366Cn4.LJIIIIZZ(assetsModel);
            }
            return LJ;
        }
        C32420Cnw LIZLLL = AbstractC32375CnD.LIZLLL(assetsModel, i);
        if (PU0.LJI().LJII(LIZLLL)) {
            if (assetsModel != null && AbstractC32375CnD.LJIILIIL(assetsModel)) {
                C32366Cn4.LJIIIIZZ(assetsModel);
            }
            return LIZLLL;
        }
        C32420Cnw LJII = AbstractC32375CnD.LJII(assetsModel, i);
        if (LJII != null) {
            return LJII;
        }
        LiveGiftByteVC1OptResourceSetting liveGiftByteVC1OptResourceSetting = LiveGiftByteVC1OptResourceSetting.INSTANCE;
        if (liveGiftByteVC1OptResourceSetting.getValue() && LIZLLL != null) {
            return LIZLLL;
        }
        if (!liveGiftByteVC1OptResourceSetting.getValue() || LIZLLL != null || LJ == null) {
            return LJIIIIZZ;
        }
        return LJ;
    }
}
