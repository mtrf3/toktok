package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account;

import X.AnonymousClass391;
import X.C119244m8;
import X.C2068389v;
import X.C237429Tm;
import X.C26338AVi;
import X.C31461Li;
import X.C32151Nz;
import X.C35936E8m;
import X.C42625Go9;
import X.C6ZT;
import X.C79045V0n;
import X.C7MY;
import X.C9N6;
import X.C9NB;
import X.C9NC;
import X.C9NE;
import X.FMX;
import X.HG3;
import X.O6R;
import X.QD3;
import X.RBX;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.BABizData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes5.dex */
public final class AccountRBAIdentifierComponent extends AccountInfoBaseUIComponent<BABizData> {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        Describe describe;
        if (C6ZT.LIZ(this.componentView)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), C31461Li.LIZJ("profile_rba_info_schema", "", "getInstance().getStringV…hemaSettings::class.java)"));
        T t = this.LJLILLLLZI;
        String str7 = null;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        buildRoute.withParam("company_name", str);
        BABizData bABizData = (BABizData) this.LJLILLLLZI;
        if (bABizData != null) {
            str2 = bABizData.getCategory();
        } else {
            str2 = null;
        }
        buildRoute.withParam("category", str2);
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo != null && (userProfileInfo2 = commonInfo.getUserProfileInfo()) != null) {
            str3 = userProfileInfo2.getUid();
        } else {
            str3 = null;
        }
        IAccountUserService LJIILL = HG3.LJIILL();
        if (LJIILL != null) {
            str4 = ((RBX) LJIILL).getCurUserId();
        } else {
            str4 = null;
        }
        String str8 = "self";
        if (o.LJ(str3, str4)) {
            str5 = "self";
        } else {
            str5 = "other";
        }
        buildRoute.withParam("type", str5);
        buildRoute.open();
        C35936E8m c35936E8m = new C35936E8m();
        ProfileCommonInfo commonInfo2 = getCommonInfo();
        if (commonInfo2 != null && (userProfileInfo = commonInfo2.getUserProfileInfo()) != null) {
            str6 = userProfileInfo.getUid();
        } else {
            str6 = null;
        }
        IAccountUserService LJIILL2 = HG3.LJIILL();
        if (LJIILL2 != null) {
            str7 = ((RBX) LJIILL2).getCurUserId();
        }
        if (!o.LJ(str6, str7)) {
            str8 = "other";
        }
        c35936E8m.LIZLLL("type", str8);
        FMX.LJIIL("ttelite_profile_click_RBA_info", c35936E8m.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        C119244m8 c119244m8 = new C119244m8(context, null, 6);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Context context2 = c119244m8.getContext();
        o.LJIIIIZZ(context2, "context");
        C26338AVi.LJII(layoutParams, context2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40))), AnonymousClass391.LIZJ(4), AnonymousClass391.LIZJ(40), 0, 32);
        c119244m8.setLayoutParams(layoutParams);
        c119244m8.setGravity(49);
        c119244m8.setMaxLines(1);
        c119244m8.setEllipsize(TextUtils.TruncateAt.END);
        Integer LJI = C79045V0n.LJI(R.attr.gv, context);
        if (LJI != null) {
            c119244m8.setTextColor(LJI.intValue());
        }
        c119244m8.setTuxFont(61);
        c119244m8.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        return c119244m8;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        if (C9N6.LIZ()) {
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            v3((TuxTextView) view);
            return;
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TextView textView = (TextView) view2;
        T t = this.LJLILLLLZI;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToBusinessAccount(C9NE event) {
        String str;
        Describe describe;
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(0);
        if (C9N6.LIZ()) {
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            v3((TuxTextView) view);
            return;
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TextView textView = (TextView) view2;
        T t = this.LJLILLLLZI;
        if (t != 0 && (describe = t.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        textView.setText(str);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToCreatorAccount(C9NB event) {
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(8);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchToPersonalAccount(C9NC event) {
        o.LJIIIZ(event, "event");
        getContainerView().setVisibility(8);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLILLLLZI = (T) C237429Tm.LIZ(jsonObject.toString(), BABizData.class);
    }

    public final void v3(TuxTextView tuxTextView) {
        Describe describe;
        String text;
        T t = this.LJLILLLLZI;
        if (t == 0 || (describe = t.getDescribe()) == null || (text = describe.getText()) == null || text.length() == 0) {
            tuxTextView.setVisibility(8);
            return;
        }
        C119244m8 c119244m8 = (C119244m8) tuxTextView;
        c119244m8.setText(text);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_store;
        c2068389v.LJ = Integer.valueOf(R.attr.gv);
        c2068389v.LIZIZ = C7MY.LIZIZ(12);
        c2068389v.LIZJ = C7MY.LIZIZ(12);
        c119244m8.setStartIcon(c2068389v);
        c119244m8.setVisibility(0);
    }
}
