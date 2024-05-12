package com.ss.android.ugc.profile.platform.base.component;

import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C234069Go;
import X.C234079Gp;
import X.C234109Gs;
import X.C237259Sv;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C9BE;
import X.FMX;
import X.InterfaceC234089Gq;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.mode.ProfileModesAndFeaturesInfo;
import com.ss.android.ugc.profile.platform.base.mode.ProfileSingleModeAndFeaturesList;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BaseContainerComponent extends UIContentAssem implements InterfaceC234089Gq {
    public final Map<String, C234109Gs> LJLIL;
    public Map<String, C234109Gs> LJLILLLLZI;
    public final List<String> LJLJI;
    public final Set<String> LJLJJI;
    public final Map<String, Integer> LJLJJL;
    public int LJLJJLL;
    public final C214298b3 LJLJL;

    public abstract void A3();

    @Override // X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
    }

    public void v3() {
    }

    public BaseContainerComponent() {
        new LinkedHashMap();
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLJI = new ArrayList();
        this.LJLJJI = new LinkedHashSet();
        this.LJLJJL = new LinkedHashMap();
        this.LJLJJLL = -1;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfilePlatformViewModel.class);
        this.LJLJL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 926), C234069Go.INSTANCE, null);
    }

    public final ProfilePlatformViewModel E3() {
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && LIZLLL.isDetached()) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "container empty assemTag";
            }
            C237259Sv.LJII(str);
            return null;
        }
        return (ProfilePlatformViewModel) this.LJLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        new AqS154S0100000_4(this, 925).invoke();
        long currentTimeMillis = System.currentTimeMillis();
        A3();
        long currentTimeMillis2 = System.currentTimeMillis();
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        long j = currentTimeMillis2 - currentTimeMillis;
        Map<String, Boolean> map = C237259Sv.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(obj, bool)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "profile_component_cost_time");
            c188727au.LJIIIZ("component_tag", str);
            c188727au.LJ(j, "generate_component_tree_cost_time");
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
            map.put(str, bool);
        }
    }

    public C234109Gs C3(String componentId) {
        o.LJIIIZ(componentId, "componentId");
        if (this.LJLIL.containsKey(componentId)) {
            return (C234109Gs) ((LinkedHashMap) this.LJLIL).get(componentId);
        }
        return null;
    }

    public final boolean F3(String componentId) {
        ProfileSingleModeAndFeaturesList profileSingleModeAndFeaturesList;
        o.LJIIIZ(componentId, "componentId");
        ProfilePlatformViewModel E3 = E3();
        if (E3 == null) {
            return false;
        }
        ProfileModesAndFeaturesInfo profileModesAndFeaturesInfo = (ProfileModesAndFeaturesInfo) SettingsManager.LIZLLL().LJIIIIZZ("profile_modes_and_features_config", ProfileModesAndFeaturesInfo.class, C234079Gp.LIZ);
        if (profileModesAndFeaturesInfo == null) {
            profileModesAndFeaturesInfo = new ProfileModesAndFeaturesInfo(0, null, 3, null);
        }
        Iterator<ProfileSingleModeAndFeaturesList> it = profileModesAndFeaturesInfo.modes.iterator();
        while (true) {
            if (it.hasNext()) {
                profileSingleModeAndFeaturesList = it.next();
                if (o.LJ(profileSingleModeAndFeaturesList.name, E3.LJLIL)) {
                    break;
                }
            } else {
                profileSingleModeAndFeaturesList = null;
                break;
            }
        }
        ProfileSingleModeAndFeaturesList profileSingleModeAndFeaturesList2 = profileSingleModeAndFeaturesList;
        if (profileSingleModeAndFeaturesList2 == null) {
            Iterator<ProfileSingleModeAndFeaturesList> it2 = new ProfileModesAndFeaturesInfo(0, null, 3, null).modes.iterator();
            while (it2.hasNext()) {
                profileSingleModeAndFeaturesList2 = it2.next();
                if (o.LJ(profileSingleModeAndFeaturesList2.name, E3.LJLIL)) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        List<String> list = profileSingleModeAndFeaturesList2.support_components;
        if (list == null) {
            return false;
        }
        return list.contains(componentId);
    }

    @Override // X.InterfaceC234089Gq
    public final void updateIndexAtContainer(int i) {
        this.LJLJJLL = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H3(int i, ProfileComponents profileComponents, String componentTag) {
        AssemSupervisor LIZJ;
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(componentTag, "componentTag");
        if (profileComponents != null && (LIZJ = C212428Vi.LIZJ(this)) != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (o.LJ(next.assemTagInternal, componentTag)) {
                    String str = "";
                    if (next instanceof InterfaceC234089Gq) {
                        this.LJLJJL.put(componentTag, Integer.valueOf(i));
                        InterfaceC234089Gq interfaceC234089Gq = (InterfaceC234089Gq) next;
                        interfaceC234089Gq.updateIndexAtContainer(i);
                        long currentTimeMillis = System.currentTimeMillis();
                        interfaceC234089Gq.updateDataWhenUserUpdate(profileComponents);
                        long currentTimeMillis2 = System.currentTimeMillis();
                        String str2 = next.assemTagInternal;
                        if (str2 != null) {
                            str = str2;
                        }
                        long j = currentTimeMillis2 - currentTimeMillis;
                        Map<String, Boolean> map = C237259Sv.LIZLLL;
                        Object obj = ((LinkedHashMap) map).get(str);
                        Boolean bool = Boolean.TRUE;
                        if (!o.LJ(obj, bool)) {
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
                            c188727au.LJIIIZ("report_scene", "profile_component_cost_time");
                            c188727au.LJIIIZ("component_tag", str);
                            c188727au.LJ(j, "update_when_user_update_cost_time");
                            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
                            map.put(str, bool);
                            return;
                        }
                        return;
                    }
                    String str3 = next.assemTagInternal;
                    if (str3 != null) {
                        str = str3;
                    }
                    C188727au c188727au2 = new C188727au();
                    c188727au2.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
                    c188727au2.LJIIIZ("report_scene", "profile_component_update_not_impl_interface");
                    c188727au2.LJIIIZ("component_tag", str);
                    FMX.LJIIL("profile_performance_data_statistics", c188727au2.LIZ);
                }
            }
        }
    }

    public static void x3(BaseContainerComponent baseContainerComponent, String str, C65776Prg c65776Prg, View view, int i, int i2) {
        if ((i2 & 4) != 0) {
            view = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        baseContainerComponent.getClass();
        C234109Gs c234109Gs = new C234109Gs(str, c65776Prg, view, Integer.valueOf(i));
        baseContainerComponent.LJLIL.put(str, c234109Gs);
        if (i != -1) {
            baseContainerComponent.LJLILLLLZI.put(str, c234109Gs);
        }
    }
}
