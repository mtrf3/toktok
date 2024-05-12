package com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base;

import X.AnonymousClass391;
import X.C221108m2;
import X.C232459Aj;
import X.C237429Tm;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C7MY;
import X.T5S;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.m;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.data.RelationData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class RelationInfoBaseUIComponent<T extends RelationData> extends BaseUIComponent {
    public T LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4((RelationInfoBaseUIComponent) this, 949));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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
    public final void addComponentToParent() {
        IHeaderRelationInfoAbility iHeaderRelationInfoAbility;
        View view = this.componentView;
        if (view != null && (iHeaderRelationInfoAbility = (IHeaderRelationInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderRelationInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderRelationInfoAbility.LJFF(this.index, view, str);
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
    public View generateComponentView() {
        TuxTextView tuxTextView;
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C7MY.LIZIZ(92), -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 1;
        Context context = getContext();
        TuxTextView tuxTextView2 = null;
        if (context != null) {
            tuxTextView = new TuxTextView(context, null, 6, 0);
        } else {
            tuxTextView = null;
        }
        if (tuxTextView != null) {
            tuxTextView.setGravity(17);
            tuxTextView.setMaxLines(1);
            tuxTextView.setTextColorRes(R.attr.go);
            tuxTextView.setTuxFont(33);
            tuxTextView.setLayoutParams(layoutParams2);
            tuxTextView.setId(R.id.i9q);
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = AnonymousClass391.LIZ(2.5d);
        Context context2 = getContext();
        if (context2 != null) {
            TuxTextView tuxTextView3 = new TuxTextView(context2, null, 6, 0);
            tuxTextView2 = tuxTextView3;
            tuxTextView3.setGravity(17);
            tuxTextView3.setMaxLines(1);
            tuxTextView3.setTextColorRes(R.attr.gv);
            tuxTextView3.setTuxFont(61);
            tuxTextView3.setLayoutParams(layoutParams3);
            tuxTextView3.setId(R.id.i9p);
        }
        linearLayout.addView(tuxTextView);
        linearLayout.addView(tuxTextView2);
        return linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void updateComponentUIAndData() {
        String str;
        Resources resources;
        Describe describe;
        String str2;
        View view = this.componentView;
        o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView = (TextView) view.findViewById(R.id.i9p);
        if (textView != null) {
            T t = this.LJLILLLLZI;
            if (t == null || (describe = t.getDescribe()) == null || (str = describe.getText()) == null) {
                Context context = getContext();
                if (context != null && (resources = context.getResources()) != null) {
                    str = resources.getString(R.string.ibq);
                } else {
                    str = null;
                }
            }
            textView.setText(str);
        }
        View view2 = this.componentView;
        o.LJII(view2, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView2 = (TextView) view2.findViewById(R.id.i9q);
        if (textView2 == null) {
            return;
        }
        T t2 = this.LJLILLLLZI;
        if (t2 == null || (str2 = t2.getNumber()) == null) {
            str2 = "-";
        }
        textView2.setText(str2);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        View view = this.componentView;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        T t = (T) C237429Tm.LIZ(jsonObject.toString(), RelationData.class);
        o.LJII(t, "null cannot be cast to non-null type T of com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.base.RelationInfoBaseUIComponent");
        this.LJLILLLLZI = t;
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

    public final void v3(TuxTextView tuxTextView) {
        T5S t5s = new T5S();
        t5s.LIZ(23);
        Typeface typeface = t5s.getTypeface();
        if (tuxTextView == null) {
            View view = this.componentView;
            o.LJII(view, "null cannot be cast to non-null type android.widget.LinearLayout");
            View findViewById = view.findViewById(R.id.i9q);
            o.LJIIIIZZ(findViewById, "componentView as LinearL….profile_relation_number)");
            tuxTextView = (TuxTextView) findViewById;
        }
        tuxTextView.LJJIZ(17.0f, 22, typeface, 0.02f);
    }

    public final boolean x3(boolean z) {
        UserAccountInfo userAccountInfo;
        Boolean isSecret;
        Integer followStatus;
        Integer followStatus2;
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (z || commonInfo == null) {
            return false;
        }
        UserRelationInfo userRelationInfo = commonInfo.getUserRelationInfo();
        if (userRelationInfo != null && (followStatus2 = userRelationInfo.getFollowStatus()) != null && followStatus2.intValue() == 1) {
            return false;
        }
        UserRelationInfo userRelationInfo2 = commonInfo.getUserRelationInfo();
        if ((userRelationInfo2 != null && (followStatus = userRelationInfo2.getFollowStatus()) != null && followStatus.intValue() == 2) || (userAccountInfo = commonInfo.getUserAccountInfo()) == null || (isSecret = userAccountInfo.isSecret()) == null || !isSecret.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void A3(View view, TuxTextView tuxTextView) {
        boolean z;
        UserRelationInfo userRelationInfo;
        boolean z2;
        ProfileCommonInfo commonInfo = getCommonInfo();
        if (commonInfo == null) {
            return;
        }
        UserAccountInfo userAccountInfo = commonInfo.getUserAccountInfo();
        if (userAccountInfo != null && userAccountInfo.isUserCancel()) {
            z = true;
        } else {
            z = false;
        }
        if (z || ((userRelationInfo = commonInfo.getUserRelationInfo()) != null && o.LJ(userRelationInfo.isGeoBlocked(), Boolean.TRUE))) {
            if (view != null) {
                view.setEnabled(false);
                view.setClickable(false);
            }
            tuxTextView.setTextColorRes(R.attr.gv);
            return;
        }
        UserRelationInfo userRelationInfo2 = commonInfo.getUserRelationInfo();
        if (userRelationInfo2 != null) {
            z2 = o.LJ(userRelationInfo2.isBlocking(), Boolean.TRUE);
        } else {
            z2 = false;
        }
        if (z2) {
            if (view != null) {
                view.setEnabled(true);
                view.setClickable(true);
            }
            tuxTextView.setTextColorRes(R.attr.go);
            return;
        }
        UserRelationInfo userRelationInfo3 = commonInfo.getUserRelationInfo();
        if (userRelationInfo3 != null && o.LJ(userRelationInfo3.isBlocked(), Boolean.TRUE)) {
            if (view != null) {
                view.setEnabled(false);
                view.setClickable(false);
            }
            tuxTextView.setTextColorRes(R.attr.gv);
            return;
        }
        tuxTextView.setTextColorRes(R.attr.go);
        if (view == null) {
            return;
        }
        view.setClickable(true);
    }
}
