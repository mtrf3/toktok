package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70414RkI;
import X.C74358TGg;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomAddressInterceptor;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

/* loaded from: classes13.dex */
public class AqS72S0201000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS72S0201000_12 aqS72S0201000_12) {
        C70414RkI c70414RkI = ((PdpCouponsViewHolder) aqS72S0201000_12.l0).getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJIIJ(aqS72S0201000_12.i2 + 1, (Voucher) aqS72S0201000_12.l1, "T&C");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS72S0201000_12 aqS72S0201000_12) {
        EcomAddressInterceptor ecomAddressInterceptor = (EcomAddressInterceptor) aqS72S0201000_12.l0;
        Object obj = aqS72S0201000_12.l1;
        int i = aqS72S0201000_12.i2;
        ecomAddressInterceptor.getClass();
        EcomAddressInterceptor.LIZ(0, i, obj, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS72S0201000_12 aqS72S0201000_12) {
        ((InterfaceC88471Ynr) aqS72S0201000_12.l0).invoke((EffectCategoryModel) aqS72S0201000_12.l1, Integer.valueOf(aqS72S0201000_12.i2));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0201000_12(C74358TGg c74358TGg, EffectCategoryModel effectCategoryModel, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c74358TGg;
        this.l1 = effectCategoryModel;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0201000_12(PdpCouponsViewHolder pdpCouponsViewHolder, Voucher voucher, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = pdpCouponsViewHolder;
        this.l1 = voucher;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS72S0201000_12(EcomAddressInterceptor ecomAddressInterceptor, Object obj, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = ecomAddressInterceptor;
        this.l1 = obj;
        this.i2 = i;
    }
}
