package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C2068389v;
import X.C212428Vi;
import X.C2K0;
import X.C55096Ljo;
import X.C55230Lly;
import X.C73305Spp;
import X.C73306Spq;
import X.EV9;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailStatusViewAssem extends DetailPageStatusViewAssem implements OnPoiOfflineAbility {
    public PoiDetailStatusViewAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.OnPoiOfflineAbility
    public final void PH() {
        String string;
        C73305Spp c73305Spp = this.LJLLI;
        if (c73305Spp != null) {
            c73305Spp.setOnTouchListener(new View.OnTouchListener() { // from class: X.7Sd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return true;
                }
            });
        }
        Context context = getContext();
        String str = null;
        if (context != null) {
            str = context.getString(R.string.p49);
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.p48)) != null) {
            str2 = string;
        }
        C73305Spp c73305Spp2 = this.LJLLI;
        if (c73305Spp2 != null) {
            c73305Spp2.setVisibility(0);
        }
        C73305Spp c73305Spp3 = this.LJLLI;
        if (c73305Spp3 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_large_map_pin;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZJ = 0;
            c73306Spq.LIZIZ = c2068389v;
            c73306Spq.LJFF = str;
            c73306Spq.LJI = str2;
            c73306Spq.LJII = new AqS169S0100000_3(this, 385);
            c73305Spp3.setStatus(c73306Spq);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, OnPoiOfflineAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, OnPoiOfflineAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(this);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(this);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(OnPoiOfflineAbility.class.getClassLoader(), new Class[]{OnPoiOfflineAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, OnPoiOfflineAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.ui.OnPoiOfflineAbility");
            }
        }
    }
}
