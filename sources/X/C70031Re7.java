package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECSkuOptimizeForShopBagSwitchConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Re7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70031Re7 {
    public static final int LIZ;
    public static final C70099RfD LIZIZ;

    static {
        FFL LJIIIZ = FFL.LJIIIZ();
        ECSkuOptimizeForShopBagSwitchConfig eCSkuOptimizeForShopBagSwitchConfig = C70037ReD.LIZ;
        LJIIIZ.getClass();
        ECSkuOptimizeForShopBagSwitchConfig eCSkuOptimizeForShopBagSwitchConfig2 = (ECSkuOptimizeForShopBagSwitchConfig) FFL.LJIJ(true, "ec_sku_opt_for_shop_bag_switch", 31744, ECSkuOptimizeForShopBagSwitchConfig.class, eCSkuOptimizeForShopBagSwitchConfig);
        if (eCSkuOptimizeForShopBagSwitchConfig2 != null) {
            eCSkuOptimizeForShopBagSwitchConfig = eCSkuOptimizeForShopBagSwitchConfig2;
        }
        LIZ = eCSkuOptimizeForShopBagSwitchConfig.expireDuration;
        LIZIZ = new C70099RfD();
    }

    public static ProductPackStruct LIZ(String str) {
        boolean z;
        ProductPackStruct LIZIZ2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (LIZIZ2 = LIZIZ.LIZIZ(str)) == null) {
            return null;
        }
        if (!C52289Kfd.LIZ() && SystemClock.elapsedRealtime() - LIZIZ2.lastUpdateTime > LIZ) {
            return null;
        }
        return LIZIZ2;
    }

    public static void LIZIZ(ProductPackStruct product, String id) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(product, "product");
        product.lastUpdateTime = SystemClock.elapsedRealtime();
        LIZIZ.put(id, product);
    }
}
