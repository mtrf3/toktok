package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user;

import X.AJ9;
import X.C32151Nz;
import X.C55096Ljo;
import X.C7MY;
import X.C9AC;
import X.C9AE;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.ability.IUserNameAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountVerifyComponent extends AccountUserInfoBaseUIComponent<BizBaseData> {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent, com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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
    public final void updateComponentUIAndData() {
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.icon.TuxIconView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view;
        Float f = null;
        IUserNameAbility iUserNameAbility = (IUserNameAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IUserNameAbility.class, null);
        if (iUserNameAbility != null) {
            f = Float.valueOf(iUserNameAbility.lO());
        }
        appCompatImageView.setImageResource(AJ9.LIZ(getContext(), f));
        C9AE.LIZ(appCompatImageView, C9AC.ALPHA, 0.0f);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Context context = getContext();
        if (context != null) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(12), C7MY.LIZIZ(12));
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxIconView.setLayoutParams(layoutParams);
            return tuxIconView;
        }
        return null;
    }
}
