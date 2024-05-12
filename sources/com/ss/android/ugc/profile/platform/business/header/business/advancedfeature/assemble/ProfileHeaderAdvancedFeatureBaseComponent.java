package com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble;

import X.AbstractC73672Svk;
import X.AnonymousClass391;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C232459Aj;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78926UyI;
import X.C78999UzT;
import X.C7MY;
import X.C9BE;
import X.C9H9;
import X.C9HC;
import X.C9HD;
import X.C9HE;
import X.C9HG;
import X.C9IL;
import X.FMX;
import X.InterfaceC64592gB;
import X.O6R;
import Y.ARunnableS40S0100000_4;
import Y.AfS56S0100000_4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.ProfileHeaderAdvancedFeatureViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileHeaderAdvancedFeatureBaseComponent extends HeaderBaseContainerComponent implements IHeaderAdvancedFeatureAbility {
    public final C214298b3 LJLLILLLL;
    public LinearLayout LJLLJ;
    public final Set<String> LJLLL;
    public final Map<String, Integer> LJLLLL;
    public int LJLLLLLL;
    public final Map<String, Boolean> LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;

    public ProfileHeaderAdvancedFeatureBaseComponent() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileHeaderAdvancedFeatureViewModel.class);
        this.LJLLILLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 930), C9H9.INSTANCE, null);
        this.LJLLL = new LinkedHashSet();
        this.LJLLLL = new LinkedHashMap();
        this.LJLLLLLL = -1;
        this.LJLZ = new LinkedHashMap();
        this.LJZ = C221108m2.LIZIZ(C9HC.LJLIL);
        this.LJZI = C221108m2.LIZIZ(C9HD.LJLIL);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final int A() {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W3() {
        String str;
        String str2;
        for (Map.Entry entry : ((LinkedHashMap) this.LJLLLL).entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                if (intValue < linearLayout.getChildCount()) {
                    Object obj = ((LinkedHashMap) this.LJLZ).get(entry.getKey());
                    Boolean bool = Boolean.TRUE;
                    if (o.LJ(obj, bool)) {
                        continue;
                    } else {
                        LinearLayout linearLayout2 = this.LJLLJ;
                        if (linearLayout2 != null) {
                            if (linearLayout2.getChildAt(((Number) entry.getValue()).intValue()).getLocalVisibleRect(new Rect())) {
                                C188727au c188727au = new C188727au();
                                if (o.LJ(U3(), bool)) {
                                    str = "personal_homepage";
                                } else {
                                    str = "others_homepage";
                                }
                                c188727au.LJIIIZ("enter_from", str);
                                String str3 = (String) entry.getKey();
                                switch (str3.hashCode()) {
                                    case -1806700862:
                                        if (str3.equals("advanced_feature_leads_gen")) {
                                            str2 = "get_leads";
                                            break;
                                        }
                                        break;
                                    case -1403896493:
                                        if (str3.equals("advanced_feature_showcase")) {
                                            str2 = "showcase";
                                            break;
                                        }
                                        break;
                                    case -1176474904:
                                        if (str3.equals("advanced_feature_qna_profile")) {
                                            str2 = "qa";
                                            break;
                                        }
                                        break;
                                    case -431469668:
                                        if (str3.equals("advanced_feature_shop")) {
                                            str2 = "shop";
                                            break;
                                        }
                                        break;
                                    case -352749300:
                                        if (str3.equals("advanced_feature_order_center")) {
                                            str2 = "ordercenter";
                                            break;
                                        }
                                        break;
                                    case 197604454:
                                        if (str3.equals("advanced_feature_live_events")) {
                                            str2 = "live";
                                            break;
                                        }
                                        break;
                                    case 728218696:
                                        if (str3.equals("advanced_feature_paid_collections")) {
                                            str2 = "collections";
                                            break;
                                        }
                                        break;
                                    case 810237610:
                                        if (str3.equals("advanced_feature_live_subscription")) {
                                            str2 = "subscription";
                                            break;
                                        }
                                        break;
                                    case 1672444642:
                                        if (str3.equals("advanced_feature_social_entrance")) {
                                            str2 = "social";
                                            break;
                                        }
                                        break;
                                    case 1841398311:
                                        if (str3.equals("advanced_feature_tipping")) {
                                            str2 = "tipping";
                                            break;
                                        }
                                        break;
                                    case 1932635609:
                                        if (str3.equals("advanced_feature_supporting")) {
                                            str2 = "supporting";
                                            break;
                                        }
                                        break;
                                }
                                str2 = "";
                                c188727au.LJIIIZ("target", str2);
                                c188727au.LIZLLL(((Number) entry.getValue()).intValue() + 1, "index");
                                FMX.LJIIL("profile_creator_tools_show", c188727au.LIZ);
                                this.LJLZ.put(entry.getKey(), bool);
                                String componentName = (String) entry.getKey();
                                if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                                    AssemViewModel value = this.LJLLILLLL.getValue();
                                    o.LJIIIZ(componentName, "componentName");
                                    value.setState(new AqS29S1000000_4(componentName, 4));
                                }
                            }
                        } else {
                            o.LJIJI("linearLayout");
                            throw null;
                        }
                    }
                }
            } else {
                o.LJIJI("linearLayout");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void X0() {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        ((LinkedHashMap) this.LJLZ).clear();
        super.onPause();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void A3() {
        List<? extends ProfileComponents> list;
        ProfileComponents profileComponents;
        C232459Aj N3 = N3();
        if (N3 != null && (profileComponents = N3.LJLILLLLZI) != null) {
            list = profileComponents.components;
        } else {
            list = null;
        }
        L3(list);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        Context context = getContext();
        if (context != null) {
            C9HG c9hg = new C9HG(context, null, 6);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = C7MY.LIZIZ(-8);
            c9hg.setLayoutParams(layoutParams);
            c9hg.setScrollBarStyle(0);
            this.LJLJLLL = c9hg;
        }
    }

    public final Boolean U3() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility == null) {
            return null;
        }
        return Boolean.valueOf(profileBaseAbility.L7());
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        if (getContext() == null || C76800UCe.LIZ == null) {
            return;
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderAdvancedFeatureAbility.class, null);
        }
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(17);
            linearLayout.setOrientation(0);
            C26338AVi.LJIIIZ(linearLayout, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 0, AnonymousClass391.LIZJ(16), 0, 16);
            this.LJLLJ = linearLayout;
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup != null) {
                viewGroup.addView(linearLayout);
            }
        }
        Object value = this.LJZ.getValue();
        o.LJIIIIZZ(value, "<get-behaviorSubject>(...)");
        C78999UzT.LJFF(((AbstractC73672Svk) value).LJJJJLI(200L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(this, 0), new InterfaceC64592gB() { // from class: X.9HB
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                C221018lt.LIZIZ("advanced features", message);
            }
        }), (C73318Sq2) this.LJZI.getValue());
        if (o.LJ(U3(), Boolean.TRUE)) {
            ProfilePlatformViewModel E3 = E3();
            if (E3 != null) {
                E3.rv0(new AqS170S0100000_4(this, 818));
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.post(new ARunnableS40S0100000_4(this, 83));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        ((C73318Sq2) this.LJZI.getValue()).dispose();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IHeaderAdvancedFeatureAbility.class, null);
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        W3();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final View DC(String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            return linearLayout.getChildAt(intValue);
        }
        o.LJIJI("linearLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void J(int i) {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.height = i;
                viewGroup.setLayoutParams(layoutParams2);
            }
        }
    }

    public final void R3(Map<String, Boolean> map) {
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            String key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
            if (iProfileBaseAbility != null) {
                iProfileBaseAbility.y6(o.LJ(U3(), Boolean.TRUE), C9IL.INTERACTION, key, booleanValue);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void S0(float f) {
        Float f2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 != null) {
            f2 = Float.valueOf(viewGroup2.getAlpha());
        } else {
            f2 = null;
        }
        if (o.LIZJ(f2, f) || (viewGroup = this.LJLJLLL) == null) {
            return;
        }
        viewGroup.setAlpha(f);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final boolean Wu(String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            View childAt = linearLayout.getChildAt(intValue);
            if (childAt == null) {
                return false;
            }
            return childAt.getLocalVisibleRect(new Rect());
        }
        o.LJIJI("linearLayout");
        throw null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        ProfilePlatformViewModel E3;
        User hv0;
        ViewGroup viewGroup;
        ProfileCommonInfo on0;
        UserRelationInfo userRelationInfo;
        o.LJIIIZ(profileComponents, "profileComponents");
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 instanceof C9HG) {
            o.LJII(viewGroup2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView");
            if (((C9HG) viewGroup2).getOnScrollListener() == null) {
                ViewGroup viewGroup3 = this.LJLJLLL;
                o.LJII(viewGroup3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.AdvancedFeaturesHorizontalScrollView");
                ((C9HG) viewGroup3).setOnScrollListener(new C9HE() { // from class: X.9HA
                    @Override // X.C9HE
                    public final void LIZ() {
                        Object value = ProfileHeaderAdvancedFeatureBaseComponent.this.LJZ.getValue();
                        o.LJIIIIZZ(value, "<get-behaviorSubject>(...)");
                        ((C73849Syb) value).onNext(0);
                    }
                });
            }
        }
        L3(profileComponents.components);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if (((iProfileBaseAbility == null || (on0 = iProfileBaseAbility.on0()) == null || (userRelationInfo = on0.getUserRelationInfo()) == null || !o.LJ(userRelationInfo.isBlocking(), Boolean.TRUE)) && ((E3 = E3()) == null || (hv0 = E3.hv0()) == null || !hv0.isBlock)) || (viewGroup = this.LJLJLLL) == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public static void Q3(int i, View view) {
        View findViewById;
        if (view == null || (findViewById = view.findViewById(R.id.y2)) == null) {
            return;
        }
        findViewById.setVisibility(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void Nh(String str, Map<String, Boolean> mobMap) {
        o.LJIIIZ(mobMap, "mobMap");
        W3();
        if (this.LJLLL.contains(str)) {
            return;
        }
        R3(mobMap);
        this.LJLLL.add(str);
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt != null) {
                    childAt.setVisibility(0);
                }
                int i = this.LJLLLLLL;
                if (intValue > i) {
                    if (i != -1) {
                        LinearLayout linearLayout2 = this.LJLLJ;
                        if (linearLayout2 != null) {
                            Q3(0, linearLayout2.getChildAt(i));
                        } else {
                            o.LJIJI("linearLayout");
                            throw null;
                        }
                    }
                    this.LJLLLLLL = intValue;
                    Q3(8, childAt);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void Za0(String str, boolean z) {
        View findViewById;
        int i;
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt != null && (findViewById = childAt.findViewById(R.id.y4)) != null) {
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void dv0(String str, View.OnClickListener onClickListener) {
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt == null) {
                    return;
                }
                C16880lQ.LJIIJ(onClickListener, childAt);
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void fO(String str, String str2) {
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str2);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt == null) {
                    return;
                }
                childAt.setContentDescription(str);
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void si(int i, String str) {
        Integer num;
        Integer num2 = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if ((num2 == null || num2.intValue() != i) && (num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str)) != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt == null) {
                    return;
                }
                LinearLayout linearLayout2 = this.LJLLJ;
                if (linearLayout2 != null) {
                    C16880lQ.LLII(linearLayout2, intValue);
                    for (Map.Entry entry : ((LinkedHashMap) this.LJLLLL).entrySet()) {
                        Object key = entry.getKey();
                        int intValue2 = ((Number) entry.getValue()).intValue();
                        if (!o.LJ(key, str) && intValue2 > intValue) {
                            this.LJLLLL.put(key, Integer.valueOf(intValue2 - 1));
                        }
                    }
                    LinearLayout linearLayout3 = this.LJLLJ;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(childAt, Math.min(i, linearLayout3.getChildCount()));
                        for (Map.Entry entry2 : ((LinkedHashMap) this.LJLLLL).entrySet()) {
                            Object key2 = entry2.getKey();
                            int intValue3 = ((Number) entry2.getValue()).intValue();
                            if (!o.LJ(key2, str) && intValue3 >= i) {
                                this.LJLLLL.put(key2, Integer.valueOf(intValue3 + 1));
                            }
                        }
                        this.LJLLLL.put(str, Integer.valueOf(i));
                        int i2 = this.LJLLLLLL;
                        if (i2 == intValue) {
                            LinearLayout linearLayout4 = this.LJLLJ;
                            if (linearLayout4 != null) {
                                Q3(8, linearLayout4.getChildAt(i2 - 1));
                                Q3(0, childAt);
                            } else {
                                o.LJIJI("linearLayout");
                                throw null;
                            }
                        }
                        int i3 = this.LJLLLLLL;
                        if (i3 == i) {
                            LinearLayout linearLayout5 = this.LJLLJ;
                            if (linearLayout5 != null) {
                                Q3(0, linearLayout5.getChildAt(i3 - 1));
                                Q3(8, childAt);
                                return;
                            } else {
                                o.LJIJI("linearLayout");
                                throw null;
                            }
                        }
                        return;
                    }
                    o.LJIJI("linearLayout");
                    throw null;
                }
                o.LJIJI("linearLayout");
                throw null;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void uM(String text, String str) {
        TextView textView;
        o.LJIIIZ(text, "text");
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt != null && (textView = (TextView) childAt.findViewById(R.id.y5)) != null) {
                    textView.setText(text);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void yl(Icon icon, String str) {
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt == null) {
                    return;
                }
                TuxIconView iconView = (TuxIconView) childAt.findViewById(R.id.y3);
                if (icon != null) {
                    o.LJIIIIZZ(iconView, "iconView");
                    Icon.setIconToImageView$default(icon, iconView, null, Integer.valueOf(R.raw.icon_shopping_bag_tick), Integer.valueOf(R.attr.eb), null, null, true, 50, null);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void zV(int i, String str) {
        TuxIconView tuxIconView;
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (childAt != null && (tuxIconView = (TuxIconView) childAt.findViewById(R.id.y3)) != null) {
                    tuxIconView.setIconRes(i);
                    return;
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void LJFF(int i, View view, String str) {
        if (str == null) {
            return;
        }
        this.LJLLLL.put(str, Integer.valueOf(i));
        for (Map.Entry entry : ((LinkedHashMap) this.LJLLLL).entrySet()) {
            Object key = entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (!o.LJ(key, str) && intValue >= i) {
                this.LJLLLL.put(key, Integer.valueOf(intValue + 1));
            }
        }
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            HeaderBaseContainerComponent.I3(this, str, i, view, linearLayout, null, 16);
        } else {
            o.LJIJI("linearLayout");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility
    public final void lW(String str, Map mobMap, boolean z) {
        ViewGroup viewGroup;
        o.LJIIIZ(mobMap, "mobMap");
        R3(mobMap);
        this.LJLLL.remove(str);
        if (this.LJLLL.isEmpty() && (viewGroup = this.LJLJLLL) != null) {
            viewGroup.setVisibility(8);
        }
        Integer num = (Integer) ((LinkedHashMap) this.LJLLLL).get(str);
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout linearLayout = this.LJLLJ;
            if (linearLayout != null) {
                View childAt = linearLayout.getChildAt(intValue);
                if (z) {
                    this.LJLLLL.remove(str);
                    LinearLayout linearLayout2 = this.LJLLJ;
                    if (linearLayout2 != null) {
                        C16880lQ.LJZI(linearLayout2, childAt);
                        for (Map.Entry entry : ((LinkedHashMap) this.LJLLLL).entrySet()) {
                            Object key = entry.getKey();
                            int intValue2 = ((Number) entry.getValue()).intValue();
                            if (!o.LJ(key, str) && intValue2 > intValue) {
                                this.LJLLLL.put(key, Integer.valueOf(intValue2 - 1));
                            }
                        }
                    } else {
                        o.LJIJI("linearLayout");
                        throw null;
                    }
                }
                if (childAt != null) {
                    childAt.setVisibility(8);
                }
                int i = this.LJLLLLLL;
                if (intValue == i) {
                    int i2 = i - 1;
                    this.LJLLLLLL = i2;
                    LinearLayout linearLayout3 = this.LJLLJ;
                    if (linearLayout3 != null) {
                        Q3(8, linearLayout3.getChildAt(i2));
                        return;
                    } else {
                        o.LJIJI("linearLayout");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("linearLayout");
            throw null;
        }
    }
}
