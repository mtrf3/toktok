package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business;

import X.C16880lQ;
import X.C17J;
import X.C188727au;
import X.C26335AVf;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C76800UCe;
import X.C76W;
import X.C9IL;
import X.C9PM;
import X.FMX;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioEmailData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioBusinessEmailComponent extends BioBusinessBaseUIComponent {
    public BioEmailData LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final InterfaceC65784Pro<C76800UCe> A3() {
        return new AqS154S0100000_4(this, 937);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String C3() {
        String lowerCase = "HAS_EMAIL".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C9PM state;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        User hv0;
        String str6;
        C9PM state2;
        Aweme aweme2;
        BioEmailData bioEmailData = this.LJLJJI;
        String str7 = "";
        if (bioEmailData == null || (str = bioEmailData.getBioEmail()) == null) {
            str = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mailto:");
        LIZ.append(str);
        Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(X1D.LIZIZ(LIZ)));
        try {
            Context context = getContext();
            if (context != null) {
                C16880lQ.LIZJ(context, intent);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        IBioBAAbility iBioBAAbility = (IBioBAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IBioBAAbility.class, null);
        if (iBioBAAbility != null) {
            ProfileCommonInfo commonInfo = getCommonInfo();
            ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
            if (profilePlatformVM == null || (state2 = profilePlatformVM.getState()) == null || (aweme2 = state2.LJLJLLL) == null || (str6 = aweme2.getAid()) == null) {
                str6 = "";
            }
            iBioBAAbility.vg(commonInfo, "email", str6);
        }
        ProfilePlatformViewModel x3 = x3();
        if (x3 == null || (hv0 = x3.hv0()) == null || (str2 = hv0.getUid()) == null) {
            str2 = "";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        BioEmailData bioEmailData2 = this.LJLJJI;
        if (bioEmailData2 == null || (str3 = bioEmailData2.getBioEmail()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("email", str3);
        ProfileCommonInfo commonInfo2 = getCommonInfo();
        if (commonInfo2 == null || (userProfileInfo2 = commonInfo2.getUserProfileInfo()) == null || (str4 = userProfileInfo2.getUid()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("to_user_id", str4);
        c188727au.LJIIIZ("user_id", str2);
        FMX.LJIIL("ttelite_BA_email_button_clicked", c188727au.LIZ);
        String enterFrom = getEnterFrom();
        ProfileCommonInfo commonInfo3 = getCommonInfo();
        if (commonInfo3 == null || (userProfileInfo = commonInfo3.getUserProfileInfo()) == null || (str5 = userProfileInfo.getUid()) == null) {
            str5 = "";
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null && (state = profilePlatformVM2.getState()) != null && (aweme = state.LJLJLLL) != null && (aid = aweme.getAid()) != null) {
            str7 = aid;
        }
        C26335AVf.LJIIL(enterFrom, str5, str7, "email");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer E3() {
        return Integer.valueOf(R.raw.icon_envelope);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String F3() {
        return C44384HbQ.LJJZ(R.string.g1q);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        User hv0;
        User hv02;
        super.updateComponentUIAndData();
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_EMAIL".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, true);
        getContext();
        String enterFrom = getEnterFrom();
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        String str2 = null;
        if (profilePlatformVM != null && (hv02 = profilePlatformVM.hv0()) != null) {
            str = hv02.getUid();
        } else {
            str = null;
        }
        C76W c76w = new C76W();
        c76w.LIZ("link_type", "download_link");
        FMX.LJIIJ("show_link", enterFrom, str, CardStruct.IStatusCode.DEFAULT, c76w.LIZIZ());
        C188727au c188727au = new C188727au();
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null && (hv0 = profilePlatformVM2.hv0()) != null) {
            str2 = hv0.getUid();
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        c188727au.LJIIIZ("link_type", "email");
        FMX.LJIIL("show_link", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJI = (BioEmailData) C75792yF.LIZ(jsonObject.toString(), BioEmailData.class);
    }
}
