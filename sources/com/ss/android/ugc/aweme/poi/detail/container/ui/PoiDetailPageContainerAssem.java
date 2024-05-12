package com.ss.android.ugc.aweme.poi.detail.container.ui;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C212428Vi;
import X.C221108m2;
import X.C223318pb;
import X.C2K0;
import X.C2NU;
import X.C40443Fu3;
import X.C48202Ivu;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C73969T1h;
import X.C7SW;
import X.C7XM;
import X.C8BJ;
import X.C8VL;
import X.C8VV;
import X.EV9;
import X.EnumC80902Vp4;
import X.InterfaceC55057LjB;
import X.InterfaceC55235Lm3;
import X.InterfaceC69602oG;
import X.InterfaceC92693kP;
import X.OSZ;
import X.X1D;
import Y.IDxS304S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailPageContainerAssem;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber;
import com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailPageContainerAssem extends DynamicAssem implements RefreshSuccessSubscriber, RefreshErrorSubscriber, RefreshLoadingSubscriber {
    public static final Map<String, Integer> LJLLLL = C113554cx.LJJL(new OSZ("navbar", Integer.valueOf(R.id.gwg)), new OSZ("status", Integer.valueOf(R.id.ked)), new OSZ("bottom_bar", Integer.valueOf(R.id.aot)));
    public C223318pb LJLJLLL;
    public InterfaceC55057LjB LJLL;
    public final C62822Ol8 LJLLI;
    public long LJLLILLLL;
    public InterfaceC92693kP LJLLJ;
    public C7XM LJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bzx;
    }

    public PoiDetailPageContainerAssem() {
        new LinkedHashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 725));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        String str = (String) this.LJLLI.getValue();
        if (str != null) {
            C7SW.LIZ("detail_page_init", str);
            C7SW.LIZLLL("detail_container_init", str);
        }
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void pN() {
        if (this.LJLLI.getValue() != null) {
            InterfaceC55057LjB interfaceC55057LjB = this.LJLL;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.LJIIIZ();
            } else {
                o.LJIJI("fpsMonitor");
                throw null;
            }
        }
        L3(true);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final void H3() {
        Map<String, C8VL> map = getConfig().LJIIIZ;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : LJLLLL.entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            C8VL c8vl = map.get(key);
            if (c8vl != null) {
                c8vl.LJI = intValue;
                arrayList.add(c8vl);
            }
        }
        C8VV.LIZJ(this, new AqS107S0300000_3(this, (PoiDetailPageContainerAssem) arrayList, (List<C8VL>) map, (Map<String, C8VL>) 18));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public final void J80() {
        this.LJLLILLLL = System.currentTimeMillis();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC92693kP interfaceC92693kP = this.LJLLJ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.7XM] */
    public final void L3(boolean z) {
        long j;
        if (z) {
            C223318pb c223318pb = this.LJLJLLL;
            if (c223318pb != null) {
                c223318pb.setRefreshing(false);
                return;
            } else {
                o.LJIJI("refreshLayout");
                throw null;
            }
        }
        this.LJLLL = new InterfaceC69602oG() { // from class: X.7XM
            @Override // X.InterfaceC69602oG
            public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt currentType) {
                RefreshAbility refreshAbility;
                o.LJIIIZ(currentType, "currentType");
                if (currentType == EnumC111394Yt.AVAILABLE) {
                    Fragment LIZLLL = C212428Vi.LIZLLL(PoiDetailPageContainerAssem.this);
                    if (LIZLLL != null && (refreshAbility = (RefreshAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), RefreshAbility.class, null)) != null) {
                        refreshAbility.refresh();
                    }
                    InterfaceC92693kP interfaceC92693kP = PoiDetailPageContainerAssem.this.LJLLJ;
                    if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
                        interfaceC92693kP.dispose();
                    }
                    C48202Ivu c48202Ivu = C2NU.LIZ;
                    C7XM c7xm = PoiDetailPageContainerAssem.this.LJLLL;
                    if (c7xm != null) {
                        c48202Ivu.LIZLLL(c7xm);
                    } else {
                        o.LJIJI("retryEvent");
                        throw null;
                    }
                }
            }
        };
        long currentTimeMillis = System.currentTimeMillis() - this.LJLLILLLL;
        if (currentTimeMillis > 2000) {
            j = 0;
        } else {
            C48202Ivu c48202Ivu = C2NU.LIZ;
            C7XM c7xm = this.LJLLL;
            if (c7xm != null) {
                c48202Ivu.LIZ(c7xm);
                j = LiveNetAdaptiveHurryTimeSetting.DEFAULT - currentTimeMillis;
            } else {
                o.LJIJI("retryEvent");
                throw null;
            }
        }
        AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(C73969T1h.LIZIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS304S0100000_3(this, 1));
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        String str = (String) this.LJLLI.getValue();
        if (str != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append("_detail_static_fps");
            InterfaceC55057LjB LIZ2 = C40443Fu3.LIZ(X1D.LIZIZ(LIZ));
            this.LJLL = LIZ2;
            LIZ2.start();
        }
        assembleChildren();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            View findViewById = x3().findViewById(R.id.itq);
            o.LJIIIIZZ(findViewById, "contentView.findViewById(R.id.refresh_layout)");
            this.LJLJLLL = (C223318pb) findViewById;
            if (C55096Ljo.LIZ(LIZJ, RefreshAbility.class, null) == null) {
                C223318pb c223318pb = this.LJLJLLL;
                if (c223318pb != null) {
                    c223318pb.setScrollMode(C8BJ.NONE);
                    C223318pb c223318pb2 = this.LJLJLLL;
                    if (c223318pb2 != null) {
                        c223318pb2.setOverScrollMode(EnumC80902Vp4.NONE);
                        C223318pb c223318pb3 = this.LJLJLLL;
                        if (c223318pb3 != null) {
                            c223318pb3.setNestedHeader(null);
                        } else {
                            o.LJIJI("refreshLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("refreshLayout");
                        throw null;
                    }
                } else {
                    o.LJIJI("refreshLayout");
                    throw null;
                }
            }
            C223318pb c223318pb4 = this.LJLJLLL;
            if (c223318pb4 != null) {
                c223318pb4.setOnRefreshListener(new AqS153S0100000_3(LIZJ, 726));
                if (o.LJ(String.valueOf(getConfig().LJ.get("prop_disable_refresh")), "true")) {
                    C223318pb c223318pb5 = this.LJLJLLL;
                    if (c223318pb5 != null) {
                        c223318pb5.setOverScrollMode(EnumC80902Vp4.NONE);
                        C223318pb c223318pb6 = this.LJLJLLL;
                        if (c223318pb6 != null) {
                            c223318pb6.setScrollMode(C8BJ.NONE);
                            C223318pb c223318pb7 = this.LJLJLLL;
                            if (c223318pb7 != null) {
                                c223318pb7.setNestedHeader(null);
                            } else {
                                o.LJIJI("refreshLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("refreshLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("refreshLayout");
                        throw null;
                    }
                }
                C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ, RefreshSuccessSubscriber.class, null);
                if (LIZ3 == null) {
                    C55096Ljo.LJIIJJI(LIZJ, this, RefreshSuccessSubscriber.class, null);
                } else {
                    try {
                        InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ3);
                        if (invocationHandler instanceof EV9) {
                            ((EV9) invocationHandler).LIZ.add(this);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException unused) {
                        EV9 ev9 = new EV9();
                        ev9.LIZ.add(this);
                        ev9.LIZ.add(LIZ3);
                        Object newProxyInstance = Proxy.newProxyInstance(RefreshSuccessSubscriber.class.getClassLoader(), new Class[]{RefreshSuccessSubscriber.class}, ev9);
                        if (newProxyInstance != null) {
                            C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, RefreshSuccessSubscriber.class, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber");
                        }
                    }
                }
                C2K0 LIZ4 = C55096Ljo.LIZ(LIZJ, RefreshErrorSubscriber.class, null);
                if (LIZ4 == null) {
                    C55096Ljo.LJIIJJI(LIZJ, this, RefreshErrorSubscriber.class, null);
                } else {
                    try {
                        InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ4);
                        if (invocationHandler2 instanceof EV9) {
                            ((EV9) invocationHandler2).LIZ.add(this);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException unused2) {
                        EV9 ev92 = new EV9();
                        ev92.LIZ.add(this);
                        ev92.LIZ.add(LIZ4);
                        Object newProxyInstance2 = Proxy.newProxyInstance(RefreshErrorSubscriber.class.getClassLoader(), new Class[]{RefreshErrorSubscriber.class}, ev92);
                        if (newProxyInstance2 != null) {
                            C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance2, RefreshErrorSubscriber.class, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber");
                        }
                    }
                }
                C2K0 LIZ5 = C55096Ljo.LIZ(LIZJ, RefreshLoadingSubscriber.class, null);
                if (LIZ5 == null) {
                    C55096Ljo.LJIIJJI(LIZJ, this, RefreshLoadingSubscriber.class, null);
                } else {
                    try {
                        InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ5);
                        if (invocationHandler3 instanceof EV9) {
                            ((EV9) invocationHandler3).LIZ.add(this);
                        } else {
                            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                        }
                    } catch (IllegalArgumentException unused3) {
                        EV9 ev93 = new EV9();
                        ev93.LIZ.add(this);
                        ev93.LIZ.add(LIZ5);
                        Object newProxyInstance3 = Proxy.newProxyInstance(RefreshLoadingSubscriber.class.getClassLoader(), new Class[]{RefreshLoadingSubscriber.class}, ev93);
                        if (newProxyInstance3 != null) {
                            C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance3, RefreshLoadingSubscriber.class, null);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber");
                        }
                    }
                }
                String str2 = (String) this.LJLLI.getValue();
                if (str2 != null) {
                    C7SW.LIZ("detail_container_init", str2);
                    C7SW.LIZLLL("detail_prepare_network", str2);
                    return;
                }
                return;
            }
            o.LJIJI("refreshLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public final void s6(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (this.LJLLI.getValue() != null) {
            InterfaceC55057LjB interfaceC55057LjB = this.LJLL;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.LJIIIZ();
            } else {
                o.LJIJI("fpsMonitor");
                throw null;
            }
        }
        L3(false);
    }
}
