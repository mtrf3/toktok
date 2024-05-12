package com.ss.android.ugc.aweme.detail.prefab;

import X.C07G;
import X.C113554cx;
import X.C212428Vi;
import X.C226608uu;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.OSZ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class DetailPageContentAssem extends DynamicAssem {
    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return C113554cx.LJJL(new OSZ("header", Integer.valueOf(R.id.c99)), new OSZ("content", Integer.valueOf(R.id.c9_)));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public DetailPageContentAssem() {
        new LinkedHashMap();
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        ViewGroup viewGroup;
        Context context = getContext();
        if (context == null) {
            return;
        }
        C226608uu c226608uu = new C226608uu(context);
        c226608uu.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        E3(c226608uu);
        View x3 = x3();
        if ((x3 instanceof ViewGroup) && (viewGroup = (ViewGroup) x3) != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout.setId(R.id.c99);
            viewGroup.addView(frameLayout);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            frameLayout2.setId(R.id.c9_);
            viewGroup.addView(frameLayout2);
        }
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        final C226608uu c226608uu;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            final InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            if (!(view instanceof C226608uu) || (c226608uu = (C226608uu) view) == null) {
                return;
            }
            PageScrollAbility pageScrollAbility = new PageScrollAbility() { // from class: com.ss.android.ugc.aweme.detail.prefab.DetailPageContentAssem$onViewCreated$1
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility
                public final int jk0(int i) {
                    PageHeaderScrollAbility pageHeaderScrollAbility;
                    int LJIJJ = C226608uu.this.LJIJJ(i);
                    if (LJIJJ < i && (pageHeaderScrollAbility = (PageHeaderScrollAbility) C55096Ljo.LIZ(LIZJ, PageHeaderScrollAbility.class, null)) != null) {
                        pageHeaderScrollAbility.SQ(C226608uu.this.getTotalScrollY());
                    }
                    return LJIJJ;
                }
            };
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PageScrollAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, pageScrollAbility, PageScrollAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(pageScrollAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(pageScrollAbility);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(PageScrollAbility.class.getClassLoader(), new Class[]{PageScrollAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageScrollAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageScrollAbility");
                    }
                }
            }
            c226608uu.setOnScrollChangeListener(new C07G() { // from class: X.7P4
                @Override // X.C07G
                public final void LIZ(C45631qh c45631qh, int i, int i2, int i3, int i4) {
                    o.LJIIIZ(c45631qh, "<anonymous parameter 0>");
                    PageHeaderScrollAbility pageHeaderScrollAbility = (PageHeaderScrollAbility) C55096Ljo.LIZ(InterfaceC55235Lm3.this, PageHeaderScrollAbility.class, null);
                    if (pageHeaderScrollAbility != null) {
                        pageHeaderScrollAbility.SQ(i2);
                    }
                }
            });
        }
    }
}
