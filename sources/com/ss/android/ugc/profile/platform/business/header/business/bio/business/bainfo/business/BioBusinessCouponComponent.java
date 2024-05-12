package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.business;

import X.C17J;
import X.C237559Tz;
import X.C26335AVf;
import X.C44384HbQ;
import X.C75792yF;
import X.C9IL;
import X.C9PM;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioCouponData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioBusinessCouponComponent extends BioBusinessBaseUIComponent {
    public BioCouponData LJLJJI;
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
    public final String C3() {
        String lowerCase = "HAS_BA_COUPON".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        List<CouponInfo> couponList;
        CouponInfo couponInfo;
        String str;
        User user;
        Aweme aweme;
        CouponInfo couponInfo2;
        Aweme aweme2;
        C9PM state;
        List<CouponInfo> couponList2;
        C9PM state2;
        C9PM state3;
        Aweme aweme3;
        String aid;
        UserProfileInfo userProfileInfo;
        BioCouponData bioCouponData = this.LJLJJI;
        if (bioCouponData == null || (couponList = bioCouponData.getCouponList()) == null || (couponInfo = (CouponInfo) ListProtector.get(couponList, 0)) == null) {
            return;
        }
        String enterFrom = getEnterFrom();
        ProfileCommonInfo commonInfo = getCommonInfo();
        String str2 = "";
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
            str = "";
        }
        ProfilePlatformViewModel x3 = x3();
        User user2 = null;
        if (x3 != null && (state3 = x3.getState()) != null && (aweme3 = state3.LJLJLLL) != null && (aid = aweme3.getAid()) != null) {
            str2 = aid;
        }
        C26335AVf.LJIIL(enterFrom, str, str2, "ba_coupon");
        C237559Tz c237559Tz = new C237559Tz();
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            user = profilePlatformVM.hv0();
        } else {
            user = null;
        }
        ProfilePlatformViewModel x32 = x3();
        if (x32 != null && (state2 = x32.getState()) != null) {
            aweme = state2.LJLJLLL;
        } else {
            aweme = null;
        }
        BioCouponData bioCouponData2 = this.LJLJJI;
        if (bioCouponData2 == null || (couponList2 = bioCouponData2.getCouponList()) == null || (couponInfo2 = (CouponInfo) ListProtector.get(couponList2, 0)) == null) {
            couponInfo2 = new CouponInfo();
        }
        c237559Tz.LJIILJJIL(user, aweme, couponInfo2);
        IBAProfilePageService LJIIJJI = BAProfilePageServiceImpl.LJIIJJI();
        Context context = getContext();
        ProfilePlatformViewModel x33 = x3();
        if (x33 != null && (state = x33.getState()) != null) {
            aweme2 = state.LJLJLLL;
        } else {
            aweme2 = null;
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null) {
            user2 = profilePlatformVM2.hv0();
        }
        LJIIJJI.LJIIIIZZ(context, aweme2, user2, couponInfo);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final Integer E3() {
        return Integer.valueOf(R.raw.icon_coupon);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent
    public final String F3() {
        return C44384HbQ.LJJZ(R.string.c32);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioBusinessBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        User hv0;
        BizAccountInfo bizAccountInfo;
        List<CouponInfo> couponList;
        super.updateComponentUIAndData();
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_BA_COUPON".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, true);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM == null || (hv0 = profilePlatformVM.hv0()) == null || (bizAccountInfo = hv0.getBizAccountInfo()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        BioCouponData bioCouponData = this.LJLJJI;
        if (bioCouponData != null && (couponList = bioCouponData.getCouponList()) != null) {
            Iterator<CouponInfo> it = couponList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        bizAccountInfo.setCouponInfo(arrayList);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJI = (BioCouponData) C75792yF.LIZ(jsonObject.toString(), BioCouponData.class);
    }
}
