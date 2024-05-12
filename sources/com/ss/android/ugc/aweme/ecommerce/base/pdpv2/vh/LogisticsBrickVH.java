package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.C16880lQ;
import X.OUP;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBrickVO;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticsBrickVH extends BaseBrickVH<LogisticBrickVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "logistics";
    }

    public LogisticsBrickVH() {
        super(R.layout.a2_);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(LogisticBrickVO logisticBrickVO) {
        String str;
        boolean z;
        LogisticBrickVO item = logisticBrickVO;
        o.LJIIIZ(item, "item");
        LogisticBizData LIZ = item.LIZ();
        if (LIZ != null) {
            Price price = LIZ.shippingFee;
            if (price != null) {
                str = price.getPriceStr();
            } else {
                str = null;
            }
            if (str == null || ujb.o.LJJJJJL(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View findViewById = this.itemView.findViewById(R.id.d6b);
                o.LJIIIIZZ(findViewById, "itemView.fee");
                findViewById.setVisibility(0);
                ((TextView) this.itemView.findViewById(R.id.d6b)).setText(str);
            }
            if (o.LJ(LIZ.freeShipping, Boolean.TRUE)) {
                ((TuxTextView) this.itemView.findViewById(R.id.d6b)).setTextColorRes(R.attr.eb);
                View findViewById2 = this.itemView.findViewById(R.id.dya);
                o.LJIIIIZZ(findViewById2, "itemView.gray");
                findViewById2.setVisibility(0);
                String str2 = LIZ.originalShippingFee;
                if (str2 != null) {
                    ((TextView) this.itemView.findViewById(R.id.dya)).setText(str2);
                }
            } else {
                View findViewById3 = this.itemView.findViewById(R.id.dya);
                o.LJIIIIZZ(findViewById3, "itemView.gray");
                findViewById3.setVisibility(8);
            }
            View findViewById4 = this.itemView.findViewById(R.id.bde);
            o.LJIIIIZZ(findViewById4, "itemView.cl_overseas_deliver_info");
            OUP.LJIJJLI(findViewById4);
            View findViewById5 = this.itemView.findViewById(R.id.maq);
            o.LJIIIIZZ(findViewById5, "itemView.tv_local_deliver_info");
            OUP.LJIJJLI(findViewById5);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 30), itemView);
    }
}
