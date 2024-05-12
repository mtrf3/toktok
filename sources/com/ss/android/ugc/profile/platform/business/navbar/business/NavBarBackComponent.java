package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AbstractC234519Ih;
import X.C2068389v;
import X.C234159Gx;
import X.C234529Ii;
import X.C53765L8f;
import X.C55096Ljo;
import X.C9H0;
import X.InterfaceC55235Lm3;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class NavBarBackComponent extends NavbarBaseUIComponent<BizBaseData> {
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

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
        C9H0 c9h0;
        C234529Ii c234529Ii = this.LJLIL;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_left_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new AqS154S0100000_4(this, 961));
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        C234159Gx data;
        C9H0 c9h0;
        View rm;
        C9H0 c9h02;
        String str = "";
        if (C53765L8f.LJIIJJI() || !isFromMain()) {
            if (Build.VERSION.SDK_INT >= 26 && (data = getData()) != null && (c9h0 = data.LJLIL) != null) {
                InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
                String value = c9h0.getValue();
                if (value != null) {
                    str = value;
                }
                INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
                if (iNavbarBaseAbility == null || (rm = iNavbarBaseAbility.rm(uniqueId())) == null) {
                    return;
                }
                rm.setDefaultFocusHighlightEnabled(false);
                return;
            }
            return;
        }
        C234159Gx data2 = getData();
        if (data2 == null || (c9h02 = data2.LJLIL) == null) {
            return;
        }
        InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(this);
        String value2 = c9h02.getValue();
        if (value2 != null) {
            str = value2;
        }
        INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, str);
        if (iNavbarBaseAbility2 == null) {
            return;
        }
        iNavbarBaseAbility2.BV(uniqueId());
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        if (C53765L8f.LJIIJJI() || !isFromMain()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
        C234159Gx data;
        C9H0 c9h0;
        if (this.index == i) {
            return;
        }
        super.updateIndexAtContainer(i);
        if (!isFromMain() && (data = getData()) != null && (c9h0 = data.LJLIL) != null) {
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
