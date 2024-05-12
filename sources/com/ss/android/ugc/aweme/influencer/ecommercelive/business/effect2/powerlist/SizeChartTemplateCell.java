package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist;

import X.C16880lQ;
import X.C4HZ;
import X.C78685UuP;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.OUP;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SizeChartTemplateCell extends BaseTemplateCell<SizeChartTemplateItem> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC57784Mm4 interfaceC57784Mm4) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        String str10;
        TemplateFieldData templateFieldData2;
        TemplateFieldText templateFieldText2;
        TemplateFieldData templateFieldData3;
        TemplateFieldText templateFieldText3;
        TemplateFieldData templateFieldData4;
        TemplateFieldText templateFieldText4;
        TemplateFieldData templateFieldData5;
        TemplateFieldText templateFieldText5;
        TemplateFieldData templateFieldData6;
        TemplateFieldText templateFieldText6;
        TemplateFieldData templateFieldData7;
        TemplateFieldText templateFieldText7;
        TemplateFieldData templateFieldData8;
        TemplateFieldText templateFieldText8;
        TemplateFieldData templateFieldData9;
        TemplateFieldText templateFieldText9;
        TemplateFieldData templateFieldData10;
        TemplateFieldText templateFieldText10;
        TemplateFieldData templateFieldData11;
        TemplateFieldText templateFieldText11;
        SizeChartTemplateItem t = (SizeChartTemplateItem) interfaceC57784Mm4;
        o.LJIIIZ(t, "t");
        this.itemView.findViewById(R.id.au9).getClass();
        ((TextView) this.itemView.findViewById(R.id.lwn)).setText(t.LJJJZ());
        ((TextView) this.itemView.findViewById(R.id.ly2)).setText(t.LLILL());
        View findViewById = this.itemView.findViewById(R.id.au_);
        o.LJIIIIZZ(findViewById, "itemView.btnEdit");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 41, 42), findViewById);
        C4HZ c4hz = (C4HZ) this.itemView.findViewById(R.id.dbw);
        o.LJIIIIZZ(c4hz, "itemView.flPreviewContainer");
        P(c4hz, t);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(t.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, t.LJJLJLI());
        if (templateField != null && (templateFieldData11 = templateField.fieldData) != null && (templateFieldText11 = templateFieldData11.fieldText) != null) {
            ((TextView) this.itemView.findViewById(R.id.lyc)).setText(templateFieldText11.content);
        }
        TemplateField templateField2 = (TemplateField) ORZ.LJLLLLLL(1, t.LJJLJLI());
        String str11 = null;
        if (templateField2 != null && (templateFieldData10 = templateField2.fieldData) != null && (templateFieldText10 = templateFieldData10.fieldText) != null) {
            str = templateFieldText10.content;
        } else {
            str = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxj)).setText(str);
        TemplateField templateField3 = (TemplateField) ORZ.LJLLLLLL(2, t.LJJLJLI());
        if (templateField3 != null && (templateFieldData9 = templateField3.fieldData) != null && (templateFieldText9 = templateFieldData9.fieldText) != null) {
            str2 = templateFieldText9.content;
        } else {
            str2 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxk)).setText(str2);
        View findViewById2 = this.itemView.findViewById(R.id.g15);
        o.LJIIIIZZ(findViewById2, "itemView.llRow1");
        if (C78685UuP.LJJJZ(str) || C78685UuP.LJJJZ(str2)) {
            OUP.LJJLIIIJ(findViewById2);
        } else {
            OUP.LJIJJLI(findViewById2);
        }
        TemplateField templateField4 = (TemplateField) ORZ.LJLLLLLL(3, t.LJJLJLI());
        if (templateField4 != null && (templateFieldData8 = templateField4.fieldData) != null && (templateFieldText8 = templateFieldData8.fieldText) != null) {
            str3 = templateFieldText8.content;
        } else {
            str3 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxl)).setText(str3);
        TemplateField templateField5 = (TemplateField) ORZ.LJLLLLLL(4, t.LJJLJLI());
        if (templateField5 != null && (templateFieldData7 = templateField5.fieldData) != null && (templateFieldText7 = templateFieldData7.fieldText) != null) {
            str4 = templateFieldText7.content;
        } else {
            str4 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxm)).setText(str4);
        View findViewById3 = this.itemView.findViewById(R.id.g16);
        o.LJIIIIZZ(findViewById3, "itemView.llRow2");
        if (C78685UuP.LJJJZ(str3) || C78685UuP.LJJJZ(str4)) {
            OUP.LJJLIIIJ(findViewById3);
        } else {
            OUP.LJIJJLI(findViewById3);
        }
        TemplateField templateField6 = (TemplateField) ORZ.LJLLLLLL(5, t.LJJLJLI());
        if (templateField6 != null && (templateFieldData6 = templateField6.fieldData) != null && (templateFieldText6 = templateFieldData6.fieldText) != null) {
            str5 = templateFieldText6.content;
        } else {
            str5 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxn)).setText(str5);
        TemplateField templateField7 = (TemplateField) ORZ.LJLLLLLL(6, t.LJJLJLI());
        if (templateField7 != null && (templateFieldData5 = templateField7.fieldData) != null && (templateFieldText5 = templateFieldData5.fieldText) != null) {
            str6 = templateFieldText5.content;
        } else {
            str6 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxo)).setText(str6);
        View findViewById4 = this.itemView.findViewById(R.id.g17);
        o.LJIIIIZZ(findViewById4, "itemView.llRow3");
        if (C78685UuP.LJJJZ(str5) || C78685UuP.LJJJZ(str6)) {
            OUP.LJJLIIIJ(findViewById4);
        } else {
            OUP.LJIJJLI(findViewById4);
        }
        TemplateField templateField8 = (TemplateField) ORZ.LJLLLLLL(7, t.LJJLJLI());
        if (templateField8 != null && (templateFieldData4 = templateField8.fieldData) != null && (templateFieldText4 = templateFieldData4.fieldText) != null) {
            str7 = templateFieldText4.content;
        } else {
            str7 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxp)).setText(str7);
        TemplateField templateField9 = (TemplateField) ORZ.LJLLLLLL(8, t.LJJLJLI());
        if (templateField9 != null && (templateFieldData3 = templateField9.fieldData) != null && (templateFieldText3 = templateFieldData3.fieldText) != null) {
            str8 = templateFieldText3.content;
        } else {
            str8 = null;
        }
        ((TextView) this.itemView.findViewById(R.id.lxq)).setText(str8);
        View findViewById5 = this.itemView.findViewById(R.id.g18);
        o.LJIIIIZZ(findViewById5, "itemView.llRow4");
        if (C78685UuP.LJJJZ(str7) || C78685UuP.LJJJZ(str8)) {
            OUP.LJJLIIIJ(findViewById5);
        } else {
            OUP.LJIJJLI(findViewById5);
        }
        TemplateField templateField10 = (TemplateField) ORZ.LJLLLLLL(9, t.LJJLJLI());
        if (templateField10 != null && (templateFieldData2 = templateField10.fieldData) != null && (templateFieldText2 = templateFieldData2.fieldText) != null && (str9 = templateFieldText2.content) != null) {
            ((TextView) this.itemView.findViewById(R.id.lxr)).setText(str9);
        } else {
            str9 = null;
        }
        TemplateField templateField11 = (TemplateField) ORZ.LJLLLLLL(10, t.LJJLJLI());
        if (templateField11 != null && (templateFieldData = templateField11.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null && (str10 = templateFieldText.content) != null) {
            ((TextView) this.itemView.findViewById(R.id.lxs)).setText(str10);
            str11 = str10;
        }
        View findViewById6 = this.itemView.findViewById(R.id.g19);
        o.LJIIIIZZ(findViewById6, "itemView.llRow5");
        if (C78685UuP.LJJJZ(str9) || C78685UuP.LJJJZ(str11)) {
            OUP.LJJLIIIJ(findViewById6);
        } else {
            OUP.LJIJJLI(findViewById6);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        BaseTemplateCell.L(itemView, t.LLILIL());
        N().iv0(M().getState().LJLILLLLZI, t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.apt);
    }
}
