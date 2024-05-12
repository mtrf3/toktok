package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container;

import X.AnonymousClass391;
import X.C188727au;
import X.C1FJ;
import X.C212428Vi;
import X.C232459Aj;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C58704N2e;
import X.C63081OpJ;
import X.C73340SqO;
import X.C76W;
import X.C79045V0n;
import X.C7MY;
import X.FMX;
import X.NN1;
import X.O6R;
import X.OJY;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BioBusinessInfoBaseComponent extends HeaderBaseContainerComponent implements IBioBAAbility {
    public BioBusinessInfoBaseComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void K3() {
        IHeaderBioAbility iHeaderBioAbility;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null && (iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBioAbility.LJFF(this.LJLJJLL, viewGroup, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLJLLL = linearLayout;
        linearLayout.setLayoutParams(layoutParams);
        C26338AVi.LJI(linearLayout, 0, AnonymousClass391.LIZJ(8), 0, 0, false, 16);
        C26338AVi.LJIIIZ(linearLayout, C1FJ.LIZIZ(16), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 0, 16);
        linearLayout.setOrientation(0);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        C232459Aj N3 = N3();
        if (N3 != null && (profileComponents = N3.LJLILLLLZI) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        L3(list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IBioBAAbility.class, null);
        }
        ProfilePlatformViewModel E3 = E3();
        if (E3 != null) {
            E3.ov0(new AqS170S0100000_4(this, 825));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IBioBAAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility
    public final void LJFF(int i, View view, String str) {
        o.LJIIIZ(view, "view");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AnonymousClass391.LIZ(0.5d), C7MY.LIZIZ(12));
        layoutParams.gravity = 16;
        View view2 = new View(getContext());
        view2.setLayoutParams(layoutParams);
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "context");
        view2.setBackground(C79045V0n.LJIIIIZZ(R.attr.dz, context));
        C26338AVi.LJI(view2, C1FJ.LIZIZ(8), 0, C1FJ.LIZIZ(8), 0, false, 16);
        view2.setTag("divider");
        view2.setLayoutParams(layoutParams);
        HeaderBaseContainerComponent.I3(this, str, i, view, null, view2, 8);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.IBioBAAbility
    public final void vg(ProfileCommonInfo profileCommonInfo, String str, String str2) {
        Aweme aweme;
        boolean z;
        String str3;
        String str4;
        String str5;
        UserProfileInfo userProfileInfo;
        UserProfileInfo userProfileInfo2;
        ProfilePlatformViewModel E3 = E3();
        if (E3 != null) {
            aweme = E3.gv0();
            if (aweme != null && C63081OpJ.LJLIL(aweme)) {
                OJY LJIL = C73340SqO.LJIL();
                Context context = getContext();
                LJIL.getClass();
                NN1.LJJJJJ(context, "homepagelink_click", aweme, NN1.LJIIIZ(context, aweme));
                C58704N2e.LIZLLL("homepage_ad", "homepagelink_click", aweme.getAwemeRawAd()).LJII();
            }
        } else {
            aweme = null;
        }
        getContext();
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            z = true;
        } else {
            z = false;
        }
        String str6 = "personal_homepage";
        if (z) {
            str3 = "personal_homepage";
        } else {
            str3 = "others_homepage";
        }
        if (profileCommonInfo != null && (userProfileInfo2 = profileCommonInfo.getUserProfileInfo()) != null) {
            str4 = userProfileInfo2.getUid();
        } else {
            str4 = null;
        }
        C76W c76w = new C76W();
        c76w.LIZ("link_type", str);
        FMX.LJIIJ("click_link", str3, str4, CardStruct.IStatusCode.DEFAULT, c76w.LIZIZ());
        C188727au c188727au = new C188727au();
        if (profileCommonInfo != null && (userProfileInfo = profileCommonInfo.getUserProfileInfo()) != null) {
            str5 = userProfileInfo.getUid();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("author_id", str5);
        ProfileBaseAbility profileBaseAbility2 = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility2 == null || !profileBaseAbility2.L7()) {
            str6 = "others_homepage";
        }
        c188727au.LJIIIZ("enter_from", str6);
        c188727au.LJIIIZ("link_type", str);
        c188727au.LJIIIZ("group_id", str2);
        c188727au.LJ(0L, "cid");
        c188727au.LJIIIZ("log_extra", "");
        FMX.LJIIL("click_link", c188727au.LIZ);
        if (aweme != null && aweme.isAd()) {
            if (o.LJ(str, "download_link")) {
                OJY LJIL2 = C73340SqO.LJIL();
                Context context2 = getContext();
                LJIL2.getClass();
                OJY.LJFF(context2, aweme);
                return;
            }
            if (!o.LJ(str, "web_link")) {
                return;
            }
            OJY LJIL3 = C73340SqO.LJIL();
            Context context3 = getContext();
            LJIL3.getClass();
            OJY.LJIIJ(context3, aweme);
        }
    }
}
