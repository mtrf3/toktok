package X;

import com.ss.android.ugc.aweme.ecommerce.core.settings.EcomGeckoFrontUpdateModel;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FDE implements FDH {
    public static final FDE LIZ = new FDE();
    public static final EcomGeckoFrontUpdateModel[] LIZIZ = new EcomGeckoFrontUpdateModel[0];

    @Override // X.FDH
    public final java.util.Map<String, EcomGeckoFrontUpdateModel> LIZ() {
        return FDB.LIZ(this);
    }

    @Override // X.FDH
    public final EcomGeckoFrontUpdateModel[] config() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr = LIZIZ;
        LJIIIZ.getClass();
        EcomGeckoFrontUpdateModel[] ecomGeckoFrontUpdateModelArr2 = (EcomGeckoFrontUpdateModel[]) FFL.LJIJ(true, "ecom_common_gecko_front_update_ext3", 31744, EcomGeckoFrontUpdateModel[].class, ecomGeckoFrontUpdateModelArr);
        if (ecomGeckoFrontUpdateModelArr2 != null) {
            ecomGeckoFrontUpdateModelArr = ecomGeckoFrontUpdateModelArr2;
        }
        o.LJIIIIZZ(ecomGeckoFrontUpdateModelArr, "ABManager.getInstance()\n….java)\n        ?: DEFAULT");
        return ecomGeckoFrontUpdateModelArr;
    }
}
