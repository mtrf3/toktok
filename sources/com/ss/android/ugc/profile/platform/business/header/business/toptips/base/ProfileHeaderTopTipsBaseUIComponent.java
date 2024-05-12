package com.ss.android.ugc.profile.platform.business.header.business.toptips.base;

import X.C16880lQ;
import X.C232459Aj;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55749LuL;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public abstract class ProfileHeaderTopTipsBaseUIComponent extends BaseUIComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void componentClick() {
    }

    public ProfileHeaderTopTipsBaseUIComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        int i;
        super.onCreate();
        String str = this.assemTagInternal;
        C232459Aj c232459Aj = (C232459Aj) new C55749LuL(C47704Ins.LJ(this, C232459Aj.class, str), checkSupervisorPrepared()).getValue();
        if (c232459Aj != null) {
            i = c232459Aj.LJLIL;
        } else {
            i = -1;
        }
        this.index = i;
        View generateComponentView = generateComponentView();
        if (generateComponentView != null) {
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this, 202), generateComponentView);
            IHeaderTopTipsAbility iHeaderTopTipsAbility = (IHeaderTopTipsAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IHeaderTopTipsAbility.class, null);
            if (iHeaderTopTipsAbility != null) {
                String str2 = this.assemTagInternal;
                if (str2 == null) {
                    str2 = "";
                }
                iHeaderTopTipsAbility.LJFF(this.index, generateComponentView, str2);
            }
        }
    }
}
