package com.ss.android.ugc.profile.platform.base.assemble;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ProfileRootComponent extends ProfileRootBaseComponent {
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

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

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0.L7() == true) goto L6;
     */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v3() {
        /*
            r10 = this;
            r4 = r10
            X.Lm3 r2 = X.C55096Ljo.LJIIZILJ(r4)
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            X.2K0 r0 = X.C55096Ljo.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L62
            boolean r0 = r0.L7()
            r2 = 1
            if (r0 != r2) goto L62
        L17:
            r0 = 2131373722(0x7f0a2e9a, float:1.8367543E38)
            r3 = 2131371864(0x7f0a2758, float:1.8363775E38)
            r1 = 2131373720(0x7f0a2e98, float:1.836754E38)
            if (r2 == 0) goto L64
            java.lang.String r5 = "nav_bar"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavbarComponent> r2 = com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavbarComponent.class
            X.Prg r6 = X.C65352Pkq.LIZ(r2)
            android.view.View r7 = r4._$_findCachedViewById(r3)
            r8 = 0
            r9 = 8
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "header"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.assemble.ProfileHeaderComponent> r2 = com.ss.android.ugc.profile.platform.business.header.assemble.ProfileHeaderComponent.class
            X.Prg r6 = X.C65352Pkq.LIZ(r2)
            android.view.View r7 = r4._$_findCachedViewById(r0)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "profile_tab"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2> r0 = com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2.class
            X.Prg r6 = X.C65352Pkq.LIZ(r0)
            android.view.View r7 = r4._$_findCachedViewById(r1)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "profile_ad"
            java.lang.Class<com.ss.android.ugc.profile.platform.base.assemble.MyProfileADAssem2> r0 = com.ss.android.ugc.profile.platform.base.assemble.MyProfileADAssem2.class
            X.Prg r6 = X.C65352Pkq.LIZ(r0)
            android.view.View r7 = r4._$_findCachedViewById(r1)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            return
        L62:
            r2 = 0
            goto L17
        L64:
            java.lang.String r5 = "nav_bar"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavbarComponent> r2 = com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavbarComponent.class
            X.Prg r6 = X.C65352Pkq.LIZ(r2)
            android.view.View r7 = r4._$_findCachedViewById(r3)
            r8 = 0
            r9 = 8
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "header"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.header.assemble.ProfileHeaderComponent> r2 = com.ss.android.ugc.profile.platform.business.header.assemble.ProfileHeaderComponent.class
            X.Prg r6 = X.C65352Pkq.LIZ(r2)
            android.view.View r7 = r4._$_findCachedViewById(r0)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "profile_tab"
            java.lang.Class<com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2> r0 = com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2.class
            X.Prg r6 = X.C65352Pkq.LIZ(r0)
            android.view.View r7 = r4._$_findCachedViewById(r1)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            java.lang.String r5 = "profile_ad"
            java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssemV2> r0 = com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssemV2.class
            X.Prg r6 = X.C65352Pkq.LIZ(r0)
            android.view.View r7 = r4._$_findCachedViewById(r1)
            com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent.x3(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent.v3():void");
    }
}
