package com.ss.android.ugc.aweme.profile.widgets.navbar.base;

import X.APY;
import X.C234509Ig;
import X.C234529Ii;
import X.C235119Kp;
import X.C235869Nm;
import X.C235879Nn;
import X.C235889No;
import X.C235929Ns;
import X.C252709vu;
import X.C39557Ffl;
import X.C61878OQg;
import X.C76800UCe;
import X.C8VV;
import X.C9HI;
import X.C9KF;
import X.C9PE;
import X.EnumC235349Lm;
import X.EnumC235829Ni;
import X.EnumC235859Nl;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileNavBarAssem extends UIContentAssem implements C9PE {
    public C252709vu LJLJLJ;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public final List<EnumC235349Lm> LJLIL = new ArrayList();
    public final List<EnumC235829Ni> LJLILLLLZI = new ArrayList();
    public final List<EnumC235859Nl> LJLJI = new ArrayList();
    public final Map<EnumC235349Lm, Boolean> LJLJJI = new LinkedHashMap();
    public final Map<EnumC235859Nl, Boolean> LJLJJL = new LinkedHashMap();
    public final Map<EnumC235829Ni, Boolean> LJLJJLL = new LinkedHashMap();
    public final C235889No LJLJL = new C235889No(null);
    public final C235119Kp LJLJLLL = new C235119Kp();
    public final C9KF LJLL = new C9KF();
    public final Map<C9HI, FrameLayout> LJLLI = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.C9PE
    public C252709vu z5() {
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            return c252709vu;
        }
        o.LJIJI("navBar");
        throw null;
    }

    private final List<C9HI> A3(C9HI c9hi) {
        if (c9hi instanceof EnumC235349Lm) {
            Map<EnumC235349Lm, Boolean> map = this.LJLJJI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<EnumC235349Lm, Boolean> entry : map.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((Map.Entry) it.next()).getKey());
            }
            return arrayList;
        }
        if (c9hi instanceof EnumC235859Nl) {
            return C61878OQg.INSTANCE;
        }
        if (c9hi instanceof EnumC235829Ni) {
            Map<EnumC235829Ni, Boolean> map2 = this.LJLJJLL;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<EnumC235829Ni, Boolean> entry2 : map2.entrySet()) {
                if (entry2.getValue().booleanValue()) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
            Iterator it2 = linkedHashMap2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(((Map.Entry) it2.next()).getKey());
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("Not StartArea, CenterArea or EndArea");
    }

    private final boolean H3(EnumC235829Ni enumC235829Ni) {
        if (C235879Nn.LIZ[enumC235829Ni.ordinal()] == 1) {
            return true;
        }
        return false;
    }

    private final FrameLayout x3(C9HI c9hi) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setVisibility(8);
            this.LJLLI.put(c9hi, frameLayout);
            return frameLayout;
        }
        return null;
    }

    @Override // X.C9PE
    public void A5(C9HI area) {
        o.LJIIIZ(area, "area");
        List<C9HI> list = this.LJLJL.LJLILLLLZI.get(area);
        if (list != null && !list.isEmpty()) {
            Iterator<C9HI> it = A3(area).iterator();
            while (it.hasNext()) {
                if (list.contains(it.next())) {
                    return;
                }
            }
        }
        List<C9HI> list2 = this.LJLJL.LJLIL.get(area);
        if (list2 != null && !list2.isEmpty()) {
            for (C9HI c9hi : A3(area)) {
                if (list2.contains(c9hi)) {
                    S6(c9hi);
                }
            }
        }
        if (this.LJLLI.containsKey(area)) {
            v3(area, true);
            return;
        }
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIJ(area, new AqS135S0200000_4(this, area, 97));
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void C3(List actions) {
        o.LJIIIZ(actions, "actions");
        this.LJLJI.clear();
        this.LJLJJL.clear();
        Iterator it = actions.iterator();
        while (it.hasNext()) {
            C235869Nm c235869Nm = (C235869Nm) it.next();
            this.LJLJI.add(c235869Nm.LJLIL);
            this.LJLJJL.put(c235869Nm.LJLIL, Boolean.FALSE);
            C235119Kp c235119Kp = this.LJLJLLL;
            C9KF c9kf = this.LJLL;
            Object tag = c235869Nm.LJLIL;
            c9kf.getClass();
            o.LJIIIZ(tag, "tag");
            c9kf.LIZIZ = tag;
            c235119Kp.getClass();
            c235119Kp.LIZJ = c9kf;
            C8VV.LIZJ(this, new AqS135S0200000_4(this, (ProfileNavBarAssem) c235869Nm, (C235869Nm) 94));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E3(List actions) {
        FrameLayout x3;
        o.LJIIIZ(actions, "actions");
        this.LJLILLLLZI.clear();
        this.LJLJJLL.clear();
        Iterator it = actions.iterator();
        while (it.hasNext()) {
            C235869Nm c235869Nm = (C235869Nm) it.next();
            this.LJLILLLLZI.add(c235869Nm.LJLIL);
            this.LJLJJLL.put(c235869Nm.LJLIL, Boolean.FALSE);
            if (ProfileNavIconActionAssem.class.isAssignableFrom(C39557Ffl.LIZ(c235869Nm.LJLILLLLZI))) {
                C235119Kp c235119Kp = this.LJLJLLL;
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = 0;
                LIZJ.LJI = false;
                LIZJ.LIZLLL(c235869Nm.LJLIL);
                c235119Kp.LIZIZ(LIZJ);
            } else if (ProfileNavCustomActionAssem.class.isAssignableFrom(C39557Ffl.LIZ(c235869Nm.LJLILLLLZI)) && (x3 = x3((C9HI) c235869Nm.LJLIL)) != null) {
                C235119Kp c235119Kp2 = this.LJLJLLL;
                C235929Ns c235929Ns = new C235929Ns();
                c235929Ns.LIZJ = x3;
                c235929Ns.LIZLLL = H3((EnumC235829Ni) c235869Nm.LJLIL);
                c235119Kp2.LIZIZ(c235929Ns);
            }
        }
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.setNavActions(this.LJLJLLL);
            Iterator it2 = actions.iterator();
            while (it2.hasNext()) {
                C8VV.LIZJ(this, new AqS135S0200000_4(this, (ProfileNavBarAssem) it2.next(), (C235869Nm) 95));
            }
            return;
        }
        o.LJIJI("navBar");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F3(List actions) {
        FrameLayout x3;
        o.LJIIIZ(actions, "actions");
        this.LJLJJI.clear();
        this.LJLIL.clear();
        Iterator it = actions.iterator();
        while (it.hasNext()) {
            C235869Nm c235869Nm = (C235869Nm) it.next();
            this.LJLIL.add(c235869Nm.LJLIL);
            this.LJLJJI.put(c235869Nm.LJLIL, Boolean.FALSE);
            if (ProfileNavIconActionAssem.class.isAssignableFrom(C39557Ffl.LIZ(c235869Nm.LJLILLLLZI))) {
                C235119Kp c235119Kp = this.LJLJLLL;
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = 0;
                LIZJ.LJI = false;
                LIZJ.LIZLLL(c235869Nm.LJLIL);
                c235119Kp.LIZLLL(LIZJ);
            } else if (ProfileNavCustomActionAssem.class.isAssignableFrom(C39557Ffl.LIZ(c235869Nm.LJLILLLLZI)) && (x3 = x3((C9HI) c235869Nm.LJLIL)) != null) {
                C235119Kp c235119Kp2 = this.LJLJLLL;
                C235929Ns c235929Ns = new C235929Ns();
                c235929Ns.LIZJ = x3;
                c235119Kp2.LIZLLL(c235929Ns);
            }
        }
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.setNavActions(this.LJLJLLL);
            Iterator it2 = actions.iterator();
            while (it2.hasNext()) {
                C8VV.LIZJ(this, new AqS135S0200000_4(this, (ProfileNavBarAssem) it2.next(), (C235869Nm) 96));
            }
            return;
        }
        o.LJIJI("navBar");
        throw null;
    }

    @Override // X.C9PE
    public boolean G7(C9HI area) {
        Boolean bool;
        o.LJIIIZ(area, "area");
        if (area instanceof EnumC235349Lm) {
            Boolean bool2 = this.LJLJJI.get(area);
            if (bool2 == null) {
                return false;
            }
            return bool2.booleanValue();
        }
        if (area instanceof EnumC235859Nl) {
            return true;
        }
        if (!(area instanceof EnumC235829Ni) || (bool = this.LJLJJLL.get(area)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // X.C9PE
    public void S6(C9HI area) {
        o.LJIIIZ(area, "area");
        if (this.LJLLI.containsKey(area)) {
            v3(area, false);
            return;
        }
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIJ(area, new AqS135S0200000_4(this, area, 93));
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(view instanceof C252709vu)) {
            return;
        }
        this.LJLJLJ = (C252709vu) view;
        C8VV.LIZJ(this, new AqS170S0100000_4(this, 715));
    }

    @Override // X.C9PE
    public View z6(C9HI area) {
        o.LJIIIZ(area, "area");
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            return c252709vu.LJI(area);
        }
        o.LJIJI("navBar");
        throw null;
    }

    private final void v3(C9HI c9hi, boolean z) {
        int i;
        FrameLayout frameLayout = this.LJLLI.get(c9hi);
        if (frameLayout == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        I3(c9hi, z);
    }

    public final void I3(C9HI c9hi, boolean z) {
        if (c9hi instanceof EnumC235349Lm) {
            this.LJLJJI.put(c9hi, Boolean.valueOf(z));
        } else {
            if (!(c9hi instanceof EnumC235829Ni)) {
                return;
            }
            this.LJLJJLL.put(c9hi, Boolean.valueOf(z));
        }
    }

    @Override // X.C9PE
    public void U6(C9HI area, InterfaceC88472Yns<? super C234509Ig, C76800UCe> updater) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(updater, "updater");
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIJ(area, new AqS170S0100000_4(updater, (InterfaceC88472Yns<? super APY, C76800UCe>) 717));
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    @Override // X.C9PE
    public void Yf(C9HI area, InterfaceC88472Yns<? super C9KF, C76800UCe> updater) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(updater, "updater");
        updater.invoke(this.LJLL);
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIILLIIL(this.LJLL);
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    @Override // X.C9PE
    public void ui(C9HI area, InterfaceC88472Yns<? super C234529Ii, C76800UCe> updater) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(updater, "updater");
        C252709vu c252709vu = this.LJLJLJ;
        if (c252709vu != null) {
            c252709vu.LJIJ(area, new AqS170S0100000_4(updater, (InterfaceC88472Yns<? super APY, C76800UCe>) 716));
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }

    @Override // X.C9PE
    public void uj(C9HI area, View view) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(view, "view");
        FrameLayout frameLayout = this.LJLLI.get(area);
        if (frameLayout == null) {
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.addView(view);
    }

    @Override // X.C9PE
    public void updateContentDescription(C9HI area, String value) {
        o.LJIIIZ(area, "area");
        o.LJIIIZ(value, "value");
        View z6 = z6(area);
        if (z6 == null) {
            return;
        }
        z6.setContentDescription(value);
    }

    @Override // X.C9PE
    public void w9(C9HI area, boolean z, int i) {
        o.LJIIIZ(area, "area");
        if (z) {
            if (i != 0) {
                C252709vu c252709vu = this.LJLJLJ;
                if (c252709vu != null) {
                    c252709vu.LJIILIIL(1, i, area);
                    return;
                } else {
                    o.LJIJI("navBar");
                    throw null;
                }
            }
            C252709vu c252709vu2 = this.LJLJLJ;
            if (c252709vu2 != null) {
                c252709vu2.LJIILIIL(0, 0, area);
                return;
            } else {
                o.LJIJI("navBar");
                throw null;
            }
        }
        C252709vu c252709vu3 = this.LJLJLJ;
        if (c252709vu3 != null) {
            c252709vu3.LJIIIIZZ(area);
        } else {
            o.LJIJI("navBar");
            throw null;
        }
    }
}
