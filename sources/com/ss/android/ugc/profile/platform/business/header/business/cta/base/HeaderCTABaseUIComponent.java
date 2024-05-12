package com.ss.android.ugc.profile.platform.business.header.business.cta.base;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C232459Aj;
import X.C237429Tm;
import X.C252659vp;
import X.C55096Ljo;
import X.C5H3;
import X.C76800UCe;
import X.C9HK;
import X.EnumC234309Hm;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class HeaderCTABaseUIComponent extends BaseUIComponent {
    public C232459Aj baseData;
    public BizBaseData bizBaseData;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public final C5H3 ctaComponentView$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 944));

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

    public Bundle generateRouterBundle() {
        return null;
    }

    private final View getCtaComponentView() {
        return (View) this.ctaComponentView$delegate.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsAfterUpdateUI() {
        if (o.LJ(this.assemTagInternal, "cta_base_item")) {
            requestShow();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void componentClick() {
        ProfileComponents profileComponents;
        List<Action> list;
        C232459Aj c232459Aj = this.baseData;
        if (c232459Aj != null && (profileComponents = c232459Aj.LJLILLLLZI) != null && (list = profileComponents.actions) != null) {
            initActions(list);
        }
    }

    public Integer componentIcon() {
        Icon icon;
        BizBaseData bizBaseData = this.bizBaseData;
        if (bizBaseData == null || (icon = bizBaseData.getIcon()) == null) {
            return null;
        }
        return Icon.getIconInt$default(icon, null, null, 3, null);
    }

    public String componentText() {
        Describe describe;
        String text;
        BizBaseData bizBaseData = this.bizBaseData;
        if (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (text = describe.getText()) == null) {
            return "";
        }
        return text;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        updateIcon(this.assemTagInternal, componentIcon());
        updateText(this.assemTagInternal, componentText());
        updateClickFunc(this.assemTagInternal, new AqS154S0100000_4(this, 945));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void addComponentToParent() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.tW(this.index, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View generateComponentView() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility == null) {
            return null;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        return iHeaderCTAAbility.Tj0(str);
    }

    public final C9HK getComponentCurStyle() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility == null) {
            return null;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        return iHeaderCTAAbility.Cp0(str);
    }

    public final boolean isComponentVisible() {
        View ctaComponentView = getCtaComponentView();
        if (ctaComponentView == null || ctaComponentView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        requestHide();
    }

    public final void requestHide() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.gh0(str);
        }
    }

    public final void requestHideAlertBadge() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.WF(str);
        }
    }

    public final void requestShow() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.C80(str);
        }
    }

    public EnumC234309Hm componentStyle() {
        return EnumC234309Hm.SHEET;
    }

    public void initActions(List<Action> actions) {
        String url;
        ActivityC45651qj LIZ;
        o.LJIIIZ(actions, "actions");
        for (Action action : actions) {
            if (o.LJ(action.getType(), "router")) {
                Action.RouterInfo router = action.getRouter();
                SmartRoute smartRoute = null;
                if (router != null && (url = router.getUrl()) != null && (LIZ = C212428Vi.LIZ(this)) != null) {
                    smartRoute = SmartRouter.buildRoute(LIZ, url);
                }
                Bundle generateRouterBundle = generateRouterBundle();
                if (generateRouterBundle != null) {
                    if (smartRoute != null) {
                        smartRoute.withParam(generateRouterBundle);
                        smartRoute.open();
                    }
                } else if (smartRoute != null) {
                    smartRoute.open();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.bizBaseData = (BizBaseData) C237429Tm.LIZ(jsonObject.toString(), BizBaseData.class);
    }

    public final void setIconDebounceOnClickListener(InterfaceC65784Pro<C76800UCe> clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.xd(str, clickFunc);
        }
    }

    public final void updateAccessibilityClassName(CharSequence className) {
        o.LJIIIZ(className, "className");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.vi(className, str);
        }
    }

    public final void updateActionList(List<C252659vp> actionList) {
        o.LJIIIZ(actionList, "actionList");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.TS(str, actionList);
        }
    }

    public final void updateComponentVisible(boolean z) {
        int i;
        View ctaComponentView = getCtaComponentView();
        if (ctaComponentView == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ctaComponentView.setVisibility(i);
    }

    public final void updateContentDescription(CharSequence value) {
        o.LJIIIZ(value, "value");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.vj(value, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
    }

    public final void updateIcon(Integer num) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.updateIcon(str, num);
        }
    }

    public final void updateIconState(InterfaceC88472Yns<? super TuxIconView, C76800UCe> updateIconStateFunc) {
        o.LJIIIZ(updateIconStateFunc, "updateIconStateFunc");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.o40(str, updateIconStateFunc);
        }
    }

    public final void updateRoleDescription(CharSequence roleDescription) {
        o.LJIIIZ(roleDescription, "roleDescription");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.oe(roleDescription, str);
        }
    }

    public final void requestShowAlertBadge(int i, int i2) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.Sr(i, i2, str);
        }
    }

    public final void updateClickFunc(String str, InterfaceC65784Pro<C76800UCe> clickFunc) {
        o.LJIIIZ(clickFunc, "clickFunc");
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            if (str == null && (str = this.assemTagInternal) == null) {
                str = "";
            }
            iHeaderCTAAbility.updateClickFunc(str, clickFunc);
        }
    }

    public final void updateIcon(String str, Integer num) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            if (str == null && (str = this.assemTagInternal) == null) {
                str = "";
            }
            iHeaderCTAAbility.updateIcon(str, num);
        }
    }

    public final void updateText(String str, String str2) {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            if (str == null && (str = this.assemTagInternal) == null) {
                str = "";
            }
            iHeaderCTAAbility.updateText(str, str2);
        }
    }

    public static /* synthetic */ void updateClickFunc$default(HeaderCTABaseUIComponent headerCTABaseUIComponent, String str, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            headerCTABaseUIComponent.updateClickFunc(str, interfaceC65784Pro);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateClickFunc");
    }

    public static /* synthetic */ void updateIcon$default(HeaderCTABaseUIComponent headerCTABaseUIComponent, String str, Integer num, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            headerCTABaseUIComponent.updateIcon(str, num);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateIcon");
    }

    public static /* synthetic */ void updateText$default(HeaderCTABaseUIComponent headerCTABaseUIComponent, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            headerCTABaseUIComponent.updateText(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateText");
    }
}
