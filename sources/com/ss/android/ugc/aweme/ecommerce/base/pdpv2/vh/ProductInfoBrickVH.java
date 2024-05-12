package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.C16880lQ;
import X.C2068389v;
import X.C45804HyK;
import X.OUP;
import X.X1D;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductInfoBrickVO;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductInfoBrickVH extends BaseBrickVH<ProductInfoBrickVO> {
    public boolean LJLJLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "price";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void V() {
        TuxIconView it = (TuxIconView) this.itemView.findViewById(R.id.ebi);
        o.LJIIIIZZ(it, "it");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 79, 42), it);
        it.post(new ARunnableS39S0100000_3(it, 167));
    }

    public ProductInfoBrickVH() {
        super(R.layout.a3n);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(ProductInfoBrickVO item) {
        String str;
        boolean z;
        String str2;
        String str3;
        int i;
        int i2;
        Integer num;
        ProductPrice productPrice;
        ProductPrice productPrice2;
        String str4;
        ProductPrice productPrice3;
        String str5;
        ProductPrice productPrice4;
        o.LJIIIZ(item, "item");
        TextView textView = (TextView) this.itemView.findViewById(R.id.i4d);
        ProductInfoBizData LIZ = item.LIZ();
        String str6 = "";
        if (LIZ == null || (productPrice4 = LIZ.price) == null || (str = productPrice4.realPrice) == null) {
            str = "";
        }
        textView.setText(str);
        ProductInfoBizData LIZ2 = item.LIZ();
        boolean z2 = true;
        if (LIZ2 != null && (productPrice3 = LIZ2.price) != null && (str5 = productPrice3.originPrice) != null && (!ujb.o.LJJJJJL(str5))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View findViewById = this.itemView.findViewById(R.id.hdl);
            o.LJIIIIZZ(findViewById, "itemView.origin_price");
            findViewById.setVisibility(0);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.hdl);
            ProductInfoBizData LIZ3 = item.LIZ();
            if (LIZ3 != null && (productPrice2 = LIZ3.price) != null && (str4 = productPrice2.originPrice) != null) {
                str6 = str4;
            }
            textView2.setText(str6);
            ((TextView) this.itemView.findViewById(R.id.hdl)).setPaintFlags(16);
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.hdl);
            o.LJIIIIZZ(findViewById2, "itemView.origin_price");
            findViewById2.setVisibility(8);
        }
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.caq);
        o.LJIIIIZZ(textView3, "itemView.discount_horizontal");
        ProductInfoBizData LIZ4 = item.LIZ();
        Integer num2 = null;
        if (LIZ4 != null && (productPrice = LIZ4.price) != null) {
            str2 = productPrice.discount;
        } else {
            str2 = null;
        }
        OUP.LJJLIIIJILLIZJL(textView3, str2);
        TextView textView4 = (TextView) this.itemView.findViewById(R.id.mey);
        ProductInfoBizData LIZ5 = item.LIZ();
        if (LIZ5 != null) {
            str3 = LIZ5.title;
        } else {
            str3 = null;
        }
        textView4.setText(str3);
        ProductInfoBizData LIZ6 = item.LIZ();
        if (LIZ6 != null && (num = LIZ6.viewCount) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i > 0) {
            View findViewById3 = this.itemView.findViewById(R.id.as0);
            o.LJIIIIZZ(findViewById3, "itemView.bottom_zone");
            findViewById3.setVisibility(0);
            String quantityString = this.itemView.getContext().getResources().getQuantityString(R.plurals.em, i);
            o.LJIIIIZZ(quantityString, "itemView.context.resourc…               viewCount)");
            TextView textView5 = (TextView) this.itemView.findViewById(R.id.mfd);
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(i);
            LIZ7.append(' ');
            LIZ7.append(quantityString);
            textView5.setText(X1D.LIZIZ(LIZ7));
        } else {
            View findViewById4 = this.itemView.findViewById(R.id.as0);
            o.LJIIIIZZ(findViewById4, "itemView.bottom_zone");
            findViewById4.setVisibility(8);
        }
        ProductInfoBizData LIZ8 = item.LIZ();
        if (LIZ8 != null) {
            num2 = LIZ8.saveStatus;
        }
        View findViewById5 = this.itemView.findViewById(R.id.ebi);
        if (num2 == null || num2.intValue() != 0) {
            C45804HyK.LJJLL(findViewById5);
            if (num2 == null || num2.intValue() != 1) {
                z2 = false;
            }
            this.LJLJLLL = z2;
            C2068389v c2068389v = new C2068389v();
            if (z2) {
                i2 = R.raw.icon_3pt_bookmark_fill;
            } else {
                i2 = R.raw.icon_3pt_bookmark;
            }
            c2068389v.LIZ = i2;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            ((TuxIconView) this.itemView.findViewById(R.id.ebi)).setTuxIcon(c2068389v);
            return;
        }
        C45804HyK.LJJIJIIJIL(findViewById5);
    }
}
