package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AbstractC234519Ih;
import X.C17J;
import X.C234159Gx;
import X.C234529Ii;
import X.C55096Ljo;
import X.C77266UUc;
import X.C9H0;
import X.C9IL;
import X.InterfaceC55235Lm3;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavBarFindFriendsComponent extends NavbarBaseUIComponent<BizBaseData> {
    public boolean LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C234529Ii LJLIL = new C234529Ii();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        this.LJLILLLLZI = true;
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_FIND_FRIENDS".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, this.LJLILLLLZI);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        C9H0 c9h0;
        if (!C77266UUc.LIZIZ.LJJIZ()) {
            return this.LJLIL;
        }
        C234529Ii c234529Ii = this.LJLIL;
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(this, 845);
        c234529Ii.LIZJ();
        c234529Ii.LJFF = aqS170S0100000_4;
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 962));
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, this.index, this.LJLIL, uniqueId());
            }
        }
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
        C9H0 c9h0;
        if (this.index == i) {
            return;
        }
        super.updateIndexAtContainer(i);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.LG(c9h0, i, this.LJLIL, uniqueId());
            }
        }
    }
}
