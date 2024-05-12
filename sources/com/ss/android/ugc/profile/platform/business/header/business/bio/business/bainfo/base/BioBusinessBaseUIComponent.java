package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base;

import X.C235189Kw;
import X.C235199Kx;
import X.C32151Nz;
import X.C55096Ljo;
import X.C76800UCe;
import X.C7MY;
import X.C9AC;
import X.C9AE;
import X.InterfaceC65784Pro;
import X.O6R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.internal.b;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes5.dex */
public class BioBusinessBaseUIComponent extends BioBaseUIComponent {
    public String C3() {
        throw null;
    }

    public Integer E3() {
        throw null;
    }

    public String F3() {
        throw null;
    }

    public BioBusinessBaseUIComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        String F3;
        Integer num;
        Icon icon;
        Describe describe;
        BizBaseData bizBaseData = this.LJLIL;
        if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (F3 = describe.getText()) == null) {
            F3 = F3();
        }
        BizBaseData bizBaseData2 = this.LJLIL;
        LinearLayout linearLayout = null;
        if (bizBaseData2 != null && (icon = bizBaseData2.getIcon()) != null) {
            num = Icon.getIconInt$default(icon, null, E3(), 1, null);
        } else {
            num = null;
        }
        InterfaceC65784Pro<C76800UCe> A3 = A3();
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setId(R.id.alk);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(16), C7MY.LIZIZ(16));
            layoutParams.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxIconView.setLayoutParams(layoutParams);
            tuxIconView.setTintColorRes(R.attr.eb);
            linearLayout2.addView(tuxIconView);
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setId(R.id.all);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxTextView.setLayoutParams(layoutParams2);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setTextColorRes(R.attr.eb);
            tuxTextView.setTuxFont(52);
            tuxTextView.setMaxEms(18);
            tuxTextView.setMaxLines(1);
            linearLayout2.addView(tuxTextView);
            if (num != null) {
                tuxIconView.setIconRes(num.intValue());
            }
            tuxTextView.setText(F3);
            b.LJIL(A3, C235199Kx.LJLIL, new AqS170S0100000_4(linearLayout2, 882));
            linearLayout = linearLayout2;
        }
        C9AE.LIZ(linearLayout, C9AC.ALPHA, 0.0f);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        String F3;
        TextView textView;
        Describe describe;
        Icon icon;
        Integer iconInt$default;
        View view;
        TuxIconView tuxIconView;
        BizBaseData bizBaseData = this.LJLIL;
        if (bizBaseData != null && (icon = bizBaseData.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, E3(), 1, null)) != null && (view = this.componentView) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.alk)) != null) {
            tuxIconView.setIconRes(iconInt$default.intValue());
        }
        BizBaseData bizBaseData2 = this.LJLIL;
        if (bizBaseData2 == null || (describe = bizBaseData2.getDescribe()) == null || (F3 = describe.getText()) == null) {
            F3 = F3();
        }
        View view2 = this.componentView;
        if (view2 == null || (textView = (TextView) view2.findViewById(R.id.all)) == null) {
            return;
        }
        if (F3 == null) {
            F3 = "";
        }
        textView.setText(F3);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            x3.ov0(new AqS170S0100000_4(this, 824));
        }
    }

    public InterfaceC65784Pro<C76800UCe> A3() {
        return C235189Kw.LJLIL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent
    public final void v3(View view) {
        IBioBAAbility iBioBAAbility;
        if (view != null && (iBioBAAbility = (IBioBAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IBioBAAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iBioBAAbility.LJFF(this.index, view, str);
        }
    }
}
