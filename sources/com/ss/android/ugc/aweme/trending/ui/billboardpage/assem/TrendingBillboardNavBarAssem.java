package com.ss.android.ugc.aweme.trending.ui.billboardpage.assem;

import X.AbstractC234519Ih;
import X.AnonymousClass391;
import X.C212428Vi;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26338AVi;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C7MY;
import X.C9KF;
import X.EV9;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TrendingBillboardNavBarAssem extends DynamicAssem {
    public C252709vu LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ctr;
    }

    public TrendingBillboardNavBarAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        assembleChildren();
        C252709vu c252709vu = (C252709vu) view;
        this.LJLJLLL = c252709vu;
        Object parent = c252709vu.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.View");
        C26338AVi.LJI((View) parent, 0, 0, 0, AnonymousClass391.LIZJ(-52), false, 16);
        C252709vu c252709vu2 = this.LJLJLLL;
        if (c252709vu2 != null) {
            Object parent2 = c252709vu2.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.View");
            ((View) parent2).setTranslationZ(C7MY.LIZIZ(2));
            C252709vu c252709vu3 = this.LJLJLLL;
            if (c252709vu3 != null) {
                c252709vu3.setVisibility(4);
                Context context = getContext();
                if (context == null || (str = context.getString(R.string.sjv)) == null) {
                    str = "Trending";
                }
                C252709vu c252709vu4 = this.LJLJLLL;
                if (c252709vu4 != null) {
                    C235119Kp c235119Kp = new C235119Kp();
                    C234529Ii LIZJ = s1.LIZJ();
                    LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
                    LIZJ.LIZLLL = true;
                    LIZJ.LIZIZ(new AqS153S0100000_3(this, 1125));
                    C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
                    LIZLLL.LIZJ = str;
                    c235119Kp.LIZJ = LIZLLL;
                    c252709vu4.setNavActions(c235119Kp);
                    Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
                    if (LIZLLL2 != null) {
                        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LIZLLL2, null);
                        PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.trending.ui.billboardpage.assem.TrendingBillboardNavBarAssem$onViewCreated$2
                            @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                            public final void SQ(int i) {
                                if (i > 0) {
                                    if (i <= C7MY.LIZIZ(88)) {
                                        C252709vu c252709vu5 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                        if (c252709vu5 != null) {
                                            c252709vu5.setVisibility(0);
                                            C252709vu c252709vu6 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                            if (c252709vu6 != null) {
                                                c252709vu6.setAlpha(i / C7MY.LIZIZ(88));
                                                return;
                                            } else {
                                                o.LJIJI("navBar");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("navBar");
                                        throw null;
                                    }
                                    C252709vu c252709vu7 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                    if (c252709vu7 != null) {
                                        c252709vu7.setVisibility(0);
                                        C252709vu c252709vu8 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                        if (c252709vu8 != null) {
                                            c252709vu8.setAlpha(1.0f);
                                            return;
                                        } else {
                                            o.LJIJI("navBar");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("navBar");
                                    throw null;
                                }
                                C252709vu c252709vu9 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                if (c252709vu9 != null) {
                                    c252709vu9.setVisibility(4);
                                    C252709vu c252709vu10 = TrendingBillboardNavBarAssem.this.LJLJLLL;
                                    if (c252709vu10 != null) {
                                        c252709vu10.setAlpha(0.0f);
                                        return;
                                    } else {
                                        o.LJIJI("navBar");
                                        throw null;
                                    }
                                }
                                o.LJIJI("navBar");
                                throw null;
                            }
                        };
                        C2K0 LIZ = C55096Ljo.LIZ(LIZJ2, PageHeaderScrollAbility.class, null);
                        if (LIZ == null) {
                            C55096Ljo.LJIIJJI(LIZJ2, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null);
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
                                C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance, PageHeaderScrollAbility.class, null);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                        }
                    }
                    return;
                }
                o.LJIJI("navBar");
                throw null;
            }
            o.LJIJI("navBar");
            throw null;
        }
        o.LJIJI("navBar");
        throw null;
    }
}
