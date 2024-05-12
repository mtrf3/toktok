package com.bytedance.android.livesdk.impl.revenue.level.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.google.gson.m;
import tikcast.api.privilege.GradeInfoResponse;

/* loaded from: classes6.dex */
public interface UserLevelApi {
    @E8M("/webcast/privilege/grade_info/")
    @InterfaceC195757mF
    AbstractC73638SvC<C28467BFf<GradeInfoResponse.Data>> getUserLevelInfo(@InterfaceC64985Pev("need_config") boolean z);

    @E8M("/webcast/privilege/grade_info/")
    @InterfaceC195757mF
    AbstractC73638SvC<C28467BFf<m>> getUserLevelInfoJson(@InterfaceC64985Pev("need_config") boolean z);
}
