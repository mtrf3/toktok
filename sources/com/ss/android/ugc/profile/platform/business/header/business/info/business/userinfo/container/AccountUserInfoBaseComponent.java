package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.AnonymousClass391;
import X.C212428Vi;
import X.C232459Aj;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class AccountUserInfoBaseComponent extends HeaderBaseContainerComponent implements IAccountUserInfoAbility {
    public AccountUserInfoBaseComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void K3() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        ViewGroup viewGroup = this.LJLJLLL;
        if (viewGroup != null && (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderAccountInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderAccountInfoAbility.LJFF(this.LJLJJLL, viewGroup, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void M3() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLJLLL = linearLayout;
        if (linearLayout.getContext() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout.setOrientation(0);
            layoutParams.gravity = 1;
            Context context = linearLayout.getContext();
            o.LJIIIIZZ(context, "context");
            C26338AVi.LJFF(layoutParams, context, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 0, AnonymousClass391.LIZJ(16), 0, true);
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
            C55096Ljo.LJIIJJI(C55230Lly.LIZJ(LIZLLL, null), this, IAccountUserInfoAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            C55096Ljo.LJIILL(C55230Lly.LIZJ(LIZLLL, null), IAccountUserInfoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility
    public final void LJFF(int i, View view, String str) {
        HeaderBaseContainerComponent.I3(this, str, i, view, null, null, 24);
    }
}
