package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.C16880lQ;
import X.C186537Tt;
import X.C188967bI;
import X.C188977bJ;
import X.C189127bY;
import X.C190497dl;
import X.C212428Vi;
import X.C2K0;
import X.C2UV;
import X.C32151Nz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78966Uyw;
import X.C8VC;
import X.C8VV;
import X.C98T;
import X.C9BE;
import X.EV9;
import X.InterfaceC189137bZ;
import X.InterfaceC55235Lm3;
import X.O6R;
import Y.ACListenerS23S0100000_3;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailVideoListRefreshAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailNavBar;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class PoiDetailNavBar extends DynamicAssem {
    public TextView LJLJLLL;
    public FrameLayout LJLL;
    public TuxIconView LJLLI;
    public final C55749LuL LJLLILLLL;
    public PoiDetailVideoListModel LJLLJ;
    public PoiListApi.PoiDetailResponse LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.c0k;
    }

    public PoiDetailNavBar() {
        new LinkedHashMap();
        this.LJLLILLLL = new C55749LuL(C47704Ins.LIZJ(this, C190497dl.class, "PoiVideoListHierarchyData"), checkSupervisorPrepared());
        this.LJLLLL = true;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectStatusViewModel.class);
        C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 724), C188967bI.INSTANCE, null);
    }

    public final C190497dl L3() {
        return (C190497dl) this.LJLLILLLL.getValue();
    }

    public final void M3() {
        final PoiDetailVideoListModel poiDetailVideoListModel;
        long j;
        final PoiListApi.PoiDetailResponse poiDetailResponse = this.LJLLL;
        if (poiDetailResponse != null && (poiDetailVideoListModel = this.LJLLJ) != null && !C78966Uyw.LJJIJ().LIZIZ() && this.LJLLLL) {
            String str = L3().LJLJLJ;
            List<Aweme> list = poiDetailVideoListModel.awemes;
            Long l = poiDetailResponse.videoCount;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            ((LruCache) C188977bJ.LIZ.getValue()).put(str, new C2UV(j, list, poiDetailResponse.LJIIIZ()));
            this.LJLLLL = false;
            TuxIconView tuxIconView = this.LJLLI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = this.LJLLI;
                if (tuxIconView2 != null) {
                    C16880lQ.LJIIJ(new C98T() { // from class: X.7dg
                        @Override // X.C98T
                        public final void LIZ(View view) {
                            ActivityC45651qj LJIIIIZZ;
                            String str2;
                            String str3;
                            String str4;
                            String str5;
                            long j2;
                            String str6;
                            String str7;
                            String str8;
                            String str9;
                            String poiRegionCode;
                            String str10;
                            Object LIZ;
                            String collectInfo;
                            Object opt;
                            if (view != null && (LJIIIIZZ = C55096Ljo.LJIIIIZZ(PoiDetailNavBar.this)) != null) {
                                PoiDetailNavBar poiDetailNavBar = PoiDetailNavBar.this;
                                PoiListApi.PoiDetailResponse poiDetailResponse2 = poiDetailResponse;
                                String str11 = "";
                                if (poiDetailResponse2 == null) {
                                    str2 = "";
                                } else {
                                    str2 = poiDetailResponse2.LJIIIZ();
                                }
                                poiDetailNavBar.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("enter_from", "poi_detail");
                                String str12 = poiDetailNavBar.L3().LJLJLJ;
                                if (str12 == null) {
                                    str12 = "";
                                }
                                linkedHashMap.put("poi_id", str12);
                                PoiAnchorData poiAnchorData = poiDetailNavBar.L3().LJLJI;
                                if (poiAnchorData == null || (str3 = poiAnchorData.getPoiCityCode()) == null) {
                                    str3 = "";
                                }
                                linkedHashMap.put("poi_city", str3);
                                PoiAnchorData poiAnchorData2 = poiDetailNavBar.L3().LJLJI;
                                if (poiAnchorData2 == null || (str4 = poiAnchorData2.getPoiRegionCode()) == null) {
                                    str4 = "";
                                }
                                linkedHashMap.put("poi_region_code", str4);
                                linkedHashMap.put("poi_info_source", "google");
                                String str13 = poiDetailNavBar.L3().LJLILLLLZI;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                linkedHashMap.put("previous_page", str13);
                                linkedHashMap.put("is_claimed", str2);
                                linkedHashMap.putAll(LocationServiceImpl.LJIJJ().getLocationCommonParamsIfHave());
                                PoiAnchorData poiAnchorData3 = poiDetailNavBar.L3().LJLJI;
                                if (poiAnchorData3 != null && (collectInfo = poiAnchorData3.getCollectInfo()) != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(collectInfo);
                                        Iterator<String> keys = jSONObject.keys();
                                        o.LJIIIIZZ(keys, "jsonObject.keys()");
                                        while (keys.hasNext()) {
                                            String key = keys.next();
                                            if (C78685UuP.LJJJZ(key) && (opt = jSONObject.opt(key)) != null) {
                                                o.LJIIIIZZ(key, "key");
                                                linkedHashMap.put(key, opt.toString());
                                            }
                                        }
                                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                                    } catch (Throwable th) {
                                        C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                    }
                                }
                                FMX.LJIIL("click_share_poi_button", linkedHashMap);
                                PoiDetailNavBar poiDetailNavBar2 = PoiDetailNavBar.this;
                                PoiListApi.PoiDetailResponse poiDetailResponse3 = poiDetailResponse;
                                PoiDetailVideoListModel poiDetailVideoListModel2 = poiDetailVideoListModel;
                                poiDetailNavBar2.getClass();
                                Bundle bundle = new Bundle();
                                PoiListApi.PoiDetailResponse poiDetailResponse4 = poiDetailNavBar2.LJLLL;
                                if (poiDetailResponse4 != null && (str10 = poiDetailResponse4.collectInfo) != null) {
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(str10);
                                        Iterator<String> keys2 = jSONObject2.keys();
                                        o.LJIIIIZZ(keys2, "info.keys()");
                                        while (keys2.hasNext()) {
                                            String next = keys2.next();
                                            if (C78685UuP.LJJJZ(next)) {
                                                bundle.putString(next, jSONObject2.get(next).toString());
                                            }
                                        }
                                        LIZ = C76800UCe.LIZ;
                                        C3C5.m7constructorimpl(LIZ);
                                    } catch (Throwable th2) {
                                        LIZ = C141335gf.LIZ(th2);
                                        C3C5.m7constructorimpl(LIZ);
                                    }
                                    C3C5.m6boximpl(LIZ);
                                }
                                PoiAnchorData poiAnchorData4 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData4 == null || (str5 = poiAnchorData4.getFromGroupId()) == null) {
                                    str5 = "";
                                }
                                bundle.putString("from_group_id", str5);
                                bundle.putString("poi_detail_type", poiDetailResponse3.LJIIJJI());
                                bundle.putString("is_claimed", poiDetailResponse3.LJIIIZ());
                                ShareService shareService = C4LD.LIZ;
                                String str14 = poiDetailNavBar2.L3().LJLJLJ;
                                if (str14 == null) {
                                    str14 = "";
                                }
                                String str15 = poiDetailResponse3.name;
                                if (str15 == null) {
                                    str15 = "";
                                }
                                Long l2 = poiDetailResponse3.videoCount;
                                if (l2 != null) {
                                    j2 = l2.longValue();
                                } else {
                                    j2 = 0;
                                }
                                List list2 = poiDetailVideoListModel2.awemes;
                                if (list2 == null) {
                                    list2 = C61878OQg.INSTANCE;
                                }
                                PoiAnchorData poiAnchorData5 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData5 == null || (str6 = poiAnchorData5.getPoiCityCode()) == null) {
                                    str6 = "";
                                }
                                PoiAnchorData poiAnchorData6 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData6 == null || (str7 = poiAnchorData6.getPoiRegionCode()) == null) {
                                    str7 = "";
                                }
                                PoiAnchorData poiAnchorData7 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData7 == null || (str8 = poiAnchorData7.getPoiInfoSource()) == null) {
                                    str8 = "";
                                }
                                boolean LIZIZ = C85256Xd6.LIZIZ(LJIIIIZZ);
                                String str16 = poiDetailNavBar2.L3().LJLILLLLZI;
                                if (str16 == null) {
                                    str16 = "";
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                PoiAnchorData poiAnchorData8 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData8 == null || (str9 = poiAnchorData8.getPoiCityCode()) == null) {
                                    str9 = "";
                                }
                                jSONObject3.put("poi_city", str9);
                                PoiAnchorData poiAnchorData9 = poiDetailNavBar2.L3().LJLJI;
                                if (poiAnchorData9 != null && (poiRegionCode = poiAnchorData9.getPoiRegionCode()) != null) {
                                    str11 = poiRegionCode;
                                }
                                jSONObject3.put("poi_region_code", str11);
                                String jSONObject4 = jSONObject3.toString();
                                o.LJIIIIZZ(jSONObject4, "JSONObject().apply {\n   …             }.toString()");
                                shareService.LJJJIL(LJIIIIZZ, new C193597il("poi_detail", str14, str15, j2, list2, str6, str7, str8, LIZIZ ? 1 : 0, str16, jSONObject4, bundle, poiDetailResponse3.editPoiStatus, poiDetailResponse3.isBaAccount, poiDetailResponse3.claimStoreStatus, poiDetailResponse3.shareInfo));
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, tuxIconView2);
                    return;
                } else {
                    o.LJIJI("btnShare");
                    throw null;
                }
            }
            o.LJIJI("btnShare");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 121), view.findViewById(R.id.aeg));
        View findViewById = view.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.name)");
        this.LJLJLLL = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.dd0);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.fl_collect_container)");
        this.LJLL = (FrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.ech);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.icon_share)");
        this.LJLLI = (TuxIconView) findViewById3;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            PageHeaderScrollAbility pageHeaderScrollAbility = new PageHeaderScrollAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailNavBar$onViewCreated$2
                @Override // com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility
                public final void SQ(int i) {
                    float LJIIZILJ;
                    if (i > O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))) {
                        LJIIZILJ = 1.0f;
                    } else {
                        LJIIZILJ = i / C32151Nz.LJIIZILJ(52);
                    }
                    TextView textView = PoiDetailNavBar.this.LJLJLLL;
                    if (textView != null) {
                        textView.setAlpha(LJIIZILJ);
                        FrameLayout frameLayout = PoiDetailNavBar.this.LJLL;
                        if (frameLayout != null) {
                            frameLayout.setAlpha(LJIIZILJ);
                            if (!C186537Tt.LIZ() && LJIIZILJ >= 1.0f) {
                                PoiDetailNavBar poiDetailNavBar = PoiDetailNavBar.this;
                                if (!poiDetailNavBar.LJLLLLLL) {
                                    poiDetailNavBar.LJLLLLLL = true;
                                    C189127bY.LIZJ((InterfaceC189137bZ) C8VC.LIZIZ(poiDetailNavBar, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), null, "click_banner", null, 12);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        o.LJIJI("flPoiCollect");
                        throw null;
                    }
                    o.LJIJI("tvPoiName");
                    throw null;
                }
            };
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, PageHeaderScrollAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, pageHeaderScrollAbility, PageHeaderScrollAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(pageHeaderScrollAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(pageHeaderScrollAbility);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(PageHeaderScrollAbility.class.getClassLoader(), new Class[]{PageHeaderScrollAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, PageHeaderScrollAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility");
                    }
                }
            }
        }
        Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
        if (LIZLLL2 != null) {
            InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(LIZLLL2, null);
            PoiDetailInfoRefreshAbility poiDetailInfoRefreshAbility = new PoiDetailInfoRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailNavBar$onViewCreated$3
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void fr(PoiListApi.PoiDetailResponse poiDetailResponse, Exception e) {
                    o.LJIIIZ(e, "e");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility
                public final void RD(PoiListApi.PoiDetailResponse poiDetailResponse, boolean z) {
                    PoiDetailNavBar poiDetailNavBar = PoiDetailNavBar.this;
                    poiDetailNavBar.LJLLL = poiDetailResponse;
                    poiDetailNavBar.M3();
                    TextView textView = PoiDetailNavBar.this.LJLJLLL;
                    String str = null;
                    if (textView != null) {
                        if (poiDetailResponse != null) {
                            str = poiDetailResponse.name;
                        }
                        textView.setText(str);
                        if (!C186537Tt.LIZ() && poiDetailResponse != null) {
                            PoiDetailNavBar poiDetailNavBar2 = PoiDetailNavBar.this;
                            C8VV.LIZJ(poiDetailNavBar2, new AqS134S0200000_3(poiDetailNavBar2, poiDetailResponse, LiveTryModeCountDownThresholdSetting.DEFAULT));
                            return;
                        }
                        return;
                    }
                    o.LJIJI("tvPoiName");
                    throw null;
                }
            };
            C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, PoiDetailInfoRefreshAbility.class, null);
            if (LIZ2 == null) {
                C55096Ljo.LJIIJJI(LIZJ2, poiDetailInfoRefreshAbility, PoiDetailInfoRefreshAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                    if (invocationHandler2 instanceof EV9) {
                        ((EV9) invocationHandler2).LIZ.add(poiDetailInfoRefreshAbility);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused2) {
                    EV9 ev92 = new EV9();
                    ev92.LIZ.add(poiDetailInfoRefreshAbility);
                    ev92.LIZ.add(LIZ2);
                    Object newProxyInstance2 = Proxy.newProxyInstance(PoiDetailInfoRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailInfoRefreshAbility.class}, ev92);
                    if (newProxyInstance2 != null) {
                        C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, PoiDetailInfoRefreshAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailInfoRefreshAbility");
                    }
                }
            }
        }
        Fragment LIZLLL3 = C212428Vi.LIZLLL(this);
        if (LIZLLL3 != null) {
            InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(LIZLLL3, null);
            PoiDetailVideoListRefreshAbility poiDetailVideoListRefreshAbility = new PoiDetailVideoListRefreshAbility() { // from class: com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailNavBar$onViewCreated$4
                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailVideoListRefreshAbility
                public final void di(int i, Exception e) {
                    o.LJIIIZ(e, "e");
                }

                @Override // com.ss.android.ugc.aweme.poi.detail.container.PoiDetailVideoListRefreshAbility
                public final void Fn(PoiDetailVideoListModel poiDetailVideoListModel, int i) {
                    PoiDetailNavBar poiDetailNavBar = PoiDetailNavBar.this;
                    poiDetailNavBar.LJLLJ = poiDetailVideoListModel;
                    poiDetailNavBar.M3();
                }
            };
            C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ3, PoiDetailVideoListRefreshAbility.class, null);
            if (LIZ3 == null) {
                C55096Ljo.LJIIJJI(LIZJ3, poiDetailVideoListRefreshAbility, PoiDetailVideoListRefreshAbility.class, null);
                return;
            }
            try {
                InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ3);
                if (invocationHandler3 instanceof EV9) {
                    ((EV9) invocationHandler3).LIZ.add(poiDetailVideoListRefreshAbility);
                    return;
                }
                throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
            } catch (IllegalArgumentException unused3) {
                EV9 ev93 = new EV9();
                ev93.LIZ.add(poiDetailVideoListRefreshAbility);
                ev93.LIZ.add(LIZ3);
                Object newProxyInstance3 = Proxy.newProxyInstance(PoiDetailVideoListRefreshAbility.class.getClassLoader(), new Class[]{PoiDetailVideoListRefreshAbility.class}, ev93);
                if (newProxyInstance3 != null) {
                    C55096Ljo.LJIIJJI(LIZJ3, (C2K0) newProxyInstance3, PoiDetailVideoListRefreshAbility.class, null);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.detail.container.PoiDetailVideoListRefreshAbility");
            }
        }
    }
}
