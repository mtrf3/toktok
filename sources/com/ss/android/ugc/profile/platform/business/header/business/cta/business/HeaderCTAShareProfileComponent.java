package com.ss.android.ugc.profile.platform.business.header.business.cta.business;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C26335AVf;
import X.C4LD;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C9H4;
import X.C9H5;
import X.C9H6;
import X.C9HK;
import X.C9IL;
import X.HG3;
import X.L12;
import X.RBX;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HeaderCTAShareProfileComponent extends HeaderCTABaseUIComponent {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        String v3;
        requestShow();
        if (C9H6.LIZ() == 3 || L12.LIZLLL()) {
            v3 = v3();
        } else {
            v3 = null;
        }
        C9H4.LIZIZ("show", v3);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            C9IL c9il = C9IL.CTA;
            String lowerCase = "HAS_QR_CODE_ENTRANCE".toLowerCase();
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
            iProfileBaseAbility.y6(true, c9il, lowerCase, true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String v3;
        String str;
        if (C9H6.LIZ() == 3 || L12.LIZLLL()) {
            v3 = v3();
        } else {
            v3 = null;
        }
        C9H4.LIZIZ("click", v3);
        if ((C9H6.LIZ() == 3 || L12.LIZLLL()) && getComponentCurStyle() == C9HK.TEXT) {
            str = "personal_homepage_button";
        } else {
            str = "personal_homepage_icon";
        }
        C9H4.LIZ(str);
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        C26335AVf.LJIIL("personal_homepage", curUserId, "", "share_profile");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            shareService.LJFF(LIZ, null, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String componentText() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL.getString(R.string.bbk);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        super.updateComponentUIAndData();
        String LJFF = C65352Pkq.LIZ(Button.class).LJFF();
        if (LJFF != null) {
            updateRoleDescription(LJFF);
        }
    }

    public final String v3() {
        C9HK componentCurStyle = getComponentCurStyle();
        if (componentCurStyle != null) {
            int i = C9H5.LIZ[componentCurStyle.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "more_panel";
                    }
                } else {
                    return "icon";
                }
            } else {
                return "button";
            }
        }
        return "";
    }
}
