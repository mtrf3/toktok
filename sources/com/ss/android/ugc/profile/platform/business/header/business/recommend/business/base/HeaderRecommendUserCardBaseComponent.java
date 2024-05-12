package com.ss.android.ugc.profile.platform.business.header.business.recommend.business.base;

import X.C221108m2;
import X.C232459Aj;
import X.C25770A9m;
import X.C55096Ljo;
import X.C62822Ol8;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.base.IHeaderAdvancedFeatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.base.IHeaderRecommendAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class HeaderRecommendUserCardBaseComponent extends BaseUIComponent {
    public C25770A9m LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 957));

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
    public final void componentClick() {
    }

    public final C25770A9m A3() {
        C25770A9m c25770A9m = this.LJLILLLLZI;
        if (c25770A9m != null) {
            return c25770A9m;
        }
        o.LJIJI("horizontalUserCardLayout");
        throw null;
    }

    public final void v3() {
        int i;
        IHeaderRecommendAbility iHeaderRecommendAbility = (IHeaderRecommendAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderRecommendAbility.class, null);
        if (iHeaderRecommendAbility != null) {
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
            iHeaderRecommendAbility.LJFF(i, A3(), str);
        }
    }

    public final void x3() {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.X0();
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.X0();
        }
    }

    public final void C3(int i) {
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.J(i);
        }
    }

    public final void E3(float f) {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.S0(f);
        }
        IHeaderAdvancedFeatureAbility iHeaderAdvancedFeatureAbility = (IHeaderAdvancedFeatureAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAdvancedFeatureAbility.class, null);
        if (iHeaderAdvancedFeatureAbility != null) {
            iHeaderAdvancedFeatureAbility.S0(f);
        }
    }

    public final void F3(int i) {
        IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderBioAbility.class, null);
        if (iHeaderBioAbility != null) {
            iHeaderBioAbility.J(i);
        }
    }
}
