package com.ss.android.ugc.aweme.detail.prefab;

import X.AbstractC234519Ih;
import X.C212428Vi;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C2K0;
import X.C38350F3i;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C8V1;
import X.C8W0;
import X.C9KF;
import X.EV9;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class DetailNavBarAssem extends DynamicAssem {
    public C252709vu LJLJLLL;
    public TuxTextView LJLL;
    public String LJLLI;
    public final C62822Ol8 LJLLILLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public DetailNavBarAssem() {
        new LinkedHashMap();
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 185));
    }

    public final C252709vu L3() {
        C252709vu c252709vu = this.LJLJLLL;
        if (c252709vu != null) {
            return c252709vu;
        }
        o.LJIJI("tuxNavBar");
        throw null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C252709vu c252709vu = new C252709vu(context, null, 6);
        c252709vu.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        c252709vu.setNavBackground(0);
        E3(c252709vu);
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void didUpdateConfig(C8V1<? extends C8W0> oldConfig) {
        String obj;
        o.LJIIIZ(oldConfig, "oldConfig");
        super.didUpdateConfig(oldConfig);
        Object obj2 = getConfig().LJ.get("title");
        if (obj2 != null && (obj = obj2.toString()) != null) {
            String str = this.LJLLI;
            if (str != null) {
                if (!o.LJ(str, obj)) {
                    this.LJLLI = obj;
                    C252709vu L3 = L3();
                    C9KF c9kf = new C9KF();
                    c9kf.LIZJ = obj;
                    L3.LJIILLIIL(c9kf);
                    return;
                }
                return;
            }
            o.LJIJI("title");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String str;
        int i;
        final Integer num;
        float f;
        Fragment LIZLLL;
        String obj;
        NavActionProvider navActionProvider;
        List<AbstractC234519Ih> MU;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Object obj2 = getConfig().LJ.get("title");
        if (obj2 == null || (str = obj2.toString()) == null) {
            str = "";
        }
        this.LJLLI = str;
        this.LJLJLLL = (C252709vu) view;
        C252709vu L3 = L3();
        C235119Kp c235119Kp = new C235119Kp();
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        C234529Ii c234529Ii = new C234529Ii();
        if (o.LJ(this.LJLLILLLL.getValue(), "arrow")) {
            i = R.raw.icon_arrow_left_ltr;
        } else {
            i = R.raw.icon_x_mark;
        }
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = i;
        c234529Ii.LIZLLL = true;
        c234529Ii.LIZIZ = "back";
        c234529Ii.LIZIZ(new AqS153S0100000_3(this, 186));
        abstractC234519IhArr[0] = c234529Ii;
        C9KF LIZLLL2 = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
        String str2 = this.LJLLI;
        if (str2 != null) {
            LIZLLL2.LIZJ = str2;
            c235119Kp.LIZJ = LIZLLL2;
            Fragment LIZLLL3 = C212428Vi.LIZLLL(this);
            if (LIZLLL3 != null && (navActionProvider = (NavActionProvider) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL3, null), NavActionProvider.class, null)) != null && (MU = navActionProvider.MU()) != null) {
                ((ArrayList) c235119Kp.LIZIZ).addAll(MU);
            }
            L3.setNavActions(c235119Kp);
            Object obj3 = getConfig().LJ.get("fade_in_offset");
            if (obj3 != null && (obj = obj3.toString()) != null) {
                num = C38350F3i.LJJIL(obj);
            } else {
                num = null;
            }
            View findViewById = view.findViewById(R.id.gwk);
            o.LJIIIIZZ(findViewById, "view.findViewById(R.id.nav_bar_title)");
            TuxTextView tuxTextView = (TuxTextView) findViewById;
            this.LJLL = tuxTextView;
            if (num == null) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            tuxTextView.setAlpha(f);
            if (num != null && (LIZLLL = C212428Vi.LIZLLL(this)) != null) {
                InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
                PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.detail.prefab.DetailNavBarAssem$onViewCreated$3
                    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                    public final void SQ(int i2) {
                        int min = Math.min(i2, num.intValue());
                        boolean z = false;
                        if (min >= 0 && min <= num.intValue()) {
                            TuxTextView tuxTextView2 = this.LJLL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setAlpha(min / num.intValue());
                            } else {
                                o.LJIJI("titleTv");
                                throw null;
                            }
                        }
                        C252709vu L32 = this.L3();
                        if (min > 0) {
                            z = true;
                        }
                        L32.LJIILJJIL(z);
                    }
                };
                C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PageHeaderScrollAbility.class, null);
                if (LIZ == null) {
                    C55096Ljo.LJIIJJI(LIZJ, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null);
                    return;
                }
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(pageHeaderScrollAbility);
                        return;
                    }
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(pageHeaderScrollAbility);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageHeaderScrollAbility.class, null);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                }
            }
            return;
        }
        o.LJIJI("title");
        throw null;
    }
}
