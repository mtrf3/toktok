package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc;

import X.C018905p;
import X.C27646At8;
import X.C45804HyK;
import X.C78565UsT;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescTextBrickVO;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescTextBrickVH extends BaseBrickVH<ProductDescTextBrickVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final boolean Q() {
        return false;
    }

    public ProductDescTextBrickVH() {
        super(R.layout.a36);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(ProductDescTextBrickVO productDescTextBrickVO) {
        int i;
        ProductDescTextBrickVO item = productDescTextBrickVO;
        o.LJIIIZ(item, "item");
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.text);
        int LJIIL = item.LJIIL();
        if (LJIIL != 1) {
            if (LJIIL != 5) {
                if (LJIIL != 6) {
                    if (LJIIL != 7) {
                        if (LJIIL == 8) {
                            this.itemView.findViewById(R.id.cf5).setVisibility(0);
                            this.itemView.findViewById(R.id.msm).setVisibility(8);
                            this.itemView.findViewById(R.id.h_y).setVisibility(0);
                            TextView textView = (TextView) this.itemView.findViewById(R.id.h_y);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(item.index);
                            LIZ.append('.');
                            textView.setText(X1D.LIZIZ(LIZ));
                        }
                    } else {
                        this.itemView.findViewById(R.id.cf5).setVisibility(0);
                        this.itemView.findViewById(R.id.msm).setVisibility(0);
                        this.itemView.findViewById(R.id.h_y).setVisibility(8);
                    }
                } else {
                    this.itemView.findViewById(R.id.cf5).setVisibility(8);
                }
            } else {
                this.itemView.findViewById(R.id.cf5).setVisibility(8);
            }
        } else {
            this.itemView.findViewById(R.id.cf5).setVisibility(8);
        }
        tuxTextView.setTuxFont(item.LJIIZILJ());
        tuxTextView.setTextColorRes(item.LJIILLIIL());
        ((TextView) this.itemView.findViewById(R.id.text)).setText(item.text);
        View view = this.itemView;
        view.setPadding(view.getPaddingLeft(), (int) item.LJIILL().top, this.itemView.getPaddingRight(), (int) item.LJIILL().bottom);
        if (item.needShowViewMore) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.nav));
            View findViewById = this.itemView.findViewById(R.id.nav);
            o.LJIIIIZZ(findViewById, "itemView.view_more");
            C78565UsT.LJJIZ(findViewById, null, new C27646At8(this, null), 3);
        } else {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.nav));
        }
        Float f = item.realHeight;
        if (f != null) {
            i = (int) f.floatValue();
        } else {
            i = -2;
        }
        if (this.itemView.findViewById(R.id.text).getLayoutParams() == null) {
            this.itemView.findViewById(R.id.text).setLayoutParams(new C018905p(0, i));
            return;
        }
        View findViewById2 = this.itemView.findViewById(R.id.text);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.text).getLayoutParams();
        layoutParams.width = 0;
        layoutParams.height = i;
        findViewById2.setLayoutParams(layoutParams);
    }
}
