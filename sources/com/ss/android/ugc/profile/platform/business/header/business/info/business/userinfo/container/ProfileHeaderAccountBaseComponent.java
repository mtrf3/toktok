package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C212428Vi;
import X.C232459Aj;
import X.C55096Ljo;
import X.C55230Lly;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderAccountBaseComponent extends HeaderBaseContainerComponent implements IHeaderAccountInfoAbility {
    public ProfileHeaderAccountBaseComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void K3() {
        IHeaderInfoAbility iHeaderInfoAbility;
        int i;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null && (iHeaderInfoAbility = (IHeaderInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C232459Aj N3 = N3();
            if (N3 != null) {
                i = N3.LJLIL;
            } else {
                i = -1;
            }
            iHeaderInfoAbility.LJFF(i, viewGroup, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLJLLL = linearLayout;
        if (linearLayout.getContext() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setOrientation(1);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
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

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderAccountInfoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility
    public final void LJFF(int i, View view, String str) {
        HeaderBaseContainerComponent.I3(this, str, i, view, null, null, 24);
    }
}
