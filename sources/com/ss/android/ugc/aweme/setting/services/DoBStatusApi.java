package com.ss.android.ugc.aweme.setting.services;

import X.AbstractC73672Svk;
import X.C25575A1z;
import X.E4Q;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;

/* loaded from: classes5.dex */
public interface DoBStatusApi {
    public static final C25575A1z LIZ = C25575A1z.LIZ;

    @E4Q("/tiktok/v1/edibility/birthdate/")
    AbstractC73672Svk<DoBStatus> getDoBStatus();
}
