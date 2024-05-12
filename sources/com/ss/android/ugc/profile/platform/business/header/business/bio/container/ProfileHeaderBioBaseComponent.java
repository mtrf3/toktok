package com.ss.android.ugc.profile.platform.business.header.business.bio.container;

import X.APY;
import X.C16880lQ;
import X.C212428Vi;
import X.C232459Aj;
import X.C234059Gn;
import X.C55096Ljo;
import X.C55230Lly;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ProfileHeaderBioBaseComponent extends HeaderBaseContainerComponent implements IHeaderBioAbility {
    public ProfileHeaderBioBaseComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final int A() {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            return viewGroup.getHeight();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void X0() {
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null) {
            viewGroup.clearAnimation();
        }
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
            this.LJLJLLL = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            ViewGroup viewGroup = this.LJLJLLL;
            o.LJII(viewGroup, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) viewGroup;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderBioAbility.class, null);
        }
        ProfilePlatformViewModel E3 = E3();
        if (E3 != null) {
            AssemViewModel.selectSubscribe$default(E3, C234059Gn.LJLIL, null, null, null, new AqS170S0100000_4(new AqS170S0100000_4(this, 836), (InterfaceC88472Yns<? super APY, C76800UCe>) 1634), 14, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IHeaderBioAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void Aa0(View view) {
        ViewParent viewParent;
        ViewGroup viewGroup;
        View view2;
        if (view != null) {
            view.setVisibility(0);
        }
        Object obj = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if ((viewParent instanceof LinearLayout) && (viewGroup = (ViewGroup) viewParent) != null && viewGroup.getChildCount() != 0) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                obj = viewGroup.getParent();
            }
            if (!(obj instanceof ViewGroup) || (view2 = (View) obj) == null) {
                return;
            }
            view2.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void Kq(View view) {
        ViewParent viewParent;
        LinearLayout linearLayout;
        int i;
        if (view != null) {
            view.setVisibility(8);
        }
        Object obj = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof LinearLayout) {
            linearLayout = (LinearLayout) viewParent;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            i = linearLayout.indexOfChild(view) + 1;
            View childAt = linearLayout.getChildAt(i);
            if (childAt != null) {
                obj = childAt.getTag();
            }
        } else {
            i = 0;
        }
        if (o.LJ(obj, "divider")) {
            C16880lQ.LLII(linearLayout, i);
        }
        if (linearLayout != null) {
            C16880lQ.LJZI(linearLayout, view);
            if (linearLayout.getChildCount() == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
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

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC234089Gq
    public final void updateDataWhenUserUpdate(ProfileComponents profileComponents) {
        ProfilePlatformViewModel E3;
        User hv0;
        ProfileCommonInfo on0;
        UserRelationInfo userRelationInfo;
        o.LJIIIZ(profileComponents, "profileComponents");
        super.updateDataWhenUserUpdate(profileComponents);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IProfileBaseAbility.class, null);
        if ((iProfileBaseAbility != null && (on0 = iProfileBaseAbility.on0()) != null && (userRelationInfo = on0.getUserRelationInfo()) != null && o.LJ(userRelationInfo.isBlocking(), Boolean.TRUE)) || ((E3 = E3()) != null && (hv0 = E3.hv0()) != null && hv0.isBlock)) {
            ViewGroup viewGroup = this.LJLJLLL;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility
    public final void LJFF(int i, View view, String str) {
        o.LJIIIZ(view, "view");
        HeaderBaseContainerComponent.I3(this, str, i, view, null, null, 24);
    }
}
