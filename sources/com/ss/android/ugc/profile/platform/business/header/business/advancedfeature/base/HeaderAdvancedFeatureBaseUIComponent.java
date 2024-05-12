package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base;

import X.AVS;
import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C110614Vt;
import X.C113554cx;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C232459Aj;
import X.C237429Tm;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9AC;
import X.C9AE;
import X.C9AG;
import X.C9BE;
import X.C9ID;
import X.C9IL;
import X.FMX;
import X.J9P;
import X.O6R;
import X.TBT;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.SingleEvent;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class HeaderAdvancedFeatureBaseUIComponent extends BaseUIComponent {
    public static final /* synthetic */ int LJLJL = 0;
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public AdvancedFeatureBaseData LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void actionsAfterUpdateUI() {
        String str;
        String str2;
        IProfileBaseAbility iProfileBaseAbility;
        String str3;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        ProfileComponents profileComponents3;
        requestShow();
        C232459Aj c232459Aj = this.profileComponentData;
        if (c232459Aj != null && (profileComponents3 = c232459Aj.LJLILLLLZI) != null) {
            str = profileComponents3.componentId;
        } else {
            str = null;
        }
        if (o.LJ(str, "advanced_feature_base_item")) {
            C8YN.LJII(this, v3(), new TBT() { // from class: X.9AN
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C2304292o) obj).LJLIL;
                }
            }, null, new AqS186S0100000_4(this, 217), 6);
            C232459Aj c232459Aj2 = this.profileComponentData;
            if (c232459Aj2 != null && (profileComponents2 = c232459Aj2.LJLILLLLZI) != null) {
                str2 = profileComponents2.componentId;
            } else {
                str2 = null;
            }
            if (o.LJ(str2, "advanced_feature_base_item") && (iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null)) != null) {
                boolean A3 = A3();
                C9IL c9il = C9IL.INTERACTION;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("has_");
                C232459Aj c232459Aj3 = this.profileComponentData;
                if (c232459Aj3 == null || (profileComponents = c232459Aj3.LJLILLLLZI) == null || (str3 = profileComponents.componentName) == null) {
                    str3 = "";
                }
                LIZ.append(str3);
                iProfileBaseAbility.y6(A3, c9il, X1D.LIZIZ(LIZ), true);
            }
        }
        ProfilePlatformViewModel profilePlatformVM = getProfilePlatformVM();
        if (profilePlatformVM != null) {
            profilePlatformVM.ov0(new AqS170S0100000_4(this, 819));
        }
    }

    public final void requestShow() {
        this.LJLJJI = true;
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.Nh(str, x3());
        }
    }

    public HeaderAdvancedFeatureBaseUIComponent() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileHeaderAdvancedFeatureViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 934), C9AG.INSTANCE, null);
        checkSupervisorPrepared();
        C47704Ins.LJ(this, C9ID.class, null);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 933));
        this.LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 931));
    }

    public final boolean A3() {
        return ((Boolean) this.LJLILLLLZI.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility;
        View view = this.componentView;
        if (view != null && (iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null)) != null) {
            iHeaderAdvancedFeatureAbility.LJFF(this.index, view, this.assemTagInternal);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void componentClick() {
        String str;
        IProfileBaseAbility iProfileBaseAbility;
        String str2;
        ProfileComponents profileComponents;
        ProfileComponents profileComponents2;
        ProfileComponents profileComponents3;
        List<EventParams> list;
        SingleEvent singleEvent;
        m mVar;
        ProfileComponents profileComponents4;
        List<Action> list2;
        C232459Aj c232459Aj = this.profileComponentData;
        if (c232459Aj != null && (profileComponents4 = c232459Aj.LJLILLLLZI) != null && (list2 = profileComponents4.actions) != null) {
            initActions(list2);
        }
        C232459Aj c232459Aj2 = this.profileComponentData;
        if (c232459Aj2 != null && (profileComponents3 = c232459Aj2.LJLILLLLZI) != null && (list = profileComponents3.eventParams) != null) {
            for (EventParams eventParams : list) {
                if (eventParams != null && (singleEvent = eventParams.click) != null && (mVar = singleEvent.bizParams) != null) {
                    FMX.LJIILJJIL(singleEvent.event, new JSONObject(mVar.toString()));
                }
            }
        }
        C232459Aj c232459Aj3 = this.profileComponentData;
        if (c232459Aj3 != null && (profileComponents2 = c232459Aj3.LJLILLLLZI) != null) {
            str = profileComponents2.componentId;
        } else {
            str = null;
        }
        if (o.LJ(str, "advanced_feature_base_item") && (iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null)) != null) {
            boolean A3 = A3();
            C232459Aj c232459Aj4 = this.profileComponentData;
            if (c232459Aj4 == null || (profileComponents = c232459Aj4.LJLILLLLZI) == null || (str2 = profileComponents.componentName) == null) {
                str2 = "";
            }
            iProfileBaseAbility.Cu(str2, A3);
        }
    }

    public Integer componentIcon() {
        Icon icon;
        AdvancedFeatureBaseData advancedFeatureBaseData = this.LJLJI;
        if (advancedFeatureBaseData == null || (icon = advancedFeatureBaseData.getIcon()) == null) {
            return null;
        }
        return Icon.getIconInt$default(icon, null, null, 3, null);
    }

    public String componentText() {
        Describe describe;
        AdvancedFeatureBaseData advancedFeatureBaseData = this.LJLJI;
        if (advancedFeatureBaseData != null && (describe = advancedFeatureBaseData.getDescribe()) != null) {
            return describe.getText();
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View generateComponentView() {
        String componentText = componentText();
        Integer componentIcon = componentIcon();
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 932);
        Context context = getContext();
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        C26338AVi.LJIIIZ(linearLayout, 0, AnonymousClass391.LIZJ(8), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.y3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C7MY.LIZIZ(16), C7MY.LIZIZ(16));
        layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        tuxIconView.setLayoutParams(layoutParams2);
        tuxIconView.setTintColorRes(R.attr.eb);
        linearLayout.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.y5);
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setTextColorRes(R.attr.go);
        tuxTextView.setTuxFont(52);
        linearLayout.addView(tuxTextView);
        AVS avs = new AVS(context, null, 6);
        avs.setId(R.id.y4);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 48;
        avs.setLayoutParams(layoutParams3);
        avs.setVisibility(8);
        avs.setVariant(0);
        avs.setDotSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        linearLayout.addView(avs);
        View view = new View(context);
        view.setId(R.id.y2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(AnonymousClass391.LIZ(0.5d), C7MY.LIZIZ(12));
        layoutParams4.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        layoutParams4.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        view.setLayoutParams(layoutParams4);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dv);
        view.setBackground(c110614Vt.LIZ(context));
        linearLayout.addView(view);
        if (componentIcon != null) {
            tuxIconView.setIconRes(componentIcon.intValue());
        }
        Object obj = "";
        if (componentText == null) {
            componentText = "";
        }
        tuxTextView.setText(componentText);
        C16880lQ.LJIIZILJ(linearLayout, new ACListenerS24S0100000_4(aqS154S0100000_4, 2));
        Object obj2 = this.assemTagInternal;
        if (obj2 != null) {
            obj = obj2;
        }
        linearLayout.setTag(obj);
        C9AE.LIZ(linearLayout, C9AC.ALPHA, 0.0f);
        return linearLayout;
    }

    public final ProfileHeaderAdvancedFeatureViewModel v3() {
        return (ProfileHeaderAdvancedFeatureViewModel) this.LJLIL.getValue();
    }

    public final String getEnterFrom() {
        if (A3()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        C3(true);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        Integer componentIcon = componentIcon();
        if (componentIcon != null) {
            H3(componentIcon.intValue());
        }
        String componentText = componentText();
        if (componentText != null) {
            I3(componentText);
        }
        E3(new ACListenerS24S0100000_4(this, 197));
        if (!A3()) {
            requestShow();
        }
    }

    public Map<String, Boolean> x3() {
        return C113554cx.LJJJLIIL();
    }

    public final void C3(boolean z) {
        this.LJLJJI = false;
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.lW(str, x3(), z);
        }
    }

    public final void E3(View.OnClickListener onClickListener) {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.dv0(str, onClickListener);
        }
    }

    public final void F3(String str) {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str2 = this.assemTagInternal;
            if (str2 == null) {
                str2 = "";
            }
            iHeaderAdvancedFeatureAbility.fO(str, str2);
        }
    }

    public final void H3(int i) {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.zV(i, str);
        }
    }

    public final void I3(String text) {
        o.LJIIIZ(text, "text");
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.uM(text, str);
        }
    }

    public final void initActions(List<Action> list) {
        String url;
        ActivityC45651qj LIZ;
        SmartRoute buildRoute;
        Action.SheetInfo sheet;
        Integer sheetType;
        for (Action action : list) {
            String type = action.getType();
            if (o.LJ(type, "router")) {
                Action.RouterInfo router = action.getRouter();
                if (router != null && (url = router.getUrl()) != null && (LIZ = C212428Vi.LIZ(this)) != null && (buildRoute = SmartRouter.buildRoute(LIZ, url)) != null) {
                    buildRoute.open();
                }
            } else if (o.LJ(type, "sheet") && (sheet = action.getSheet()) != null && (sheetType = sheet.getSheetType()) != null && sheetType.intValue() == 1) {
                J9P.LIZJ(C212428Vi.LIZLLL(this), getEnterFrom(), "click_add_yours_button", null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLJI = (AdvancedFeatureBaseData) C237429Tm.LIZ(jsonObject.toString(), AdvancedFeatureBaseData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAdvancedFeatureAbility.si(this.index, str);
        }
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
            updateComponentUIAndData();
        }
    }
}
