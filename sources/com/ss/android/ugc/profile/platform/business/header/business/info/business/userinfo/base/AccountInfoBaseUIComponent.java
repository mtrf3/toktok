package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.C221108m2;
import X.C232459Aj;
import X.C237429Tm;
import X.C32151Nz;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C7MY;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.Icon;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AccountInfoBaseUIComponent<T extends BizBaseData> extends BaseUIComponent {
    public T LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4((AccountInfoBaseUIComponent) this, 953));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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
    public void addComponentToParent() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        int i;
        View view = this.componentView;
        if (view != null && (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAccountInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C232459Aj c232459Aj = (C232459Aj) this.LJLIL.getValue();
            if (c232459Aj != null) {
                i = c232459Aj.LJLIL;
            } else {
                i = -1;
            }
            iHeaderAccountInfoAbility.LJFF(i, view, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void componentClick() {
        ProfileComponents profileComponents;
        List<Action> list;
        String str;
        C232459Aj c232459Aj = (C232459Aj) this.LJLIL.getValue();
        if (c232459Aj != null && (profileComponents = c232459Aj.LJLILLLLZI) != null && (list = profileComponents.actions) != null) {
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
    public void updateComponentUIAndData() {
        String str;
        T t;
        Icon icon;
        Describe describe;
        if (!(this.componentView instanceof LinearLayout)) {
            return;
        }
        T t2 = this.LJLILLLLZI;
        if (t2 != null && (describe = t2.getDescribe()) != null) {
            str = describe.getText();
        } else {
            str = null;
        }
        if (str != null) {
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
            TextView textView = (TextView) view.findViewById(R.id.i6r);
            if (textView != null) {
                textView.setText(str);
            }
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
        TuxIconView tuxIconView = (TuxIconView) view2.findViewById(R.id.i6q);
        if (tuxIconView != null && (t = this.LJLILLLLZI) != null && (icon = t.getIcon()) != null) {
            Icon.setIconToImageView$default(icon, tuxIconView, null, null, null, null, null, false, 126, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View generateComponentView() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.topMargin = C7MY.LIZIZ(4);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.i6q);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.i6r);
        tuxTextView.setLayoutParams(layoutParams2);
        linearLayout.addView(tuxIconView);
        linearLayout.addView(tuxTextView);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void initBaseData() {
        boolean z;
        super.initBaseData();
        MyProfileAbility myProfileAbility = (MyProfileAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            z = myProfileAbility.isFromMain();
        } else {
            z = false;
        }
        this.LJLJI = z;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        View view = this.componentView;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        T t = (T) C237429Tm.LIZ(jsonObject.toString(), BizBaseData.class);
        o.LJII(t, "null cannot be cast to non-null type T of com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent");
        this.LJLILLLLZI = t;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
    }
}
