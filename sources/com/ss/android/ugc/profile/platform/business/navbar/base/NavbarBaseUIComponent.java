package com.ss.android.ugc.profile.platform.business.navbar.base;

import X.AbstractC234519Ih;
import X.C221108m2;
import X.C234159Gx;
import X.C234529Ii;
import X.C237429Tm;
import X.C55096Ljo;
import X.C5H3;
import X.C9H0;
import X.InterfaceC234169Gy;
import X.InterfaceC55235Lm3;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class NavbarBaseUIComponent<T extends BizBaseData> extends BaseUIComponent implements InterfaceC234169Gy {
    public T bizBaseData;
    public boolean isFromMain;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 data$delegate = C221108m2.LIZIZ(new AqS154S0100000_4((NavbarBaseUIComponent) this, 960));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
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

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void addComponentToParent() {
    }

    public void afterUpdateNavbarActions() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
    }

    public final C234159Gx getData() {
        return (C234159Gx) this.data$delegate.getValue();
    }

    public AbstractC234519Ih initNavBarAction() {
        return new C234529Ii();
    }

    public String uniqueId() {
        String str = this.assemTagInternal;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void componentClick() {
        ProfileComponents profileComponents;
        List<Action> list;
        String str;
        C234159Gx data = getData();
        if (data != null && (profileComponents = data.LJLJI) != null && (list = profileComponents.actions) != null) {
            for (Action action : list) {
                if (o.LJ(action.getType(), "router")) {
                    Context context = getContext();
                    Action.RouterInfo router = action.getRouter();
                    if (router != null) {
                        str = router.getUrl();
                    } else {
                        str = null;
                    }
                    SmartRouter.buildRoute(context, str).open();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void initBaseData() {
        int i;
        C234159Gx data = getData();
        if (data != null) {
            i = data.LJLILLLLZI;
        } else {
            i = -1;
        }
        this.index = i;
    }

    public final boolean isFromMain() {
        INavBarActionAbility iNavBarActionAbility = (INavBarActionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INavBarActionAbility.class, null);
        if (iNavBarActionAbility != null) {
            return iNavBarActionAbility.isFromMain();
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        C9H0 c9h0;
        super.onCreate();
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            String value = c9h0.getValue();
            if (value == null) {
                value = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, value);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.mH(c9h0, true);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        C9H0 c9h0;
        String str;
        C9H0 c9h02;
        super.onDestroy();
        C234159Gx data = getData();
        if (data != null && (c9h0 = data.LJLIL) != null) {
            InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
            C234159Gx data2 = getData();
            if (data2 == null || (c9h02 = data2.LJLIL) == null || (str = c9h02.getValue()) == null) {
                str = "";
            }
            INavbarBaseAbility iNavbarBaseAbility = (INavbarBaseAbility) C55096Ljo.LIZ(LJIIZILJ, INavbarBaseAbility.class, str);
            if (iNavbarBaseAbility != null) {
                iNavbarBaseAbility.HV(c9h0, this.index, uniqueId());
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseBizData() {
        ProfileComponents profileComponents;
        m mVar;
        C234159Gx data = getData();
        if (data != null && (profileComponents = data.LJLJI) != null && (mVar = profileComponents.bizData) != null) {
            parseComponentBizData(mVar);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsBeforeUpdateUI() {
        initNavBarAction();
    }

    @Override // X.InterfaceC234169Gy
    public void notifyIndexUpdate(int i) {
        this.index = i;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        T t = (T) C237429Tm.LIZ(jsonObject.toString(), BizBaseData.class);
        o.LJII(t, "null cannot be cast to non-null type T of com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent");
        this.bizBaseData = t;
    }
}
