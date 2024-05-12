package com.ss.android.ugc.aweme.profile.widgets.cta.features;

import X.ActivityC45651qj;
import X.C17J;
import X.C212428Vi;
import X.C26335AVf;
import X.C4LD;
import X.C9H4;
import X.C9H6;
import X.C9H8;
import X.C9HL;
import X.C9IF;
import X.C9IL;
import X.EnumC234329Ho;
import X.HG3;
import X.L12;
import X.RBX;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent;
import com.ss.android.ugc.aweme.share.ShareService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileCTAShareProfileComponent extends ProfileCTASingleComponent {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    public final String L3() {
        C9HL A3 = A3();
        if (A3 != null) {
            int i = C9H8.LIZ[A3.ordinal()];
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final void componentClick() {
        String L3;
        String str;
        if (C9H6.LIZ() != 3 && !L12.LIZLLL()) {
            L3 = "";
        } else {
            L3 = L3();
        }
        C9H4.LIZIZ("click", L3);
        if ((C9H6.LIZ() == 3 || L12.LIZLLL()) && A3() == C9HL.TEXT) {
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

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final String componentText() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            return LIZLLL.getString(R.string.bbk);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (!C9H6.LIZJ() && !L12.LIZLLL()) {
            return;
        }
        C9IL c9il = C9IL.CTA;
        String lowerCase = "HAS_QR_CODE_ENTRANCE".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, true);
        F3(new AqS154S0100000_4(this, 729));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final EnumC234329Ho v3() {
        return EnumC234329Ho.ICON;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTASingleComponent
    public final C9IF x3() {
        return C9IF.SHARE_PROFILE;
    }
}
