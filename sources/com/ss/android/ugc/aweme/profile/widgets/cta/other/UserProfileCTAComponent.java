package com.ss.android.ugc.aweme.profile.widgets.cta.other;

import X.C1JD;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTABaseComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UserProfileCTAComponent extends ProfileCTABaseComponent {
    public UserProfileCTAComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTABaseComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C1JD.LJIIJ(this, new AqS154S0100000_4(this, 730));
    }
}
