package com.ss.android.ugc.aweme.poi.collect.collectassem;

import X.C110614Vt;
import X.C189097bV;
import X.C189127bY;
import X.C2068389v;
import X.C212428Vi;
import X.C221108m2;
import X.C2K0;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C9BE;
import X.EV9;
import X.InterfaceC189137bZ;
import X.InterfaceC55235Lm3;
import X.O6R;
import X.X1D;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class PoiCollectStatusRedBtnRegionHeaderAssem extends PoiCollectStatusBaseAssem {
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0b;
    }

    public PoiCollectStatusRedBtnRegionHeaderAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiDetailInfoViewModel.class);
        C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 693), C189097bV.INSTANCE, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 690));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 691));
        this.LJLZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 692));
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final View L3() {
        Object value = this.LJLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectContainer>(...)");
        return (View) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final TuxIconView N3() {
        Object value = this.LJLLLLLL.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectIcon>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView U3() {
        Object value = this.LJLZ.getValue();
        o.LJIIIIZZ(value, "<get-poiCollectText>(...)");
        return (TuxTextView) value;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final String I3() {
        return M3().LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void P3(boolean z) {
        C189127bY.LIZIZ((InterfaceC189137bZ) C8VC.LIZIZ(this, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), z, "click_button");
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem
    public final void R3(boolean z) {
        if (z) {
            View L3 = L3();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            Context context = L3().getContext();
            o.LJIIIIZZ(context, "poiCollectContainer.context");
            L3.setBackground(c110614Vt.LIZ(context));
            TuxIconView N3 = N3();
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_bookmark_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
            N3.setTuxIcon(c2068389v);
            U3().setText(R.string.oyx);
            U3().setTextColorRes(R.attr.go);
            return;
        }
        View L32 = L3();
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eb);
        c110614Vt2.LIZJ = Float.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        Context context2 = L3().getContext();
        o.LJIIIIZZ(context2, "poiCollectContainer.context");
        L32.setBackground(c110614Vt2.LIZ(context2));
        TuxIconView N32 = N3();
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_bookmark;
        c2068389v2.LJ = Integer.valueOf(R.attr.dj);
        c2068389v2.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        c2068389v2.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        N32.setTuxIcon(c2068389v2);
        U3().setText(R.string.oyw);
        U3().setTextColorRes(R.attr.dj);
    }

    @Override // com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility = new PoiDetailInfoRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusRedBtnRegionHeaderAssem$onViewCreated$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void RD(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
                    PoiCollectStatusRedBtnRegionHeaderAssem poiCollectStatusRedBtnRegionHeaderAssem = PoiCollectStatusRedBtnRegionHeaderAssem.this;
                    poiCollectStatusRedBtnRegionHeaderAssem.getClass();
                    C189127bY.LIZJ((InterfaceC189137bZ) C8VC.LIZIZ(poiCollectStatusRedBtnRegionHeaderAssem, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), null, "click_button", null, 13);
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void fr(PoiListApi.PoiDetailResponse poiDetailResponse, Exception e) {
                    String str;
                    o.LJIIIZ(e, "e");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onPoiDetailFailed, poi name: ");
                    if (poiDetailResponse != null) {
                        str = poiDetailResponse.name;
                    } else {
                        str = null;
                    }
                    LIZ.append(str);
                    X1D.LIZIZ(LIZ);
                }
            };
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PoiDetailInfoRefreshAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, poiDetailInfoRefreshAbility, PoiDetailInfoRefreshAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                if (invocationHandler instanceof EV9) {
                    ((EV9) invocationHandler).LIZ.add(poiDetailInfoRefreshAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused) {
                EV9 ev9 = new EV9();
                ev9.LIZ.add(poiDetailInfoRefreshAbility);
                ev9.LIZ.add(LIZ);
                Object newProxyInstance = Proxy.newProxyInstance(PoiDetailInfoRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailInfoRefreshAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PoiDetailInfoRefreshAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility");
            }
        }
    }
}
