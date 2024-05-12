package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account;

import X.C16880lQ;
import X.C188727au;
import X.C2068389v;
import X.C237429Tm;
import X.C32151Nz;
import X.C7MY;
import X.C8YN;
import X.C9AC;
import X.C9AE;
import X.F67;
import X.FMX;
import X.O6R;
import X.TBT;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS40S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data.AccountInfoData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AccountAGSWarningComponent extends AccountInfoBaseUIComponent<AccountInfoData> implements F67 {
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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
    public final View generateComponentView() {
        TuxIconView tuxIconView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(13)));
        layoutParams2.topMargin = C7MY.LIZIZ(1);
        Context context = getContext();
        TuxTextView tuxTextView = null;
        if (context != null) {
            tuxIconView = new TuxIconView(context, null, 0, 6, null);
        } else {
            tuxIconView = null;
        }
        if (tuxIconView != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LJ = Integer.valueOf(R.attr.e7);
            c2068389v.LIZ = R.raw.icon_exclamation_mark_circle_fill;
            tuxIconView.setTuxIcon(c2068389v);
            tuxIconView.setLayoutParams(layoutParams2);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 1;
        layoutParams3.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        Context context2 = getContext();
        if (context2 != null) {
            TuxTextView tuxTextView2 = new TuxTextView(context2, null, 6, 0);
            tuxTextView = tuxTextView2;
            tuxTextView2.setMaxLines(1);
            tuxTextView2.setTuxFont(62);
            tuxTextView2.setTextColorRes(R.attr.e7);
            tuxTextView2.setId(R.id.i6p);
            tuxTextView2.setLayoutParams(layoutParams3);
        }
        linearLayout.addView(tuxIconView);
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    @Override // X.F67
    public final void onChanged() {
        View view = this.componentView;
        if (view != null) {
            view.post(new ARunnableS40S0100000_4(this, 84));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        Describe describe;
        View view = this.componentView;
        if (view != null) {
            view.setVisibility(8);
        }
        this.LJLJJL = false;
        if (this.LJLJI && this.LJLILLLLZI != 0) {
            View view2 = this.componentView;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            this.LJLJJL = true;
            View view3 = this.componentView;
            if (view3 != null) {
                C9AE.LIZ(view3, C9AC.ALPHA, 0.0f);
                TextView textView = (TextView) view3.findViewById(R.id.i6p);
                if (textView != null) {
                    T t = this.LJLILLLLZI;
                    if (t != 0 && (describe = t.getDescribe()) != null) {
                        str = describe.getText();
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
                C16880lQ.LJIIJ(new ACListenerS39S0200000_4(view3, this, 91), view3);
            }
        }
        v3(this.componentView);
    }

    public final boolean x3() {
        if (this.LJLJI && a.LJ().LIZLLL()) {
            return true;
        }
        return false;
    }

    public final void A3() {
        Integer num;
        AgsWarningInfo LJI = a.LJ().LJI();
        C188727au c188727au = new C188727au();
        if (LJI != null) {
            num = Integer.valueOf(LJI.getWarningLevel());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "warning_level");
        FMX.LJIIL("tns_profile_page_ags_warning_tag_show", c188727au.LIZ);
        this.LJLJL = true;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        SettingsManager.LIZLLL().LJIIIZ(this);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9IR
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLILLLLZI;
                }
            }, null, new AqS186S0100000_4(this, 229), 6);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        SettingsManager.LIZLLL().LJIIJ(this);
        super.onDestroy();
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJL = false;
        this.LJLJLJ = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        if (this.LJLJJLL && !this.LJLJL && x3()) {
            A3();
        } else {
            if (!this.LJLJJLL || !this.LJLJJL || this.LJLJLJ) {
                return;
            }
            FMX.onEventV3("tns_profile_page_ags_warning_tag_show");
            this.LJLJLJ = true;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLILLLLZI = (T) C237429Tm.LIZ(jsonObject.toString(), AccountInfoData.class);
    }

    public final void v3(View view) {
        String str;
        if (this.LJLJJL) {
            return;
        }
        if (x3()) {
            if (view != null) {
                view.setVisibility(0);
            }
            AgsWarningInfo LJI = a.LJ().LJI();
            if (view != null) {
                TextView textView = (TextView) view.findViewById(R.id.i6p);
                C9AE.LIZ(view, C9AC.ALPHA, 0.0f);
                if (LJI != null) {
                    str = LJI.getWarningTitle();
                } else {
                    str = null;
                }
                textView.setText(str);
                C16880lQ.LJIIJ(new ACListenerS39S0200000_4(LJI, view, 33), view);
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }
}
