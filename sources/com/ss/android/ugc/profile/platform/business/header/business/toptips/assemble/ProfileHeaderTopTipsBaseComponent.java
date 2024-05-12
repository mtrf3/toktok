package com.ss.android.ugc.profile.platform.business.header.business.toptips.assemble;

import X.C212428Vi;
import X.C232459Aj;
import X.C55096Ljo;
import X.C55230Lly;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.base.IHeaderTopTipsAbility;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderTopTipsBaseComponent extends HeaderBaseContainerComponent implements IHeaderTopTipsAbility {
    public ProfileHeaderTopTipsBaseComponent() {
        new LinkedHashMap();
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
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            frameLayout.setLayoutParams(layoutParams);
            this.LJLJLLL = frameLayout;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IHeaderTopTipsAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IHeaderTopTipsAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.toptips.base.IHeaderTopTipsAbility
    public final void LJFF(int i, View view, String str) {
        HeaderBaseContainerComponent.I3(this, str, i, view, null, null, 24);
    }
}
