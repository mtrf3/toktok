package com.ss.android.ugc.feed.platform.panel;

import X.C09900aA;
import X.C110624Vu;
import X.C212428Vi;
import X.C221108m2;
import X.C221138m5;
import X.C2K0;
import X.C2L4;
import X.C2MA;
import X.C37179EiV;
import X.C50420Jqa;
import X.C51781KTx;
import X.C51783KTz;
import X.C55096Ljo;
import X.C56912Lf;
import X.C5H3;
import X.C62822Ol8;
import X.C76965UIn;
import X.C79156V4u;
import X.C8W0;
import X.EnumC221088m0;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.JAK;
import X.KR5;
import X.KR8;
import X.KRA;
import X.KU0;
import X.KU1;
import X.KU4;
import X.KU5;
import X.KU9;
import X.KUD;
import X.KUI;
import X.OUP;
import X.WM7;
import X.X1D;
import Y.AObserverS62S0101000_8;
import Y.ARunnableS44S0100000_8;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.monitor.ComponentTraceVM;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.performance.ScopePerformanceVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS51S0110000_8;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class RootPanelComponent extends RootLifecycleBridgeComponent implements IRootAbility, InterfaceC55102Lju, C2L4 {
    public final C5H3 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        KUD.LIZIZ(getPanelContext(), new AqS174S0100000_8(this, 137), 2);
        View view = getSupervisor().LJLLL;
        if (view != null) {
            setContainerView(view);
            handleOnViewCreated(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        KUD.LIZIZ(getPanelContext(), new AqS174S0100000_8(this, 138), 2);
        super.onDestroy();
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 528344913) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RootPanelComponent() {
        C62822Ol8 c62822Ol8;
        new LinkedHashMap();
        if (JAK.LIZ()) {
            C221138m5 c221138m5 = new C221138m5(EnumC221088m0.PUBLICATION, new AqS154S0100000_4((KU4) this, 906), null);
            C51781KTx.LIZJ(this, c221138m5);
            c62822Ol8 = c221138m5;
        } else {
            c62822Ol8 = C221108m2.LIZIZ(new AqS61S0110000_4(false, (KU4) this, 5));
        }
        this.LJLJJL = c62822Ol8;
        this.LJLJJLL = C221108m2.LIZIZ(KUI.LJLIL);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 905));
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final KR5 N20() {
        IPanelConfigurationProtocol iPanelConfigurationProtocol = (IPanelConfigurationProtocol) this.LJLJLLL.getValue();
        if (iPanelConfigurationProtocol instanceof KR5) {
            return (KR5) iPanelConfigurationProtocol;
        }
        return null;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(RootPanelScope.class);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final C110624Vu wo() {
        return (C110624Vu) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        super.onCreate();
        KUD.LIZIZ(getPanelContext(), new AqS174S0100000_8(this, 136), 2);
        ConfigurationProtocol configurationProtocol = (ConfigurationProtocol) this.LJLJLLL.getValue();
        if (configurationProtocol != null) {
            configurationProtocol.LLLLLLLLL(this);
            AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
            if (LIZJ != null) {
                copyOnWriteArrayList = LIZJ.LJLLI;
            } else {
                copyOnWriteArrayList = null;
            }
            KRA panelContext = getPanelContext();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, panelContext.LIZ);
            int i = 0;
            jSONObject.put("status", 0);
            if (copyOnWriteArrayList != null) {
                i = copyOnWriteArrayList.size();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("count", i);
            C09900aA.LJI("root_component_load", jSONObject, jSONObject2, null);
            if (JAK.LIZ()) {
                C37179EiV.LJFF.post(new ARunnableS44S0100000_8(this, 165));
                return;
            }
            return;
        }
        "No configuration matching the PanelScene!".toString();
        throw new IllegalArgumentException("No configuration matching the PanelScene!");
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJLJ = true;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        this.LJLJLJ = false;
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
        KUD.LIZIZ(getPanelContext(), new AqS174S0100000_8(this, 139), 2);
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        KUD.LIZIZ(getPanelContext(), new AqS174S0100000_8(this, UserLevelGeckoUpdateSetting.DEFAULT), 2);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final boolean getUserVisibleHint() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final boolean isPanelPaused() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.KR6
    public final void N1(Bundle bundle) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreate():");
        LIZ.append(getPanelContext().LJ);
        KUD.LIZJ(X1D.LIZIZ(LIZ), null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        if (KR8.LJIIIZ(this)) {
            return;
        }
        OUP.LJJJ(this, "event_legacy_internal_video_event", c50420Jqa);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPagePause(int i) {
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        InterfaceC55235Lm3 LIZLLL;
        RootCellCommonAbility rootCellCommonAbility;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        int i2 = 0;
        setUserVisibleHint(false);
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KU4) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KU4) it2.next()).onPagePause(i);
            }
        }
        OUP.LJJJ(this, "event_on_page_pause", Integer.valueOf(i));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJL.getValue();
        if (C56912Lf.LIZ() && iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null && (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) != null && (LIZLLL = C79156V4u.LIZLLL(curViewHolder)) != null && (rootCellCommonAbility = (RootCellCommonAbility) C55096Ljo.LIZ(LIZLLL, RootCellCommonAbility.class, null)) != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 3;
                    }
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 1;
            }
            rootCellCommonAbility.et0(i2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4
    public final void onPageResume(int i) {
        IViewPagerComponentAbility viewPagerComponentAbility;
        C2MA curViewHolder;
        InterfaceC55235Lm3 LIZLLL;
        RootCellCommonAbility rootCellCommonAbility;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        int i2 = 1;
        setUserVisibleHint(true);
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KU4) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KU4) it2.next()).onPageResume(i);
            }
        }
        OUP.LJJJ(this, "event_on_page_resume", Integer.valueOf(i));
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJL.getValue();
        if (C56912Lf.LIZ() && iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null && (curViewHolder = viewPagerComponentAbility.getCurViewHolder()) != null && (LIZLLL = C79156V4u.LIZLLL(curViewHolder)) != null && (rootCellCommonAbility = (RootCellCommonAbility) C55096Ljo.LIZ(LIZLLL, RootCellCommonAbility.class, null)) != null) {
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 3;
                    if (i != 3) {
                        i2 = 0;
                    }
                }
            }
            rootCellCommonAbility.Ux(i2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        IViewPagerComponentAbility viewPagerComponentAbility;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LJLJJL.getValue();
        if (iFeedPanelPlatformAbility != null && (viewPagerComponentAbility = iFeedPanelPlatformAbility.getViewPagerComponentAbility()) != null) {
            viewPagerComponentAbility.De0(new C51783KTz(this));
        }
        KRA panelContext = getPanelContext();
        ComponentTraceVM LIZ = KU0.LIZ(panelContext.LJ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(WM7.SCENE_SERVICE, panelContext.LIZ);
        jSONObject.put("status", 1);
        if (LIZ != null) {
            i = LIZ.LJLIL;
        } else {
            i = 0;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("count", i);
        C09900aA.LJI("root_component_load", jSONObject, jSONObject2, null);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.KU4, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void setUserVisibleHint(boolean z) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        KUD.LIZIZ(getPanelContext(), new AqS51S0110000_8(this, z, 0), 2);
        this.LJLJL = z;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KU4) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KU4) it2.next()).setUserVisibleHint(z);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.IRootAbility
    public final void to0(AqS174S0100000_8 aqS174S0100000_8) {
        getPanelContext().LIZIZ.iv0("event_legacy_internal_video_event", new AObserverS62S0101000_8(aqS174S0100000_8, 3), false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.KR6
    public final void LJJJJI(View view, Bundle bundle) {
        JAK.LIZ.getClass();
        if (((Number) JAK.LIZIZ.getValue()).intValue() == 2) {
            Fragment fragment = getPanelContext().LJ;
            if (fragment == null) {
                fragment = C212428Vi.LIZLLL(this);
            }
            ScopePerformanceVM LIZ = KU1.LIZ(fragment);
            if (LIZ != null && (!LIZ.gv0().isEmpty())) {
                for (KU4 ku4 : LIZ.gv0()) {
                    KU5 actionHandler = ku4.getActionHandler();
                    AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(ku4, 233);
                    actionHandler.getClass();
                    CopyOnWriteArraySet<KU9> remove = actionHandler.LIZIZ().remove("simple_action_key_parent_set_buck_up");
                    if (remove != null) {
                        Iterator<KU9> it = remove.iterator();
                        while (it.hasNext()) {
                            KU9 it2 = it.next();
                            o.LJIIIIZZ(it2, "it");
                            if (((Boolean) aqS174S0100000_8.invoke(it2)).booleanValue()) {
                                it2.run();
                            }
                        }
                    }
                }
            }
        }
        super.LJJJJI(view, bundle);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.RootLifecycleBridgeComponent, X.KR6
    public final void j(Activity context, Fragment fragment) {
        BaseListFragmentPanel baseListFragmentPanel;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragment, "fragment");
        KR5 N20 = N20();
        if (N20 != null) {
            getPanelContext();
            baseListFragmentPanel = N20.LIZ();
        } else {
            baseListFragmentPanel = null;
        }
        this.LJLJJI = baseListFragmentPanel;
        super.j(context, fragment);
    }
}
