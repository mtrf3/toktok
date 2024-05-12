package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rk2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC70398Rk2 {
    public final Activity LIZ;
    public final InterfaceC70401Rk5 LIZIZ;

    public abstract int LIZ();

    public final void LIZIZ(String str) {
        Integer num;
        Integer num2;
        if (str == null) {
            return;
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C76732zl c76732zl = new C76732zl();
        int LIZ = LIZ();
        if (LIZ != 1) {
            if (LIZ == 2) {
                c68322mC.element = "discount_quantity_limitation";
                SkuItem xp0 = this.LIZIZ.xp0();
                if (xp0 != null && (num2 = xp0.promotionLimitQuantity) != null) {
                    c76732zl.element = num2.intValue();
                }
            }
        } else {
            c68322mC.element = "min_quantity_limitation";
            SkuItem xp02 = this.LIZIZ.xp0();
            if (xp02 != null && (num = xp02.minBuyQuantity) != null) {
                c76732zl.element = num.intValue();
            }
        }
        C26048AKe c26048AKe = new C26048AKe(this.LIZ);
        c26048AKe.LJI(str);
        c26048AKe.LJII();
        C76542zS.LIZJ("tiktokec_toast_show", new AqS116S0300000_12(this, (AbstractC70398Rk2) c68322mC, (C68322mC<String>) c76732zl, (C76732zl) 29));
    }

    public AbstractC70398Rk2(Activity context, SkuPanelViewModel skuStrategyData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(skuStrategyData, "skuStrategyData");
        this.LIZ = context;
        this.LIZIZ = skuStrategyData;
    }

    public static String LIZJ(int i, String template) {
        o.LJIIIZ(template, "template");
        return ujb.o.LJJJJZ(template, "{$quantity}", String.valueOf(i), false);
    }
}
