package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist;

import X.C16880lQ;
import X.C169696lJ;
import X.C4HZ;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.OUP;
import X.SY4;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S7S0000000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductTemplateCell extends BaseTemplateCell<ProductTemplateItem> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        TemplateFieldProduct templateFieldProduct;
        String str;
        TemplateField templateField;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        int intValue;
        String valueOf;
        String str2;
        TemplateFieldData templateFieldData2;
        ProductTemplateItem t = (ProductTemplateItem) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        this.itemView.findViewById(R.id.au9).getClass();
        ((TextView) this.itemView.findViewById(R.id.lwn)).setText(t.LJJJZ());
        ((TextView) this.itemView.findViewById(R.id.ly2)).setText(t.LLILL());
        View findViewById = this.itemView.findViewById(R.id.au_);
        o.LJIIIIZZ(findViewById, "itemView.btnEdit");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 39, 42), findViewById);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateField templateField2 = (TemplateField) ORZ.LJLLLLLL(0, t.LJJLJLI());
        Integer num = null;
        if (templateField2 != null && (templateFieldData2 = templateField2.fieldData) != null) {
            templateFieldProduct = templateFieldData2.fieldProduct;
            if (templateFieldProduct != null) {
                str = templateFieldProduct.productImage;
                if (str != null || str.length() == 0) {
                    ((SY4) this.itemView.findViewById(R.id.au9)).setEnabled(false);
                    ((SY4) this.itemView.findViewById(R.id.au9)).setSupportClickWhenDisable(true);
                    View findViewById2 = this.itemView.findViewById(R.id.au9);
                    o.LJIIIIZZ(findViewById2, "itemView.btnDisplay");
                    C16880lQ.LJIIJ(new Au2S7S0000000_12(1), findViewById2);
                } else {
                    C4HZ c4hz = (C4HZ) this.itemView.findViewById(R.id.dbw);
                    o.LJIIIIZZ(c4hz, "itemView.flPreviewContainer");
                    P(c4hz, t);
                    W5F LJIIIIZZ2 = W5U.LJIIIIZZ(str);
                    LJIIIIZZ2.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewn);
                    C16880lQ.LLJJJ(LJIIIIZZ2);
                    templateFieldProduct.getClass();
                    try {
                        str2 = templateFieldProduct.productIndex;
                    } catch (Throwable unused) {
                    }
                    if (str2 != null) {
                        num = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                        if (num != null && (intValue = num.intValue()) > 0) {
                            View findViewById3 = this.itemView.findViewById(R.id.lxb);
                            o.LJIIIIZZ(findViewById3, "itemView.tvProductNo");
                            OUP.LJJLIIIJ(findViewById3);
                            TextView textView = (TextView) this.itemView.findViewById(R.id.lxb);
                            if (intValue < 10) {
                                valueOf = C169696lJ.LIZIZ('0', intValue);
                            } else {
                                valueOf = String.valueOf(intValue);
                            }
                            textView.setText(valueOf);
                        }
                    }
                }
                templateField = (TemplateField) ORZ.LJLLLLLL(1, t.LJJLJLI());
                if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
                    ((TextView) this.itemView.findViewById(R.id.lvz)).setText(templateFieldText.content);
                }
                View itemView = this.itemView;
                o.LJIIIIZZ(itemView, "itemView");
                BaseTemplateCell.L(itemView, t.LLILIL());
                N().iv0(M().getState().LJLILLLLZI, t);
            }
        } else {
            templateFieldProduct = null;
        }
        str = null;
        if (str != null) {
        }
        ((SY4) this.itemView.findViewById(R.id.au9)).setEnabled(false);
        ((SY4) this.itemView.findViewById(R.id.au9)).setSupportClickWhenDisable(true);
        View findViewById22 = this.itemView.findViewById(R.id.au9);
        o.LJIIIIZZ(findViewById22, "itemView.btnDisplay");
        C16880lQ.LJIIJ(new Au2S7S0000000_12(1), findViewById22);
        templateField = (TemplateField) ORZ.LJLLLLLL(1, t.LJJLJLI());
        if (templateField != null) {
            ((TextView) this.itemView.findViewById(R.id.lvz)).setText(templateFieldText.content);
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        BaseTemplateCell.L(itemView2, t.LLILIL());
        N().iv0(M().getState().LJLILLLLZI, t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.apr);
    }
}
