package com.ss.android.ugc.profile.platform.business.navbar.assemble;

import X.AbstractC234519Ih;
import X.C212428Vi;
import X.C221018lt;
import X.C235119Kp;
import X.C252709vu;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C61878OQg;
import X.C8VV;
import X.C8W0;
import X.C9IB;
import X.C9KF;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileNavBarRootComponent extends BaseContainerComponent implements INavBarActionAbility {
    public C252709vu LJLJLJ;
    public List<? extends AbstractC234519Ih> LJLJLLL;
    public List<? extends AbstractC234519Ih> LJLL;
    public C9KF LJLLI;
    public final C55749LuL LJLLILLLL;

    public ProfileNavBarRootComponent() {
        new LinkedHashMap();
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLJLLL = c61878OQg;
        this.LJLL = c61878OQg;
        this.LJLLI = new C9KF();
        this.LJLLILLLL = new C55749LuL(C47704Ins.LJ(this, C9IB.class, "nav_bar"), checkSupervisorPrepared());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        ProfileComponents profileComponents;
        C9IB c9ib = (C9IB) this.LJLLILLLL.getValue();
        if (c9ib != null) {
            profileComponents = (ProfileComponents) c9ib.LJLIL;
        } else {
            profileComponents = null;
        }
        C8VV.LIZJ(this, new AqS135S0200000_4(profileComponents, this, 285));
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void uz() {
        C221018lt.LJFF("test_tag", "updateNavActions all");
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            List<? extends AbstractC234519Ih> list = this.LJLJLLL;
            o.LJIIIZ(list, "list");
            ((ArrayList) c235119Kp.LIZ).addAll(list);
            List<? extends AbstractC234519Ih> list2 = this.LJLL;
            o.LJIIIZ(list2, "list");
            ((ArrayList) c235119Kp.LIZIZ).addAll(list2);
            c235119Kp.LIZ(this.LJLLI);
            c252709vu.setNavActions(c235119Kp);
            return;
        }
        o.LJIJI("navBar");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void afterUpdateNavbarActions() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList2;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                String str = next.assemTagInternal;
                if (o.LJ(str, "nav_bar_center") || o.LJ(str, "nav_bar_end")) {
                    AssemSupervisor LIZJ2 = C212428Vi.LIZJ(next);
                    if (LIZJ2 != null && (copyOnWriteArrayList2 = LIZJ2.LJLLI) != null) {
                        Iterator<C8W0> it2 = copyOnWriteArrayList2.iterator();
                        while (it2.hasNext()) {
                            C8W0 next2 = it2.next();
                            String str2 = next2.assemTagInternal;
                            if (o.LJ(str2, "nav_bar_center_nickname") || o.LJ(str2, "nav_bar_end_settings")) {
                                if (next2 instanceof NavbarBaseUIComponent) {
                                    ((NavbarBaseUIComponent) next2).afterUpdateNavbarActions();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final boolean isFromMain() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            return myProfileAbility.isFromMain();
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, INavBarActionAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void Fc0(List<? extends AbstractC234519Ih> list) {
        this.LJLJLLL = list;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void Ja0(C9KF navActions) {
        o.LJIIIZ(navActions, "navActions");
        this.LJLLI = navActions;
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIILLIIL(navActions);
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void mK(List<? extends AbstractC234519Ih> list) {
        this.LJLL = list;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof C252709vu)) {
            return;
        }
        this.LJLJLJ = (C252709vu) view;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        C8VV.LIZJ(this, new AqS135S0200000_4(profileComponents, this, 285));
    }
}
