package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user;

import X.ActivityC45651qj;
import X.C188727au;
import X.C212428Vi;
import X.C32151Nz;
import X.C44384HbQ;
import X.C4LD;
import X.C7MY;
import X.C9AC;
import X.C9AE;
import X.FMX;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AccountQRCodeComponent extends AccountUserInfoBaseUIComponent<BizBaseData> {
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
    public final void componentClick() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            shareService.LJFF(LIZ, null, null, null);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("enter_method", "personal_homepage_icon");
        FMX.LJIIL("enter_qr_code_page", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("enter_from", "personal_homepage");
        c188727au2.LJIIIZ("action_type", "click");
        FMX.LJIIL("qr_code_icon", c188727au2.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        Icon icon;
        Integer iconInt$default;
        Context context = getContext();
        TuxIconView tuxIconView = null;
        if (context != null) {
            TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(16), C7MY.LIZIZ(16));
            layoutParams.gravity = 17;
            layoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            tuxIconView2.setLayoutParams(layoutParams);
            T t = this.LJLILLLLZI;
            int i = R.raw.icon_qr_code;
            if (t != 0 && (icon = t.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, Integer.valueOf(R.raw.icon_qr_code), 1, null)) != null) {
                i = iconInt$default.intValue();
            }
            tuxIconView2.setIconRes(i);
            tuxIconView2.setTintColorRes(R.attr.gv);
            tuxIconView = tuxIconView2;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        c188727au.LJIIIZ("action_type", "show");
        FMX.LJIIL("qr_code_icon", c188727au.LIZ);
        if (tuxIconView != null) {
            tuxIconView.setContentDescription(C44384HbQ.LJJZ(R.string.aot));
        }
        C9AE.LIZ(tuxIconView, C9AC.ALPHA, 0.0f);
        return tuxIconView;
    }
}
