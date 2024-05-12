package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container;

import X.AnonymousClass391;
import X.C188727au;
import X.C212428Vi;
import X.C232459Aj;
import X.C26338AVi;
import X.C55096Ljo;
import X.C55230Lly;
import X.FMX;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class BioUserMailLinkBaseComponent extends HeaderBaseContainerComponent implements IBioUserMailLinkAbility {
    public BioUserMailLinkBaseComponent() {
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
        layoutParams.gravity = 1;
        Context context = getContext();
        if (context != null) {
            C26338AVi.LJII(layoutParams, context, AnonymousClass391.LIZJ(40), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(40), 0, 32);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLJLLL = linearLayout;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
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
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IBioUserMailLinkAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IBioUserMailLinkAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility
    public final void LJFF(int i, View view, String str) {
        o.LJIIIZ(view, "view");
        HeaderBaseContainerComponent.I3(this, str, i, view, null, null, 24);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility
    public final void qg(String str, String str2, String str3, String str4) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("link_type", str2);
        c188727au.LJIIIZ("link", str4);
        c188727au.LJIIIZ("scene_id", "1008");
        c188727au.LJIIIZ("author_id", str3);
        FMX.LJIIL("show_link", c188727au.LIZ);
    }
}
