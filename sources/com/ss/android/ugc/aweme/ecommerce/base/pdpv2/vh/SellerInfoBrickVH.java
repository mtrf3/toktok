package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.C16880lQ;
import X.C70759Rpr;
import X.C77123UOp;
import X.W5F;
import X.X1D;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBrickVO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellerInfoBrickVH extends BaseBrickVH<SellerInfoBrickVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "showcase_detail";
    }

    public SellerInfoBrickVH() {
        super(R.layout.a4b);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(SellerInfoBrickVO sellerInfoBrickVO) {
        Image image;
        String str;
        long j;
        long j2;
        String LIZIZ;
        float f;
        Float f2;
        Long l;
        Long l2;
        SellerInfoBrickVO item = sellerInfoBrickVO;
        o.LJIIIZ(item, "item");
        SellerInfoBizData LIZ = item.LIZ();
        if (LIZ != null) {
            image = LIZ.avatar;
        } else {
            image = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(image);
        LIZLLL.LIZIZ("ShopProfileVH");
        LIZLLL.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.jy5);
        C16880lQ.LLJJJ(LIZLLL);
        TextView textView = (TextView) this.itemView.findViewById(R.id.jy8);
        SellerInfoBizData LIZ2 = item.LIZ();
        if (LIZ2 == null || (str = LIZ2.name) == null) {
            str = "";
        }
        textView.setText(str);
        SellerInfoBizData LIZ3 = item.LIZ();
        if (LIZ3 != null && (l2 = LIZ3.productCount) != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        SellerInfoBizData LIZ4 = item.LIZ();
        if (LIZ4 != null && (l = LIZ4.followers) != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (j < 1 && j2 < 1) {
            View findViewById = this.itemView.findViewById(R.id.i5s);
            o.LJIIIIZZ(findViewById, "itemView.product_count");
            findViewById.setVisibility(8);
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.i5s);
            o.LJIIIIZZ(findViewById2, "itemView.product_count");
            findViewById2.setVisibility(0);
            if (j > 0) {
                if (j == 1) {
                    LIZIZ = this.itemView.getContext().getResources().getString(R.string.f2x, Long.valueOf(j));
                } else {
                    LIZIZ = this.itemView.getContext().getResources().getString(R.string.f3o, Long.valueOf(j));
                }
            } else {
                String LJJIIJ = C77123UOp.LJJIIJ(j2);
                String quantityString = this.itemView.getContext().getResources().getQuantityString(R.plurals.el, (int) j2);
                o.LJIIIIZZ(quantityString, "itemView.context.resourc…wer, followCount.toInt())");
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LJJIIJ);
                LIZ5.append(' ');
                LIZ5.append(quantityString);
                LIZIZ = X1D.LIZIZ(LIZ5);
            }
            o.LJIIIIZZ(LIZIZ, "if (productCount > 0) {\n… $follower\"\n            }");
            ((TextView) this.itemView.findViewById(R.id.i5s)).setText(LIZIZ);
        }
        SellerInfoBizData LIZ6 = item.LIZ();
        if (LIZ6 != null && (f2 = LIZ6.rating) != null) {
            f = f2.floatValue();
        } else {
            f = 0.0f;
        }
        if (f > 0.0f) {
            View findViewById3 = this.itemView.findViewById(R.id.jyb);
            o.LJIIIIZZ(findViewById3, "itemView.shop_rating_detail");
            findViewById3.setVisibility(0);
            this.itemView.findViewById(R.id.jyb).setBackground(null);
            ((TextView) this.itemView.findViewById(R.id.jyc)).setText(String.valueOf(f));
            TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.jye);
            tuxIconView.setIconRes(R.raw.icon_star_fill);
            tuxIconView.setTintColorRes(R.attr.c6);
        } else {
            View findViewById4 = this.itemView.findViewById(R.id.jyb);
            o.LJIIIIZZ(findViewById4, "itemView.shop_rating_detail");
            findViewById4.setVisibility(8);
        }
        View findViewById5 = this.itemView.findViewById(R.id.ndb);
        o.LJIIIIZZ(findViewById5, "itemView.visit");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, item, 47, 42), findViewById5);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, item, 48, 42), itemView);
    }
}
