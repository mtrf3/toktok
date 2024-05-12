package com.ss.android.ugc.profile.platform.base.component;

import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C232459Aj;
import X.C237259Sv;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.C9GI;
import X.C9GJ;
import X.FMX;
import X.InterfaceC234089Gq;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseUIComponent extends UIContentAssem implements InterfaceC234089Gq {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C214298b3 bioTranslationViewModel$delegate;
    public View componentView;
    public int index;
    public final Map<String, Long> monitorCostTimeMap;
    public C232459Aj profileComponentData;
    public final C214298b3 viewModel$delegate;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void actionsAfterUpdateUI() {
    }

    public void actionsBeforeUpdateUI() {
    }

    public void addComponentToParent() {
    }

    public abstract void componentClick();

    public final boolean componentShouldShow() {
        return true;
    }

    public View generateComponentView() {
        return null;
    }

    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
    }

    public boolean shouldShowAfterDoubleCheck() {
        return true;
    }

    public void updateComponentUIAndData() {
    }

    @Override // X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
    }

    public BaseUIComponent() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.viewModel$delegate = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 927), C9GI.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(BioTranslationViewModel.class);
        this.bioTranslationViewModel$delegate = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 928), C9GJ.INSTANCE, null);
        this.index = -1;
        this.monitorCostTimeMap = new LinkedHashMap();
    }

    private final BioTranslationViewModel getBioTranslationViewModel() {
        return (BioTranslationViewModel) this.bioTranslationViewModel$delegate.getValue();
    }

    private final ProfilePlatformViewModel getViewModel() {
        return (ProfilePlatformViewModel) this.viewModel$delegate.getValue();
    }

    private final void mobForComponentCreateCostTime() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        Long l = this.monitorCostTimeMap.get("init_base_data_cost_time");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.monitorCostTimeMap.get("parse_biz_data_cost_time");
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        Long l3 = this.monitorCostTimeMap.get("generate_view_cost_time");
        if (l3 != null) {
            j3 = l3.longValue();
        } else {
            j3 = 0;
        }
        Long l4 = this.monitorCostTimeMap.get("actions_before_update_ui_cost_time");
        if (l4 != null) {
            j4 = l4.longValue();
        } else {
            j4 = 0;
        }
        Long l5 = this.monitorCostTimeMap.get("update_ui_and_data_cost_time");
        if (l5 != null) {
            j5 = l5.longValue();
        } else {
            j5 = 0;
        }
        Long l6 = this.monitorCostTimeMap.get("actions_after_update_ui_cost_time");
        if (l6 != null) {
            j6 = l6.longValue();
        } else {
            j6 = 0;
        }
        Map<String, Boolean> map = C237259Sv.LIZ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(obj, bool)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_component_cost_time");
            c188727au.LJIIIZ("component_tag", str);
            c188727au.LJ(j, "init_base_data_cost_time");
            c188727au.LJ(j2, "parse_biz_data_cost_time");
            c188727au.LJ(j3, "generate_view_cost_time");
            c188727au.LJ(j4, "actions_before_update_ui_cost_time");
            c188727au.LJ(j5, "update_ui_and_data_cost_time");
            c188727au.LJ(j6, "actions_after_update_ui_cost_time");
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
            map.put(str, bool);
        }
        this.monitorCostTimeMap.clear();
    }

    public void initBaseData() {
        int i;
        String str = this.assemTagInternal;
        C232459Aj c232459Aj = (C232459Aj) new C55749LuL(C47704Ins.LJ(this, C232459Aj.class, str), checkSupervisorPrepared()).getValue();
        this.profileComponentData = c232459Aj;
        if (c232459Aj != null) {
            i = c232459Aj.LJLIL;
        } else {
            i = -1;
        }
        this.index = i;
    }

    public void parseBizData() {
        ProfileComponents profileComponents;
        m mVar;
        C232459Aj c232459Aj = this.profileComponentData;
        if (c232459Aj != null && (profileComponents = c232459Aj.LJLILLLLZI) != null && (mVar = profileComponents.bizData) != null) {
            parseComponentBizData(mVar);
        }
    }

    public BioTranslationViewModel getBioTranslationVM() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "empty assemTag";
            }
            C237259Sv.LJII(str);
            return null;
        }
        return getBioTranslationViewModel();
    }

    public final ProfileCommonInfo getCommonInfo() {
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility == null) {
            return null;
        }
        return iProfileBaseAbility.on0();
    }

    public ProfilePlatformViewModel getProfilePlatformVM() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "empty assemTag";
            }
            C237259Sv.LJII(str);
            return null;
        }
        return getViewModel();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        if (!shouldShowAfterDoubleCheck()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        initBaseData();
        this.monitorCostTimeMap.put("init_base_data_cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = System.currentTimeMillis();
        parseBizData();
        this.monitorCostTimeMap.put("parse_biz_data_cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
        long currentTimeMillis3 = System.currentTimeMillis();
        this.componentView = generateComponentView();
        long currentTimeMillis4 = System.currentTimeMillis();
        View view = this.componentView;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 196), view);
        }
        addComponentToParent();
        this.monitorCostTimeMap.put("generate_view_cost_time", Long.valueOf(currentTimeMillis4 - currentTimeMillis3));
        long currentTimeMillis5 = System.currentTimeMillis();
        actionsBeforeUpdateUI();
        this.monitorCostTimeMap.put("actions_before_update_ui_cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis5));
        long currentTimeMillis6 = System.currentTimeMillis();
        updateComponentUIAndData();
        this.monitorCostTimeMap.put("update_ui_and_data_cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis6));
        long currentTimeMillis7 = System.currentTimeMillis();
        actionsAfterUpdateUI();
        this.monitorCostTimeMap.put("actions_after_update_ui_cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis7));
        mobForComponentCreateCostTime();
    }

    public final void updateCommonInfo(ProfileCommonInfo profileCommonInfo) {
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null) {
            iProfileBaseAbility.updateCommonInfo(profileCommonInfo);
        }
    }

    @Override // X.InterfaceC234089Gq
    public void updateIndexAtContainer(int i) {
        this.index = i;
    }
}
