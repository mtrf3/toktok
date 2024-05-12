package com.bytedance.android.livesdk.revenue.level.impl.fansclub.api;

import X.AbstractC73638SvC;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC64986Pew;
import tikcast.api.privilege.FansConfigResponse;
import tikcast.api.privilege.FansGetTaskInfoResponse;

/* loaded from: classes6.dex */
public interface FansClubApi {
    @E8M("/webcast/privilege/fans_config/")
    AbstractC73638SvC<C28467BFf<FansConfigResponse.Data>> getFansConfig();

    @E8L("/webcast/privilege/fans_get_task_info/")
    AbstractC73638SvC<C28467BFf<FansGetTaskInfoResponse.Data>> getTaskInfo(@InterfaceC64986Pew("sec_anchor_id") String str);
}
