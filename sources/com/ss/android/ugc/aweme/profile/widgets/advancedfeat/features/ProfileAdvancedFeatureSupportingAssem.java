package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import X.ActivityC45651qj;
import X.C0DC;
import X.C188727au;
import X.C212428Vi;
import X.C234999Kd;
import X.C65352Pkq;
import X.C8VC;
import X.C9GK;
import X.C9JT;
import X.C9KV;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.TBT;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.donation.IDonationService;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features.ProfileAdvancedFeatureSupportingAssem;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureSupportingAssem extends ProfileSingleFeatureAssem {
    public TuxSheet LJLJJLL;
    public Map<String, String> LJLJL;
    public ProfileNgoStruct LJLJLJ;

    public ProfileAdvancedFeatureSupportingAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final Map<String, Boolean> F3() {
        String lowerCase = "HAS_SUPPORTING".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJL));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final View I3() {
        return v3(R.string.iuu, R.raw.icon_heart_grid, new View.OnClickListener() { // from class: X.9Ji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    public final void O3() {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        FragmentManager supportFragmentManager;
        User user;
        Bundle bundle = new Bundle();
        if (K3()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", "tiltify");
        bundle.putBoolean("should_dim_bg", true);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        IDonationService LJI = DonationServiceImpl.LJI();
        ProfileNgoStruct profileNgoStruct = this.LJLJLJ;
        if (profileNgoStruct != null) {
            i = profileNgoStruct.getId();
        } else {
            i = 0;
        }
        ProfileNgoStruct profileNgoStruct2 = this.LJLJLJ;
        if (profileNgoStruct2 == null || (str2 = profileNgoStruct2.getOrgId()) == null) {
            str2 = "";
        }
        ProfileNgoStruct profileNgoStruct3 = this.LJLJLJ;
        if (profileNgoStruct3 == null || (str3 = profileNgoStruct3.getOrgType()) == null) {
            str3 = "";
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        if (c234999Kd == null || (user = c234999Kd.LIZ) == null || (str4 = user.getSecUid()) == null) {
            str4 = "";
        }
        this.LJLJJLL = LJI.LJFF(i, bundle, str2, str3, str4);
        if (LIZ != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null) {
            TuxSheet tuxSheet = this.LJLJJLL;
            o.LJI(tuxSheet);
            tuxSheet.show(supportFragmentManager, "DonationFragment");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9JR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 664));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9JS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 665));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9GK.class), new TBT() { // from class: X.9Iz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C99Z) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, 666));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Jd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIZILJ;
            }
        }, new AqS170S0100000_4(this, 667));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Je
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PL) obj).LIZLLL;
            }
        }, new AqS170S0100000_4(this, 663));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final C9JT x3() {
        return C9JT.Supporting;
    }

    public final void N3(final ProfileNgoStruct profileNgoStruct) {
        boolean z;
        final User user;
        String str;
        String str2;
        String str3;
        String name;
        String uid;
        if (e1.LIZ(31744, "enable_profile_support_cause", true, false) || K3()) {
            z = true;
        } else {
            z = false;
        }
        C234999Kd c234999Kd = (C234999Kd) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(InterfaceC235069Kk.class));
        String str4 = null;
        if (c234999Kd != null) {
            user = c234999Kd.LIZ;
        } else {
            user = null;
        }
        C188727au c188727au = new C188727au();
        if (K3()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str);
        String str5 = "";
        if (profileNgoStruct == null || (str2 = profileNgoStruct.getDonationLink()) == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("link", str2);
        if (user != null && (uid = user.getUid()) != null) {
            str5 = uid;
        }
        c188727au.LJIIIZ("author_id", str5);
        c188727au.LJIIIZ("link_type", "nonprofit");
        if (profileNgoStruct != null) {
            str3 = profileNgoStruct.getOrgType();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("powered_by", str3);
        if (profileNgoStruct != null) {
            str4 = profileNgoStruct.getName();
        }
        c188727au.LJIIIZ("ngo_name", str4);
        final Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …e)\n            .builder()");
        if (profileNgoStruct != null && (name = profileNgoStruct.getName()) != null && name.length() > 0) {
            this.LJLJL = map;
        }
        if (user != null && z && profileNgoStruct != null && Integer.valueOf(profileNgoStruct.getId()) != null && !TextUtils.isEmpty(profileNgoStruct.getIconUrl()) && !TextUtils.isEmpty(profileNgoStruct.getName())) {
            L3(new View.OnClickListener() { // from class: X.9Jc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str6;
                    FragmentManager supportFragmentManager;
                    ProfileAdvancedFeatureSupportingAssem profileAdvancedFeatureSupportingAssem = ProfileAdvancedFeatureSupportingAssem.this;
                    C17J.LJJJ(profileAdvancedFeatureSupportingAssem, profileAdvancedFeatureSupportingAssem.K3(), "supporting");
                    TuxSheet tuxSheet = ProfileAdvancedFeatureSupportingAssem.this.LJLJJLL;
                    if (tuxSheet != null) {
                        tuxSheet.dismiss();
                    }
                    Bundle bundle = new Bundle();
                    if (ProfileAdvancedFeatureSupportingAssem.this.K3()) {
                        str6 = "personal_homepage";
                    } else {
                        str6 = "others_homepage";
                    }
                    bundle.putString("enter_from", str6);
                    bundle.putString("enter_method", "profile_link");
                    bundle.putBoolean("should_dim_bg", true);
                    ActivityC45651qj LIZ = C212428Vi.LIZ(ProfileAdvancedFeatureSupportingAssem.this);
                    Fragment LIZLLL = C212428Vi.LIZLLL(ProfileAdvancedFeatureSupportingAssem.this);
                    if (!ProfileAdvancedFeatureSupportingAssem.this.K3() && C234779Jh.LIZ()) {
                        if (LIZLLL != null) {
                            ProfileNgoStruct profileNgoStruct2 = profileNgoStruct;
                            User user2 = user;
                            if (LIZ != null) {
                                IDonationService LJI = DonationServiceImpl.LJI();
                                int id = profileNgoStruct2.getId();
                                String secUid = user2.getSecUid();
                                o.LJIIIIZZ(secUid, "user.secUid");
                                LJI.LIZ(id, LIZ, bundle, LIZLLL, secUid);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ProfileAdvancedFeatureSupportingAssem profileAdvancedFeatureSupportingAssem2 = ProfileAdvancedFeatureSupportingAssem.this;
                    IDonationService LJI2 = DonationServiceImpl.LJI();
                    int id2 = profileNgoStruct.getId();
                    String orgId = profileNgoStruct.getOrgId();
                    String orgType = profileNgoStruct.getOrgType();
                    String secUid2 = user.getSecUid();
                    o.LJIIIIZZ(secUid2, "user.secUid");
                    profileAdvancedFeatureSupportingAssem2.LJLJJLL = LJI2.LJFF(id2, bundle, orgId, orgType, secUid2);
                    FMX.LJIIL("click_link", map);
                    if (LIZ == null || (supportFragmentManager = LIZ.getSupportFragmentManager()) == null) {
                        return;
                    }
                    TuxSheet tuxSheet2 = ProfileAdvancedFeatureSupportingAssem.this.LJLJJLL;
                    o.LJI(tuxSheet2);
                    tuxSheet2.show(supportFragmentManager, "DonationFragment");
                }
            });
            String string = E3().getResources().getString(R.string.iuu, profileNgoStruct.getName());
            o.LJIIIIZZ(string, "notNullContext.resources… supportedNonprofit.name)");
            M3(string);
            requestShow();
            return;
        }
        requestHide();
    }
}
