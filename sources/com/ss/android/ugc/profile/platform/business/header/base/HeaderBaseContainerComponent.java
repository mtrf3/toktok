package com.ss.android.ugc.profile.platform.business.header.base;

import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C232459Aj;
import X.C234109Gs;
import X.C234119Gt;
import X.C237259Sv;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8VV;
import X.C8W0;
import X.FMX;
import X.InterfaceC65350Pko;
import X.ORZ;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.HeaderAdvancedFeatureBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class HeaderBaseContainerComponent extends BaseContainerComponent {
    public final String LJLJLJ;
    public ViewGroup LJLJLLL;
    public final C62822Ol8 LJLL;
    public int LJLLI;

    public abstract void M3();

    public void O3(String componentName) {
        o.LJIIIZ(componentName, "componentName");
    }

    public HeaderBaseContainerComponent() {
        new LinkedHashMap();
        this.LJLJLJ = "divider";
        this.LJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 929));
    }

    public void K3() {
        IHeaderBaseAbility iHeaderBaseAbility;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null && (iHeaderBaseAbility = (IHeaderBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBaseAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderBaseAbility.LJFF(this.LJLJJLL, viewGroup, str);
        }
    }

    public final C232459Aj N3() {
        return (C232459Aj) this.LJLL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        int i;
        super.onCreate();
        C232459Aj N3 = N3();
        if (N3 != null) {
            i = N3.LJLIL;
        } else {
            i = -1;
        }
        this.LJLJJLL = i;
        long currentTimeMillis = System.currentTimeMillis();
        M3();
        long currentTimeMillis2 = System.currentTimeMillis();
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        long j = currentTimeMillis2 - currentTimeMillis;
        Map<String, Boolean> map = C237259Sv.LIZJ;
        Object obj = ((LinkedHashMap) map).get(str);
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(obj, bool)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("profile_attributes", C237259Sv.LJIIIIZZ);
            c188727au.LJIIIZ("report_scene", "container_generate_layout");
            c188727au.LJIIIZ("component_tag", str);
            c188727au.LJ(j, "container_generate_layout_cost_time");
            FMX.LJIIL("profile_performance_data_statistics", c188727au.LIZ);
            map.put(str, bool);
        }
        K3();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final C234109Gs C3(String componentId) {
        C65776Prg LIZ;
        o.LJIIIZ(componentId, "componentId");
        C234109Gs C3 = super.C3(componentId);
        if (C3 != null) {
            return C3;
        }
        if (o.LJ(componentId, "cta_base_item")) {
            LIZ = C65352Pkq.LIZ(HeaderCTABaseUIComponent.class);
        } else {
            if (o.LJ(componentId, "advanced_feature_base_item")) {
                LIZ = C65352Pkq.LIZ(HeaderAdvancedFeatureBaseUIComponent.class);
            }
            return null;
        }
        if (LIZ != null) {
            return new C234109Gs(componentId, LIZ, null, null);
        }
        return null;
    }

    public final void L3(List<? extends ProfileComponents> list) {
        List list2 = null;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it != null && it.hasNext()) {
                String str = ((ProfileComponents) it.next()).componentName;
                if (str == null) {
                    str = "";
                }
                if (!linkedHashSet.add(str)) {
                    it.remove();
                }
            }
        }
        C8VV.LIZJ(this, new C234119Gt(this, list2));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        L3(profileComponents.components);
    }

    public final void P3(String componentTag, InterfaceC65350Pko<? extends C8W0> clazz) {
        ViewGroup viewGroup;
        o.LJIIIZ(componentTag, "componentTag");
        o.LJIIIZ(clazz, "clazz");
        C8VV.LJII(this, clazz, componentTag);
        Integer num = (Integer) ((LinkedHashMap) this.LJLJJL).get(componentTag);
        if (num != null) {
            int intValue = num.intValue();
            ViewGroup viewGroup2 = this.LJLJLLL;
            if (viewGroup2 != null && viewGroup2.getChildAt(intValue) != null && (viewGroup = this.LJLJLLL) != null) {
                C16880lQ.LLIFFJFJJ(intValue, viewGroup);
            }
        }
        this.LJLJJI.remove(componentTag);
        this.LJLJJL.remove(componentTag);
    }

    public static void I3(HeaderBaseContainerComponent headerBaseContainerComponent, String componentName, int i, View childView, ViewGroup viewGroup, View view, int i2) {
        boolean z;
        if ((i2 & 8) != 0) {
            viewGroup = headerBaseContainerComponent.LJLJLLL;
        }
        if ((i2 & 16) != 0) {
            view = null;
        }
        headerBaseContainerComponent.getClass();
        o.LJIIIZ(componentName, "componentName");
        o.LJIIIZ(childView, "childView");
        if (viewGroup == null) {
            return;
        }
        if (headerBaseContainerComponent.LJLJLLL == null) {
            headerBaseContainerComponent.LJLJLLL = viewGroup;
        }
        if (i == -1 || viewGroup.indexOfChild(childView) == i) {
            return;
        }
        if (viewGroup.indexOfChild(childView) != -1) {
            C16880lQ.LJLLL(childView, viewGroup);
        }
        boolean z2 = false;
        if (headerBaseContainerComponent.LJLLI == 0) {
            boolean z3 = true;
            if (1 != headerBaseContainerComponent.LJLJJL.size()) {
                z3 = false;
            }
            viewGroup.addView(childView, 0);
            if (view != null && !z3) {
                view.setTag(headerBaseContainerComponent.LJLJLJ);
                viewGroup.addView(view, 1);
            }
            headerBaseContainerComponent.LJLLI++;
            return;
        }
        int childCount = viewGroup.getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt != null) {
                if (o.LJ(childAt.getTag(), headerBaseContainerComponent.LJLJLJ)) {
                    i4++;
                    i3++;
                } else if (i5 >= i + i3) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        Map<String, Integer> map = headerBaseContainerComponent.LJLJJL;
        if (!map.isEmpty()) {
            Iterator it = ((LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                if (((Number) ((Map.Entry) it.next()).getValue()).intValue() > i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (headerBaseContainerComponent.LJLLI + 1 == headerBaseContainerComponent.LJLJJL.size() && !z) {
            z2 = true;
        }
        viewGroup.addView(childView, i4);
        if (view != null && !z2) {
            view.setTag(headerBaseContainerComponent.LJLJLJ);
            viewGroup.addView(view, i4 + 1);
        }
        headerBaseContainerComponent.LJLLI++;
    }
}
