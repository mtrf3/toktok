package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc;

import X.C16880lQ;
import X.C2068389v;
import X.C26830Afy;
import X.C76800UCe;
import X.C78857UxB;
import X.ORS;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescSpecBrickVO;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescSpecBrickVH extends BaseBrickVH<ProductDescSpecBrickVO> {
    public final LinkedList<SmartImageView> LJLJLLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final boolean Q() {
        return false;
    }

    public ProductDescSpecBrickVH() {
        super(R.layout.a3d);
        this.LJLJLLL = new LinkedList<>();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(ProductDescSpecBrickVO productDescSpecBrickVO) {
        int i;
        int i2;
        ProductDescSpecBrickVO item = productDescSpecBrickVO;
        o.LJIIIZ(item, "item");
        List<Specification> list = item.specifications;
        int i3 = 0;
        if (C26830Afy.LIZ()) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.dlx);
            o.LJIIIIZZ(viewGroup, "itemView.four_specs_layout");
            LinkedList<SmartImageView> linkedList = this.LJLJLLL;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof SmartImageView) {
                    linkedList.add(c76800UCe);
                }
            }
        } else {
            ((ViewGroup) this.itemView.findViewById(R.id.dlx)).removeAllViews();
        }
        if (!item.needShowMore) {
            i = list.size();
        } else {
            i = 4;
        }
        int min = Math.min(i, list.size());
        for (int i4 = 0; i4 < min; i4++) {
            ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.dlx);
            Specification specification = (Specification) ListProtector.get(list, i4);
            View view = (View) ORS.LJJLJLI(this.LJLJLLL);
            if (view == null) {
                view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.itemView.getContext()), R.layout.a3e, null, false);
            }
            StringBuilder sb = new StringBuilder();
            if (C78857UxB.LJJJIL(specification.name)) {
                sb.append(specification.name);
            }
            if (C78857UxB.LJJJIL(specification.value)) {
                if (sb.length() > 0) {
                    sb.append(": ");
                }
                sb.append(specification.value);
            }
            ((TextView) view.findViewById(R.id.k9_)).setText(sb.toString());
            viewGroup2.addView(view);
        }
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.jk6);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_chevron_down_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        tuxIconView.setTuxIcon(c2068389v);
        View findViewById = this.itemView.findViewById(R.id.jk3);
        o.LJIIIIZZ(findViewById, "itemView.see_more");
        if (item.needShowMore) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.jk6);
        o.LJIIIIZZ(imageView, "itemView.see_more_icon");
        if (!item.needShowMore) {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        View findViewById2 = this.itemView.findViewById(R.id.jk3);
        o.LJIIIIZZ(findViewById2, "itemView.see_more");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 82, 42), findViewById2);
        View findViewById3 = this.itemView.findViewById(R.id.jk6);
        o.LJIIIIZZ(findViewById3, "itemView.see_more_icon");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 83, 42), findViewById3);
    }
}
