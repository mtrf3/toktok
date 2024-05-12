package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonText;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RvG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71094RvG {
    public static final /* synthetic */ int LJII = 0;
    public final OrderSubmitViewModel LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;
    public String LJI;

    public C71094RvG(OrderSubmitViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LIZ = viewModel;
        this.LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1119));
        this.LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1120));
        this.LIZLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1118));
        this.LJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1117));
        this.LJFF = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1116));
        this.LJI = "You should buy {$quantity} products or more, or you couldn't place the order.";
    }

    public final void LIZ(TextView notice, C27959AyB c27959AyB, boolean z) {
        int intValue;
        SkuCommonText skuCommonText;
        String str;
        int intValue2;
        Integer num;
        o.LJIIIZ(notice, "notice");
        if (c27959AyB.LJIIJ != null) {
            notice.setVisibility(0);
            notice.setText(c27959AyB.LJIIJ.desc);
        } else if (C78685UuP.LJJJZ(c27959AyB.LJII)) {
            notice.setVisibility(0);
            notice.setText(c27959AyB.LJII);
        } else {
            notice.setVisibility(8);
        }
        if (this.LIZ.uw0(z)) {
            Integer num2 = c27959AyB.LJIILIIL;
            if (num2 != null && (intValue2 = num2.intValue()) > 0) {
                if (c27959AyB.LIZIZ > intValue2) {
                    notice.setVisibility(0);
                    notice.setText(C71095RvH.LIZ(intValue2, (String) this.LIZLLL.getValue()));
                    C27926Axe c27926Axe = this.LIZ.LLJJJJ;
                    if (c27926Axe != null && o.LJ(c27926Axe.LIZIZ, c27959AyB.LIZ) && (num = c27926Axe.LIZJ) != null && num.intValue() <= intValue2) {
                        String LIZ = C71095RvH.LIZ(intValue2, (String) this.LIZJ.getValue());
                        C26045AKb c26045AKb = new C26045AKb(notice);
                        c26045AKb.LJIIIZ(LIZ);
                        c26045AKb.LJIIJ();
                        C76542zS.LIZJ("tiktokec_toast_show", new AqS61S0201000_12(this, intValue2, c27959AyB, 11));
                    }
                } else {
                    notice.setVisibility(8);
                }
            }
            Integer num3 = c27959AyB.LJIIL;
            if (num3 == null || (intValue = num3.intValue()) <= 1) {
                return;
            }
            List list = (List) this.LJ.getValue();
            if (list != null && (skuCommonText = (SkuCommonText) ORZ.LJLLLLLL(0, list)) != null && (str = skuCommonText.toast) != null) {
                this.LJI = str;
            }
            if (c27959AyB.LIZIZ != intValue) {
                return;
            }
            notice.setVisibility(0);
            notice.setText(C71095RvH.LIZ(intValue, (String) this.LJFF.getValue()));
        }
    }
}
