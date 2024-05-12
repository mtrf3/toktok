package com.ss.android.ugc.profile.platform.business.navbar.business.data;

import X.AbstractC234519Ih;
import X.C17J;
import X.C2068389v;
import X.C234159Gx;
import X.C234529Ii;
import X.C55096Ljo;
import X.C9H0;
import X.C9H4;
import X.C9H6;
import X.C9IL;
import X.InterfaceC55235Lm3;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavBarQrCodeComponent extends NavbarBaseUIComponent<BizBaseData> {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public final C234529Ii LJLIL = new C234529Ii();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        C9IL c9il = C9IL.NAV;
        String lowerCase = "HAS_QR_CODE_ENTRANCE".toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        C17J.LJIILLIIL(this, true, c9il, lowerCase, true);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        int i;
        C9H0 c9h0;
        Icon icon;
        Integer iconInt$default;
        if (!C9H6.LIZIZ()) {
            return this.LJLIL;
        }
        if (C9H6.LIZ() == 1) {
            i = R.raw.icon_n_sharelink;
        } else {
            i = R.raw.icon_now_qr;
        }
        C234529Ii c234529Ii = this.LJLIL;
        C2068389v c2068389v = new C2068389v();
        T t = this.bizBaseData;
        if (t != 0 && (icon = t.getIcon()) != null && (iconInt$default = Icon.getIconInt$default(icon, null, null, 3, null)) != null) {
            i = iconInt$default.intValue();
        }
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 968));
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
        C9H4.LIZIZ("show", null);
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
        C9H0 c9h0;
        INavbarBaseAbility iNavbarBaseAbility;
        if (this.index == i) {
            return;
        }
        super.updateIndexAtContainer(i);
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null && (iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavbarBaseAbility.class, c9h0.getValue())) != null) {
            iNavbarBaseAbility.LG(c9h0, i, this.LJLIL, uniqueId());
        }
    }
}
