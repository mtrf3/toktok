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
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiTextTemplateCell extends BaseTemplateCell<MultiTextTemplateItem> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateFieldData templateFieldData3;
        TemplateFieldText templateFieldText3;
        TemplateFieldData templateFieldData4;
        TemplateFieldText templateFieldText4;
        MultiTextTemplateItem t = (MultiTextTemplateItem) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        this.itemView.findViewById(R.id.au9).getClass();
        ((TextView) this.itemView.findViewById(R.id.lwn)).setText(t.LJJJZ());
        ((TextView) this.itemView.findViewById(R.id.ly2)).setText(t.LLILL());
        View findViewById = this.itemView.findViewById(R.id.au_);
        o.LJIIIIZZ(findViewById, "itemView.btnEdit");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 38, 42), findViewById);
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, t.LJJLJLI());
        if (templateField != null && (templateFieldData4 = templateField.fieldData) != null && (templateFieldText4 = templateFieldData4.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.lyc)).setText(templateFieldText4.content);
        }
        TemplateField templateField2 = (TemplateField) ORZ.LJLLLLLL(1, t.LJJLJLI());
        if (templateField2 != null && (templateFieldData3 = templateField2.fieldData) != null && (templateFieldText3 = templateFieldData3.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.ly8)).setText(templateFieldText3.content);
        }
        TemplateField templateField3 = (TemplateField) ORZ.LJLLLLLL(2, t.LJJLJLI());
        if (templateField3 != null && (templateFieldData2 = templateField3.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.ly9)).setText(templateFieldText2.content);
        }
        TemplateField templateField4 = (TemplateField) ORZ.LJLLLLLL(3, t.LJJLJLI());
        if (templateField4 != null && (templateFieldData = templateField4.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.ly_)).setText(templateFieldText.content);
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
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
        return inflateItemView(parent, R.layout.apq);
    }
}
