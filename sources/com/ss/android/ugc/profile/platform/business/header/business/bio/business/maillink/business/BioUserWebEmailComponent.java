package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business;

import X.C119244m8;
import X.C16880lQ;
import X.C17J;
import X.C26335AVf;
import X.C36922EeM;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C9IL;
import X.C9PM;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioEmailData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioUserWebEmailComponent extends BioUserWebUIComponent {
    public BioEmailData LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final int C3() {
        return R.raw.icon_envelope;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
        String str;
        User user;
        BioEmailData bioEmailData = this.LJLJJL;
        if (bioEmailData == null || (str = bioEmailData.getBioEmail()) == null) {
            str = "";
        }
        String LJFF = i0.LJFF("mailto:", str);
        if (LJFF != null && !TextUtils.isEmpty(LJFF)) {
            Intent intent = new Intent("android.intent.action.SENDTO", UriProtector.parse(LJFF));
            try {
                Context context = getContext();
                if (context != null) {
                    C16880lQ.LIZJ(context, intent);
                }
            } catch (Exception e) {
                C36922EeM.LIZLLL(2, "ProfileEnterpriseAssem", e.getMessage());
            }
        }
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            user = x3.hv0();
        } else {
            user = null;
        }
        C26335AVf.LIZ(user, "email");
        C17J.LJJJ(this, L7(), "email");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final String E3() {
        return C44384HbQ.LJJZ(R.string.fka);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        C9PM state;
        String str;
        String bioEmail;
        UserProfileInfo userProfileInfo;
        super.actionsAfterUpdateUI();
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            x3.sv0(new AqS170S0100000_4(this, 826));
        }
        ProfilePlatformViewModel x32 = x3();
        if (x32 != null) {
            x32.rv0(new AqS170S0100000_4(this, 827));
        }
        ProfilePlatformViewModel x33 = x3();
        if (x33 != null && (state = x33.getState()) != null && state.LJLJJL && !this.LJLJJLL) {
            this.LJLJJLL = true;
            IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IBioUserMailLinkAbility.class, null);
            if (iBioUserMailLinkAbility != null) {
                String enterFrom = getEnterFrom();
                ProfileCommonInfo commonInfo = getCommonInfo();
                String str2 = "";
                if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
                    str = "";
                }
                BioEmailData bioEmailData = this.LJLJJL;
                if (bioEmailData != null && (bioEmail = bioEmailData.getBioEmail()) != null) {
                    str2 = bioEmail;
                }
                iBioUserMailLinkAbility.qg(enterFrom, "email", str, str2);
            }
        }
        ProfilePlatformViewModel x34 = x3();
        if (x34 != null) {
            x34.ov0(new AqS170S0100000_4(this, 828));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        super.generateComponentView();
        C119244m8 c119244m8 = this.LJLJJI;
        if (c119244m8 != null) {
            c119244m8.setCompoundDrawablePadding((int) C44384HbQ.LJJJLL(4));
        }
        return this.LJLJJI;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        super.updateComponentUIAndData();
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_EMAIL".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, C44384HbQ.LLFF(this.LJLJJI));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJL = (BioEmailData) C75792yF.LIZ(jsonObject.toString(), BioEmailData.class);
    }
}
