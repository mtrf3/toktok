package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business;

import X.ActivityC45651qj;
import X.C237559Tz;
import X.C245319jz;
import X.C252659vp;
import X.C26335AVf;
import X.C44384HbQ;
import X.C45804HyK;
import X.C75792yF;
import X.C76800UCe;
import X.C9PM;
import X.InterfaceC88472Yns;
import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioAddressData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioBusinessAddressComponent extends BioBusinessBaseUIComponent {
    public BioAddressData LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final String LJLJJI = "com.google.android.apps.maps";

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String C3() {
        String lowerCase = "HAS_BA_BUSINESS_ADDRESS".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer E3() {
        return Integer.valueOf(R.raw.icon_map_pin);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String F3() {
        return C44384HbQ.LJJZ(R.string.c30);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        User user;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        C9PM state;
        C9PM state2;
        Aweme aweme;
        String aid;
        UserProfileInfo userProfileInfo;
        String enterFrom = getEnterFrom();
        ProfileCommonInfo commonInfo = getCommonInfo();
        String str2 = "";
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
            str = "";
        }
        ProfilePlatformViewModel x3 = x3();
        Aweme aweme2 = null;
        if (x3 != null && (state2 = x3.getState()) != null && (aweme = state2.LJLJLLL) != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        C26335AVf.LJIIL(enterFrom, str, str2, "ba_business_address");
        C237559Tz c237559Tz = new C237559Tz();
        ProfilePlatformViewModel x32 = x3();
        if (x32 != null) {
            user = x32.hv0();
        } else {
            user = null;
        }
        ProfilePlatformViewModel x33 = x3();
        if (x33 != null && (state = x33.getState()) != null) {
            aweme2 = state.LJLJLLL;
        }
        c237559Tz.LJIIL(aweme2, user);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJI(R.string.tiy);
        C252659vp c252659vp = new C252659vp();
        c252659vp.LIZ(R.string.tiz);
        c252659vp.LIZJ(R.raw.icon_arrow_up_right_ltr);
        c252659vp.LJ = new ACListenerS21S0100000_1(new AqS170S0100000_4(this, 894), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        c245319jz.LIZ(c252659vp);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        Context context = getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            LIZJ.show(supportFragmentManager, "BAOpenMapsSheet");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        User hv0;
        BizAccountInfo bizAccountInfo;
        BizContactInfo bizContactInfo;
        String str;
        String str2;
        String str3;
        super.updateComponentUIAndData();
        ProfilePlatformViewModel x3 = x3();
        String str4 = null;
        if (x3 == null || (hv0 = x3.hv0()) == null || (bizAccountInfo = hv0.getBizAccountInfo()) == null || (bizContactInfo = bizAccountInfo.getBizContactInfo()) == null) {
            return;
        }
        BizAddress bizAddress = new BizAddress();
        BioAddressData bioAddressData = this.LJLJJL;
        if (bioAddressData != null) {
            str = bioAddressData.getLatitude();
        } else {
            str = null;
        }
        bizAddress.setLatitude(str);
        BioAddressData bioAddressData2 = this.LJLJJL;
        if (bioAddressData2 != null) {
            str2 = bioAddressData2.getLongitude();
        } else {
            str2 = null;
        }
        bizAddress.setLongitude(str2);
        BioAddressData bioAddressData3 = this.LJLJJL;
        if (bioAddressData3 != null) {
            str3 = bioAddressData3.getFormattedAddressText();
        } else {
            str3 = null;
        }
        bizAddress.setFormattedAddressText(str3);
        BioAddressData bioAddressData4 = this.LJLJJL;
        if (bioAddressData4 != null) {
            str4 = bioAddressData4.getSimplifiedAddressText();
        }
        bizAddress.setSimplifiedAddressText(str4);
        bizContactInfo.setBizAddress(bizAddress);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJL = (BioAddressData) C75792yF.LIZ(jsonObject.toString(), BioAddressData.class);
    }
}
