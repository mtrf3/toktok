package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist;

import X.C16880lQ;
import X.C4HZ;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DiscountTemplateCell extends BaseTemplateCell<DiscountTemplateItem> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        DiscountTemplateItem t = (DiscountTemplateItem) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        this.itemView.findViewById(R.id.au9).getClass();
        ((TextView) this.itemView.findViewById(R.id.lwn)).setText(t.LJJJZ());
        ((TextView) this.itemView.findViewById(R.id.ly2)).setText(t.LLILL());
        View findViewById = this.itemView.findViewById(R.id.au_);
        o.LJIIIIZZ(findViewById, "itemView.btnEdit");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 34, 42), findViewById);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, t.LJJLJLI());
        if (templateField != null && (templateFieldData2 = templateField.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.lx_)).setText(templateFieldText2.content);
        }
        TemplateField templateField2 = (TemplateField) ORZ.LJLLLLLL(1, t.LJJLJLI());
        if (templateField2 != null && (templateFieldData = templateField2.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.lx9)).setText(templateFieldText.content);
        }
        C4HZ c4hz = (C4HZ) this.itemView.findViewById(R.id.dbw);
        o.LJIIIIZZ(c4hz, "itemView.flPreviewContainer");
        P(c4hz, t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        BaseTemplateCell.L(itemView, t.LLILIL());
        N().iv0(M().getState().LJLILLLLZI, t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.app);
    }
}
