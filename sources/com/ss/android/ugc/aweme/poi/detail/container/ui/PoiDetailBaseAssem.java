package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C16880lQ;
import X.C212428Vi;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.EV9;
import X.InterfaceC55235Lm3;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class PoiDetailBaseAssem extends DynamicAssem implements RefreshAbility {
    public View LJLJLLL;
    public ViewGroup LJLL;

    public abstract boolean L3();

    public PoiDetailBaseAssem() {
        new LinkedHashMap();
    }

    public final void M3(boolean z) {
        if (!isContainerViewAssigned()) {
            return;
        }
        ViewGroup viewGroup = this.LJLL;
        int i = 8;
        if (viewGroup != null) {
            if (z) {
                i = 0;
            }
            viewGroup.setVisibility(i);
        } else {
            View x3 = x3();
            if (z) {
                i = 0;
            }
            x3.setVisibility(i);
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        ViewGroup viewGroup2 = null;
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, RefreshAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, RefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                    }
                }
            }
        }
        if (L3() && isContainerViewAssigned()) {
            View containerView = getContainerView();
            if ((containerView instanceof ViewGroup) && (viewGroup = (ViewGroup) containerView) != null) {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.c0o, viewGroup, false);
                if (LLLLIILL instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) LLLLIILL;
                }
                this.LJLL = viewGroup2;
                if (viewGroup2 != null) {
                    viewGroup.removeAllViews();
                    viewGroup2.addView(x3(), 0);
                    viewGroup.addView(viewGroup2);
                    this.LJLJLLL = viewGroup2.findViewById(R.id.htu);
                }
            }
        }
    }
}
