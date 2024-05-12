package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C189127bY;
import X.C212428Vi;
import X.C2K0;
import X.C2L4;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C76965UIn;
import X.C8VC;
import X.C8VV;
import X.EV9;
import X.InterfaceC189137bZ;
import X.InterfaceC55235Lm3;
import X.O6R;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailScope;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailBottomBarAssem extends PoiDetailBaseAssem implements C2L4 {
    public boolean LJLLI;
    public boolean LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean L3() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0h;
    }

    public PoiDetailBottomBarAssem() {
        new LinkedHashMap();
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(PoiDetailScope.class);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility = new PoiDetailInfoRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem$onViewCreated$1
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void fr(PoiListApi.PoiDetailResponse poiDetailResponse, Exception e) {
                    o.LJIIIZ(e, "e");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void RD(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
                    if (poiDetailResponse != null) {
                        PoiDetailBottomBarAssem poiDetailBottomBarAssem = PoiDetailBottomBarAssem.this;
                        if (poiDetailBottomBarAssem.LJLLILLLL) {
                            return;
                        }
                        poiDetailBottomBarAssem.LJLLILLLL = true;
                        C8VV.LIZJ(poiDetailBottomBarAssem, new AqS134S0200000_3(poiDetailBottomBarAssem, poiDetailResponse, 24));
                    }
                }
            };
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PoiDetailInfoRefreshAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, poiDetailInfoRefreshAbility, PoiDetailInfoRefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(poiDetailInfoRefreshAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(poiDetailInfoRefreshAbility);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(PoiDetailInfoRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailInfoRefreshAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PoiDetailInfoRefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility");
                    }
                }
            }
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LIZLLL2, null);
            PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem$onViewCreated$2
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                public final void SQ(int i) {
                    float LJIIZILJ;
                    if (i > O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))) {
                        LJIIZILJ = 1.0f;
                    } else {
                        LJIIZILJ = i / C32151Nz.LJIIZILJ(52);
                    }
                    PoiDetailBottomBarAssem.this.getContainerView().setAlpha(LJIIZILJ);
                    if (LJIIZILJ >= 0.8f) {
                        IPoiDetailFavoriteBottomVAbility iPoiDetailFavoriteBottomVAbility = (IPoiDetailFavoriteBottomVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(PoiDetailBottomBarAssem.this), IPoiDetailFavoriteBottomVAbility.class, null);
                        if (iPoiDetailFavoriteBottomVAbility != null) {
                            iPoiDetailFavoriteBottomVAbility.C2();
                        }
                        PoiDetailBottomBarAssem.this.getContainerView().setClickable(true);
                    } else {
                        IPoiDetailFavoriteBottomVAbility iPoiDetailFavoriteBottomVAbility2 = (IPoiDetailFavoriteBottomVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(PoiDetailBottomBarAssem.this), IPoiDetailFavoriteBottomVAbility.class, null);
                        if (iPoiDetailFavoriteBottomVAbility2 != null) {
                            iPoiDetailFavoriteBottomVAbility2.jv();
                        }
                        PoiDetailBottomBarAssem.this.getContainerView().setClickable(false);
                    }
                    if (LJIIZILJ >= 1.0f) {
                        PoiDetailBottomBarAssem poiDetailBottomBarAssem = PoiDetailBottomBarAssem.this;
                        if (!poiDetailBottomBarAssem.LJLLI) {
                            poiDetailBottomBarAssem.LJLLI = true;
                            C189127bY.LIZJ((InterfaceC189137bZ) C8VC.LIZIZ(poiDetailBottomBarAssem, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), null, "click_banner", null, 12);
                        }
                    }
                }
            };
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, PageHeaderScrollAbility.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZJ2, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler2 instanceof EV9) {
                        ((EV9) invocationHandler2).LIZ.add(pageHeaderScrollAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused2) {
                    EV9 ev92 = new EV9();
                    ev92.LIZ.add(pageHeaderScrollAbility);
                    ev92.LIZ.add(LIZ2);
                    Object newProxyInstance2 = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev92);
                    if (newProxyInstance2 != null) {
                        C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, PageHeaderScrollAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                    }
                }
            }
        }
        getContainerView().setAlpha(0.0f);
    }
}
