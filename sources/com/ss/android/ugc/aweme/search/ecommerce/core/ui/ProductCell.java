package com.ss.android.ugc.aweme.search.ecommerce.core.ui;

import X.C16880lQ;
import X.C1DI;
import X.C34127DaN;
import X.C49421JaT;
import X.C49464JbA;
import X.C76800UCe;
import X.C78939UyV;
import X.InterfaceC49469JbF;
import X.ORZ;
import X.W5F;
import X.W5U;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ProductCell extends PowerCell<C49464JbA> {
    public SmartImageView LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public ViewGroup LJLJJI;
    public TextView LJLJJL;
    public SmartImageView LJLJJLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        InterfaceC49469JbF interfaceC49469JbF;
        super.onViewAttachedToWindow();
        C49464JbA item = getItem();
        if (item != null && (interfaceC49469JbF = item.LJLJI) != null) {
            interfaceC49469JbF.LIZ(item.LJLIL, getBindingAdapterPosition());
        }
    }

    public static int L(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return 0;
        }
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C49464JbA c49464JbA) {
        String str;
        UrlModel urlModel;
        String str2;
        C49464JbA t = c49464JbA;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setText(t.LJLIL.title);
            TextView textView2 = this.LJLJI;
            if (textView2 != null) {
                textView2.setText(t.LJLIL.formatPrice);
                List<String> list = t.LJLIL.imgUrlList;
                if (list != null && (str2 = (String) ORZ.LJLLLLLL(0, list)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                    SmartImageView smartImageView = this.LJLIL;
                    if (smartImageView != null) {
                        LJIIIIZZ.LJJIIJ = smartImageView;
                        C16880lQ.LLJJJ(LJIIIIZZ);
                    } else {
                        o.LJIJI("coverImage");
                        throw null;
                    }
                }
                Product.ActivityInfo activityInfo = t.LJLIL.activityInfo;
                if (activityInfo != null) {
                    str = activityInfo.name;
                    urlModel = activityInfo.iconUrl;
                } else {
                    str = null;
                    urlModel = null;
                }
                if (str != null && urlModel != null) {
                    ViewGroup viewGroup = this.LJLJJI;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        TextView textView3 = this.LJLJJL;
                        if (textView3 != null) {
                            textView3.setText(str);
                            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                            SmartImageView smartImageView2 = this.LJLJJLL;
                            if (smartImageView2 != null) {
                                LJII.LJJIIJ = smartImageView2;
                                C16880lQ.LLJJJ(LJII);
                                if (C76800UCe.LIZ != null) {
                                    return;
                                }
                            } else {
                                o.LJIJI("tagIconImage");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tagText");
                            throw null;
                        }
                    } else {
                        o.LJIJI("tagLayout");
                        throw null;
                    }
                }
                ViewGroup viewGroup2 = this.LJLJJI;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                    return;
                } else {
                    o.LJIJI("tagLayout");
                    throw null;
                }
            }
            o.LJIJI("priceText");
            throw null;
        }
        o.LJIJI("titleText");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZ = C1DI.LIZ(viewGroup, "parent", R.layout.cin, viewGroup, false, "view");
        View findViewById = LIZ.findViewById(R.id.i61);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.product_item_image)");
        this.LJLIL = (SmartImageView) findViewById;
        if (C34127DaN.LJFF()) {
            SmartImageView smartImageView = this.LJLIL;
            if (smartImageView != null) {
                C49421JaT.LJ(smartImageView, false);
            } else {
                o.LJIJI("coverImage");
                throw null;
            }
        }
        View findViewById2 = LIZ.findViewById(R.id.i66);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.product_item_title)");
        this.LJLILLLLZI = (TextView) findViewById2;
        View findViewById3 = LIZ.findViewById(R.id.i62);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.product_item_price)");
        this.LJLJI = (TextView) findViewById3;
        View findViewById4 = LIZ.findViewById(R.id.i63);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.product_item_tag)");
        this.LJLJJI = (ViewGroup) findViewById4;
        View findViewById5 = LIZ.findViewById(R.id.i65);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.product_item_tag_text)");
        this.LJLJJL = (TextView) findViewById5;
        View findViewById6 = LIZ.findViewById(R.id.i64);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.product_item_tag_icon)");
        this.LJLJJLL = (SmartImageView) findViewById6;
        C16880lQ.LJIIJ(new ACListenerS28S0100000_8(this, 105), LIZ);
        return LIZ;
    }
}
