package com.ss.android.ugc.profile.platform.business.header.business.cta.assemble;

import X.C232459Aj;
import X.C9H6;
import X.EnumC234309Hm;
import X.L12;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;

/* loaded from: classes5.dex */
public final class ProfileHeaderCTAComponent extends ProfileHeaderCTABaseComponent {
    public ProfileHeaderCTAComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTABaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        EnumC234309Hm enumC234309Hm;
        EnumC234309Hm enumC234309Hm2;
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        super.onCreate();
        if (C9H6.LIZ() == 3 || L12.LIZLLL()) {
            enumC234309Hm = EnumC234309Hm.ICON;
        } else {
            enumC234309Hm = EnumC234309Hm.TEXT;
        }
        if (C9H6.LIZ() == 3 || L12.LIZLLL()) {
            enumC234309Hm2 = EnumC234309Hm.TEXT;
        } else {
            enumC234309Hm2 = EnumC234309Hm.ICON;
        }
        new AqS93S0300000_4(this, enumC234309Hm, enumC234309Hm2, 152).invoke();
        C232459Aj N3 = N3();
        if (N3 != null && (profileComponents = N3.LJLILLLLZI) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        L3(list);
        Map<String, EnumC234309Hm> map = this.LJLLILLLL;
        EnumC234309Hm enumC234309Hm3 = EnumC234309Hm.TEXT;
        map.put("cta_social_interaction_follow", enumC234309Hm3);
        this.LJLLILLLL.put("cta_social_interaction_message", enumC234309Hm3);
    }
}
