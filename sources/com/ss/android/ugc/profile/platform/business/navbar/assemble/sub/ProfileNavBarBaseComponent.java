package com.ss.android.ugc.profile.platform.business.navbar.assemble.sub;

import X.AbstractC234519Ih;
import X.C212428Vi;
import X.C221108m2;
import X.C232459Aj;
import X.C234179Gz;
import X.C234509Ig;
import X.C234529Ii;
import X.C235929Ns;
import X.C252709vu;
import X.C2L4;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C76965UIn;
import X.C8VV;
import X.C8W0;
import X.C9H0;
import X.C9H1;
import X.C9H2;
import X.C9KF;
import X.InterfaceC234169Gy;
import Y.IDObjectS0S0101000;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class ProfileNavBarBaseComponent extends BaseContainerComponent implements INavbarBaseAbility, C2L4 {
    public int LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public final C62822Ol8 LJLLI;
    public final SparseArray<AbstractC234519Ih> LJLLILLLL;
    public C252709vu LJLLJ;

    public ProfileNavBarBaseComponent() {
        new LinkedHashMap();
        this.LJLL = "";
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 959));
        this.LJLLILLLL = new SparseArray<>();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        ProfileComponents profileComponents;
        C232459Aj c232459Aj = (C232459Aj) this.LJLLI.getValue();
        if (c232459Aj != null) {
            profileComponents = c232459Aj.LJLILLLLZI;
        } else {
            profileComponents = null;
        }
        C8VV.LIZJ(this, new AqS135S0200000_4(profileComponents, this, BuildConfig.VERSION_CODE));
    }

    public final C9H0 K3() {
        String str = this.assemTagInternal;
        if (str != null && s.LJJJLZIJ(str, "nav_bar_start", false)) {
            return C9H0.START_AREA;
        }
        String str2 = this.assemTagInternal;
        if (str2 != null && s.LJJJLZIJ(str2, "nav_bar_center", false)) {
            return C9H0.CENTER_AREA;
        }
        String str3 = this.assemTagInternal;
        if (str3 != null && s.LJJJLZIJ(str3, "nav_bar_end", false)) {
            return C9H0.END_AREA;
        }
        return C9H0.NULL;
    }

    public final C252709vu L3() {
        C252709vu c252709vu = this.LJLLJ;
        if (c252709vu != null) {
            return c252709vu;
        }
        o.LJIJI("navBar");
        throw null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(NavbarScope.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), INavbarBaseAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final C252709vu z5() {
        return L3();
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void BV(String uniqueId) {
        o.LJIIIZ(uniqueId, "uniqueId");
        L3().LJIJ(uniqueId, C9H1.LJLIL);
    }

    public final void M3(C9H0 c9h0) {
        INavBarActionAbility iNavBarActionAbility;
        if (this.LJLJLJ == this.LJLJJI.size() && this.LJLJLLL) {
            SparseArray<AbstractC234519Ih> valueIterator = this.LJLLILLLL;
            o.LJIIIZ(valueIterator, "$this$valueIterator");
            IDObjectS0S0101000 iDObjectS0S0101000 = new IDObjectS0S0101000(valueIterator, 1);
            ArrayList arrayList = new ArrayList();
            while (iDObjectS0S0101000.hasNext()) {
                arrayList.add(iDObjectS0S0101000.next());
            }
            int i = C234179Gz.LIZ[c9h0.ordinal()];
            if (i != 1) {
                if (i == 2 && (iNavBarActionAbility = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null)) != null) {
                    iNavBarActionAbility.mK(arrayList);
                }
            } else {
                INavBarActionAbility iNavBarActionAbility2 = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
                if (iNavBarActionAbility2 != null) {
                    iNavBarActionAbility2.Fc0(arrayList);
                }
            }
            INavBarActionAbility iNavBarActionAbility3 = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
            if (iNavBarActionAbility3 != null) {
                iNavBarActionAbility3.uz();
            }
            INavBarActionAbility iNavBarActionAbility4 = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
            if (iNavBarActionAbility4 != null) {
                iNavBarActionAbility4.afterUpdateNavbarActions();
            }
            this.LJLJLLL = false;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, INavbarBaseAbility.class, K3().getValue());
        }
        if (!(view instanceof C252709vu)) {
            return;
        }
        this.LJLLJ = (C252709vu) view;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final View rm(String uniqueId) {
        o.LJIIIZ(uniqueId, "uniqueId");
        return L3().LJI(uniqueId);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void tm(String uniqueId) {
        o.LJIIIZ(uniqueId, "uniqueId");
        L3().LJIJ(uniqueId, C9H2.LJLIL);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        C8VV.LIZJ(this, new AqS135S0200000_4(profileComponents, this, BuildConfig.VERSION_CODE));
    }

    public static void I3(String tag, AbstractC234519Ih abstractC234519Ih) {
        if (abstractC234519Ih instanceof C234529Ii) {
            abstractC234519Ih.getClass();
            o.LJIIIZ(tag, "tag");
            abstractC234519Ih.LIZIZ = tag;
            return;
        }
        if (abstractC234519Ih instanceof C234509Ig) {
            abstractC234519Ih.getClass();
            o.LJIIIZ(tag, "tag");
            abstractC234519Ih.LIZIZ = tag;
        } else if (abstractC234519Ih instanceof C235929Ns) {
            abstractC234519Ih.getClass();
            o.LJIIIZ(tag, "tag");
            abstractC234519Ih.LIZIZ = tag;
        } else {
            if (!(abstractC234519Ih instanceof C9KF)) {
                return;
            }
            abstractC234519Ih.getClass();
            o.LJIIIZ(tag, "tag");
            abstractC234519Ih.LIZIZ = tag;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void AC(C9KF updateAction, String str) {
        o.LJIIIZ(updateAction, "updateAction");
        I3(str, updateAction);
        INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility != null) {
            iNavBarActionAbility.Ja0(updateAction);
        }
        INavBarActionAbility iNavBarActionAbility2 = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility2 != null) {
            iNavBarActionAbility2.afterUpdateNavbarActions();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void in(String uniqueId, String str) {
        o.LJIIIZ(uniqueId, "uniqueId");
        View rm = rm(uniqueId);
        if (rm == null) {
            return;
        }
        rm.setContentDescription(str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void mH(C9H0 c9h0, boolean z) {
        if (z) {
            this.LJLJLJ++;
        } else {
            this.LJLJLJ--;
        }
        M3(c9h0);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void showAlertBadge(boolean z, int i) {
        if (z) {
            if (i != 0) {
                L3().LJIILIIL(1, i, K3());
                return;
            } else {
                L3().LJIILIIL(0, 0, K3());
                return;
            }
        }
        L3().LJIIIIZZ(K3());
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void HV(C9H0 c9h0, int i, String uniqueId) {
        o.LJIIIZ(uniqueId, "uniqueId");
        this.LJLLILLLL.remove(i);
        BV(uniqueId);
        mH(c9h0, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavbarBaseAbility
    public final void LG(C9H0 c9h0, int i, AbstractC234519Ih abstractC234519Ih, String uniqueId) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(uniqueId, "uniqueId");
        if (abstractC234519Ih == null) {
            return;
        }
        AbstractC234519Ih abstractC234519Ih2 = this.LJLLILLLL.get(i);
        if (o.LJ(this.LJLLILLLL.get(i), abstractC234519Ih)) {
            tm(uniqueId);
            return;
        }
        I3(uniqueId, abstractC234519Ih);
        if (this.LJLLILLLL.indexOfValue(abstractC234519Ih) >= 0) {
            SparseArray<AbstractC234519Ih> sparseArray = this.LJLLILLLL;
            sparseArray.removeAt(sparseArray.indexOfValue(abstractC234519Ih));
        }
        if (abstractC234519Ih2 == null) {
            this.LJLLILLLL.put(i, abstractC234519Ih);
            return;
        }
        for (int size = this.LJLLILLLL.size() - 1; -1 < size; size--) {
            int keyAt = this.LJLLILLLL.keyAt(size);
            if (keyAt < i + 1) {
                SparseArray<AbstractC234519Ih> sparseArray2 = this.LJLLILLLL;
                int i2 = keyAt + 1;
                sparseArray2.put(i2, sparseArray2.valueAt(size));
                this.LJLLILLLL.remove(keyAt);
                AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
                if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
                    Iterator<C8W0> it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C8W0 next = it.next();
                            if ((next instanceof InterfaceC234169Gy) && o.LJ(next.assemTagInternal, uniqueId)) {
                                ((InterfaceC234169Gy) next).notifyIndexUpdate(i2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.LJLLILLLL.put(i, abstractC234519Ih);
    }
}
