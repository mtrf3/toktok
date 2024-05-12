package com.ss.android.ugc.profile.platform.business.header.business.bio.base;

import X.C16880lQ;
import X.C221108m2;
import X.C237429Tm;
import X.C55096Ljo;
import X.C62822Ol8;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.google.gson.m;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class BioBaseUIComponent extends BaseUIComponent {
    public BizBaseData LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

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
    public void componentClick() {
    }

    public abstract void v3(View view);

    public BioBaseUIComponent() {
        C221108m2.LIZIZ(new AqS154S0100000_4(this, 935));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 936));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        v3(this.componentView);
        Integer valueOf = Integer.valueOf(this.index);
        if (valueOf.intValue() != -1 && 1 != 0) {
            valueOf.intValue();
            IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility != null) {
                iHeaderBioAbility.Aa0(this.componentView);
            }
        }
    }

    public final ProfilePlatformViewModel x3() {
        return (ProfilePlatformViewModel) this.LJLILLLLZI.getValue();
    }

    public final boolean L7() {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null) {
            return profileBaseAbility.L7();
        }
        return true;
    }

    public final String getEnterFrom() {
        if (L7()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        Integer valueOf = Integer.valueOf(this.index);
        if (valueOf.intValue() != -1 && 1 != 0) {
            valueOf.intValue();
            IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility != null) {
                iHeaderBioAbility.Kq(this.componentView);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void parseComponentBizData(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LJLIL = (BizBaseData) C237429Tm.LIZ(jsonObject.toString(), BizBaseData.class);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC234089Gq
    public void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        o.LJIIIZ(profileComponents, "profileComponents");
        m mVar = profileComponents.bizData;
        if (mVar != null) {
            parseComponentBizData(mVar);
        }
        updateComponentUIAndData();
        View view = this.componentView;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 200), view);
        }
    }
}
