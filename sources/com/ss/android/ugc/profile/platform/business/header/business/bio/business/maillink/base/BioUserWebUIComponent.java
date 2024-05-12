package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base;

import X.C119244m8;
import X.C2068389v;
import X.C221108m2;
import X.C55096Ljo;
import X.C9AC;
import X.C9AE;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public class BioUserWebUIComponent extends BioBaseUIComponent {
    public C119244m8 LJLJJI;

    public int C3() {
        throw null;
    }

    public String E3() {
        throw null;
    }

    public BioUserWebUIComponent() {
        new LinkedHashMap();
    }

    public final C2068389v A3() {
        return (C2068389v) C221108m2.LIZIZ(new AqS154S0100000_4(this, 938)).getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        C119244m8 c119244m8;
        TextView textView;
        String E3;
        Describe describe;
        View view = this.componentView;
        if ((view instanceof C119244m8) && (textView = (TextView) view) != null) {
            BizBaseData bizBaseData = this.LJLIL;
            if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (E3 = describe.getText()) == null) {
                E3 = E3();
            }
            textView.setText(E3);
        }
        View view2 = this.componentView;
        if ((view2 instanceof C119244m8) && (c119244m8 = (C119244m8) view2) != null) {
            c119244m8.setStartIcon(A3());
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View generateComponentView() {
        String E3;
        Describe describe;
        Context context = getContext();
        C119244m8 c119244m8 = null;
        if (context != null) {
            c119244m8 = new C119244m8(context, null, 6);
        }
        this.LJLJJI = c119244m8;
        BizBaseData bizBaseData = this.LJLIL;
        if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (E3 = describe.getText()) == null) {
            E3 = E3();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C119244m8 c119244m82 = this.LJLJJI;
        if (c119244m82 != null) {
            c119244m82.setLayoutParams(layoutParams);
            c119244m82.setStartIcon(A3());
            c119244m82.setText(E3);
            c119244m82.setMaxLines(1);
            c119244m82.setMaxEms(39);
            c119244m82.setEllipsize(TextUtils.TruncateAt.END);
            c119244m82.setTuxFont(62);
        }
        C9AE.LIZ(this.LJLJJI, C9AC.ALPHA, 0.0f);
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void v3(View view) {
        IBioUserMailLinkAbility iBioUserMailLinkAbility;
        if (view != null && (iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IBioUserMailLinkAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iBioUserMailLinkAbility.LJFF(this.index, view, str);
        }
    }
}
