package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.ui.ShopMainLynxAssem;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M0E {
    public final /* synthetic */ ShopMainLynxAssem LIZ;

    public M0E(ShopMainLynxAssem shopMainLynxAssem) {
        this.LIZ = shopMainLynxAssem;
    }

    public final void LIZ(C56123M0x c56123M0x) {
        ShopMainLynxAssem shopMainLynxAssem = this.LIZ;
        shopMainLynxAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(shopMainLynxAssem);
        if (LIZLLL == null || !LIZLLL.isAdded() || LIZLLL.isDetached()) {
            return;
        }
        this.LIZ.v3().LJLILLLLZI.LJLJL = 2;
        C36746EbW.LIZ(3, "ShopTabV3 DataUpdate OnLynxDataCallback onDataFail");
        ShopMainLynxAssem shopMainLynxAssem2 = this.LIZ;
        shopMainLynxAssem2.getClass();
        try {
            if (shopMainLynxAssem2.v3().LJLILLLLZI.LJLJJI) {
                shopMainLynxAssem2.LJLJJI = null;
                C36746EbW.LIZ(3, "ShopTabV3 DataUpdate setDataError data_from: " + shopMainLynxAssem2.v3().LJLILLLLZI.LJLIL);
                shopMainLynxAssem2.C3(c56123M0x, true);
            } else {
                shopMainLynxAssem2.LJLJJI = c56123M0x;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public final void LIZIZ(C56123M0x c56123M0x) {
        ShopMainLynxAssem shopMainLynxAssem = this.LIZ;
        shopMainLynxAssem.getClass();
        Fragment LIZLLL = C212428Vi.LIZLLL(shopMainLynxAssem);
        if (LIZLLL == null || !LIZLLL.isAdded() || LIZLLL.isDetached()) {
            return;
        }
        C36746EbW.LIZ(3, "ShopTabV3 DataUpdate OnLynxDataCallback onDataSuccess");
        ShopMainLynxAssem shopMainLynxAssem2 = this.LIZ;
        shopMainLynxAssem2.getClass();
        try {
            if (shopMainLynxAssem2.v3().LJLILLLLZI.LJLJJI) {
                shopMainLynxAssem2.LJLJJI = null;
                String dataFrom = shopMainLynxAssem2.v3().LJLILLLLZI.LJLIL.getValue();
                o.LJIIIZ(dataFrom, "dataFrom");
                C36746EbW.LIZ(3, "ShopTabV3 DataUpdate setDataSuccess data_from: " + shopMainLynxAssem2.v3().LJLILLLLZI.LJLIL);
                shopMainLynxAssem2.C3(c56123M0x, true);
            } else {
                shopMainLynxAssem2.LJLJJI = c56123M0x;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
