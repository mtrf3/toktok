package com.ss.android.ugc.profile.platform.business.navbar.business;

import X.AV1;
import X.AbstractC234519Ih;
import X.C234159Gx;
import X.C234529Ii;
import X.C236079Oh;
import X.C55096Ljo;
import X.C84763XOl;
import X.C9H0;
import X.InterfaceC236109Ok;
import X.InterfaceC55235Lm3;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarActivityComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class NavBarActivityComponent extends NavbarBaseUIComponent<BizBaseData> {
    public boolean LJLILLLLZI;
    public C236079Oh LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C234529Ii LJLIL = new C234529Ii();

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
        Activity LJIIIIZZ;
        C236079Oh c236079Oh;
        C9H0 c9h0;
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            C234529Ii c234529Ii = this.LJLIL;
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = 0;
            c234529Ii.LJI = false;
            c234529Ii.LIZLLL(uniqueId());
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
        this.LJLJI = new C236079Oh();
        if (!isFromMain() || AV1.LJIIJJI() || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null || (c236079Oh = this.LJLJI) == null) {
            return;
        }
        c236079Oh.LJJI(LJIIIIZZ, this.LJLIL, new InterfaceC236109Ok() { // from class: X.9Hg
            @Override // X.InterfaceC236109Ok
            public final boolean LIZ() {
                return FMX.LIZJ("profile_activity_reward_button_show");
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZIZ() {
                C17J.LJJJ(NavBarActivityComponent.this, true, "farm");
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZJ() {
                C9H0 c9h02;
                C234159Gx data2 = NavBarActivityComponent.this.getData();
                if (data2 != null && (c9h02 = data2.LJLIL) != null) {
                    NavBarActivityComponent navBarActivityComponent = NavBarActivityComponent.this;
                    InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(navBarActivityComponent);
                    String value2 = c9h02.getValue();
                    if (value2 == null) {
                        value2 = "";
                    }
                    INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, value2);
                    if (iNavbarBaseAbility2 != null) {
                        iNavbarBaseAbility2.tm(navBarActivityComponent.uniqueId());
                    }
                    navBarActivityComponent.LJLILLLLZI = true;
                }
            }

            @Override // X.InterfaceC236109Ok
            public final void LIZLLL() {
                NavBarActivityComponent navBarActivityComponent = NavBarActivityComponent.this;
                C9IL c9il = C9IL.NAV;
                String lowerCase = "HAS_FARM".toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                C17J.LJIILLIIL(navBarActivityComponent, true, c9il, lowerCase, NavBarActivityComponent.this.LJLILLLLZI);
            }

            @Override // X.InterfaceC236109Ok
            public final void LJ() {
                C9H0 c9h02;
                C234159Gx data2 = NavBarActivityComponent.this.getData();
                if (data2 != null && (c9h02 = data2.LJLIL) != null) {
                    NavBarActivityComponent navBarActivityComponent = NavBarActivityComponent.this;
                    InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(navBarActivityComponent);
                    String value2 = c9h02.getValue();
                    if (value2 == null) {
                        value2 = "";
                    }
                    INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, value2);
                    if (iNavbarBaseAbility2 != null) {
                        iNavbarBaseAbility2.LG(c9h02, navBarActivityComponent.index, navBarActivityComponent.LJLIL, navBarActivityComponent.uniqueId());
                    }
                }
            }

            @Override // X.InterfaceC236109Ok
            public final void LJFF() {
                C9H0 c9h02;
                C234159Gx data2 = NavBarActivityComponent.this.getData();
                if (data2 != null && (c9h02 = data2.LJLIL) != null) {
                    NavBarActivityComponent navBarActivityComponent = NavBarActivityComponent.this;
                    navBarActivityComponent.LJLILLLLZI = false;
                    InterfaceC55235Lm3 LJIIZILJ2 = C55096Ljo.LJIIZILJ(navBarActivityComponent);
                    String value2 = c9h02.getValue();
                    if (value2 == null) {
                        value2 = "";
                    }
                    INavbarBaseAbility iNavbarBaseAbility2 = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ2, INavbarBaseAbility.class, value2);
                    if (iNavbarBaseAbility2 != null) {
                        iNavbarBaseAbility2.BV(navBarActivityComponent.uniqueId());
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C236079Oh c236079Oh = this.LJLJI;
        if (c236079Oh != null) {
            c236079Oh.LJLJJL = null;
            c236079Oh.LJLJJLL = null;
            c236079Oh.LJLJL = null;
        }
        this.LJLJI = null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final boolean shouldShowAfterDoubleCheck() {
        return isFromMain();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
    public final AbstractC234519Ih initNavBarAction() {
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
