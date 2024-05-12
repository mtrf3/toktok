package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business;

import X.C119244m8;
import X.C17J;
import X.C2068389v;
import X.C26045AKb;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C75792yF;
import X.C79045V0n;
import X.C9IL;
import X.C9PM;
import X.KL2;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.data.BioLinkData;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BioUserWebSiteComponent extends BioUserWebUIComponent {
    public BioLinkData LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final int C3() {
        return R.raw.icon_exclamation_mark_circle_fill;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r0.isBioLinkReportShow() == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c5  */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void componentClick() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.business.BioUserWebSiteComponent.componentClick():void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent
    public final String E3() {
        return C44384HbQ.LJJZ(R.string.hsq);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        C9PM state;
        String str;
        String bioUrl;
        UserProfileInfo userProfileInfo;
        super.actionsAfterUpdateUI();
        ProfilePlatformViewModel x3 = x3();
        if (x3 != null) {
            x3.rv0(new AqS170S0100000_4(this, 829));
        }
        ProfilePlatformViewModel x32 = x3();
        if (x32 != null) {
            x32.sv0(new AqS170S0100000_4(this, 830));
        }
        ProfilePlatformViewModel x33 = x3();
        if (x33 != null) {
            x33.ov0(new AqS170S0100000_4(this, 831));
        }
        ProfilePlatformViewModel x34 = x3();
        if (x34 != null && (state = x34.getState()) != null && state.LJLJJL && !this.LJLJL) {
            this.LJLJL = true;
            IBioUserMailLinkAbility iBioUserMailLinkAbility = (IBioUserMailLinkAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IBioUserMailLinkAbility.class, null);
            if (iBioUserMailLinkAbility != null) {
                String enterFrom = getEnterFrom();
                ProfileCommonInfo commonInfo = getCommonInfo();
                String str2 = "";
                if (commonInfo == null || (userProfileInfo = commonInfo.getUserProfileInfo()) == null || (str = userProfileInfo.getUid()) == null) {
                    str = "";
                }
                BioLinkData bioLinkData = this.LJLJJL;
                if (bioLinkData != null && (bioUrl = bioLinkData.getBioUrl()) != null) {
                    str2 = bioUrl;
                }
                iBioUserMailLinkAbility.qg(enterFrom, "weblink", str, str2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.BioUserWebUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void updateComponentUIAndData() {
        String str;
        super.updateComponentUIAndData();
        boolean L7 = L7();
        C9IL c9il = C9IL.BIO;
        String lowerCase = "HAS_BIO_LINK".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, L7, c9il, lowerCase, C44384HbQ.LLFF(this.LJLJJI));
        BioLinkData bioLinkData = this.LJLJJL;
        String str2 = null;
        if (bioLinkData != null) {
            str = bioLinkData.getBioSecureUrl();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C2068389v A3 = A3();
            A3.LIZ = R.raw.icon_exclamation_mark_circle_fill;
            A3.LJ = Integer.valueOf(R.attr.e7);
            C119244m8 c119244m8 = this.LJLJJI;
            if (c119244m8 != null) {
                c119244m8.setStartIcon(A3);
                c119244m8.setCompoundDrawablePadding((int) KL2.LIZJ(c119244m8.getContext(), 4.0f));
                c119244m8.setText(R.string.hsq);
                Context context = c119244m8.getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.e7, context);
                if (LJI != null) {
                    c119244m8.setTextColor(LJI.intValue());
                    return;
                }
                return;
            }
            return;
        }
        C2068389v A32 = A3();
        A32.LIZ = R.raw.icon_link;
        A32.LJ = Integer.valueOf(R.attr.go);
        C119244m8 c119244m82 = this.LJLJJI;
        if (c119244m82 == null) {
            return;
        }
        c119244m82.setStartIcon(A32);
        c119244m82.setCompoundDrawablePadding((int) KL2.LIZJ(c119244m82.getContext(), 4.0f));
        BioLinkData bioLinkData2 = this.LJLJJL;
        if (bioLinkData2 != null) {
            str2 = bioLinkData2.getBioUrl();
        }
        c119244m82.setText(str2);
        Context context2 = c119244m82.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(R.attr.go, context2);
        if (LJI2 == null) {
            return;
        }
        c119244m82.setTextColor(LJI2.intValue());
    }

    public final void F3(View view) {
        if (view == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LJLJJLL < 3000) {
            return;
        }
        this.LJLJJLL = currentTimeMillis;
        C26045AKb c26045AKb = new C26045AKb(view);
        c26045AKb.LIZLLL(2000L);
        c26045AKb.LJIIIIZZ(R.string.ef9);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.BioBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        super.parseComponentBizData(jsonObject);
        this.LJLJJL = (BioLinkData) C75792yF.LIZ(jsonObject.toString(), BioLinkData.class);
    }
}
