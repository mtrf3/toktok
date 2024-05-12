package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business;

import X.ActivityC45651qj;
import X.C0DC;
import X.C188727au;
import X.C212428Vi;
import X.C234779Jh;
import X.C237429Tm;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C8YN;
import X.FMX;
import X.TBT;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.m;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.business.data.SupportingData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureSupportingComponent extends HeaderAdvancedFeatureBaseUIComponent {
    public TuxSheet LJLJLJ;
    public Map<String, String> LJLJLLL;
    public SupportingData LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        C8YN.LJII(this, v3(), new TBT() { // from class: X.9HX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2304292o) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 224), 6);
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            C8YN.LJII(this, profilePlatformVM, new TBT() { // from class: X.9Jf
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PM) obj).LJLJI;
                }
            }, null, new AqS186S0100000_4(this, 225), 6);
        }
        ProfilePlatformViewModel profilePlatformVM2 = getProfilePlatformVM();
        if (profilePlatformVM2 != null) {
            profilePlatformVM2.qv0(new AqS170S0100000_4(this, 823));
        }
    }

    public final void K3() {
        int i;
        String str;
        String str2;
        String str3;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        UserProfileInfo userProfileInfo;
        ProfileNgoStruct supportedNonprofit;
        ProfileNgoStruct supportedNonprofit2;
        ProfileNgoStruct supportedNonprofit3;
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", getEnterFrom());
        bundle.putString("enter_method", "tiltify");
        bundle.putBoolean("should_dim_bg", true);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        IDonationService LJI = DonationServiceImpl.LJI();
        SupportingData supportingData = this.LJLL;
        if (supportingData != null && (supportedNonprofit3 = supportingData.getSupportedNonprofit()) != null) {
            i = supportedNonprofit3.getId();
        } else {
            i = 0;
        }
        SupportingData supportingData2 = this.LJLL;
        if (supportingData2 == null || (supportedNonprofit2 = supportingData2.getSupportedNonprofit()) == null || (str = supportedNonprofit2.getOrgId()) == null) {
            str = "";
        }
        SupportingData supportingData3 = this.LJLL;
        if (supportingData3 == null || (supportedNonprofit = supportingData3.getSupportedNonprofit()) == null || (str2 = supportedNonprofit.getOrgType()) == null) {
            str2 = "";
        }
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str3 = userProfileInfo.getSecUid()) == null) {
            str3 = "";
        }
        this.LJLJLJ = LJI.LJFF(i, bundle, str, str2, str3);
        if (LIZ != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null && (tuxSheet = this.LJLJLJ) != null) {
            tuxSheet.show(supportFragmentManager, "DonationFragment");
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Map<String, Boolean> x3() {
        String lowerCase = "HAS_SUPPORTING".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        String str2;
        String str3;
        FragmentManager supportFragmentManager;
        TuxSheet tuxSheet;
        UserProfileInfo userProfileInfo;
        ProfileNgoStruct supportedNonprofit;
        ProfileNgoStruct supportedNonprofit2;
        ProfileNgoStruct supportedNonprofit3;
        UserProfileInfo userProfileInfo2;
        String secUid;
        ProfileNgoStruct supportedNonprofit4;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.Cu("supporting", A3());
        }
        TuxSheet tuxSheet2 = this.LJLJLJ;
        if (tuxSheet2 != null) {
            tuxSheet2.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", getEnterFrom());
        bundle.putString("enter_method", "profile_link");
        bundle.putBoolean("should_dim_bg", true);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        SupportingData supportingData = this.LJLL;
        if (supportingData == null || supportingData.getSupportedNonprofit() == null) {
            return;
        }
        String str4 = "";
        int i = 0;
        if (!A3() && C234779Jh.LIZ()) {
            if (LIZLLL == null || LIZ == null) {
                return;
            }
            IDonationService LJI = DonationServiceImpl.LJI();
            SupportingData supportingData2 = this.LJLL;
            if (supportingData2 != null && (supportedNonprofit4 = supportingData2.getSupportedNonprofit()) != null) {
                i = supportedNonprofit4.getId();
            }
            ProfileCommonInfo commonInfo = getCommonInfo();
            if (commonInfo != null && (userProfileInfo2 = commonInfo.getUserProfileInfo()) != null && (secUid = userProfileInfo2.getSecUid()) != null) {
                str4 = secUid;
            }
            LJI.LIZ(i, LIZ, bundle, LIZLLL, str4);
            return;
        }
        IDonationService LJI2 = DonationServiceImpl.LJI();
        SupportingData supportingData3 = this.LJLL;
        if (supportingData3 != null && (supportedNonprofit3 = supportingData3.getSupportedNonprofit()) != null) {
            i = supportedNonprofit3.getId();
        }
        SupportingData supportingData4 = this.LJLL;
        if (supportingData4 == null || (supportedNonprofit2 = supportingData4.getSupportedNonprofit()) == null || (str = supportedNonprofit2.getOrgId()) == null) {
            str = "";
        }
        SupportingData supportingData5 = this.LJLL;
        if (supportingData5 == null || (supportedNonprofit = supportingData5.getSupportedNonprofit()) == null || (str2 = supportedNonprofit.getOrgType()) == null) {
            str2 = "";
        }
        ProfileCommonInfo commonInfo2 = getCommonInfo();
        if (commonInfo2 == null || (userProfileInfo = commonInfo2.getUserProfileInfo()) == null || (str3 = userProfileInfo.getSecUid()) == null) {
            str3 = "";
        }
        this.LJLJLJ = LJI2.LJFF(i, bundle, str, str2, str3);
        FMX.LJIIL("click_link", this.LJLJLLL);
        if (LIZ == null || (supportFragmentManager = LIZ.getSupportFragmentManager()) == null || (tuxSheet = this.LJLJLJ) == null) {
            return;
        }
        tuxSheet.show(supportFragmentManager, "DonationFragment");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final Integer componentIcon() {
        Integer componentIcon = super.componentIcon();
        if (componentIcon == null) {
            return Integer.valueOf(R.raw.icon_heart_grid);
        }
        return componentIcon;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent
    public final String componentText() {
        String componentText = super.componentText();
        if (componentText == null) {
            return C44384HbQ.LJJZ(R.string.iuu);
        }
        return componentText;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        ProfileNgoStruct profileNgoStruct;
        String str;
        String str2;
        String str3;
        String str4;
        Resources resources;
        UserProfileInfo userProfileInfo;
        super.updateComponentUIAndData();
        SupportingData supportingData = this.LJLL;
        String str5 = null;
        if (supportingData != null) {
            profileNgoStruct = supportingData.getSupportedNonprofit();
        } else {
            profileNgoStruct = null;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", getEnterFrom());
        String str6 = "";
        if (profileNgoStruct == null || (str = profileNgoStruct.getDonationLink()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("link", str);
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str2 = userProfileInfo.getUid()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("author_id", str2);
        c188727au.LJIIIZ("link_type", "nonprofit");
        if (profileNgoStruct != null) {
            str3 = profileNgoStruct.getOrgType();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("powered_by", str3);
        if (profileNgoStruct != null) {
            str4 = profileNgoStruct.getName();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("ngo_name", str4);
        this.LJLJLLL = c188727au.LIZ;
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            Object[] objArr = new Object[1];
            if (profileNgoStruct != null) {
                str5 = profileNgoStruct.getName();
            }
            objArr[0] = str5;
            String string = resources.getString(R.string.iuu, objArr);
            if (string != null) {
                str6 = string;
            }
        }
        I3(str6);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLL = (SupportingData) C237429Tm.LIZ(jsonObject.toString(), SupportingData.class);
    }
}
