package com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton;

import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C94R;
import X.C97Y;
import X.C9BE;
import X.TBT;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.widgets.recommend.UserProfileUserCardVM;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS94S0101000_4;

/* loaded from: classes5.dex */
public final class HeaderCTARecommendButtonComponent extends HeaderCTABaseUIComponent implements ICTARecommendButtonAbility {
    public final C214298b3 LJLIL;
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsAfterUpdateUI() {
        super.actionsAfterUpdateUI();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, ICTARecommendButtonAbility.class, null);
        }
        requestShow();
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.97Z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C98Q) obj).LJLJI);
            }
        }, C213688a4.LJ(), C94R.LJLIL, 4);
    }

    public HeaderCTARecommendButtonComponent() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(UserProfileUserCardVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 948), C97Y.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void actionsBeforeUpdateUI() {
        super.actionsBeforeUpdateUI();
        setIconDebounceOnClickListener(new AqS154S0100000_4(this, 1159));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.tW(this.index + 1, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer componentIcon() {
        return Integer.valueOf(R.raw.icon_arrow_triangle_down_fill);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility
    public final boolean isVisible() {
        return isComponentVisible();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), ICTARecommendButtonAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility
    public final void Dh0(boolean z) {
        updateComponentVisible(z);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility
    public final void c3(int i) {
        ((UserProfileUserCardVM) this.LJLIL.getValue()).c3(i);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility
    public final void xx(int i) {
        updateIconState(new AqS94S0101000_4(i, this, 14));
    }
}
