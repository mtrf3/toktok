package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account;

import X.AnonymousClass636;
import X.C188727au;
import X.C237429Tm;
import X.C244659iv;
import X.C26227ARb;
import X.C77123UOp;
import X.C7MY;
import X.C85990Xow;
import X.C9AC;
import X.C9AE;
import X.C9LU;
import X.FMX;
import X.HG3;
import X.RBX;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.AccountInfoData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountStateControlMediaComponent extends AccountInfoBaseUIComponent<AccountInfoData> {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public boolean LJLJJL = true;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("country_code", C85990Xow.LIZ());
        c188727au.LJIIIZ("enter_from", "account_profile_page");
        FMX.LJIIL("scm_tag_click", c188727au.LIZ);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au2.LJIIIZ("country_code", C85990Xow.LIZ());
        c188727au2.LJIIIZ("previous_page", "account_profile_page");
        FMX.LJIIL("scm_description_pop", c188727au2.LIZ);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(context.getString(R.string.qaf));
        c26227ARb.LJIIIZ = new C244659iv(context, R.raw.icon_info_circle_fill, Integer.valueOf(R.attr.go), 8, 0);
        c26227ARb.LIZIZ(context.getString(R.string.qae));
        C77123UOp.LJIILL(c26227ARb, new AqS135S0200000_4(context, this, 113));
        c26227ARb.LIZJ(C9LU.LJLIL);
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        C9AE.LIZ(this.componentView, C9AC.ALPHA, 0.0f);
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TextView textView = (TextView) view;
        T t = this.LJLILLLLZI;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        textView.setText(str);
        if (this.LJLJJL) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("country_code", C85990Xow.LIZ());
            c188727au.LJIIIZ("page_name", "user_profile_scm");
            FMX.LJIIL("scm_page_view", c188727au.LIZ);
            this.LJLJJL = false;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = C7MY.LIZIZ(4);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2));
        tuxTextView.setTuxFont(62);
        tuxTextView.setLayoutParams(layoutParams);
        return tuxTextView;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLILLLLZI = (T) C237429Tm.LIZ(jsonObject.toString(), AccountInfoData.class);
    }
}
