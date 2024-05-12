package com.ss.android.ugc.aweme.notification.service;

import X.ActivityC45651qj;
import X.C16970lZ;
import X.C53752L7s;
import X.INB;
import com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class ActivityAdapterServiceImp implements IActivityAdapterService {
    @Override // com.ss.android.ugc.aweme.notice.api.services.IActivityAdapterService
    public final void LIZ(ActivityC45651qj activityC45651qj) {
        if (((Boolean) INB.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        int[] iArr = {R.layout.tf, R.layout.tf, R.layout.tf, R.layout.tf, R.layout.tf, R.layout.t_, R.layout.t_, R.layout.t_, R.layout.t_, R.layout.sy, R.layout.sy};
        int i = 0;
        if ((C53752L7s.LIZIZ() & 4) != 4 || activityC45651qj == null || activityC45651qj.isFinishing()) {
            return;
        }
        do {
            C16970lZ.LJ(iArr[i], activityC45651qj);
            i++;
        } while (i < 11);
    }
}
